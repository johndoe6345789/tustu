package g;

import G.cb;
import L.n;
import V.h;
import W.T;
import W.V;
import W.W;
import W.Z;
import W.j;
import W.m;
import W.n;
import Z.d;
import Z.f;
import ak.g;
import ax.u;
import bB.c;
import bB.r;
import bH.D;
import com.efiAnalytics.ui.bV;
import h.a;
import h.g;
import h.i;
import java.awt.Component;
import java.awt.Frame;
import java.io.File;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k.a;
import k.d;

public class b extends Thread {
  int a = 0;
  
  private static int k = Integer.MAX_VALUE;
  
  HashMap b = new HashMap<>();
  
  HashMap c = new HashMap<>();
  
  boolean d = false;
  
  private boolean l = false;
  
  boolean e = false;
  
  Component f = null;
  
  private boolean m = true;
  
  String[] g = null;
  
  ArrayList h = new ArrayList();
  
  ArrayList i = new ArrayList();
  
  private static bB.b n = (bB.b)new c();
  
  private n o = null;
  
  NumberFormat j = new DecimalFormat("######.#####");
  
  public static bB.b a() {
    return n;
  }
  
  public static void a(bB.b paramb) {
    n = paramb;
  }
  
  public b(Component paramComponent) {
    this(paramComponent, false);
  }
  
  public b(Component paramComponent, boolean paramBoolean) {
    super("DataLoader_" + Math.random());
    this.d = paramBoolean;
    this.f = paramComponent;
  }
  
  public void a(a parama) {
    this.i.add(parama);
  }
  
  private void a(ArrayList paramArrayList) {
    Iterator<a> iterator = this.i.iterator();
    while (iterator.hasNext())
      ((a)iterator.next()).a(paramArrayList); 
  }
  
  public void b() {
    String str1 = i.a("DEFAULT_fieldMapping", "FieldMaps/MegaSquirt.properties");
    String str2 = i.a("fieldMapping", str1);
    if (!str2.equals("Auto")) {
      g.b(str2);
      System.out.println("Using " + str2 + " for Field Mappings");
    } 
  }
  
  public void a(boolean paramBoolean) {
    this.l = paramBoolean;
  }
  
  public void a(String paramString) {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = paramString;
    a(arrayOfString);
  }
  
  public void a(String[] paramArrayOfString) {
    this.g = paramArrayOfString;
  }
  
  public void start() {
    super.start();
    D.d("Started Data Loader Thread");
  }
  
  public void run() {
    Thread.currentThread().setPriority(1);
    if (this.g != null)
      try {
        b(this.g);
      } catch (Exception exception) {
        String str = "Entire log file not loaded:\n" + exception.getMessage();
        a(1.0D);
        a(exception, str);
      } finally {
        System.gc();
      }  
  }
  
  public void c() {
    this.e = true;
  }
  
  private boolean c(ArrayList paramArrayList, String paramString) {
    try {
      Iterator<j> iterator = paramArrayList.iterator();
      while (iterator.hasNext()) {
        if (((j)iterator.next()).a().equals(paramString))
          return true; 
      } 
    } catch (Exception exception) {
      D.a("Exception checking for existance of appended field.");
    } 
    return false;
  }
  
  public n b(String[] paramArrayOfString) {
    long l = System.currentTimeMillis();
    n n1 = new n();
    ArrayList<j> arrayList = new ArrayList();
    for (byte b1 = 0; b1 < paramArrayOfString.length; b1++) {
      File file = new File(paramArrayOfString[b1]);
      if (b1 > 0) {
        String str = file.getName();
        n1.a(n1.d() - 1, "begining of " + str + ", Time will be inconsistent");
      } else {
        n1.a(file);
      } 
      System.out.println("Begin load of " + file.getName());
      b();
      float f = 0.0F;
      f();
      a(0.01D);
      byte b2 = 0;
      V v = W.a().a(file);
      if (v == null)
        return null; 
      i.c("lastFileFormat", v.i());
      i.o = v.j();
      byte b3 = 0;
      boolean bool = false;
      byte b4 = 0;
      int i = 200;
      try {
        while (!this.e) {
          long l1 = System.currentTimeMillis();
          if (Runtime.getRuntime().freeMemory() < 800L) {
            System.out.println("Low Memory freemem=" + Runtime.getRuntime().freeMemory());
            if (k.a()) {
              bV.d("Low Application Memory!\nYour available system memory is running low.", new Frame());
              break;
            } 
            bV.d("Low Application Memory!\nTo load large files on a capable computer, start application with memory parameters.\nExample Command line:\njava -Xms256m -Xmx1024m -jar " + a(i.b, " ", "") + ".jar", new Frame());
            break;
          } 
          boolean bool1 = false;
          while (!v.e() && this.l && !this.e && System.currentTimeMillis() - l1 <= 600000L) {
            bool1 = true;
            try {
              Thread.sleep(50L);
            } catch (Exception exception) {
              break;
            } 
          } 
          if (bool1 && v.e() && this.l && !this.e)
            g(); 
          if (!v.e())
            break; 
          if (arrayList.isEmpty() || !b3) {
            if (b1 == 0) {
              n1.clear();
              arrayList.clear();
              byte b7 = 0;
              Iterator<T> iterator = v.b();
              while (iterator.hasNext()) {
                T t = iterator.next();
                String str1 = t.a();
                String str2 = i.d.getProperty(str1 + "_NAME");
                if (str2 != null && !str2.equals(""))
                  str1 = str2; 
                j j = new j(str1, (int)v.d());
                j.e(t.e());
                j.j(t.e());
                j.e(t.b());
                j.f(t.f());
                j.a(t.g());
                j.g(t.j());
                if (!v.f()) {
                  j.h(t.d());
                  j.i(t.c());
                } 
                if (!Float.isNaN(t.h()) && !Float.isNaN(t.i()) && t.h() < t.i()) {
                  j.d(t.h());
                  j.e(t.i());
                } 
                j.c(i.c(j.a() + "_FORMULA"));
                j.d(i.c(j.a() + "_MAP_FILE"));
                arrayList.add(j);
                b7++;
              } 
              D.d("Opening Log, expected size: Field Count: " + arrayList.size() + ", Records: " + v.d());
              boolean bool2 = (h.b.a().a("fieldNameNormalization") && i.a("fieldNameNormaization", true)) ? true : false;
              for (j j : arrayList) {
                String str1 = j.a();
                String str2 = Z.b.a().a(str1);
                if (bool2 && str2 != null && !str2.isEmpty() && !str2.equals(str1) && !a(str2, arrayList)) {
                  D.d("Field Name Standardization: mapping " + str1 + " > " + str2);
                  j.f(str1);
                  j.a(str2);
                } 
                a(j);
              } 
              a(arrayList);
              j[] arrayOfJ = b(arrayList);
              for (byte b8 = 0; b8 < arrayOfJ.length; b8++) {
                if (!c(arrayList, arrayOfJ[b8].a())) {
                  arrayList.add(arrayOfJ[b8]);
                  a(arrayOfJ[b8]);
                } 
              } 
              g g = g.a();
              for (j j : arrayList) {
                int k = 0;
                if (cb.a().b(j.a()))
                  k = cb.a().a(j.a()).intValue(); 
                int m = i.b("fieldSmoothingFactor_" + j.a(), k);
                if (m > 0) {
                  j.g(m);
                  j.b(true);
                } 
                if (n1.a(j.a()) == null) {
                  n1.a(j);
                  if (j.j() != null && j.j().indexOf(g.a(g.b)) != -1) {
                    if (j.a().equals("AFR") && n1.a(g.a(g.b)) == null)
                      if (n1.a("afr") != null) {
                        D.b("Bad AFR(WBO2) formula \"" + j.j() + "\", corrected to:[afr]");
                        j.c("[afr]");
                      } else if (n1.a("AFR") != null) {
                        D.b("Bad AFR(WBO2) formula \"" + j.j() + "\", corrected to:[AFR]");
                        j.c("[AFR]");
                      } else if (n1.a("AFR1") != null) {
                        D.b("Bad AFR(WBO2) formula \"" + j.j() + "\", corrected to:[AFR1]");
                        j.c("[AFR1]");
                      } else if (n1.a("Lambda") != null) {
                        D.b("Bad AFR(WBO2) formula \"" + j.j() + "\", corrected to:[Lambda]*14.7");
                        j.c("[Lambda]*14.7");
                      } else if (n1.a("Lambda1") != null) {
                        D.b("Bad AFR(WBO2) formula \"" + j.j() + "\", corrected to:[Lambda1]*14.7");
                        j.c("[Lambda1]*14.7");
                      }  
                    if (j.a().equalsIgnoreCase(g.a("Lambda")) && n1.a(g.a(g.b)) == null) {
                      if (n1.a("afr") != null) {
                        D.b("Bad Lambda formula \"" + j.j() + "\", corrected to:[afr]/14.7");
                        j.c("[afr]/14.7");
                        continue;
                      } 
                      if (n1.a("AFR") != null) {
                        D.b("Bad Lambda formula \"" + j.j() + "\", corrected to:[AFR]/14.7");
                        j.c("[AFR]/14.7");
                        continue;
                      } 
                      if (n1.a("AFR1") != null) {
                        D.b("Bad Lambda formula \"" + j.j() + "\", corrected to:[AFR1]/14.7");
                        j.c("[AFR1]/14.7");
                        continue;
                      } 
                      if (n1.a("Lambda1") != null) {
                        D.b("Bad Lambda formula \"" + j.j() + "\", corrected to:[Lambda1]");
                        j.c("[Lambda1]");
                      } 
                    } 
                  } 
                } 
              } 
              if (n1.a(g.a("Lambda")) != null && n1.a(g.a(g.h)) == null) {
                j j = new j(g.a(g.h));
                j.c("[" + g.a("Lambda") + "]*14.7");
                a(j);
                arrayList.add(j);
                n1.a(j);
              } 
              if (v instanceof g) {
                n1.g(((g)v).o());
              } else {
                n1.g(null);
              } 
            } else {
              byte b7 = 0;
              Iterator<T> iterator = v.b();
              while (iterator.hasNext()) {
                T t = iterator.next();
                String str1 = t.a();
                String str2 = i.d.getProperty(str1 + "_NAME");
                if (str2 != null && !str2.equals(""))
                  str1 = str2; 
                j j = arrayList.get(b7++);
                try {
                  if (!j.a().equals(str1) && j.u() != null && !j.u().equals(str1)) {
                    bV.d("File Headers DO NOT Match!!!\nTo load multiple fies they Must have identical field headers.\n" + file.getAbsolutePath() + "\nskipped.", bV.c());
                    break;
                  } 
                } catch (Exception exception) {
                  bV.d("File Headers DO NOT Match!!!\nTo load multiple fies they Must have identical field headers.\n" + file.getAbsolutePath() + "\nskipped.", bV.c());
                  break;
                } 
              } 
            } 
          } else {
            String str = g.a().a("Time");
            j j1 = null;
            j j2 = null;
            if (str != null) {
              j1 = n1.a(str);
              if (this.o != null)
                j2 = this.o.a(str); 
            } 
            try {
              float[] arrayOfFloat = v.c();
              b4 = 0;
              for (byte b7 = 0; b7 < arrayList.size(); b7++) {
                j j = arrayList.get(b7);
                String str1 = "";
                String str2 = j.k();
                float f1 = 0.0F;
                if (j.l()) {
                  String str3 = j.j();
                  if (str3.indexOf("|") != -1)
                    str3 = b(arrayList, str3); 
                  str1 = str3;
                  try {
                    a a = d.a().a(str1);
                    f1 = (float)a.a(n1, n1.d() - 1);
                  } catch (u u) {
                    f1 = Float.NaN;
                  } catch (Exception exception) {
                    boolean bool2;
                    String str4 = "Error calculating field " + j.a() + "\nFormula: (" + j.j() + ") produced an error.\nThis is typically cause by fields required for calculated fields and are not\navailable in the current open log. \nTo stop this error, turn off the Calculated Field: " + j.a();
                    if (b3 > 1) {
                      bool2 = a(exception, str4);
                    } else {
                      bool2 = false;
                      arrayList.remove(b7);
                      n1.b(j);
                      D.d("unable to calculate field " + j.a() + ", all required variables not present: " + exception.getMessage());
                      b7--;
                    } 
                    f1 = 0.0F;
                    a a = d.a().a(str1);
                    if (bool2 && a != null)
                      D.a("Failed to evaluate the following formula:\n" + a.c()); 
                  } 
                } else if (b7 >= arrayOfFloat.length) {
                  if (d() && b3 > 0) {
                    f1 = j.d(j.i() - 1);
                  } else {
                    f1 = Float.NaN;
                  } 
                } else if (d() && Float.isNaN(arrayOfFloat[b7]) && b3 > 0) {
                  f1 = j.d(j.i() - 1);
                } else {
                  f1 = arrayOfFloat[b7];
                } 
                if (j.j() != null && j.j().indexOf("logVal") != -1)
                  if (j.a().equals("RPM")) {
                    if (i.a(j.a() + "_USE_FORMULA", false))
                      f1 = a(j.j(), arrayOfFloat[b7] + "").floatValue(); 
                  } else {
                    f1 = a(j.j(), arrayOfFloat[b7] + "").floatValue();
                  }  
                if (str2 != null && !str2.equals("")) {
                  d d = b(str2);
                  f1 = (float)d.a(arrayOfFloat[b7]);
                } 
                if (j.a().equals("Time") && j.x() && !Float.isNaN(f1))
                  j.i(-f1); 
                j.a(f1);
              } 
              if (i.a("timeGapsOn", false) && n1.d() > 3 && b3 > 5 && j1 != null) {
                float f1 = j1.c(j1.i() - 1) - j1.c(j1.i() - 2);
                if (f1 > 0.0F)
                  f = (f > 0.0D) ? ((n1.d() * f + f1) / (n1.d() + 1.0F)) : f1; 
                if (f1 > 0.05F && f1 > 2.5D * f) {
                  int j = n1.d() - 2;
                  if (f1 > 5.0F * f)
                    n1.c(j, "Time gap: no log entries for " + k.a(f1, 2) + " seconds."); 
                  for (byte b8 = 1; b8 * f < f1 && b8 < 50; b8++) {
                    for (j j3 : arrayList) {
                      if (j3.a().equals("Engine")) {
                        j3.a(j3.i() - 1, j3.c(j));
                        continue;
                      } 
                      float f2 = j3.c(j);
                      float f3 = j3.c(j3.i() - 1);
                      float f4 = f2 + b8 * f / f1 * (f3 - f2);
                      j3.a(j3.i() - 1, f4);
                      n1.b(j3.i() - 2, "Time Gap: Calculated Record");
                    } 
                  } 
                } 
              } 
              if (b3 == 1) {
                a(n1);
                bool = true;
                a(b3 / v.d());
                System.gc();
              } else if (b3 % i == 0) {
                a(b3 / v.d());
                i = (int)(v.d() / 200L);
                if (i < 200) {
                  i = 200;
                } else if (i % 2 != 0) {
                  i++;
                } 
                Thread.yield();
              } 
              if (b3 > k)
                throw new h("The Lite! edition is limited to " + k + " Records. Please Register!"); 
              if (j1 != null)
                n.a().a((long)(j1.d(b3) * 1000.0F)); 
              n.a().a(b3);
            } catch (m m) {
              if (b4 && n1.d() > 0)
                for (j j : arrayList)
                  j.b(j.c(j.i() - 1));  
              n1.a(n1.d() - 1, m.getMessage());
              b4++;
            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
              if (b2++ > 10 && v.e())
                throw new h("Error parsing file, too many bad rows found " + b2 + ", discontinuing."); 
            } 
          } 
          b3++;
        } 
        byte b5;
        for (b5 = 0; b5 < n1.size(); b5++) {
          Z z = v.a(b5);
          if (z != null) {
            j j = (j)n1.get(b5);
            j.b(false);
            j.a(z.a());
          } 
        } 
        if (v.g() != null && !n1.h())
          n1.c(v.g()); 
        if (v.h() != null)
          n1.c(v.h()); 
      } catch (OutOfMemoryError outOfMemoryError) {
        outOfMemoryError.printStackTrace();
        bV.d("Using all allocated Memory, can not load remainder of file.", bV.c());
        return n1;
      } finally {
        if (n1.d() <= 0) {
          if (i.j()) {
            bV.d("Log File contains no data or is not recognized.\nIf this is an ASCII type log file, \nCheck the selected File Delimiter under the Options Menu.", new Frame());
          } else {
            String str = "No Data Was found in this log file.\nDelimiter Auto Detect is currently disabled under the options menu.\n\nWould you like to try loading this file again with Auto Detect Delimiter enabled?";
            boolean bool2 = bV.a(str, bV.c(), true);
            if (bool2) {
              i.c("delimiter", "Auto");
              return b(paramArrayOfString);
            } 
          } 
        } else if (!bool) {
          a(n1);
          bool = true;
        } 
        boolean bool1 = false;
        for (byte b5 = 0; b5 < n1.size(); b5++) {
          j j = (j)n1.get(b5);
          if (!j.q()) {
            n1.b(j);
            bool1 = true;
            b5--;
          } else if (j.r()) {
            j.t();
          } 
          int k = i.b("fieldIndexOffset_" + j.a(), 0);
          if (k != 0)
            j.i(k); 
        } 
        if (bool1)
          a(n1); 
        a(1.0D);
        v.a();
      } 
    } 
    System.out.println("File load time =" + ((System.currentTimeMillis() - l) / 1000.0D) + " sec.  " + n1.d() + " rows, Field Count: " + n1.size());
    return n1;
  }
  
