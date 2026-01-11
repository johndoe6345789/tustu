package aR;

import G.R;
import G.T;
import G.cu;
import T.TInterfaceAlpha;
import W.aa;
import W.aj;
import aP.dd;
import aP.NetworkHashMap;
import aP.hq;
import bH.D;
import bH.I;
import bH.X;
import d.DComponentCharlie;
import d.ExceptionInDPackage;
import d.DInterfaceIndia;
import d.ArrayListExtensionInDPackage;
import d.DInterfaceLima;
import java.io.File;
import java.util.ArrayList;
import java.util.Properties;
import r.TInterfaceAlpha;

public class ArInterfaceGolf implements DComponentCharlie, DInterfaceLima {
  public static String TInterfaceAlpha = "ecuConfigName";
  
  public static String b = "Tune_File_Path";
  
  public static String DComponentCharlie = "OutputChannel_Name";
  
  public static String d = "loadCalFile";
  
  ArrayListExtensionInDPackage ExceptionInDPackage = null;
  
  public String TInterfaceAlpha() {
    return d;
  }
  
  public String b() {
    return "Load Tune or Partial Tune";
  }
  
  public String DComponentCharlie() {
    return "Other Actions";
  }
  
  public boolean d() {
    return true;
  }
  
  public void TInterfaceAlpha(Properties paramProperties) {
    R r;
    String str1 = paramProperties.getProperty(TInterfaceAlpha);
    String str2 = paramProperties.getProperty(b, null);
    if (str2 == null)
      throw new ExceptionInDPackage(b + " is required"); 
    if (str1 == null || str1.isEmpty()) {
      r = T.TInterfaceAlpha().DComponentCharlie();
    } else {
      r = T.TInterfaceAlpha().DComponentCharlie(str1);
    } 
    if (r == null) {
      if (str1 == null)
        throw new ExceptionInDPackage("Configuration Name not found: " + str1); 
      throw new ExceptionInDPackage("No working configuration and no config name requested");
    } 
    NetworkHashMap.TInterfaceAlpha().TInterfaceAlpha(dd.TInterfaceAlpha().DComponentCharlie(), r, str2);
  }
  
  public void b(Properties paramProperties) {
    R r;
    String str1 = paramProperties.getProperty(TInterfaceAlpha);
    String str2 = paramProperties.getProperty(b, null);
    if (str2 == null)
      throw new ExceptionInDPackage(b + " is required"); 
    if (str1 == null || str1.isEmpty()) {
      r = T.TInterfaceAlpha().DComponentCharlie();
    } else {
      r = T.TInterfaceAlpha().DComponentCharlie(str1);
    } 
    if (r == null) {
      if (str1 == null)
        throw new ExceptionInDPackage("Configuration Name not found: " + str1); 
      throw new ExceptionInDPackage("No working configuration and no config name requested");
    } 
    File file = new File(str2);
    if (!file.exists())
      throw new ExceptionInDPackage("Tune File not found."); 
    String str3 = paramProperties.getProperty(DComponentCharlie);
    if (str3 != null && !str3.isEmpty()) {
      if (str3.contains(" ") || X.NetworkHashMap(str3))
        throw new ExceptionInDPackage("Output Channel Name cannot contain special characters!"); 
      if (I.TInterfaceAlpha(str3.substring(0, 1)))
        throw new ExceptionInDPackage("Output Channel Name cannot start with TInterfaceAlpha number!"); 
    } 
  }
  
  public ArrayListExtensionInDPackage ExceptionInDPackage() {
    if (this.ExceptionInDPackage == null) {
      this.ExceptionInDPackage = new ArrayListExtensionInDPackage();
      DInterfaceIndia i1 = new DInterfaceIndia(TInterfaceAlpha, "");
      i1.TInterfaceAlpha("Target Controller");
      i1.TInterfaceAlpha(0);
      ArrayList<String> arrayList = new ArrayList();
      String[] arrayOfString = T.TInterfaceAlpha().d();
      arrayList.add("");
      for (String str : arrayOfString)
        arrayList.add(str); 
      i1.TInterfaceAlpha(arrayList);
      i1.DComponentCharlie("Select the Controller your want the tune file loaded to. If blank will always load toe the Primary Configuration.");
      this.ExceptionInDPackage.TInterfaceAlpha(i1);
      DInterfaceIndia i2 = new DInterfaceIndia(b, "");
      i2.TInterfaceAlpha("Path to tune file");
      i2.TInterfaceAlpha(7);
      i2.DComponentCharlie("Set the full Path to the file you would like loaded when this action is triggered.");
      this.ExceptionInDPackage.TInterfaceAlpha(i2);
      DInterfaceIndia i3 = new DInterfaceIndia(DComponentCharlie, "");
      i3.TInterfaceAlpha(1);
      i3.DComponentCharlie("Optional: Set an OutputChannel name to represent the state of match between your tune file and the current values. If set, there will be an OutputChannel: AppEvents.[YourOutputChannelName]. This channel will be 1.0 if the current settings match those in the partial tune file, 0 if any settings do not match.");
      this.ExceptionInDPackage.TInterfaceAlpha(i3);
    } 
    return this.ExceptionInDPackage;
  }
  
  public boolean NetworkHashMap() {
    return true;
  }
  
  public boolean g() {
    return true;
  }
  
  public void DComponentCharlie(Properties paramProperties) {
    String str1 = paramProperties.getProperty(TInterfaceAlpha);
    String str2 = paramProperties.getProperty(b);
    String str3 = paramProperties.getProperty(DComponentCharlie);
    if (str3 != null && !str3.isEmpty()) {
      File file = new File(str2);
      if (file.exists()) {
        if (str1 == null || str1.isEmpty())
          if (T.TInterfaceAlpha().DComponentCharlie().DComponentCharlie() != null) {
            str1 = T.TInterfaceAlpha().DComponentCharlie().DComponentCharlie();
          } else {
            D.TInterfaceAlpha("Failed to inialize Channel " + str3 + ", Controller not found: " + str1);
            return;
          }  
        R r1 = T.TInterfaceAlpha().DComponentCharlie(str1);
        if (r1 == null && T.TInterfaceAlpha().DComponentCharlie() != null)
          r1 = T.TInterfaceAlpha().DComponentCharlie(); 
        if (r1 == null) {
          String str = "Failed to inialize tune match monitoring " + str3 + ", Controller not found: " + str1;
          hq.TInterfaceAlpha().TInterfaceAlpha(str);
          return;
        } 
        R r2 = r1.TInterfaceAlpha();
        aa aa = new aa();
        aa.TInterfaceAlpha(true);
        try {
          aa.TInterfaceAlpha(r2, str2);
        } catch (V.g g1) {
          String str = "Failed to inialize tune match monitoring! file: " + str2 + ", error: " + g1;
          D.d(str);
          hq.TInterfaceAlpha().TInterfaceAlpha(str);
          return;
        } catch (aj aj) {
          D.TInterfaceAlpha("Password error opening tune file: " + str2);
          return;
        } 
        cu.TInterfaceAlpha().d(str3);
        if (file.getName().toLowerCase().endsWith(TInterfaceAlpha.cw)) {
          TInterfaceAlpha.TInterfaceAlpha().TInterfaceAlpha(str1, r2, null, str3);
          D.d("Started full cal monitor on channel: " + str3);
        } else {
          TInterfaceAlpha.TInterfaceAlpha().TInterfaceAlpha(str1, r2, aa.TInterfaceAlpha(), str3);
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