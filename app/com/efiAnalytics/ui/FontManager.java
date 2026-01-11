package com.efiAnalytics.ui;

import bH.D;
import bH.S;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FontManager {
  private static FontManager d = null;
  
  private String[] e = null;
  
  private String[] f = null;
  
  HashMap a = new HashMap<>();
  
  HashMap b = new HashMap<>();
  
  HashMap c = new HashMap<>();
  
  private File g = null;
  
  public static cq a() {
    if (d == null)
      d = new cq(); 
    return d;
  }
  
  public File a(String paramString, File paramFile) {
    long l = System.currentTimeMillis();
    if (this.c.get(paramString) != null)
      return null; 
    File file = (File)this.b.get(paramString);
    if (file == null && paramFile != null && paramFile.exists() && paramFile.isDirectory())
      file = b(paramString, paramFile); 
    if (file == null) {
      File[] arrayOfFile = b();
      for (byte b = 0; b < arrayOfFile.length && file == null; b++) {
        file = b(paramString, arrayOfFile[b]);
        if (file != null) {
          D.c("Time: " + (System.currentTimeMillis() - l) + ", Found Font: " + paramString + " in " + file.getAbsolutePath());
          return file;
        } 
      } 
    } 
    if (file == null) {
      D.c("Time (Cached): " + (System.currentTimeMillis() - l) + ", Not found Font: " + paramString);
      this.c.put(paramString, Boolean.valueOf(true));
    } 
    return file;
  }
  
  public File b(String paramString, File paramFile) {
    if (paramFile != null && paramFile.exists() && paramFile.isDirectory()) {
      File[] arrayOfFile = paramFile.listFiles(new cr(this));
      File file = null;
      for (byte b = 0; b < arrayOfFile.length; b++) {
        try {
          Font font = Font.createFont(0, new FileInputStream(arrayOfFile[b]));
          String str1 = font.getFamily();
          String str2 = font.getName();
          if (paramString.equals(str1) || paramString.equals(str2)) {
            this.b.put(paramString, arrayOfFile[b]);
            return arrayOfFile[b];
          } 
          if (file == null && str2.startsWith(paramString))
            file = arrayOfFile[b]; 
        } catch (FontFormatException fontFormatException) {
          D.a("Unable to load font, invalid font file '" + paramString + "' from file: " + arrayOfFile[b].getAbsolutePath());
        } catch (Exception exception) {
          Logger.getLogger(cq.class.getName()).log(Level.SEVERE, (String)null, exception);
        } 
      } 
      if (file != null)
        this.b.put(paramString, file); 
      return file;
    } 
    return null;
  }
  
  public Font a(String paramString, int paramInt1, int paramInt2) {
    try {
      if (paramString == null || paramString.equals(""))
        return new Font("", paramInt1, paramInt2); 
      if (this.a.containsKey(paramString))
        return ((Font)this.a.get(paramString)).deriveFont(paramInt1, paramInt2); 
      if (a(this.e, paramString)) {
        Font font = new Font(paramString, paramInt1, paramInt2);
        this.a.put(paramString, font);
        return font;
      } 
      if (this.g != null) {
        File file = (File)this.b.get(paramString);
        if (file == null)
          file = b(paramString, this.g); 
        if (file != null && file.exists())
          try {
            Font font1 = Font.createFont(0, new FileInputStream(file));
            this.a.put(paramString, font1);
            String[] arrayOfString = new String[this.f.length + 1];
            arrayOfString[0] = paramString;
            System.arraycopy(this.f, 0, arrayOfString, 1, this.f.length);
            this.f = S.a(this.f);
            return font1.deriveFont(paramInt1, paramInt2);
          } catch (Exception exception) {
            D.d("Failed to load font file for: " + paramString + ", looked in: " + file.getAbsolutePath());
            return new Font(paramString, paramInt1, paramInt2);
          }  
        if (!paramString.contains("Normal")) {
          Font font1 = a(paramString + " Normal", paramInt1, paramInt2);
          if (font1 != null) {
            this.a.put(paramString, font1);
            return font1.deriveFont(paramInt1, paramInt2);
          } 
        } 
        Font font = new Font(paramString, paramInt1, paramInt2);
        this.a.put(paramString, font);
        D.c("Font for '" + paramString + "' not found.");
        return font;
      } 
      return new Font(paramString, paramInt1, paramInt2);
    } catch (Exception exception) {
      Font font = new Font(paramString, paramInt1, paramInt2);
      if (paramString == null)
        paramString = "null"; 
      this.a.put(paramString, font);
      return font;
    } 
  }
  
  private boolean a(String[] paramArrayOfString, String paramString) {
    for (String str : paramArrayOfString) {
      if (str.equals(paramString))
        return true; 
    } 
    return false;
  }
  
  public File[] b() {
    if (fp.b()) {
      File[] arrayOfFile = new File[1];
      File file = new File("/usr/X11R6/lib/X11/fonts/TrueType");
      if (file.exists()) {
        arrayOfFile[0] = file;
        return arrayOfFile;
      } 
    } else if (fp.a()) {
      File[] arrayOfFile = new File[3];
      arrayOfFile[0] = new File("/Library/Fonts");
      arrayOfFile[1] = new File("/System/Library/Fonts");
      arrayOfFile[2] = new File("$HOME/Library/Fonts");
    } else {
      File[] arrayOfFile1 = new File[1];
      File[] arrayOfFile2 = File.listRoots();
      for (byte b = 0; b < arrayOfFile2.length; b++) {
        File file = new File(arrayOfFile2[b], "Windows/Fonts");
        if (file.exists()) {
          arrayOfFile1[0] = file;
          return arrayOfFile1;
        } 
      } 
    } 
    D.c("Unable to locate OS Font Directory(s)");
    return new File[0];
  }
  
  public String[] c() {
    if (this.f == null) {
      long l = System.currentTimeMillis();
      l = System.currentTimeMillis();
      this.e = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
      this.f = (String[])this.e.clone();
      if (this.g != null && this.g.exists()) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(this.f));
        List list = b(this.g);
        boolean bool = false;
        for (String str : list) {
          if (!arrayList.contains(str)) {
            arrayList.add(str);
            bool = true;
          } 
        } 
        if (bool) {
          this.f = arrayList.<String>toArray(new String[arrayList.size()]);
          this.f = S.a(this.f);
        } 
      } 
      D.c("Time to retreive font name list: " + (System.currentTimeMillis() - l) + " ms.");
    } 
    return this.f;
  }
  
  public void a(File paramFile) {
    this.g = paramFile;
  }
  
  public List b(File paramFile) {
    ArrayList<String> arrayList = new ArrayList();
    if (paramFile != null && paramFile.exists() && paramFile.isDirectory()) {
      File[] arrayOfFile = paramFile.listFiles(new cs(this));
      for (byte b = 0; b < arrayOfFile.length; b++) {
        try {
          Font font = Font.createFont(0, new FileInputStream(arrayOfFile[b]));
          String str1 = font.getFamily();
          String str2 = font.getName();
          arrayList.add(str2);
        } catch (FontFormatException fontFormatException) {
          D.c("Font Error on: " + arrayOfFile[b].getAbsolutePath());
          Logger.getLogger(fp.class.getName()).log(Level.SEVERE, (String)null, fontFormatException);
        } catch (IOException iOException) {
          Logger.getLogger(fp.class.getName()).log(Level.SEVERE, (String)null, iOException);
        } 
      } 
    } 
    return arrayList;
  }
  
  public void d() {
    this.c.clear();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/cq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */