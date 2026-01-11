package y;

import G.R;
import G.bU;
import V.g;
import ae.m;
import ae.o;
import bH.D;
import bH.n;
import bI.a;
import bI.i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Properties;
import r.a;

public class c implements bU {
  R a;
  
  public c(R paramR) {
    this.a = paramR;
  }
  
  public void a() {}
  
  public void a(boolean paramBoolean) {
    if (paramBoolean && this.a.c("inpshare_test1") != null && this.a.c("inpshare_test2") != null)
      try {
        int i = (int)this.a.c("inpshare_test2").j(this.a.h());
        int j = (int)this.a.c("inpshare_test1").j(this.a.h());
        d d = new d();
        d.a(i);
        d.b(j);
        d.c(this.a.i());
        m m = o.a(i);
        if (m != null)
          d.b(m.a()); 
        a.a().b(a.r, d.a());
        e e = new e(this);
        e.start();
      } catch (g g) {
        D.a((Exception)g);
      }  
  }
  
  public static void b() {
    String str1 = a.a().c(a.s, "");
    String str2 = a.a().c(a.r, "");
    if (str2 != null && !str2.equals("") && !str2.equals(str1) && n.a())
      try {
        d d = d.a(str2);
        String str3 = "https://www.efianalytics.com/register/HwLog?payload=" + a(d);
        String str4 = n.a(str3);
        a.a().b(a.s, d.a());
      } catch (IOException iOException) {
        D.a(iOException);
      }  
  }
  
  public static String a(d paramd) {
    Properties properties = new Properties();
    properties.setProperty("iId", a.a().c(a.aN, ""));
    properties.setProperty("mId", paramd.b() + "");
    properties.setProperty("s", paramd.c() + "");
    properties.setProperty("hw", paramd.d());
    properties.setProperty("sig", paramd.e());
    properties.setProperty("rk", a.a().c(a.cF, ""));
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    properties.store(byteArrayOutputStream, "");
    byte[] arrayOfByte = i.a(byteArrayOutputStream.toByteArray());
    return a.a(arrayOfByte, 16);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/y/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */