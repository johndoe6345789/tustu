package G;

import W.ManagerUsingFile;
import W.d;
import java.io.File;

class GComponentBg implements bQ {
  bP a = null;
  
  bg(bf parambf) {}
  
  public bP a(String paramString1, String paramString2) {
    if (this.a == null)
      this.a = new bP(paramString1); 
    return this.a;
  }
  
  public File b(String paramString1, String paramString2) {
    File file = new File(ManagerUsingFile.c, paramString2);
    if (!file.exists()) {
      bP bP1 = a(paramString1, paramString2);
      byte[] arrayOfByte = bP1.a();
      d.a(file, arrayOfByte);
    } 
    return file;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */