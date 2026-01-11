package ak;

import V.a;
import V.f;
import W.T;
import W.X;
import W.ah;
import bH.D;
import bH.X;
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

public class e extends g {
  public e() {
    super(",", false);
  }
  
  public boolean a(String paramString) {
    this.w = a(paramString, 2);
    FileInputStream fileInputStream = null;
    try {
      this.h = new File(paramString);
      fileInputStream = new FileInputStream(this.h);
      this.e = new ah(new InputStreamReader(fileInputStream));
      this.n = this.e.a();
      while (!this.n.contains(",Log Records Used") && !this.n.contains(",Replay Records Used") && !this.n.startsWith("Log for BigComm Pro"))
        this.n = this.e.a(); 
      String str = "-1";
      if (this.n.contains(",Log Records Used")) {
        str = X.b(this.n, ",Log Records Used", "");
      } else if (this.n.contains(",Replay Records Used")) {
        str = X.b(this.n, ",Replay Records Used", "");
      } 
      this.m = Integer.parseInt(str);
      this.n = this.e.a();
      if (this.n.isEmpty())
        this.n = this.e.a(); 
      return true;
    } catch (FileNotFoundException fileNotFoundException) {
      throw new a("Unable to open file for reading:\n" + paramString);
    } catch (IOException iOException) {
      throw new a("Unable to read from file:\n" + paramString);
    } 
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
      if (!str1.startsWith("\"") && !str1.startsWith("#") && !str1.startsWith("Data Filename:")) {
        str1 = X.b(str1, r() + r(), r() + " " + r());
        if (str1.indexOf(r()) == -1)
          if (str1.indexOf("\t") != -1) {
            l("\t");
          } else if (str1.indexOf(",") != -1) {
            l(",");
          } else if (str1.indexOf("|") != -1) {
            l("|");
          } else if (str1.indexOf("'") != -1) {
            l("'");
          } else if (str1.indexOf(";") != -1) {
            l(";");
          }  
        StringTokenizer stringTokenizer = new StringTokenizer(str1, r());
        while (stringTokenizer.hasMoreTokens()) {
          String str2 = stringTokenizer.nextToken();
          d d = new d();
          if (str2.startsWith("\""))
            str2 = X.b(str2, "\"", ""); 
          if (str2.equals(" "))
            str2 = "Col" + b; 
          if (str2.equalsIgnoreCase("lambda"))
            str2 = "Lambda"; 
          str2 = X.b(str2, " ", "_");
          if (str2.equals("Scaled_Load") || str2.equals("Scaled_RPM") || str2.equals("Scld_Load") || str2.equals("Scld_RPM"))
            d.b(1); 
          if (str2.equals("Stage"))
            d.a(0); 
          d.a(str2.trim());
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
      str = X.b(str, r() + r(), r() + " " + r());
      str = X.b(str, r() + r(), r() + " " + r());
      byte b = 0;
      StringTokenizer stringTokenizer = new StringTokenizer(str, r());
      while (stringTokenizer.hasMoreTokens()) {
        String str1 = stringTokenizer.nextToken().trim();
        if (b < this.g.size()) {
          if (!b_(str1)) {
            ((d)this.g.get(b)).b(str1);
            if (str1.equals("On/Off")) {
              ((d)this.g.get(b)).b(4);
            } else if (str1.equals("High/Low")) {
              ((d)this.g.get(b)).b(6);
            } else if (str1.equals("Active/Inactive")) {
              ((d)this.g.get(b)).b(7);
            } else if (str1.equals("Yes/No")) {
              ((d)this.g.get(b)).b(5);
            } 
          } else {
            a(true);
            float[] arrayOfFloat = c();
            String[] arrayOfString = str.split(r());
            if (arrayOfString != null && arrayOfString.length >= this.g.size())
              for (byte b1 = 0; b1 < this.g.size(); b1++) {
                if (!arrayOfString[b1].contains("."))
                  ((d)this.g.get(b1)).a(0); 
              }  
            a(true);
            break;
          } 
          b++;
        } 
      } 
    } catch (IOException iOException) {
      Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } catch (f f) {
      Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, (Throwable)f);
    } catch (Exception exception) {
      D.a("Failed to get units from this row:\n" + str);
      Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, exception);
    } 
    ArrayList<T> arrayList = new ArrayList();
    Iterator<T> iterator = this.g.iterator();
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    return arrayList.iterator();
  }
  
  public boolean e() {
    if (this.n == null || this.n.trim().length() <= 0)
      try {
        this.n = l();
        return (this.n != null && this.n.trim().length() > 0 && !this.n.startsWith("Raw Log Data."));
      } catch (Exception exception) {
        return false;
      }  
    return (this.n != null && this.n.trim().length() > 0 && !this.n.startsWith("Raw Log Data."));
  }
  
  protected boolean b_(String paramString) {
    try {
      double d = Double.parseDouble(paramString);
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  protected String m() {
    return ",";
  }
  
  public String i() {
    return X.w;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */