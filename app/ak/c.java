package ak;

import V.a;
import W.T;
import bH.D;
import bH.X;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

public class c extends g {
  public c() {
    super(",", false);
  }
  
  protected int b(String paramString) {
    return 0;
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
      if (!str.startsWith(".") && !str.startsWith("Data Filename:")) {
        String[] arrayOfString = n();
        boolean bool = true;
        str = k(str);
        for (String str1 : str.split(Pattern.quote(r()))) {
          d d1 = new d();
          str1 = str1.trim();
          if (str1.startsWith("\"") || str1.endsWith("\""))
            str1 = X.b(str1, "\"", "").trim(); 
          if (str1.isEmpty())
            str1 = "Col" + b; 
          if (str1.equalsIgnoreCase("lambda"))
            str1 = "Lambda"; 
          if (str1.contains("-"))
            str1 = X.b(str1, "-", " "); 
          if (str1.contains("  "))
            str1 = X.b(str1, "  ", " "); 
          if (X.a(B, str1)) {
            d1.a(3);
            d1.a("Time");
            d1.b("s");
            str1 = "Time";
            d1.a(0.001F);
          } else if (X.a(A, str1)) {
            d1.a(3);
            d1.a("Time");
            d1.b("s");
            str1 = "Time";
          } else if (!b && this.v) {
            d1.a(3);
            d1.a("Time");
            d1.b("s");
            str1 = "Time";
          } 
          try {
            if (!str1.startsWith("AP Info:") && str1.lastIndexOf("[") > 1 && str1.lastIndexOf("]") > str1.lastIndexOf("[")) {
              int i = str1.lastIndexOf("[");
              int j = str1.indexOf("]", i);
              String str4 = str1.substring(i + 1, j).trim();
              String[] arrayOfString1 = str4.split("-");
              if (arrayOfString1.length == 2)
                try {
                  float f1 = Float.parseFloat(arrayOfString1[0]);
                  float f2 = Float.parseFloat(arrayOfString1[1]);
                  d1.c(f1);
                  d1.d(f2);
                } catch (NumberFormatException numberFormatException) {
                  D.c("Bad Range: " + str4);
                }  
              str1 = (str1.substring(0, i) + str1.substring(j + 1, str1.length())).trim();
              this.t = true;
            } 
            if (str1.lastIndexOf("(") > 1 && str1.lastIndexOf(")") > str1.lastIndexOf("(")) {
              int i = str1.lastIndexOf("(");
              int j = str1.indexOf(")", i);
              String str4 = str1.substring(i + 1, j).trim();
              d1.b(str4);
              str1 = (str1.substring(0, i) + str1.substring(j + 1, str1.length())).trim();
            } 
            String str3 = d1.b();
            if (str3 != null)
              if (str3.equals("On/Off")) {
                d1.b(4);
              } else if (str3.equals("High/Low")) {
                d1.b(6);
              } else if (str3.equals("Active/Inactive") || str3.equals("Act/Inact")) {
                d1.b(7);
              } else if (str3.equals("Yes/No")) {
                d1.b(5);
              } else if (str3.equals("True/False")) {
                d1.b(8);
              }  
          } catch (Exception exception) {
            D.c("Thought I could parse units, but it failed on field \"" + str1 + "\"");
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
          for (byte b1 = 0; b1 < 100 && i(str2); b1++) {
            if (str1.startsWith("Time")) {
              str2 = str1 + "_" + ((d)this.g.get(this.g.size() - 1)).a();
            } else {
              str2 = str1 + b1;
            } 
          } 
          str1 = str2;
          d1.a(str1);
          d d2 = a(d1);
          if (d2 != null) {
            this.g.add(d2);
            b++;
          } 
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
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */