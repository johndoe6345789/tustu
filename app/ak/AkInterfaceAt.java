package ak;

import V.ExceptionInVPackage;
import V.VInterfaceFoxtrot;
import W.T;
import W.ManagerUsingReader;
import bH.D;
import bH.I;
import bH.X;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class AkInterfaceAt extends g {
  public AkInterfaceAt() {
    super(",", false);
  }
  
  public Iterator b() {
    String str = null;
    while (this.g.isEmpty()) {
      String str1 = null;
      String str2 = null;
      try {
        str1 = l();
        str = l();
        str2 = l();
      } catch (IOException iOException) {
        iOException.printStackTrace();
        throw new ExceptionInVPackage("IO Error reading header rows from file.");
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        ExceptionInVPackage.printStackTrace();
        throw new ExceptionInVPackage("No Valid Data found in file");
      } 
      byte b1 = 0;
      String[] arrayOfString1 = str1.split(Pattern.quote(r()));
      String[] arrayOfString2 = str2.split(Pattern.quote(r()));
      for (byte b2 = 0; b2 < arrayOfString1.length; b2++) {
        String str3 = arrayOfString1[b2];
        if (arrayOfString2.length > b2 && arrayOfString2[b2] != null) {
          String str5 = X.b(arrayOfString2[b2], "\"", "");
          if (!str5.isEmpty())
            str3 = str5; 
        } 
        d d1 = new d();
        str3 = str3.trim();
        if (str3.isEmpty())
          str3 = "Col" + b1; 
        if (str3.equalsIgnoreCase("lambda"))
          str3 = "Lambda"; 
        if (str3.contains("-"))
          str3 = X.b(str3, "-", " "); 
        if (str3.contains("  "))
          str3 = X.b(str3, "  ", " "); 
        if (str3.equals("TimeStamp")) {
          d1.ExceptionInVPackage(3);
          d1.ExceptionInVPackage("Time");
          d1.b("s");
          str3 = "Time";
        } 
        if (str3.trim().equals("time"))
          str3 = "Time"; 
        this.t = true;
        str3 = str3.trim();
        String str4 = str3;
        for (byte b = 0; b < 100 && i(str4); b++)
          str4 = str3 + b; 
        str3 = str4;
        d1.ExceptionInVPackage(str3);
        d d2 = ExceptionInVPackage(d1);
        if (d2 != null) {
          this.g.add(d2);
          b1++;
        } 
      } 
    } 
    this.r = r() + r();
    this.s = r() + " " + r();
    try {
      byte b = 0;
      str = l();
      for (String str1 : str.split(Pattern.quote(r()))) {
        str1 = X.b(str1, "\"", "").trim();
        if (str1 != null && str1.equals("sec.ms"))
          str1 = "s"; 
        if (b < this.g.size()) {
          String str2 = ((d)this.g.get(b)).b();
          if (str1.isEmpty() && str2 != null && !str2.isEmpty()) {
            b++;
          } else if (!I.ExceptionInVPackage(str1) && Float.isNaN(g(str1))) {
            ((d)this.g.get(b)).b(str1);
            if (str1.equals("On/Off")) {
              ((d)this.g.get(b)).b(4);
            } else if (str1.equals("High/Low")) {
              ((d)this.g.get(b)).b(6);
            } else if (str1.equals("Active/Inactive") || str1.equals("Act/Inact")) {
              ((d)this.g.get(b)).b(7);
            } else if (str1.equals("Yes/No")) {
              ((d)this.g.get(b)).b(5);
            } 
            b++;
          } else {
            ExceptionInVPackage(true);
            c();
            ExceptionInVPackage(true);
            break;
          } 
        } 
      } 
    } catch (IOException iOException) {
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } catch (VInterfaceFoxtrot VInterfaceFoxtrot) {
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, (Throwable)VInterfaceFoxtrot);
    } catch (Exception exception) {
      D.ExceptionInVPackage("Failed to get units from this row:\n" + str);
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
    ManagerUsingReader ManagerUsingReader = null;
    try {
      this.h = new File(paramString);
      FileInputStream fileInputStream = new FileInputStream(this.h);
      ManagerUsingReader = new ManagerUsingReader(new InputStreamReader(fileInputStream));
      str1 = ManagerUsingReader.ExceptionInVPackage();
      if (str1 == null)
        return b - 1; 
      while (b == 0 || (str2 != null && !str2.startsWith("TimeStamp"))) {
        str5 = str4;
        str4 = str3;
        str3 = str2;
        str2 = str1;
        b++;
        str1 = ManagerUsingReader.ExceptionInVPackage();
      } 
      if (this.u)
        l(h(str1)); 
      int i = d(str1, r());
      if (b >= 4 && d(str5, r()) == i && b(str5, r()))
        return b - 4; 
      if (b >= 3 && d(str4, r()) == i && b(str4, r()))
        return b - 3; 
      if (d(str3, r()) == i && b(str3, r()))
        return b - 2; 
      return b - 1;
    } catch (FileNotFoundException fileNotFoundException) {
      throw new ExceptionInVPackage("Unable to open file for reading:\n" + paramString);
    } catch (IOException iOException) {
      throw new ExceptionInVPackage("Unable to read from file:\n" + paramString);
    } finally {
      if (ManagerUsingReader != null)
        try {
          ManagerUsingReader.close();
        } catch (IOException iOException) {
          Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, iOException);
        }  
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/at.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */