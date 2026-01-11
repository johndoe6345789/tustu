package ak;

import V.a;
import W.T;
import bH.D;
import bH.X;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

public class aC extends g {
  float[] a = null;
  
  public aC() {
    super(";", false);
  }
  
  public Iterator b() {
    while (this.g.isEmpty()) {
      String str = null;
      try {
        str = l();
      } catch (IOException iOException) {
        iOException.printStackTrace();
        throw new a("IO Error reading header rows from file.");
      } catch (a a) {
        a.printStackTrace();
        throw new a("No Valid Data found in file");
      } 
      if (str.startsWith("\"Elapsed Time\""))
        str = X.b(str, "\"", ""); 
      byte b = 0;
      for (String str1 : str.split(Pattern.quote(r()))) {
        d d1 = new d();
        str1 = str1.trim();
        if (str1.startsWith("\""))
          str1 = X.b(str1, "\"", "").trim(); 
        if (str1.isEmpty())
          str1 = "Col" + b; 
        if (str1.equalsIgnoreCase("lambda"))
          str1 = "Lambda"; 
        if (str1.contains("-"))
          str1 = X.b(str1, "-", " "); 
        if (str1.contains("  "))
          str1 = X.b(str1, "  ", " "); 
        this.t = true;
        try {
          if (str1.lastIndexOf(",") > 1) {
            int i = str1.lastIndexOf(",");
            String str3 = str1.substring(i + 1, str1.length()).trim();
            d1.b(str3);
            str1 = str1.substring(0, i).trim();
          } 
        } catch (Exception exception) {
          D.c("Thought I could parse units, but it failed on field \"" + str1 + "\"");
        } 
        if (str1.trim().equals("time")) {
          str1 = "Time";
          d1.a(3);
          d1.a("Time");
          d1.b("s");
        } 
        if (str1.contains("|")) {
          str1 = str1.substring(0, str1.indexOf('|'));
          this.t = true;
        } 
        str1 = str1.trim();
        String str2 = str1;
        for (byte b1 = 0; b1 < 100 && i(str2); b1++)
          str2 = str1 + b1; 
        str1 = str2;
        d1.a(str1);
        d d2 = a(d1);
        if (d2 != null) {
          this.g.add(d2);
          b++;
        } 
      } 
    } 
    ArrayList<T> arrayList = new ArrayList();
    Iterator<T> iterator = this.g.iterator();
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    return arrayList.iterator();
  }
  
  public float[] c() {
    float[] arrayOfFloat = super.c();
    if (this.a == null) {
      this.a = new float[arrayOfFloat.length];
      for (byte b1 = 0; b1 < this.a.length; b1++)
        this.a[b1] = Float.NaN; 
    } 
    for (byte b = 0; b < arrayOfFloat.length; b++) {
      if (!Float.isNaN(arrayOfFloat[b]))
        this.a[b] = arrayOfFloat[b]; 
    } 
    return this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/aC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */