package com.efiAnalytics.ui;

import bH.D;
import bH.J;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Insets;
import java.awt.MediaTracker;
import java.awt.Toolkit;

public class ScreenScalingUtil {
  private static int a = 12;

  private static float b = -1.0F;

  private static boolean c = true;

  public static int a() {
    int i = c();
    if (J.a()) {
      int j = Toolkit.getDefaultToolkit().getScreenResolution();
      return Math.round(i * j / 96.0F);
    }
    return i;
  }

  public static float a(float paramFloat) {
    return J.a() ? (paramFloat * d() / 96.0F) : paramFloat;
  }

  public static int a(int paramInt) {
    return J.a() ? Math.round(paramInt * d() / 96.0F) : paramInt;
  }

  public static int b(int paramInt) {
    return J.a() ? Math.round(paramInt * 96.0F / d()) : paramInt;
  }

  private static float d() {
    if (b < 0.0F)
      try {
        b = Toolkit.getDefaultToolkit().getScreenResolution();
      } catch (Error error) {
        D.c("Could not get JavaFX screen resolution, using AWT");
        b = Toolkit.getDefaultToolkit().getScreenResolution();
      }
    return b;
  }

  public static Image a(Image paramImage) {
    return a(paramImage, -1);
  }

  public static Image a(Image paramImage, int paramInt) {
    if ((b() || paramInt > 0) && paramImage != null) {
      int i = a((paramInt > 0) ? paramInt : paramImage.getHeight(null));
      int j = Math.round(paramImage.getWidth(null) * i / paramImage.getHeight(null));
      try {
        if (c) {
          paramImage = paramImage.getScaledInstance(j, i, 4);
        } else {
          paramImage = paramImage.getScaledInstance(j, i, 1);
        }
      } catch (Exception exception) {
        c = false;
        D.c("Smooth Image Scaling failed, going to Default");
        paramImage = paramImage.getScaledInstance(j, i, 1);
      }
    }
    return paramImage;
  }

  public static boolean b() {
    if (J.a()) {
      int i = Toolkit.getDefaultToolkit().getScreenResolution();
      return (i != 96);
    }
    return false;
  }

  public static int c() {
    return a;
  }

  public static Insets a(Insets paramInsets) {
    if (b())
      paramInsets =
          new Insets(
              Math.round(a(paramInsets.top)),
              Math.round(a(paramInsets.left)),
              Math.round(a(paramInsets.bottom)),
              Math.round(a(paramInsets.right)));
    return paramInsets;
  }

  public static Image a(Image paramImage, Component paramComponent) {
    return a(paramImage, paramComponent, -1);
  }

  public static Image a(Image paramImage, Component paramComponent, int paramInt) {
    if (paramImage.getWidth(null) <= 0) {
      MediaTracker mediaTracker = new MediaTracker(paramComponent);
      mediaTracker.addImage(paramImage, 1);
      try {
        mediaTracker.waitForAll(300L);
      } catch (InterruptedException interruptedException) {
        interruptedException.printStackTrace();
      }
      mediaTracker.removeImage(paramImage, 1);
    }
    paramImage = a(paramImage, paramInt);
    if (paramImage.getWidth(null) <= 0) {
      MediaTracker mediaTracker = new MediaTracker(paramComponent);
      mediaTracker.addImage(paramImage, 1);
      try {
        mediaTracker.waitForAll(250L);
      } catch (InterruptedException interruptedException) {
        interruptedException.printStackTrace();
      }
      mediaTracker.removeImage(paramImage, 1);
    }
    return paramImage;
  }

  public static Dimension a(int paramInt1, int paramInt2) {
    return new Dimension(a(paramInt1), a(paramInt2));
  }

  public static Insets a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return new Insets(
        Math.round(a(paramInt1)),
        Math.round(a(paramInt2)),
        Math.round(a(paramInt3)),
        Math.round(a(paramInt4)));
  }

  public static void c(int paramInt) {
    a = paramInt;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/eJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
