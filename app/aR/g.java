package aR;

import G.R;
import G.T;
import G.cu;
import T.a;
import W.aa;
import W.aj;
import aP.dd;
import aP.f;
import aP.hq;
import bH.D;
import bH.I;
import bH.X;
import d.c;
import d.e;
import d.i;
import d.k;
import d.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Properties;
import r.a;

public class g implements c, l {
  public static String a = "ecuConfigName";
  
  public static String b = "Tune_File_Path";
  
  public static String c = "OutputChannel_Name";
  
  public static String d = "loadCalFile";
  
  k e = null;
  
  public String a() {
    return d;
  }
  
  public String b() {
    return "Load Tune or Partial Tune";
  }
  
  public String c() {
    return "Other Actions";
  }
  
  public boolean d() {
    return true;
  }
  
  public void a(Properties paramProperties) {
    R r;
    String str1 = paramProperties.getProperty(a);
    String str2 = paramProperties.getProperty(b, null);
    if (str2 == null)
      throw new e(b + " is required"); 
    if (str1 == null || str1.isEmpty()) {
      r = T.a().c();
    } else {
      r = T.a().c(str1);
    } 
    if (r == null) {
      if (str1 == null)
        throw new e("Configuration Name not found: " + str1); 
      throw new e("No working configuration and no config name requested");
    } 
    f.a().a(dd.a().c(), r, str2);
  }
  
  public void b(Properties paramProperties) {
    R r;
    String str1 = paramProperties.getProperty(a);
    String str2 = paramProperties.getProperty(b, null);
    if (str2 == null)
      throw new e(b + " is required"); 
    if (str1 == null || str1.isEmpty()) {
      r = T.a().c();
    } else {
      r = T.a().c(str1);
    } 
    if (r == null) {
      if (str1 == null)
        throw new e("Configuration Name not found: " + str1); 
      throw new e("No working configuration and no config name requested");
    } 
    File file = new File(str2);
    if (!file.exists())
      throw new e("Tune File not found."); 
    String str3 = paramProperties.getProperty(c);
    if (str3 != null && !str3.isEmpty()) {
      if (str3.contains(" ") || X.f(str3))
        throw new e("Output Channel Name cannot contain special characters!"); 
      if (I.a(str3.substring(0, 1)))
        throw new e("Output Channel Name cannot start with a number!"); 
    } 
  }
  
  public k e() {
    if (this.e == null) {
      this.e = new k();
      i i1 = new i(a, "");
      i1.a("Target Controller");
      i1.a(0);
      ArrayList<String> arrayList = new ArrayList();
      String[] arrayOfString = T.a().d();
      arrayList.add("");
      for (String str : arrayOfString)
        arrayList.add(str); 
      i1.a(arrayList);
      i1.c("Select the Controller your want the tune file loaded to. If blank will always load toe the Primary Configuration.");
      this.e.a(i1);
      i i2 = new i(b, "");
      i2.a("Path to tune file");
      i2.a(7);
      i2.c("Set the full Path to the file you would like loaded when this action is triggered.");
      this.e.a(i2);
      i i3 = new i(c, "");
      i3.a(1);
      i3.c("Optional: Set an OutputChannel name to represent the state of match between your tune file and the current values. If set, there will be an OutputChannel: AppEvents.[YourOutputChannelName]. This channel will be 1.0 if the current settings match those in the partial tune file, 0 if any settings do not match.");
      this.e.a(i3);
    } 
    return this.e;
  }
  
  public boolean f() {
    return true;
  }
  
  public boolean g() {
    return true;
  }
  
  public void c(Properties paramProperties) {
    String str1 = paramProperties.getProperty(a);
    String str2 = paramProperties.getProperty(b);
    String str3 = paramProperties.getProperty(c);
    if (str3 != null && !str3.isEmpty()) {
      File file = new File(str2);
      if (file.exists()) {
        if (str1 == null || str1.isEmpty())
          if (T.a().c().c() != null) {
            str1 = T.a().c().c();
          } else {
            D.a("Failed to inialize Channel " + str3 + ", Controller not found: " + str1);
            return;
          }  
        R r1 = T.a().c(str1);
        if (r1 == null && T.a().c() != null)
          r1 = T.a().c(); 
        if (r1 == null) {
          String str = "Failed to inialize tune match monitoring " + str3 + ", Controller not found: " + str1;
          hq.a().a(str);
          return;
        } 
        R r2 = r1.a();
        aa aa = new aa();
        aa.a(true);
        try {
          aa.a(r2, str2);
        } catch (V.g g1) {
          String str = "Failed to inialize tune match monitoring! file: " + str2 + ", error: " + g1;
          D.d(str);
          hq.a().a(str);
          return;
        } catch (aj aj) {
          D.a("Password error opening tune file: " + str2);
          return;
        } 
        cu.a().d(str3);
        if (file.getName().toLowerCase().endsWith(a.cw)) {
          a.a().a(str1, r2, null, str3);
          D.d("Started full cal monitor on channel: " + str3);
        } else {
          a.a().a(str1, r2, aa.a(), str3);
          D.d("Started cal monitor on channel: " + str3);
        } 
      } else {
        D.b("Failed to inialize Channel " + str3 + ", Tune File not found: " + str2);
        return;
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aR/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */