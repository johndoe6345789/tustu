package ak;

import V.a;
import V.f;
import W.T;
import W.X;
import W.ah;
import W.m;
import bH.X;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class aJ extends g {
  List a = new ArrayList();
  
  boolean b = true;
  
  boolean H = false;
  
  public aJ() {
    super(",", false);
    this.a.add(",");
    this.a.add(";");
    this.a.add("\",\"");
  }
  
  public String i() {
    return X.E;
  }
  
  protected int b(String paramString) {
    String str = "";
    byte b = 0;
    ah ah = null;
    try {
      this.h = new File(paramString);
      FileInputStream fileInputStream = new FileInputStream(this.h);
      ah = new ah(new InputStreamReader(fileInputStream));
      str = ah.a();
      while (str != null && !str.startsWith("Marker")) {
        str = ah.a();
        if (str.startsWith(",TIME") || str.startsWith(",MARKE"))
          break; 
        b++;
      } 
      l(a(ah.a(), this.a));
      return b;
    } catch (FileNotFoundException fileNotFoundException) {
      throw new a("Unable to open file for reading:\n" + paramString);
    } catch (IOException iOException) {
      throw new a("Unable to read from file:\n" + paramString);
    } finally {
      if (ah != null)
        try {
          ah.close();
        } catch (IOException iOException) {
          Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, iOException);
        }  
    } 
  }
  
  public Iterator b() {
    String str = null;
    ArrayList<String> arrayList = new ArrayList();
    HashSet<String> hashSet = new HashSet();
    if (this.g.isEmpty()) {
      ArrayList<String> arrayList4;
      try {
        while (!b_(str = l()))
          arrayList.add(str); 
        a(true);
      } catch (IOException iOException) {
        iOException.printStackTrace();
        throw new a("IO Error reading header rows from file.");
      } catch (a a) {
        a.printStackTrace();
        throw new a("No Valid Data found in file");
      } 
      byte b1 = 0;
      if (arrayList.size() == 4)
        b1++; 
      ArrayList<String> arrayList2 = new ArrayList(Arrays.asList((Object[])((String)arrayList.get(b1++)).split(Pattern.quote(r()))));
      ArrayList<String> arrayList3 = new ArrayList(Arrays.asList((Object[])((String)arrayList.get(b1++)).split(Pattern.quote(r()))));
      if (arrayList.size() > b1) {
        arrayList4 = new ArrayList(Arrays.asList((Object[])((String)arrayList.get(b1++)).split(Pattern.quote(r()))));
      } else {
        arrayList4 = new ArrayList();
        for (byte b = 0; b < arrayList3.size(); b++) {
          if (((String)arrayList3.get(b)).contains("(") && ((String)arrayList3.get(b)).contains(")")) {
            String str2 = arrayList3.get(b);
            arrayList4.add(str2.substring(str2.indexOf("(") + 1, str2.indexOf(")")));
            arrayList3.set(b, str2.substring(0, str2.indexOf("(")));
          } else {
            arrayList4.add("");
          } 
        } 
      } 
      int i = (arrayList2.size() > arrayList3.size()) ? arrayList2.size() : arrayList3.size();
      int j;
      for (j = arrayList2.size(); j < i; j++)
        arrayList2.add(""); 
      for (j = arrayList3.size(); j < i; j++)
        arrayList3.add(""); 
      for (j = arrayList4.size(); j < i; j++)
        arrayList4.add(""); 
      String str1 = "TIME STAMP";
      byte b2 = 1;
      for (byte b3 = 0; b3 < i; b3++) {
        if (!this.H && (((String)arrayList2.get(b3)).toUpperCase().startsWith("GROUP") || ((String)arrayList2.get(b3)).toUpperCase().startsWith("PID"))) {
          arrayList2.set(b3, arrayList3.get(b3));
        } else if (!((String)arrayList3.get(b3)).isEmpty()) {
          arrayList2.set(b3, (String)arrayList2.get(b3) + " " + (String)arrayList3.get(b3));
        } 
        d d = new d();
        if (b3 == 0) {
          arrayList2.set(b3, (String)arrayList2.get(b3) + (String)arrayList4.get(b3));
          arrayList4.set(b3, "");
        } else if (b3 == 1) {
          str1 = arrayList2.get(b3);
          arrayList2.set(b3, (String)arrayList2.get(b3) + " " + (String)arrayList4.get(b3));
          arrayList4.set(b3, "s");
        } else if (str1.equals(arrayList2.get(b3))) {
          arrayList2.set(b3, (String)arrayList2.get(b3) + (((String)arrayList4.get(b3)).isEmpty() ? "" : (" " + (String)arrayList4.get(b3))) + b2++);
          arrayList4.set(b3, "s");
        } 
        String str2 = ((String)arrayList2.get(b3)).trim();
        if (!hashSet.add(str2))
          str2 = str2 + " " + (b2 - 1); 
        d.a(str2);
        d.b(((String)arrayList4.get(b3)).trim());
        this.g.add(d);
      } 
    } 
    for (d d : this.g)
      d.a(m(d.a())); 
    ArrayList<T> arrayList1 = new ArrayList();
    Iterator<T> iterator = this.g.iterator();
    while (iterator.hasNext())
      arrayList1.add(iterator.next()); 
    this.p = 0;
    return arrayList1.iterator();
  }
  
  private String m(String paramString) {
    paramString = X.b(paramString, " - ", " ");
    paramString = X.b(paramString, "-", " ");
    paramString = X.b(paramString, "(", "");
    return X.b(paramString, ")", "");
  }
  
  protected String l() {
    if (p()) {
      a(false);
    } else {
      this.o = this.n;
      do {
        this.n = this.e.a();
        if (this.n == null || !this.n.startsWith(r()) || !b_(this.n))
          continue; 
        this.n = "0" + this.n;
      } while (this.n != null && this.n.isEmpty());
      this.p++;
      if (this.o == null)
        throw new f("No records available."); 
      if (this.g.size() > 0 && this.o.trim().equals("")) {
        this.o = "MARK Corrupt file blank record";
        System.out.println("Found a bad row");
      } 
      if (this.p < 2)
        this.b = this.n.startsWith(r()); 
    } 
    return this.o;
  }
  
  protected String a(String paramString, boolean paramBoolean) {
    paramString = super.a(paramString, paramBoolean);
    if (paramString.contains(":")) {
      String str1 = paramString.substring(0, paramString.indexOf(":"));
      str1 = str1.substring(0, str1.lastIndexOf(r()) + 1);
      String str2 = paramString.substring(paramString.indexOf(":") + 1);
      paramString = str1 + str2;
    } 
    return paramString;
  }
  
  protected void e(String paramString) {
    if (this.b && paramString.contains(r()) && !paramString.startsWith("0" + this.f)) {
      a(true);
      this.o = this.o.substring(1);
      throw new m(paramString.substring(0, paramString.indexOf(r())), false);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/aJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */