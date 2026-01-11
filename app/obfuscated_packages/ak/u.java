package ak;

import V.a;
import V.f;
import W.T;
import W.X;
import bH.D;
import bH.I;
import bH.X;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class u extends S {
  public u() {
    super(" ", false);
  }
  
  public Iterator b() {
    while (this.g.isEmpty()) {
      String str1 = null;
      try {
        str1 = l();
      } catch (IOException iOException) {
        iOException.printStackTrace();
        throw new a("IO Error reading header rows from file.");
      } catch (a a) {
        a.printStackTrace();
        throw new a("No Valid Data found in file");
      } 
      byte b = 0;
      if (!str1.startsWith("Data Filename:")) {
        str1 = X.b(str1, r() + r(), r() + " " + r());
        StringTokenizer stringTokenizer = new StringTokenizer(str1, r());
        while (stringTokenizer.hasMoreTokens()) {
          String str2 = stringTokenizer.nextToken().trim();
          d d = new d();
          try {
            if (str2.equals("Runtime")) {
              String str3 = "s";
              d.b(str3);
              str2 = "Time";
            } 
          } catch (Exception exception) {
            D.c("Thought I could parse units, but it failed on field \"" + str2 + "\"");
          } 
          str2 = str2.trim();
          for (byte b1 = 0; b1 < 100 && i(str2); b1++)
            str2 = str2 + b1; 
          d.a(str2);
          if (d.a().contains("Latitude") || d.a().contains("Longitude"))
            d.a(7); 
          this.g.add(d);
          b++;
        } 
      } 
    } 
    this.r = r() + r();
    this.s = r() + " " + r();
    String str = null;
    try {
      str = " " + l();
      str = d(str);
      str = d(str);
      byte b = 0;
      StringTokenizer stringTokenizer = new StringTokenizer(str, r());
      while (stringTokenizer.hasMoreTokens()) {
        String str1 = stringTokenizer.nextToken().trim();
        str1 = X.b(str1, "[", "");
        str1 = X.b(str1, "]", "");
        if (b < this.g.size()) {
          if (!I.a(str1)) {
            ((d)this.g.get(b++)).b(str1);
            continue;
          } 
          a(true);
          break;
        } 
      } 
    } catch (IOException iOException) {
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } catch (f f) {
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, (Throwable)f);
    } catch (Exception exception) {
      D.a("Failed to get units from this row:\n" + str);
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, exception);
    } 
    ArrayList<T> arrayList = new ArrayList();
    Iterator<T> iterator = this.g.iterator();
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    return arrayList.iterator();
  }
  
  protected int b(String paramString) {
    String str1 = "";
    String str2 = "";
    String str3 = "";
    String str4 = "";
    String str5 = "";
    byte b = 0;
    BufferedReader bufferedReader = null;
    try {
      this.h = new File(paramString);
      FileInputStream fileInputStream = new FileInputStream(this.h);
      bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
      str1 = bufferedReader.readLine();
      if (str1 == null)
        return b - 1; 
      boolean bool = true;
      while (bool || (!b_(str1) && !str2.startsWith("\"Elapsed Time\""))) {
        if (str1 == null)
          return b - 1; 
        if (str1.contains("_Parameter_End"))
          bool = false; 
        if (!str1.startsWith("MARK")) {
          str5 = str4;
          str4 = str3;
          str3 = str2;
          str2 = str1;
          b++;
        } 
        for (str1 = bufferedReader.readLine(); str1.contains("  "); str1 = X.b(str1, "  ", " "));
      } 
      if (this.u)
        l(h(str1)); 
      int i = d(str1, r());
      int j = d(str5, r());
      int k = d(str4, r());
      if (b >= 4 && (j == i || j == i - 1))
        return b - 4; 
      if (b >= 3 && (k == i || k == i - 1))
        return b - 3; 
      if ((d(str3, r()) == i || d(str3, r()) == i - 1) && b(str3, r()))
        return b - 2; 
      return b - 1;
    } catch (FileNotFoundException fileNotFoundException) {
      throw new a("Unable to open file for reading:\n" + paramString);
    } catch (IOException iOException) {
      throw new a("Unable to read from file:\n" + paramString);
    } finally {
      if (bufferedReader != null)
        try {
          bufferedReader.close();
        } catch (IOException iOException) {
          Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, iOException);
        }  
    } 
  }
  
  protected String d(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    StringTokenizer stringTokenizer = new StringTokenizer(paramString);
    while (stringTokenizer.hasMoreTokens()) {
      stringBuilder.append(stringTokenizer.nextToken());
      if (stringTokenizer.hasMoreTokens())
        stringBuilder.append(" "); 
    } 
    return stringBuilder.toString();
  }
  
  public float[] c() {
    return super.c();
  }
  
  public long d() {
    return super.d();
  }
  
  public boolean e() {
    if (this.n == null || this.n.trim().length() < 0)
      try {
        this.n = l();
        return (this.n != null && this.n.trim().length() >= 0);
      } catch (Exception exception) {
        return false;
      }  
    return true;
  }
  
  public String i() {
    return X.s;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */