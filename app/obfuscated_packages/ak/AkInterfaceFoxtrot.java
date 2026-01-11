package ak;

import V.ExceptionInVPackage;
import W.T;
import bH.D;
import bH.X;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

public class AkInterfaceFoxtrot extends S {
  boolean ExceptionInVPackage = false;
  
  public AkInterfaceFoxtrot() {
    super(" ", true);
  }
  
  public Iterator b() {
    while (this.g.isEmpty()) {
      String str = null;
      try {
        str = l();
      } catch (IOException iOException) {
        iOException.printStackTrace();
        throw new ExceptionInVPackage("IO Error reading header rows from file.");
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        ExceptionInVPackage.printStackTrace();
        throw new ExceptionInVPackage("No Valid Data found in file");
      } 
      byte b = 0;
      for (String str1 : str.split(Pattern.quote(r()))) {
        d d1 = new d();
        str1 = str1.trim();
        if (str1.isEmpty())
          str1 = "Col" + b; 
        if (str1.contains("-"))
          str1 = X.b(str1, "-", " "); 
        if (str1.contains("  "))
          str1 = X.b(str1, "  ", " "); 
        try {
          if (str1.lastIndexOf("[") > 1 && str1.lastIndexOf("]") > str1.lastIndexOf("[")) {
            int i = str1.lastIndexOf("[");
            int j = str1.indexOf("]", i);
            String str3 = str1.substring(i + 1, j).trim();
            d1.b(str3);
            str1 = (str1.substring(0, i) + str1.substring(j + 1, str1.length())).trim();
            this.t = true;
          } else if (str1.lastIndexOf("(") > 1 && str1.lastIndexOf(")") > str1.lastIndexOf("(")) {
            int i = str1.lastIndexOf("(");
            int j = str1.indexOf(")", i);
            String str3 = str1.substring(i + 1, j).trim();
            d1.b(str3);
            str1 = (str1.substring(0, i) + str1.substring(j + 1, str1.length())).trim();
          } 
        } catch (Exception exception) {
          D.c("Thought I could parse units, but it failed on field \"" + str1 + "\"");
        } 
        if (str1.startsWith("<"))
          str1 = str1.substring(1); 
        if (str1.endsWith(">"))
          str1 = str1.substring(0, str1.length() - 1); 
        if (str1.equalsIgnoreCase("Clock")) {
          d d = new d();
          d = new d();
          d.ExceptionInVPackage(3);
          d.ExceptionInVPackage("Time");
          d.b("s");
          d.ExceptionInVPackage(0.001F);
          this.g.add(d);
          this.ExceptionInVPackage = true;
        } 
        while (str1.endsWith("*"))
          str1 = str1.substring(0, str1.length() - 1); 
        if (str1.trim().equals("time"))
          str1 = "Time"; 
        if (str1.contains("|")) {
          str1 = str1.substring(0, str1.indexOf('|'));
          this.t = true;
        } 
        str1 = str1.trim();
        String str2 = str1;
        for (byte b1 = 0; b1 < 100 && i(str2); b1++)
          str2 = str1 + b1; 
        str1 = str2;
        d1.ExceptionInVPackage(str1);
        d d2 = ExceptionInVPackage(d1);
        if (d2 != null) {
          this.g.add(d2);
          b++;
        } 
      } 
    } 
    this.r = r() + r();
    this.s = r() + " " + r();
    ArrayList<T> arrayList = new ArrayList();
    Iterator<T> iterator = this.g.iterator();
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    return arrayList.iterator();
  }
  
  public float[] c() {
    float[] arrayOfFloat = super.c();
    if (this.ExceptionInVPackage) {
      float[] arrayOfFloat1 = new float[arrayOfFloat.length + 1];
      arrayOfFloat1[0] = arrayOfFloat[0];
      System.arraycopy(arrayOfFloat, 0, arrayOfFloat1, 1, arrayOfFloat.length);
      arrayOfFloat = arrayOfFloat1;
    } 
    return arrayOfFloat;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/F.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */