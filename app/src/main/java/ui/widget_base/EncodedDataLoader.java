package W;

import G.R;
import G.IOInGPackage;
import G.GInterfaceBq;
import V.ExceptionPrintstacktrace;
import bH.D;
import bH.t;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class EncodedDataLoader implements GInterfaceBq {
  File a;
  
  File b;
  
  R c;
  
  public EncodedDataLoader(R paramR, File paramFile1, File paramFile2) {
    this.c = paramR;
    this.a = paramFile2;
    this.b = paramFile1;
  }
  
  public IOInGPackage a(String paramString1, String paramString2) {
    if (this.b == null)
      throw new IOException("Cache Dir not set! Cannot load Encoded Data."); 
    if (paramString2 != null) {
      File file = new File(this.b, paramString2);
      try {
        if (file.exists()) {
          String str = t.c(file);
          if (paramString2.equals(str)) {
            byte[] arrayOfByte = d.a(file);
            IOInGPackage bP1 = new IOInGPackage(paramString1);
            bP1.a(arrayOfByte);
            return bP1;
          } 
          D.b("Cache File found, but MD5 doesn't match, deleted: " + file.delete());
        } 
      } catch (IOException iOException) {
        D.b("Failed to load Cache File: \n\t" + file.getAbsolutePath() + "\n\tMsg: " + iOException.getMessage());
      } 
    } 
    if (this.a == null)
      throw new IOException("Ini File not set! Cannot load Encoded Data from ini."); 
    IOInGPackage IOInGPackage = this.c.C(paramString1);
    if (IOInGPackage == null) {
      ab ab = new ab();
      try {
        ab.a(this.c, this.a.getAbsolutePath(), paramString1);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(f.class.getName()).log(Level.SEVERE, ExceptionPrintstacktrace.getMessage(), (Throwable)ExceptionPrintstacktrace);
        throw new IOException(ExceptionPrintstacktrace.getMessage());
      } 
      IOInGPackage = this.c.C(paramString1);
    } 
    if (IOInGPackage != null) {
      byte[] arrayOfByte = IOInGPackage.a();
      String str = t.a(arrayOfByte);
      if (!str.equalsIgnoreCase(paramString2)) {
        D.a("Data Checksum does not match the ini file, caching will not work!!!!!!!! INI MD5: " + paramString2 + ", calc md5: " + str);
        paramString2 = str;
      } 
      File file = new File(this.b, paramString2);
      d.a(file, arrayOfByte);
      return IOInGPackage;
    } 
    D.b("EncodeData '" + paramString1 + "' not found in cache or ini. Returning null");
    return null;
  }
  
  public File b(String paramString1, String paramString2) {
    File file = new File(this.b, paramString2);
    if (!file.exists()) {
      IOInGPackage IOInGPackage = a(paramString1, paramString2);
      byte[] arrayOfByte = IOInGPackage.a();
      d.a(file, arrayOfByte);
    } 
    return file;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */