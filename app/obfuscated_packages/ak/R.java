package ak;

import V.a;
import V.f;
import W.T;
import bH.D;
import bH.X;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class R extends S {
  float[] a = null;
  
  ArrayList b = new ArrayList();
  
  boolean H = true;
  
  public R() {
    super(",", false);
  }
  
  public Iterator b() {
    try {
      String str;
      d d = null;
      d = new d();
      d.a("Time");
      d.b("s.");
      this.g.add(d);
      d = null;
      do {
        str = l();
        if (str.startsWith("Channel :")) {
          d = new d();
          String str1 = str.substring(str.indexOf(":") + 1, str.length()).trim();
          if (str1.equals("MAPSource")) {
            d.a("Manifold Pressure");
          } else if (str1.equals("CoolantTemp")) {
            d.a("Coolant Temp");
          } else if (str1.equals("Load")) {
            d.a("Fuel Load");
          } else if (str1.equals("LoadIgnition")) {
            d.a("Ignition Load");
          } else {
            d.a(m(str1));
          } 
          this.g.add(d);
        } else if (d != null && str.startsWith("Type :")) {
          String str1 = str.substring(str.indexOf(":") + 1, str.length()).trim();
          if (str1.equals("Percentage")) {
            d.b("%");
            d.a(0.1F);
            d.a(1);
          } else if (str1.equals("Decibel")) {
            d.b("db");
            d.a(0.01F);
            d.a(2);
          } else if (str1.equals("BatteryVoltage")) {
            d.b("volts");
            d.a(0.001F);
            d.a(1);
          } else if (str1.equals("AFR")) {
            d.b(":1");
            d.a(0.001F);
            d.a(3);
          } else if (str1.equals("Pressure")) {
            d.b("kPa");
            d.a(0.1F);
            d.a(1);
            d.b(-1013.0F);
          } else if (str1.equals("Angle")) {
            d.b("°");
            d.a(0.1F);
            d.a(1);
          } else if (str1.equals("Time_us")) {
            d.b("ms");
            d.a(0.001F);
            d.a(3);
          } else if (str1.equals("Temperature")) {
            d.b("°C");
            d.a(0.1F);
            d.a(2);
            d.b(-2730.0F);
          } else if (str1.equals("EngineSpeed")) {
            d.b("RPM");
            d.a(1.0F);
            d.a(0);
          } else if (str1.equals("Speed")) {
            d.b("");
            d.a(0.1F);
            d.a(1);
          } else if (str1.equals("Raw")) {
            d.b("");
            d.a(1.0F);
            d.a(0);
          } 
        } 
      } while (str != null && !str.startsWith("Log :"));
      if (str.startsWith("Log :"));
    } catch (IOException iOException) {
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } catch (f f) {
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, (Throwable)f);
    } catch (Exception exception) {
      D.a("Failed to get units from this row:\n");
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, exception);
    } 
    ArrayList<T> arrayList = new ArrayList();
    Iterator<T> iterator = this.g.iterator();
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    return arrayList.iterator();
  }
  
  private String m(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    boolean bool = false;
    for (char c : paramString.toCharArray()) {
      if (!bool && c <= 'Z' && c >= 'A') {
        stringBuilder.append(" ").append(c);
        bool = true;
      } else {
        stringBuilder.append(c);
        bool = ((c <= 'Z' && c >= 'A') || c == '_' || c == ' ') ? true : false;
      } 
    } 
    return stringBuilder.toString().trim();
  }
  
  protected int b(String paramString) {
    String str = "";
    BufferedReader bufferedReader = null;
    try {
      this.h = new File(paramString);
      FileInputStream fileInputStream = new FileInputStream(this.h);
      bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
      for (byte b = 0; b < 100; b++) {
        str = bufferedReader.readLine();
        if (str == null)
          throw new a("Unable to read Haltech file, is it corrupt?"); 
        if (str.startsWith("Channel :"))
          return b; 
      } 
      throw new a("Log Fie Header not as expected for a Haltech ESP log file.");
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
  
  public float[] c() {
    String str = null;
    if (this.a == null)
      this.a = new float[this.g.size()]; 
    if (this.t && this.p >= 2000 && k())
      throw new a("This Edition is limited to loading 500 rows of data. \nPlease Register to load large log files."); 
    this.b.clear();
    try {
      str = l();
    } catch (IOException iOException) {
      iOException.printStackTrace();
      throw new a("IO Error reading row from file on row " + this.p + ".");
    } 
    boolean bool = false;
    do {
      if (this.m == -1L)
        this.m = this.h.length() / (str.length() + 3); 
      if (str.endsWith(r()));
      String str1 = r();
      aE aE = new aE(str, str1);
      this.i = new float[aE.c()];
      for (byte b = 0; b < this.i.length; b++) {
        String str2 = null;
        try {
          str2 = aE.b().trim();
        } catch (Exception exception) {
          D.c("Error Parsing record:\n" + str);
          str2 = "0";
          exception.printStackTrace();
        } 
        if (str2.indexOf(":") != -1) {
          this.i[b] = g(str2);
        } else if (str2.length() == 0 || str2.contains("-2.147484E+09")) {
          this.i[b] = Float.NaN;
        } else {
          try {
            str2 = X.b(str2, ",", ".");
            this.i[b] = Float.parseFloat(str2);
          } catch (NumberFormatException numberFormatException) {
            this.i[b] = Float.NaN;
          } 
        } 
        if (!Float.isNaN(this.i[b])) {
          if (b > 0 && this.b.contains(Integer.valueOf(b))) {
            a(true);
            bool = true;
            break;
          } 
          this.a[b] = this.i[b];
          this.b.add(Integer.valueOf(b));
        } 
      } 
      if (bool)
        continue; 
      try {
        str = l();
      } catch (f f) {
        bool = true;
      } catch (IOException iOException) {
        iOException.printStackTrace();
        throw new a("IO Error reading row from file on row " + this.p + ".");
      } 
    } while (!bool && str != null);
    return this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/R.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */