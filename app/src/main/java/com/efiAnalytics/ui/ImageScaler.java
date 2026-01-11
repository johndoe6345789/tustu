package com.efiAnalytics.ui;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.image.ConvolveOp;
import java.awt.image.ImageObserver;
import java.awt.image.Kernel;
import java.awt.image.RescaleOp;

public class ImageScaler {
  public static final boolean a = Boolean.getBoolean("imgscalr.debug");
  
  public static final String b = System.getProperty("imgscalr.logPrefix", "[imgscalr] ");
  
  public static final ConvolveOp c = new ConvolveOp(new Kernel(3, 3, new float[] { 0.0F, 0.08F, 0.0F, 0.08F, 0.68F, 0.08F, 0.0F, 0.08F, 0.0F }), 1, null);
  
  public static final RescaleOp d = new RescaleOp(0.9F, 0.0F, null);
  
  public static final RescaleOp e = new RescaleOp(1.1F, 0.0F, null);
  
  public static final ColorConvertOp f = new ColorConvertOp(ColorSpace.getInstance(1003), null);
  
  protected static void a(int paramInt, String paramString, Object... paramVarArgs) {
    if (a) {
      System.out.print(b);
      for (byte b = 0; b < paramInt; b++)
        System.out.print("\t"); 
      System.out.printf(paramString, paramVarArgs);
      System.out.println();
    } 
  }
  
  protected static BufferedImage a(BufferedImage paramBufferedImage, int paramInt1, int paramInt2) {
    if (paramInt1 < 0 || paramInt2 < 0)
      throw new IllegalArgumentException("width [" + paramInt1 + "] and height [" + paramInt2 + "] must be >= 0"); 
    return new BufferedImage(paramInt1, paramInt2, (paramBufferedImage.getTransparency() == 1) ? 1 : 2);
  }
  
  public static BufferedImage a(BufferedImage paramBufferedImage, int paramInt1, int paramInt2, Object paramObject) {
    BufferedImage bufferedImage = a(paramBufferedImage, paramInt1, paramInt2);
    Graphics2D graphics2D = bufferedImage.createGraphics();
    graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, paramObject);
    graphics2D.drawImage(paramBufferedImage, 0, 0, paramInt1, paramInt2, null);
    graphics2D.dispose();
    return bufferedImage;
  }
  
  public static BufferedImage a(Image paramImage) {
    if (paramImage instanceof BufferedImage)
      return (BufferedImage)paramImage; 
    BufferedImage bufferedImage = new BufferedImage(paramImage.getWidth(null), paramImage.getHeight(null), 2);
    Graphics2D graphics2D = bufferedImage.createGraphics();
    graphics2D.drawImage(paramImage, 0, 0, (ImageObserver)null);
    graphics2D.dispose();
    return bufferedImage;
  }
  
  static {
    a(0, "Debug output ENABLED", new Object[0]);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/cN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */