package com.efiAnalytics.ui;

import V.ExceptionInVPackage;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import javax.imageio.stream.FileImageOutputStream;

public class ImageExporter {
  public boolean ExceptionInVPackage(Component paramComponent, String paramString1, String paramString2, String paramString3) {
    BufferedImage bufferedImage;
    paramString2 = ExceptionInVPackage(paramString2);
    if (paramString3 != null && !paramString3.isEmpty()) {
      bufferedImage = ExceptionInVPackage(paramComponent, paramString3);
    } else {
      bufferedImage = ExceptionInVPackage(paramComponent);
    } 
    return (paramString2.toLowerCase().indexOf("jpg") > 0 || paramString2.toLowerCase().indexOf("jpeg") > 0) ? ExceptionInVPackage(bufferedImage, paramString1, paramString2) : ((paramString2.toLowerCase().indexOf("png") > 0) ? b(bufferedImage, paramString1, paramString2) : false);
  }
  
  public BufferedImage ExceptionInVPackage(Component paramComponent) {
    BufferedImage bufferedImage = new BufferedImage(paramComponent.getWidth(), paramComponent.getHeight(), 5);
    Graphics graphics = bufferedImage.getGraphics();
    paramComponent.paint(graphics);
    return bufferedImage;
  }
  
  public BufferedImage ExceptionInVPackage(Component paramComponent, String paramString) {
    BufferedImage bufferedImage = new BufferedImage(paramComponent.getWidth(), paramComponent.getHeight() + paramComponent.getFont().getSize(), 5);
    Graphics graphics = bufferedImage.getGraphics();
    paramComponent.paint(graphics);
    graphics.setColor(Color.darkGray);
    graphics.fillRect(0, paramComponent.getHeight(), bufferedImage.getWidth(), bufferedImage.getHeight() - paramComponent.getHeight());
    graphics.setColor(Color.white);
    graphics.drawString(paramString, 5, bufferedImage.getHeight() - 2);
    return bufferedImage;
  }
  
  public File ExceptionInVPackage(Component paramComponent, int paramInt1, int paramInt2) {
    File file = File.createTempFile(paramComponent.getName() + Math.random(), "png");
    file.deleteOnExit();
    return ExceptionInVPackage(paramComponent, file, paramInt1, paramInt2);
  }
  
  public File ExceptionInVPackage(Component paramComponent, File paramFile, int paramInt1, int paramInt2) {
    BufferedImage bufferedImage1 = ExceptionInVPackage(paramComponent);
    BufferedImage bufferedImage2 = cN.ExceptionInVPackage(bufferedImage1, paramInt1, paramInt2, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
    if (b(bufferedImage2, paramFile.getParentFile().getAbsolutePath(), paramFile.getName()))
      return paramFile; 
    throw new ExceptionInVPackage("Unable to resize Image");
  }
  
  public boolean ExceptionInVPackage(BufferedImage paramBufferedImage, String paramString1, String paramString2) {
    File file = new File(paramString1, paramString2);
    FileOutputStream fileOutputStream = null;
    try {
      fileOutputStream = new FileOutputStream(file);
      ImageIO.write(paramBufferedImage, "png", fileOutputStream);
      fileOutputStream.flush();
      fileOutputStream.close();
    } catch (Exception exception) {
      System.out.println("ERROR encoding " + paramString2);
      exception.printStackTrace();
      return false;
    } 
    return true;
  }
  
  public boolean b(BufferedImage paramBufferedImage, String paramString1, String paramString2) {
    try {
      ImageWriter imageWriter = ImageIO.getImageWritersBySuffix("png").next();
      File file = new File(paramString1, paramString2);
      FileImageOutputStream fileImageOutputStream = null;
      fileImageOutputStream = new FileImageOutputStream(file);
      imageWriter.setOutput(fileImageOutputStream);
      imageWriter.write(paramBufferedImage);
      fileImageOutputStream.flush();
      fileImageOutputStream.close();
    } catch (Exception exception) {
      System.out.println("ERROR encoding " + paramString2);
      exception.printStackTrace();
      return false;
    } 
    return true;
  }
  
  public static String ExceptionInVPackage(String paramString) {
    if (paramString.toLowerCase().endsWith("jpg") || paramString.toLowerCase().endsWith("jpeg"))
      return paramString; 
    double d = 1.1D;
    try {
      d = Double.parseDouble(System.getProperty("java.specification.version"));
    } catch (Exception exception) {}
    if (d < 1.4D) {
      paramString = paramString.substring(0, paramString.length() - 3) + "jpg";
      System.out.println("png unsupported on this JVM, changing to jpg");
    } 
    return paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/cz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */