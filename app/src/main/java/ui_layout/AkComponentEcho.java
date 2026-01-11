package ak;

import V.ExceptionInVPackage;
import V.VInterfaceFoxtrot;
import W.T;
import W.X;
import W.ManagerUsingReader;
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

public class AkComponentEcho extends g {
  public AkComponentEcho() {
    super(",", false);
  }
  
  public boolean ExceptionInVPackage(String paramString) {
    this.w = ExceptionInVPackage(paramString, 2);
    FileInputStream fileInputStream = null;
    try {
      this.h = new File(paramString);
      fileInputStream = new FileInputStream(this.h);
      this.e = new ManagerUsingReader(new InputStreamReader(fileInputStream));
      this.n = this.e.ExceptionInVPackage();
      while (!this.n.contains(",Log Records Used") && !this.n.contains(",Replay Records Used") && !this.n.startsWith("Log for BigComm Pro"))
        this.n = this.e.ExceptionInVPackage(); 
      String str = "-1";
      if (this.n.contains(",Log Records Used")) {
        str = X.b(this.n, ",Log Records Used", "");
      } else if (this.n.contains(",Replay Records Used")) {
        str = X.b(this.n, ",Replay Records Used", "");
      } 
      this.m = Integer.parseInt(str);
      this.n = this.e.ExceptionInVPackage();
      if (this.n.isEmpty())
        this.n = this.e.ExceptionInVPackage(); 
      return true;
    } catch (FileNotFoundException fileNotFoundException) {
      throw new ExceptionInVPackage("Unable to open file for reading:\n" + paramString);
    } catch (IOException iOException) {
      throw new ExceptionInVPackage("Unable to read from file:\n" + paramString);
    } 
  }
  
  public Iterator b() {
    while (this.g.isEmpty()) {
      String str1 = null;
      try {
        str1 = l();
      } catch (IOException iOException) {
        iOException.printStackTrace();
        throw new ExceptionInVPackage("IO Error reading header rows from file.");
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        ExceptionInVPackage.printStackTrace();
        throw new ExceptionInVPackage("No Valid Data found in file");
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
            d.ExceptionInVPackage(0); 
          d.ExceptionInVPackage(str2.trim());
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
            ExceptionInVPackage(true);
            float[] arrayOfFloat = c();
            String[] arrayOfString = str.split(r());
            if (arrayOfString != null && arrayOfString.length >= this.g.size())
              for (byte b1 = 0; b1 < this.g.size(); b1++) {
                if (!arrayOfString[b1].contains("."))
                  ((d)this.g.get(b1)).ExceptionInVPackage(0); 
              }  
            ExceptionInVPackage(true);
            break;
          } 
          b++;
        } 
      } 
    } catch (IOException iOException) {
      Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } catch (VInterfaceFoxtrot VInterfaceFoxtrot) {
      Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, (Throwable)VInterfaceFoxtrot);
    } catch (Exception exception) {
      D.ExceptionInVPackage("Failed to get units from this row:\n" + str);
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