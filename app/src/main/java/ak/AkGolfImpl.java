package ak;

import V.ExceptionInVPackage;
import V.VInterfaceFoxtrot;
import W.T;
import W.V;
import W.X;
import W.Z;
import W.ManagerUsingReader;
import W.m;
import bH.D;
import bH.I;
import bH.X;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class AkGolfImpl extends V {
  ManagerUsingReader e = null;
  
  String VInterfaceFoxtrot = m();
  
  ArrayList g = new ArrayList();
  
  File h = null;
  
  float[] i = null;
  
  protected String j = "UTF-8";
  
  int k = -1;
  
  int l = -1;
  
  long m = -1L;
  
  String n = null;
  
  String o = null;
  
  int p = 0;
  
  private boolean ExceptionInVPackage = false;
  
  public static boolean q = true;
  
  protected String r = r() + r();
  
  protected String s = r() + " " + r();
  
  protected boolean t = false;
  
  private boolean b = false;
  
  boolean u;
  
  protected boolean v = false;
  
  protected String w = null;
  
  HashMap x = null;
  
  protected static final String[] y = new String[] { "ON", "ACTIVE", "HIGH", "SUCCESS", "YES", "TOO HIGH", "OK", "Y", "TRUE" };
  
  protected static final String[] z = new String[] { "OFF", "INACTIVE", "LOW", "FAILURE", "NO", "TOO LOW", "FALSE" };
  
  protected static final String[] A = new String[] { "Timestamp (mS)", "Elapsed Time", "Time/s", "Time Line", "Offset", "timestamp", "Section Time" };
  
  protected static final String[] B = new String[] { "Timestamp (mS)", "Time Line", "time_ms" };
  
  protected boolean C = false;
  
  protected boolean D = false;
  
  protected boolean E = false;
  
  protected int F = 100;
  
  protected boolean G = false;
  
  public AkGolfImpl(String paramString, boolean paramBoolean) {
    this.VInterfaceFoxtrot = paramString;
    this.u = paramBoolean;
  }
  
  public boolean ExceptionInVPackage(String paramString) {
    int i = b(paramString);
    if (i > 0)
      this.w = ExceptionInVPackage(paramString, i); 
    FileInputStream fileInputStream = null;
    try {
      this.h = new File(paramString);
      fileInputStream = new FileInputStream(this.h);
      byte[] arrayOfByte = new byte[2];
      fileInputStream.read(arrayOfByte);
      if (arrayOfByte[0] == -1 && arrayOfByte[1] == -2) {
        this.j = "UTF-16LE";
        D.c(this.j + " detected.");
      } else if (arrayOfByte[0] == -2 && arrayOfByte[1] == -1) {
        this.j = "UTF-16BE";
        D.c(this.j + " detected.");
      } else if (arrayOfByte[0] == -17 && arrayOfByte[1] == -69) {
        arrayOfByte = new byte[1];
        fileInputStream.read(arrayOfByte);
        this.j = "UTF-8";
        if (arrayOfByte[0] == -65)
          D.c(this.j + " detected."); 
      } else {
        try {
          fileInputStream.close();
        } catch (Exception exception) {}
        fileInputStream = new FileInputStream(this.h);
      } 
      this.e = new ManagerUsingReader(new InputStreamReader(fileInputStream, this.j));
      String str = null;
      for (byte b = 0; b <= i; b++) {
        str = this.n;
        this.n = this.e.ExceptionInVPackage();
      } 
      this.t = (!this.VInterfaceFoxtrot.equals("\t") || (i > 2 && (str == null || !str.trim().equals("\""))));
      return true;
    } catch (FileNotFoundException fileNotFoundException) {
      throw new ExceptionInVPackage("Unable to open file for reading:\n" + paramString);
    } catch (IOException iOException) {
      throw new ExceptionInVPackage("Unable to read from file:\n" + paramString);
    } 
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
      if (str.startsWith("\"Elapsed Time\""))
        str = X.b(str, "\"", ""); 
      byte b = 0;
      if (!str.startsWith(".") && !str.startsWith("Data Filename:")) {
        String[] arrayOfString = n();
        boolean bool = (arrayOfString == null || arrayOfString.length == 0) ? true : false;
        byte b1 = 0;
        if (!bool)
          for (String str1 : arrayOfString) {
            if (!str1.isEmpty() && ++b1 > 5) {
              bool = false;
              break;
            } 
          }  
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
          if (X.ExceptionInVPackage(B, str1)) {
            d1.ExceptionInVPackage(3);
            d1.ExceptionInVPackage("Time");
            d1.b("s");
            str1 = "Time";
            d1.ExceptionInVPackage(0.001F);
          } else if (X.ExceptionInVPackage(A, str1)) {
            d1.ExceptionInVPackage(3);
            d1.ExceptionInVPackage("Time");
            d1.b("s");
            str1 = "Time";
          } else if (!b && this.v) {
            d1.ExceptionInVPackage(3);
            d1.ExceptionInVPackage("Time");
            d1.b("s");
            str1 = "Time";
          } 
          try {
            if (!str1.startsWith("AP Info:"))
              if (!bool && arrayOfString.length > b) {
                String str4 = arrayOfString[b];
                if (str4.contains("[")) {
                  str4 = X.b(str4, "[", "");
                  str4 = X.b(str4, "]", "");
                } 
                d1.b(str4);
              } else if (str1.lastIndexOf("[") > 1 && str1.lastIndexOf("]") > str1.lastIndexOf("[")) {
                int i = str1.lastIndexOf("[");
                int j = str1.indexOf("]", i);
                String str4 = str1.substring(i + 1, j).trim();
                d1.b(str4);
                str1 = (str1.substring(0, i) + str1.substring(j + 1, str1.length())).trim();
                this.t = true;
              } else if (str1.lastIndexOf("(") > 1 && str1.lastIndexOf(")") > str1.lastIndexOf("(")) {
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
          for (byte b2 = 0; b2 < 100 && i(str2); b2++)
            str2 = str1 + b2; 
          str1 = str2;
          d1.ExceptionInVPackage(str1);
          d d2 = ExceptionInVPackage(d1);
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
  
  protected String[] n() {
    String[] arrayOfString = null;
    String str = null;
    try {
      byte b = 0;
      str = l();
      arrayOfString = str.split(Pattern.quote(r()));
      for (String str1 : arrayOfString) {
        str1 = X.b(str1, "\"", "").trim();
        if (str1.isEmpty()) {
          arrayOfString[b] = str1;
          b++;
        } else if (!I.ExceptionInVPackage(str1) && Float.isNaN(g(str1))) {
          arrayOfString[b] = str1;
          b++;
        } else {
          ExceptionInVPackage(true);
          c();
          ExceptionInVPackage(true);
          return null;
        } 
      } 
    } catch (IOException iOException) {
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } catch (VInterfaceFoxtrot VInterfaceFoxtrot) {
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, (Throwable)VInterfaceFoxtrot);
      return null;
    } catch (Exception exception) {
      D.ExceptionInVPackage("Failed to get units from this row:\n" + str);
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, exception);
    } 
    return arrayOfString;
  }
  
  public String o() {
    return r();
  }
  
  protected d ExceptionInVPackage(d paramd) {
    if (paramd.ExceptionInVPackage().toLowerCase().contains("latitude") || paramd.ExceptionInVPackage().toLowerCase().contains("longitude") || paramd.ExceptionInVPackage().toLowerCase().contains("itude") || paramd.ExceptionInVPackage().equals("Lat") || paramd.ExceptionInVPackage().equals("Lon"))
      paramd.ExceptionInVPackage(7); 
    return paramd;
  }
  
  protected String d(String paramString) {
    paramString = X.b(paramString, this.r, this.s);
    return X.b(paramString, this.r, this.s);
  }
  
  String ExceptionInVPackage(ArrayList paramArrayList, String paramString) {
    while (b(paramArrayList, paramString))
      paramString = m(paramString); 
    return paramString;
  }
  
  private String m(String paramString) {
    int i = paramString.lastIndexOf(".");
    if (i != -1) {
      String str = paramString.substring(i + 1);
      if (I.ExceptionInVPackage(str))
        try {
          int j = Integer.valueOf(str).intValue();
          return paramString.substring(0, i + 1) + (j + 1);
        } catch (NumberFormatException numberFormatException) {
          return str + "." + (int)(Math.random() * 100.0D);
        }  
      return paramString + ".0";
    } 
    return paramString + ".0";
  }
  
  private boolean b(ArrayList paramArrayList, String paramString) {
    Iterator<d> iterator = paramArrayList.iterator();
    while (iterator.hasNext()) {
      if (((d)iterator.next()).ExceptionInVPackage().equals(paramString))
        return true; 
    } 
    return false;
  }
  
  protected int ExceptionInVPackage(String paramString1, String paramString2) {
    byte b = -1;
    ManagerUsingReader ah1 = null;
    try {
      this.h = new File(paramString1);
      FileInputStream fileInputStream = new FileInputStream(this.h);
      ah1 = new ManagerUsingReader(new InputStreamReader(fileInputStream));
      String str;
      while ((str = ah1.ExceptionInVPackage()) != null) {
        b++;
        if (str.startsWith(paramString2))
          break; 
      } 
      return b;
    } catch (IOException iOException) {
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, iOException);
      return -1;
    } finally {
      if (ah1 != null)
        try {
          ah1.close();
        } catch (IOException iOException) {
          Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, iOException);
        }  
    } 
  }
  
  protected int b(String paramString) {
    String str1 = "";
    String str2 = "";
    String str3 = "";
    String str4 = "";
    String str5 = "";
    byte b = 0;
    ManagerUsingReader ah1 = null;
    try {
      this.h = new File(paramString);
      FileInputStream fileInputStream = new FileInputStream(this.h);
      byte[] arrayOfByte = new byte[2];
      fileInputStream.read(arrayOfByte);
      if (arrayOfByte[0] == -1 && arrayOfByte[1] == -2) {
        this.j = "UTF-16LE";
        D.c(this.j + " detected.");
      } else if (arrayOfByte[0] == -2 && arrayOfByte[1] == -1) {
        this.j = "UTF-16BE";
        D.c(this.j + " detected.");
      } else if (arrayOfByte[0] == -17 && arrayOfByte[1] == -69) {
        arrayOfByte = new byte[1];
        fileInputStream.read(arrayOfByte);
        this.j = "UTF-8";
        if (arrayOfByte[0] == -65)
          D.c(this.j + " detected."); 
      } else {
        try {
          fileInputStream.close();
        } catch (Exception exception) {}
        fileInputStream = new FileInputStream(this.h);
      } 
      ah1 = new ManagerUsingReader(new InputStreamReader(fileInputStream, this.j));
      str1 = ah1.ExceptionInVPackage();
      if (str1 == null)
        return b - 1; 
      while (b == 0 || (!b_(str1) && !str2.startsWith("\"Elapsed Time\""))) {
        if (str1 == null)
          return b - 1; 
        if (!str1.startsWith("MARK")) {
          str5 = str4;
          str4 = str3;
          str3 = str2;
          str2 = str1;
          b++;
        } 
        str1 = ah1.ExceptionInVPackage();
        if (str1 != null && str1.length() > 2 && str1.endsWith("\","))
          str1 = str1.substring(0, str1.length() - 2); 
      } 
      if (this.u)
        l(h(str1)); 
      int i = d(str1, r());
      if (b >= 4 && i > 5 && Math.abs(d(str5, r()) - i) < 2 && b(str5, r()))
        return b - 4; 
      if (b >= 3 && i > 5 && Math.abs(d(str4, r()) - i) < 2 && b(str4, r()))
        return b - 3; 
      if (i >= 5 && Math.abs(d(str3, r()) - i) < 2 && b(str3, r()))
        return b - 2; 
      return b - 1;
    } catch (FileNotFoundException fileNotFoundException) {
      throw new ExceptionInVPackage("Unable to open file for reading:\n" + paramString);
    } catch (IOException iOException) {
      throw new ExceptionInVPackage("Unable to read from file:\n" + paramString);
    } finally {
      if (ah1 != null)
        try {
          ah1.close();
        } catch (IOException iOException) {
          Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, iOException);
        }  
    } 
  }
  
  protected String ExceptionInVPackage(String paramString, int paramInt) {
    StringBuilder stringBuilder = new StringBuilder();
    ManagerUsingReader ah1 = null;
    try {
      this.h = new File(paramString);
      FileInputStream fileInputStream = new FileInputStream(this.h);
      ah1 = new ManagerUsingReader(new InputStreamReader(fileInputStream));
      for (byte b = 0; b < paramInt; b++) {
        stringBuilder.append(ah1.ExceptionInVPackage());
        if (b < paramInt - 1)
          stringBuilder.append('\n'); 
      } 
      return stringBuilder.toString();
    } catch (FileNotFoundException fileNotFoundException) {
      throw new ExceptionInVPackage("Unable to open file for reading:\n" + paramString);
    } catch (IOException iOException) {
      throw new ExceptionInVPackage("Unable to read from file:\n" + paramString);
    } finally {
      if (ah1 != null)
        try {
          ah1.close();
        } catch (IOException iOException) {
          Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, iOException);
        }  
    } 
  }
  
  protected String l() {
    if (p()) {
      ExceptionInVPackage(false);
      return this.o;
    } 
    this.o = this.n;
    do {
      this.n = this.e.ExceptionInVPackage();
    } while (this.n != null && this.n.isEmpty() && this.n.indexOf(r()) == -1);
    this.p++;
    if (this.o == null)
      throw new VInterfaceFoxtrot("No records available."); 
    if (this.n != null)
      if (this.n.startsWith("\"Firmware ID\"")) {
        this.n = null;
      } else if (this.n.startsWith("[FooterData]")) {
        String str = this.o;
        q();
        this.n = null;
        this.o = str;
      } else if (this.n.startsWith("Raw Log Data")) {
        String str = this.o;
        do {
          this.n = this.e.ExceptionInVPackage();
        } while (this.n != null && !this.n.startsWith("[FooterData]"));
        if (this.n != null && this.n.startsWith("[FooterData]"))
          q(); 
        this.n = null;
        this.o = str;
      }  
    if (this.g.size() > 0 && this.o.trim().equals("")) {
      this.o = "MARK Corrupt file blank record";
      System.out.println("Found ExceptionInVPackage bad row");
    } 
    return this.o;
  }
  
  protected void e(String paramString) {
    if (paramString.indexOf("MARK") > -1)
      throw new m(paramString.trim()); 
  }
  
  public float[] c() {
    String str1 = null;
    boolean bool = p();
    try {
      if (this.t && this.p >= 500 && k())
        throw new ExceptionInVPackage("This Edition is limited to loading 500 rows of data. \nPlease Register to load large log files."); 
      str1 = l();
    } catch (IOException iOException) {
      iOException.printStackTrace();
      throw new ExceptionInVPackage("IO Error reading row from file on row " + this.p + ".");
    } 
    str1 = ExceptionInVPackage(str1, bool);
    String str2 = r();
    if (this.m == -1L)
      this.m = this.h.length() / (str1.length() + 3); 
    aE aE = new aE(str1, str2);
    aE.b(this.b);
    aE.ExceptionInVPackage(this.C);
    this.i = new float[aE.c()];
    for (byte b = 0; b < this.i.length && b < this.g.size(); b++) {
      String str = null;
      try {
        str = aE.b().trim();
      } catch (Exception exception) {
        D.c("Error Parsing record:\n" + str1);
        str = "0";
        exception.printStackTrace();
      } 
      if (((d)this.g.get(b)).VInterfaceFoxtrot() == 0) {
        try {
          if (this.D || (this.p < this.F && str.contains(","))) {
            if (!this.D) {
              this.D = true;
              D.d("Setting commas for decimals.");
            } 
            boolean bool1 = (str.contains(".") && str.contains(",")) ? true : false;
            if (bool1)
              str = X.b(str, ".", ""); 
            str = X.b(str, ",", ".");
          } 
          if (str.isEmpty() || str.equals("N/A") || str.equals("NA") || str.equals("####")) {
            this.i[b] = Float.NaN;
            str = "";
          } else {
            this.i[b] = Float.parseFloat(str);
            if (!this.G)
              this.G = true; 
          } 
        } catch (NumberFormatException numberFormatException) {
          this.i[b] = Float.NaN;
        } 
      } else {
        this.i[b] = Float.NaN;
      } 
      if (Float.isNaN(this.i[b]))
        if (str.isEmpty()) {
          this.i[b] = Float.NaN;
        } else if (str.indexOf(':') != -1) {
          this.i[b] = g(str);
        } else if (str.startsWith("0x") || str.startsWith("0X")) {
          try {
            this.i[b] = Integer.parseInt(str.substring(2), 16);
          } catch (Exception exception) {
            this.i[b] = Float.NaN;
          } 
        } else if (X.ExceptionInVPackage(z, str)) {
          this.i[b] = 0.0F;
          if (this.g.size() > b && ((d)this.g.get(b)).VInterfaceFoxtrot() == 0)
            ExceptionInVPackage(this.g.get(b), str); 
        } else if (X.ExceptionInVPackage(y, str)) {
          this.i[b] = 1.0F;
          if (this.g.size() > b && ((d)this.g.get(b)).VInterfaceFoxtrot() == 0)
            ExceptionInVPackage(this.g.get(b), str); 
        } else if (VInterfaceFoxtrot(str)) {
          this.i[b] = Float.parseFloat(str.substring(0, 7) + str.substring(8));
        } else if (this.G && !str.trim().isEmpty() && !str.trim().equals("NA")) {
          Z z = b(b);
          this.i[b] = z.ExceptionInVPackage(str).floatValue();
        }  
      if (this.E || (this.p < this.F && (str.contains("S ") || str.contains("E ") || str.contains("N ") || str.contains("W ")))) {
        if (!this.E)
          this.E = true; 
        this.o = X.b(this.o, "S ", "-");
        this.o = X.b(this.o, "E ", "");
        this.o = X.b(this.o, "N ", "");
        this.o = X.b(this.o, "W ", "-");
      } 
    } 
    return this.i;
  }
  
  protected String ExceptionInVPackage(String paramString, boolean paramBoolean) {
    try {
      if (!paramBoolean)
        e(paramString); 
    } catch (m m) {
      if (!m.ExceptionInVPackage())
        ExceptionInVPackage(true); 
      throw m;
    } 
    if (paramString.startsWith(r())) {
      String str = "0";
      if (this.i != null && this.i.length > 0)
        str = this.i[0] + ""; 
      paramString = str + paramString;
    } 
    paramString = d(paramString);
    if (paramString.endsWith(r()))
      paramString = paramString + " "; 
    if (paramString.startsWith("\""))
      paramString = paramString.substring(1); 
    if (paramString.endsWith("\""))
      paramString = paramString.substring(0, paramString.length() - 1); 
    return paramString;
  }
  
  protected boolean VInterfaceFoxtrot(String paramString) {
    return (paramString.length() == 10 && paramString.charAt(4) == '.' && paramString.charAt(7) == '.' && paramString.charAt(5) > '/' && paramString.charAt(5) < '2' && paramString.charAt(8) > '/' && paramString.charAt(8) < '4' && paramString.charAt(0) > '/' && paramString.charAt(0) < ':' && paramString.charAt(1) > '/' && paramString.charAt(1) < ':' && paramString.charAt(2) > '/' && paramString.charAt(2) < ':' && paramString.charAt(3) > '/' && paramString.charAt(3) < ':' && paramString.charAt(6) > '/' && paramString.charAt(6) < ':' && paramString.charAt(9) > '/' && paramString.charAt(9) < ':');
  }
  
  protected void ExceptionInVPackage(d paramd, String paramString) {
    if (paramString.equalsIgnoreCase("Yes") || paramString.equalsIgnoreCase("No")) {
      paramd.b(5);
    } else if (paramString.equalsIgnoreCase("High") || paramString.equalsIgnoreCase("Low")) {
      paramd.b(6);
    } else if (paramString.equalsIgnoreCase("Active") || paramString.equalsIgnoreCase("Inactive")) {
      paramd.b(7);
    } else {
      paramd.b(4);
    } 
  }
  
  protected float g(String paramString) {
    int i = 0;
    int j = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    try {
      StringTokenizer stringTokenizer = new StringTokenizer(paramString, ":");
      if (stringTokenizer.countTokens() > 2) {
        String str = stringTokenizer.nextToken().trim();
        if (str.contains(" "))
          str = str.substring(str.lastIndexOf(" ") + 1); 
        i = Integer.parseInt(str);
      } 
      j = Integer.parseInt(stringTokenizer.nextToken());
      if (stringTokenizer.hasMoreElements()) {
        String str = stringTokenizer.nextToken().trim();
        int k = str.indexOf("PM");
        if (k != -1) {
          i += 12;
        } else {
          k = str.indexOf("AM");
        } 
        if (k != -1)
          str = str.substring(0, k); 
        if (str.indexOf(" ") != -1)
          str = str.substring(0, str.indexOf(" ")); 
        f1 = Float.parseFloat(str);
      } 
      if (stringTokenizer.hasMoreElements()) {
        String str = stringTokenizer.nextToken();
        try {
          f2 = Float.parseFloat(str) / 1000.0F;
        } catch (NumberFormatException numberFormatException) {}
      } 
      this.t = true;
      return (i * 3600 + j * 60) + f1 + f2;
    } catch (Exception exception) {
      return Float.NaN;
    } 
  }
  
  public boolean e() {
    if (this.n == null || this.n.trim().length() <= 0)
      try {
        this.n = l();
        return (this.n != null && this.n.trim().length() > 0 && !this.n.startsWith("[FooterData]"));
      } catch (Exception exception) {
        return false;
      }  
    return true;
  }
  
  protected boolean b(String paramString1, String paramString2) {
    try {
      if (paramString1.startsWith("\""))
        paramString1 = paramString1.substring(1); 
      paramString1 = X.b(paramString1, paramString2, paramString2 + " ").trim();
      byte b = 0;
      aE aE = new aE(paramString1, paramString2);
      while (aE.ExceptionInVPackage()) {
        String str = aE.b();
        if (str.trim().length() == 0 && aE.ExceptionInVPackage())
          b++; 
        if (b > 1)
          return false; 
      } 
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  protected boolean c(String paramString1, String paramString2) {
    try {
      if (paramString1.startsWith("\""))
        paramString1 = paramString1.substring(1); 
      String str = paramString1.substring(0, paramString1.indexOf(paramString2));
      if (str.trim().length() == 0 || str.contains(":"))
        str = paramString1.substring(paramString1.indexOf(paramString2) + paramString2.length(), paramString1.indexOf(paramString2, paramString1.indexOf(paramString2) + paramString2.length())); 
      Double.parseDouble(paramString2.equals(",") ? str : str.replace(',', '.'));
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  protected boolean b_(String paramString) {
    return (paramString != null && !paramString.startsWith("#") && !paramString.startsWith(".") && !paramString.startsWith("Data Filename:")) ? (this.u ? (c(paramString, "\t") ? true : (c(paramString, ",") ? true : (c(paramString, "|") ? true : (c(paramString, ";") ? true : (c(paramString, "\",\"") ? true : (c(paramString, "\", \"") ? true : (c(paramString, " ")))))))) : c(paramString, r())) : false;
  }
  
  protected String h(String paramString) {
    return ExceptionInVPackage(paramString, (List)null);
  }
  
  protected String ExceptionInVPackage(String paramString, List paramList) {
    int i = 0;
    String str1 = "\t";
    i = d(paramString, str1);
    String str2 = "\", \"";
    int j = d(paramString, str2);
    if (j > i) {
      i = j;
      str1 = str2;
    } 
    str2 = "\",\"";
    if (paramList == null || paramList.contains(str2)) {
      j = d(paramString, str2);
      if (j > i) {
        i = j;
        str1 = str2;
      } 
    } 
    str2 = ";";
    if (paramList == null || paramList.contains(str2)) {
      j = d(paramString, str2);
      if (j > i) {
        i = j;
        str1 = str2;
      } 
    } 
    str2 = ",";
    if (paramList == null || paramList.contains(str2)) {
      j = d(paramString, str2);
      if (j > i) {
        i = j;
        str1 = str2;
      } 
    } 
    str2 = "|";
    if (paramList == null || paramList.contains(str2)) {
      j = d(paramString, str2);
      if (j > i) {
        i = j;
        str1 = str2;
      } 
    } 
    str2 = "'";
    if (paramList == null || paramList.contains(str2)) {
      j = d(paramString, str2);
      if (j > i) {
        i = j;
        str1 = str2;
      } 
    } 
    paramString = paramString.trim().replaceAll(" +", " ");
    str2 = " ";
    if (paramList == null || paramList.contains(str2)) {
      j = d(paramString, str2);
      if (j > i) {
        i = j;
        str1 = str2;
      } 
    } 
    return str1;
  }
  
  protected int d(String paramString1, String paramString2) {
    byte b1 = 0;
    boolean bool = false;
    for (byte b2 = 0; b2 < paramString1.length() - paramString2.length() + 1; b2++) {
      if (paramString1.charAt(b2) == '"')
        bool = !bool ? true : false; 
      String str = paramString1.substring(b2, b2 + paramString2.length());
      if (str.equals(paramString2) && !bool)
        b1++; 
    } 
    return b1;
  }
  
  public long d() {
    return this.m;
  }
  
  public void ExceptionInVPackage() {
    try {
      this.e.close();
    } catch (Exception exception) {
      D.d("Closed file: " + this.h.getName());
    } 
  }
  
  protected String m() {
    return "\t";
  }
  
  protected boolean p() {
    return this.ExceptionInVPackage;
  }
  
  protected void ExceptionInVPackage(boolean paramBoolean) {
    this.ExceptionInVPackage = paramBoolean;
  }
  
  public boolean VInterfaceFoxtrot() {
    return false;
  }
  
  protected boolean i(String paramString) {
    for (d d : this.g) {
      if (d.ExceptionInVPackage().equals(paramString))
        return true; 
    } 
    return false;
  }
  
  protected void q() {
    this.o = this.n;
    byte b = 0;
    if (this.x == null)
      this.x = new HashMap<>(); 
    do {
      this.n = this.e.ExceptionInVPackage();
      if (this.n == null)
        continue; 
      if (this.n.contains("=")) {
        String[] arrayOfString = this.n.split("=");
        if (arrayOfString.length >= 2)
          this.x.put(arrayOfString[0], arrayOfString[1]); 
      } else {
        this.x.put("Data" + b++, this.n);
      } 
    } while (this.n != null && !this.n.isEmpty());
  }
  
  public String i() {
    return X.ExceptionInVPackage;
  }
  
  public HashMap g() {
    return this.x;
  }
  
  public String h() {
    return this.w;
  }
  
  public void j(String paramString) {
    this.j = paramString;
  }
  
  protected String k(String paramString) {
    if (paramString.contains("\"") && r().equals(",")) {
      boolean bool = false;
      for (byte b = 0; b < paramString.length(); b++) {
        if (paramString.charAt(b) == '"')
          bool = !bool ? true : false; 
        if (bool && paramString.charAt(b) == ',')
          paramString = paramString.substring(0, b) + paramString.substring(b + 1); 
      } 
    } 
    return paramString;
  }
  
  public void b(boolean paramBoolean) {
    this.b = paramBoolean;
  }
  
  public String r() {
    return this.VInterfaceFoxtrot;
  }
  
  public void l(String paramString) {
    this.VInterfaceFoxtrot = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */