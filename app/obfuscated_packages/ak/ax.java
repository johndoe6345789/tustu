package ak;

import V.ExceptionInVPackage;
import V.VInterfaceFoxtrot;
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

public class ax extends S {
  public ax() {
    super(",", true);
  }
  
  public boolean ExceptionInVPackage(String paramString) {
    FileInputStream fileInputStream = null;
    try {
      this.h = new File(paramString);
      fileInputStream = new FileInputStream(this.h);
      this.e = new ah(new InputStreamReader(fileInputStream, "ISO-8859-1"));
      this.n = this.e.ExceptionInVPackage();
      while (!this.n.startsWith("\"Time\"") && !this.n.startsWith("Time"))
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
      if (str1.startsWith("\"Time") || str1.startsWith("Time")) {
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
        str1 = X.b(str1, r() + r(), r() + " " + r());
        StringTokenizer stringTokenizer = new StringTokenizer(str1, r());
        while (stringTokenizer.hasMoreTokens()) {
          String str2 = stringTokenizer.nextToken();
          if (str2.startsWith("\""))
            str2 = X.b(str2, "\"", ""); 
          if (str2.equals(" "))
            str2 = "Col" + b; 
          if (str2.equalsIgnoreCase("lambda"))
            str2 = "Lambda"; 
          d d = new d();
          d.ExceptionInVPackage(str2.trim());
          d = b(d);
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
      byte b = 0;
      StringTokenizer stringTokenizer = new StringTokenizer(str, r());
      while (stringTokenizer.hasMoreTokens()) {
        String str1 = stringTokenizer.nextToken().trim();
        if (b < this.g.size()) {
          if (!b_(str1)) {
            str1 = X.b(str1, "\"", "");
            ((d)this.g.get(b++)).b(str1);
            continue;
          } 
          ExceptionInVPackage(true);
          break;
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
  
  private d b(d paramd) {
    if (paramd.ExceptionInVPackage().equals("Time")) {
      paramd.ExceptionInVPackage(0.001F);
      paramd.b("s");
    } 
    return paramd;
  }
  
  protected String m() {
    return ",";
  }
  
  public String i() {
    return X.n;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/ax.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */