package ak;

import V.ExceptionInVPackage;
import bH.D;
import bH.X;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class AkInterfaceTango extends S {
  private boolean ExceptionInVPackage = false;
  
  private int b = 100;
  
  public AkInterfaceTango() {
    super(",", false);
  }
  
  public Iterator b() {
    Iterator<W.T> iterator = super.b();
    ArrayList<W.T> arrayList = new ArrayList();
    while (iterator.hasNext()) {
      W.T t = iterator.next();
      d d = (d)t;
      if (t.ExceptionInVPackage().equals("RTC"))
        d.ExceptionInVPackage("Time"); 
      String str = d.b();
      str = X.b(str, "[", "");
      str = X.b(str, "]", "");
      d.b(str);
      arrayList.add(t);
    } 
    return arrayList.iterator();
  }
  
  protected int b(String paramString) {
    return 0;
  }
  
  public float[] c() {
    String str1 = null;
    boolean bool = p();
    try {
      if (this.t && this.p >= 500 && k())
        throw new ExceptionInVPackage("This Edition is limited to loading 500 rows of data. \nPlease Register to load large log files."); 
      str1 = l();
    } catch (IOException iOException) {
      iOException.printStackTrace();
      throw new ExceptionInVPackage("IO Error reading row from file on row " + this.p + ".");
    } 
    str1 = ExceptionInVPackage(str1, bool);
    String str2 = r();
    if (this.m == -1L)
      this.m = this.h.length() / (str1.length() + 3); 
    aE aE = new aE(str1, str2);
    this.i = new float[aE.c()];
    for (byte b = 0; b < this.i.length && b < this.g.size(); b++) {
      String str = null;
      try {
        str = aE.b().trim();
      } catch (Exception exception) {
        D.c("Error Parsing record:\n" + str1);
        str = "0";
        exception.printStackTrace();
      } 
      if (((d)this.g.get(b)).f() == 0) {
        try {
          if (this.ExceptionInVPackage || this.p < this.b) {
            int i = str.indexOf("/");
            if (!this.ExceptionInVPackage && i >= 0)
              this.ExceptionInVPackage = true; 
            if (i >= 0)
              str = str.substring(0, i); 
          } 
          this.i[b] = Float.parseFloat(str);
        } catch (NumberFormatException numberFormatException) {
          this.i[b] = Float.NaN;
        } 
      } else {
        this.i[b] = Float.NaN;
      } 
      if (Float.isNaN(this.i[b]))
        if (str.isEmpty()) {
          this.i[b] = Float.NaN;
        } else if (str.indexOf(':') != -1) {
          this.i[b] = g(str);
        } else if (str.startsWith("0x") || str.startsWith("0X")) {
          try {
            this.i[b] = Integer.parseInt(str.substring(2), 16);
            this.t = true;
          } catch (Exception exception) {
            this.i[b] = Float.NaN;
          } 
        } else if (X.ExceptionInVPackage(z, str)) {
          this.i[b] = 0.0F;
          this.t = true;
          if (this.g.size() > b && ((d)this.g.get(b)).f() == 0)
            ExceptionInVPackage(this.g.get(b), str); 
        } else if (X.ExceptionInVPackage(y, str)) {
          this.i[b] = 1.0F;
          this.t = true;
          if (this.g.size() > b && ((d)this.g.get(b)).f() == 0)
            ExceptionInVPackage(this.g.get(b), str); 
        } else if (f(str)) {
          this.i[b] = Float.parseFloat(str.substring(0, 7) + str.substring(8));
        }  
    } 
    return this.i;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/T.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */