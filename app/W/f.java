package W;

import G.R;
import G.bP;
import G.bQ;
import V.g;
import bH.D;
import bH.t;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class f implements bQ {
  File a;
  
  File b;
  
  R c;
  
  public f(R paramR, File paramFile1, File paramFile2) {
    this.c = paramR;
    this.a = paramFile2;
    this.b = paramFile1;
  }
  
  public bP a(String paramString1, String paramString2) {
    if (this.b == null)
      throw new IOException("Cache Dir not set! Cannot load Encoded Data."); 
    if (paramString2 != null) {
      File file = new File(this.b, paramString2);
      try {
        if (file.exists()) {
          String str = t.c(file);
          if (paramString2.equals(str)) {
            byte[] arrayOfByte = d.a(file);
            bP bP1 = new bP(paramString1);
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
    bP bP = this.c.C(paramString1);
    if (bP == null) {
      ab ab = new ab();
      try {
        ab.a(this.c, this.a.getAbsolutePath(), paramString1);
      } catch (g g) {
        Logger.getLogger(f.class.getName()).log(Level.SEVERE, g.getMessage(), (Throwable)g);
        throw new IOException(g.getMessage());
      } 
      bP = this.c.C(paramString1);
    } 
    if (bP != null) {
      byte[] arrayOfByte = bP.a();
      String str = t.a(arrayOfByte);
      if (!str.equalsIgnoreCase(paramString2)) {
        D.a("Data Checksum does not match the ini file, caching will not work!!!!!!!! INI MD5: " + paramString2 + ", calc md5: " + str);
        paramString2 = str;
      } 
      File file = new File(this.b, paramString2);
      d.a(file, arrayOfByte);
      return bP;
    } 
    D.b("EncodeData '" + paramString1 + "' not found in cache or ini. Returning null");
    return null;
  }
  
  public File b(String paramString1, String paramString2) {
    File file = new File(this.b, paramString2);
    if (!file.exists()) {
      bP bP = a(paramString1, paramString2);
      byte[] arrayOfByte = bP.a();
      d.a(file, arrayOfByte);
    } 
    return file;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */