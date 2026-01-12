package com.efiAnalytics.ui;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

public class ScreenBoundsUtil {
  public static Rectangle a(int paramInt1, int paramInt2) {
    Rectangle rectangle = null;
    GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice[] arrayOfGraphicsDevice = graphicsEnvironment.getScreenDevices();
    for (GraphicsDevice graphicsDevice : arrayOfGraphicsDevice) {
      GraphicsConfiguration[] arrayOfGraphicsConfiguration = graphicsDevice.getConfigurations();
      for (GraphicsConfiguration graphicsConfiguration : arrayOfGraphicsConfiguration) {
        Rectangle rectangle1 = graphicsConfiguration.getBounds();
        if (rectangle1.contains(paramInt1, paramInt2)) rectangle = rectangle1;
      }
    }
    if (rectangle == null) {
      GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
      rectangle = graphicsDevice.getDefaultConfiguration().getBounds();
    }
    return rectangle;
  }

  public static String[] a() {
    GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice[] arrayOfGraphicsDevice = graphicsEnvironment.getScreenDevices();
    String[] arrayOfString = new String[arrayOfGraphicsDevice.length];
    for (byte b = 0; b < arrayOfGraphicsDevice.length; b++)
      arrayOfString[b] = arrayOfGraphicsDevice[b].getIDstring();
    return arrayOfString;
  }

  public static Rectangle a(int paramInt) {
    null = null;
    GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice[] arrayOfGraphicsDevice = graphicsEnvironment.getScreenDevices();
    GraphicsDevice graphicsDevice = arrayOfGraphicsDevice[paramInt];
    GraphicsConfiguration[] arrayOfGraphicsConfiguration1 = graphicsDevice.getConfigurations();
    GraphicsConfiguration[] arrayOfGraphicsConfiguration2 = arrayOfGraphicsConfiguration1;
    int i = arrayOfGraphicsConfiguration2.length;
    byte b = 0;
    if (b < i) {
      GraphicsConfiguration graphicsConfiguration = arrayOfGraphicsConfiguration2[b];
      return graphicsConfiguration.getBounds();
    }
    graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
    return graphicsDevice.getDefaultConfiguration().getBounds();
  }

  public static int b() {
    GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice[] arrayOfGraphicsDevice = graphicsEnvironment.getScreenDevices();
    return (arrayOfGraphicsDevice != null) ? arrayOfGraphicsDevice.length : 1;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/dn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