  private boolean a(String paramString, List paramList) {
    for (j j : paramList) {
      if (j.a().equals(paramString))
        return true; 
    } 
    return false;
  }
  
  public String a(ArrayList paramArrayList, String paramString) {
    int i = 1;
    int j = paramString.indexOf("-");
    if (j > 0) {
      String str = paramString.substring(j + 1);
      paramString = paramString.substring(0, j);
      i += Integer.parseInt(str);
    } 
    for (j j1 : paramArrayList) {
      if (j1.a().equals(paramString)) {
        int k = j1.i();
        return (k - i >= 0) ? a(j1.c(k - i)) : "0";
      } 
    } 
    return "0";
  }
  
  private String a(float paramFloat) {
    return this.j.format(paramFloat);
  }
  
  public d b(String paramString) {
    d d = (d)this.b.get(paramString);
    if (d != null)
      return d; 
    d = new d();
    d.a(".", paramString);
    this.b.put(paramString, d);
    return d;
  }
  
  private int c(String paramString) {
    boolean bool = false;
    for (byte b1 = 0; b1 < paramString.length(); b1++) {
      if (paramString.charAt(b1) == '[') {
        bool = true;
      } else if (paramString.charAt(b1) == ']') {
        bool = false;
      } 
      if (bool && paramString.charAt(b1) == '|')
        return b1; 
    } 
    return -1;
  }
  
  protected String b(ArrayList paramArrayList, String paramString) {
    int i = c(paramString);
    if (i == -1)
      return paramString; 
    boolean bool = (i < paramString.indexOf(".")) ? true : false;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    if (bool) {
      str1 = paramString.substring(i + 1, paramString.indexOf("]"));
      str1 = a(str1, "]", "");
      str2 = paramString.substring(0, i);
      str2 = a(str2, "[", "");
      str3 = paramString.substring(0, paramString.indexOf(str2) - 1);
      str4 = paramString.substring(paramString.indexOf(str1) + str1.length() + 1, paramString.length());
    } else {
      str1 = paramString.substring(0, i);
      str2 = paramString.substring(i + 1);
      str1 = a(str1, "[", "");
      str2 = a(str2, "]", "");
      str3 = paramString.substring(0, paramString.indexOf(str1) - 1);
      str4 = paramString.substring(paramString.indexOf(str2) + str2.length() + 1, paramString.length());
    } 
    d d = b(str1);
    return str3 + d.a(a(paramArrayList, str2)) + str4;
  }
  
  private boolean a(Exception paramException, String paramString) {
    if (this.c.get(paramException.getMessage()) == null) {
      this.c.put(paramException.getMessage(), paramException);
      paramException.printStackTrace();
      if (this.f != null && this.a < 3) {
        if (paramString == null || paramString.equals(""))
          paramString = paramException.getMessage(); 
        paramString = paramString + "\nFurther occurances of this error will be supressed.";
        k.a(paramString, this.f);
        this.a++;
        return true;
      } 
    } 
    return false;
  }
  
  private Float a(String paramString1, String paramString2) {
    double d = 0.0D;
    if (paramString2 != null && !paramString2.equals(""))
      try {
        d = Double.parseDouble(paramString2);
      } catch (Exception exception) {} 
    paramString1 = a(paramString1, "logVal", paramString2);
    String str = "";
    str = str + e.a(paramString1);
    int i = str.indexOf('.');
    if (i != -1 && str.length() - i > 3)
      str = str.substring(0, i + 4); 
    return Float.valueOf(Float.parseFloat(str));
  }
  
  private j[] b(ArrayList paramArrayList) {
    String[] arrayOfString = i.f("APPEND_FIELD_");
    ArrayList<j> arrayList1 = new ArrayList();
    ArrayList<j> arrayList2 = new ArrayList();
    int i;
    for (i = 0; i < arrayOfString.length; i++) {
      String str = arrayOfString[i];
      if (str.length() > "APPEND_FIELD_".length()) {
        j j = new j(str.substring("APPEND_FIELD_".length(), str.length()));
        String str1 = i.b(str);
        try {
          str1 = g.a().c(str1);
          j.c(str1);
          if (h.b.a().b(j.a()))
            arrayList2.add(j); 
        } catch (Exception exception) {
          D.a("Unable to map fields for formula: " + str1);
        } 
      } 
    } 
    for (d d : f.a().b()) {
      List<? extends j> list = d.a(paramArrayList);
      arrayList2.addAll(list);
    } 
    i = arrayList2.size();
    for (byte b1 = 0; b1 < i && arrayList2.size() > 0; b1++) {
      for (byte b2 = 0; b2 < arrayList2.size(); b2++) {
        j j = arrayList2.get(b2);
        if (a(paramArrayList, arrayList1, j)) {
          arrayList1.add(j);
          arrayList2.remove(b2);
          b2--;
        } 
      } 
    } 
    for (j j : arrayList2)
      D.d("not loading field '" + j.a() + "', not all the dependent fields are available."); 
    return arrayList1.<j>toArray(new j[arrayList1.size()]);
  }
  
  private boolean a(ArrayList paramArrayList1, ArrayList paramArrayList2, j paramj) {
    try {
      if (paramj.a().equals("AFR") || paramj.a().equals("Lambda"))
        return true; 
      String str = paramj.j();
      a a = d.a().a(str);
      String[] arrayOfString = a.b();
      for (byte b1 = 0; b1 < arrayOfString.length; b1++) {
        if (!arrayOfString[b1].equals(paramj.a()) && !d(paramArrayList1, arrayOfString[b1]) && e(paramArrayList2, arrayOfString[b1]) == null)
          return false; 
      } 
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  private boolean d(ArrayList<j> paramArrayList, String paramString) {
    for (byte b1 = 0; b1 < paramArrayList.size(); b1++) {
      if (((j)paramArrayList.get(b1)).a().equals(paramString))
        return true; 
    } 
    return false;
  }
  
  private j e(ArrayList<j> paramArrayList, String paramString) {
    for (byte b1 = 0; b1 < paramArrayList.size(); b1++) {
      if (((j)paramArrayList.get(b1)).a().equals(paramString))
        return paramArrayList.get(b1); 
    } 
    return null;
  }
  
  private String a(String paramString1, String paramString2, String paramString3) {
    int i;
    for (i = paramString1.indexOf(paramString2); i >= 0; i = paramString1.indexOf(paramString2))
      paramString1 = paramString1.substring(0, i) + paramString3 + paramString1.substring(i + paramString2.length()); 
    return paramString1;
  }
  
  private void f() {
    for (i.b b1 : this.h)
      b1.a(); 
  }
  
  private void a(n paramn) {
    for (i.b b1 : this.h) {
      try {
        if (this.d) {
          b1.b(paramn);
          continue;
        } 
        b1.a(paramn);
      } catch (Exception exception) {
        D.a("Exception caught notifying a listener. Stack:");
        exception.printStackTrace();
      } 
    } 
  }
  
  private void a(double paramDouble) {
    for (i.b b1 : this.h) {
      try {
        b1.a(paramDouble);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } 
  }
  
  private void g() {
    for (i.b b1 : this.h)
      b1.b(); 
  }
  
  public void a(i.b paramb) {
    if (!this.h.contains(paramb))
      this.h.add(paramb); 
  }
  
  private j a(j paramj) {
    r r = n.a(paramj.a());
    if (r != null) {
      paramj.g((float)r.a());
      paramj.f((float)r.b());
      if (r.f() != -1)
        paramj.e(r.f()); 
    } 
    return paramj;
  }
  
  public static void a(int paramInt) {
    k = paramInt;
  }
  
  boolean d() {
    return this.m;
  }
  
  public void b(boolean paramBoolean) {
    this.m = paramBoolean;
  }
  
  public boolean e() {
    return this.l;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/g/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */