package aZ;

import W.j;
import W.n;
import bH.X;
import java.io.File;
import java.io.FileWriter;

public class d {
  private File c = null;
  
  FileWriter a = null;
  
  int b = 0;
  
  private char d = '\t';
  
  private d(String paramString) {
    this.c = new File(paramString);
    this.a = new FileWriter(this.c);
  }
  
  public static d a(n paramn, String paramString, char paramChar) {
    d d1 = new d(paramString);
    d1.a(paramChar);
    d1.b(paramn);
    return d1;
  }
  
  private void b(n paramn) {
    this.a.write("#" + paramn.g() + "\n");
    byte b;
    for (b = 0; b < paramn.size(); b++) {
      j j = (j)paramn.get(b);
      this.a.write(j.a());
      if (b < paramn.size() - 1)
        this.a.write(this.d); 
    } 
    this.a.write("\n");
    if (paramn.e()) {
      for (b = 0; b < paramn.size(); b++) {
        j j = (j)paramn.get(b);
        this.a.write(j.n());
        if (b < paramn.size() - 1)
          this.a.write(this.d); 
      } 
      this.a.write("\n");
    } 
  }
  
  public void a(n paramn) {
    a(paramn, 0, 2147483647);
  }
  
  public void a(n paramn, int paramInt1, int paramInt2) {
    if (paramn.d() > 0) {
      for (byte b = 0; b < paramn.d(); b++) {
        for (byte b1 = 0; b1 < paramn.size(); b1++) {
          j j = (j)paramn.get(b1);
          this.a.write(j.c(b) + "");
          if (b1 < paramn.size() - 1)
            this.a.write(this.d); 
        } 
        this.a.write("\n");
      } 
      this.a.write("MARK " + X.a("" + this.b++, '0', 3) + "\n");
      this.a.flush();
    } 
  }
  
  public void a() {
    this.a.flush();
    this.a.close();
  }
  
  public void a(char paramChar) {
    this.d = paramChar;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aZ/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */