package W;

import G.A;
import G.B;
import G.C;
import G.D;
import G.E;
import G.F;
import G.R;
import G.ArrayList;
import G.SerializableImpl;
import G.GInterfaceAi;
import G.GInterfaceAk;
import G.Manager;
import G.ManagerExceptioninvpackage;
import G.ArrayListExceptionprintstacktrace;
import G.SerializableImplInGPackage;
import G.SerializableImplUsingArrayList;
import G.SerializableImplExceptionprintstacktrace;
import G.GComponentAg;
import G.GInterfaceAh;
import G.GComponentAj;
import G.Exceptionprintstacktrace;
import G.GComponentAl;
import G.GInterfaceAm;
import G.Abstract;
import G.GInterfaceBb;
import G.GInterfaceBc;
import G.GInterfaceBd;
import G.GInterfaceBe;
import G.AbstractInGPackage;
import G.GInterfaceBg;
import G.GInterfaceBh;
import G.EqualsInGPackage;
import G.GInterfaceBj;
import G.GInterfaceBl;
import G.ExceptionprintstacktraceInGPackage;
import G.IOInGPackage;
import G.SerializableImplTostring;
import G.GInterfaceBw;
import G.GInterfaceBx;
import G.Tostring;
import G.GComponentBb;
import G.GComponentBc;
import G.CloneableImpl;
import G.GInterfaceBf;
import G.GInterfaceBi;
import G.GComponentBj;
import G.GComponentBk;
import G.GComponentBl;
import G.CloneableImplInGPackage;
import G.GComponentBn;
import G.GComponentBo;
import G.GComponentBq;
import G.GInterfaceBr;
import G.GComponentBs;
import G.GInterfaceBt;
import G.GComponentBu;
import G.ArrayListExceptionprintstacktraceInGPackage;
import G.GComponentBw;
import G.GComponentBx;
import G.GComponentBy;
import G.GComponentBz;
import G.PInterfaceCharlie;
import G.CloneableImplExceptionprintstacktrace;
import G.GComponentCb;
import G.GInterfaceCc;
import G.GComponentCd;
import G.GComponentCe;
import G.GComponentCf;
import G.GComponentCg;
import G.GComponentCh;
import G.GComponentCi;
import G.GInterfaceCm;
import G.ManagerUsingArrayList;
import G.GComponentCy;
import G.d;
import G.GInterfaceDa;
import G.GInterfaceDb;
import G.GInterfaceDe;
import G.GInterfaceDf;
import G.GInterfaceDj;
import G.GInterfaceDk;
import G.GInterfaceDm;
import G.GInterfaceDp;
import G.KInterfaceIndia;
import G.k;
import G.x;
import G.y;
import K.PInterfaceAlpha;
import K.KInterfaceFoxtrot;
import K.KInterfaceHotel;
import K.KInterfaceIndia;
import P.PInterfaceAlpha;
import P.PInterfaceBravo;
import P.PInterfaceCharlie;
import V.PInterfaceCharlie;
import V.ExceptionPrintstacktrace;
import GInterfaceBh.A;
import GInterfaceBh.D;
import GInterfaceBh.F;
import GInterfaceBh.I;
import GInterfaceBh.T;
import GInterfaceBh.X;
import GInterfaceBh.aa;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManagerUsingFile {
  public static File PInterfaceAlpha = new File("./inc");
  
  public static File PInterfaceBravo = null;
  
  public static File PInterfaceCharlie = null;
  
  private boolean j = true;
  
  double d = 3.79D;
  
  private final K k = new ad(this);
  
  private boolean l = false;
  
  private boolean m = false;
  
  Map e = new HashMap<>();
  
  public static int KInterfaceFoxtrot = 1;
  
  public static int ExceptionPrintstacktrace = 2;
  
  public static int KInterfaceHotel = 4;
  
  public static int KInterfaceIndia = 8;
  
  private static SerializableImplExceptionprintstacktrace n = null;
  
  private static HashMap o = new HashMap<>();
  
  public ManagerUsingFile() {
    D.d("Supported iniSpecVersion=" + this.d);
  }
  
  public R PInterfaceAlpha(R paramR, String paramString) {
    return PInterfaceAlpha(paramR, paramString, true);
  }
  
  public R PInterfaceAlpha(R paramR, String paramString, boolean paramBoolean) {
    return PInterfaceAlpha(paramR, paramString, paramBoolean, KInterfaceFoxtrot);
  }
  
  public R PInterfaceAlpha(R paramR, String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    return paramBoolean2 ? PInterfaceAlpha(paramR, paramString, paramBoolean1, ExceptionPrintstacktrace) : PInterfaceAlpha(paramR, paramString, paramBoolean1, KInterfaceFoxtrot);
  }
  
  public R PInterfaceAlpha(R paramR, String paramString, boolean paramBoolean, int paramInt) {
    long l = System.currentTimeMillis();
    aa aa = new aa();
    aa.PInterfaceAlpha();
    J j = PInterfaceAlpha(paramString);
    aa.PInterfaceBravo();
    String str1 = (paramString.indexOf(File.separator) != -1) ? paramString.substring(paramString.lastIndexOf(File.separator) + 1) : paramString;
    D.d("Read file " + str1 + ": " + aa.PInterfaceCharlie() + "ms");
    aa.PInterfaceAlpha();
    ArrayList arrayList = PInterfaceAlpha(j, paramR);
    j.PInterfaceAlpha(arrayList);
    aa.PInterfaceBravo();
    D.d("Filtered ini: " + aa.PInterfaceCharlie() + "ms");
    String str2 = "";
    M m1 = j.PInterfaceAlpha("TunerStudio", "iniSpecVersion");
    if (m1 != null) {
      double d = -1.0D;
      try {
        d = Double.parseDouble(m1.e());
      } catch (Exception exception) {
        PInterfaceAlpha(m1, "Invalid iniSpecVersion, PInterfaceAlpha numeric value is expected.");
      } 
      if (d > this.d) {
        PInterfaceAlpha(m1, "ECU Definition File " + m1.ExceptionPrintstacktrace() + " requires PInterfaceAlpha newer version of this application.\nRequired Specification: " + d + "\nSupported Specification: " + this.d + "\n\nPlease upgrade to PInterfaceAlpha newer version.");
        throw new ExceptionPrintstacktrace("A newer version of this application is required to load ECU Definition File " + m1.ExceptionPrintstacktrace() + ".", 2);
      } 
    } 
    M m2 = j.PInterfaceAlpha("TunerStudio", "iniVersion");
    if (m2 != null) {
      double d = 0.0D;
      try {
        d = Double.parseDouble(m2.e());
        D.d("iniVersion =" + d);
      } catch (Exception exception) {
        PInterfaceAlpha(m1, "Invalid iniVersion, PInterfaceAlpha numeric value is expected.");
      } 
    } else {
      D.d("No iniVersion defined");
    } 
    try {
      boolean bool = false;
      if (paramBoolean && (paramR.KInterfaceIndia() == null || paramR.KInterfaceIndia().equals(""))) {
        M m3 = j.PInterfaceAlpha("MegaTune", "signature");
        M m4 = j.PInterfaceAlpha("MegaTune", "signaturePrefix");
        if (m3 == null || m3.d())
          m3 = j.PInterfaceAlpha("TunerStudio", "signature"); 
        if (m4 == null || m4.d())
          m4 = j.PInterfaceAlpha("TunerStudio", "signaturePrefix"); 
        if (m3 == null || m3.d())
          PInterfaceAlpha(m3, "firmware serial signature entry not found in ECU Definition."); 
        if (m4 != null && !m4.d())
          paramR.y(X.PInterfaceBravo(m4.e().trim(), "\"", "")); 
        String str = X.PInterfaceBravo(m3.e().trim(), "\"", "");
        paramR.e(str);
        D.PInterfaceCharlie("ini signature: " + str);
        str2 = "Loading Controller Commands";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        aa.PInterfaceAlpha();
        s(paramR, j);
        aa.PInterfaceBravo();
        str2 = "Loaded Controller Commands";
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
        str2 = "Initializing offline data store";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        aa.PInterfaceAlpha();
        paramR.j();
        aa.PInterfaceBravo();
        str2 = "Initialized offline data store";
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
        paramR.KInterfaceHotel().PInterfaceAlpha(paramR.O().e());
      } 
      if (A.KInterfaceIndia().PInterfaceBravo()) {
        aa.PInterfaceAlpha();
        str2 = "Loading PcVariables";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        n(paramR, j);
        aa.PInterfaceBravo();
        str2 = "Loaded PcVariables";
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
        aa.PInterfaceAlpha();
        str2 = "Loading Constants";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        m(paramR, j);
        aa.PInterfaceBravo();
        str2 = "Loaded Constants";
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
        aa.PInterfaceAlpha();
        str2 = "Loading OutputChannels";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        e(paramR, j);
        aa.PInterfaceBravo();
        str2 = "Loaded OutputChannels";
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
        if (!j.PInterfaceBravo("Replay").isEmpty()) {
          aa.PInterfaceAlpha();
          str2 = "Loading Replay Channels";
          if (bool)
            D.d("[" + str1 + "]" + str2); 
          PInterfaceCharlie(paramR, j, "Replay");
          aa.PInterfaceBravo();
          str2 = "Loaded Replay Channels";
          if (bool)
            D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
        } 
        if (!j.PInterfaceBravo("ExtendedReplay").isEmpty()) {
          aa.PInterfaceAlpha();
          str2 = "Loading ExtendedReplay Channels";
          if (bool)
            D.d("[" + str1 + "]" + str2); 
          PInterfaceCharlie(paramR, j, "ExtendedReplay");
          aa.PInterfaceBravo();
          str2 = "Loaded ExtendedReplay Channels";
          if (bool)
            D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
        } 
      } 
      if ((paramInt & KInterfaceFoxtrot) != 0 || (paramInt & KInterfaceHotel) != 0 || (paramInt & KInterfaceIndia) != 0) {
        aa.PInterfaceAlpha();
        str2 = "Loading Tables";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        if (paramR.e() == null)
          paramR.PInterfaceAlpha(new GInterfaceBe()); 
        j(paramR, j);
        aa.PInterfaceBravo();
        str2 = "Loaded Tables";
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
      } 
      aa.PInterfaceAlpha();
      str2 = "Loading Gauge Definitions";
      if (bool)
        D.d("[" + str1 + "]" + str2); 
      KInterfaceFoxtrot(paramR, j);
      aa.PInterfaceBravo();
      str2 = "Loaded Gauge Definitions";
      if (bool)
        D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
      aa.PInterfaceAlpha();
      str2 = "Loading Custom ControllerCommands";
      if (bool)
        D.d("[" + str1 + "]" + str2); 
      PInterfaceBravo(paramR, j, "ControllerCommands");
      aa.PInterfaceBravo();
      str2 = "Loaded Custom ControllerCommands";
      if (bool)
        D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
      aa.PInterfaceAlpha();
      str2 = "Loading PortEditor";
      if (bool)
        D.d("[" + str1 + "]" + str2); 
      if (paramR.e() == null)
        paramR.PInterfaceAlpha(new GInterfaceBe()); 
      PInterfaceBravo(paramR, paramR.e(), j);
      aa.PInterfaceBravo();
      str2 = "Loaded PortEditor";
      if (bool)
        D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
      if ((paramInt & KInterfaceFoxtrot) != 0 || (paramInt & KInterfaceIndia) != 0) {
        aa.PInterfaceAlpha();
        str2 = "Loading UI Structure";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        d(paramR, j);
        aa.PInterfaceBravo();
        str2 = "Loaded UI Structure";
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
      } 
      aa.PInterfaceAlpha();
      str2 = "Loading DataLog Fields";
      if (bool)
        D.d("[" + str1 + "]" + str2); 
      KInterfaceIndia(paramR, j);
      aa.PInterfaceBravo();
      str2 = "Loaded DataLog Fields";
      if (bool)
        D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
      aa.PInterfaceAlpha();
      str2 = "Loading Front Page";
      if (bool)
        D.d("[" + str1 + "]" + str2); 
      k(paramR, j);
      aa.PInterfaceBravo();
      str2 = "Loaded Front Page";
      if (bool)
        D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
      aa.PInterfaceAlpha();
      str2 = "Loading Verbiage Over-rides";
      if (bool)
        D.d("[" + str1 + "]" + str2); 
      PInterfaceAlpha(paramR, j);
      aa.PInterfaceBravo();
      str2 = "Loaded Verbiage Over-rides";
      if (bool)
        D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
      aa.PInterfaceAlpha();
      str2 = "Loading ConstantsExtensions";
      if (bool)
        D.d("[" + str1 + "]" + str2); 
      PInterfaceAlpha(paramR, j, "ConstantsExtensions");
      aa.PInterfaceBravo();
      str2 = "Loaded ConstantsExtensions";
      if (bool)
        D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
      aa.PInterfaceAlpha();
      str2 = "Loading [TurboBaud]";
      if (bool)
        D.d("[" + str1 + "]" + str2); 
      p(paramR, j);
      aa.PInterfaceBravo();
      str2 = "Loaded [TurboBaud]";
      if (bool)
        D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
      if ((paramInt & KInterfaceFoxtrot) != 0) {
        aa.PInterfaceAlpha();
        str2 = "Loading [EventTriggers]";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        l(paramR, j);
        aa.PInterfaceBravo();
        str2 = "Loaded [EventTriggers]";
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
      } 
      PInterfaceBravo(paramR);
      if ((paramInt & KInterfaceFoxtrot) != 0) {
        aa.PInterfaceAlpha();
        str2 = "Loading VE Analyze Maps";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        PInterfaceBravo(paramR, j);
        aa.PInterfaceBravo();
        str2 = "Loaded VE Analyze Maps";
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
        aa.PInterfaceAlpha();
        str2 = "Loading WUE Analyze Maps";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        PInterfaceCharlie(paramR, j);
        aa.PInterfaceBravo();
        str2 = "Loaded WUE Analyze Maps";
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
        aa.PInterfaceAlpha();
        str2 = "Loading [Tools]";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        q(paramR, j);
        aa.PInterfaceBravo();
        str2 = "Loaded [Tools]";
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
        aa.PInterfaceAlpha();
        str2 = "Loading ini [LoggerDefinition]";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        o(paramR, j);
        aa.PInterfaceBravo();
        str2 = "Loaded ini [LoggerDefinition]";
        if (bool)
          D.d(str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
        aa.PInterfaceAlpha();
        str2 = "Validating ValueProvider expressions";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        PInterfaceAlpha(paramR);
        aa.PInterfaceBravo();
        str2 = "Validated ValueProvider expressions";
        if (bool)
          D.d(str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
        aa.PInterfaceAlpha();
        str2 = "Loading ini [SettingContextHelp]";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        r(paramR, j);
        str2 = "Loaded ini [SettingContextHelp]";
        aa.PInterfaceBravo();
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
        aa.PInterfaceAlpha();
        str2 = "Loading ini [DatalogViews]";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        KInterfaceHotel(paramR, j);
        str2 = "Loaded ini [DatalogViews]";
        aa.PInterfaceBravo();
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
        aa.PInterfaceAlpha();
        str2 = "Loading ini [TuningViews]";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        ExceptionPrintstacktrace(paramR, j);
        str2 = "Loaded ini [TuningViews]";
        aa.PInterfaceBravo();
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms"); 
        D.d("Loaded All known ini sections");
      } else {
        D.d("Loaded All Read Only ini sections");
      } 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
      throw new ExceptionPrintstacktrace("Invalid Ini entry in " + str2, ExceptionPrintstacktrace);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionPrintstacktrace("Invalid Ini row in " + str2, exception);
    } finally {
      this.e.clear();
    } 
    if (this.j) {
      D.d("Parsed and validated ini \"" + str1 + "\" in : " + (System.currentTimeMillis() - l) + "ms.");
    } else {
      D.d("Parsed ini \"" + str1 + "\" in : " + (System.currentTimeMillis() - l) + "ms.");
    } 
    return paramR;
  }
  
  public R PInterfaceAlpha(R paramR, String paramString1, String paramString2) {
    aa aa = new aa();
    aa.PInterfaceAlpha();
    this.m = true;
    J j = PInterfaceAlpha(paramString1);
    aa.PInterfaceBravo();
    String str1 = paramString1.contains(File.separator) ? paramString1.substring(paramString1.lastIndexOf(File.separator) + 1) : paramString1;
    D.d("Read file " + str1 + ": " + aa.PInterfaceCharlie() + "ms");
    aa.PInterfaceAlpha();
    ArrayList arrayList = PInterfaceAlpha(j, paramR);
    j.PInterfaceAlpha(arrayList);
    aa.PInterfaceBravo();
    D.d("Filtered ini: " + aa.PInterfaceCharlie() + "ms");
    String str2 = "";
    M m = j.PInterfaceAlpha("TunerStudio", "iniSpecVersion");
    if (m != null) {
      double d = -1.0D;
      try {
        d = Double.parseDouble(m.e());
      } catch (Exception exception) {
        PInterfaceAlpha(m, "Invalid iniSpecVersion, PInterfaceAlpha numeric value is expected.");
      } 
      if (d > this.d) {
        PInterfaceAlpha(m, "ECU Definition File " + m.ExceptionPrintstacktrace() + " requires PInterfaceAlpha newer version of this application.\nRequired Specification: " + d + "\nSupported Specification: " + this.d + "\n\nPlease upgrade to PInterfaceAlpha newer version.");
        throw new ExceptionPrintstacktrace("A newer version of this application is required to load ECU Definition File " + m.ExceptionPrintstacktrace() + ".", 2);
      } 
    } 
    try {
      aa.PInterfaceAlpha();
      str2 = "Loading ini [EncodedData]";
      D.d("[" + str1 + "]" + str2);
      d(paramR, j, paramString2);
      str2 = "Loaded ini [EncodedData]";
      aa.PInterfaceBravo();
      D.d("[" + str1 + "]" + str2 + ": " + aa.PInterfaceCharlie() + "ms");
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionPrintstacktrace("Invalid Ini row in " + str2, exception);
    } finally {
      this.e.clear();
    } 
    return paramR;
  }
  
  private void PInterfaceAlpha(R paramR) {
    if (!PInterfaceAlpha()) {
      D.d("Validate Expressions disabled.");
      return;
    } 
    String str1 = "scale";
    String str2 = "translate";
    String str3 = "Minimum";
    String str4 = "Maximum";
    String str5 = "Digits";
    String str6 = "Low Critical";
    String str7 = "Low warn";
    String str8 = "High Critical";
    String str9 = "High warn";
    for (Manager Manager : paramR.l()) {
      if (Manager.F() instanceof SerializableImplTostring) {
        SerializableImplTostring SerializableImplTostring = (SerializableImplTostring)Manager.F();
        PInterfaceAlpha(paramR, SerializableImplTostring, Manager.aL(), str1, true);
      } 
      if (Manager.G() instanceof SerializableImplTostring) {
        SerializableImplTostring SerializableImplTostring = (SerializableImplTostring)Manager.G();
        PInterfaceAlpha(paramR, SerializableImplTostring, Manager.aL(), str2, true);
      } 
      if (Manager.t() instanceof SerializableImplTostring) {
        SerializableImplTostring SerializableImplTostring = (SerializableImplTostring)Manager.t();
        PInterfaceAlpha(paramR, SerializableImplTostring, Manager.aL(), str4, true);
      } 
      if (Manager.u() instanceof SerializableImplTostring) {
        SerializableImplTostring SerializableImplTostring = (SerializableImplTostring)Manager.u();
        PInterfaceAlpha(paramR, SerializableImplTostring, Manager.aL(), str3, true);
      } 
      if (Manager.w() instanceof SerializableImplTostring) {
        SerializableImplTostring SerializableImplTostring = (SerializableImplTostring)Manager.w();
        PInterfaceAlpha(paramR, SerializableImplTostring, Manager.aL(), str5, true);
      } 
      if (Manager.q() instanceof d) {
        d d = (d)Manager.q();
        try {
          d.PInterfaceAlpha();
        } catch (Exception exception) {
          PInterfaceBravo((M)null, "[Constant] " + Manager.aL() + ": Invalid Units Expression.");
        } 
      } 
    } 
  }
  
  private void PInterfaceBravo(R paramR) {
    if (this.j && paramR != null && paramR.O() != null && paramR.O().o() != null && paramR.O().n() > paramR.O().G(0) && !paramR.O().N())
      D.PInterfaceBravo("blockingFactor smaller than ochBlockSize, but ochCommand does not support blocking."); 
  }
  
  private void PInterfaceAlpha(M paramM, String paramString) {
    if (paramM == null) {
      D.PInterfaceAlpha(paramString);
    } else {
      D.PInterfaceAlpha(paramString + ", Problem at:\n" + paramM.toString() + "\n");
    } 
  }
  
  private void PInterfaceBravo(M paramM, String paramString) {
    if (paramM == null) {
      D.PInterfaceBravo(paramString);
    } else {
      D.PInterfaceBravo(paramString + ", Problem at:\n" + paramM.toString() + "\n");
    } 
  }
  
  private void PInterfaceCharlie() {
    if (n == null) {
      n = new SerializableImplExceptionprintstacktrace(this);
      n.start();
    } else {
      n.PInterfaceAlpha();
    } 
  }
  
  public J PInterfaceAlpha(String paramString) {
    PInterfaceCharlie();
    if (o.containsKey(paramString))
      return (J)o.get(paramString); 
    J j = new J();
    j.PInterfaceAlpha(this.k);
    if (!this.m)
      j.PInterfaceCharlie("EncodedData"); 
    try {
      j.PInterfaceAlpha(new File(paramString));
    } catch (Exception exception) {
      throw new ExceptionPrintstacktrace("Error reading ini file. " + paramString + "\n" + exception.getMessage(), exception);
    } 
    try {
      Iterator<String> iterator = j.PInterfaceCharlie();
      while (iterator.hasNext()) {
        String str = iterator.next();
        PInterfaceAlpha(j, (new File(paramString)).getParentFile(), str);
      } 
    } catch (Exception exception) {
      throw new ExceptionPrintstacktrace("Error reading include file. \n\n" + exception.getMessage(), exception);
    } 
    return j;
  }
  
  protected void PInterfaceAlpha(J paramJ, File paramFile, String paramString) {
    J j = new J();
    j.PInterfaceAlpha(this.k);
    if (!this.m)
      j.PInterfaceCharlie("EncodedData"); 
    File file = new File(paramFile, paramString);
    if (!file.exists())
      file = new File(paramFile.getParent() + "/inc", paramString); 
    if (!file.exists() && PInterfaceBravo != null)
      file = new File(PInterfaceBravo, paramString); 
    if (!file.exists())
      file = new File(PInterfaceAlpha, paramString); 
    j.PInterfaceAlpha(file);
    Iterator<String> iterator = j.PInterfaceBravo();
    while (iterator.hasNext()) {
      String str = iterator.next();
      if (paramJ.PInterfaceBravo(str) != null) {
        N n = paramJ.PInterfaceBravo(str);
        if (n == null) {
          M m = new M(paramString);
          m.PInterfaceAlpha("[" + str + "]", -1);
          paramJ.PInterfaceAlpha().add(m);
        } 
        for (M m : j.PInterfaceBravo(str))
          paramJ.PInterfaceAlpha(str, m); 
      } 
    } 
  }
  
  private boolean PInterfaceCharlie(String paramString) {
    return ExceptionprintstacktraceInGPackage.PInterfaceAlpha(paramString);
  }
  
  private void d(R paramR, J paramJ) {
    GInterfaceBe GInterfaceBe = (paramR.e() == null) ? new GInterfaceBe() : paramR.e();
    PInterfaceCharlie(paramR, GInterfaceBe, paramJ, "CurveEditor");
    PInterfaceCharlie(paramR, GInterfaceBe, paramJ, "CurveEditorTS");
    try {
      PInterfaceAlpha(paramR, GInterfaceBe, paramJ);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.PInterfaceAlpha("Error loading EcuReference Tables");
      ExceptionPrintstacktrace.printStackTrace();
    } 
    try {
      D.d("Loading Trigger Wheels");
      PInterfaceBravo(paramR, GInterfaceBe, paramJ, "TriggerWheel");
    } catch (Exception exception) {
      D.PInterfaceAlpha("Error loading [TriggerWheel] section of ini.");
      exception.printStackTrace();
    } 
    ArrayList arrayList = PInterfaceAlpha(paramJ, paramR, "UserDefined");
    if (arrayList != null && !arrayList.isEmpty()) {
      D.d("Loading Depricated ini section [UserDefined], use [UiDialogs]");
      PInterfaceAlpha(paramR, GInterfaceBe, paramJ, "UserDefined");
    } 
    arrayList = PInterfaceAlpha(paramJ, paramR, "UserDefinedTS");
    if (arrayList != null && !arrayList.isEmpty()) {
      D.d("Loading Depricated ini section [UserDefinedTS], use [UiDialogs]");
      PInterfaceAlpha(paramR, GInterfaceBe, paramJ, "UserDefinedTS");
    } 
    PInterfaceAlpha(paramR, GInterfaceBe, paramJ, "UiDialogs");
    PInterfaceCharlie(paramR, GInterfaceBe, paramJ);
    e(paramR, GInterfaceBe, paramJ, "Menu");
    e(paramR, GInterfaceBe, paramJ, "MenuTS");
    d(paramR, GInterfaceBe, paramJ, "KeyActions");
  }
  
  private void PInterfaceAlpha(M paramM) {
    int KInterfaceIndia = X.PInterfaceBravo(paramM.PInterfaceBravo(), "\"");
    if (KInterfaceIndia == -1 || KInterfaceIndia % 2 == 0)
      return; 
    PInterfaceBravo(paramM, "Open ended String value");
  }
  
  private void PInterfaceAlpha(R paramR, GInterfaceBe parambE, J paramJ, String paramString) {
    ArrayList arrayList1 = PInterfaceAlpha(paramJ, paramR, paramString);
    if (arrayList1 == null || arrayList1.isEmpty())
      return; 
    Iterator<CloneableImpl> iterator = paramR.n();
    while (iterator.hasNext()) {
      CloneableImpl CloneableImpl = iterator.next();
      parambE.PInterfaceAlpha((ArrayListExceptionprintstacktraceInGPackage)CloneableImpl);
    } 
    iterator = paramR.o();
    while (iterator.hasNext()) {
      GInterfaceBi GInterfaceBi = (GInterfaceBi)iterator.next();
      parambE.PInterfaceAlpha((ArrayListExceptionprintstacktraceInGPackage)GInterfaceBi);
    } 
    iterator = null;
    GInterfaceBr GInterfaceBr = null;
    GComponentAj GComponentAj = null;
    GComponentBx GComponentBx = null;
    GInterfaceBt GInterfaceBt = null;
    GComponentBz GComponentBz = null;
    ArrayList arrayList2 = new ArrayList();
    for (M m : arrayList1) {
      String str = m.PInterfaceBravo();
      try {
        ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage;
        if (str.startsWith("dialog")) {
          GInterfaceBt = null;
          GComponentBz = null;
          ArrayListExceptionprintstacktraceInGPackage = new ArrayListExceptionprintstacktraceInGPackage();
          ArrayListExceptionprintstacktraceInGPackage.s(this.l);
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          ArrayListExceptionprintstacktraceInGPackage.v(arrayOfString[0].trim());
          if (ArrayListExceptionprintstacktraceInGPackage.aL().equals("revlimiter2"))
            D.PInterfaceCharlie("break 5988812"); 
          if (arrayList2.contains(ArrayListExceptionprintstacktraceInGPackage.aL()))
            PInterfaceBravo(m, "dialog name '" + ArrayListExceptionprintstacktraceInGPackage.aL() + "' already assigned. Menus will reference the last definition"); 
          if (arrayOfString.length > 1) {
            GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString[1]);
            ArrayListExceptionprintstacktraceInGPackage.d(GInterfaceDb);
          } 
          if (arrayOfString.length > 2)
            if (arrayOfString[2].equals("border")) {
              ArrayListExceptionprintstacktraceInGPackage.KInterfaceIndia(2);
            } else if (arrayOfString[2].equals("xAxis")) {
              ArrayListExceptionprintstacktraceInGPackage.KInterfaceIndia(0);
            } else if (arrayOfString[2].equals("yAxis")) {
              ArrayListExceptionprintstacktraceInGPackage.KInterfaceIndia(1);
            } else if (arrayOfString[2].equals("card")) {
              ArrayListExceptionprintstacktraceInGPackage.KInterfaceIndia(3);
            } else if (arrayOfString[2].equals("indexCard")) {
              ArrayListExceptionprintstacktraceInGPackage.KInterfaceIndia(4);
            } else if (!I.PInterfaceAlpha(arrayOfString[2])) {
              PInterfaceBravo(m, "Invalid layout defined for panel.\n Valid values: border, xAxis, yAxis, indexCard. Using default yAxis.");
              ArrayListExceptionprintstacktraceInGPackage.KInterfaceIndia(1);
            }  
          if (arrayOfString.length > 3)
            ArrayListExceptionprintstacktraceInGPackage.y(arrayOfString[3]); 
          parambE.PInterfaceAlpha(ArrayListExceptionprintstacktraceInGPackage);
          continue;
        } 
        if (str.startsWith("panel")) {
          GInterfaceBd GInterfaceBd;
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          if (arrayOfString[0].trim().equals(ArrayListExceptionprintstacktraceInGPackage.aL()) || arrayOfString[0].trim().equals("customPressure5v")) {
            PInterfaceAlpha(m, "Attempting to add PInterfaceAlpha panel to itself! Ignoring row.");
            continue;
          } 
          ArrayListExceptionprintstacktraceInGPackage bv1 = parambE.PInterfaceCharlie(arrayOfString[0].trim());
          if (bv1 == null && PInterfaceCharlie(arrayOfString[0].trim())) {
            GInterfaceBd = new GInterfaceBd();
            GInterfaceBd.v(arrayOfString[0].trim());
            parambE.PInterfaceAlpha((ArrayListExceptionprintstacktraceInGPackage)GInterfaceBd);
          } 
          if (GInterfaceBd == null) {
            PInterfaceBravo(m, "Nested Panel " + arrayOfString[0].trim() + " not found in UI structure. Either it is not defined in this ini file or it is being referenced before it was defined.");
            continue;
          } 
          ArrayListExceptionprintstacktraceInGPackage bv2 = new ArrayListExceptionprintstacktraceInGPackage();
          bv2.KInterfaceHotel(true);
          bv2.PInterfaceAlpha((ArrayListExceptionprintstacktraceInGPackage)GInterfaceBd);
          byte PInterfaceBravo = 1;
          if (arrayOfString.length > PInterfaceBravo && (ArrayListExceptionprintstacktraceInGPackage.R() == 2 || !arrayOfString[PInterfaceBravo].startsWith("{")))
            try {
              String str2 = arrayOfString[PInterfaceBravo++].trim();
              if (ArrayListExceptionprintstacktraceInGPackage.R() == 2 && !str2.equals("Center") && !str2.equals("North") && !str2.equals("South") && !str2.equals("East") && !str2.equals("West")) {
                PInterfaceBravo(m, "Invalid placement constraint for border layout: " + str2 + ", Valid border constraints are: North, South, East, West or Center");
                str2 = "Center";
              } 
              bv2.t(str2);
            } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
              PInterfaceBravo(m, ExceptionPrintstacktrace.getMessage());
            }  
          if (arrayOfString.length > PInterfaceBravo) {
            String str2 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
            str2 = X.PInterfaceBravo(str2, "}", "").trim();
            PInterfaceAlpha(paramR, m, str2, false);
            bv2.u(str2);
            GInterfaceBd.u(str2);
          } 
          if (arrayOfString.length > PInterfaceBravo) {
            String str2 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
            str2 = X.PInterfaceBravo(str2, "}", "").trim();
            PInterfaceAlpha(paramR, m, str2, false);
            bv2.x(str2);
          } 
          ArrayListExceptionprintstacktraceInGPackage.PInterfaceAlpha(bv2);
          continue;
        } 
        if (str.startsWith("gauge")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          GInterfaceBb GInterfaceBb = new GInterfaceBb();
          GInterfaceBb.PInterfaceAlpha(arrayOfString[0].trim());
          GInterfaceAh GInterfaceAh = paramR.k(arrayOfString[0].trim());
          if (GInterfaceAh == null) {
            PInterfaceAlpha(m, "Gauge Template " + arrayOfString[0].trim() + " not found.");
            continue;
          } 
          if (arrayOfString.length > 1)
            try {
              GInterfaceBb.t(arrayOfString[1].trim());
            } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
              PInterfaceBravo(m, ExceptionPrintstacktrace.getMessage());
            }  
          if (arrayOfString.length > 2) {
            String str2 = X.PInterfaceBravo(arrayOfString[2], "{", "");
            str2 = X.PInterfaceBravo(str2, "}", "").trim();
            PInterfaceAlpha(paramR, m, str2, false);
            GInterfaceBb.u(str2);
          } 
          ArrayListExceptionprintstacktraceInGPackage.PInterfaceAlpha((ArrayListExceptionprintstacktraceInGPackage)GInterfaceBb);
          continue;
        } 
        if (str.startsWith("liveGraph")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          GInterfaceBr = new GInterfaceBr();
          GInterfaceBr.v(arrayOfString[0]);
          GInterfaceBr.s(arrayOfString[1]);
          if (arrayOfString.length > 2) {
            try {
              GInterfaceBr.t(arrayOfString[2]);
            } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
              PInterfaceBravo(m, ExceptionPrintstacktrace.getMessage());
            } 
          } else {
            GInterfaceBr.t("South");
          } 
          if (arrayOfString.length > 3) {
            GInterfaceBr.u(arrayOfString[3]);
            PInterfaceAlpha(paramR, m, GInterfaceBr.aJ(), false);
          } 
          ArrayListExceptionprintstacktraceInGPackage.PInterfaceAlpha((ArrayListExceptionprintstacktraceInGPackage)GInterfaceBr);
          continue;
        } 
        if (str.startsWith("graphLine")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          GComponentBs GComponentBs = new GComponentBs();
          byte PInterfaceBravo = 0;
          GComponentBs.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
          if (paramR.ExceptionPrintstacktrace(GComponentBs.PInterfaceAlpha()) == null)
            PInterfaceBravo(m, "LiveGraph graphLine assigned to invalid OutputChannel."); 
          if (arrayOfString.length > PInterfaceBravo)
            GComponentBs.PInterfaceBravo(arrayOfString[PInterfaceBravo++]); 
          if (arrayOfString.length > PInterfaceBravo)
            GComponentBs.PInterfaceAlpha(Double.parseDouble(arrayOfString[PInterfaceBravo++])); 
          if (arrayOfString.length > PInterfaceBravo)
            GComponentBs.PInterfaceBravo(Double.parseDouble(arrayOfString[PInterfaceBravo++])); 
          if (arrayOfString.length > PInterfaceBravo && arrayOfString[PInterfaceBravo++].equalsIgnoreCase("auto"))
            GComponentBs.PInterfaceAlpha(true); 
          if (arrayOfString.length > PInterfaceBravo && arrayOfString[PInterfaceBravo++].equalsIgnoreCase("auto"))
            GComponentBs.PInterfaceBravo(true); 
          GInterfaceBr.PInterfaceAlpha(GComponentBs);
          continue;
        } 
        if (str.startsWith("logFieldSelector")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          GComponentAg GComponentAg = new GComponentAg();
          byte PInterfaceBravo = 0;
          GComponentAg.v(arrayOfString[PInterfaceBravo++]);
          if (arrayOfString.length > PInterfaceBravo)
            GComponentAg.s(X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", "")); 
          if (arrayOfString.length > PInterfaceBravo) {
            GComponentAg.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
            if (paramR.PInterfaceCharlie(GComponentAg.PInterfaceAlpha()) == null)
              PInterfaceBravo(m, "Invalid Offset Parameter Name, " + GComponentAg.PInterfaceAlpha() + " not found."); 
          } 
          if (arrayOfString.length > PInterfaceBravo) {
            GComponentAg.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
            if (paramR.PInterfaceCharlie(GComponentAg.PInterfaceBravo()) == null)
              PInterfaceBravo(m, "Invalid Length Parameter Name, " + GComponentAg.PInterfaceBravo() + " not found."); 
          } 
          if (arrayOfString.length > PInterfaceBravo) {
            String str2 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
            str2 = X.PInterfaceBravo(str2, "}", "");
            try {
              GInterfaceDj GInterfaceDj = GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, str2);
              GComponentAg.PInterfaceAlpha(GInterfaceDj);
            } catch (Exception exception) {
              PInterfaceBravo(m, "Invalid Size Parameter Name, " + GComponentAg.PInterfaceCharlie() + " not found and not numeric.");
            } 
          } 
          if (arrayOfString.length > PInterfaceBravo) {
            String str2 = arrayOfString[PInterfaceBravo++];
            try {
              int KInterfaceIndia = X.ExceptionPrintstacktrace(str2);
              GComponentAg.PInterfaceAlpha(KInterfaceIndia);
            } catch (Exception exception) {
              PInterfaceBravo(m, "Invalid Inactive size, " + str2 + "  not numeric.");
            } 
          } 
          parambE.PInterfaceAlpha((ArrayListExceptionprintstacktraceInGPackage)GComponentAg);
          continue;
        } 
        if (str.startsWith("replayFieldSelector")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          GComponentBc GComponentBc = new GComponentBc();
          byte PInterfaceBravo = 0;
          GComponentBc.v(arrayOfString[PInterfaceBravo++]);
          if (arrayOfString.length > PInterfaceBravo)
            GComponentBc.s(X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", "")); 
          if (arrayOfString.length > PInterfaceBravo) {
            GComponentBc.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
            if (paramR.PInterfaceCharlie(GComponentBc.d()) == null)
              PInterfaceBravo(m, "Invalid Offset Parameter Name, " + GComponentBc.d() + " not found."); 
          } 
          if (arrayOfString.length > PInterfaceBravo) {
            GComponentBc.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
            if (!GComponentBc.PInterfaceBravo() && paramR.PInterfaceCharlie(GComponentBc.PInterfaceAlpha()) == null)
              PInterfaceBravo(m, "Invalid Size Parameter Name, " + GComponentBc.PInterfaceAlpha() + " not found and not numeric."); 
          } 
          if (arrayOfString.length > PInterfaceBravo) {
            String str2 = arrayOfString[PInterfaceBravo++];
            try {
              int KInterfaceIndia = X.ExceptionPrintstacktrace(str2);
              GComponentBc.PInterfaceAlpha(KInterfaceIndia);
            } catch (Exception exception) {
              PInterfaceBravo(m, "Invalid Inactive, " + str2 + "  not numeric.");
            } 
          } 
          parambE.PInterfaceAlpha((ArrayListExceptionprintstacktraceInGPackage)GComponentBc);
          continue;
        } 
        if (str.startsWith("settingSelector") && ArrayListExceptionprintstacktraceInGPackage != null) {
          GComponentBx = new GComponentBx();
          String str1 = q(str);
          byte PInterfaceBravo = 0;
          String[] arrayOfString = j(str1);
          String str2 = arrayOfString[PInterfaceBravo++];
          GComponentBx.PInterfaceBravo(GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, str2));
          if (arrayOfString.length > PInterfaceBravo) {
            String str3 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
            str3 = X.PInterfaceBravo(str3, "}", "").trim();
            PInterfaceAlpha(paramR, m, str3, false);
            GComponentBx.u(str3);
            if (arrayOfString.length > PInterfaceBravo) {
              str3 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
              str3 = X.PInterfaceBravo(str3, "}", "").trim();
              PInterfaceAlpha(paramR, m, str3, false);
              GComponentBx.KInterfaceFoxtrot(str3);
            } 
          } 
          ArrayListExceptionprintstacktraceInGPackage.PInterfaceAlpha((Abstract)GComponentBx);
          continue;
        } 
        if (str.startsWith("enabledCondition") && ArrayListExceptionprintstacktraceInGPackage != null) {
          String str1 = q(str);
          String str2 = X.PInterfaceBravo(str1, "{", "");
          str2 = X.PInterfaceBravo(str2, "}", "").trim();
          PInterfaceAlpha(paramR, m, str2, false);
          ArrayListExceptionprintstacktraceInGPackage.u(str2);
          continue;
        } 
        if (str.startsWith("settingOption") && ArrayListExceptionprintstacktraceInGPackage != null) {
          if (GComponentBx == null) {
            PInterfaceAlpha(m, "Ini error: Found settingOption before settingSelector.");
            continue;
          } 
          GComponentBw GComponentBw = new GComponentBw();
          String str1 = q(str);
          byte PInterfaceBravo = 0;
          String[] arrayOfString = j(str1);
          GComponentBw.PInterfaceBravo(KInterfaceFoxtrot(arrayOfString[PInterfaceBravo++]));
          while (PInterfaceBravo < arrayOfString.length) {
            String str2 = p(arrayOfString[PInterfaceBravo]);
            String str3 = q(arrayOfString[PInterfaceBravo]);
            double d = 0.0D;
            try {
              d = Double.parseDouble(str3);
            } catch (Exception exception) {
              PInterfaceAlpha(m, "Value for " + str2 + " should CloneableImpl numeric in row.");
            } 
            GComponentBw.PInterfaceAlpha(str2, d);
            PInterfaceBravo++;
          } 
          GComponentBx.PInterfaceAlpha(GComponentBw);
          continue;
        } 
        if (str.startsWith("calibrationField") && ArrayListExceptionprintstacktraceInGPackage != null) {
          GComponentBk GComponentBk = new GComponentBk();
          PInterfaceAlpha(paramR, m, (GComponentBq)GComponentBk);
          PInterfaceAlpha(paramR, m, GComponentBk.aJ(), false);
          if (GComponentBk.PInterfaceBravo() != null && !GComponentBk.PInterfaceBravo().equals("") && paramR.PInterfaceCharlie(GComponentBk.PInterfaceBravo()) == null) {
            PInterfaceBravo(m, "[" + paramString + "] field assigned to invalid Constant '" + GComponentBk.PInterfaceBravo() + "'.");
          } else if (GComponentBk.PInterfaceBravo() != null && !GComponentBk.PInterfaceBravo().equals("") && paramR.PInterfaceCharlie(GComponentBk.PInterfaceBravo()).KInterfaceIndia().equals("array") && !str.contains("[")) {
            PInterfaceBravo(m, "[" + paramString + "] field assigned to array Constant '" + GComponentBk.PInterfaceBravo() + "'. Use array1D for array Constants");
          } 
          ArrayListExceptionprintstacktraceInGPackage.PInterfaceAlpha((Abstract)GComponentBk);
          continue;
        } 
        if (str.startsWith("field") && ArrayListExceptionprintstacktraceInGPackage != null) {
          GComponentBq GComponentBq = PInterfaceAlpha(paramR, m);
          PInterfaceAlpha(paramR, m, GComponentBq.aJ(), false);
          if (GComponentBq.PInterfaceBravo() != null && !GComponentBq.PInterfaceBravo().equals("") && paramR.PInterfaceCharlie(GComponentBq.PInterfaceBravo()) == null) {
            PInterfaceBravo(m, "[" + paramString + "] field assigned to invalid Constant '" + GComponentBq.PInterfaceBravo() + "'.");
          } else if (GComponentBq.PInterfaceBravo() != null && !GComponentBq.PInterfaceBravo().equals("") && paramR.PInterfaceCharlie(GComponentBq.PInterfaceBravo()).KInterfaceIndia().equals("array") && !str.contains("[")) {
            PInterfaceBravo(m, "[" + paramString + "] field assigned to array Constant '" + GComponentBq.PInterfaceBravo() + "'. Use array1D for array Constants");
          } 
          ArrayListExceptionprintstacktraceInGPackage.PInterfaceAlpha((Abstract)GComponentBq);
          continue;
        } 
        if (str.startsWith("radio") && ArrayListExceptionprintstacktraceInGPackage != null) {
          GComponentBy GComponentBy = PInterfaceCharlie(paramR, m);
          PInterfaceAlpha(paramR, m, GComponentBy.aJ(), false);
          if (GComponentBy.PInterfaceBravo() != null && !GComponentBy.PInterfaceBravo().equals("") && paramR.PInterfaceCharlie(GComponentBy.PInterfaceBravo()) == null) {
            PInterfaceBravo(m, "[" + paramString + "] field assigned to invalid Constant '" + GComponentBy.PInterfaceBravo() + "'.");
          } else if (GComponentBy.PInterfaceBravo() != null && !GComponentBy.PInterfaceBravo().equals("") && paramR.PInterfaceCharlie(GComponentBy.PInterfaceBravo()).KInterfaceIndia().equals("array") && !str.contains("[")) {
            PInterfaceBravo(m, "[" + paramString + "] field assigned to array Constant '" + GComponentBy.PInterfaceBravo() + "'. Use array1D for array Constants");
          } 
          ArrayListExceptionprintstacktraceInGPackage.PInterfaceAlpha((Abstract)GComponentBy);
          continue;
        } 
        if (str.startsWith("channelSelector") && ArrayListExceptionprintstacktraceInGPackage != null) {
          try {
            E e = e(paramR, m);
            PInterfaceAlpha(paramR, m, e.aJ(), false);
            if (e.PInterfaceAlpha() != null && !e.PInterfaceAlpha().equals("") && paramR.PInterfaceCharlie(e.PInterfaceAlpha()) == null)
              PInterfaceBravo(m, "[" + paramString + "] Channel Selector assigned to invalid offset Constant '" + e.PInterfaceAlpha() + "'."); 
            if (e.PInterfaceCharlie() != null && !e.PInterfaceCharlie().equals("") && paramR.PInterfaceCharlie(e.PInterfaceCharlie()) == null)
              PInterfaceBravo(m, "[" + paramString + "] Channel Selector assigned to invalid Length Constant '" + e.PInterfaceAlpha() + "'."); 
            if (paramR.PInterfaceCharlie(e.PInterfaceAlpha()) != null && !paramR.PInterfaceCharlie(e.PInterfaceAlpha()).KInterfaceIndia().equals("scalar"))
              PInterfaceAlpha(m, "Constant: " + e.PInterfaceAlpha() + " not of type scalar. Only Scalar is supported for channelSelector."); 
            if (paramR.PInterfaceCharlie(e.PInterfaceCharlie()) != null && !paramR.PInterfaceCharlie(e.PInterfaceCharlie()).KInterfaceIndia().equals("scalar"))
              PInterfaceAlpha(m, "Constant: " + e.PInterfaceCharlie() + " not of type scalar. Only Scalar is supported for channelSelector."); 
            ArrayListExceptionprintstacktraceInGPackage.PInterfaceAlpha((Abstract)e);
          } catch (Exception exception) {
            PInterfaceAlpha(m, "Syntax error. Proper usage:\n   channelSelector = \"Label Text\", offset_scalar, len_scalar, can_id_scaler(optional), { enable condition (optional)}, { visible condition (optional)}");
          } 
          continue;
        } 
        if (str.startsWith("canDeviceSelector") && ArrayListExceptionprintstacktraceInGPackage != null) {
          try {
            D d = KInterfaceFoxtrot(paramR, m);
            PInterfaceAlpha(paramR, m, d.aJ(), false);
            if (d.PInterfaceAlpha() != null && !d.PInterfaceAlpha().equals("") && paramR.PInterfaceCharlie(d.PInterfaceAlpha()) == null)
              PInterfaceBravo(m, "[" + paramString + "] CAN Device Selector assigned to invalid can ID Constant '" + d.PInterfaceAlpha() + "'."); 
            if (paramR.PInterfaceCharlie(d.PInterfaceAlpha()) != null && !paramR.PInterfaceCharlie(d.PInterfaceAlpha()).KInterfaceIndia().equals("scalar"))
              PInterfaceAlpha(m, "Constant: " + d.PInterfaceAlpha() + " not of type scalar. Only Scalar is supported for canDeviceSelector."); 
            ArrayListExceptionprintstacktraceInGPackage.PInterfaceAlpha((Abstract)d);
          } catch (Exception exception) {
            PInterfaceAlpha(m, "Syntax error. Proper usage:\n   canDeviceSelector = \"Label Text\", can_id_scaler, { enable condition (optional)}, { visible condition (optional)}");
          } 
          continue;
        } 
        if (str.startsWith("canClientIdSelector") && ArrayListExceptionprintstacktraceInGPackage != null) {
          try {
            C PInterfaceCharlie = ExceptionPrintstacktrace(paramR, m);
            PInterfaceAlpha(paramR, m, PInterfaceCharlie.aJ(), false);
            if (PInterfaceCharlie.PInterfaceAlpha() != null && !PInterfaceCharlie.PInterfaceAlpha().equals("") && paramR.PInterfaceCharlie(PInterfaceCharlie.PInterfaceAlpha()) == null)
              PInterfaceBravo(m, "[" + paramString + "] CAN Device Selector assigned to invalid can ID Constant '" + PInterfaceCharlie.PInterfaceAlpha() + "'."); 
            if (paramR.PInterfaceCharlie(PInterfaceCharlie.PInterfaceAlpha()) != null && !paramR.PInterfaceCharlie(PInterfaceCharlie.PInterfaceAlpha()).KInterfaceIndia().equals("scalar"))
              PInterfaceAlpha(m, "Constant: " + PInterfaceCharlie.PInterfaceAlpha() + " not of type scalar. Only Scalar is supported for canDeviceSelector."); 
            ArrayListExceptionprintstacktraceInGPackage.PInterfaceAlpha((Abstract)PInterfaceCharlie);
          } catch (Exception exception) {
            PInterfaceAlpha(m, "Syntax error. Proper usage:\n   canDeviceSelector = \"Label Text\", can_id_scaler, { enable condition (optional)}, { visible condition (optional)}");
          } 
          continue;
        } 
        if (str.startsWith("slider") && ArrayListExceptionprintstacktraceInGPackage != null) {
          GInterfaceBc GInterfaceBc = d(paramR, m);
          PInterfaceAlpha(paramR, m, GInterfaceBc.aJ(), false);
          if (GInterfaceBc.PInterfaceBravo() != null && !GInterfaceBc.PInterfaceBravo().equals("") && paramR.PInterfaceCharlie(GInterfaceBc.PInterfaceBravo()) == null)
            PInterfaceBravo(m, "[" + paramString + "] field assigned to invalid Constant '" + GInterfaceBc.PInterfaceBravo() + "'."); 
          if (paramR.PInterfaceCharlie(GInterfaceBc.PInterfaceBravo()) != null && !paramR.PInterfaceCharlie(GInterfaceBc.PInterfaceBravo()).KInterfaceIndia().equals("scalar"))
            PInterfaceAlpha(m, "Constant: " + GInterfaceBc.PInterfaceBravo() + " not of type scalar. Only Scalar is supported for Sliders."); 
          ArrayListExceptionprintstacktraceInGPackage.PInterfaceAlpha((Abstract)GInterfaceBc);
          continue;
        } 
        if (str.startsWith("commandButton") && ArrayListExceptionprintstacktraceInGPackage != null) {
          byte PInterfaceBravo;
          GComponentBl GComponentBl = new GComponentBl();
          GComponentBl.v(m.KInterfaceFoxtrot());
          String[] arrayOfString = j(m.e());
          GComponentBl.PInterfaceBravo(GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString[0]));
          GComponentBl.PInterfaceAlpha(arrayOfString[1]);
          if (arrayOfString.length > 2 && arrayOfString[2].startsWith("{")) {
            String str1 = X.PInterfaceBravo(arrayOfString[2], "{", "");
            str1 = X.PInterfaceBravo(str1, "}", "");
            GComponentBl.u(str1.trim());
            PInterfaceAlpha(paramR, m, GComponentBl.aJ(), false);
            PInterfaceBravo = 3;
          } else {
            PInterfaceBravo = 2;
          } 
          while (arrayOfString.length > PInterfaceBravo) {
            if (arrayOfString[PInterfaceBravo].equals("clickOnClose")) {
              GComponentBl.PInterfaceAlpha(GComponentBl.KInterfaceFoxtrot);
            } else if (arrayOfString[PInterfaceBravo].equals("clickOnCloseIfEnabled")) {
              GComponentBl.PInterfaceAlpha(GComponentBl.PInterfaceBravo);
            } else if (arrayOfString[PInterfaceBravo].equals("clickOnCloseIfDisabled")) {
              GComponentBl.PInterfaceAlpha(GComponentBl.PInterfaceCharlie);
            } else if (arrayOfString[PInterfaceBravo].equals("closeDialogOnClick")) {
              GComponentBl.PInterfaceAlpha(GComponentBl.e);
            } else if (arrayOfString[PInterfaceBravo].equals("showMessageOnClick")) {
              if (arrayOfString.length > PInterfaceBravo + 1) {
                GComponentBl.PInterfaceAlpha(GComponentBl.d);
                String str1 = KInterfaceFoxtrot(arrayOfString[++PInterfaceBravo]);
                GComponentBl.PInterfaceBravo(str1);
              } else {
                PInterfaceBravo(m, "Message required with showMessageOnClick flag");
              } 
            } else {
              PInterfaceBravo(m, "Unknown commandButton attribute: " + arrayOfString[3] + ", know attributes include: clickOnCloseIfEnabled, clickOnCloseIfDisabled and clickOnClose");
            } 
            PInterfaceBravo++;
          } 
          if (GComponentBl.PInterfaceAlpha() == null || GComponentBl.PInterfaceAlpha().equals("") || paramR.O().PInterfaceBravo(GComponentBl.PInterfaceAlpha()) == null)
            PInterfaceBravo(m, "[" + paramString + "] commandButton assigned to invalid ControllerCommands '" + GComponentBl.PInterfaceAlpha() + "'."); 
          ArrayListExceptionprintstacktraceInGPackage.PInterfaceAlpha((Abstract)GComponentBl);
          continue;
        } 
        if (str.startsWith("displayOnlyField") && ArrayListExceptionprintstacktraceInGPackage != null) {
          GComponentBq GComponentBq = PInterfaceAlpha(paramR, m);
          GComponentBq.d(true);
          PInterfaceAlpha(paramR, m, GComponentBq.aJ(), false);
          if (GComponentBq.PInterfaceBravo() != null && !GComponentBq.PInterfaceBravo().equals("") && paramR.PInterfaceCharlie(GComponentBq.PInterfaceBravo()) == null)
            PInterfaceBravo(m, "[" + paramString + "] displayField assigned to invalid Constant '" + GComponentBq.PInterfaceBravo() + "'."); 
          ArrayListExceptionprintstacktraceInGPackage.PInterfaceAlpha((Abstract)GComponentBq);
          continue;
        } 
        if (str.startsWith("runtimeValue") && ArrayListExceptionprintstacktraceInGPackage != null) {
          GComponentBq GComponentBq = PInterfaceBravo(paramR, m);
          GComponentBq.d(true);
          PInterfaceAlpha(paramR, m, GComponentBq.aJ(), false);
          if (GComponentBq.PInterfaceBravo() != null && !GComponentBq.PInterfaceBravo().equals("") && paramR.ExceptionPrintstacktrace(GComponentBq.PInterfaceBravo()) == null)
            PInterfaceBravo(m, "[" + paramString + "] displayField assigned to invalid Constant '" + GComponentBq.PInterfaceBravo() + "'."); 
          ArrayListExceptionprintstacktraceInGPackage.PInterfaceAlpha((Abstract)GComponentBq);
          continue;
        } 
        if (str.startsWith("topicHelp") && ArrayListExceptionprintstacktraceInGPackage != null) {
          GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, q(str));
          ArrayListExceptionprintstacktraceInGPackage.e(GInterfaceDb);
          if (GInterfaceDb.PInterfaceAlpha().startsWith("http:/") || GInterfaceDb.PInterfaceAlpha().startsWith("file:/")) {
            GComponentAj = new GComponentAj();
            GComponentAj.PInterfaceAlpha(GInterfaceDb);
            GComponentAj.PInterfaceBravo(GInterfaceDb);
            if (ArrayListExceptionprintstacktraceInGPackage.M() != null && ArrayListExceptionprintstacktraceInGPackage.M().length() > 0) {
              if (GInterfaceDb.PInterfaceAlpha().startsWith("http:/")) {
                GComponentAj.PInterfaceBravo("Web - " + ArrayListExceptionprintstacktraceInGPackage.M());
              } else {
                GComponentAj.PInterfaceBravo(ArrayListExceptionprintstacktraceInGPackage.M());
              } 
            } else if (GInterfaceDb.PInterfaceAlpha().startsWith("file:/")) {
              GComponentAj.PInterfaceBravo("Manual Help");
            } else {
              GComponentAj.PInterfaceBravo("Web Help");
            } 
            parambE.PInterfaceAlpha(GComponentAj);
          } 
          continue;
        } 
        if (str.startsWith("help")) {
          GComponentAj = new GComponentAj();
          String[] arrayOfString = j(q(str));
          GComponentAj.PInterfaceAlpha(GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString[0]));
          if (arrayOfString.length > 1)
            GComponentAj.PInterfaceBravo(X.PInterfaceBravo(arrayOfString[1], "\"", "")); 
          parambE.PInterfaceAlpha(GComponentAj);
          continue;
        } 
        if (str.startsWith("text") && GComponentAj != null) {
          GComponentAj.PInterfaceAlpha(X.PInterfaceBravo(q(str), "\"", "") + "\n");
          continue;
        } 
        if (str.startsWith("webHelp") && GComponentAj != null) {
          GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, q(str));
          GComponentAj.PInterfaceBravo(GInterfaceDb);
          continue;
        } 
        if (str.startsWith("array1D")) {
          if (ArrayListExceptionprintstacktraceInGPackage != null) {
            GComponentBj GComponentBj = d(str);
            PInterfaceAlpha(paramR, m, GComponentBj.PInterfaceCharlie(), false);
            ArrayListExceptionprintstacktraceInGPackage.PInterfaceAlpha((ArrayListExceptionprintstacktraceInGPackage)GComponentBj);
            continue;
          } 
          PInterfaceAlpha(m, "Could not load array1D because the parent panel was not defined 1st.");
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("indicatorPanel")) {
          String[] arrayOfString = j(q(str));
          GInterfaceBt = new GInterfaceBt();
          GInterfaceBt.v(arrayOfString[0]);
          parambE.PInterfaceAlpha((ArrayListExceptionprintstacktraceInGPackage)GInterfaceBt);
          if (arrayOfString.length > 1)
            GInterfaceBt.PInterfaceAlpha((int)I.PInterfaceBravo(arrayOfString[1])); 
          if (arrayOfString.length > 2) {
            String str1 = X.PInterfaceBravo(arrayOfString[2], "{", "");
            str1 = X.PInterfaceBravo(str1, "}", "").trim();
            PInterfaceAlpha(paramR, m, str1, false);
            GInterfaceBt.u(str1);
          } 
          if (arrayOfString.length > 3) {
            String str1 = X.PInterfaceBravo(arrayOfString[3], "{", "");
            str1 = X.PInterfaceBravo(str1, "}", "").trim();
            PInterfaceAlpha(paramR, m, str1, false);
            GInterfaceBt.x(str1);
          } 
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("indicator")) {
          if (GInterfaceBt == null) {
            PInterfaceBravo(m, "indicator defined in " + paramString + " with no indicatorPanel defined, ignoring.");
            continue;
          } 
          Exceptionprintstacktrace Exceptionprintstacktrace = PInterfaceAlpha(m, paramR);
          GInterfaceBt.PInterfaceAlpha(Exceptionprintstacktrace);
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("readoutPanel")) {
          String[] arrayOfString = j(q(str));
          GComponentBz = new GComponentBz();
          GComponentBz.v(arrayOfString[0]);
          parambE.PInterfaceAlpha((ArrayListExceptionprintstacktraceInGPackage)GComponentBz);
          if (arrayOfString.length > 1)
            GComponentBz.PInterfaceAlpha((int)I.PInterfaceBravo(arrayOfString[1])); 
          if (arrayOfString.length > 2) {
            String str1 = X.PInterfaceBravo(arrayOfString[2], "{", "");
            str1 = X.PInterfaceBravo(str1, "}", "").trim();
            PInterfaceAlpha(paramR, m, str1, false);
            GComponentBz.u(str1);
          } 
          if (arrayOfString.length > 3) {
            String str1 = X.PInterfaceBravo(arrayOfString[3], "{", "");
            str1 = X.PInterfaceBravo(str1, "}", "").trim();
            PInterfaceAlpha(paramR, m, str1, false);
            GComponentBz.x(str1);
          } 
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("readout")) {
          if (GComponentBz == null) {
            PInterfaceBravo(m, "readout defined in " + paramString + " with no readoutPanel defined, ignoring.");
            continue;
          } 
          String[] arrayOfString = j(q(str));
          if (arrayOfString.length == 1) {
            GInterfaceAh ah1 = paramR.k(arrayOfString[0]);
            if (ah1 != null) {
              GComponentBz.PInterfaceAlpha(ah1);
              continue;
            } 
            SerializableImpl SerializableImpl = paramR.ExceptionPrintstacktrace(arrayOfString[0]);
            if (SerializableImpl != null) {
              ah1 = new GInterfaceAh();
              ah1.PInterfaceAlpha(arrayOfString[0]);
              ah1.PInterfaceCharlie(arrayOfString[0]);
              ah1.PInterfaceAlpha(-1.0E9D);
              ah1.PInterfaceBravo(1.0E9D);
              ah1.e(1.0E8D);
              ah1.d(1.0E8D);
              GComponentBz.PInterfaceAlpha(ah1);
              continue;
            } 
            PInterfaceBravo(m, "Unrecognized readout entry " + paramString + ", " + arrayOfString[0] + " not recognized as OutputChannel or Guage Definition");
            continue;
          } 
          GInterfaceAh GInterfaceAh = j(paramR, m);
          GComponentBz.PInterfaceAlpha(GInterfaceAh);
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("userPassword")) {
          String str1 = m.e();
          Manager Manager = paramR.PInterfaceCharlie(str1);
          if (Manager != null && Manager.z() >= 4) {
            ArrayListExceptionprintstacktraceInGPackage.z(str1);
            paramR.PInterfaceCharlie(true);
            continue;
          } 
          PInterfaceBravo(m, "Invalid value for userPassword Parameter. Must CloneableImpl the name of PInterfaceAlpha defined U32 Constant. Invalid Value: " + str1);
          continue;
        } 
        PInterfaceBravo(m, "Unrecognized ini entry in " + paramString + ", ignoring.");
      } catch (Exception exception) {
        PInterfaceAlpha(m, "Invalid record in " + paramString + ", I don't know how to handle. It may cause more errors");
      } 
    } 
  }
  
  private void PInterfaceBravo(R paramR, GInterfaceBe parambE, J paramJ, String paramString) {
    GComponentAj GComponentAj = null;
    ArrayList arrayList = PInterfaceAlpha(paramJ, paramR, paramString);
    GInterfaceBj GInterfaceBj = null;
    PInterfaceCharlie PInterfaceCharlie = null;
    for (M m : arrayList) {
      String str = m.PInterfaceBravo();
      try {
        if (str.startsWith("wheelPattern")) {
          String[] arrayOfString = j(q(str));
          if (arrayOfString.length < 2) {
            PInterfaceAlpha(m, "Not enough Parameters for wheelPattern entry.");
            continue;
          } 
          if (arrayOfString[1].equals("basicPattern")) {
            PInterfaceBravo PInterfaceBravo = new PInterfaceBravo();
            PInterfaceBravo.v(arrayOfString[0]);
            PInterfaceBravo.PInterfaceBravo(arrayOfString[2]);
            PInterfaceBravo.PInterfaceCharlie(arrayOfString[3]);
            PInterfaceBravo.d(arrayOfString[4]);
            if (arrayOfString.length > 5)
              PInterfaceBravo.e(arrayOfString[5]); 
            parambE.PInterfaceAlpha((GInterfaceBl)PInterfaceBravo);
            continue;
          } 
          if (arrayOfString[1].equals("fixedAngle"))
            continue; 
          if (arrayOfString[1].equals("bitArrayPattern")) {
            if (arrayOfString.length < 4) {
              PInterfaceAlpha(m, "bitArrayPattern requires 4 parameters:\nname, designerPattern, constantBitsArray, constantOffset, [constantCapture]");
              continue;
            } 
            PInterfaceAlpha PInterfaceAlpha = new PInterfaceAlpha();
            PInterfaceAlpha.v(arrayOfString[0]);
            PInterfaceAlpha.PInterfaceAlpha(arrayOfString[1]);
            PInterfaceAlpha.PInterfaceBravo(arrayOfString[2]);
            if (arrayOfString.length > 3)
              PInterfaceAlpha.d(arrayOfString[3]); 
            if (arrayOfString.length > 4)
              PInterfaceAlpha.PInterfaceCharlie(arrayOfString[4]); 
            parambE.PInterfaceAlpha((GInterfaceBl)PInterfaceAlpha);
            continue;
          } 
          PInterfaceAlpha(m, "Invalid WheelPattern class.");
          continue;
        } 
        if (str.startsWith("triggerWheel")) {
          GInterfaceBj = new GInterfaceBj();
          String[] arrayOfString = j(q(str));
          GInterfaceBj.v(arrayOfString[0]);
          parambE.PInterfaceAlpha((ArrayListExceptionprintstacktraceInGPackage)GInterfaceBj);
          if (arrayOfString.length > 1)
            GInterfaceBj.s(X.PInterfaceBravo(arrayOfString[1], "\"", "")); 
          if (arrayOfString.length > 2) {
            String str1 = X.PInterfaceBravo(arrayOfString[2], "{", "");
            str1 = X.PInterfaceBravo(str1, "}", "").trim();
            PInterfaceAlpha(paramR, m, str1, false);
            GInterfaceBj.u(str1);
          } 
          GInterfaceBj.PInterfaceAlpha(str.startsWith("triggerWheelDesigner"));
          continue;
        } 
        if (str.startsWith("topicHelp") && !PInterfaceAlpha(GInterfaceBj, str)) {
          GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, q(str));
          GInterfaceBj.e(GInterfaceDb);
          if (GInterfaceDb.PInterfaceAlpha().startsWith("http:/") || GInterfaceDb.PInterfaceAlpha().startsWith("file:/")) {
            GComponentAj = new GComponentAj();
            GComponentAj.PInterfaceAlpha(GInterfaceDb);
            GComponentAj.PInterfaceBravo(GInterfaceDb);
            if (GInterfaceBj != null && GInterfaceBj.M() != null && GInterfaceBj.M().length() > 0) {
              GComponentAj.PInterfaceBravo(GInterfaceBj.M());
            } else {
              GComponentAj.PInterfaceBravo("Web Help");
            } 
            parambE.PInterfaceAlpha(GComponentAj);
          } 
          continue;
        } 
        if (str.startsWith("inputCapturePointParameterName") && PInterfaceCharlie != null) {
          String str1 = q(str);
          PInterfaceCharlie.PInterfaceBravo(str1.trim());
          continue;
        } 
        if (str.startsWith("solutionWheelPattern") && GInterfaceBj != null) {
          String[] arrayOfString = j(q(str));
          String str1 = X.PInterfaceBravo(arrayOfString[1], "{", "");
          str1 = X.PInterfaceBravo(str1, "}", "");
          PInterfaceAlpha(paramR, m, str1, false);
          String str2 = arrayOfString[0];
          if (parambE.PInterfaceAlpha(str2) == null) {
            PInterfaceAlpha(m, "Attempt to add trigger wheel pattern " + str2 + " to triggerWheel, but wheel pattern is not defined.\nThe wheelPattern should CloneableImpl defined above the triggerWheel you are adding it to.");
            continue;
          } 
          GInterfaceBl GInterfaceBl = parambE.PInterfaceAlpha(str2);
          if (GInterfaceBl == null) {
            PInterfaceBravo(m, "Wheel Pattern: " + str2 + " not found in current configuration. Was it defined after this row?");
            continue;
          } 
          GInterfaceBj.PInterfaceAlpha(str1, GInterfaceBl);
          continue;
        } 
        if (str.startsWith("preferredSize") && GInterfaceBj != null) {
          String str1 = q(str);
          String[] arrayOfString = j(q(str));
          int KInterfaceIndia = X.ExceptionPrintstacktrace(arrayOfString[0]);
          int j = X.ExceptionPrintstacktrace(arrayOfString[1]);
          A PInterfaceAlpha = new A(KInterfaceIndia, j);
          GInterfaceBj.PInterfaceAlpha(PInterfaceAlpha);
          continue;
        } 
        if (GInterfaceBj == null) {
          PInterfaceBravo(m, "Syntax Error in ini section [" + paramString + "], PInterfaceAlpha triggerWheel was should CloneableImpl defined first.");
          continue;
        } 
        PInterfaceBravo(m, "Syntax Error in ini section [" + paramString + "], line not understood and ignored.");
      } catch (Exception exception) {
        PInterfaceAlpha(m, "Sysntax Error in [" + paramString + "], I don't know how to handle.");
        exception.printStackTrace();
      } 
    } 
  }
  
  private void PInterfaceAlpha(R paramR, J paramJ, String paramString) {
    ArrayList arrayList = PInterfaceAlpha(paramJ, paramR, paramString);
    for (M m : arrayList) {
      String str = m.PInterfaceBravo();
      try {
        if (str.startsWith("requiresPowerCycle")) {
          Manager Manager = paramR.PInterfaceCharlie(m.e());
          if (Manager == null) {
            PInterfaceBravo(m, m.e() + " not found, can not assign requiresPowerCycle.");
            continue;
          } 
          Manager.d(true);
          continue;
        } 
        if (str.startsWith("readOnly")) {
          String[] arrayOfString = j(q(str));
          Manager Manager = paramR.PInterfaceCharlie(arrayOfString[0]);
          if (Manager == null) {
            PInterfaceBravo(m, arrayOfString[0] + " not found, can not set to read only.");
            continue;
          } 
          Manager.KInterfaceFoxtrot(true);
          continue;
        } 
        if (str.startsWith("defaultValue")) {
          String[] arrayOfString = j(q(str));
          Manager Manager = paramR.PInterfaceCharlie(arrayOfString[0]);
          if (Manager == null) {
            PInterfaceBravo(m, arrayOfString[0] + " not found, can not assign defaultValue.");
            continue;
          } 
          boolean bool = Manager.H();
          Manager.KInterfaceFoxtrot(false);
          String str1 = arrayOfString[1];
          if (str1.startsWith("\"") && Manager.KInterfaceIndia().equals("bits")) {
            Manager.e(str1);
          } else if (Manager.KInterfaceIndia().equals("array")) {
            double[][] arrayOfDouble = new double[Manager.PInterfaceAlpha()][Manager.m()];
            String str2 = m.e();
            String str3 = str2.substring(str2.indexOf(",") + 1).replace("\\n", "\n");
            str3 = str3.replace("  ", " ").trim();
            if (str3.indexOf("\n") == -1)
              str3 = str3.replace(" ", "\n"); 
            str3 = str3 + "\n";
            try {
              arrayOfDouble = X.PInterfaceAlpha(arrayOfDouble, str3);
            } catch (Exception exception) {
              PInterfaceBravo(m, "Wrong number of values?");
            } 
            Manager.PInterfaceAlpha(paramR.KInterfaceHotel(), arrayOfDouble);
          } else if (Manager.KInterfaceIndia().equals("string")) {
            str1 = KInterfaceFoxtrot(str1);
            Manager.KInterfaceFoxtrot(str1);
          } else {
            double d = Double.parseDouble(str1);
            Manager.d(d);
          } 
          Manager.KInterfaceFoxtrot(bool);
          continue;
        } 
        if (str.startsWith("rawValue")) {
          String[] arrayOfString = j(q(str));
          Manager Manager = paramR.PInterfaceCharlie(arrayOfString[0]);
          if (Manager == null) {
            PInterfaceBravo(m, arrayOfString[0] + " not found, can not assign rawValue.");
            continue;
          } 
          boolean bool = Manager.H();
          Manager.KInterfaceFoxtrot(false);
          String str1 = arrayOfString[1];
          if (str1.startsWith("\"") && Manager.KInterfaceIndia().equals("bits")) {
            PInterfaceBravo(m, "bit types not not supported byte assign rawValue.");
          } else {
            int[] arrayOfInt = new int[Manager.z()];
            String str2 = m.e();
            String str3 = str2.substring(str2.indexOf(",") + 1);
            str3 = str3.replace("  ", " ").trim();
            arrayOfInt = X.d(str3, " ");
            Manager.PInterfaceAlpha(paramR.KInterfaceHotel(), arrayOfInt);
          } 
          Manager.KInterfaceFoxtrot(bool);
          continue;
        } 
        if (str.startsWith("useScaleAsDivisor")) {
          String[] arrayOfString = j(m.e());
          Manager Manager = paramR.PInterfaceCharlie(arrayOfString[0]);
          if (Manager != null) {
            Manager.KInterfaceFoxtrot(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[1]));
            continue;
          } 
          PInterfaceBravo(m, "Constant: " + arrayOfString[0] + " not found.");
          continue;
        } 
        if (str.startsWith("maintainConstantValue")) {
          String[] arrayOfString = j(m.e());
          Manager Manager = paramR.PInterfaceCharlie(arrayOfString[0]);
          if (Manager == null) {
            PInterfaceAlpha(m, "Constant " + arrayOfString[0] + " not found! format: maintainConstantValue = scalarConstantName, { expression }");
            continue;
          } 
          if (!Manager.KInterfaceIndia().equals("scalar") && !Manager.KInterfaceIndia().equals("bits")) {
            PInterfaceAlpha(m, "Only Scalar and Bit Constants supported! format: maintainConstantValue = scalarConstantName, { expression }");
            continue;
          } 
          if (arrayOfString.length <= 1) {
            PInterfaceAlpha(m, "Expression not optional! format: maintainConstantValue = scalarConstantName, { expression }");
            continue;
          } 
          String str1 = arrayOfString[1];
          str1 = X.PInterfaceBravo(str1, "{", "");
          str1 = X.PInterfaceBravo(str1, "}", "");
          ManagerExceptioninvpackage.PInterfaceAlpha().PInterfaceAlpha(Manager, paramR, str1);
          PInterfaceAlpha(paramR, m, str1, true);
          continue;
        } 
        if (str.startsWith("reverseIndex")) {
          String[] arrayOfString = j(m.e());
          Manager Manager = paramR.PInterfaceCharlie(arrayOfString[0]);
          if (Manager != null) {
            Manager.ExceptionPrintstacktrace(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, "1"));
            continue;
          } 
          PInterfaceBravo(m, "Constant: " + arrayOfString[0] + " not found.");
          continue;
        } 
        if (str.startsWith("oppositeEndian")) {
          String[] arrayOfString = j(m.e());
          Manager Manager = paramR.PInterfaceCharlie(arrayOfString[0]);
          if (Manager != null) {
            Manager.KInterfaceHotel(true);
            continue;
          } 
          PInterfaceBravo(m, "Constant: " + arrayOfString[0] + " not found.");
          continue;
        } 
        if (str.startsWith("controllerPriority")) {
          String[] arrayOfString = j(m.e());
          Manager Manager = paramR.PInterfaceCharlie(arrayOfString[0]);
          if (Manager != null) {
            Manager.KInterfaceIndia(true);
            continue;
          } 
          PInterfaceBravo(m, "Constant: " + arrayOfString[0] + " not found.");
          continue;
        } 
        if (str.startsWith("noMsqSave") || str.startsWith("noSaveToMsq") || str.startsWith("noLocalUpdate")) {
          String[] arrayOfString = j(m.e());
          Manager Manager = paramR.PInterfaceCharlie(arrayOfString[0]);
          if (Manager != null) {
            Manager.PInterfaceBravo(false);
            continue;
          } 
          PInterfaceBravo(m, "Constant: " + arrayOfString[0] + " not found.");
          continue;
        } 
        if (str.startsWith("maximumElements")) {
          String[] arrayOfString = j(m.e());
          Manager Manager = paramR.PInterfaceCharlie(arrayOfString[0]);
          if (Manager != null) {
            Manager.d(X.ExceptionPrintstacktrace(arrayOfString[1]));
            continue;
          } 
          PInterfaceBravo(m, "Constant: " + arrayOfString[0] + " not found.");
          continue;
        } 
        if (str.startsWith("useMappingTable")) {
          String[] arrayOfString = j(m.e());
          Manager Manager = paramR.PInterfaceCharlie(arrayOfString[0]);
          if (Manager != null && arrayOfString.length > 1) {
            F KInterfaceFoxtrot = F.PInterfaceBravo(paramR.F(), arrayOfString[1]);
            if (KInterfaceFoxtrot != null) {
              Manager.PInterfaceAlpha(KInterfaceFoxtrot);
              continue;
            } 
            PInterfaceBravo(m, "Failed to load Mapping file: " + arrayOfString[1]);
            continue;
          } 
          if (Manager != null) {
            PInterfaceBravo(m, "missing required mapping file.");
            continue;
          } 
          PInterfaceBravo(m, "Constant: " + arrayOfString[0] + " not found.");
          continue;
        } 
        PInterfaceBravo(m, "Unrecognized row, don't know what to do.");
      } catch (Exception exception) {
        PInterfaceAlpha(m, "Syntax Error in " + paramString + ", values not as expected. Message:\n" + exception.getLocalizedMessage());
      } 
    } 
  }
  
  private void PInterfaceBravo(R paramR, J paramJ, String paramString) {
    ArrayList arrayList = PInterfaceAlpha(paramJ, paramR, paramString);
    for (M m : arrayList) {
      try {
        String str = m.KInterfaceFoxtrot();
        String[] arrayOfString = j(m.e());
        if (str.equals("displayCommand")) {
          if (arrayOfString.length < 2) {
            PInterfaceAlpha(m, "Required parameters missing. Proper usage: displayCommand = commandName, \"Displaylabel\"");
            continue;
          } 
          String str1 = KInterfaceFoxtrot(arrayOfString[1]);
          if (!paramR.O().PInterfaceAlpha(arrayOfString[0], str1, true))
            PInterfaceAlpha(m, "controllerCommand not found"); 
          continue;
        } 
        paramR.O().PInterfaceAlpha(str, arrayOfString);
      } catch (Exception exception) {
        PInterfaceAlpha(m, "Syntax Error in " + paramString + ", values not as expected.");
      } 
    } 
  }
  
  private void PInterfaceCharlie(R paramR, GInterfaceBe parambE, J paramJ, String paramString) {
    GComponentAj GComponentAj = null;
    ArrayList arrayList = PInterfaceAlpha(paramJ, paramR, paramString);
    CloneableImplInGPackage CloneableImplInGPackage = null;
    for (M m : arrayList) {
      String str = m.PInterfaceBravo();
      try {
        if (str.startsWith("curve")) {
          CloneableImplInGPackage = new CloneableImplInGPackage();
          CloneableImplInGPackage.s(this.l);
          String[] arrayOfString = j(q(str));
          CloneableImplInGPackage.v(arrayOfString[0]);
          parambE.PInterfaceAlpha((ArrayListExceptionprintstacktraceInGPackage)CloneableImplInGPackage);
          if (arrayOfString.length > 1) {
            GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString[1].trim());
            CloneableImplInGPackage.d(GInterfaceDb);
          } 
          continue;
        } 
        if (str.startsWith("topicHelp") && !PInterfaceAlpha(CloneableImplInGPackage, str)) {
          GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, q(str));
          CloneableImplInGPackage.e(GInterfaceDb);
          if (GInterfaceDb.PInterfaceAlpha().startsWith("http:/") || GInterfaceDb.PInterfaceAlpha().startsWith("file:/")) {
            GComponentAj = new GComponentAj();
            GComponentAj.PInterfaceAlpha(GInterfaceDb);
            GComponentAj.PInterfaceBravo(GInterfaceDb);
            if (CloneableImplInGPackage.M() != null && CloneableImplInGPackage.M().length() > 0) {
              GComponentAj.PInterfaceBravo(CloneableImplInGPackage.M());
            } else {
              GComponentAj.PInterfaceBravo("Web Help");
            } 
            parambE.PInterfaceAlpha(GComponentAj);
          } 
          continue;
        } 
        if (str.startsWith("enabledCondition") && CloneableImplInGPackage != null) {
          String str1 = q(str);
          String str2 = X.PInterfaceBravo(str1, "{", "");
          str2 = X.PInterfaceBravo(str2, "}", "").trim();
          CloneableImplInGPackage.u(str2);
          PInterfaceAlpha(paramR, m, str2, false);
          continue;
        } 
        if (str.startsWith("columnLabel") && !PInterfaceAlpha(CloneableImplInGPackage, str)) {
          String[] arrayOfString = j(q(str));
          byte PInterfaceBravo = 0;
          while (PInterfaceBravo < arrayOfString.length) {
            if (arrayOfString.length > PInterfaceBravo + 1) {
              GInterfaceDb db1 = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString[PInterfaceBravo++].trim());
              CloneableImplInGPackage.PInterfaceCharlie(db1);
              db1 = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString[PInterfaceBravo++].trim());
              CloneableImplInGPackage.PInterfaceAlpha(db1);
              continue;
            } 
            GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString[PInterfaceBravo++].trim());
            CloneableImplInGPackage.PInterfaceAlpha(GInterfaceDb);
          } 
          continue;
        } 
        if (str.startsWith("xAxis") && !PInterfaceAlpha(CloneableImplInGPackage, str)) {
          String[] arrayOfString = j(q(str));
          CloneableImplInGPackage.PInterfaceCharlie(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[0]));
          CloneableImplInGPackage.d(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[1]));
          if (arrayOfString.length > 2)
            CloneableImplInGPackage.KInterfaceHotel(X.ExceptionPrintstacktrace(arrayOfString[2].trim())); 
          continue;
        } 
        if (str.startsWith("yAxis") && !PInterfaceAlpha(CloneableImplInGPackage, str)) {
          String[] arrayOfString = j(q(str));
          CloneableImplInGPackage.PInterfaceAlpha(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[0]));
          CloneableImplInGPackage.PInterfaceBravo(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[1]));
          if (arrayOfString.length > 2)
            CloneableImplInGPackage.ExceptionPrintstacktrace(X.ExceptionPrintstacktrace(arrayOfString[2].trim())); 
          continue;
        } 
        if (str.startsWith("xBins") && !PInterfaceAlpha(CloneableImplInGPackage, str)) {
          String[] arrayOfString = j(q(str));
          String str1 = X.PInterfaceBravo(arrayOfString[0].trim(), "\"", "");
          if (paramR.PInterfaceCharlie(str1) == null)
            PInterfaceAlpha(m, "CurveGraph xBin not PInterfaceAlpha valid Constant."); 
          CloneableImplInGPackage.PInterfaceCharlie(str1);
          if (arrayOfString.length > 1)
            CloneableImplInGPackage.d(arrayOfString[1].trim()); 
          if (arrayOfString.length > 2 && arrayOfString[2].equals("readOnly"))
            CloneableImplInGPackage.e(true); 
          continue;
        } 
        if (str.startsWith("yBins") && !PInterfaceAlpha(CloneableImplInGPackage, str)) {
          String str2;
          String[] arrayOfString = j(q(str));
          byte PInterfaceBravo = 0;
          String str1 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++].trim(), "\"", "");
          if (paramR.PInterfaceCharlie(str1) == null)
            PInterfaceAlpha(m, "CurveGraph yBin not PInterfaceAlpha valid Constant."); 
          if (arrayOfString.length > PInterfaceBravo && !arrayOfString[PInterfaceBravo].startsWith("{"))
            CloneableImplInGPackage.PInterfaceBravo(arrayOfString[PInterfaceBravo++].trim()); 
          if (arrayOfString.length > PInterfaceBravo) {
            str2 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
            str2 = X.PInterfaceBravo(str2, "}", "");
          } else {
            str2 = "";
          } 
          CloneableImplInGPackage.PInterfaceAlpha(str1, str2);
          continue;
        } 
        if (str.startsWith("lineLabel") && !PInterfaceAlpha(CloneableImplInGPackage, str)) {
          String[] arrayOfString = j(q(str));
          GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString[0].trim());
          CloneableImplInGPackage.PInterfaceBravo(GInterfaceDb);
          continue;
        } 
        if (str.startsWith("gauge") && !PInterfaceAlpha(CloneableImplInGPackage, str)) {
          String[] arrayOfString = j(q(str));
          if (arrayOfString.length > 0)
            CloneableImplInGPackage.e(arrayOfString[0].trim()); 
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("showTextValues") && !PInterfaceAlpha(CloneableImplInGPackage, str)) {
          String[] arrayOfString = j(q(str));
          if (arrayOfString.length > 0)
            try {
              CloneableImplInGPackage.PInterfaceAlpha(Boolean.parseBoolean(arrayOfString[0].trim()));
            } catch (Exception exception) {
              PInterfaceBravo(m, "showTextValues expects true or false");
            }  
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("size") && !PInterfaceAlpha(CloneableImplInGPackage, str)) {
          String[] arrayOfString = j(q(str));
          if (arrayOfString.length != 2)
            PInterfaceBravo(m, "CurvePanel suggestedSize should have 2 values\nsuggestedSize = width, height"); 
          A PInterfaceAlpha = new A(X.ExceptionPrintstacktrace(arrayOfString[0]), X.ExceptionPrintstacktrace(arrayOfString[1]));
          CloneableImplInGPackage.PInterfaceAlpha(PInterfaceAlpha);
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("showXYDataPlot") && !PInterfaceAlpha(CloneableImplInGPackage, str)) {
          String[] arrayOfString = j(q(str));
          if (arrayOfString.length < 3) {
            PInterfaceBravo(m, "CurvePanel showXYDataPlot must have at least 3 values\nshowXYDataPlot = displayByDefaultBoolean, xFieldName, yFieldName, [ DataDisplayCondition ] }");
            continue;
          } 
          CloneableImplInGPackage.KInterfaceFoxtrot(Boolean.parseBoolean(arrayOfString[0]));
          CloneableImplInGPackage.KInterfaceFoxtrot(arrayOfString[1]);
          CloneableImplInGPackage.ExceptionPrintstacktrace(arrayOfString[2]);
          if (arrayOfString.length > 3) {
            String str1 = arrayOfString[3];
            str1 = X.PInterfaceBravo(str1, "{", "");
            str1 = X.PInterfaceBravo(str1, "}", "");
            CloneableImplInGPackage.KInterfaceHotel(str1);
          } 
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("userPassword")) {
          String str1 = m.e();
          Manager Manager = paramR.PInterfaceCharlie(str1);
          if (Manager != null && Manager.z() >= 4) {
            CloneableImplInGPackage.z(str1);
            paramR.PInterfaceCharlie(true);
            continue;
          } 
          PInterfaceBravo(m, "Invalid value for userPassword Parameter. Must CloneableImpl the name of PInterfaceAlpha defined U32 Constant. Invalid Value: " + str1);
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("suppressGraph")) {
          if (m.e().toLowerCase().equals("true") || m.e().toLowerCase().equals("false")) {
            boolean bool = Boolean.parseBoolean(m.e());
            if (bool) {
              CloneableImplInGPackage.e((GInterfaceDj)new B(1.0D));
              continue;
            } 
            CloneableImplInGPackage.e((GInterfaceDj)new B(0.0D));
            continue;
          } 
          String str1 = m.e();
          str1 = X.PInterfaceBravo(str1, "{", "");
          str1 = X.PInterfaceBravo(str1, "}", "");
          CloneableImplInGPackage.e(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, str1));
          PInterfaceAlpha(paramR, m, str1, false);
          continue;
        } 
        PInterfaceBravo(m, "Unrecognizedd entry. Do not know how to handle ini row.");
      } catch (Exception exception) {
        PInterfaceAlpha(m, "Syntax Error in " + paramString + ", values not as expected.");
      } 
    } 
  }
  
  private void d(R paramR, GInterfaceBe parambE, J paramJ, String paramString) {
    ArrayList arrayList = PInterfaceAlpha(paramJ, paramR, paramString);
    for (M m : arrayList) {
      try {
        if (m.KInterfaceFoxtrot().equals("showPanel")) {
          String[] arrayOfString = j(m.e());
          GInterfaceAm GInterfaceAm = new GInterfaceAm(paramR);
          GInterfaceAm.PInterfaceCharlie("showPanel");
          GInterfaceAm.PInterfaceBravo(arrayOfString[0]);
          GInterfaceAm.PInterfaceAlpha(arrayOfString[1]);
          parambE.PInterfaceAlpha(GInterfaceAm);
          continue;
        } 
        PInterfaceBravo(m, "Unrecognized entry. Ignoring.");
      } catch (Exception exception) {
        PInterfaceAlpha(m, "Syntax Error.");
      } 
    } 
  }
  
  private void e(R paramR, GInterfaceBe parambE, J paramJ, String paramString) {
    ArrayList arrayList = PInterfaceAlpha(paramJ, paramR, paramString);
    ArrayList aA1 = null;
    ArrayList aA2 = null;
    String str = null;
    for (M m : arrayList) {
      PInterfaceAlpha(m);
      String str1 = m.PInterfaceBravo();
      try {
        if (str1.startsWith("menuDialog")) {
          str = q(str1);
          aA2 = null;
          aA1 = null;
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("menu")) {
          aA2 = null;
          aA1 = PInterfaceAlpha(parambE, m, str);
          PInterfaceAlpha(paramR, m, aA1.aJ(), false);
          if (str != null && !str.equals("main")) {
            ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage = parambE.PInterfaceCharlie(str);
            if (ArrayListExceptionprintstacktraceInGPackage == null) {
              PInterfaceBravo(m, "Menu: " + aA1.e() + " not added, menu dialog \"" + str + "\" not found");
              continue;
            } 
            ArrayListExceptionprintstacktraceInGPackage.PInterfaceAlpha(aA1);
          } 
          continue;
        } 
        if (str1.startsWith("subMenu")) {
          aA2 = null;
          if (aA1 == null) {
            PInterfaceAlpha(m, "Adding subMenu before main menu defined");
            continue;
          } 
          ArrayList ArrayList = PInterfaceAlpha(m, true);
          PInterfaceAlpha(paramR, m, ArrayList.aJ(), false);
          if (parambE.PInterfaceCharlie(ArrayList.d()) == null && PInterfaceCharlie(ArrayList.d()))
            PInterfaceAlpha(paramR, ArrayList.d(), ArrayList.KInterfaceFoxtrot()); 
          if (parambE.PInterfaceCharlie(ArrayList.d()) == null && !PInterfaceCharlie(ArrayList.d()) && parambE.PInterfaceBravo(ArrayList.d()) == null)
            PInterfaceBravo(m, "Unknown Menu Target: " + ArrayList.d()); 
          aA1.PInterfaceAlpha(ArrayList);
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("groupMenu")) {
          if (aA1 == null) {
            PInterfaceAlpha(m, "Adding groupMenu before main menu defined");
            continue;
          } 
          String str2 = m.e();
          String[] arrayOfString = j(str2);
          aA2 = new ArrayList();
          byte PInterfaceBravo = 0;
          if (!arrayOfString[PInterfaceBravo].contains("\""))
            aA2.v(arrayOfString[PInterfaceBravo++]); 
          String str3 = KInterfaceFoxtrot(arrayOfString[PInterfaceBravo++]);
          aA2.PInterfaceBravo(str3);
          aA2.d(str3);
          if (arrayOfString.length > PInterfaceBravo) {
            String str4 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
            str4 = X.PInterfaceBravo(str4, "}", "");
            aA2.u(str4);
            PInterfaceAlpha(paramR, m, aA2.aJ(), false);
          } 
          if (arrayOfString.length > PInterfaceBravo) {
            String str4 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
            str4 = X.PInterfaceBravo(str4, "}", "");
            aA2.e(str4);
            PInterfaceAlpha(paramR, m, aA2.aJ(), false);
          } 
          aA1.PInterfaceAlpha(aA2);
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("groupChildMenu")) {
          if (aA2 == null) {
            PInterfaceAlpha(m, "Adding menuGroupChild before menuGroup defined");
            continue;
          } 
          ArrayList ArrayList = PInterfaceAlpha(m, true);
          PInterfaceAlpha(paramR, m, ArrayList.aJ(), false);
          if (parambE.PInterfaceCharlie(ArrayList.d()) == null && PInterfaceCharlie(ArrayList.d()))
            PInterfaceAlpha(paramR, ArrayList.d(), ArrayList.KInterfaceFoxtrot()); 
          if (parambE.PInterfaceCharlie(ArrayList.d()) == null && !PInterfaceCharlie(ArrayList.d()) && parambE.PInterfaceBravo(ArrayList.d()) == null)
            PInterfaceBravo(m, "Unknown Menu Target: " + ArrayList.d()); 
          aA2.PInterfaceAlpha(ArrayList);
          continue;
        } 
        if (str1.startsWith("removeSubMenu")) {
          if (aA1 == null)
            PInterfaceAlpha(m, "removeSubMenu before main menu defined"); 
          String[] arrayOfString = j(m.e());
          if (arrayOfString == null || arrayOfString.length < 1) {
            PInterfaceBravo(m, "At least 1 value refering to the target dialog is required.");
            continue;
          } 
          paramR.e().PInterfaceAlpha(aA1.KInterfaceHotel(), arrayOfString[0]);
          continue;
        } 
        if (str1.startsWith("updateSubMenuLabel")) {
          if (aA1 == null)
            PInterfaceAlpha(m, "updateSubMenuLabel before main menu defined"); 
          String[] arrayOfString = j(m.e());
          if (arrayOfString == null || arrayOfString.length < 2) {
            PInterfaceBravo(m, "At least 2 attributes. \"updateSubMenuLabel = [CurrentTarget], [new label]\"");
            continue;
          } 
          String str2 = KInterfaceFoxtrot(arrayOfString[1]);
          aA1.PInterfaceAlpha(aA1.KInterfaceHotel(), arrayOfString[0], str2);
          continue;
        } 
        if (str1.startsWith("replaceSubMenu")) {
          if (aA1 == null)
            PInterfaceAlpha(m, "replaceSubMenu before main menu defined"); 
          String[] arrayOfString = j(m.e());
          if (arrayOfString == null || arrayOfString.length < 1) {
            PInterfaceBravo(m, "At least 3 attributes. \"replaceSubMenu = [cargetOfReplace], [newTarget], [newLabel]\"");
            continue;
          } 
          ArrayList ArrayList = PInterfaceAlpha(m, true);
          PInterfaceAlpha(paramR, m, ArrayList.aJ(), false);
          if (parambE.PInterfaceCharlie(ArrayList.d()) == null && PInterfaceCharlie(ArrayList.d()))
            PInterfaceAlpha(paramR, ArrayList.d(), ArrayList.KInterfaceFoxtrot()); 
          if (parambE.PInterfaceCharlie(ArrayList.d()) == null && !PInterfaceCharlie(ArrayList.d()) && parambE.PInterfaceBravo(ArrayList.d()) == null)
            PInterfaceBravo(m, "Unknown Menu Target: " + ArrayList.d()); 
          aA1.PInterfaceAlpha(arrayOfString[0], ArrayList);
          continue;
        } 
        if (str1.startsWith("plugIn"))
          continue; 
        PInterfaceBravo(m, "[Menu] Row not understood, unknown keyword: " + m.KInterfaceFoxtrot() + ". Please check syntax.");
      } catch (Exception exception) {
        PInterfaceAlpha(m, "Malformed ini in " + paramString + ", I don't know how to handle.");
      } 
    } 
    paramR.PInterfaceAlpha(parambE);
  }
  
  private ArrayList PInterfaceAlpha(GInterfaceBe parambE, M paramM, String paramString) {
    ArrayList ArrayList = PInterfaceAlpha(paramM, false);
    for (ArrayList aA1 : parambE.PInterfaceCharlie()) {
      if (aA1.KInterfaceHotel().equals(ArrayList.KInterfaceHotel())) {
        aA1.e(ArrayList.KInterfaceIndia());
        aA1.u(ArrayList.aJ());
        return aA1;
      } 
    } 
    if (paramString == null || paramString.equals("main"))
      parambE.PInterfaceAlpha(ArrayList); 
    return ArrayList;
  }
  
  private ArrayList PInterfaceAlpha(M paramM, boolean paramBoolean) {
    String str = paramM.e();
    ArrayList ArrayList = new ArrayList();
    ArrayList.s(this.l);
    if (str.indexOf("\"     ") > 0)
      PInterfaceBravo(paramM, "Ini entry missing comma, repaired."); 
    String[] arrayOfString = j(str);
    byte PInterfaceBravo = 0;
    if (paramM.KInterfaceFoxtrot().equals("replaceSubMenu"))
      PInterfaceBravo++; 
    if (paramBoolean) {
      String str1 = arrayOfString[PInterfaceBravo++];
      if (str1.equals("std_separator")) {
        ArrayList.PInterfaceAlpha(true);
        return ArrayList;
      } 
      ArrayList.PInterfaceAlpha(str1);
    } 
    try {
      String str1 = "";
      String str2 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++].trim(), "\"", "");
      ArrayList.d(str2);
      if (str2.indexOf("&") != -1) {
        int KInterfaceIndia = str2.indexOf("&");
        str1 = str2.substring(KInterfaceIndia + 1, KInterfaceIndia + 2);
        ArrayList.PInterfaceCharlie(str1);
      } 
      str2 = X.PInterfaceBravo(str2, "&", "");
      ArrayList.PInterfaceBravo(str2);
      if (paramBoolean && arrayOfString.length > PInterfaceBravo)
        try {
          if (I.PInterfaceAlpha(arrayOfString[PInterfaceBravo]))
            ArrayList.PInterfaceAlpha((int)I.PInterfaceBravo(arrayOfString[PInterfaceBravo++].trim())); 
        } catch (Exception exception) {} 
      if (arrayOfString.length > PInterfaceBravo) {
        String str3 = arrayOfString[PInterfaceBravo++];
        str3 = X.PInterfaceBravo(str3, "{", "");
        str3 = X.PInterfaceBravo(str3, "}", "").trim();
        ArrayList.u(str3);
      } 
      if (arrayOfString.length > PInterfaceBravo) {
        String str3 = arrayOfString[PInterfaceBravo++];
        str3 = X.PInterfaceBravo(str3, "{", "");
        str3 = X.PInterfaceBravo(str3, "}", "").trim();
        ArrayList.e(str3);
      } 
    } catch (Exception exception) {
      PInterfaceBravo(paramM, "Error paring Menu.");
      exception.printStackTrace();
    } 
    return ArrayList;
  }
  
  private boolean PInterfaceAlpha(Object paramObject, String paramString) {
    if (paramObject != null)
      return false; 
    D.PInterfaceBravo("ini error, Tried to load row: \n\t" + paramString + "\n\tbut Object not initialized.");
    return true;
  }
  
  private GComponentBj d(String paramString) {
    GComponentBj GComponentBj = new GComponentBj();
    GComponentBj.s(this.l);
    String str1 = q(paramString);
    String[] arrayOfString = j(str1);
    byte PInterfaceBravo = 0;
    String str2 = arrayOfString[PInterfaceBravo++];
    str2 = X.PInterfaceBravo(str2, "\"", "");
    if (str2 != null && !str2.equals(""))
      GComponentBj.s(str2.trim()); 
    String str3 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", "");
    GComponentBj.PInterfaceAlpha(str3);
    String str4 = arrayOfString[PInterfaceBravo++];
    GComponentBj.PInterfaceBravo(str4);
    if (arrayOfString.length > PInterfaceBravo) {
      String str = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
      str = X.PInterfaceBravo(str, "}", "").trim();
      GComponentBj.PInterfaceCharlie(str);
    } 
    return GComponentBj;
  }
  
  private GComponentBq PInterfaceAlpha(R paramR, M paramM) {
    GComponentBq GComponentBq = new GComponentBq();
    return PInterfaceAlpha(paramR, paramM, GComponentBq);
  }
  
  private GComponentBq PInterfaceAlpha(R paramR, M paramM, GComponentBq parambq) {
    String str1 = paramM.PInterfaceBravo();
    parambq.s(this.l);
    String str2 = q(str1);
    String[] arrayOfString = j(str2);
    byte PInterfaceBravo = 0;
    String str3 = arrayOfString[PInterfaceBravo++];
    str3 = X.PInterfaceBravo(str3, "\"", "");
    if (str3.startsWith("!")) {
      parambq.PInterfaceAlpha(true);
      str3 = str3.substring(1);
    } else if (str3.startsWith("#")) {
      parambq.PInterfaceBravo(true);
      str3 = str3.substring(1);
    } 
    parambq.PInterfaceBravo(GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, str3));
    if (arrayOfString.length > PInterfaceBravo) {
      String str = arrayOfString[PInterfaceBravo++];
      if (str.startsWith("{") && str.endsWith("}")) {
        try {
          GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, str);
          parambq.PInterfaceAlpha(GInterfaceDb);
          str = null;
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          PInterfaceAlpha(paramM, "Error in String expression");
        } 
      } else if (str.indexOf("[") > 0) {
        String str4 = str.substring(0, str.indexOf("["));
        String str5 = str.substring(str.indexOf("["));
        str5 = X.PInterfaceBravo(str5, "[", "");
        str5 = X.PInterfaceBravo(str5, "]", "");
        parambq.PInterfaceAlpha(X.ExceptionPrintstacktrace(str5));
        str = str4;
      } 
      parambq.PInterfaceBravo(str);
    } 
    if (parambq instanceof GComponentBk && arrayOfString.length > PInterfaceBravo) {
      String str = arrayOfString[PInterfaceBravo++];
      if (paramR.ExceptionPrintstacktrace(str) == null) {
        PInterfaceBravo(paramM, str + " not defined as an OutputChannel! Ignored");
      } else {
        ((GComponentBk)parambq).PInterfaceAlpha(str);
      } 
    } 
    if (arrayOfString.length > PInterfaceBravo) {
      String str = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
      str = X.PInterfaceBravo(str, "}", "").trim();
      parambq.u(str);
    } 
    if (arrayOfString.length > PInterfaceBravo) {
      String str = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
      str = X.PInterfaceBravo(str, "}", "").trim();
      parambq.KInterfaceFoxtrot(str);
    } 
    if (arrayOfString.length > PInterfaceBravo) {
      String str = arrayOfString[PInterfaceBravo++];
      if (str.equals("displayInHex")) {
        parambq.e(true);
      } else {
        PInterfaceBravo(paramM, "Unknown 5th position attribute: " + str + ", known field Attribute: displayInHex");
      } 
    } 
    return parambq;
  }
  
  private GComponentBq PInterfaceBravo(R paramR, M paramM) {
    String str1 = paramM.PInterfaceBravo();
    GComponentBq GComponentBq = new GComponentBq();
    GComponentBq.s(this.l);
    String str2 = q(str1);
    String[] arrayOfString = j(str2);
    byte PInterfaceBravo = 0;
    String str3 = arrayOfString[PInterfaceBravo++];
    str3 = X.PInterfaceBravo(str3, "\"", "");
    if (str3.startsWith("!")) {
      GComponentBq.PInterfaceAlpha(true);
      str3 = str3.substring(1);
    } else if (str3.startsWith("#")) {
      GComponentBq.PInterfaceBravo(true);
      str3 = str3.substring(1);
    } 
    GComponentBq.PInterfaceBravo(GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, str3));
    if (arrayOfString.length > PInterfaceBravo) {
      String str = arrayOfString[PInterfaceBravo++];
      GComponentBq.PInterfaceBravo(str);
    } 
    if (arrayOfString.length > PInterfaceBravo) {
      String str = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
      str = X.PInterfaceBravo(str, "}", "").trim();
      GComponentBq.u(str);
    } 
    if (arrayOfString.length > PInterfaceBravo) {
      String str = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
      str = X.PInterfaceBravo(str, "}", "").trim();
      GComponentBq.KInterfaceFoxtrot(str);
    } 
    if (arrayOfString.length > PInterfaceBravo) {
      String str = arrayOfString[PInterfaceBravo++];
      if (str.equals("displayInHex")) {
        GComponentBq.e(true);
      } else {
        PInterfaceBravo(paramM, "Unknown 5th position attribute: " + str + ", known field Attribute: displayInHex");
      } 
    } 
    return GComponentBq;
  }
  
  private GComponentBy PInterfaceCharlie(R paramR, M paramM) {
    String str1 = paramM.PInterfaceBravo();
    GComponentBy GComponentBy = new GComponentBy();
    GComponentBy.s(this.l);
    String str2 = q(str1);
    String[] arrayOfString = j(str2);
    byte PInterfaceBravo = 0;
    String str3 = arrayOfString[PInterfaceBravo++];
    if (str3.equals("horizontal")) {
      GComponentBy.KInterfaceFoxtrot(true);
    } else if (!str3.equals("vertical")) {
      PInterfaceBravo(paramM, "Orientation must CloneableImpl horizontal or vertical. Unknown value: " + str3);
    } 
    String str4 = arrayOfString[PInterfaceBravo++];
    str4 = X.PInterfaceBravo(str4, "\"", "");
    GComponentBy.PInterfaceBravo(GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, str4));
    if (arrayOfString.length > PInterfaceBravo) {
      String str = arrayOfString[PInterfaceBravo++];
      if (str.startsWith("{") && str.endsWith("}"))
        try {
          GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, str);
          GComponentBy.PInterfaceAlpha(GInterfaceDb);
          str = null;
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          PInterfaceAlpha(paramM, "Error in String expression");
        }  
      GComponentBy.PInterfaceBravo(str);
    } 
    if (arrayOfString.length > PInterfaceBravo) {
      String str = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
      str = X.PInterfaceBravo(str, "}", "").trim();
      GComponentBy.u(str);
    } 
    if (arrayOfString.length > PInterfaceBravo) {
      String str = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
      str = X.PInterfaceBravo(str, "}", "").trim();
      GComponentBy.KInterfaceFoxtrot(str);
    } 
    return GComponentBy;
  }
  
  private GInterfaceBc d(R paramR, M paramM) {
    String str1 = paramM.PInterfaceBravo();
    GInterfaceBc GInterfaceBc = new GInterfaceBc();
    GInterfaceBc.s(this.l);
    String str2 = q(str1);
    String[] arrayOfString = j(str2);
    byte PInterfaceBravo = 0;
    String str3 = arrayOfString[PInterfaceBravo++];
    str3 = X.PInterfaceBravo(str3, "\"", "");
    if (str3.startsWith("!")) {
      GInterfaceBc.PInterfaceAlpha(true);
      str3 = str3.substring(1);
    } else if (str3.startsWith("#")) {
      GInterfaceBc.PInterfaceBravo(true);
      str3 = str3.substring(1);
    } 
    GInterfaceBc.PInterfaceBravo(GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, str3));
    if (arrayOfString.length > PInterfaceBravo) {
      String str = arrayOfString[PInterfaceBravo++];
      if (str.indexOf("[") > 0) {
        String str4 = str.substring(0, str.indexOf("["));
        String str5 = str.substring(str.indexOf("["));
        str5 = X.PInterfaceBravo(str5, "[", "");
        str5 = X.PInterfaceBravo(str5, "]", "");
        GInterfaceBc.PInterfaceAlpha(X.ExceptionPrintstacktrace(str5));
        str = str4;
      } 
      GInterfaceBc.PInterfaceBravo(str);
    } 
    if (arrayOfString.length > PInterfaceBravo) {
      String str = arrayOfString[PInterfaceBravo++];
      if (str.equals("horizontal")) {
        GInterfaceBc.PInterfaceCharlie(GInterfaceBc.PInterfaceAlpha);
      } else if (str.equals("vertical")) {
        GInterfaceBc.PInterfaceCharlie(GInterfaceBc.PInterfaceBravo);
      } else {
        PInterfaceBravo(paramM, "Unknown Slider orientation: " + str + ", valid values: (horizontal, vertical). using default: horizontal");
        GInterfaceBc.PInterfaceCharlie(GInterfaceBc.PInterfaceAlpha);
      } 
    } 
    if (arrayOfString.length > PInterfaceBravo) {
      String str = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
      str = X.PInterfaceBravo(str, "}", "").trim();
      GInterfaceBc.u(str);
    } 
    return GInterfaceBc;
  }
  
  private E e(R paramR, M paramM) {
    E e = new E();
    e.s(this.l);
    String[] arrayOfString = j(paramM.e());
    e.PInterfaceBravo(GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString[0]));
    e.PInterfaceAlpha(arrayOfString[1]);
    e.PInterfaceBravo(arrayOfString[2]);
    byte PInterfaceBravo = 3;
    while (arrayOfString.length > PInterfaceBravo && !arrayOfString[PInterfaceBravo].trim().startsWith("{")) {
      if (PInterfaceBravo == 3) {
        String str1 = arrayOfString[PInterfaceBravo++];
        e.PInterfaceCharlie(str1);
        continue;
      } 
      String str = arrayOfString[PInterfaceBravo++];
      try {
        e.d(str);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        PInterfaceBravo(paramM, ExceptionPrintstacktrace.getLocalizedMessage());
      } 
    } 
    if (arrayOfString.length > PInterfaceBravo) {
      String str = arrayOfString[PInterfaceBravo++];
      str = X.PInterfaceBravo(str, "{", "");
      str = X.PInterfaceBravo(str, "}", "");
      e.u(str);
    } 
    if (arrayOfString.length > PInterfaceBravo) {
      String str = arrayOfString[PInterfaceBravo++];
      str = X.PInterfaceBravo(str, "{", "");
      str = X.PInterfaceBravo(str, "}", "");
      e.KInterfaceFoxtrot(str);
    } 
    return e;
  }
  
  private D KInterfaceFoxtrot(R paramR, M paramM) {
    D d = new D();
    d.s(this.l);
    String[] arrayOfString = j(paramM.e());
    d.PInterfaceBravo(GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString[0]));
    d.PInterfaceAlpha(arrayOfString[1]);
    if (arrayOfString.length > 2) {
      String str = arrayOfString[2];
      str = X.PInterfaceBravo(str, "{", "");
      str = X.PInterfaceBravo(str, "}", "");
      d.u(str);
    } 
    if (arrayOfString.length > 3) {
      String str = arrayOfString[3];
      str = X.PInterfaceBravo(str, "{", "");
      str = X.PInterfaceBravo(str, "}", "");
      d.KInterfaceFoxtrot(str);
    } 
    return d;
  }
  
  private C ExceptionPrintstacktrace(R paramR, M paramM) {
    C PInterfaceCharlie = new C();
    PInterfaceCharlie.s(this.l);
    String[] arrayOfString = j(paramM.e());
    PInterfaceCharlie.PInterfaceBravo(GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString[0]));
    PInterfaceCharlie.PInterfaceAlpha(arrayOfString[1]);
    if (arrayOfString.length > 2) {
      String str = arrayOfString[2];
      str = X.PInterfaceBravo(str, "{", "");
      str = X.PInterfaceBravo(str, "}", "");
      PInterfaceCharlie.u(str);
    } 
    if (arrayOfString.length > 3) {
      String str = arrayOfString[3];
      str = X.PInterfaceBravo(str, "{", "");
      str = X.PInterfaceBravo(str, "}", "");
      PInterfaceCharlie.KInterfaceFoxtrot(str);
    } 
    return PInterfaceCharlie;
  }
  
  protected void PInterfaceAlpha(R paramR, M paramM, String paramString, boolean paramBoolean) {
    PInterfaceAlpha(paramR, paramM, paramString, (String)null, paramBoolean);
  }
  
  protected void PInterfaceAlpha(R paramR, M paramM, String paramString1, String paramString2, boolean paramBoolean) {
    if (PInterfaceAlpha() && paramString1 != null && !paramString1.equals("")) {
      if (paramString1.startsWith("{"))
        paramString1 = paramString1.substring(1, paramString1.length() - 1); 
      try {
        if (paramString1.contains("%INDEX%"))
          paramString1 = X.PInterfaceBravo(paramString1, "%INDEX%", "0"); 
        double d = KInterfaceIndia.PInterfaceAlpha(paramString1, (GInterfaceAi)paramR);
      } catch (Exception exception) {
        if (exception instanceof java.io.FileNotFoundException) {
          PInterfaceAlpha(paramM, exception.getLocalizedMessage());
        } else if (!(exception instanceof ax.u)) {
          String str = (paramString2 == null) ? exception.getMessage() : (paramString2 + " \n" + exception.getMessage());
          if (paramBoolean) {
            Logger.getLogger(ab.class.getName()).log(Level.WARNING, paramString2, exception);
            PInterfaceAlpha(paramM, str);
          } else {
            PInterfaceBravo(paramM, str);
          } 
        } 
      } catch (StackOverflowError stackOverflowError) {
        PInterfaceAlpha(paramM, "Circular Dependency! Formula can not reference itself.");
      } 
    } 
  }
  
  protected void PInterfaceAlpha(R paramR, SerializableImplTostring parambR, String paramString1, String paramString2, boolean paramBoolean) {
    if (PInterfaceAlpha() && parambR != null && parambR.PInterfaceCharlie() != null && !parambR.PInterfaceCharlie().equals("")) {
      if (paramString1.equals("toggleSwitchOn"))
        D.PInterfaceCharlie("break: 48s35"); 
      try {
        String str = parambR.PInterfaceCharlie();
        if (str.contains("%INDEX%"))
          str = X.PInterfaceBravo(str, "%INDEX%", "0"); 
        double d = KInterfaceIndia.PInterfaceAlpha(str, (GInterfaceAi)paramR);
      } catch (Exception exception) {
        if (!(exception instanceof ax.u)) {
          String str = "expression error in ini entry for " + paramString1 + ", attribute: " + paramString2 + "\n" + exception.getMessage();
          exception.printStackTrace();
          if (paramBoolean) {
            D.PInterfaceAlpha(str);
          } else {
            D.PInterfaceBravo(str);
          } 
        } 
      } catch (StackOverflowError stackOverflowError) {
        String str = "Circular Dependency! Formula can not reference itself. Ini entry " + paramString1 + ", attribute: " + paramString2 + ", expression:" + parambR.PInterfaceCharlie();
        D.PInterfaceAlpha(str);
      } 
    } 
  }
  
  private void e(R paramR, J paramJ) {
    ArrayList<M> arrayList = PInterfaceAlpha(paramJ, paramR, "OutputChannels");
    M m = null;
    int KInterfaceIndia = 0;
    int j = 0;
    byte PInterfaceBravo;
    for (PInterfaceBravo = 0; PInterfaceBravo < arrayList.size(); PInterfaceBravo++) {
      try {
        m = arrayList.get(PInterfaceBravo);
        String str = m.KInterfaceFoxtrot();
        if (str.equals("scatteredOffsetArray")) {
          Manager Manager = paramR.PInterfaceCharlie(m.e());
          if (Manager == null) {
            PInterfaceAlpha(m, "Constant Not Found: " + m.e());
          } else if (!Manager.KInterfaceIndia().equals("array")) {
            PInterfaceAlpha(m, "scatteredOffsetArray must CloneableImpl of type array");
          } else {
            paramR.O().p(m.e());
          } 
        } else if (str.equals("scatteredGetEnabled")) {
          GInterfaceDj GInterfaceDj = GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, m.e());
          paramR.O().e(GInterfaceDj);
        } else if (!F.PInterfaceAlpha(str)) {
          SerializableImpl SerializableImpl = PInterfaceAlpha(m, paramR, KInterfaceIndia, j);
          boolean bool = (paramR.O() == null || paramR.O().e()) ? true : false;
          SerializableImpl.PInterfaceAlpha(bool);
          paramR.PInterfaceAlpha(SerializableImpl);
          if (!SerializableImpl.PInterfaceBravo().equals("formula")) {
            KInterfaceIndia = SerializableImpl.PInterfaceAlpha() + SerializableImpl.l();
            j = SerializableImpl.PInterfaceAlpha();
          } 
        } 
      } catch (Exception exception) {
        PInterfaceAlpha(m, "Malformed [OutputChannel] entry");
      } 
    } 
    for (PInterfaceBravo = 0; PInterfaceBravo < arrayList.size(); PInterfaceBravo++) {
      try {
        m = arrayList.get(PInterfaceBravo);
        String str = m.KInterfaceFoxtrot();
        if (!F.PInterfaceAlpha(str) && !str.equals("scatteredOffsetArray") && !str.equals("scatteredGetEnabled")) {
          SerializableImpl SerializableImpl = paramR.ExceptionPrintstacktrace(str);
          if (SerializableImpl != null && SerializableImpl.k() != null && !SerializableImpl.k().contains("AppEvent."))
            PInterfaceAlpha(paramR, m, SerializableImpl.k(), true); 
          if (SerializableImpl.ExceptionPrintstacktrace() instanceof SerializableImplTostring) {
            SerializableImplTostring SerializableImplTostring = (SerializableImplTostring)SerializableImpl.ExceptionPrintstacktrace();
            PInterfaceAlpha(paramR, m, SerializableImplTostring.PInterfaceCharlie(), true);
          } 
          if (SerializableImpl.j() instanceof SerializableImplTostring) {
            SerializableImplTostring SerializableImplTostring = (SerializableImplTostring)SerializableImpl.j();
            PInterfaceAlpha(paramR, m, SerializableImplTostring.PInterfaceCharlie(), true);
          } 
        } 
      } catch (Exception exception) {
        PInterfaceAlpha(m, "Malformed [OutputChannel] entry");
      } 
    } 
  }
  
  private void PInterfaceCharlie(R paramR, J paramJ, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: aload_1
    //   3: aload_3
    //   4: invokevirtual PInterfaceAlpha : (LW/J;LG/R;Ljava/lang/String;)Ljava/util/ArrayList;
    //   7: astore #4
    //   9: aconst_null
    //   10: astore #5
    //   12: iconst_0
    //   13: istore #6
    //   15: iconst_0
    //   16: istore #7
    //   18: aload_3
    //   19: ldc 'ExtendedReplay'
    //   21: invokevirtual equals : (Ljava/lang/Object;)Z
    //   24: istore #8
    //   26: invokestatic PInterfaceAlpha : ()LG/KInterfaceHotel;
    //   29: new java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial <init> : ()V
    //   36: aload_1
    //   37: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   40: ldc_w '_Replay'
    //   43: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: invokevirtual toString : ()Ljava/lang/String;
    //   49: invokevirtual PInterfaceAlpha : (Ljava/lang/String;)LG/GInterfaceAi;
    //   52: astore #9
    //   54: aload #9
    //   56: ifnonnull -> 77
    //   59: new H/e
    //   62: dup
    //   63: aload_1
    //   64: invokespecial <init> : (LG/R;)V
    //   67: astore #9
    //   69: invokestatic PInterfaceAlpha : ()LG/KInterfaceHotel;
    //   72: aload #9
    //   74: invokevirtual PInterfaceAlpha : (LG/GInterfaceAi;)V
    //   77: invokestatic PInterfaceAlpha : ()LG/KInterfaceHotel;
    //   80: new java/lang/StringBuilder
    //   83: dup
    //   84: invokespecial <init> : ()V
    //   87: aload_1
    //   88: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   91: ldc_w '_ExtendedReplay'
    //   94: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: invokevirtual toString : ()Ljava/lang/String;
    //   100: invokevirtual PInterfaceAlpha : (Ljava/lang/String;)LG/GInterfaceAi;
    //   103: astore #10
    //   105: aload #10
    //   107: ifnonnull -> 128
    //   110: new H/d
    //   113: dup
    //   114: aload_1
    //   115: invokespecial <init> : (LG/R;)V
    //   118: astore #10
    //   120: invokestatic PInterfaceAlpha : ()LG/KInterfaceHotel;
    //   123: aload #10
    //   125: invokevirtual PInterfaceAlpha : (LG/GInterfaceAi;)V
    //   128: iconst_0
    //   129: istore #11
    //   131: iload #11
    //   133: aload #4
    //   135: invokevirtual size : ()I
    //   138: if_icmpge -> 522
    //   141: aload #4
    //   143: iload #11
    //   145: invokevirtual get : (I)Ljava/lang/Object;
    //   148: checkcast W/M
    //   151: astore #5
    //   153: aload #5
    //   155: invokevirtual KInterfaceFoxtrot : ()Ljava/lang/String;
    //   158: astore #12
    //   160: aload #12
    //   162: ldc_w 'replayConfigTable'
    //   165: invokevirtual equals : (Ljava/lang/Object;)Z
    //   168: ifeq -> 261
    //   171: aload_1
    //   172: aload #5
    //   174: invokevirtual e : ()Ljava/lang/String;
    //   177: invokevirtual PInterfaceCharlie : (Ljava/lang/String;)LG/Manager;
    //   180: astore #13
    //   182: aload #13
    //   184: ifnonnull -> 220
    //   187: aload_0
    //   188: aload #5
    //   190: new java/lang/StringBuilder
    //   193: dup
    //   194: invokespecial <init> : ()V
    //   197: ldc_w 'Replay disabled. Not Found: '
    //   200: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: aload #5
    //   205: invokevirtual e : ()Ljava/lang/String;
    //   208: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: invokevirtual toString : ()Ljava/lang/String;
    //   214: invokespecial PInterfaceBravo : (LW/M;Ljava/lang/String;)V
    //   217: goto -> 258
    //   220: aload #13
    //   222: invokevirtual KInterfaceIndia : ()Ljava/lang/String;
    //   225: ldc_w 'array'
    //   228: invokevirtual equals : (Ljava/lang/Object;)Z
    //   231: ifne -> 246
    //   234: aload_0
    //   235: aload #5
    //   237: ldc_w 'replayConfigTable must CloneableImpl of type array'
    //   240: invokespecial PInterfaceAlpha : (LW/M;Ljava/lang/String;)V
    //   243: goto -> 258
    //   246: aload_1
    //   247: invokevirtual O : ()LG/F;
    //   250: aload #5
    //   252: invokevirtual e : ()Ljava/lang/String;
    //   255: invokevirtual q : (Ljava/lang/String;)V
    //   258: goto -> 502
    //   261: aload #12
    //   263: ldc_w 'replayStartOffset'
    //   266: invokevirtual equals : (Ljava/lang/Object;)Z
    //   269: ifeq -> 295
    //   272: aload_1
    //   273: aload #5
    //   275: invokevirtual e : ()Ljava/lang/String;
    //   278: invokestatic PInterfaceAlpha : (LG/GInterfaceAi;Ljava/lang/String;)LG/GInterfaceDj;
    //   281: astore #13
    //   283: aload_1
    //   284: invokevirtual O : ()LG/F;
    //   287: aload #13
    //   289: invokevirtual KInterfaceFoxtrot : (LG/GInterfaceDj;)V
    //   292: goto -> 502
    //   295: aload #12
    //   297: ldc_w 'replayRecordLength'
    //   300: invokevirtual equals : (Ljava/lang/Object;)Z
    //   303: ifeq -> 329
    //   306: aload_1
    //   307: aload #5
    //   309: invokevirtual e : ()Ljava/lang/String;
    //   312: invokestatic PInterfaceAlpha : (LG/GInterfaceAi;Ljava/lang/String;)LG/GInterfaceDj;
    //   315: astore #13
    //   317: aload_1
    //   318: invokevirtual O : ()LG/F;
    //   321: aload #13
    //   323: invokevirtual ExceptionPrintstacktrace : (LG/GInterfaceDj;)V
    //   326: goto -> 502
    //   329: aload #12
    //   331: invokestatic PInterfaceAlpha : (Ljava/lang/String;)Z
    //   334: ifne -> 502
    //   337: iload #8
    //   339: ifeq -> 360
    //   342: aload_0
    //   343: aload #5
    //   345: aload_1
    //   346: iload #6
    //   348: iload #7
    //   350: aload #10
    //   352: invokespecial PInterfaceAlpha : (LW/M;LG/R;IILG/GInterfaceAi;)LG/GComponentBb;
    //   355: astore #13
    //   357: goto -> 375
    //   360: aload_0
    //   361: aload #5
    //   363: aload_1
    //   364: iload #6
    //   366: iload #7
    //   368: aload #9
    //   370: invokespecial PInterfaceAlpha : (LW/M;LG/R;IILG/GInterfaceAi;)LG/GComponentBb;
    //   373: astore #13
    //   375: aload_1
    //   376: invokevirtual O : ()LG/F;
    //   379: ifnull -> 392
    //   382: aload_1
    //   383: invokevirtual O : ()LG/F;
    //   386: invokevirtual e : ()Z
    //   389: ifeq -> 396
    //   392: iconst_1
    //   393: goto -> 397
    //   396: iconst_0
    //   397: istore #14
    //   399: aload #13
    //   401: iconst_0
    //   402: invokevirtual PInterfaceAlpha : (Z)V
    //   405: aload_3
    //   406: ldc_w 'Replay'
    //   409: invokevirtual equals : (Ljava/lang/Object;)Z
    //   412: ifeq -> 424
    //   415: aload_1
    //   416: aload #13
    //   418: invokevirtual PInterfaceAlpha : (LG/GComponentBb;)V
    //   421: goto -> 468
    //   424: aload_3
    //   425: ldc 'ExtendedReplay'
    //   427: invokevirtual equals : (Ljava/lang/Object;)Z
    //   430: ifeq -> 442
    //   433: aload_1
    //   434: aload #13
    //   436: invokevirtual PInterfaceBravo : (LG/GComponentBb;)V
    //   439: goto -> 468
    //   442: aload_0
    //   443: aload #5
    //   445: new java/lang/StringBuilder
    //   448: dup
    //   449: invokespecial <init> : ()V
    //   452: ldc_w 'Unknown Replay Section: '
    //   455: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   458: aload_3
    //   459: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   462: invokevirtual toString : ()Ljava/lang/String;
    //   465: invokespecial PInterfaceAlpha : (LW/M;Ljava/lang/String;)V
    //   468: aload #13
    //   470: invokevirtual PInterfaceBravo : ()Ljava/lang/String;
    //   473: ldc_w 'formula'
    //   476: invokevirtual equals : (Ljava/lang/Object;)Z
    //   479: ifne -> 502
    //   482: aload #13
    //   484: invokevirtual PInterfaceAlpha : ()I
    //   487: aload #13
    //   489: invokevirtual l : ()I
    //   492: iadd
    //   493: istore #6
    //   495: aload #13
    //   497: invokevirtual PInterfaceAlpha : ()I
    //   500: istore #7
    //   502: goto -> 516
    //   505: astore #12
    //   507: aload_0
    //   508: aload #5
    //   510: ldc_w 'Malformed [Replay] entry'
    //   513: invokespecial PInterfaceAlpha : (LW/M;Ljava/lang/String;)V
    //   516: iinc #11, 1
    //   519: goto -> 131
    //   522: iconst_0
    //   523: istore #11
    //   525: iload #11
    //   527: aload #4
    //   529: invokevirtual size : ()I
    //   532: if_icmpge -> 720
    //   535: aload #4
    //   537: iload #11
    //   539: invokevirtual get : (I)Ljava/lang/Object;
    //   542: checkcast W/M
    //   545: astore #5
    //   547: aload #5
    //   549: invokevirtual KInterfaceFoxtrot : ()Ljava/lang/String;
    //   552: astore #12
    //   554: aload #12
    //   556: invokestatic PInterfaceAlpha : (Ljava/lang/String;)Z
    //   559: ifne -> 700
    //   562: aload #12
    //   564: ldc_w 'replayConfigTable'
    //   567: invokevirtual equals : (Ljava/lang/Object;)Z
    //   570: ifne -> 700
    //   573: aload #12
    //   575: ldc_w 'replayStartOffset'
    //   578: invokevirtual equals : (Ljava/lang/Object;)Z
    //   581: ifne -> 700
    //   584: aload #12
    //   586: ldc_w 'replayRecordLength'
    //   589: invokevirtual equals : (Ljava/lang/Object;)Z
    //   592: ifne -> 700
    //   595: iload #8
    //   597: ifeq -> 611
    //   600: aload_1
    //   601: aload #12
    //   603: invokevirtual KInterfaceIndia : (Ljava/lang/String;)LG/GComponentBb;
    //   606: astore #13
    //   608: goto -> 619
    //   611: aload_1
    //   612: aload #12
    //   614: invokevirtual KInterfaceHotel : (Ljava/lang/String;)LG/GComponentBb;
    //   617: astore #13
    //   619: aload #13
    //   621: ifnull -> 632
    //   624: aload #13
    //   626: invokevirtual k : ()Ljava/lang/String;
    //   629: ifnull -> 632
    //   632: aload #13
    //   634: invokevirtual ExceptionPrintstacktrace : ()LG/GInterfaceDj;
    //   637: instanceof G/SerializableImplTostring
    //   640: ifeq -> 666
    //   643: aload #13
    //   645: invokevirtual ExceptionPrintstacktrace : ()LG/GInterfaceDj;
    //   648: checkcast G/SerializableImplTostring
    //   651: astore #14
    //   653: aload_0
    //   654: aload_1
    //   655: aload #5
    //   657: aload #14
    //   659: invokevirtual PInterfaceCharlie : ()Ljava/lang/String;
    //   662: iconst_1
    //   663: invokevirtual PInterfaceAlpha : (LG/R;LW/M;Ljava/lang/String;Z)V
    //   666: aload #13
    //   668: invokevirtual j : ()LG/GInterfaceDj;
    //   671: instanceof G/SerializableImplTostring
    //   674: ifeq -> 700
    //   677: aload #13
    //   679: invokevirtual j : ()LG/GInterfaceDj;
    //   682: checkcast G/SerializableImplTostring
    //   685: astore #14
    //   687: aload_0
    //   688: aload_1
    //   689: aload #5
    //   691: aload #14
    //   693: invokevirtual PInterfaceCharlie : ()Ljava/lang/String;
    //   696: iconst_1
    //   697: invokevirtual PInterfaceAlpha : (LG/R;LW/M;Ljava/lang/String;Z)V
    //   700: goto -> 714
    //   703: astore #12
    //   705: aload_0
    //   706: aload #5
    //   708: ldc_w 'Malformed [Replay] entry'
    //   711: invokespecial PInterfaceAlpha : (LW/M;Ljava/lang/String;)V
    //   714: iinc #11, 1
    //   717: goto -> 525
    //   720: return
    // Exception table:
    //   from	to	target	type
    //   141	502	505	java/lang/Exception
    //   535	700	703	java/lang/Exception
  }
  
  private void KInterfaceFoxtrot(R paramR, J paramJ) {
    ArrayList<M> arrayList = PInterfaceAlpha(paramJ, paramR, "GaugeConfigurations");
    String str = null;
    M m = null;
    for (byte PInterfaceBravo = 0; PInterfaceBravo < arrayList.size(); PInterfaceBravo++) {
      try {
        m = arrayList.get(PInterfaceBravo);
        PInterfaceAlpha(m);
        if (m.PInterfaceBravo().startsWith("gaugeCategory")) {
          str = m.e();
          str = X.PInterfaceBravo(str, "\"", "");
        } else {
          GInterfaceAh GInterfaceAh = j(paramR, m);
          GInterfaceAh.d(str);
          if (!PInterfaceBravo(paramR, GInterfaceAh.KInterfaceIndia()))
            PInterfaceBravo(m, "[GaugeConfigurations] gauge template assigned to undefined OutputChannel: " + GInterfaceAh.KInterfaceIndia()); 
          paramR.PInterfaceAlpha(GInterfaceAh);
        } 
      } catch (Exception exception) {
        PInterfaceBravo(m, exception.getMessage() + ", Gauge Entry ignored.");
      } 
    } 
  }
  
  private boolean PInterfaceBravo(R paramR, String paramString) {
    return (paramString != null && (paramR.ExceptionPrintstacktrace(paramString) != null || paramString.equals("veTuneValue")));
  }
  
  private void ExceptionPrintstacktrace(R paramR, J paramJ) {
    ArrayList arrayList = PInterfaceAlpha(paramJ, paramR, "TuningViews");
    KInterfaceFoxtrot KInterfaceFoxtrot = new KInterfaceFoxtrot(paramR, PInterfaceCharlie, paramJ.d());
    byte PInterfaceBravo = 0;
    for (M m : arrayList) {
      String str = m.KInterfaceFoxtrot();
      if (str.equals("tuningView")) {
        String[] arrayOfString = j(q(m.e()));
        if (arrayOfString.length < 4) {
          PInterfaceBravo(m, "Invalid Entry! tuningView requires 4 parameters.\nFormat:\n   tuningView = referenceName, \"User Title\", [md5 of decoded data], {optional enableCondition}");
          continue;
        } 
        try {
          byte b1 = 0;
          GInterfaceBf GInterfaceBf = new GInterfaceBf(KInterfaceFoxtrot);
          GInterfaceBf.v(arrayOfString[b1++]);
          String str1 = KInterfaceFoxtrot(arrayOfString[b1++]);
          GInterfaceBf.PInterfaceCharlie(str1);
          GInterfaceBf.PInterfaceBravo(arrayOfString[b1++]);
          String str2 = arrayOfString[b1++].trim();
          if (str2.startsWith("{")) {
            String str3 = str2;
            str3 = X.PInterfaceBravo(str3, "{", "");
            str3 = X.PInterfaceBravo(str3, "}", "");
            GInterfaceBf.u(str3);
          } 
          GInterfaceBf.PInterfaceAlpha(PInterfaceBravo++);
          paramR.PInterfaceAlpha(GInterfaceBf);
        } catch (Exception exception) {
          PInterfaceBravo(m, "Invalid TuningView Entry! Unable to parse: " + exception.getLocalizedMessage());
        } 
        continue;
      } 
      PInterfaceBravo(m, "Invalid Entry! Unknown entry: " + str);
    } 
  }
  
  private void d(R paramR, J paramJ, String paramString) {
    ArrayList arrayList = PInterfaceAlpha(paramJ, paramR, "EncodedData");
    for (M m : arrayList) {
      String str = m.KInterfaceFoxtrot();
      if (paramString != null && str.equals(paramString)) {
        String str1 = m.e();
        if (str1 != null && !str1.isEmpty()) {
          IOInGPackage IOInGPackage = new IOInGPackage(str);
          IOInGPackage.PInterfaceAlpha(str1);
          paramR.PInterfaceAlpha(IOInGPackage);
          continue;
        } 
        PInterfaceBravo(m, "Now Encoded Data found for: " + str);
      } 
    } 
  }
  
  private void KInterfaceHotel(R paramR, J paramJ) {
    ArrayList arrayList = PInterfaceAlpha(paramJ, paramR, "DatalogViews");
    byte PInterfaceBravo = 0;
    String str = "Default";
    x x = new x();
    x.PInterfaceAlpha(str);
    x.PInterfaceAlpha(PInterfaceBravo++);
    boolean bool = false;
    for (M m : arrayList) {
      String str1 = m.KInterfaceFoxtrot();
      if (str1.startsWith("graph")) {
        try {
          String str2 = KInterfaceFoxtrot(m.e());
          boolean bool1 = false;
          for (SerializableImplExceptionprintstacktrace ac1 : paramR.ExceptionPrintstacktrace()) {
            if (ac1.aL().equals(str2)) {
              bool1 = true;
              break;
            } 
          } 
          if (!bool1)
            PInterfaceBravo(m, "No field GComponentBy this name found in the [Datalog] section."); 
          String str3 = str1.substring(str1.indexOf("KInterfaceHotel") + 1);
          int KInterfaceIndia = Integer.parseInt(str3.substring(0, str3.indexOf(".")));
          int j = Integer.parseInt(str3.substring(str3.indexOf(".") + 1));
          y y = new y(str2, KInterfaceIndia, j);
          x.PInterfaceAlpha(y);
          if (!bool && x.PInterfaceAlpha().equals("Default") && !x.PInterfaceBravo().isEmpty()) {
            paramR.PInterfaceAlpha(x);
            bool = true;
          } 
        } catch (Exception exception) {
          PInterfaceBravo(m, "Invalid graph definition. Should CloneableImpl format: graphX.Y  Example: graph0.1");
        } 
        continue;
      } 
      if (str1.equals("logViewName")) {
        str = KInterfaceFoxtrot(m.e());
        x = new x();
        byte b1 = 1;
        if (paramR.B(str) != null) {
          PInterfaceBravo(m, "Each Data logViewName must CloneableImpl unique!");
          String str2 = str;
          do {
            str = str2 + b1++;
          } while (paramR.B(str) != null);
        } 
        x.PInterfaceAlpha(str);
        x.PInterfaceAlpha(PInterfaceBravo++);
        paramR.PInterfaceAlpha(x);
        continue;
      } 
      if (str1.equals("defaultSmoothing")) {
        String[] arrayOfString = j(q(m.e()));
        String str2 = KInterfaceFoxtrot(arrayOfString[0]);
        try {
          GComponentCb.PInterfaceAlpha().PInterfaceAlpha(str2, Integer.parseInt(arrayOfString[1]));
        } catch (Exception exception) {
          PInterfaceBravo(m, "Syntax Error. Proper usage:\n   defaultSmoothing = \"FieldName\", 5");
        } 
        continue;
      } 
      PInterfaceBravo(m, "Syntax Error. Do not know how to handle this line.");
    } 
  }
  
  private void KInterfaceIndia(R paramR, J paramJ) {
    ArrayList<M> arrayList = PInterfaceAlpha(paramJ, paramR, "Datalog");
    ArrayList<String> arrayList1 = new ArrayList();
    M m = null;
    int KInterfaceIndia = 0;
    int j = 0;
    String str = null;
    for (byte PInterfaceBravo = 0; PInterfaceBravo < arrayList.size(); PInterfaceBravo++) {
      try {
        m = arrayList.get(PInterfaceBravo);
        String str1 = m.PInterfaceBravo();
        if (!str1.startsWith("delimiter"))
          if (str1.startsWith("internalLogField")) {
            GComponentAl GComponentAl = PInterfaceAlpha(m, (GInterfaceAi)paramR, KInterfaceIndia, j);
            paramR.PInterfaceAlpha(GComponentAl);
            KInterfaceIndia = GComponentAl.PInterfaceAlpha() + GComponentAl.l();
            j = GComponentAl.PInterfaceAlpha();
          } else if (!str1.startsWith("defaultExtension")) {
            if (str1.startsWith("entry")) {
              SerializableImplExceptionprintstacktrace ac1 = k(paramR, m);
              if (this.j && arrayList1.contains(ac1.PInterfaceBravo()) && (ac1.aJ() == null || ac1.aJ().isEmpty()))
                PInterfaceBravo(m, "Duplicate Data Log Field naming, the header " + ac1.PInterfaceBravo() + "has already been defined."); 
              if (paramR.ExceptionPrintstacktrace(ac1.PInterfaceAlpha()) == null && !ManagerUsingArrayList.PInterfaceAlpha().e(ac1.PInterfaceAlpha())) {
                PInterfaceAlpha(m, "DataLog entry references non existent OutputChannel, ignored.");
              } else {
                if (this.j)
                  arrayList1.add(ac1.PInterfaceBravo()); 
                paramR.PInterfaceAlpha(ac1);
              } 
              if (ac1.aJ() != null && !ac1.aJ().equals(""))
                PInterfaceAlpha(paramR, m, ac1.aJ(), false); 
              if (str != null)
                ac1.e(str); 
            } else if (m.KInterfaceFoxtrot().equals("category")) {
              str = KInterfaceFoxtrot(m.e());
              if (str.length() > 34) {
                PInterfaceBravo(m, "DataLogField category cannot CloneableImpl more than 34 in length. Truncating: " + str);
                str = str.substring(0, 33);
              } 
            } else {
              PInterfaceBravo(m, "Unrecognized DataLog entry.");
            } 
          }  
      } catch (Exception exception) {
        PInterfaceAlpha(m, exception.getMessage() + "\nDatalog Entry ignored.");
      } 
    } 
  }
  
  private void PInterfaceCharlie(R paramR, GInterfaceBe parambE, J paramJ) {
    ArrayList<M> arrayList = PInterfaceAlpha(paramJ, paramR, "FTPBrowser");
    M m = null;
    GComponentBo GComponentBo = null;
    for (byte PInterfaceBravo = 0; PInterfaceBravo < arrayList.size(); PInterfaceBravo++) {
      try {
        m = arrayList.get(PInterfaceBravo);
        String str1 = m.KInterfaceFoxtrot();
        String str2 = m.e();
        if (str1.equals("ftpBrowser")) {
          GComponentBo = new GComponentBo();
          String[] arrayOfString = j(q(str2));
          GComponentBo.v(arrayOfString[0]);
          GComponentBo.s(arrayOfString[1]);
          if (arrayOfString.length > 2)
            GComponentBo.u(arrayOfString[2]); 
          parambE.PInterfaceAlpha((ArrayListExceptionprintstacktraceInGPackage)GComponentBo);
        } else if (str1.equals("host")) {
          GComponentBo.PInterfaceAlpha(q(str2));
        } else if (str1.equals("port")) {
          GComponentBo.PInterfaceAlpha(X.ExceptionPrintstacktrace(str2));
        } else if (str1.equals("user")) {
          GComponentBo.PInterfaceBravo(str2);
        } else if (str1.equals("password")) {
          GComponentBo.PInterfaceCharlie(str2);
        } else if (str1.equals("passiveMode")) {
          GComponentBo.PInterfaceAlpha(str2.equalsIgnoreCase("true"));
        } else if (str1.equals("browseEnable")) {
          String[] arrayOfString = j(q(str2));
          String str3 = KInterfaceFoxtrot(arrayOfString[0]);
          String str4 = arrayOfString[1].trim();
          str4 = X.PInterfaceBravo(str4, "{", "");
          str4 = X.PInterfaceBravo(str4, "}", "");
          GComponentBo.PInterfaceAlpha(str4, str3);
        } else if (str1.equals("readWriteEnable")) {
          String[] arrayOfString = j(q(str2));
          String str3 = KInterfaceFoxtrot(arrayOfString[0]);
          String str4 = arrayOfString[1].trim();
          str4 = X.PInterfaceBravo(str4, "{", "");
          str4 = X.PInterfaceBravo(str4, "}", "");
          PInterfaceAlpha(paramR, m, str4, true);
          GComponentBo.PInterfaceBravo(str4, str3);
        } else {
          PInterfaceBravo(m, "Unrecognized DataLog entry.");
        } 
      } catch (NullPointerException nullPointerException) {
        PInterfaceAlpha(m, "ftpBrowser must CloneableImpl defined before other attributes!\nftpBrowser = referenceName, \"Title\", enableCondition");
      } catch (Exception exception) {
        PInterfaceAlpha(m, exception.getMessage() + "\nEntry ignored.");
      } 
    } 
  }
  
  private void j(R paramR, J paramJ) {
    ArrayList<M> arrayList = PInterfaceAlpha(paramJ, paramR, "TableEditor");
    CloneableImpl CloneableImpl = null;
    GInterfaceBi GInterfaceBi = null;
    for (byte b1 = 0; b1 < arrayList.size(); b1++) {
      M m = arrayList.get(b1);
      String str = m.PInterfaceBravo();
      try {
        if (str.startsWith("table")) {
          CloneableImpl = new CloneableImpl();
          CloneableImpl.s(this.l);
          GInterfaceBi = new GInterfaceBi();
          String[] arrayOfString1 = j(q(str));
          CloneableImpl.v(arrayOfString1[0]);
          GInterfaceBi.PInterfaceAlpha(arrayOfString1[0]);
          GInterfaceBi.v(arrayOfString1[1]);
          GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString1[2]);
          CloneableImpl.d(GInterfaceDb);
          GInterfaceBi.s(arrayOfString1[2]);
          paramR.PInterfaceAlpha(CloneableImpl);
          paramR.PInterfaceAlpha(GInterfaceBi);
          if (paramR.e() != null)
            paramR.e().PInterfaceAlpha((ArrayListExceptionprintstacktraceInGPackage)CloneableImpl); 
        } else if (str.startsWith("xBins")) {
          if (CloneableImpl == null)
            throw new ExceptionPrintstacktrace("Error in [TableEditor] Section, 1st row should CloneableImpl table = XXX, found \n" + m); 
          String[] arrayOfString1 = j(q(str));
          CloneableImpl.PInterfaceAlpha(arrayOfString1[0]);
          CloneableImpl.d(arrayOfString1[1]);
          CloneableImpl.KInterfaceFoxtrot(arrayOfString1[1].toUpperCase());
          if (paramR.PInterfaceCharlie(CloneableImpl.PInterfaceAlpha()) == null)
            PInterfaceBravo(m, "Table: " + CloneableImpl.aL() + ", Assigned xBin not found: " + CloneableImpl.PInterfaceAlpha()); 
          if (CloneableImpl.d() != null && CloneableImpl.d().length() > 0 && paramR.ExceptionPrintstacktrace(CloneableImpl.d()) == null)
            PInterfaceBravo(m, "Table: " + CloneableImpl.aL() + ", Assigned xBin Channel not found: " + CloneableImpl.d()); 
          if (arrayOfString1.length > 2 && arrayOfString1[2].equals("readOnly"))
            CloneableImpl.PInterfaceBravo(true); 
        } else if (str.startsWith("yBins")) {
          if (CloneableImpl == null)
            throw new ExceptionPrintstacktrace("Error in [TableEditor] Section, 1st row should CloneableImpl table = XXX, found \n" + m); 
          String[] arrayOfString1 = j(q(str));
          CloneableImpl.PInterfaceBravo(arrayOfString1[0]);
          CloneableImpl.e(arrayOfString1[1]);
          CloneableImpl.ExceptionPrintstacktrace(arrayOfString1[1].toUpperCase());
          if (paramR.PInterfaceCharlie(CloneableImpl.PInterfaceBravo()) == null)
            PInterfaceBravo(m, "Table: " + CloneableImpl.aL() + ", Assigned y Bin not found: " + CloneableImpl.PInterfaceBravo()); 
          if (CloneableImpl.KInterfaceFoxtrot() != null && CloneableImpl.KInterfaceFoxtrot().length() > 0 && paramR.ExceptionPrintstacktrace(CloneableImpl.KInterfaceFoxtrot()) == null)
            PInterfaceBravo(m, "Table: " + CloneableImpl.aL() + ", Assigned y Bin Channel not found: " + CloneableImpl.KInterfaceFoxtrot()); 
          if (arrayOfString1.length > 2 && arrayOfString1[2].equals("readOnly"))
            CloneableImpl.PInterfaceCharlie(true); 
        } else if (str.startsWith("zBins")) {
          if (CloneableImpl == null)
            throw new ExceptionPrintstacktrace("Error in [TableEditor] Section, 1st row should CloneableImpl table = XXX, found \n" + m); 
          CloneableImpl.PInterfaceCharlie(q(str));
          if (paramR.PInterfaceCharlie(CloneableImpl.PInterfaceCharlie()) == null)
            PInterfaceBravo(m, "Table: " + CloneableImpl.aL() + ", Assigned y Bin not found: " + CloneableImpl.PInterfaceCharlie()); 
        } else if (str.startsWith("upDownLabel")) {
          if (CloneableImpl == null)
            throw new ExceptionPrintstacktrace("Error in [TableEditor] Section, 1st row should CloneableImpl table = XXX, found \n" + m); 
          String[] arrayOfString1 = j(q(str));
          CloneableImpl.PInterfaceAlpha(arrayOfString1);
        } else if (str.startsWith("gridOrient")) {
          if (CloneableImpl == null)
            throw new ExceptionPrintstacktrace("Error in [TableEditor] Section, 1st row should CloneableImpl table = XXX, found \n" + m); 
          String[] arrayOfString1 = j(q(str));
          GInterfaceBi.PInterfaceBravo(360 - X.ExceptionPrintstacktrace(arrayOfString1[0]) + 90);
          GInterfaceBi.PInterfaceAlpha(360 - X.ExceptionPrintstacktrace(arrayOfString1[2]));
        } else if (str.startsWith("topicHelp")) {
          if (CloneableImpl == null)
            throw new ExceptionPrintstacktrace("Error in [TableEditor] Section, 1st row should CloneableImpl table = XXX, found \n" + m); 
          GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, q(str));
          CloneableImpl.e(GInterfaceDb);
          if (GInterfaceBi != null)
            GInterfaceBi.e(GInterfaceDb); 
          String str1 = KInterfaceFoxtrot(q(str));
          if (str1.startsWith("http:/") || str1.startsWith("file:/")) {
            GComponentAj GComponentAj = new GComponentAj();
            GComponentAj.PInterfaceAlpha(GInterfaceDb);
            GComponentAj.PInterfaceBravo(GInterfaceDb);
            if (CloneableImpl.M() != null && CloneableImpl.M().length() > 0) {
              GComponentAj.PInterfaceBravo(CloneableImpl.M());
            } else {
              GComponentAj.PInterfaceBravo("Web Help");
            } 
            paramR.e().PInterfaceAlpha(GComponentAj);
          } 
        } else if (str.startsWith("xyLabels")) {
          String[] arrayOfString1 = j(q(str));
          if (arrayOfString1.length > 2)
            PInterfaceBravo(m, "Extra attributes, ignoring."); 
          if (arrayOfString1.length > 0) {
            GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString1[0]);
            CloneableImpl.PInterfaceAlpha(GInterfaceDb);
          } 
          if (arrayOfString1.length > 1) {
            GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString1[1]);
            CloneableImpl.PInterfaceBravo(GInterfaceDb);
          } 
        } else if (m.KInterfaceFoxtrot().equals("userPassword")) {
          String str1 = m.e();
          Manager Manager = paramR.PInterfaceCharlie(str1);
          if (Manager != null && Manager.z() >= 4) {
            CloneableImpl.z(str1);
            paramR.PInterfaceCharlie(true);
          } else {
            PInterfaceBravo(m, "Invalid value for userPassword Parameter. Must CloneableImpl the name of PInterfaceAlpha defined U32 Constant. Invalid Value: " + str1);
          } 
        } else if (!str.startsWith("gridHeight")) {
          PInterfaceBravo(m, "Do not understand row, no known keyword.");
        } 
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        PInterfaceBravo(m, ExceptionPrintstacktrace.getMessage());
      } catch (Exception exception) {
        exception.printStackTrace();
        String str1 = "Error in [TableEditor] Section, I don't know how to handle this line.";
        PInterfaceAlpha(m, str1);
        throw new ExceptionPrintstacktrace(str1);
      } 
    } 
    arrayList = PInterfaceAlpha(paramJ, paramR, "Tuning");
    ArrayList<String> arrayList1 = new ArrayList();
    for (byte b2 = 0; b2 < arrayList.size(); b2++) {
      String str = ((M)arrayList.get(b2)).PInterfaceBravo();
      try {
        if (str.startsWith("gauge") && !str.startsWith("gaugeColumns")) {
          String[] arrayOfString1 = j(q(str));
          arrayList1.add(arrayOfString1[0]);
        } 
      } catch (Exception exception) {
        PInterfaceBravo(arrayList.get(b2), "Unable to load Table Gauges");
      } 
    } 
    String[] arrayOfString = new String[arrayList1.size()];
    for (byte b3 = 0; b3 < arrayList1.size(); b3++)
      arrayOfString[b3] = arrayList1.get(b3); 
    if (arrayOfString.length > 0) {
      Iterator<GInterfaceBi> iterator = paramR.o();
      while (iterator.hasNext())
        paramR.PInterfaceAlpha(((GInterfaceBi)iterator.next()).aL(), arrayOfString); 
      paramR.PInterfaceAlpha("Default", arrayOfString);
    } 
  }
  
  public void PInterfaceAlpha(R paramR, J paramJ) {
    ArrayList<M> arrayList = PInterfaceAlpha(paramJ, paramR, "VerbiageOverride");
    arrayList = PInterfaceAlpha(arrayList, paramR);
    M m = null;
    try {
      for (byte PInterfaceBravo = 0; PInterfaceBravo < arrayList.size(); PInterfaceBravo++) {
        m = arrayList.get(PInterfaceBravo);
        String str1 = m.KInterfaceFoxtrot();
        str1 = X.PInterfaceBravo(str1, "\"", "");
        String str2 = m.e();
        str2 = X.PInterfaceBravo(str2, "\"", "");
        paramR.PInterfaceCharlie(str1, str2);
      } 
    } catch (Exception exception) {
      PInterfaceBravo(m, "Verbiage Over-ride not formatted properly, ignoring.");
    } 
  }
  
  public void PInterfaceBravo(R paramR, J paramJ) {
    ArrayList<M> arrayList = PInterfaceAlpha(paramJ, paramR, "VeAnalyze");
    arrayList = PInterfaceAlpha(arrayList, paramR);
    GInterfaceDm GInterfaceDm = null;
    GInterfaceDe GInterfaceDe = null;
    M m = null;
    String str = null;
    for (byte PInterfaceBravo = 0; PInterfaceBravo < arrayList.size(); PInterfaceBravo++) {
      m = arrayList.get(PInterfaceBravo);
      str = m.PInterfaceBravo();
      try {
        if (str.startsWith("veAnalyzeMap")) {
          String[] arrayOfString = j(q(str));
          GInterfaceDm = new GInterfaceDm();
          GInterfaceDm = PInterfaceAlpha(paramR, GInterfaceDm, arrayOfString);
          paramR.PInterfaceAlpha(GInterfaceDm);
          GInterfaceDe = null;
        } else {
          GInterfaceDe de1;
          if (str.startsWith("trimAnalyzeMap")) {
            String[] arrayOfString = j(q(str));
            GInterfaceDe = new GInterfaceDe();
            GInterfaceDe = (GInterfaceDe)PInterfaceAlpha(paramR, (GInterfaceDm)GInterfaceDe, arrayOfString);
            paramR.PInterfaceAlpha(GInterfaceDe);
            de1 = GInterfaceDe;
          } else if (str.startsWith("trimTable")) {
            if (GInterfaceDe == null) {
              PInterfaceBravo(m, "Found trimTable, but trimAnalyzeMap must CloneableImpl defined 1st.");
            } else {
              GInterfaceDf GInterfaceDf = KInterfaceHotel(paramR, m);
              GInterfaceDe.PInterfaceAlpha(GInterfaceDf);
            } 
          } else if (str.startsWith("filter")) {
            SerializableImplInGPackage SerializableImplInGPackage = KInterfaceIndia(paramR, m);
            de1.PInterfaceAlpha(SerializableImplInGPackage);
          } else if (str.startsWith("option")) {
            String str1 = m.e();
            try {
              de1.n(str1);
            } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
              PInterfaceBravo(m, ExceptionPrintstacktrace.getMessage());
            } 
          } else if (str.startsWith("lambdaTargetTables")) {
            String[] arrayOfString = j(q(str));
            for (byte b1 = 0; b1 < arrayOfString.length; b1++)
              de1.KInterfaceIndia(arrayOfString[b1].trim()); 
          } else if (str.startsWith("lambdaTargetChannels")) {
            String[] arrayOfString = j(q(str));
            for (byte b1 = 0; b1 < arrayOfString.length; b1++)
              de1.j(arrayOfString[b1].trim()); 
          } else if (str.startsWith("pickListSelection")) {
            String[] arrayOfString = j(q(str));
            for (byte b1 = 0; b1 < arrayOfString.length; b1++)
              de1.t(arrayOfString[b1].trim()); 
          } else if (str.startsWith("lambdaChannels")) {
            String[] arrayOfString = j(q(str));
            for (byte b1 = 0; b1 < arrayOfString.length; b1++)
              de1.k(arrayOfString[b1].trim()); 
          } else if (str.startsWith("egoCorrectionChannels")) {
            String[] arrayOfString = j(q(str));
            for (byte b1 = 0; b1 < arrayOfString.length; b1++)
              de1.l(arrayOfString[b1].trim()); 
          } else if (str.startsWith("defaultLambdaTarget")) {
            String[] arrayOfString = j(q(str));
            de1.s(arrayOfString[0]);
          } else if (str.startsWith("zAxisTransform")) {
            float KInterfaceFoxtrot = Float.parseFloat(m.e());
            de1.PInterfaceAlpha(KInterfaceFoxtrot);
          } else {
            PInterfaceBravo(m, "Unrecognised row in [VeAnaltyzeMaps] section. I don't know how to handle this and will ignore");
          } 
        } 
      } catch (Exception exception) {
        PInterfaceAlpha(m, "Error in section [VeAnalyzeMaps], unable to parse ini row. Error: " + exception.getLocalizedMessage());
      } 
    } 
  }
  
  public void PInterfaceCharlie(R paramR, J paramJ) {
    ArrayList<M> arrayList = PInterfaceAlpha(paramJ, paramR, "WueAnalyze");
    arrayList = PInterfaceAlpha(arrayList, paramR);
    GInterfaceDp GInterfaceDp = null;
    M m = null;
    String str = null;
    for (byte PInterfaceBravo = 0; PInterfaceBravo < arrayList.size(); PInterfaceBravo++) {
      m = arrayList.get(PInterfaceBravo);
      str = m.PInterfaceBravo();
      try {
        if (str.startsWith("wueAnalyzeMap")) {
          String[] arrayOfString = j(q(str));
          GInterfaceDp = PInterfaceAlpha(paramR, arrayOfString);
          paramR.PInterfaceAlpha(GInterfaceDp);
        } else if (str.startsWith("filter")) {
          SerializableImplInGPackage SerializableImplInGPackage = KInterfaceIndia(paramR, m);
          GInterfaceDp.PInterfaceAlpha(SerializableImplInGPackage);
        } else if (str.startsWith("option")) {
          String str1 = m.e();
          try {
            GInterfaceDp.k(str1);
          } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
            PInterfaceBravo(m, ExceptionPrintstacktrace.getMessage());
          } 
        } else if (str.startsWith("lambdaTargetTables")) {
          String[] arrayOfString = j(q(str));
          for (byte b1 = 0; b1 < arrayOfString.length; b1++)
            GInterfaceDp.j(arrayOfString[b1]); 
        } else if (str.startsWith("wuePercentOffset")) {
          float KInterfaceFoxtrot = Float.parseFloat(m.e());
          GInterfaceDp.PInterfaceAlpha(KInterfaceFoxtrot);
        } else {
          PInterfaceBravo(m, "Unrecognised row in [WueAnaltyzeMaps] section. I don't know how to handle this and will ignore");
        } 
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        PInterfaceAlpha(m, "Error in section [WueAnalyzeMaps]: " + ExceptionPrintstacktrace.getLocalizedMessage());
      } catch (Exception exception) {
        PInterfaceAlpha(m, "Error in section [WueAnalyzeMaps], unable to parse ini row");
      } 
    } 
  }
  
  private GInterfaceDf KInterfaceHotel(R paramR, M paramM) {
    GInterfaceDf GInterfaceDf = new GInterfaceDf();
    String[] arrayOfString = j(paramM.e());
    if (arrayOfString.length < 3) {
      PInterfaceAlpha(paramM, "trimTable requires 3 parameters: trimTable = tableName,  label, afrChannel, egoCorr, enableCondition(optional), or trimTable = tableName, label, egoSensorIndexEpression,  enableCondition");
    } else {
      GInterfaceDf.PInterfaceAlpha(arrayOfString[0]);
      GInterfaceDf.e(KInterfaceFoxtrot(arrayOfString[1]));
      if (arrayOfString[2].trim().startsWith("{")) {
        String str = arrayOfString[2];
        str = X.PInterfaceBravo(str, "{", "");
        str = X.PInterfaceBravo(str, "}", "");
        GInterfaceDf.KInterfaceFoxtrot(str);
        if (arrayOfString.length > 3) {
          String str1 = arrayOfString[3];
          str1 = X.PInterfaceBravo(str1, "{", "");
          str1 = X.PInterfaceBravo(str1, "}", "");
          GInterfaceDf.d(str1);
        } 
      } else {
        GInterfaceDf.PInterfaceBravo(arrayOfString[2]);
        GInterfaceDf.PInterfaceCharlie(arrayOfString[3]);
        if (paramR.ExceptionPrintstacktrace(GInterfaceDf.PInterfaceCharlie()) == null)
          PInterfaceBravo(paramM, "Trim Table lambda/afr channel " + GInterfaceDf.PInterfaceCharlie() + " not found!"); 
        if (paramR.ExceptionPrintstacktrace(GInterfaceDf.d()) == null)
          PInterfaceBravo(paramM, "Trim Table EGO Correction channel " + GInterfaceDf.d() + " not found!"); 
        if (arrayOfString.length > 4) {
          String str = arrayOfString[4];
          str = X.PInterfaceBravo(str, "{", "");
          str = X.PInterfaceBravo(str, "}", "");
          GInterfaceDf.d(str);
        } 
      } 
    } 
    return GInterfaceDf;
  }
  
  private SerializableImplInGPackage KInterfaceIndia(R paramR, M paramM) {
    String str = paramM.PInterfaceBravo();
    String[] arrayOfString = j(q(str));
    SerializableImplInGPackage SerializableImplInGPackage = new SerializableImplInGPackage();
    if ("std_Expression".equals(arrayOfString[0])) {
      SerializableImplInGPackage.PInterfaceAlpha(256);
      SerializableImplInGPackage.v(arrayOfString[0]);
      SerializableImplInGPackage.d(X.PInterfaceBravo(arrayOfString[1], "\"", ""));
      String str1 = X.PInterfaceBravo(arrayOfString[2], "{", "");
      str1 = X.PInterfaceBravo(str1, "}", "");
      SerializableImplInGPackage.e(str1);
      SerializableImplInGPackage.PInterfaceAlpha(Boolean.parseBoolean(arrayOfString[3]));
      PInterfaceAlpha(paramR, paramM, str1, false);
      return SerializableImplInGPackage;
    } 
    if (SerializableImplInGPackage.PInterfaceCharlie(arrayOfString[0])) {
      SerializableImplInGPackage.PInterfaceAlpha(256);
      SerializableImplInGPackage.v(arrayOfString[0]);
      return SerializableImplInGPackage;
    } 
    SerializableImplInGPackage.v(arrayOfString[0]);
    SerializableImplInGPackage.d(X.PInterfaceBravo(arrayOfString[1], "\"", ""));
    SerializableImplInGPackage.PInterfaceAlpha(arrayOfString[2]);
    SerializableImplInGPackage.PInterfaceBravo(arrayOfString[3]);
    try {
      GInterfaceDj GInterfaceDj = GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[4]);
      SerializableImplInGPackage.PInterfaceAlpha(GInterfaceDj);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      PInterfaceBravo(paramM, "Failed to parse qualifying value or expression.");
    } 
    SerializableImplInGPackage.PInterfaceAlpha(Boolean.parseBoolean(arrayOfString[5]));
    return SerializableImplInGPackage;
  }
  
  private GInterfaceDm PInterfaceAlpha(R paramR, GInterfaceDm paramdm, String[] paramArrayOfString) {
    paramdm.PInterfaceBravo(paramArrayOfString[0]);
    paramdm.PInterfaceCharlie(paramArrayOfString[1]);
    paramdm.m(paramArrayOfString[1]);
    if (paramArrayOfString.length > 2) {
      paramdm.e(paramArrayOfString[2]);
    } else {
      throw new ExceptionPrintstacktrace("Error loading VeAnalyzeMap for " + paramdm.PInterfaceBravo() + " There is no lambdaChannel defined.");
    } 
    if (paramArrayOfString.length > 3)
      paramdm.KInterfaceFoxtrot(paramArrayOfString[3]); 
    if (paramArrayOfString.length > 4) {
      String str = X.PInterfaceBravo(paramArrayOfString[4], "{", "");
      str = X.PInterfaceBravo(str, "}", "");
      paramdm.d(str);
    } 
    CloneableImpl be1 = (CloneableImpl)paramR.e().PInterfaceCharlie(paramdm.PInterfaceBravo());
    if (be1 == null)
      throw new ExceptionPrintstacktrace("Error loading VeAnalyzeMap, the table " + paramdm.PInterfaceBravo() + " not found in current configuration. Was it loaded yet?"); 
    CloneableImpl be2 = (CloneableImpl)paramR.e().PInterfaceCharlie(paramdm.PInterfaceCharlie());
    if (be2 == null && !paramdm.PInterfaceCharlie().endsWith("afrTSCustom"))
      throw new ExceptionPrintstacktrace("Error loading VeAnalyzeMap, the table " + paramdm.PInterfaceBravo() + " was defined as the Lambda Target Table, but not found in current configuration. Was it loaded yet?"); 
    if (!paramdm.PInterfaceCharlie().endsWith("afrTSCustom")) {
      if (be2.d() != null)
        paramdm.p(be2.d()); 
      if (be2.KInterfaceFoxtrot() != null)
        paramdm.q(be2.KInterfaceFoxtrot()); 
    } 
    paramdm.ExceptionPrintstacktrace(be1.d());
    paramdm.KInterfaceHotel(be1.KInterfaceFoxtrot());
    return paramdm;
  }
  
  private GInterfaceDp PInterfaceAlpha(R paramR, String[] paramArrayOfString) {
    GInterfaceDp GInterfaceDp = new GInterfaceDp();
    GInterfaceDp.PInterfaceCharlie(paramArrayOfString[0]);
    GInterfaceDp.ExceptionPrintstacktrace(paramArrayOfString[1]);
    GInterfaceDp.KInterfaceFoxtrot(paramArrayOfString[2]);
    GInterfaceDp.o(paramArrayOfString[2]);
    if (paramArrayOfString.length > 3) {
      GInterfaceDp.d(paramArrayOfString[3]);
    } else {
      throw new ExceptionPrintstacktrace("Error loading VeAnalyzeMap for " + GInterfaceDp.PInterfaceCharlie() + " There is no lambdaChannel defined.");
    } 
    if (paramArrayOfString.length > 4) {
      GInterfaceDp.e(paramArrayOfString[4]);
    } else {
      throw new ExceptionPrintstacktrace("Error loading VeAnalyzeMap for " + GInterfaceDp.PInterfaceCharlie() + " There is no Coolant Temp Channel defined.");
    } 
    if (paramArrayOfString.length > 5) {
      GInterfaceDp.m(paramArrayOfString[5]);
    } else {
      throw new ExceptionPrintstacktrace("Error loading VeAnalyzeMap for " + GInterfaceDp.PInterfaceCharlie() + " There is no Warmup Enrichment Channel defined.");
    } 
    if (paramArrayOfString.length > 6)
      GInterfaceDp.KInterfaceHotel(paramArrayOfString[6]); 
    if (paramArrayOfString.length > 7) {
      String str = X.PInterfaceBravo(paramArrayOfString[7], "{", "");
      str = X.PInterfaceBravo(str, "}", "");
      GInterfaceDp.KInterfaceIndia(str);
    } 
    CloneableImplInGPackage CloneableImplInGPackage = (CloneableImplInGPackage)paramR.e().PInterfaceCharlie(GInterfaceDp.PInterfaceCharlie());
    if (CloneableImplInGPackage == null)
      throw new ExceptionPrintstacktrace("Error loading WueAnalyzeMap, the CurveGraph " + GInterfaceDp.PInterfaceCharlie() + " not found in current configuration. Was it loaded yet?"); 
    CloneableImpl CloneableImpl = (CloneableImpl)paramR.e().PInterfaceCharlie(GInterfaceDp.KInterfaceFoxtrot());
    if (CloneableImpl == null && !GInterfaceDp.KInterfaceFoxtrot().endsWith("afrTSCustom"))
      throw new ExceptionPrintstacktrace("Error loading WueAnalyzeMap, the Curve Graph " + GInterfaceDp.PInterfaceCharlie() + " was defined as the Lambda Target Table, but not found in current configuration. Was it loaded yet?"); 
    if (!GInterfaceDp.KInterfaceFoxtrot().endsWith("afrTSCustom")) {
      if (CloneableImpl.d() != null)
        GInterfaceDp.p(CloneableImpl.d()); 
      if (CloneableImpl.KInterfaceFoxtrot() != null)
        GInterfaceDp.q(CloneableImpl.KInterfaceFoxtrot()); 
    } 
    GInterfaceDp.PInterfaceAlpha(CloneableImplInGPackage.PInterfaceBravo(0));
    GInterfaceDp.PInterfaceBravo(CloneableImplInGPackage.d(0));
    if (CloneableImplInGPackage.d() < 2)
      throw new ExceptionPrintstacktrace("Error loading WueAnalyzeMap, the Curve Graph " + GInterfaceDp.PInterfaceCharlie() + " does not have PInterfaceAlpha wue Analyze working array defined as PInterfaceAlpha second curve."); 
    GInterfaceDp.n(CloneableImplInGPackage.PInterfaceBravo(1));
    GInterfaceDp.e(CloneableImplInGPackage.l());
    return GInterfaceDp;
  }
  
  private void k(R paramR, J paramJ) {
    ArrayList<M> arrayList = PInterfaceAlpha(paramJ, paramR, "FrontPage");
    ArrayList<String> arrayList1 = new ArrayList();
    M m = null;
    for (byte b1 = 0; b1 < arrayList.size(); b1++) {
      m = arrayList.get(b1);
      String str = m.PInterfaceBravo();
      if (str.startsWith("gauge")) {
        String[] arrayOfString1 = j(q(str));
        if (arrayOfString1.length < 1 || paramR.k(arrayOfString1[0]) == null) {
          PInterfaceBravo(m, "Attempt to add undefined Gauge to Front Page.");
        } else {
          arrayList1.add(arrayOfString1[0]);
        } 
      } else if (str.startsWith("indicatorTemplate")) {
        if (e(str)) {
          Exceptionprintstacktrace Exceptionprintstacktrace = PInterfaceAlpha(m, paramR);
          Exceptionprintstacktrace.PInterfaceAlpha(false);
          paramR.PInterfaceAlpha(Exceptionprintstacktrace);
        } 
      } else if (str.startsWith("indicator")) {
        if (e(str))
          paramR.PInterfaceAlpha(PInterfaceAlpha(m, paramR)); 
      } else if (!str.startsWith("egoLEDs")) {
        PInterfaceBravo(m, "Do not understand this line.");
      } 
    } 
    if (arrayList1.size() < 1)
      return; 
    String[] arrayOfString = new String[arrayList1.size()];
    for (byte b2 = 0; b2 < arrayList1.size(); b2++)
      arrayOfString[b2] = arrayList1.get(b2); 
    paramR.PInterfaceAlpha(arrayOfString);
  }
  
  private boolean e(String paramString) {
    return true;
  }
  
  private void l(R paramR, J paramJ) {
    for (M m : PInterfaceAlpha(paramJ, paramR, "EventTriggers")) {
      try {
        if (m.KInterfaceFoxtrot().equals("timedPageRefresh")) {
          String[] arrayOfString = j(m.e());
          if (arrayOfString.length != 2 || !I.PInterfaceAlpha(arrayOfString[0])) {
            PInterfaceBravo(m, "timedPageRefresh must have 2 numeric parameters: timedPageRefresh = [pageToRefresh], \n[timePeriodBetweenRefreshesInMs]");
            continue;
          } 
          int KInterfaceIndia = X.ExceptionPrintstacktrace(arrayOfString[0]) - 1;
          GInterfaceDj GInterfaceDj = GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[1]);
          KInterfaceFoxtrot KInterfaceFoxtrot = new KInterfaceFoxtrot(paramR, KInterfaceIndia, GInterfaceDj);
          KInterfaceFoxtrot.PInterfaceAlpha();
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("triggeredPageRefresh")) {
          String[] arrayOfString = j(m.e());
          if (arrayOfString.length != 2) {
            PInterfaceBravo(m, "triggeredPageRefresh must have 2 parameters: triggeredPageRefresh = [pageToRefresh], \n{[Expression To Trigger Page Read]}");
            continue;
          } 
          int KInterfaceIndia = X.ExceptionPrintstacktrace(arrayOfString[0]) - 1;
          String str = X.PInterfaceBravo(arrayOfString[1], "{", "");
          str = X.PInterfaceBravo(str, "}", "");
          PInterfaceAlpha(paramR, m, str, true);
          KInterfaceHotel KInterfaceHotel = new KInterfaceHotel(paramR, KInterfaceIndia, str);
          continue;
        } 
        PInterfaceBravo(m, "Entry in [EventTriggers] not understood, ignoring.");
      } catch (Exception exception) {
        PInterfaceAlpha(m, "Error loading [EventTriggers], " + exception.getMessage());
        exception.printStackTrace();
        throw new ExceptionPrintstacktrace("Critical Error found at or near ini entry:\n" + m);
      } 
    } 
  }
  
  private void m(R paramR, J paramJ) {
    int KInterfaceIndia = -1;
    Manager Manager = null;
    for (M m : PInterfaceAlpha(paramJ, paramR, "Constants")) {
      try {
        if (m.KInterfaceFoxtrot().equals("page")) {
          KInterfaceIndia = X.ExceptionPrintstacktrace(m.e()) - 1;
          Manager = null;
          continue;
        } 
        if (!F.PInterfaceAlpha(m.KInterfaceFoxtrot())) {
          if (KInterfaceIndia >= 0) {
            Manager aM1 = PInterfaceAlpha(paramR, m, KInterfaceIndia, Manager);
            aM1.e(paramR.O().I());
            paramR.PInterfaceAlpha(aM1);
            Manager = aM1;
            continue;
          } 
          PInterfaceBravo(m, "Entry in [Constants] Section before page assignment, ignoring.");
        } 
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        PInterfaceAlpha(m, "Error loading [Constant], " + ExceptionPrintstacktrace.getMessage());
        ExceptionPrintstacktrace.printStackTrace();
        throw new ExceptionPrintstacktrace("Critical Error found at or near ini entry:\n" + m + "\nDetails: " + ExceptionPrintstacktrace.getLocalizedMessage());
      } catch (Exception exception) {
        PInterfaceAlpha(m, "Error loading [Constant], " + exception.getMessage());
        exception.printStackTrace();
        throw new ExceptionPrintstacktrace("Critical Error found at or near ini entry:\n" + m);
      } 
    } 
  }
  
  private void n(R paramR, J paramJ) {
    for (M m : PInterfaceAlpha(paramJ, paramR, "PcVariables")) {
      try {
        Manager Manager = l(paramR, m);
        paramR.PInterfaceAlpha(Manager);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        PInterfaceAlpha(m, "Error loading [PcVariables], " + ExceptionPrintstacktrace.getMessage());
      } catch (Exception exception) {
        PInterfaceAlpha(m, "Error loading [PcVariables], " + exception.getMessage());
        exception.printStackTrace();
        throw new ExceptionPrintstacktrace("Critical Error found at or near ini entry:\n" + m);
      } 
    } 
  }
  
  private void o(R paramR, J paramJ) {
    GComponentCd GComponentCd = null;
    GComponentCf GComponentCf = null;
    for (M m : PInterfaceAlpha(paramJ, paramR, "LoggerDefinition")) {
      try {
        String str = m.KInterfaceFoxtrot();
        if (str.equals("loggerDef")) {
          if (GComponentCd != null && GComponentCd.n().equals("UDP_Stream") && GComponentCd.o() <= 0)
            PInterfaceAlpha(m, GComponentCd.ExceptionPrintstacktrace() + " is defineds as ProcessorType " + "UDP_Stream" + ", but no slave port has been defined."); 
          GComponentCd = new GComponentCd();
          String[] arrayOfString = j(m.e());
          String str1 = KInterfaceFoxtrot(arrayOfString[1]);
          GComponentCd.PInterfaceCharlie(str1);
          GComponentCd.PInterfaceAlpha(arrayOfString[2]);
          paramR.PInterfaceAlpha(GComponentCd);
          continue;
        } 
        if (str.equals("dataReadCommand")) {
          String str1 = KInterfaceFoxtrot(m.e());
          GComponentCd.d(str1);
          continue;
        } 
        if (str.equals("startCommand")) {
          String str1 = KInterfaceFoxtrot(m.e());
          GComponentCd.e(str1);
          continue;
        } 
        if (str.equals("stopCommand")) {
          String str1 = KInterfaceFoxtrot(m.e());
          GComponentCd.KInterfaceFoxtrot(str1);
          continue;
        } 
        if (str.equals("dataLength")) {
          GComponentCd.PInterfaceCharlie(X.ExceptionPrintstacktrace(m.e()));
          continue;
        } 
        if (str.equals("continuousRead")) {
          String str1 = m.e();
          GComponentCd.PInterfaceAlpha(Boolean.parseBoolean(str1));
          continue;
        } 
        if (str.equals("dataReadyCondition")) {
          String str1 = X.PInterfaceBravo(m.e(), "{", "");
          str1 = X.PInterfaceBravo(str1, "}", "");
          GComponentCd.PInterfaceBravo(str1);
          continue;
        } 
        if (str.equals("dataReadTimeout")) {
          int KInterfaceIndia = X.ExceptionPrintstacktrace(m.e());
          GComponentCd.PInterfaceAlpha(KInterfaceIndia);
          continue;
        } 
        if (str.equals("dataLength")) {
          int KInterfaceIndia = X.ExceptionPrintstacktrace(m.e());
          continue;
        } 
        if (str.equals("logProcessorType")) {
          GComponentCd.ExceptionPrintstacktrace(m.e());
          continue;
        } 
        if (str.equals("slavePort")) {
          int KInterfaceIndia = X.ExceptionPrintstacktrace(m.e());
          GComponentCd.d(KInterfaceIndia);
          continue;
        } 
        if (str.equals("recordFieldGenerator")) {
          String[] arrayOfString = j(m.e());
          if (arrayOfString.length > 1) {
            if (arrayOfString[0].equals("generateFromOutpcOffsets")) {
              GComponentCh GComponentCh = new GComponentCh();
              GComponentCh.PInterfaceAlpha(paramR);
              if (arrayOfString.length > 1) {
                GComponentCh.PInterfaceAlpha(arrayOfString[1]);
              } else {
                PInterfaceBravo(m, "1D Array Constant containing Outpc offsets required.");
              } 
              GComponentCd.PInterfaceAlpha((GComponentCg)GComponentCh);
            } 
            continue;
          } 
          PInterfaceBravo(m, "Field Generator type required.");
          continue;
        } 
        if (str.equals("recordDef")) {
          GComponentCf = new GComponentCf();
          String[] arrayOfString = j(m.e());
          GComponentCf.e(X.ExceptionPrintstacktrace(arrayOfString[0]));
          GComponentCf.KInterfaceFoxtrot(X.ExceptionPrintstacktrace(arrayOfString[1]));
          GComponentCf.d(X.ExceptionPrintstacktrace(arrayOfString[2]));
          GComponentCd.PInterfaceAlpha(GComponentCf);
          continue;
        } 
        if (str.equals("recordField")) {
          GComponentCe GComponentCe = new GComponentCe();
          String[] arrayOfString = j(m.e());
          GComponentCe.PInterfaceBravo(arrayOfString[0]);
          String str1 = arrayOfString[1];
          GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(str1, "\"", ""));
          GComponentCe.PInterfaceAlpha(GInterfaceDb);
          int KInterfaceIndia = X.ExceptionPrintstacktrace(arrayOfString[2]);
          int j = X.ExceptionPrintstacktrace(arrayOfString[3]);
          GComponentCe.PInterfaceAlpha(j, KInterfaceIndia);
          GInterfaceDj GInterfaceDj = GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[4]);
          GComponentCe.PInterfaceAlpha(GInterfaceDj);
          byte PInterfaceBravo = 5;
          if (!arrayOfString[PInterfaceBravo].startsWith("\"")) {
            GInterfaceDj dj1 = GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]);
            GComponentCe.PInterfaceBravo(dj1);
          } 
          String str2 = KInterfaceFoxtrot(arrayOfString[PInterfaceBravo++]);
          GComponentCe.PInterfaceCharlie(str2);
          if (arrayOfString.length > PInterfaceBravo) {
            String str3 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
            str3 = X.PInterfaceBravo(str3, "}", "");
            GComponentCe.e(str3);
          } 
          if (arrayOfString.length > PInterfaceBravo && arrayOfString[PInterfaceBravo++].equals("hidden"))
            GComponentCe.PInterfaceAlpha(true); 
          GComponentCf.PInterfaceAlpha(GComponentCe);
          continue;
        } 
        if (str.equals("headerField")) {
          GComponentCe GComponentCe = new GComponentCe();
          String[] arrayOfString = j(m.e());
          GComponentCe.PInterfaceBravo(arrayOfString[0]);
          String str1 = KInterfaceFoxtrot(arrayOfString[1]);
          GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(str1, "\"", ""));
          GComponentCe.PInterfaceAlpha(GInterfaceDb);
          int KInterfaceIndia = X.ExceptionPrintstacktrace(arrayOfString[2]);
          int j = X.ExceptionPrintstacktrace(arrayOfString[3]);
          GComponentCe.PInterfaceAlpha(j, KInterfaceIndia);
          GInterfaceDj GInterfaceDj = GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[4]);
          GComponentCe.PInterfaceAlpha(GInterfaceDj);
          byte PInterfaceBravo = 5;
          if (!arrayOfString[PInterfaceBravo].startsWith("\"")) {
            GInterfaceDj dj1 = GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]);
            GComponentCe.PInterfaceBravo(dj1);
          } 
          String str2 = KInterfaceFoxtrot(arrayOfString[PInterfaceBravo++]);
          GComponentCe.PInterfaceCharlie(str2);
          if (arrayOfString.length > PInterfaceBravo) {
            String str3 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
            str3 = X.PInterfaceBravo(str3, "}", "");
            GComponentCe.e(str3);
          } 
          if (arrayOfString.length > PInterfaceBravo && arrayOfString[PInterfaceBravo++].equals("hidden"))
            GComponentCe.PInterfaceAlpha(true); 
          GComponentCf.PInterfaceCharlie(GComponentCe);
          continue;
        } 
        if (str.equals("calcField")) {
          GInterfaceCc GInterfaceCc = new GInterfaceCc();
          String[] arrayOfString = j(m.e());
          GInterfaceCc.PInterfaceBravo(arrayOfString[0]);
          GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[1], "\"", ""));
          GInterfaceCc.PInterfaceAlpha(GInterfaceDb);
          String str1 = KInterfaceFoxtrot(arrayOfString[2]);
          GInterfaceCc.PInterfaceCharlie(str1);
          String str2 = X.PInterfaceBravo(arrayOfString[3], "{", "");
          str2 = X.PInterfaceBravo(str2, "}", "");
          GInterfaceCc.PInterfaceAlpha(str2);
          if (arrayOfString.length > 4 && arrayOfString[4].equals("hidden"))
            GInterfaceCc.PInterfaceAlpha(true); 
          GComponentCf.PInterfaceAlpha(GInterfaceCc);
          continue;
        } 
        if (str.equals("stdLogger")) {
          paramR.l(m.e());
          continue;
        } 
        if (str.equals("overlaidDatasetCount")) {
          GComponentCd.e(Integer.parseInt(m.e()));
          continue;
        } 
        if (str.equals("defaultXAxis")) {
          GComponentCd.KInterfaceIndia(m.e());
          continue;
        } 
        if (str.equals("verticalMarker")) {
          String[] arrayOfString = j(m.e());
          String str1 = KInterfaceFoxtrot(arrayOfString[0]);
          String str2 = KInterfaceFoxtrot(arrayOfString[1]);
          String str3 = KInterfaceFoxtrot(arrayOfString[2]);
          double d = Double.parseDouble(arrayOfString[3]);
          GComponentCi GComponentCi = new GComponentCi(str1, str2, str3, d);
          GComponentCd.PInterfaceAlpha(GComponentCi);
          continue;
        } 
        if (str.equals("stopOnExit")) {
          GComponentCd.PInterfaceBravo(Boolean.parseBoolean(m.e().trim()));
          continue;
        } 
        PInterfaceBravo(m, "Unkown entry in [LoggerDefinition], skipping");
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        PInterfaceAlpha(m, "Error loading [LoggerDefinition], " + ExceptionPrintstacktrace.getMessage());
      } catch (Exception exception) {
        PInterfaceAlpha(m, "Error loading [LoggerDefinition], " + exception.getMessage());
        exception.printStackTrace();
      } 
    } 
  }
  
  private void p(R paramR, J paramJ) {
    for (M m : PInterfaceAlpha(paramJ, paramR, "TurboBaud")) {
      try {
        String str = m.KInterfaceFoxtrot();
        if (str.equals("turboBaudSpeed")) {
          GInterfaceDj GInterfaceDj = GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, m.e());
          paramR.O().PInterfaceAlpha(GInterfaceDj);
          continue;
        } 
        if (str.equals("sdTurboActive")) {
          GInterfaceDj GInterfaceDj = GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, m.e());
          paramR.O().PInterfaceBravo(GInterfaceDj);
          continue;
        } 
        if (str.equals("fullTimeTurboEnabled")) {
          GInterfaceDj GInterfaceDj = GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, m.e());
          paramR.O().PInterfaceCharlie(GInterfaceDj);
          continue;
        } 
        if (str.equals("runtimeTurboActive")) {
          GInterfaceDj GInterfaceDj = GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, m.e());
          paramR.O().d(GInterfaceDj);
          continue;
        } 
        if (!F.PInterfaceAlpha(str))
          PInterfaceBravo(m, "Unknown Command"); 
      } catch (Exception exception) {
        PInterfaceAlpha(m, "Error loading [TurboBaud], " + exception.getMessage());
        exception.printStackTrace();
      } 
    } 
  }
  
  private void q(R paramR, J paramJ) {
    for (M m : PInterfaceAlpha(paramJ, paramR, "Tools")) {
      try {
        String str = m.KInterfaceFoxtrot();
        EqualsInGPackage EqualsInGPackage = PInterfaceBravo(m);
        paramR.PInterfaceAlpha(true);
        if (EqualsInGPackage.aJ() != null && EqualsInGPackage.aJ().trim().length() > 0)
          PInterfaceAlpha(paramR, m, EqualsInGPackage.aJ(), false); 
        if (str.equals("addTool")) {
          ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage = paramR.e().PInterfaceCharlie(EqualsInGPackage.PInterfaceAlpha());
          if (ArrayListExceptionprintstacktraceInGPackage == null) {
            PInterfaceBravo(m, "Target UI component " + EqualsInGPackage.PInterfaceAlpha() + " is not in the currently loaded configuration.\nI can not add tool " + EqualsInGPackage.aL() + ", This line will CloneableImpl ignored.");
            continue;
          } 
          if (EqualsInGPackage.aL().equals("veTableGenerator") || EqualsInGPackage.aL().equals("afrTableGenerator") || EqualsInGPackage.aL().equals("Calculator") || EqualsInGPackage.aL().equals("TwoPointCalculator")) {
            ArrayListExceptionprintstacktraceInGPackage.PInterfaceAlpha(EqualsInGPackage);
            continue;
          } 
          PInterfaceBravo(m, "Tool " + EqualsInGPackage.aL() + " is not supported GComponentBy this version of application.\nI don't know how to add it, this line will CloneableImpl ignored.\nSupported Tools: veTableGenerator, afrTableGenerator, Calculator, TwoPointCalculator");
          continue;
        } 
        if (str.equals("removeTool")) {
          ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage = paramR.e().PInterfaceCharlie(EqualsInGPackage.PInterfaceAlpha());
          if (ArrayListExceptionprintstacktraceInGPackage == null) {
            PInterfaceBravo(m, "Target UI component " + EqualsInGPackage.PInterfaceAlpha() + " is not in the currently loaded configuration.\nI can not remove tool " + EqualsInGPackage.aL() + ", This line will CloneableImpl ignored.");
            continue;
          } 
          if (EqualsInGPackage.aL().equals("veTableGenerator") || EqualsInGPackage.aL().equals("afrTableGenerator")) {
            ArrayListExceptionprintstacktraceInGPackage.PInterfaceBravo(EqualsInGPackage);
            continue;
          } 
          PInterfaceBravo(m, "Tool " + EqualsInGPackage.aL() + " is not supported GComponentBy this version of application.\nI don't know how to remove it, this line will CloneableImpl ignored.");
        } 
      } catch (Exception exception) {
        PInterfaceAlpha(m, "Error loading [Tools], " + exception.getMessage());
        exception.printStackTrace();
      } 
    } 
  }
  
  private void r(R paramR, J paramJ) {
    for (M m : PInterfaceAlpha(paramJ, paramR, "SettingContextHelp")) {
      String str = m.PInterfaceBravo();
      if (str.length() > 3 && str.indexOf("=") != -1) {
        if (paramR.PInterfaceCharlie(m.KInterfaceFoxtrot()) == null && paramR.O().PInterfaceBravo(m.KInterfaceFoxtrot()) == null) {
          PInterfaceBravo(m, "No Constant or Command Button found with name " + m.KInterfaceFoxtrot());
          continue;
        } 
        String str1 = KInterfaceFoxtrot(m.e());
        str1 = X.PInterfaceBravo(str1, "\\n", "\n");
        str1 = X.PInterfaceBravo(str1, "\\\"", "\"");
        paramR.d(m.KInterfaceFoxtrot(), str1);
        continue;
      } 
      PInterfaceBravo(m, "Do not understand what to do with row, ignoring.");
    } 
  }
  
  private String KInterfaceFoxtrot(String paramString) {
    if (paramString.charAt(0) == '"')
      paramString = paramString.substring(1); 
    if (paramString.endsWith("\""))
      paramString = paramString.substring(0, paramString.length() - 1); 
    return paramString;
  }
  
  private EqualsInGPackage PInterfaceBravo(M paramM) {
    String[] arrayOfString = j(paramM.e());
    EqualsInGPackage EqualsInGPackage = new EqualsInGPackage();
    EqualsInGPackage.s(this.l);
    EqualsInGPackage.v(arrayOfString[0]);
    String str = X.PInterfaceBravo(arrayOfString[1], "\"", "");
    EqualsInGPackage.PInterfaceBravo(str);
    EqualsInGPackage.PInterfaceAlpha(arrayOfString[2]);
    if (arrayOfString.length > 3) {
      String str1 = X.PInterfaceBravo(arrayOfString[2], "{", "");
      str1 = X.PInterfaceBravo(str1, "}", "");
      EqualsInGPackage.u(str1);
    } 
    return EqualsInGPackage;
  }
  
  private void s(R paramR, J paramJ) {
    F KInterfaceFoxtrot = (paramR.O() != null) ? paramR.O() : new F();
    KInterfaceFoxtrot.PInterfaceAlpha((GInterfaceAi)paramR);
    paramR.PInterfaceAlpha(KInterfaceFoxtrot);
    Iterator<String> iterator = paramJ.PInterfaceBravo();
    while (iterator.hasNext()) {
      String str = iterator.next();
      int KInterfaceIndia = -1;
      Iterator<M> iterator1 = PInterfaceAlpha(paramJ, paramR, str).iterator();
      while (iterator1.hasNext()) {
        M m = iterator1.next();
        PInterfaceAlpha(m);
        try {
          String str1 = m.KInterfaceFoxtrot();
          if (str1.equals("page"))
            try {
              KInterfaceIndia = Integer.parseInt(m.e()) - 1;
            } catch (NumberFormatException numberFormatException) {
              PInterfaceBravo(m, "Invalid page number: " + m.e());
            }  
          if (F.PInterfaceAlpha(str1)) {
            String str2 = m.e();
            str2 = X.PInterfaceBravo(str2, "\"", "");
            if (KInterfaceIndia >= 0) {
              KInterfaceFoxtrot.PInterfaceAlpha(str1, str2, KInterfaceIndia);
            } else {
              KInterfaceFoxtrot.PInterfaceAlpha(str1, str2);
            } 
            if (str2.indexOf("$") == -1 || str2.indexOf("$tsCanId") == -1);
            continue;
          } 
          if (str1.equals("helpManualDownloadRoot")) {
            String str2 = KInterfaceFoxtrot(m.e());
            paramR.x(str2);
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
          String str1 = "Invalid row in ini file. Not sure how to handle this row:\n" + m;
          if (iterator1.hasNext())
            str1 = str1 + "\n" + iterator1.next(); 
          if (iterator1.hasNext())
            str1 = str1 + "\n" + iterator1.next(); 
          throw new ExceptionPrintstacktrace(str1);
        } 
      } 
    } 
  }
  
  public void PInterfaceAlpha(R paramR, GInterfaceBe parambE, J paramJ) {
    SerializableImplUsingArrayList SerializableImplUsingArrayList = null;
    GInterfaceBg GInterfaceBg = null;
    GComponentBu GComponentBu = null;
    GComponentBn GComponentBn = null;
    ArrayList arrayList = PInterfaceAlpha(paramJ, paramR, "ReferenceTables");
    arrayList = PInterfaceAlpha(arrayList, paramR);
    for (M m : arrayList) {
      String str = m.PInterfaceBravo();
      try {
        if (str.startsWith("referenceTable")) {
          SerializableImplUsingArrayList = new SerializableImplUsingArrayList();
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          SerializableImplUsingArrayList.v(arrayOfString[0].trim());
          if (arrayOfString.length > 1)
            SerializableImplUsingArrayList.s(X.PInterfaceBravo(arrayOfString[1], "\"", "")); 
          parambE.PInterfaceAlpha((ArrayListExceptionprintstacktraceInGPackage)SerializableImplUsingArrayList);
          continue;
        } 
        if (str.startsWith("topicHelp")) {
          GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, q(str));
          SerializableImplUsingArrayList.e(GInterfaceDb);
          if (GInterfaceDb.PInterfaceAlpha().startsWith("http:/") || GInterfaceDb.PInterfaceAlpha().startsWith("file:/")) {
            GComponentAj GComponentAj = new GComponentAj();
            GComponentAj.PInterfaceAlpha(GInterfaceDb);
            GComponentAj.PInterfaceBravo(GInterfaceDb);
            if (SerializableImplUsingArrayList.M() != null && SerializableImplUsingArrayList.M().length() > 0) {
              GComponentAj.PInterfaceBravo(SerializableImplUsingArrayList.M());
            } else {
              GComponentAj.PInterfaceBravo("Web Help");
            } 
            parambE.PInterfaceAlpha(GComponentAj);
          } 
          continue;
        } 
        if (str.startsWith("tableIdentifier")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          if (arrayOfString.length % 2 != 0)
            PInterfaceAlpha(m, "ReferenceTables::tableIdentifier has wrong number of parameters."); 
          for (byte PInterfaceBravo = 0; PInterfaceBravo + 1 < arrayOfString.length; PInterfaceBravo++) {
            SerializableImplUsingArrayList.PInterfaceAlpha(arrayOfString[PInterfaceBravo], arrayOfString[PInterfaceBravo + 1]);
            PInterfaceBravo++;
          } 
          continue;
        } 
        if (str.startsWith("solutionsLabel")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          SerializableImplUsingArrayList.PInterfaceBravo(X.PInterfaceBravo(arrayOfString[0], "\"", ""));
          continue;
        } 
        if (str.startsWith("tableStartOffset")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          SerializableImplUsingArrayList.PInterfaceCharlie(X.ExceptionPrintstacktrace(arrayOfString[0]));
          continue;
        } 
        if (str.startsWith("writeCommand")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          SerializableImplUsingArrayList.PInterfaceAlpha(KInterfaceFoxtrot(arrayOfString[0]));
          continue;
        } 
        if (str.startsWith("scale")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          SerializableImplUsingArrayList.PInterfaceAlpha(Double.parseDouble(arrayOfString[0]));
          continue;
        } 
        if (str.startsWith("tableGenerator")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          byte PInterfaceBravo = 0;
          String str2 = arrayOfString[PInterfaceBravo++];
          if (str2.equals("thermGenerator")) {
            GInterfaceBg = new GInterfaceBg();
            GInterfaceBg.PInterfaceCharlie(str2);
            if (arrayOfString.length > PInterfaceBravo)
              GInterfaceBg.d(X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", "")); 
            SerializableImplUsingArrayList.PInterfaceAlpha((AbstractInGPackage)GInterfaceBg);
            continue;
          } 
          if (str2.equals("fileBrowseGenerator")) {
            GComponentBn = new GComponentBn();
            GComponentBn.PInterfaceCharlie(str2);
            if (arrayOfString.length > PInterfaceBravo)
              GComponentBn.d(X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", "")); 
            SerializableImplUsingArrayList.PInterfaceAlpha((AbstractInGPackage)GComponentBn);
            continue;
          } 
          if (str2.equals("linearGenerator")) {
            GComponentBu = new GComponentBu();
            GComponentBu.PInterfaceCharlie(str2);
            if (arrayOfString.length > PInterfaceBravo)
              GComponentBu.d(X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", "")); 
            if (arrayOfString.length > PInterfaceBravo)
              GComponentBu.PInterfaceAlpha(X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", "")); 
            if (arrayOfString.length > PInterfaceBravo)
              GComponentBu.PInterfaceBravo(X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", "")); 
            if (arrayOfString.length > PInterfaceBravo)
              GComponentBu.PInterfaceAlpha(Double.parseDouble(arrayOfString[PInterfaceBravo++])); 
            if (arrayOfString.length > PInterfaceBravo)
              GComponentBu.PInterfaceBravo(Double.parseDouble(arrayOfString[PInterfaceBravo++])); 
            if (arrayOfString.length > PInterfaceBravo)
              GComponentBu.PInterfaceCharlie(Double.parseDouble(arrayOfString[PInterfaceBravo++])); 
            if (arrayOfString.length > PInterfaceBravo)
              GComponentBu.d(Double.parseDouble(arrayOfString[PInterfaceBravo++])); 
            SerializableImplUsingArrayList.PInterfaceAlpha((AbstractInGPackage)GComponentBu);
          } 
          continue;
        } 
        if (str.startsWith("adcCount")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          SerializableImplUsingArrayList.PInterfaceAlpha(X.ExceptionPrintstacktrace(arrayOfString[0]));
          continue;
        } 
        if (str.startsWith("bytesPerAdc")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          SerializableImplUsingArrayList.PInterfaceBravo(X.ExceptionPrintstacktrace(arrayOfString[0]));
          continue;
        } 
        if (str.startsWith("tableLimits")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          SerializableImplUsingArrayList.PInterfaceAlpha(arrayOfString[0], Double.parseDouble(arrayOfString[1]), Double.parseDouble(arrayOfString[2]), Double.parseDouble(arrayOfString[3]));
          continue;
        } 
        if (str.startsWith("thermOption")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          try {
            GInterfaceBh GInterfaceBh = new GInterfaceBh();
            byte PInterfaceBravo = 0;
            GInterfaceBh.PInterfaceAlpha(X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
            GInterfaceBh.PInterfaceAlpha(Double.parseDouble(arrayOfString[PInterfaceBravo++]));
            GInterfaceBh.PInterfaceBravo(Double.parseDouble(arrayOfString[PInterfaceBravo++]));
            GInterfaceBh.PInterfaceCharlie(Double.parseDouble(arrayOfString[PInterfaceBravo++]));
            GInterfaceBh.d(Double.parseDouble(arrayOfString[PInterfaceBravo++]));
            GInterfaceBh.e(Double.parseDouble(arrayOfString[PInterfaceBravo++]));
            GInterfaceBh.KInterfaceFoxtrot(Double.parseDouble(arrayOfString[PInterfaceBravo++]));
            GInterfaceBh.ExceptionPrintstacktrace(Double.parseDouble(arrayOfString[PInterfaceBravo++]));
            if (GInterfaceBg != null) {
              GInterfaceBg.PInterfaceAlpha(GInterfaceBh);
              continue;
            } 
            PInterfaceBravo(m, "thermOption defined before PInterfaceAlpha thermGenerator! The following line must CloneableImpl declared after PInterfaceAlpha thermGenerator.");
          } catch (Exception exception) {
            PInterfaceAlpha(m, "Invalid ini entry. thermOption must have the format:\nthermOption\t= name, resistor bias, tempPoint1(" + T.PInterfaceAlpha() + "C), resPoint1, tempPoint2, resPoint2, tempPoint3, resPoint3");
          } 
          continue;
        } 
        if (str.startsWith("solution")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          Tostring Tostring = new Tostring();
          Tostring.PInterfaceAlpha(X.PInterfaceBravo(arrayOfString[0], "\"", ""));
          String str2 = arrayOfString[1];
          str2 = X.PInterfaceBravo(str2, "{", "");
          str2 = X.PInterfaceBravo(str2, "}", "");
          Tostring.PInterfaceBravo(str2);
          SerializableImplUsingArrayList.PInterfaceAlpha(Tostring);
        } 
      } catch (Exception exception) {
        PInterfaceAlpha(m, "Invalid Ini entry for reference table, Ignored.");
      } 
    } 
  }
  
  public void PInterfaceBravo(R paramR, GInterfaceBe parambE, J paramJ) {
    ArrayListExceptionprintstacktrace ArrayListExceptionprintstacktrace = null;
    ArrayList arrayList = PInterfaceAlpha(paramJ, paramR, "PortEditor");
    arrayList = PInterfaceAlpha(arrayList, paramR);
    for (M m : arrayList) {
      PInterfaceAlpha(m);
      String str = m.PInterfaceBravo();
      try {
        if (str.startsWith("portEditor")) {
          ArrayListExceptionprintstacktrace = new ArrayListExceptionprintstacktrace();
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          ArrayListExceptionprintstacktrace.v(arrayOfString[0].trim());
          if (arrayOfString.length > 1)
            ArrayListExceptionprintstacktrace.s(X.PInterfaceBravo(arrayOfString[1], "\"", "")); 
          parambE.PInterfaceAlpha((ArrayListExceptionprintstacktraceInGPackage)ArrayListExceptionprintstacktrace);
          continue;
        } 
        if (str.startsWith("topicHelp")) {
          GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, q(str));
          ArrayListExceptionprintstacktrace.e(GInterfaceDb);
          if (GInterfaceDb.PInterfaceAlpha().startsWith("http:/") || GInterfaceDb.PInterfaceAlpha().startsWith("file:/")) {
            GComponentAj GComponentAj = new GComponentAj();
            GComponentAj.PInterfaceAlpha(GInterfaceDb);
            GComponentAj.PInterfaceBravo(GInterfaceDb);
            if (ArrayListExceptionprintstacktrace.M() != null && ArrayListExceptionprintstacktrace.M().length() > 0) {
              GComponentAj.PInterfaceBravo(ArrayListExceptionprintstacktrace.M());
            } else {
              GComponentAj.PInterfaceBravo("Web Help");
            } 
            parambE.PInterfaceAlpha(GComponentAj);
          } 
          continue;
        } 
        if (str.startsWith("enabledPorts")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          if (arrayOfString.length < 2)
            PInterfaceAlpha(m, "PortEditor::enabledPorts requires at least 2 parameters."); 
          ArrayListExceptionprintstacktrace.PInterfaceCharlie(arrayOfString[0]);
          for (byte PInterfaceBravo = 1; PInterfaceBravo < arrayOfString.length; PInterfaceBravo++)
            ArrayListExceptionprintstacktrace.PInterfaceAlpha(arrayOfString[PInterfaceBravo]); 
          continue;
        } 
        if (str.startsWith("outputCanId")) {
          String str1 = q(str);
          ArrayListExceptionprintstacktrace.l(str1);
          continue;
        } 
        if (str.startsWith("outputCanId")) {
          String str1 = q(str);
          ArrayListExceptionprintstacktrace.l(str1);
          continue;
        } 
        if (str.startsWith("outputOffset")) {
          String str1 = q(str);
          ArrayListExceptionprintstacktrace.e(str1);
          continue;
        } 
        if (str.startsWith("outputName")) {
          String str1 = q(str);
          ArrayListExceptionprintstacktrace.n(str1);
          continue;
        } 
        if (str.startsWith("outputSize")) {
          String str1 = q(str);
          ArrayListExceptionprintstacktrace.d(str1);
          continue;
        } 
        if (str.startsWith("threshold")) {
          String str1 = q(str);
          ArrayListExceptionprintstacktrace.ExceptionPrintstacktrace(str1);
          continue;
        } 
        if (str.startsWith("hysteresis")) {
          String str1 = q(str);
          ArrayListExceptionprintstacktrace.KInterfaceHotel(str1);
          continue;
        } 
        if (str.startsWith("powerOnValue")) {
          String str1 = q(str);
          ArrayListExceptionprintstacktrace.a_(str1);
          continue;
        } 
        if (str.startsWith("triggerValue")) {
          String str1 = q(str);
          ArrayListExceptionprintstacktrace.j(str1);
          continue;
        } 
        if (str.startsWith("activateOption")) {
          String str1 = q(str);
          ArrayListExceptionprintstacktrace.m(str1);
          continue;
        } 
        if (str.startsWith("portActiveDelay")) {
          String str1 = q(str);
          ArrayListExceptionprintstacktrace.o(str1);
          continue;
        } 
        if (str.startsWith("portInactiveDelay")) {
          String str1 = q(str);
          ArrayListExceptionprintstacktrace.p(str1);
          continue;
        } 
        if (str.startsWith("portCustomAttributes")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          for (String str2 : arrayOfString) {
            str2 = str2.trim();
            if (!str2.isEmpty())
              ArrayListExceptionprintstacktrace.q(str2); 
          } 
          continue;
        } 
        if (str.startsWith("portCustomLabels")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          for (String str2 : arrayOfString) {
            str2 = KInterfaceFoxtrot(str2.trim());
            if (!str2.isEmpty())
              ArrayListExceptionprintstacktrace.r(str2); 
          } 
          continue;
        } 
        if (str.startsWith("operators")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          ArrayListExceptionprintstacktrace.KInterfaceFoxtrot(arrayOfString[0]);
          Manager Manager = paramR.PInterfaceCharlie(arrayOfString[0]);
          for (byte PInterfaceBravo = 1; PInterfaceBravo < arrayOfString.length; PInterfaceBravo++) {
            String str2 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo], "\"", "");
            if (str2.length() != 1)
              PInterfaceBravo(m, "Invalid operator in Port Editor."); 
            Character character = new Character(str2.charAt(0));
            ArrayListExceptionprintstacktrace.PInterfaceAlpha(character);
            Manager.PInterfaceAlpha(character.charValue());
          } 
          continue;
        } 
        if (str.startsWith("conditionRelationship")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          ArrayListExceptionprintstacktrace.k(arrayOfString[0]);
          Manager Manager = paramR.PInterfaceCharlie(arrayOfString[0]);
          for (byte PInterfaceBravo = 1; PInterfaceBravo < arrayOfString.length; PInterfaceBravo++) {
            String str2 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo], "\"", "");
            if (str2.length() != 1)
              PInterfaceBravo(m, "Invalid conditionRelationship in Port Editor."); 
            Character character = new Character(str2.charAt(0));
            ArrayListExceptionprintstacktrace.PInterfaceBravo(character);
            Manager.PInterfaceAlpha(character.charValue());
          } 
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("portEnabledCondition")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          if (arrayOfString.length != ArrayListExceptionprintstacktrace.s())
            PInterfaceBravo(m, "Number of Ports does not match number of portEnableCondition! " + ArrayListExceptionprintstacktrace.s() + " Ports, " + arrayOfString.length + " portEnabledConditions. Check your indexing"); 
          for (String str2 : arrayOfString) {
            str2 = X.PInterfaceBravo(str2, "{", "");
            str2 = X.PInterfaceBravo(str2, "}", "");
            PInterfaceAlpha(paramR, m, str2, false);
            ArrayListExceptionprintstacktrace.PInterfaceBravo(str2);
          } 
        } 
      } catch (Exception exception) {
        PInterfaceAlpha(m, "Invalid Ini entry for reference table, Ignored.");
      } 
    } 
  }
  
  public ArrayList PInterfaceAlpha(J paramJ, R paramR, String paramString) {
    return paramJ.PInterfaceBravo(paramString);
  }
  
  public ArrayList PInterfaceAlpha(J paramJ, R paramR) {
    ArrayList arrayList = paramJ.PInterfaceAlpha();
    return PInterfaceAlpha(arrayList, paramR);
  }
  
  public ArrayList PInterfaceAlpha(ArrayList<M> paramArrayList, R paramR) {
    ArrayList<M> arrayList = new ArrayList();
    M m = null;
    try {
      while (paramArrayList.size() > 0) {
        m = paramArrayList.get(0);
        String str = m.PInterfaceBravo();
        str = str.trim();
        if (str.startsWith("#if")) {
          arrayList = PInterfaceAlpha(paramR, paramArrayList, arrayList, 0);
          continue;
        } 
        if (str.startsWith("#elif") || str.startsWith("#endif") || str.startsWith("#else")) {
          PInterfaceAlpha(m, "#endif, #elif or #else found but no owning #if found");
          paramArrayList.remove(0);
          continue;
        } 
        paramArrayList.remove(0);
        if (str.startsWith("#define")) {
          String[] arrayOfString = m.KInterfaceFoxtrot().split(" ");
          if (arrayOfString.length != 2) {
            PInterfaceBravo(m, "Invalid define entry, Name format error: " + m.KInterfaceFoxtrot());
          } else {
            String str1 = arrayOfString[1];
            this.e.put(str1, PInterfaceCharlie(m, m.e()));
          } 
        } 
        if (!str.startsWith("#")) {
          arrayList.add(m);
          continue;
        } 
        if (str.trim().startsWith("#error")) {
          String str1 = "A critical Error was encountered in this projects ini file.\n\nThe following message was provided:\n" + X.PInterfaceBravo(str, "#error", "").trim();
          throw new PInterfaceCharlie(str1);
        } 
      } 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      throw ExceptionPrintstacktrace;
    } catch (Exception exception) {
      PInterfaceAlpha(m, "Encountered PInterfaceAlpha problem while applying user settings to ini.");
    } 
    return arrayList;
  }
  
  private ArrayList PInterfaceAlpha(R paramR, ArrayList<M> paramArrayList1, ArrayList<M> paramArrayList2, int paramInt) {
    byte PInterfaceBravo = 0;
    boolean bool = false;
    M m = null;
    try {
      while (paramInt < paramArrayList1.size()) {
        m = paramArrayList1.get(paramInt);
        String str = m.PInterfaceBravo();
        paramArrayList1.remove(paramInt);
        if (str.startsWith("#if")) {
          PInterfaceBravo++;
        } else if (str.startsWith("#endif")) {
          PInterfaceBravo--;
        } 
        if (PInterfaceBravo <= 1 && str.startsWith("#if")) {
          bool = PInterfaceAlpha(str, paramR);
          continue;
        } 
        if (str.startsWith("#if") && bool) {
          paramArrayList1.add(paramInt, m);
          paramArrayList2 = PInterfaceAlpha(paramR, paramArrayList1, paramArrayList2, paramInt);
          PInterfaceBravo--;
          continue;
        } 
        if (PInterfaceBravo <= 1 && str.startsWith("#elif")) {
          if (bool) {
            PInterfaceAlpha(paramArrayList1);
            bool = false;
            PInterfaceBravo--;
            return paramArrayList2;
          } 
          bool = PInterfaceAlpha(str, paramR);
          continue;
        } 
        if (PInterfaceBravo == 1 && str.startsWith("#else")) {
          if (bool) {
            PInterfaceAlpha(paramArrayList1);
            bool = false;
            PInterfaceBravo--;
            return paramArrayList2;
          } 
          bool = true;
          continue;
        } 
        if (PInterfaceBravo == 0 && str.startsWith("#endif"))
          return paramArrayList2; 
        if (str.startsWith("#error")) {
          String str1 = "A critical Error was encountered in this projects ini file.\nThe following message was provided:\n\n" + X.PInterfaceBravo(str, "#error", "").trim();
          throw new PInterfaceCharlie(str1);
        } 
        if (!str.startsWith("#") && bool)
          paramArrayList2.add(m); 
      } 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      throw ExceptionPrintstacktrace;
    } catch (Exception exception) {
      exception.printStackTrace();
      PInterfaceAlpha(m, "Error while applying #if #else Conditions at row:");
    } 
    return paramArrayList2;
  }
  
  private void PInterfaceAlpha(ArrayList<M> paramArrayList) {
    byte PInterfaceBravo = 0;
    while (paramArrayList.size() > 0) {
      M m = paramArrayList.get(0);
      String str = m.PInterfaceBravo();
      paramArrayList.remove(0);
      if (str.startsWith("#if")) {
        PInterfaceBravo++;
        continue;
      } 
      if (str.startsWith("#endif")) {
        if (PInterfaceBravo == 0)
          break; 
        PInterfaceBravo--;
      } 
    } 
  }
  
  private boolean PInterfaceAlpha(String paramString, R paramR) {
    if (paramString.startsWith("#")) {
      paramString = r(paramString);
    } else {
      paramString = paramString.trim();
    } 
    return (paramR.d(paramString) != null || paramString.equals("TUNERSTUDIO") || paramString.equals("INI_VERSION_2"));
  }
  
  private GInterfaceAh j(R paramR, M paramM) {
    String str1 = paramM.PInterfaceBravo();
    GInterfaceAh GInterfaceAh = new GInterfaceAh();
    GInterfaceAh.s(this.l);
    GInterfaceAh.v(p(str1));
    String str2 = q(str1);
    String[] arrayOfString = j(str2);
    try {
      byte PInterfaceBravo = 0;
      String str = arrayOfString[PInterfaceBravo++];
      GInterfaceAh.PInterfaceAlpha(str);
      GInterfaceDb db1 = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
      GInterfaceAh.PInterfaceBravo(db1);
      GInterfaceDb db2 = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
      GInterfaceAh.PInterfaceAlpha(db2);
      GInterfaceDj dj1 = GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]);
      GInterfaceAh.PInterfaceAlpha(dj1);
      GInterfaceDj dj2 = GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]);
      GInterfaceAh.PInterfaceBravo(dj2);
      if (arrayOfString.length > PInterfaceBravo) {
        PInterfaceAlpha(paramR, paramM, arrayOfString[PInterfaceBravo], "Invalid Low Critical Expression", false);
        GInterfaceAh.KInterfaceHotel(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]));
      } 
      if (arrayOfString.length > PInterfaceBravo) {
        PInterfaceAlpha(paramR, paramM, arrayOfString[PInterfaceBravo], "Invalid Low Warning Expression", false);
        GInterfaceAh.PInterfaceCharlie(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]));
      } 
      if (arrayOfString.length > PInterfaceBravo) {
        PInterfaceAlpha(paramR, paramM, arrayOfString[PInterfaceBravo], "Invalid High Warning Expression", false);
        GInterfaceAh.d(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]));
      } 
      if (arrayOfString.length > PInterfaceBravo) {
        PInterfaceAlpha(paramR, paramM, arrayOfString[PInterfaceBravo], "Invalid LHigh Critical Expression", false);
        GInterfaceAh.e(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]));
      } 
      if (arrayOfString.length > PInterfaceBravo) {
        PInterfaceAlpha(paramR, paramM, arrayOfString[PInterfaceBravo], "Invalid Value Digits Expression", false);
        GInterfaceAh.KInterfaceFoxtrot(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]));
      } 
      if (arrayOfString.length > PInterfaceBravo) {
        PInterfaceAlpha(paramR, paramM, arrayOfString[PInterfaceBravo], "Invalid Label Digits Expression", false);
        GInterfaceAh.ExceptionPrintstacktrace(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]));
      } 
      if (arrayOfString.length > PInterfaceBravo) {
        String str3 = arrayOfString[PInterfaceBravo++];
        str3 = X.PInterfaceBravo(str3, "{", "");
        str3 = X.PInterfaceBravo(str3, "}", "");
        GInterfaceAh.u(str3);
        PInterfaceAlpha(paramR, paramM, str3, "Invalid Enabled Expression", false);
      } 
      if (dj1 instanceof B && dj2 instanceof B && GInterfaceAh.PInterfaceAlpha() > GInterfaceAh.d()) {
        double d = GInterfaceAh.PInterfaceAlpha();
        GInterfaceAh.PInterfaceAlpha(GInterfaceAh.d());
        GInterfaceAh.PInterfaceBravo(d);
        GInterfaceAh.PInterfaceAlpha(true);
      } 
      if (GInterfaceAh.o() instanceof SerializableImplTostring) {
        SerializableImplTostring SerializableImplTostring = (SerializableImplTostring)GInterfaceAh.o();
        PInterfaceAlpha(paramR, paramM, SerializableImplTostring.PInterfaceCharlie(), "Invalid Low Critical Expression", false);
      } 
      if (GInterfaceAh.KInterfaceFoxtrot() instanceof SerializableImplTostring) {
        SerializableImplTostring SerializableImplTostring = (SerializableImplTostring)GInterfaceAh.KInterfaceFoxtrot();
        PInterfaceAlpha(paramR, paramM, SerializableImplTostring.PInterfaceCharlie(), "Invalid Low Warning Expression", false);
      } 
      if (GInterfaceAh.KInterfaceHotel() instanceof SerializableImplTostring) {
        SerializableImplTostring SerializableImplTostring = (SerializableImplTostring)GInterfaceAh.KInterfaceHotel();
        PInterfaceAlpha(paramR, paramM, SerializableImplTostring.PInterfaceCharlie(), "Invalid High Critical Expression", false);
      } 
      if (GInterfaceAh.ExceptionPrintstacktrace() instanceof SerializableImplTostring) {
        SerializableImplTostring SerializableImplTostring = (SerializableImplTostring)GInterfaceAh.ExceptionPrintstacktrace();
        PInterfaceAlpha(paramR, paramM, SerializableImplTostring.PInterfaceCharlie(), "Invalid high Warning Expression", false);
      } 
    } catch (Exception exception) {
      throw new ExceptionPrintstacktrace("Corrupt Gauge Entry :\n" + str1);
    } 
    return GInterfaceAh;
  }
  
  private k ExceptionPrintstacktrace(String paramString) {
    paramString = paramString.trim();
    return paramString.equals("white") ? k.PInterfaceAlpha : (paramString.equalsIgnoreCase("red") ? k.k : (paramString.equalsIgnoreCase("black") ? k.KInterfaceIndia : (paramString.equalsIgnoreCase("green") ? k.s : (paramString.equalsIgnoreCase("cyan") ? k.w : (paramString.equalsIgnoreCase("blue") ? k.y : (paramString.equalsIgnoreCase("grey") ? k.e : (paramString.equalsIgnoreCase("gray") ? k.e : (paramString.equalsIgnoreCase("darkGray") ? k.ExceptionPrintstacktrace : (paramString.equalsIgnoreCase("lightGray") ? k.PInterfaceCharlie : (paramString.equalsIgnoreCase("darkGrey") ? k.ExceptionPrintstacktrace : (paramString.equalsIgnoreCase("lightGrey") ? k.PInterfaceCharlie : (paramString.equalsIgnoreCase("yellow") ? k.q : (paramString.equalsIgnoreCase("transparent") ? k.A : (paramString.equalsIgnoreCase("magenta") ? k.v : k.l))))))))))))));
  }
  
  private Exceptionprintstacktrace PInterfaceAlpha(M paramM, R paramR) {
    Exceptionprintstacktrace Exceptionprintstacktrace = new Exceptionprintstacktrace();
    Exceptionprintstacktrace.s(this.l);
    String str = paramM.e();
    String[] arrayOfString = j(str);
    try {
      byte PInterfaceBravo = 0;
      String str1 = arrayOfString[PInterfaceBravo++];
      str1 = X.PInterfaceBravo(str1, "{", "");
      str1 = X.PInterfaceBravo(str1, "}", "");
      GInterfaceDb db1 = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
      Exceptionprintstacktrace.PInterfaceBravo(db1);
      GInterfaceDb db2 = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
      Exceptionprintstacktrace.PInterfaceAlpha(db2);
      Exceptionprintstacktrace.v(KInterfaceIndia(Exceptionprintstacktrace.PInterfaceBravo()));
      if (arrayOfString.length > PInterfaceBravo)
        Exceptionprintstacktrace.PInterfaceBravo(ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++])); 
      if (arrayOfString.length > PInterfaceBravo)
        Exceptionprintstacktrace.d(ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++])); 
      if (arrayOfString.length > PInterfaceBravo)
        Exceptionprintstacktrace.PInterfaceAlpha(ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++])); 
      if (arrayOfString.length > PInterfaceBravo)
        Exceptionprintstacktrace.PInterfaceCharlie(ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++])); 
      SerializableImpl SerializableImpl = new SerializableImpl(paramR.PInterfaceCharlie());
      SerializableImpl.v(Exceptionprintstacktrace.aL() + "OC");
      SerializableImpl.e(str1);
      SerializableImpl.PInterfaceAlpha("formula");
      SerializableImpl.PInterfaceCharlie(GInterfaceDk.PInterfaceAlpha(0.0D));
      PInterfaceAlpha(paramR, paramM, str1, "Invalid Indicator Expression: ", false);
      paramR.PInterfaceAlpha(SerializableImpl);
      if (paramR.ExceptionPrintstacktrace(str1.trim()) != null) {
        Exceptionprintstacktrace.PInterfaceAlpha(str1.trim());
      } else {
        String str2 = KInterfaceHotel(str1);
        if (str2.length() > 1 && !I.PInterfaceAlpha(str2.substring(0, 1))) {
          SerializableImpl = new SerializableImpl(paramR.PInterfaceCharlie());
          SerializableImpl.v(str2 + "_OC");
          SerializableImpl.e(str1);
          SerializableImpl.PInterfaceAlpha("formula");
          PInterfaceAlpha(paramR, paramM, str1, "Invalid Indicator Expression: ", false);
          paramR.PInterfaceAlpha(SerializableImpl);
          Exceptionprintstacktrace.PInterfaceAlpha(SerializableImpl.aL());
        } 
      } 
    } catch (Exception exception) {
      PInterfaceAlpha(paramM, "Corrupt Indicator Entry");
    } 
    return Exceptionprintstacktrace;
  }
  
  private String KInterfaceHotel(String paramString) {
    null = X.PInterfaceBravo(paramString, " ", "");
    null = X.PInterfaceBravo(null, "<", "LT");
    null = X.PInterfaceBravo(null, ">", "GT");
    null = X.PInterfaceBravo(null, "&", "AND");
    null = X.PInterfaceBravo(null, "|", "OR");
    null = X.PInterfaceBravo(null, "=", "EQ");
    null = X.PInterfaceBravo(null, "-", "MN");
    null = X.PInterfaceBravo(null, "+", "PL");
    null = X.PInterfaceBravo(null, "%", "MOD");
    null = X.PInterfaceBravo(null, "/", "DIV");
    null = X.PInterfaceBravo(null, "!", "NOT");
    null = X.PInterfaceBravo(null, "^", "XOR");
    null = X.PInterfaceBravo(null, "*", "x");
    null = X.PInterfaceBravo(null, ",", "Com");
    null = X.PInterfaceBravo(null, "[", "LB");
    null = X.PInterfaceBravo(null, "]", "RB");
    null = X.PInterfaceBravo(null, "(", "LP");
    null = X.PInterfaceBravo(null, ")", "RP");
    null = X.PInterfaceBravo(null, "?", "QU");
    return X.PInterfaceBravo(null, ":", "COL");
  }
  
  private String KInterfaceIndia(String paramString) {
    return X.e(paramString);
  }
  
  private String[] j(String paramString) {
    return Q.PInterfaceCharlie(paramString);
  }
  
  private SerializableImplExceptionprintstacktrace k(R paramR, M paramM) {
    SerializableImplExceptionprintstacktrace ac1 = new SerializableImplExceptionprintstacktrace();
    String str1 = paramM.PInterfaceBravo();
    ac1.s(this.l);
    String str2 = q(str1);
    String[] arrayOfString = j(str2);
    try {
      byte PInterfaceBravo = 0;
      String str3 = arrayOfString[PInterfaceBravo++];
      if (str3.equals("time")) {
        str3 = "dataLogTime";
        if (paramR.ExceptionPrintstacktrace(str3) == null) {
          SerializableImpl SerializableImpl = new SerializableImpl(paramR.PInterfaceCharlie());
          SerializableImpl.PInterfaceAlpha("formula");
          SerializableImpl.e("AppEvent.dataLogTime");
          SerializableImpl.v(str3);
          SerializableImpl.PInterfaceCharlie("s");
          paramR.PInterfaceAlpha(SerializableImpl);
        } 
      } 
      ac1.PInterfaceBravo(str3);
      String str4 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", "");
      GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, str4);
      if (GInterfaceDb instanceof PInterfaceCharlie) {
        String str = GInterfaceDb.PInterfaceAlpha();
        if (str.length() > 0 && (str.getBytes()[0] == 42 || str.getBytes()[0] == 37 || str.getBytes()[0] == 47 || str.getBytes()[0] == 94 || str.getBytes()[0] == 33 || str.getBytes()[0] == 38 || str.getBytes()[0] == 43 || str.getBytes()[0] == 126 || str.getBytes()[0] == 61 || str.getBytes()[0] == 126 || str.getBytes()[0] == 45)) {
          PInterfaceAlpha(paramM, "Log Field units cannot start with special / mathematical characters.");
          str = PInterfaceBravo(str);
          ((PInterfaceCharlie)GInterfaceDb).PInterfaceAlpha(str);
        } 
      } 
      ac1.PInterfaceAlpha(GInterfaceDb);
      ac1.v(str4);
      PInterfaceBravo++;
      ac1.PInterfaceAlpha(arrayOfString[++PInterfaceBravo]);
      if (arrayOfString.length > PInterfaceBravo) {
        String str = arrayOfString[PInterfaceBravo++];
        str = X.PInterfaceBravo(str, "{", "");
        str = X.PInterfaceBravo(str, "}", "").trim();
        ac1.u(str);
        if (arrayOfString.length > PInterfaceBravo) {
          String str5 = arrayOfString[PInterfaceBravo++];
          str5 = X.PInterfaceBravo(str5, "{", "");
          str5 = X.PInterfaceBravo(str5, "}", "").trim();
          ac1.PInterfaceAlpha((GInterfaceDj)new SerializableImplTostring((GInterfaceAi)paramR, str5));
        } 
      } 
    } catch (Exception exception) {
      throw new ExceptionPrintstacktrace("Corrupt DataLog Entry :\n" + str1);
    } 
    return ac1;
  }
  
  public String PInterfaceBravo(String paramString) {
    if (paramString != null) {
      paramString = X.PInterfaceBravo(paramString, "/", "");
      paramString = X.PInterfaceBravo(paramString, "+", "_");
      paramString = X.PInterfaceBravo(paramString, "*", "x");
      paramString = X.PInterfaceBravo(paramString, "%", "");
      paramString = X.PInterfaceBravo(paramString, "^", "");
      paramString = X.PInterfaceBravo(paramString, "|", "");
      paramString = X.PInterfaceBravo(paramString, "(", "_");
      paramString = X.PInterfaceBravo(paramString, ")", "_");
      paramString = X.PInterfaceBravo(paramString, "{", "");
      paramString = X.PInterfaceBravo(paramString, "}", "");
      paramString = X.PInterfaceBravo(paramString, "$", "");
      paramString = X.PInterfaceBravo(paramString, "&", "");
    } 
    return paramString;
  }
  
  private SerializableImpl PInterfaceAlpha(M paramM, R paramR, int paramInt1, int paramInt2) {
    SerializableImpl SerializableImpl = new SerializableImpl(paramR.PInterfaceCharlie());
    SerializableImpl.s(this.l);
    String str1 = paramM.PInterfaceBravo();
    SerializableImpl.v(p(str1));
    boolean bool = (paramR.O() != null && paramR.O().GComponentAl().equals("XCP")) ? true : false;
    String str2 = q(str1);
    String[] arrayOfString = j(str2);
    byte PInterfaceBravo = 0;
    try {
      if (str2.startsWith("scalar") || str2.startsWith("dotScalar")) {
        SerializableImpl.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
        SerializableImpl.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
        String str = arrayOfString[PInterfaceBravo++];
        if (bool) {
          long l = (paramR.O().af() + X.ExceptionPrintstacktrace(str));
          SerializableImpl.PInterfaceAlpha(l);
          str = "nextOffset";
        } 
        if (str.equals("nextOffset")) {
          SerializableImpl.PInterfaceAlpha(paramInt1);
        } else if (str.equals("lastOffset")) {
          SerializableImpl.PInterfaceAlpha(paramInt2);
        } else {
          int KInterfaceIndia = X.ExceptionPrintstacktrace(str);
          if (KInterfaceIndia < paramInt1);
          SerializableImpl.PInterfaceAlpha(KInterfaceIndia);
        } 
        if (arrayOfString.length > PInterfaceBravo) {
          if (arrayOfString.length > PInterfaceBravo) {
            GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
            SerializableImpl.PInterfaceAlpha(GInterfaceDb);
          } 
          SerializableImpl.PInterfaceAlpha(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]));
          if (str2.startsWith("dotScalar")) {
            SerializableImpl.PInterfaceCharlie(X.ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++]));
          } else {
            SerializableImpl.PInterfaceBravo(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]));
          } 
        } 
        while (arrayOfString.length > PInterfaceBravo) {
          String str3 = arrayOfString[PInterfaceBravo++];
          if (str3.equals("hidden")) {
            SerializableImpl.PInterfaceCharlie(GInterfaceDk.PInterfaceAlpha(0.0D));
            continue;
          } 
          if (str3.startsWith("{")) {
            SerializableImpl.PInterfaceCharlie(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, str3));
            continue;
          } 
          if (str3.equals("persistValue"))
            continue; 
          PInterfaceBravo(paramM, "Unknown OutputChannel visible condition or flag");
        } 
      } else if (arrayOfString.length > 0 && arrayOfString[0].equals("bits")) {
        SerializableImpl.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
        SerializableImpl.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
        String str3 = arrayOfString[PInterfaceBravo++];
        if (bool) {
          long l = (paramR.O().af() + X.ExceptionPrintstacktrace(str3));
          SerializableImpl.PInterfaceAlpha(l);
          str3 = "nextOffset";
        } 
        if (str3.equals("nextOffset")) {
          SerializableImpl.PInterfaceAlpha(paramInt1);
        } else if (str3.equals("lastOffset")) {
          SerializableImpl.PInterfaceAlpha(paramInt2);
        } else {
          int KInterfaceIndia = X.ExceptionPrintstacktrace(str3);
          if (KInterfaceIndia < paramInt1 - SerializableImpl.l());
          SerializableImpl.PInterfaceAlpha(KInterfaceIndia);
        } 
        String str4 = arrayOfString[PInterfaceBravo++];
        SerializableImpl.d(m(str4));
        SerializableImpl.e(n(str4));
        while (PInterfaceBravo < arrayOfString.length) {
          try {
            SerializableImpl.d(X.PInterfaceBravo(arrayOfString[PInterfaceBravo], "\"", ""));
          } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
            PInterfaceBravo(paramM, ExceptionPrintstacktrace.getLocalizedMessage());
          } 
          PInterfaceBravo++;
        } 
      } else if (str2.startsWith("{")) {
        SerializableImpl.PInterfaceAlpha("formula");
        String str = arrayOfString[PInterfaceBravo++];
        str = X.PInterfaceBravo(str, "{", "");
        str = X.PInterfaceBravo(str, "}", "");
        str = k(str);
        SerializableImpl.e(str);
        if (arrayOfString.length > 1 && arrayOfString.length > PInterfaceBravo) {
          GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
          SerializableImpl.PInterfaceAlpha(GInterfaceDb);
        } 
        while (arrayOfString.length > PInterfaceBravo) {
          String str3 = arrayOfString[PInterfaceBravo++];
          if (str3.equals("hidden")) {
            SerializableImpl.PInterfaceCharlie(GInterfaceDk.PInterfaceAlpha(0.0D));
            continue;
          } 
          if (str3.startsWith("{")) {
            SerializableImpl.PInterfaceCharlie(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, str3));
            continue;
          } 
          if (str3.equals("persistValue"))
            continue; 
          PInterfaceBravo(paramM, "Unknown OutputChannel visible condition or flag");
        } 
      } else {
        throw new ExceptionPrintstacktrace("Malformed OutputChannel entry.");
      } 
    } catch (NumberFormatException numberFormatException) {
      throw new ExceptionPrintstacktrace("Malformed OutputChannel entry.");
    } 
    return SerializableImpl;
  }
  
  private GComponentBb PInterfaceAlpha(M paramM, R paramR, int paramInt1, int paramInt2, GInterfaceAi paramaI) {
    GComponentBb GComponentBb = new GComponentBb(paramaI.SerializableImplExceptionprintstacktrace());
    String str1 = paramM.PInterfaceBravo();
    GComponentBb.v(p(str1));
    String str2 = q(str1);
    String[] arrayOfString = j(str2);
    byte PInterfaceBravo = 0;
    try {
      if (str2.startsWith("scalar")) {
        GComponentBb.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
        GComponentBb.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
        String str = arrayOfString[PInterfaceBravo++];
        if (str.equals("nextOffset")) {
          GComponentBb.PInterfaceAlpha(paramInt1);
        } else if (str.equals("lastOffset")) {
          GComponentBb.PInterfaceAlpha(paramInt2);
        } else {
          int KInterfaceIndia = X.ExceptionPrintstacktrace(str);
          if (KInterfaceIndia < paramInt1);
          GComponentBb.PInterfaceAlpha(KInterfaceIndia);
        } 
        if (arrayOfString.length > PInterfaceBravo) {
          if (arrayOfString.length > PInterfaceBravo) {
            GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
            GComponentBb.PInterfaceAlpha(GInterfaceDb);
          } 
          GComponentBb.PInterfaceAlpha(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]));
          GComponentBb.PInterfaceBravo(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]));
        } 
        if (arrayOfString.length > PInterfaceBravo) {
          try {
            GComponentBb.KInterfaceFoxtrot(X.ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++]));
          } catch (NumberFormatException numberFormatException) {
            PInterfaceBravo(paramM, "Invalid DLRAM_AddPad value");
          } 
        } else {
          PInterfaceBravo(paramM, "Pad Address not optional.");
        } 
        if (arrayOfString.length > PInterfaceBravo)
          try {
            GComponentBb.PInterfaceBravo(X.ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++]));
          } catch (NumberFormatException numberFormatException) {
            PInterfaceBravo(paramM, "Invalid digits value");
          }  
        if (arrayOfString.length > PInterfaceBravo) {
          String str3 = arrayOfString[PInterfaceBravo++];
          if (str3.equals("hidden")) {
            GComponentBb.PInterfaceCharlie(GInterfaceDk.PInterfaceAlpha(0.0D));
          } else if (str3.startsWith("{")) {
            GComponentBb.PInterfaceCharlie(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, str3));
          } else {
            PInterfaceBravo(paramM, "Unknown Replay visible condition or flag");
          } 
        } 
      } else if (str2.startsWith("dotScalar")) {
        GComponentBb.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
        GComponentBb.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
        String str = arrayOfString[PInterfaceBravo++];
        if (str.equals("nextOffset")) {
          GComponentBb.PInterfaceAlpha(paramInt1);
        } else if (str.equals("lastOffset")) {
          GComponentBb.PInterfaceAlpha(paramInt2);
        } else {
          int KInterfaceIndia = X.ExceptionPrintstacktrace(str);
          if (KInterfaceIndia < paramInt1);
          GComponentBb.PInterfaceAlpha(KInterfaceIndia);
        } 
        if (arrayOfString.length > PInterfaceBravo) {
          if (arrayOfString.length > PInterfaceBravo) {
            GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
            GComponentBb.PInterfaceAlpha(GInterfaceDb);
          } 
          GComponentBb.PInterfaceAlpha(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]));
          if (arrayOfString.length > PInterfaceBravo) {
            try {
              GComponentBb.PInterfaceCharlie(X.ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++]));
            } catch (NumberFormatException numberFormatException) {
              PInterfaceBravo(paramM, "Invalid decimal bits value");
            } 
          } else {
            PInterfaceBravo(paramM, "Decimal bits is required for paramClass dotScalar");
          } 
        } 
        if (arrayOfString.length > PInterfaceBravo)
          try {
            GComponentBb.KInterfaceFoxtrot(X.ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++]));
          } catch (NumberFormatException numberFormatException) {
            PInterfaceBravo(paramM, "Invalid DLRAM_AddPad value");
          }  
        if (arrayOfString.length > PInterfaceBravo)
          try {
            GComponentBb.PInterfaceBravo(X.ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++]));
          } catch (NumberFormatException numberFormatException) {
            PInterfaceBravo(paramM, "Invalid digits value");
          }  
        while (arrayOfString.length > PInterfaceBravo) {
          String str3 = arrayOfString[PInterfaceBravo++];
          if (str3.equals("hidden")) {
            GComponentBb.PInterfaceCharlie(GInterfaceDk.PInterfaceAlpha(0.0D));
            continue;
          } 
          if (str3.startsWith("{")) {
            GComponentBb.PInterfaceCharlie(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, str3));
            continue;
          } 
          PInterfaceBravo(paramM, "Unknown Replay visible condition or flag");
        } 
      } else if (arrayOfString.length > 0 && arrayOfString[0].equals("bits")) {
        GComponentBb.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
        GComponentBb.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
        String str3 = arrayOfString[PInterfaceBravo++];
        if (str3.equals("nextOffset")) {
          GComponentBb.PInterfaceAlpha(paramInt1);
        } else if (str3.equals("lastOffset")) {
          GComponentBb.PInterfaceAlpha(paramInt2);
        } else {
          int KInterfaceIndia = X.ExceptionPrintstacktrace(str3);
          if (KInterfaceIndia < paramInt1 - GComponentBb.l());
          GComponentBb.PInterfaceAlpha(KInterfaceIndia);
        } 
        String str4 = arrayOfString[PInterfaceBravo++];
        GComponentBb.d(m(str4));
        GComponentBb.e(n(str4));
        while (PInterfaceBravo < arrayOfString.length) {
          try {
            GComponentBb.d(X.PInterfaceBravo(arrayOfString[PInterfaceBravo], "\"", ""));
          } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
            PInterfaceBravo(paramM, ExceptionPrintstacktrace.getLocalizedMessage());
          } 
          PInterfaceBravo++;
        } 
      } else if (str2.startsWith("{")) {
        GComponentBb.PInterfaceAlpha("formula");
        String str = arrayOfString[PInterfaceBravo++];
        str = X.PInterfaceBravo(str, "{", "");
        str = X.PInterfaceBravo(str, "}", "");
        str = k(str);
        GComponentBb.e(str);
        if (arrayOfString.length > 1 && arrayOfString.length > PInterfaceBravo) {
          GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
          GComponentBb.PInterfaceAlpha(GInterfaceDb);
        } 
        if (arrayOfString.length > 2) {
          String str3 = arrayOfString[PInterfaceBravo++];
          if (str3.equals("hidden")) {
            GComponentBb.PInterfaceCharlie(GInterfaceDk.PInterfaceAlpha(0.0D));
          } else if (str3.startsWith("{")) {
            GComponentBb.PInterfaceCharlie(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, str3));
          } else {
            PInterfaceBravo(paramM, "Unknown Replay visible condition or flag");
          } 
        } 
      } else {
        throw new ExceptionPrintstacktrace("Malformed OutputChannel entry.");
      } 
    } catch (NumberFormatException numberFormatException) {
      throw new ExceptionPrintstacktrace("Malformed OutputChannel entry.");
    } 
    return GComponentBb;
  }
  
  private String k(String paramString) {
    if (paramString.trim().equals("60000.0 / rpm * (2.0-(twoStroke&1))")) {
      paramString = "rpm > 0 ? 60000.0 / rpm * (2.0-(twoStroke&1)) : 0";
    } else if (paramString.trim().equals("60000.0 / rpm * (2.0-twoStroke)")) {
      paramString = "rpm > 0 ? 60000.0 / rpm * (2.0-twoStroke) : 0";
    } else if (paramString.trim().equals("100.0*nSquirts1/altDiv1*pulseWidth1/cycleTime1")) {
      paramString = "rpm > 0 ? 100.0*nSquirts1/altDiv1*pulseWidth1/cycleTime1 : 0";
    } else if (paramString.trim().equals("100.0*nSquirts2/altDiv2*pulseWidth2/cycleTime2")) {
      paramString = "rpm > 0 ? 100.0*nSquirts2/altDiv2*pulseWidth2/cycleTime2 : 0";
    } 
    return paramString;
  }
  
  private GComponentAl PInterfaceAlpha(M paramM, GInterfaceAi paramaI, int paramInt1, int paramInt2) {
    GComponentAl GComponentAl = new GComponentAl(paramaI.SerializableImplExceptionprintstacktrace());
    GComponentAl.s(this.l);
    String str = paramM.PInterfaceBravo();
    byte PInterfaceBravo = 0;
    try {
      String str1 = q(str);
      String[] arrayOfString = j(str1);
      GComponentAl.v(X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
      String str2 = arrayOfString[PInterfaceBravo++];
      if (str2.equals("scalar")) {
        GComponentAl.PInterfaceAlpha(str2);
        GComponentAl.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
        String str3 = arrayOfString[PInterfaceBravo++];
        if (str3.equals("nextOffset")) {
          GComponentAl.PInterfaceAlpha(paramInt1);
        } else if (str3.equals("lastOffset")) {
          GComponentAl.PInterfaceAlpha(paramInt2);
        } else {
          int KInterfaceIndia = X.ExceptionPrintstacktrace(str3);
          GComponentAl.PInterfaceAlpha(KInterfaceIndia);
        } 
        if (arrayOfString.length > PInterfaceBravo) {
          GComponentAl.PInterfaceCharlie(arrayOfString[PInterfaceBravo++]);
          GComponentAl.PInterfaceAlpha(Double.parseDouble(arrayOfString[PInterfaceBravo++]));
          GComponentAl.PInterfaceBravo(Double.parseDouble(arrayOfString[PInterfaceBravo++]));
        } 
      } else if (str2.equals("bits")) {
        GComponentAl.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
        GComponentAl.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
        GComponentAl.PInterfaceAlpha(X.ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++]));
        String str3 = arrayOfString[PInterfaceBravo++];
        GComponentAl.d(m(str3));
        GComponentAl.e(n(str3));
      } 
    } catch (Exception exception) {
      PInterfaceAlpha(paramM, "Malformed Internal Log Field entry.");
    } 
    return GComponentAl;
  }
  
  private Manager PInterfaceAlpha(R paramR, M paramM, int paramInt, Manager paramaM) {
    Manager aM1;
    String str1 = paramM.PInterfaceBravo();
    String str2 = p(str1);
    String str3 = q(str1);
    if (str3.startsWith("oddArray")) {
      GInterfaceAk GInterfaceAk = new GInterfaceAk();
    } else {
      aM1 = new Manager();
    } 
    aM1.s(this.l);
    aM1.v(str2);
    aM1.PInterfaceCharlie(paramInt);
    String[] arrayOfString = j(str3);
    byte PInterfaceBravo = 0;
    if (str3.startsWith("bits")) {
      aM1.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
      String str4 = arrayOfString[PInterfaceBravo++];
      String str5 = null;
      if (str4.indexOf("8  ") == -1) {
        aM1.PInterfaceBravo(str4);
        str5 = arrayOfString[PInterfaceBravo++];
      } else {
        aM1.PInterfaceBravo(str4.substring(0, str4.indexOf("8  ")));
        str5 = str4.substring(str4.indexOf("8  ") + 1).trim();
        PInterfaceBravo(paramM, "Constants entry missing comma, but corrected.");
      } 
      String str6 = null;
      if (str5.indexOf("[") == -1) {
        if (str5.equals("nextOffset")) {
          if (paramaM != null) {
            aM1.PInterfaceAlpha((GInterfaceBw)new GInterfaceCm(paramaM));
          } else {
            aM1.PInterfaceAlpha((GInterfaceBw)new GInterfaceBx(0));
          } 
        } else if (str5.equals("lastOffset")) {
          if (paramaM != null) {
            aM1.PInterfaceAlpha(paramaM.KInterfaceFoxtrot());
          } else {
            aM1.PInterfaceAlpha((GInterfaceBw)new GInterfaceBx(0));
          } 
        } else {
          int k = X.ExceptionPrintstacktrace(str5);
          aM1.PInterfaceAlpha((GInterfaceBw)new GInterfaceBx(k));
        } 
        str6 = arrayOfString[PInterfaceBravo++];
      } else {
        aM1.PInterfaceAlpha((GInterfaceBw)new GInterfaceBx(X.ExceptionPrintstacktrace(str5.substring(0, str5.indexOf("[")))));
        str6 = str5.substring(str5.indexOf("["));
      } 
      aM1.KInterfaceFoxtrot(m(str6));
      aM1.ExceptionPrintstacktrace(n(str6));
      aM1.PInterfaceCharlie(o(str6));
      if (arrayOfString.length > PInterfaceBravo && arrayOfString[PInterfaceBravo].trim().startsWith("$")) {
        String str7 = arrayOfString[PInterfaceBravo].trim().substring(1);
        String str8 = (String)this.e.get(str7);
        if (str8 == null || str8.isEmpty()) {
          PInterfaceBravo(paramM, "String List not found. " + str7 + " Must CloneableImpl defined in ini file.");
        } else {
          String[] arrayOfString1 = j(str8);
          while (arrayOfString.length > ++PInterfaceBravo) {
            try {
              String[] arrayOfString2 = arrayOfString[PInterfaceBravo].split("=");
              int k = X.ExceptionPrintstacktrace(arrayOfString2[0].trim());
              arrayOfString1[k] = arrayOfString2[1].trim();
            } catch (Exception exception) {
              PInterfaceBravo(paramM, "Malformed Option over-ride: " + arrayOfString[PInterfaceBravo] + " Proper format for index 1: 1=\"My Override String\"");
            } 
            PInterfaceBravo++;
          } 
          for (String str : arrayOfString1) {
            try {
              aM1.d(str);
            } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
              PInterfaceBravo(paramM, ExceptionPrintstacktrace.getLocalizedMessage());
            } 
          } 
        } 
      } else {
        HashMap<Object, Object> hashMap = null;
        ArrayList<String> arrayList = new ArrayList();
        int k = -1;
        try {
          while (PInterfaceBravo < arrayOfString.length) {
            if (arrayOfString[PInterfaceBravo].indexOf("=") > 0 && arrayOfString[PInterfaceBravo].indexOf("=") < arrayOfString[PInterfaceBravo].indexOf("\"")) {
              if (hashMap == null)
                hashMap = new HashMap<>(); 
              String str7 = arrayOfString[PInterfaceBravo].substring(0, arrayOfString[PInterfaceBravo].indexOf("="));
              String str8 = arrayOfString[PInterfaceBravo].substring(arrayOfString[PInterfaceBravo].indexOf("=") + 1, arrayOfString[PInterfaceBravo].length());
              Integer integer = Integer.valueOf(Integer.parseInt(str7));
              if (integer.intValue() > k)
                k = integer.intValue(); 
              hashMap.put(integer, str8);
            } else {
              String str = arrayOfString[PInterfaceBravo];
              arrayList.add(str);
            } 
            PInterfaceBravo++;
          } 
          if (hashMap == null) {
            for (String str : arrayList) {
              try {
                aM1.d(str);
              } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
                PInterfaceBravo(paramM, ExceptionPrintstacktrace.getLocalizedMessage());
              } 
            } 
          } else {
            int m = (int)Math.pow(2.0D, aM1.x());
            for (byte b1 = 0; b1 < m; b1++) {
              if (hashMap.get(Integer.valueOf(b1)) != null) {
                try {
                  aM1.d((String)hashMap.get(Integer.valueOf(b1)));
                } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
                  PInterfaceBravo(paramM, ExceptionPrintstacktrace.getLocalizedMessage());
                } 
              } else {
                try {
                  aM1.d("INVALID");
                } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
                  PInterfaceBravo(paramM, ExceptionPrintstacktrace.getLocalizedMessage());
                } 
              } 
            } 
          } 
        } catch (Exception exception) {
          PInterfaceBravo(paramM, "Invalid Option List. Expected formats are: \"Option1\", \"Option2\", etc OR: index=\"Option1\", index=\"Option2\", etc. index must CloneableImpl PInterfaceAlpha valid integer.");
        } 
      } 
      int KInterfaceIndia = (int)Math.pow(2.0D, aM1.x());
      int j = aM1.y().size();
      if (KInterfaceIndia > j) {
        if (!paramR.O().at())
          PInterfaceBravo(paramM, "bit Constant " + aM1.aL() + ", contains fewer options (" + aM1.y().size() + ") than expected(" + KInterfaceIndia + "), padding remaining with \"INVALID\""); 
        for (int k = j; k < KInterfaceIndia; k++)
          aM1.d("INVALID"); 
      } 
    } else if (str3.startsWith("array") || str3.startsWith("oddArray")) {
      aM1.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
      aM1.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
      String str = arrayOfString[PInterfaceBravo++];
      if (str.equals("nextOffset")) {
        if (paramaM != null) {
          aM1.PInterfaceAlpha((GInterfaceBw)new GInterfaceCm(paramaM));
        } else {
          aM1.PInterfaceAlpha((GInterfaceBw)new GInterfaceBx(0));
        } 
      } else if (str.equals("lastOffset")) {
        if (paramaM != null) {
          aM1.PInterfaceAlpha(paramaM.KInterfaceFoxtrot());
        } else {
          aM1.PInterfaceAlpha((GInterfaceBw)new GInterfaceBx(0));
        } 
      } else {
        int KInterfaceIndia = X.ExceptionPrintstacktrace(str);
        aM1.PInterfaceAlpha((GInterfaceBw)new GInterfaceBx(KInterfaceIndia));
      } 
      A PInterfaceAlpha = PInterfaceAlpha(paramR, paramM, arrayOfString[PInterfaceBravo++]);
      aM1.PInterfaceAlpha(PInterfaceAlpha);
      if (arrayOfString.length > PInterfaceBravo) {
        GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
        aM1.PInterfaceAlpha(GInterfaceDb);
      } 
      if (arrayOfString.length > PInterfaceBravo)
        aM1.PInterfaceAlpha(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++])); 
      if (arrayOfString.length > PInterfaceBravo)
        aM1.PInterfaceBravo(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++])); 
      if (arrayOfString.length > PInterfaceBravo)
        aM1.PInterfaceCharlie(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++])); 
      if (arrayOfString.length > PInterfaceBravo)
        aM1.d(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++])); 
      try {
        if (arrayOfString.length > PInterfaceBravo)
          aM1.e(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++])); 
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        PInterfaceBravo(paramM, ExceptionPrintstacktrace.getMessage());
      } 
      if (arrayOfString.length > PInterfaceBravo)
        while (PInterfaceBravo < arrayOfString.length) {
          if (arrayOfString[PInterfaceBravo].equals("noSizeMutation")) {
            aM1.PInterfaceCharlie(false);
          } else if (arrayOfString[PInterfaceBravo].equals("noMsqSave") || arrayOfString[PInterfaceBravo].equals("noSaveToMsq")) {
            aM1.PInterfaceBravo(false);
          } 
          PInterfaceBravo++;
        }  
    } else if (str3.startsWith("scalar")) {
      aM1.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
      aM1.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
      String str = arrayOfString[PInterfaceBravo++];
      if (str.equals("nextOffset")) {
        if (paramaM != null) {
          aM1.PInterfaceAlpha((GInterfaceBw)new GInterfaceCm(paramaM));
        } else {
          aM1.PInterfaceAlpha((GInterfaceBw)new GInterfaceBx(0));
        } 
      } else if (str.equals("lastOffset")) {
        if (paramaM != null) {
          aM1.PInterfaceAlpha(paramaM.KInterfaceFoxtrot());
        } else {
          aM1.PInterfaceAlpha((GInterfaceBw)new GInterfaceBx(0));
        } 
      } else {
        int KInterfaceIndia = X.ExceptionPrintstacktrace(str);
        aM1.PInterfaceAlpha((GInterfaceBw)new GInterfaceBx(KInterfaceIndia));
      } 
      if (arrayOfString.length > PInterfaceBravo) {
        GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
        aM1.PInterfaceAlpha(GInterfaceDb);
        aM1.PInterfaceAlpha(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]));
        aM1.PInterfaceBravo(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]));
        if (arrayOfString.length > PInterfaceBravo + 2) {
          aM1.PInterfaceCharlie(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]));
          aM1.d(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]));
          aM1.e(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]));
          if (arrayOfString.length > PInterfaceBravo && (arrayOfString[PInterfaceBravo].equals("noLocalUpdate") || arrayOfString[PInterfaceBravo].equals("noSaveToMsq") || arrayOfString[PInterfaceBravo].equals("noMsqSave"))) {
            aM1.PInterfaceBravo(false);
          } else if (arrayOfString.length > PInterfaceBravo && arrayOfString[PInterfaceBravo].equals("controllerPriority")) {
            aM1.KInterfaceIndia(true);
          } else if (arrayOfString.length > PInterfaceBravo) {
            PInterfaceBravo(paramM, "Unknown Constant Option: " + arrayOfString[PInterfaceBravo]);
          } 
          PInterfaceBravo++;
        } 
      } 
    } else if (str3.startsWith("string")) {
      aM1.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
      aM1.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
      String str = arrayOfString[PInterfaceBravo++];
      if (str.equals("nextOffset")) {
        if (paramaM != null) {
          aM1.PInterfaceAlpha((GInterfaceBw)new GInterfaceCm(paramaM));
        } else {
          aM1.PInterfaceAlpha((GInterfaceBw)new GInterfaceBx(0));
        } 
      } else if (str.equals("lastOffset")) {
        if (paramaM != null) {
          aM1.PInterfaceAlpha(paramaM.KInterfaceFoxtrot());
        } else {
          aM1.PInterfaceAlpha((GInterfaceBw)new GInterfaceBx(0));
        } 
      } else {
        int KInterfaceIndia = X.ExceptionPrintstacktrace(str);
        aM1.PInterfaceAlpha((GInterfaceBw)new GInterfaceBx(KInterfaceIndia));
      } 
      aM1.PInterfaceAlpha(1, X.ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++]));
      if (arrayOfString.length > PInterfaceBravo) {
        String str4 = arrayOfString[PInterfaceBravo++];
        try {
          aM1.e(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, str4));
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          PInterfaceBravo(paramM, "Invalid String parameter Option for columns: " + str4);
        } 
      } 
      if (arrayOfString.length > PInterfaceBravo)
        PInterfaceBravo(paramM, "Unknown Constant Option: " + arrayOfString[PInterfaceBravo]); 
    } else {
      PInterfaceAlpha(paramM, "Unknown paramClass for ini entry.");
    } 
    return aM1;
  }
  
  private Manager l(R paramR, M paramM) {
    String str1 = paramM.PInterfaceBravo();
    CloneableImplExceptionprintstacktrace CloneableImplExceptionprintstacktrace = new CloneableImplExceptionprintstacktrace();
    String str2 = p(str1);
    String str3 = q(str1);
    CloneableImplExceptionprintstacktrace.v(str2);
    CloneableImplExceptionprintstacktrace.PInterfaceCharlie(-1);
    CloneableImplExceptionprintstacktrace.PInterfaceAlpha((GInterfaceBw)new GInterfaceBx(0));
    String[] arrayOfString = j(str3);
    byte PInterfaceBravo = 0;
    if (arrayOfString[0].equals(CloneableImplExceptionprintstacktrace.d) || arrayOfString[0].equals(CloneableImplExceptionprintstacktrace.e)) {
      if (arrayOfString.length < 2) {
        PInterfaceAlpha(paramM, "2 parameters required for paramClass: channelValueOnConnect or continuousChannelValue");
      } else {
        CloneableImplExceptionprintstacktrace.PInterfaceAlpha(arrayOfString[0]);
        CloneableImplExceptionprintstacktrace.ExceptionPrintstacktrace(arrayOfString[1]);
        CloneableImplExceptionprintstacktrace.PInterfaceBravo("S32");
        GComponentCy.PInterfaceAlpha(paramR).PInterfaceAlpha(CloneableImplExceptionprintstacktrace);
      } 
    } else if (str3.startsWith("bits")) {
      CloneableImplExceptionprintstacktrace.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
      String str4 = arrayOfString[PInterfaceBravo++];
      CloneableImplExceptionprintstacktrace.PInterfaceBravo(str4);
      String str5 = arrayOfString[PInterfaceBravo++];
      CloneableImplExceptionprintstacktrace.KInterfaceFoxtrot(m(str5));
      CloneableImplExceptionprintstacktrace.ExceptionPrintstacktrace(n(str5));
      CloneableImplExceptionprintstacktrace.PInterfaceCharlie(o(str5));
      while (PInterfaceBravo < arrayOfString.length) {
        CloneableImplExceptionprintstacktrace.d(arrayOfString[PInterfaceBravo]);
        PInterfaceBravo++;
      } 
    } else if (str3.startsWith("array")) {
      CloneableImplExceptionprintstacktrace.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
      CloneableImplExceptionprintstacktrace.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
      A PInterfaceAlpha = PInterfaceAlpha(paramR, paramM, arrayOfString[PInterfaceBravo++]);
      CloneableImplExceptionprintstacktrace.PInterfaceAlpha(PInterfaceAlpha);
      if (arrayOfString.length > PInterfaceBravo) {
        GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
        CloneableImplExceptionprintstacktrace.PInterfaceAlpha(GInterfaceDb);
      } 
      if (arrayOfString.length > PInterfaceBravo)
        CloneableImplExceptionprintstacktrace.PInterfaceAlpha(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++])); 
      if (arrayOfString.length > PInterfaceBravo)
        CloneableImplExceptionprintstacktrace.PInterfaceBravo(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++])); 
      if (arrayOfString.length > PInterfaceBravo)
        CloneableImplExceptionprintstacktrace.PInterfaceCharlie(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++])); 
      if (arrayOfString.length > PInterfaceBravo)
        CloneableImplExceptionprintstacktrace.d(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++])); 
      if (arrayOfString.length > PInterfaceBravo)
        CloneableImplExceptionprintstacktrace.e(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++])); 
      if (arrayOfString.length > PInterfaceBravo)
        while (PInterfaceBravo < arrayOfString.length) {
          if (arrayOfString[PInterfaceBravo].equals("noSizeMutation")) {
            CloneableImplExceptionprintstacktrace.PInterfaceCharlie(false);
          } else if (arrayOfString[PInterfaceBravo].equals("noMsqSave") || arrayOfString[PInterfaceBravo].equals("noSaveToMsq")) {
            CloneableImplExceptionprintstacktrace.PInterfaceBravo(false);
          } 
          PInterfaceBravo++;
        }  
    } else if (str3.startsWith("scalar")) {
      CloneableImplExceptionprintstacktrace.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
      CloneableImplExceptionprintstacktrace.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
      if (arrayOfString.length > PInterfaceBravo) {
        GInterfaceDb GInterfaceDb = GInterfaceDa.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
        CloneableImplExceptionprintstacktrace.PInterfaceAlpha(GInterfaceDb);
        CloneableImplExceptionprintstacktrace.PInterfaceAlpha(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]));
        CloneableImplExceptionprintstacktrace.PInterfaceBravo(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]));
        if (arrayOfString.length > PInterfaceBravo + 2) {
          CloneableImplExceptionprintstacktrace.PInterfaceCharlie(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]));
          CloneableImplExceptionprintstacktrace.d(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]));
          CloneableImplExceptionprintstacktrace.e(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, arrayOfString[PInterfaceBravo++]));
          if (arrayOfString.length > PInterfaceBravo && (arrayOfString[PInterfaceBravo].equals("noLocalUpdate") || arrayOfString[PInterfaceBravo].equals("noSaveToMsq") || arrayOfString[PInterfaceBravo].equals("noMsqSave"))) {
            CloneableImplExceptionprintstacktrace.PInterfaceBravo(false);
          } else if (arrayOfString.length > PInterfaceBravo) {
            PInterfaceBravo(paramM, "Unknown Constant Option: " + arrayOfString[PInterfaceBravo]);
          } 
          PInterfaceBravo++;
        } 
      } 
    } else if (str3.startsWith("string")) {
      CloneableImplExceptionprintstacktrace.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
      CloneableImplExceptionprintstacktrace.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
      CloneableImplExceptionprintstacktrace.PInterfaceAlpha(1, X.ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++]));
      if (arrayOfString.length > PInterfaceBravo) {
        String str = arrayOfString[PInterfaceBravo++];
        try {
          CloneableImplExceptionprintstacktrace.e(GInterfaceDk.PInterfaceAlpha((GInterfaceAi)paramR, str));
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          PInterfaceBravo(paramM, "Invalid String parameter Option for columns: " + str);
        } 
      } 
      if (arrayOfString.length > PInterfaceBravo);
    } else {
      PInterfaceBravo(paramM, "Unknown paramClass for ini entry.");
    } 
    return (Manager)CloneableImplExceptionprintstacktrace;
  }
  
  private A PInterfaceAlpha(R paramR, M paramM, String paramString) {
    B b1;
    B b2;
    if (paramString.contains("{")) {
      String[] arrayOfString = l(paramString);
      if (arrayOfString.length == 2) {
        SerializableImplTostring bR3 = new SerializableImplTostring((GInterfaceAi)paramR, arrayOfString[0]);
        if ((bR3.PInterfaceBravo()).length > 1)
          PInterfaceBravo(paramM, "Columns Expression should have 1 variable for Table Widgets to offer resizing."); 
        SerializableImplTostring bR4 = new SerializableImplTostring((GInterfaceAi)paramR, arrayOfString[1]);
        if ((bR4.PInterfaceBravo()).length > 1)
          PInterfaceBravo(paramM, "Row Expression should have 1 variable for Table Widgets to offer resizing."); 
        SerializableImplTostring bR1 = bR3;
        SerializableImplTostring bR2 = bR4;
      } else if (arrayOfString.length == 1) {
        b1 = new B(1.0D);
        SerializableImplTostring SerializableImplTostring = new SerializableImplTostring((GInterfaceAi)paramR, arrayOfString[0]);
      } else {
        throw new ExceptionPrintstacktrace("Failed to parse array dimension from: " + paramString);
      } 
    } else {
      int KInterfaceIndia = paramString.toLowerCase().indexOf("x");
      if (KInterfaceIndia != -1) {
        b1 = new B(X.ExceptionPrintstacktrace(paramString.substring(1, KInterfaceIndia).trim()));
        b2 = new B(X.ExceptionPrintstacktrace(paramString.substring(KInterfaceIndia + 1, paramString.indexOf("]", KInterfaceIndia)).trim()));
      } else {
        b1 = new B(1.0D);
        b2 = new B(X.ExceptionPrintstacktrace(paramString.substring(paramString.indexOf("[") + 1, paramString.indexOf("]")).trim()));
      } 
    } 
    return new A((GInterfaceDj)b1, (GInterfaceDj)b2);
  }
  
  private String[] l(String paramString) {
    paramString = paramString.trim();
    if (paramString.startsWith("["))
      paramString = paramString.substring(1).trim(); 
    if (paramString.endsWith("]"))
      paramString = paramString.substring(0, paramString.indexOf("]")).trim(); 
    int KInterfaceIndia = 0;
    boolean bool = false;
    ArrayList<String> arrayList = new ArrayList();
    for (int j = KInterfaceIndia; j < paramString.length(); j++) {
      if (paramString.charAt(j) == '{') {
        KInterfaceIndia = j + 1;
        bool = true;
      } else if (paramString.charAt(j) == '}' || (!bool && paramString.charAt(j) == 'x') || j == paramString.length() - 1) {
        String str = paramString.substring(KInterfaceIndia, j);
        arrayList.add(str);
        bool = false;
        KInterfaceIndia = j + 1;
        while (j < paramString.length() - 1 && paramString.charAt(j + 1) != '{')
          j++; 
      } 
    } 
    return arrayList.<String>toArray(new String[arrayList.size()]);
  }
  
  private int m(String paramString) {
    return X.ExceptionPrintstacktrace(paramString.substring(1, paramString.indexOf(":")));
  }
  
  private int n(String paramString) {
    String str1 = paramString.substring(paramString.indexOf(":") + 1);
    String str2 = (str1.indexOf("+") != -1) ? str1.substring(0, str1.indexOf("+")) : str1.substring(0, str1.indexOf("]"));
    return X.ExceptionPrintstacktrace(str2.trim());
  }
  
  private double o(String paramString) {
    return (paramString.indexOf("+") != -1) ? Double.parseDouble(paramString.substring(paramString.indexOf("+") + 1, paramString.indexOf("]"))) : 0.0D;
  }
  
  private String p(String paramString) {
    return Q.PInterfaceBravo(paramString);
  }
  
  private String q(String paramString) {
    return Q.PInterfaceAlpha(paramString);
  }
  
  private String r(String paramString) {
    String str = paramString.trim();
    int KInterfaceIndia = str.indexOf(" ");
    str = str.substring(KInterfaceIndia).trim();
    int j = str.indexOf(" ", KInterfaceIndia + 1);
    if (j < 0)
      j = str.length(); 
    return str.substring(0, j).trim();
  }
  
  public boolean PInterfaceAlpha() {
    return this.j;
  }
  
  public void PInterfaceAlpha(boolean paramBoolean) {
    this.j = paramBoolean;
  }
  
  private void PInterfaceAlpha(R paramR, String paramString, int paramInt) {
    if (paramString != null && !paramString.equals("") && paramR.e().PInterfaceCharlie(paramString) == null)
      if (paramString.equals("std_warmup")) {
        KInterfaceIndia KInterfaceIndia = new KInterfaceIndia(paramR, paramInt);
        paramR.e().PInterfaceAlpha((ArrayListExceptionprintstacktraceInGPackage)KInterfaceIndia);
      } else if (paramString.equals("std_accel")) {
        PInterfaceAlpha PInterfaceAlpha = new PInterfaceAlpha(paramR, paramInt, true);
        paramR.e().PInterfaceAlpha((ArrayListExceptionprintstacktraceInGPackage)PInterfaceAlpha);
      }  
  }
  
  public void PInterfaceBravo(boolean paramBoolean) {
    this.l = paramBoolean;
  }
  
  private String PInterfaceCharlie(M paramM, String paramString) {
    if (paramString.contains("$")) {
      String[] arrayOfString = j(paramString);
      StringBuilder stringBuilder = new StringBuilder();
      for (byte PInterfaceBravo = 0; PInterfaceBravo < arrayOfString.length; PInterfaceBravo++) {
        String str = arrayOfString[PInterfaceBravo];
        if (str.trim().startsWith("$")) {
          String str1 = arrayOfString[PInterfaceBravo].trim().substring(1);
          String str2 = (String)this.e.get(str1);
          if (str2 == null || str2.isEmpty()) {
            PInterfaceBravo(paramM, "#defines String List not found. " + str1 + " Must CloneableImpl defined in ini above usage point.");
          } else {
            stringBuilder.append(str2);
          } 
        } else {
          stringBuilder.append(str);
        } 
        if (PInterfaceBravo < arrayOfString.length - 1)
          stringBuilder.append(", "); 
      } 
      return stringBuilder.toString();
    } 
    return paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/ab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */