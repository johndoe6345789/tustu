package com.efiAnalytics.apps.ts.tuningViews;

import bH.D;
import bI.IOInBiPackage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TuningViewData extends ArrayList {
  private String IOInBiPackage = "";
  
  private String b = "Tuning View";
  
  private String c = null;
  
  private File d = null;
  
  private String e = null;
  
  public String IOInBiPackage() {
    return this.IOInBiPackage;
  }
  
  public void IOInBiPackage(String paramString) {
    this.IOInBiPackage = paramString;
  }
  
  public String b() {
    return this.b;
  }
  
  public void b(String paramString) {
    this.b = paramString;
  }
  
  public String c() {
    if (this.c != null && !this.c.isEmpty())
      return this.c; 
    if (this.d != null && this.d.exists())
      try {
        this.c = IOInBiPackage.b(this.d.getAbsolutePath());
      } catch (IOException iOException) {
        D.IOInBiPackage("Failed to write TuningView Preview File.");
        Logger.getLogger(F.class.getName()).log(Level.SEVERE, (String)null, iOException);
        return this.c;
      }  
    return this.c;
  }
  
  public void c(String paramString) {
    this.c = paramString;
    if (paramString != null && !paramString.isEmpty())
      this.d = null; 
  }
  
  public void IOInBiPackage(File paramFile) {
    this.d = paramFile;
    if (paramFile != null && paramFile.exists())
      this.c = null; 
  }
  
  public File d() {
    if (this.d != null)
      return this.d; 
    if (this.c != null && !this.c.isEmpty()) {
      String str = b() + Math.random();
      this.d = File.createTempFile(str, ".png");
      this.d.deleteOnExit();
      IOInBiPackage.IOInBiPackage(this.c, this.d.getAbsolutePath());
      return this.d;
    } 
    return null;
  }
  
  public String e() {
    return this.e;
  }
  
  public void d(String paramString) {
    this.e = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/F.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */