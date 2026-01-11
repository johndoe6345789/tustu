package ak;

import V.ExceptionInVPackage;
import W.T;
import W.X;
import bH.D;
import bH.X;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class AkInterfaceAy extends S {
  int ExceptionInVPackage = 0;
  
  public AkInterfaceAy() {
    super(",", false);
    this.t = true;
  }
  
  public Iterator b() {
    while (this.g.isEmpty()) {
      String str = null;
      try {
        str = "Time" + l();
      } catch (IOException iOException) {
        iOException.printStackTrace();
        throw new ExceptionInVPackage("IO Error reading header rows from file.");
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        ExceptionInVPackage.printStackTrace();
        throw new ExceptionInVPackage("No Valid Data found in file");
      } 
      byte b = 0;
      str = X.b(str, r() + r(), r() + " " + r());
      String[] arrayOfString = null;
      try {
        l();
        l();
        String str1 = l();
        if (c(str1, ",")) {
          ExceptionInVPackage(true);
          arrayOfString = null;
        } else {
          arrayOfString = str1.split(",");
        } 
      } catch (IOException iOException) {
        iOException.printStackTrace();
      } 
      StringTokenizer stringTokenizer = new StringTokenizer(str, r());
      while (stringTokenizer.hasMoreTokens()) {
        String str1 = stringTokenizer.nextToken();
        if (str1.startsWith("\""))
          str1 = X.b(str1, "\"", "").trim(); 
        if (str1.equals(" "))
          str1 = "Col" + b; 
        if (str1.equalsIgnoreCase("lambda"))
          str1 = "Lambda"; 
        if (str1.contains("-"))
          str1 = X.b(str1, "-", " "); 
        if (str1.contains("  "))
          str1 = X.b(str1, "  ", " "); 
        d d = new d();
        if (str1.equals("Timestamp (mS)") || str1.equals("Elapsed Time")) {
          d.ExceptionInVPackage(3);
          d.ExceptionInVPackage("Time");
          d.b("s");
          str1 = "Time";
          d.ExceptionInVPackage(0.001F);
        } 
        try {
          if (str1.indexOf("[") > 1 && str1.contains("]")) {
            int i = str1.indexOf("[");
            int j = str1.indexOf("]", i);
            String str3 = str1.substring(i + 1, j).trim();
            d.b(str3);
            str1 = (str1.substring(0, i) + str1.substring(j + 1, str1.length())).trim();
            this.t = true;
          } 
          if (str1.indexOf("(") > 1 && str1.contains(")")) {
            int i = str1.indexOf("(");
            int j = str1.indexOf(")", i);
            String str3 = str1.substring(i + 1, j).trim();
            d.b(str3);
            str1 = (str1.substring(0, i) + str1.substring(j + 1, str1.length())).trim();
          } 
        } catch (Exception exception) {
          D.c("Thought I could parse units, but it failed on field \"" + str1 + "\"");
        } 
        if (str1.trim().equals("time"))
          str1 = "Time"; 
        str1 = str1.trim();
        String str2 = str1;
        for (byte b1 = 0; b1 < 100 && i(str2); b1++)
          str2 = str1 + b1; 
        str1 = str2;
        d.ExceptionInVPackage(str1);
        if (d.ExceptionInVPackage().contains("Latitude") || d.ExceptionInVPackage().contains("Longitude"))
          d.ExceptionInVPackage(7); 
        if (arrayOfString != null && arrayOfString.length > this.g.size())
          d.b(arrayOfString[this.g.size()]); 
        this.g.add(d);
        b++;
      } 
      try {
        l();
        l();
      } catch (IOException iOException) {
        iOException.printStackTrace();
      } 
    } 
    ArrayList<T> arrayList = new ArrayList();
    Iterator<T> iterator = this.g.iterator();
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    this.ExceptionInVPackage = arrayList.size();
    return arrayList.iterator();
  }
  
  public float[] c() {
    float[] arrayOfFloat = super.c();
    if (arrayOfFloat.length < this.ExceptionInVPackage) {
      float[] arrayOfFloat1 = new float[this.ExceptionInVPackage];
      System.arraycopy(arrayOfFloat, 0, arrayOfFloat1, 0, arrayOfFloat.length);
      arrayOfFloat = arrayOfFloat1;
    } 
    return arrayOfFloat;
  }
  
  protected int b(String paramString) {
    return 1;
  }
  
  protected float g(String paramString) {
    int i = 0;
    int j = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    try {
      StringTokenizer stringTokenizer = new StringTokenizer(paramString, ":");
      stringTokenizer.nextToken();
      i = Integer.parseInt(stringTokenizer.nextToken());
      j = Integer.parseInt(stringTokenizer.nextToken());
      f1 = Float.parseFloat(stringTokenizer.nextToken());
      if (stringTokenizer.hasMoreElements())
        f2 = Float.parseFloat(stringTokenizer.nextToken()) / 1000.0F; 
      this.t = true;
      return (i * 3600 + j * 60) + f1 + f2;
    } catch (Exception exception) {
      return 0.0F;
    } 
  }
  
  public String i() {
    return X.v;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/ay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */