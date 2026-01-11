package W;

import G.A;
import G.B;
import G.C;
import G.D;
import G.E;
import G.F;
import G.R;
import G.aA;
import G.aH;
import G.aI;
import G.aK;
import G.aM;
import G.aQ;
import G.aS;
import G.aW;
import G.aX;
import G.ac;
import G.ag;
import G.ah;
import G.aj;
import G.ak;
import G.al;
import G.am;
import G.bA;
import G.bB;
import G.bC;
import G.bD;
import G.bE;
import G.bF;
import G.bG;
import G.bH;
import G.bI;
import G.bJ;
import G.bL;
import G.bM;
import G.bP;
import G.bR;
import G.bW;
import G.bX;
import G.ba;
import G.bb;
import G.bc;
import G.be;
import G.bf;
import G.bi;
import G.bj;
import G.bk;
import G.bl;
import G.bm;
import G.bn;
import G.bo;
import G.bq;
import G.br;
import G.bs;
import G.bt;
import G.bu;
import G.bv;
import G.bw;
import G.bx;
import G.by;
import G.bz;
import G.PInterfaceCharlie;
import G.ca;
import G.cb;
import G.cc;
import G.cd;
import G.ce;
import G.cf;
import G.cg;
import G.ch;
import G.ci;
import G.cm;
import G.cu;
import G.cy;
import G.d;
import G.da;
import G.db;
import G.de;
import G.df;
import G.dj;
import G.dk;
import G.dm;
import G.dp;
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
import bH.A;
import bH.D;
import bH.F;
import bH.I;
import bH.T;
import bH.X;
import bH.aa;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ab {
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
  
  private static ac n = null;
  
  private static HashMap o = new HashMap<>();
  
  public ab() {
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
          paramR.PInterfaceAlpha(new bE()); 
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
        paramR.PInterfaceAlpha(new bE()); 
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
    for (aM aM : paramR.l()) {
      if (aM.F() instanceof bR) {
        bR bR = (bR)aM.F();
        PInterfaceAlpha(paramR, bR, aM.aL(), str1, true);
      } 
      if (aM.G() instanceof bR) {
        bR bR = (bR)aM.G();
        PInterfaceAlpha(paramR, bR, aM.aL(), str2, true);
      } 
      if (aM.t() instanceof bR) {
        bR bR = (bR)aM.t();
        PInterfaceAlpha(paramR, bR, aM.aL(), str4, true);
      } 
      if (aM.u() instanceof bR) {
        bR bR = (bR)aM.u();
        PInterfaceAlpha(paramR, bR, aM.aL(), str3, true);
      } 
      if (aM.w() instanceof bR) {
        bR bR = (bR)aM.w();
        PInterfaceAlpha(paramR, bR, aM.aL(), str5, true);
      } 
      if (aM.q() instanceof d) {
        d d = (d)aM.q();
        try {
          d.PInterfaceAlpha();
        } catch (Exception exception) {
          PInterfaceBravo((M)null, "[Constant] " + aM.aL() + ": Invalid Units Expression.");
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
      n = new ac(this);
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
    return bM.PInterfaceAlpha(paramString);
  }
  
  private void d(R paramR, J paramJ) {
    bE bE = (paramR.e() == null) ? new bE() : paramR.e();
    PInterfaceCharlie(paramR, bE, paramJ, "CurveEditor");
    PInterfaceCharlie(paramR, bE, paramJ, "CurveEditorTS");
    try {
      PInterfaceAlpha(paramR, bE, paramJ);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.PInterfaceAlpha("Error loading EcuReference Tables");
      ExceptionPrintstacktrace.printStackTrace();
    } 
    try {
      D.d("Loading Trigger Wheels");
      PInterfaceBravo(paramR, bE, paramJ, "TriggerWheel");
    } catch (Exception exception) {
      D.PInterfaceAlpha("Error loading [TriggerWheel] section of ini.");
      exception.printStackTrace();
    } 
    ArrayList arrayList = PInterfaceAlpha(paramJ, paramR, "UserDefined");
    if (arrayList != null && !arrayList.isEmpty()) {
      D.d("Loading Depricated ini section [UserDefined], use [UiDialogs]");
      PInterfaceAlpha(paramR, bE, paramJ, "UserDefined");
    } 
    arrayList = PInterfaceAlpha(paramJ, paramR, "UserDefinedTS");
    if (arrayList != null && !arrayList.isEmpty()) {
      D.d("Loading Depricated ini section [UserDefinedTS], use [UiDialogs]");
      PInterfaceAlpha(paramR, bE, paramJ, "UserDefinedTS");
    } 
    PInterfaceAlpha(paramR, bE, paramJ, "UiDialogs");
    PInterfaceCharlie(paramR, bE, paramJ);
    e(paramR, bE, paramJ, "Menu");
    e(paramR, bE, paramJ, "MenuTS");
    d(paramR, bE, paramJ, "KeyActions");
  }
  
  private void PInterfaceAlpha(M paramM) {
    int KInterfaceIndia = X.PInterfaceBravo(paramM.PInterfaceBravo(), "\"");
    if (KInterfaceIndia == -1 || KInterfaceIndia % 2 == 0)
      return; 
    PInterfaceBravo(paramM, "Open ended String value");
  }
  
  private void PInterfaceAlpha(R paramR, bE parambE, J paramJ, String paramString) {
    ArrayList arrayList1 = PInterfaceAlpha(paramJ, paramR, paramString);
    if (arrayList1 == null || arrayList1.isEmpty())
      return; 
    Iterator<be> iterator = paramR.n();
    while (iterator.hasNext()) {
      be be = iterator.next();
      parambE.PInterfaceAlpha((bv)be);
    } 
    iterator = paramR.o();
    while (iterator.hasNext()) {
      bi bi = (bi)iterator.next();
      parambE.PInterfaceAlpha((bv)bi);
    } 
    iterator = null;
    br br = null;
    aj aj = null;
    bx bx = null;
    bt bt = null;
    bz bz = null;
    ArrayList arrayList2 = new ArrayList();
    for (M m : arrayList1) {
      String str = m.PInterfaceBravo();
      try {
        bv bv;
        if (str.startsWith("dialog")) {
          bt = null;
          bz = null;
          bv = new bv();
          bv.s(this.l);
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          bv.v(arrayOfString[0].trim());
          if (bv.aL().equals("revlimiter2"))
            D.PInterfaceCharlie("break 5988812"); 
          if (arrayList2.contains(bv.aL()))
            PInterfaceBravo(m, "dialog name '" + bv.aL() + "' already assigned. Menus will reference the last definition"); 
          if (arrayOfString.length > 1) {
            db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString[1]);
            bv.d(db);
          } 
          if (arrayOfString.length > 2)
            if (arrayOfString[2].equals("border")) {
              bv.KInterfaceIndia(2);
            } else if (arrayOfString[2].equals("xAxis")) {
              bv.KInterfaceIndia(0);
            } else if (arrayOfString[2].equals("yAxis")) {
              bv.KInterfaceIndia(1);
            } else if (arrayOfString[2].equals("card")) {
              bv.KInterfaceIndia(3);
            } else if (arrayOfString[2].equals("indexCard")) {
              bv.KInterfaceIndia(4);
            } else if (!I.PInterfaceAlpha(arrayOfString[2])) {
              PInterfaceBravo(m, "Invalid layout defined for panel.\n Valid values: border, xAxis, yAxis, indexCard. Using default yAxis.");
              bv.KInterfaceIndia(1);
            }  
          if (arrayOfString.length > 3)
            bv.y(arrayOfString[3]); 
          parambE.PInterfaceAlpha(bv);
          continue;
        } 
        if (str.startsWith("panel")) {
          bD bD;
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          if (arrayOfString[0].trim().equals(bv.aL()) || arrayOfString[0].trim().equals("customPressure5v")) {
            PInterfaceAlpha(m, "Attempting to add PInterfaceAlpha panel to itself! Ignoring row.");
            continue;
          } 
          bv bv1 = parambE.PInterfaceCharlie(arrayOfString[0].trim());
          if (bv1 == null && PInterfaceCharlie(arrayOfString[0].trim())) {
            bD = new bD();
            bD.v(arrayOfString[0].trim());
            parambE.PInterfaceAlpha((bv)bD);
          } 
          if (bD == null) {
            PInterfaceBravo(m, "Nested Panel " + arrayOfString[0].trim() + " not found in UI structure. Either it is not defined in this ini file or it is being referenced before it was defined.");
            continue;
          } 
          bv bv2 = new bv();
          bv2.KInterfaceHotel(true);
          bv2.PInterfaceAlpha((bv)bD);
          byte PInterfaceBravo = 1;
          if (arrayOfString.length > PInterfaceBravo && (bv.R() == 2 || !arrayOfString[PInterfaceBravo].startsWith("{")))
            try {
              String str2 = arrayOfString[PInterfaceBravo++].trim();
              if (bv.R() == 2 && !str2.equals("Center") && !str2.equals("North") && !str2.equals("South") && !str2.equals("East") && !str2.equals("West")) {
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
            bD.u(str2);
          } 
          if (arrayOfString.length > PInterfaceBravo) {
            String str2 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
            str2 = X.PInterfaceBravo(str2, "}", "").trim();
            PInterfaceAlpha(paramR, m, str2, false);
            bv2.x(str2);
          } 
          bv.PInterfaceAlpha(bv2);
          continue;
        } 
        if (str.startsWith("gauge")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          bB bB = new bB();
          bB.PInterfaceAlpha(arrayOfString[0].trim());
          ah ah = paramR.k(arrayOfString[0].trim());
          if (ah == null) {
            PInterfaceAlpha(m, "Gauge Template " + arrayOfString[0].trim() + " not found.");
            continue;
          } 
          if (arrayOfString.length > 1)
            try {
              bB.t(arrayOfString[1].trim());
            } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
              PInterfaceBravo(m, ExceptionPrintstacktrace.getMessage());
            }  
          if (arrayOfString.length > 2) {
            String str2 = X.PInterfaceBravo(arrayOfString[2], "{", "");
            str2 = X.PInterfaceBravo(str2, "}", "").trim();
            PInterfaceAlpha(paramR, m, str2, false);
            bB.u(str2);
          } 
          bv.PInterfaceAlpha((bv)bB);
          continue;
        } 
        if (str.startsWith("liveGraph")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          br = new br();
          br.v(arrayOfString[0]);
          br.s(arrayOfString[1]);
          if (arrayOfString.length > 2) {
            try {
              br.t(arrayOfString[2]);
            } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
              PInterfaceBravo(m, ExceptionPrintstacktrace.getMessage());
            } 
          } else {
            br.t("South");
          } 
          if (arrayOfString.length > 3) {
            br.u(arrayOfString[3]);
            PInterfaceAlpha(paramR, m, br.aJ(), false);
          } 
          bv.PInterfaceAlpha((bv)br);
          continue;
        } 
        if (str.startsWith("graphLine")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          bs bs = new bs();
          byte PInterfaceBravo = 0;
          bs.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
          if (paramR.ExceptionPrintstacktrace(bs.PInterfaceAlpha()) == null)
            PInterfaceBravo(m, "LiveGraph graphLine assigned to invalid OutputChannel."); 
          if (arrayOfString.length > PInterfaceBravo)
            bs.PInterfaceBravo(arrayOfString[PInterfaceBravo++]); 
          if (arrayOfString.length > PInterfaceBravo)
            bs.PInterfaceAlpha(Double.parseDouble(arrayOfString[PInterfaceBravo++])); 
          if (arrayOfString.length > PInterfaceBravo)
            bs.PInterfaceBravo(Double.parseDouble(arrayOfString[PInterfaceBravo++])); 
          if (arrayOfString.length > PInterfaceBravo && arrayOfString[PInterfaceBravo++].equalsIgnoreCase("auto"))
            bs.PInterfaceAlpha(true); 
          if (arrayOfString.length > PInterfaceBravo && arrayOfString[PInterfaceBravo++].equalsIgnoreCase("auto"))
            bs.PInterfaceBravo(true); 
          br.PInterfaceAlpha(bs);
          continue;
        } 
        if (str.startsWith("logFieldSelector")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          ag ag = new ag();
          byte PInterfaceBravo = 0;
          ag.v(arrayOfString[PInterfaceBravo++]);
          if (arrayOfString.length > PInterfaceBravo)
            ag.s(X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", "")); 
          if (arrayOfString.length > PInterfaceBravo) {
            ag.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
            if (paramR.PInterfaceCharlie(ag.PInterfaceAlpha()) == null)
              PInterfaceBravo(m, "Invalid Offset Parameter Name, " + ag.PInterfaceAlpha() + " not found."); 
          } 
          if (arrayOfString.length > PInterfaceBravo) {
            ag.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
            if (paramR.PInterfaceCharlie(ag.PInterfaceBravo()) == null)
              PInterfaceBravo(m, "Invalid Length Parameter Name, " + ag.PInterfaceBravo() + " not found."); 
          } 
          if (arrayOfString.length > PInterfaceBravo) {
            String str2 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
            str2 = X.PInterfaceBravo(str2, "}", "");
            try {
              dj dj = dk.PInterfaceAlpha((aI)paramR, str2);
              ag.PInterfaceAlpha(dj);
            } catch (Exception exception) {
              PInterfaceBravo(m, "Invalid Size Parameter Name, " + ag.PInterfaceCharlie() + " not found and not numeric.");
            } 
          } 
          if (arrayOfString.length > PInterfaceBravo) {
            String str2 = arrayOfString[PInterfaceBravo++];
            try {
              int KInterfaceIndia = X.ExceptionPrintstacktrace(str2);
              ag.PInterfaceAlpha(KInterfaceIndia);
            } catch (Exception exception) {
              PInterfaceBravo(m, "Invalid Inactive size, " + str2 + "  not numeric.");
            } 
          } 
          parambE.PInterfaceAlpha((bv)ag);
          continue;
        } 
        if (str.startsWith("replayFieldSelector")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          bc bc = new bc();
          byte PInterfaceBravo = 0;
          bc.v(arrayOfString[PInterfaceBravo++]);
          if (arrayOfString.length > PInterfaceBravo)
            bc.s(X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", "")); 
          if (arrayOfString.length > PInterfaceBravo) {
            bc.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
            if (paramR.PInterfaceCharlie(bc.d()) == null)
              PInterfaceBravo(m, "Invalid Offset Parameter Name, " + bc.d() + " not found."); 
          } 
          if (arrayOfString.length > PInterfaceBravo) {
            bc.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
            if (!bc.PInterfaceBravo() && paramR.PInterfaceCharlie(bc.PInterfaceAlpha()) == null)
              PInterfaceBravo(m, "Invalid Size Parameter Name, " + bc.PInterfaceAlpha() + " not found and not numeric."); 
          } 
          if (arrayOfString.length > PInterfaceBravo) {
            String str2 = arrayOfString[PInterfaceBravo++];
            try {
              int KInterfaceIndia = X.ExceptionPrintstacktrace(str2);
              bc.PInterfaceAlpha(KInterfaceIndia);
            } catch (Exception exception) {
              PInterfaceBravo(m, "Invalid Inactive, " + str2 + "  not numeric.");
            } 
          } 
          parambE.PInterfaceAlpha((bv)bc);
          continue;
        } 
        if (str.startsWith("settingSelector") && bv != null) {
          bx = new bx();
          String str1 = q(str);
          byte PInterfaceBravo = 0;
          String[] arrayOfString = j(str1);
          String str2 = arrayOfString[PInterfaceBravo++];
          bx.PInterfaceBravo(da.PInterfaceAlpha().PInterfaceAlpha(paramR, str2));
          if (arrayOfString.length > PInterfaceBravo) {
            String str3 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
            str3 = X.PInterfaceBravo(str3, "}", "").trim();
            PInterfaceAlpha(paramR, m, str3, false);
            bx.u(str3);
            if (arrayOfString.length > PInterfaceBravo) {
              str3 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
              str3 = X.PInterfaceBravo(str3, "}", "").trim();
              PInterfaceAlpha(paramR, m, str3, false);
              bx.KInterfaceFoxtrot(str3);
            } 
          } 
          bv.PInterfaceAlpha((bA)bx);
          continue;
        } 
        if (str.startsWith("enabledCondition") && bv != null) {
          String str1 = q(str);
          String str2 = X.PInterfaceBravo(str1, "{", "");
          str2 = X.PInterfaceBravo(str2, "}", "").trim();
          PInterfaceAlpha(paramR, m, str2, false);
          bv.u(str2);
          continue;
        } 
        if (str.startsWith("settingOption") && bv != null) {
          if (bx == null) {
            PInterfaceAlpha(m, "Ini error: Found settingOption before settingSelector.");
            continue;
          } 
          bw bw = new bw();
          String str1 = q(str);
          byte PInterfaceBravo = 0;
          String[] arrayOfString = j(str1);
          bw.PInterfaceBravo(KInterfaceFoxtrot(arrayOfString[PInterfaceBravo++]));
          while (PInterfaceBravo < arrayOfString.length) {
            String str2 = p(arrayOfString[PInterfaceBravo]);
            String str3 = q(arrayOfString[PInterfaceBravo]);
            double d = 0.0D;
            try {
              d = Double.parseDouble(str3);
            } catch (Exception exception) {
              PInterfaceAlpha(m, "Value for " + str2 + " should be numeric in row.");
            } 
            bw.PInterfaceAlpha(str2, d);
            PInterfaceBravo++;
          } 
          bx.PInterfaceAlpha(bw);
          continue;
        } 
        if (str.startsWith("calibrationField") && bv != null) {
          bk bk = new bk();
          PInterfaceAlpha(paramR, m, (bq)bk);
          PInterfaceAlpha(paramR, m, bk.aJ(), false);
          if (bk.PInterfaceBravo() != null && !bk.PInterfaceBravo().equals("") && paramR.PInterfaceCharlie(bk.PInterfaceBravo()) == null) {
            PInterfaceBravo(m, "[" + paramString + "] field assigned to invalid Constant '" + bk.PInterfaceBravo() + "'.");
          } else if (bk.PInterfaceBravo() != null && !bk.PInterfaceBravo().equals("") && paramR.PInterfaceCharlie(bk.PInterfaceBravo()).KInterfaceIndia().equals("array") && !str.contains("[")) {
            PInterfaceBravo(m, "[" + paramString + "] field assigned to array Constant '" + bk.PInterfaceBravo() + "'. Use array1D for array Constants");
          } 
          bv.PInterfaceAlpha((bA)bk);
          continue;
        } 
        if (str.startsWith("field") && bv != null) {
          bq bq = PInterfaceAlpha(paramR, m);
          PInterfaceAlpha(paramR, m, bq.aJ(), false);
          if (bq.PInterfaceBravo() != null && !bq.PInterfaceBravo().equals("") && paramR.PInterfaceCharlie(bq.PInterfaceBravo()) == null) {
            PInterfaceBravo(m, "[" + paramString + "] field assigned to invalid Constant '" + bq.PInterfaceBravo() + "'.");
          } else if (bq.PInterfaceBravo() != null && !bq.PInterfaceBravo().equals("") && paramR.PInterfaceCharlie(bq.PInterfaceBravo()).KInterfaceIndia().equals("array") && !str.contains("[")) {
            PInterfaceBravo(m, "[" + paramString + "] field assigned to array Constant '" + bq.PInterfaceBravo() + "'. Use array1D for array Constants");
          } 
          bv.PInterfaceAlpha((bA)bq);
          continue;
        } 
        if (str.startsWith("radio") && bv != null) {
          by by = PInterfaceCharlie(paramR, m);
          PInterfaceAlpha(paramR, m, by.aJ(), false);
          if (by.PInterfaceBravo() != null && !by.PInterfaceBravo().equals("") && paramR.PInterfaceCharlie(by.PInterfaceBravo()) == null) {
            PInterfaceBravo(m, "[" + paramString + "] field assigned to invalid Constant '" + by.PInterfaceBravo() + "'.");
          } else if (by.PInterfaceBravo() != null && !by.PInterfaceBravo().equals("") && paramR.PInterfaceCharlie(by.PInterfaceBravo()).KInterfaceIndia().equals("array") && !str.contains("[")) {
            PInterfaceBravo(m, "[" + paramString + "] field assigned to array Constant '" + by.PInterfaceBravo() + "'. Use array1D for array Constants");
          } 
          bv.PInterfaceAlpha((bA)by);
          continue;
        } 
        if (str.startsWith("channelSelector") && bv != null) {
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
            bv.PInterfaceAlpha((bA)e);
          } catch (Exception exception) {
            PInterfaceAlpha(m, "Syntax error. Proper usage:\n   channelSelector = \"Label Text\", offset_scalar, len_scalar, can_id_scaler(optional), { enable condition (optional)}, { visible condition (optional)}");
          } 
          continue;
        } 
        if (str.startsWith("canDeviceSelector") && bv != null) {
          try {
            D d = KInterfaceFoxtrot(paramR, m);
            PInterfaceAlpha(paramR, m, d.aJ(), false);
            if (d.PInterfaceAlpha() != null && !d.PInterfaceAlpha().equals("") && paramR.PInterfaceCharlie(d.PInterfaceAlpha()) == null)
              PInterfaceBravo(m, "[" + paramString + "] CAN Device Selector assigned to invalid can ID Constant '" + d.PInterfaceAlpha() + "'."); 
            if (paramR.PInterfaceCharlie(d.PInterfaceAlpha()) != null && !paramR.PInterfaceCharlie(d.PInterfaceAlpha()).KInterfaceIndia().equals("scalar"))
              PInterfaceAlpha(m, "Constant: " + d.PInterfaceAlpha() + " not of type scalar. Only Scalar is supported for canDeviceSelector."); 
            bv.PInterfaceAlpha((bA)d);
          } catch (Exception exception) {
            PInterfaceAlpha(m, "Syntax error. Proper usage:\n   canDeviceSelector = \"Label Text\", can_id_scaler, { enable condition (optional)}, { visible condition (optional)}");
          } 
          continue;
        } 
        if (str.startsWith("canClientIdSelector") && bv != null) {
          try {
            C PInterfaceCharlie = ExceptionPrintstacktrace(paramR, m);
            PInterfaceAlpha(paramR, m, PInterfaceCharlie.aJ(), false);
            if (PInterfaceCharlie.PInterfaceAlpha() != null && !PInterfaceCharlie.PInterfaceAlpha().equals("") && paramR.PInterfaceCharlie(PInterfaceCharlie.PInterfaceAlpha()) == null)
              PInterfaceBravo(m, "[" + paramString + "] CAN Device Selector assigned to invalid can ID Constant '" + PInterfaceCharlie.PInterfaceAlpha() + "'."); 
            if (paramR.PInterfaceCharlie(PInterfaceCharlie.PInterfaceAlpha()) != null && !paramR.PInterfaceCharlie(PInterfaceCharlie.PInterfaceAlpha()).KInterfaceIndia().equals("scalar"))
              PInterfaceAlpha(m, "Constant: " + PInterfaceCharlie.PInterfaceAlpha() + " not of type scalar. Only Scalar is supported for canDeviceSelector."); 
            bv.PInterfaceAlpha((bA)PInterfaceCharlie);
          } catch (Exception exception) {
            PInterfaceAlpha(m, "Syntax error. Proper usage:\n   canDeviceSelector = \"Label Text\", can_id_scaler, { enable condition (optional)}, { visible condition (optional)}");
          } 
          continue;
        } 
        if (str.startsWith("slider") && bv != null) {
          bC bC = d(paramR, m);
          PInterfaceAlpha(paramR, m, bC.aJ(), false);
          if (bC.PInterfaceBravo() != null && !bC.PInterfaceBravo().equals("") && paramR.PInterfaceCharlie(bC.PInterfaceBravo()) == null)
            PInterfaceBravo(m, "[" + paramString + "] field assigned to invalid Constant '" + bC.PInterfaceBravo() + "'."); 
          if (paramR.PInterfaceCharlie(bC.PInterfaceBravo()) != null && !paramR.PInterfaceCharlie(bC.PInterfaceBravo()).KInterfaceIndia().equals("scalar"))
            PInterfaceAlpha(m, "Constant: " + bC.PInterfaceBravo() + " not of type scalar. Only Scalar is supported for Sliders."); 
          bv.PInterfaceAlpha((bA)bC);
          continue;
        } 
        if (str.startsWith("commandButton") && bv != null) {
          byte PInterfaceBravo;
          bl bl = new bl();
          bl.v(m.KInterfaceFoxtrot());
          String[] arrayOfString = j(m.e());
          bl.PInterfaceBravo(da.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString[0]));
          bl.PInterfaceAlpha(arrayOfString[1]);
          if (arrayOfString.length > 2 && arrayOfString[2].startsWith("{")) {
            String str1 = X.PInterfaceBravo(arrayOfString[2], "{", "");
            str1 = X.PInterfaceBravo(str1, "}", "");
            bl.u(str1.trim());
            PInterfaceAlpha(paramR, m, bl.aJ(), false);
            PInterfaceBravo = 3;
          } else {
            PInterfaceBravo = 2;
          } 
          while (arrayOfString.length > PInterfaceBravo) {
            if (arrayOfString[PInterfaceBravo].equals("clickOnClose")) {
              bl.PInterfaceAlpha(bl.KInterfaceFoxtrot);
            } else if (arrayOfString[PInterfaceBravo].equals("clickOnCloseIfEnabled")) {
              bl.PInterfaceAlpha(bl.PInterfaceBravo);
            } else if (arrayOfString[PInterfaceBravo].equals("clickOnCloseIfDisabled")) {
              bl.PInterfaceAlpha(bl.PInterfaceCharlie);
            } else if (arrayOfString[PInterfaceBravo].equals("closeDialogOnClick")) {
              bl.PInterfaceAlpha(bl.e);
            } else if (arrayOfString[PInterfaceBravo].equals("showMessageOnClick")) {
              if (arrayOfString.length > PInterfaceBravo + 1) {
                bl.PInterfaceAlpha(bl.d);
                String str1 = KInterfaceFoxtrot(arrayOfString[++PInterfaceBravo]);
                bl.PInterfaceBravo(str1);
              } else {
                PInterfaceBravo(m, "Message required with showMessageOnClick flag");
              } 
            } else {
              PInterfaceBravo(m, "Unknown commandButton attribute: " + arrayOfString[3] + ", know attributes include: clickOnCloseIfEnabled, clickOnCloseIfDisabled and clickOnClose");
            } 
            PInterfaceBravo++;
          } 
          if (bl.PInterfaceAlpha() == null || bl.PInterfaceAlpha().equals("") || paramR.O().PInterfaceBravo(bl.PInterfaceAlpha()) == null)
            PInterfaceBravo(m, "[" + paramString + "] commandButton assigned to invalid ControllerCommands '" + bl.PInterfaceAlpha() + "'."); 
          bv.PInterfaceAlpha((bA)bl);
          continue;
        } 
        if (str.startsWith("displayOnlyField") && bv != null) {
          bq bq = PInterfaceAlpha(paramR, m);
          bq.d(true);
          PInterfaceAlpha(paramR, m, bq.aJ(), false);
          if (bq.PInterfaceBravo() != null && !bq.PInterfaceBravo().equals("") && paramR.PInterfaceCharlie(bq.PInterfaceBravo()) == null)
            PInterfaceBravo(m, "[" + paramString + "] displayField assigned to invalid Constant '" + bq.PInterfaceBravo() + "'."); 
          bv.PInterfaceAlpha((bA)bq);
          continue;
        } 
        if (str.startsWith("runtimeValue") && bv != null) {
          bq bq = PInterfaceBravo(paramR, m);
          bq.d(true);
          PInterfaceAlpha(paramR, m, bq.aJ(), false);
          if (bq.PInterfaceBravo() != null && !bq.PInterfaceBravo().equals("") && paramR.ExceptionPrintstacktrace(bq.PInterfaceBravo()) == null)
            PInterfaceBravo(m, "[" + paramString + "] displayField assigned to invalid Constant '" + bq.PInterfaceBravo() + "'."); 
          bv.PInterfaceAlpha((bA)bq);
          continue;
        } 
        if (str.startsWith("topicHelp") && bv != null) {
          db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, q(str));
          bv.e(db);
          if (db.PInterfaceAlpha().startsWith("http:/") || db.PInterfaceAlpha().startsWith("file:/")) {
            aj = new aj();
            aj.PInterfaceAlpha(db);
            aj.PInterfaceBravo(db);
            if (bv.M() != null && bv.M().length() > 0) {
              if (db.PInterfaceAlpha().startsWith("http:/")) {
                aj.PInterfaceBravo("Web - " + bv.M());
              } else {
                aj.PInterfaceBravo(bv.M());
              } 
            } else if (db.PInterfaceAlpha().startsWith("file:/")) {
              aj.PInterfaceBravo("Manual Help");
            } else {
              aj.PInterfaceBravo("Web Help");
            } 
            parambE.PInterfaceAlpha(aj);
          } 
          continue;
        } 
        if (str.startsWith("help")) {
          aj = new aj();
          String[] arrayOfString = j(q(str));
          aj.PInterfaceAlpha(da.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString[0]));
          if (arrayOfString.length > 1)
            aj.PInterfaceBravo(X.PInterfaceBravo(arrayOfString[1], "\"", "")); 
          parambE.PInterfaceAlpha(aj);
          continue;
        } 
        if (str.startsWith("text") && aj != null) {
          aj.PInterfaceAlpha(X.PInterfaceBravo(q(str), "\"", "") + "\n");
          continue;
        } 
        if (str.startsWith("webHelp") && aj != null) {
          db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, q(str));
          aj.PInterfaceBravo(db);
          continue;
        } 
        if (str.startsWith("array1D")) {
          if (bv != null) {
            bj bj = d(str);
            PInterfaceAlpha(paramR, m, bj.PInterfaceCharlie(), false);
            bv.PInterfaceAlpha((bv)bj);
            continue;
          } 
          PInterfaceAlpha(m, "Could not load array1D because the parent panel was not defined 1st.");
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("indicatorPanel")) {
          String[] arrayOfString = j(q(str));
          bt = new bt();
          bt.v(arrayOfString[0]);
          parambE.PInterfaceAlpha((bv)bt);
          if (arrayOfString.length > 1)
            bt.PInterfaceAlpha((int)I.PInterfaceBravo(arrayOfString[1])); 
          if (arrayOfString.length > 2) {
            String str1 = X.PInterfaceBravo(arrayOfString[2], "{", "");
            str1 = X.PInterfaceBravo(str1, "}", "").trim();
            PInterfaceAlpha(paramR, m, str1, false);
            bt.u(str1);
          } 
          if (arrayOfString.length > 3) {
            String str1 = X.PInterfaceBravo(arrayOfString[3], "{", "");
            str1 = X.PInterfaceBravo(str1, "}", "").trim();
            PInterfaceAlpha(paramR, m, str1, false);
            bt.x(str1);
          } 
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("indicator")) {
          if (bt == null) {
            PInterfaceBravo(m, "indicator defined in " + paramString + " with no indicatorPanel defined, ignoring.");
            continue;
          } 
          ak ak = PInterfaceAlpha(m, paramR);
          bt.PInterfaceAlpha(ak);
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("readoutPanel")) {
          String[] arrayOfString = j(q(str));
          bz = new bz();
          bz.v(arrayOfString[0]);
          parambE.PInterfaceAlpha((bv)bz);
          if (arrayOfString.length > 1)
            bz.PInterfaceAlpha((int)I.PInterfaceBravo(arrayOfString[1])); 
          if (arrayOfString.length > 2) {
            String str1 = X.PInterfaceBravo(arrayOfString[2], "{", "");
            str1 = X.PInterfaceBravo(str1, "}", "").trim();
            PInterfaceAlpha(paramR, m, str1, false);
            bz.u(str1);
          } 
          if (arrayOfString.length > 3) {
            String str1 = X.PInterfaceBravo(arrayOfString[3], "{", "");
            str1 = X.PInterfaceBravo(str1, "}", "").trim();
            PInterfaceAlpha(paramR, m, str1, false);
            bz.x(str1);
          } 
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("readout")) {
          if (bz == null) {
            PInterfaceBravo(m, "readout defined in " + paramString + " with no readoutPanel defined, ignoring.");
            continue;
          } 
          String[] arrayOfString = j(q(str));
          if (arrayOfString.length == 1) {
            ah ah1 = paramR.k(arrayOfString[0]);
            if (ah1 != null) {
              bz.PInterfaceAlpha(ah1);
              continue;
            } 
            aH aH = paramR.ExceptionPrintstacktrace(arrayOfString[0]);
            if (aH != null) {
              ah1 = new ah();
              ah1.PInterfaceAlpha(arrayOfString[0]);
              ah1.PInterfaceCharlie(arrayOfString[0]);
              ah1.PInterfaceAlpha(-1.0E9D);
              ah1.PInterfaceBravo(1.0E9D);
              ah1.e(1.0E8D);
              ah1.d(1.0E8D);
              bz.PInterfaceAlpha(ah1);
              continue;
            } 
            PInterfaceBravo(m, "Unrecognized readout entry " + paramString + ", " + arrayOfString[0] + " not recognized as OutputChannel or Guage Definition");
            continue;
          } 
          ah ah = j(paramR, m);
          bz.PInterfaceAlpha(ah);
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("userPassword")) {
          String str1 = m.e();
          aM aM = paramR.PInterfaceCharlie(str1);
          if (aM != null && aM.z() >= 4) {
            bv.z(str1);
            paramR.PInterfaceCharlie(true);
            continue;
          } 
          PInterfaceBravo(m, "Invalid value for userPassword Parameter. Must be the name of PInterfaceAlpha defined U32 Constant. Invalid Value: " + str1);
          continue;
        } 
        PInterfaceBravo(m, "Unrecognized ini entry in " + paramString + ", ignoring.");
      } catch (Exception exception) {
        PInterfaceAlpha(m, "Invalid record in " + paramString + ", I don't know how to handle. It may cause more errors");
      } 
    } 
  }
  
  private void PInterfaceBravo(R paramR, bE parambE, J paramJ, String paramString) {
    aj aj = null;
    ArrayList arrayList = PInterfaceAlpha(paramJ, paramR, paramString);
    bJ bJ = null;
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
            parambE.PInterfaceAlpha((bL)PInterfaceBravo);
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
            parambE.PInterfaceAlpha((bL)PInterfaceAlpha);
            continue;
          } 
          PInterfaceAlpha(m, "Invalid WheelPattern class.");
          continue;
        } 
        if (str.startsWith("triggerWheel")) {
          bJ = new bJ();
          String[] arrayOfString = j(q(str));
          bJ.v(arrayOfString[0]);
          parambE.PInterfaceAlpha((bv)bJ);
          if (arrayOfString.length > 1)
            bJ.s(X.PInterfaceBravo(arrayOfString[1], "\"", "")); 
          if (arrayOfString.length > 2) {
            String str1 = X.PInterfaceBravo(arrayOfString[2], "{", "");
            str1 = X.PInterfaceBravo(str1, "}", "").trim();
            PInterfaceAlpha(paramR, m, str1, false);
            bJ.u(str1);
          } 
          bJ.PInterfaceAlpha(str.startsWith("triggerWheelDesigner"));
          continue;
        } 
        if (str.startsWith("topicHelp") && !PInterfaceAlpha(bJ, str)) {
          db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, q(str));
          bJ.e(db);
          if (db.PInterfaceAlpha().startsWith("http:/") || db.PInterfaceAlpha().startsWith("file:/")) {
            aj = new aj();
            aj.PInterfaceAlpha(db);
            aj.PInterfaceBravo(db);
            if (bJ != null && bJ.M() != null && bJ.M().length() > 0) {
              aj.PInterfaceBravo(bJ.M());
            } else {
              aj.PInterfaceBravo("Web Help");
            } 
            parambE.PInterfaceAlpha(aj);
          } 
          continue;
        } 
        if (str.startsWith("inputCapturePointParameterName") && PInterfaceCharlie != null) {
          String str1 = q(str);
          PInterfaceCharlie.PInterfaceBravo(str1.trim());
          continue;
        } 
        if (str.startsWith("solutionWheelPattern") && bJ != null) {
          String[] arrayOfString = j(q(str));
          String str1 = X.PInterfaceBravo(arrayOfString[1], "{", "");
          str1 = X.PInterfaceBravo(str1, "}", "");
          PInterfaceAlpha(paramR, m, str1, false);
          String str2 = arrayOfString[0];
          if (parambE.PInterfaceAlpha(str2) == null) {
            PInterfaceAlpha(m, "Attempt to add trigger wheel pattern " + str2 + " to triggerWheel, but wheel pattern is not defined.\nThe wheelPattern should be defined above the triggerWheel you are adding it to.");
            continue;
          } 
          bL bL = parambE.PInterfaceAlpha(str2);
          if (bL == null) {
            PInterfaceBravo(m, "Wheel Pattern: " + str2 + " not found in current configuration. Was it defined after this row?");
            continue;
          } 
          bJ.PInterfaceAlpha(str1, bL);
          continue;
        } 
        if (str.startsWith("preferredSize") && bJ != null) {
          String str1 = q(str);
          String[] arrayOfString = j(q(str));
          int KInterfaceIndia = X.ExceptionPrintstacktrace(arrayOfString[0]);
          int j = X.ExceptionPrintstacktrace(arrayOfString[1]);
          A PInterfaceAlpha = new A(KInterfaceIndia, j);
          bJ.PInterfaceAlpha(PInterfaceAlpha);
          continue;
        } 
        if (bJ == null) {
          PInterfaceBravo(m, "Syntax Error in ini section [" + paramString + "], PInterfaceAlpha triggerWheel was should be defined first.");
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
          aM aM = paramR.PInterfaceCharlie(m.e());
          if (aM == null) {
            PInterfaceBravo(m, m.e() + " not found, can not assign requiresPowerCycle.");
            continue;
          } 
          aM.d(true);
          continue;
        } 
        if (str.startsWith("readOnly")) {
          String[] arrayOfString = j(q(str));
          aM aM = paramR.PInterfaceCharlie(arrayOfString[0]);
          if (aM == null) {
            PInterfaceBravo(m, arrayOfString[0] + " not found, can not set to read only.");
            continue;
          } 
          aM.KInterfaceFoxtrot(true);
          continue;
        } 
        if (str.startsWith("defaultValue")) {
          String[] arrayOfString = j(q(str));
          aM aM = paramR.PInterfaceCharlie(arrayOfString[0]);
          if (aM == null) {
            PInterfaceBravo(m, arrayOfString[0] + " not found, can not assign defaultValue.");
            continue;
          } 
          boolean bool = aM.H();
          aM.KInterfaceFoxtrot(false);
          String str1 = arrayOfString[1];
          if (str1.startsWith("\"") && aM.KInterfaceIndia().equals("bits")) {
            aM.e(str1);
          } else if (aM.KInterfaceIndia().equals("array")) {
            double[][] arrayOfDouble = new double[aM.PInterfaceAlpha()][aM.m()];
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
            aM.PInterfaceAlpha(paramR.KInterfaceHotel(), arrayOfDouble);
          } else if (aM.KInterfaceIndia().equals("string")) {
            str1 = KInterfaceFoxtrot(str1);
            aM.KInterfaceFoxtrot(str1);
          } else {
            double d = Double.parseDouble(str1);
            aM.d(d);
          } 
          aM.KInterfaceFoxtrot(bool);
          continue;
        } 
        if (str.startsWith("rawValue")) {
          String[] arrayOfString = j(q(str));
          aM aM = paramR.PInterfaceCharlie(arrayOfString[0]);
          if (aM == null) {
            PInterfaceBravo(m, arrayOfString[0] + " not found, can not assign rawValue.");
            continue;
          } 
          boolean bool = aM.H();
          aM.KInterfaceFoxtrot(false);
          String str1 = arrayOfString[1];
          if (str1.startsWith("\"") && aM.KInterfaceIndia().equals("bits")) {
            PInterfaceBravo(m, "bit types not not supported byte assign rawValue.");
          } else {
            int[] arrayOfInt = new int[aM.z()];
            String str2 = m.e();
            String str3 = str2.substring(str2.indexOf(",") + 1);
            str3 = str3.replace("  ", " ").trim();
            arrayOfInt = X.d(str3, " ");
            aM.PInterfaceAlpha(paramR.KInterfaceHotel(), arrayOfInt);
          } 
          aM.KInterfaceFoxtrot(bool);
          continue;
        } 
        if (str.startsWith("useScaleAsDivisor")) {
          String[] arrayOfString = j(m.e());
          aM aM = paramR.PInterfaceCharlie(arrayOfString[0]);
          if (aM != null) {
            aM.KInterfaceFoxtrot(dk.PInterfaceAlpha((aI)paramR, arrayOfString[1]));
            continue;
          } 
          PInterfaceBravo(m, "Constant: " + arrayOfString[0] + " not found.");
          continue;
        } 
        if (str.startsWith("maintainConstantValue")) {
          String[] arrayOfString = j(m.e());
          aM aM = paramR.PInterfaceCharlie(arrayOfString[0]);
          if (aM == null) {
            PInterfaceAlpha(m, "Constant " + arrayOfString[0] + " not found! format: maintainConstantValue = scalarConstantName, { expression }");
            continue;
          } 
          if (!aM.KInterfaceIndia().equals("scalar") && !aM.KInterfaceIndia().equals("bits")) {
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
          aQ.PInterfaceAlpha().PInterfaceAlpha(aM, paramR, str1);
          PInterfaceAlpha(paramR, m, str1, true);
          continue;
        } 
        if (str.startsWith("reverseIndex")) {
          String[] arrayOfString = j(m.e());
          aM aM = paramR.PInterfaceCharlie(arrayOfString[0]);
          if (aM != null) {
            aM.ExceptionPrintstacktrace(dk.PInterfaceAlpha((aI)paramR, "1"));
            continue;
          } 
          PInterfaceBravo(m, "Constant: " + arrayOfString[0] + " not found.");
          continue;
        } 
        if (str.startsWith("oppositeEndian")) {
          String[] arrayOfString = j(m.e());
          aM aM = paramR.PInterfaceCharlie(arrayOfString[0]);
          if (aM != null) {
            aM.KInterfaceHotel(true);
            continue;
          } 
          PInterfaceBravo(m, "Constant: " + arrayOfString[0] + " not found.");
          continue;
        } 
        if (str.startsWith("controllerPriority")) {
          String[] arrayOfString = j(m.e());
          aM aM = paramR.PInterfaceCharlie(arrayOfString[0]);
          if (aM != null) {
            aM.KInterfaceIndia(true);
            continue;
          } 
          PInterfaceBravo(m, "Constant: " + arrayOfString[0] + " not found.");
          continue;
        } 
        if (str.startsWith("noMsqSave") || str.startsWith("noSaveToMsq") || str.startsWith("noLocalUpdate")) {
          String[] arrayOfString = j(m.e());
          aM aM = paramR.PInterfaceCharlie(arrayOfString[0]);
          if (aM != null) {
            aM.PInterfaceBravo(false);
            continue;
          } 
          PInterfaceBravo(m, "Constant: " + arrayOfString[0] + " not found.");
          continue;
        } 
        if (str.startsWith("maximumElements")) {
          String[] arrayOfString = j(m.e());
          aM aM = paramR.PInterfaceCharlie(arrayOfString[0]);
          if (aM != null) {
            aM.d(X.ExceptionPrintstacktrace(arrayOfString[1]));
            continue;
          } 
          PInterfaceBravo(m, "Constant: " + arrayOfString[0] + " not found.");
          continue;
        } 
        if (str.startsWith("useMappingTable")) {
          String[] arrayOfString = j(m.e());
          aM aM = paramR.PInterfaceCharlie(arrayOfString[0]);
          if (aM != null && arrayOfString.length > 1) {
            F KInterfaceFoxtrot = F.PInterfaceBravo(paramR.F(), arrayOfString[1]);
            if (KInterfaceFoxtrot != null) {
              aM.PInterfaceAlpha(KInterfaceFoxtrot);
              continue;
            } 
            PInterfaceBravo(m, "Failed to load Mapping file: " + arrayOfString[1]);
            continue;
          } 
          if (aM != null) {
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
  
  private void PInterfaceCharlie(R paramR, bE parambE, J paramJ, String paramString) {
    aj aj = null;
    ArrayList arrayList = PInterfaceAlpha(paramJ, paramR, paramString);
    bm bm = null;
    for (M m : arrayList) {
      String str = m.PInterfaceBravo();
      try {
        if (str.startsWith("curve")) {
          bm = new bm();
          bm.s(this.l);
          String[] arrayOfString = j(q(str));
          bm.v(arrayOfString[0]);
          parambE.PInterfaceAlpha((bv)bm);
          if (arrayOfString.length > 1) {
            db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString[1].trim());
            bm.d(db);
          } 
          continue;
        } 
        if (str.startsWith("topicHelp") && !PInterfaceAlpha(bm, str)) {
          db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, q(str));
          bm.e(db);
          if (db.PInterfaceAlpha().startsWith("http:/") || db.PInterfaceAlpha().startsWith("file:/")) {
            aj = new aj();
            aj.PInterfaceAlpha(db);
            aj.PInterfaceBravo(db);
            if (bm.M() != null && bm.M().length() > 0) {
              aj.PInterfaceBravo(bm.M());
            } else {
              aj.PInterfaceBravo("Web Help");
            } 
            parambE.PInterfaceAlpha(aj);
          } 
          continue;
        } 
        if (str.startsWith("enabledCondition") && bm != null) {
          String str1 = q(str);
          String str2 = X.PInterfaceBravo(str1, "{", "");
          str2 = X.PInterfaceBravo(str2, "}", "").trim();
          bm.u(str2);
          PInterfaceAlpha(paramR, m, str2, false);
          continue;
        } 
        if (str.startsWith("columnLabel") && !PInterfaceAlpha(bm, str)) {
          String[] arrayOfString = j(q(str));
          byte PInterfaceBravo = 0;
          while (PInterfaceBravo < arrayOfString.length) {
            if (arrayOfString.length > PInterfaceBravo + 1) {
              db db1 = da.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString[PInterfaceBravo++].trim());
              bm.PInterfaceCharlie(db1);
              db1 = da.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString[PInterfaceBravo++].trim());
              bm.PInterfaceAlpha(db1);
              continue;
            } 
            db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString[PInterfaceBravo++].trim());
            bm.PInterfaceAlpha(db);
          } 
          continue;
        } 
        if (str.startsWith("xAxis") && !PInterfaceAlpha(bm, str)) {
          String[] arrayOfString = j(q(str));
          bm.PInterfaceCharlie(dk.PInterfaceAlpha((aI)paramR, arrayOfString[0]));
          bm.d(dk.PInterfaceAlpha((aI)paramR, arrayOfString[1]));
          if (arrayOfString.length > 2)
            bm.KInterfaceHotel(X.ExceptionPrintstacktrace(arrayOfString[2].trim())); 
          continue;
        } 
        if (str.startsWith("yAxis") && !PInterfaceAlpha(bm, str)) {
          String[] arrayOfString = j(q(str));
          bm.PInterfaceAlpha(dk.PInterfaceAlpha((aI)paramR, arrayOfString[0]));
          bm.PInterfaceBravo(dk.PInterfaceAlpha((aI)paramR, arrayOfString[1]));
          if (arrayOfString.length > 2)
            bm.ExceptionPrintstacktrace(X.ExceptionPrintstacktrace(arrayOfString[2].trim())); 
          continue;
        } 
        if (str.startsWith("xBins") && !PInterfaceAlpha(bm, str)) {
          String[] arrayOfString = j(q(str));
          String str1 = X.PInterfaceBravo(arrayOfString[0].trim(), "\"", "");
          if (paramR.PInterfaceCharlie(str1) == null)
            PInterfaceAlpha(m, "CurveGraph xBin not PInterfaceAlpha valid Constant."); 
          bm.PInterfaceCharlie(str1);
          if (arrayOfString.length > 1)
            bm.d(arrayOfString[1].trim()); 
          if (arrayOfString.length > 2 && arrayOfString[2].equals("readOnly"))
            bm.e(true); 
          continue;
        } 
        if (str.startsWith("yBins") && !PInterfaceAlpha(bm, str)) {
          String str2;
          String[] arrayOfString = j(q(str));
          byte PInterfaceBravo = 0;
          String str1 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++].trim(), "\"", "");
          if (paramR.PInterfaceCharlie(str1) == null)
            PInterfaceAlpha(m, "CurveGraph yBin not PInterfaceAlpha valid Constant."); 
          if (arrayOfString.length > PInterfaceBravo && !arrayOfString[PInterfaceBravo].startsWith("{"))
            bm.PInterfaceBravo(arrayOfString[PInterfaceBravo++].trim()); 
          if (arrayOfString.length > PInterfaceBravo) {
            str2 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
            str2 = X.PInterfaceBravo(str2, "}", "");
          } else {
            str2 = "";
          } 
          bm.PInterfaceAlpha(str1, str2);
          continue;
        } 
        if (str.startsWith("lineLabel") && !PInterfaceAlpha(bm, str)) {
          String[] arrayOfString = j(q(str));
          db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString[0].trim());
          bm.PInterfaceBravo(db);
          continue;
        } 
        if (str.startsWith("gauge") && !PInterfaceAlpha(bm, str)) {
          String[] arrayOfString = j(q(str));
          if (arrayOfString.length > 0)
            bm.e(arrayOfString[0].trim()); 
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("showTextValues") && !PInterfaceAlpha(bm, str)) {
          String[] arrayOfString = j(q(str));
          if (arrayOfString.length > 0)
            try {
              bm.PInterfaceAlpha(Boolean.parseBoolean(arrayOfString[0].trim()));
            } catch (Exception exception) {
              PInterfaceBravo(m, "showTextValues expects true or false");
            }  
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("size") && !PInterfaceAlpha(bm, str)) {
          String[] arrayOfString = j(q(str));
          if (arrayOfString.length != 2)
            PInterfaceBravo(m, "CurvePanel suggestedSize should have 2 values\nsuggestedSize = width, height"); 
          A PInterfaceAlpha = new A(X.ExceptionPrintstacktrace(arrayOfString[0]), X.ExceptionPrintstacktrace(arrayOfString[1]));
          bm.PInterfaceAlpha(PInterfaceAlpha);
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("showXYDataPlot") && !PInterfaceAlpha(bm, str)) {
          String[] arrayOfString = j(q(str));
          if (arrayOfString.length < 3) {
            PInterfaceBravo(m, "CurvePanel showXYDataPlot must have at least 3 values\nshowXYDataPlot = displayByDefaultBoolean, xFieldName, yFieldName, [ DataDisplayCondition ] }");
            continue;
          } 
          bm.KInterfaceFoxtrot(Boolean.parseBoolean(arrayOfString[0]));
          bm.KInterfaceFoxtrot(arrayOfString[1]);
          bm.ExceptionPrintstacktrace(arrayOfString[2]);
          if (arrayOfString.length > 3) {
            String str1 = arrayOfString[3];
            str1 = X.PInterfaceBravo(str1, "{", "");
            str1 = X.PInterfaceBravo(str1, "}", "");
            bm.KInterfaceHotel(str1);
          } 
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("userPassword")) {
          String str1 = m.e();
          aM aM = paramR.PInterfaceCharlie(str1);
          if (aM != null && aM.z() >= 4) {
            bm.z(str1);
            paramR.PInterfaceCharlie(true);
            continue;
          } 
          PInterfaceBravo(m, "Invalid value for userPassword Parameter. Must be the name of PInterfaceAlpha defined U32 Constant. Invalid Value: " + str1);
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("suppressGraph")) {
          if (m.e().toLowerCase().equals("true") || m.e().toLowerCase().equals("false")) {
            boolean bool = Boolean.parseBoolean(m.e());
            if (bool) {
              bm.e((dj)new B(1.0D));
              continue;
            } 
            bm.e((dj)new B(0.0D));
            continue;
          } 
          String str1 = m.e();
          str1 = X.PInterfaceBravo(str1, "{", "");
          str1 = X.PInterfaceBravo(str1, "}", "");
          bm.e(dk.PInterfaceAlpha((aI)paramR, str1));
          PInterfaceAlpha(paramR, m, str1, false);
          continue;
        } 
        PInterfaceBravo(m, "Unrecognizedd entry. Do not know how to handle ini row.");
      } catch (Exception exception) {
        PInterfaceAlpha(m, "Syntax Error in " + paramString + ", values not as expected.");
      } 
    } 
  }
  
  private void d(R paramR, bE parambE, J paramJ, String paramString) {
    ArrayList arrayList = PInterfaceAlpha(paramJ, paramR, paramString);
    for (M m : arrayList) {
      try {
        if (m.KInterfaceFoxtrot().equals("showPanel")) {
          String[] arrayOfString = j(m.e());
          am am = new am(paramR);
          am.PInterfaceCharlie("showPanel");
          am.PInterfaceBravo(arrayOfString[0]);
          am.PInterfaceAlpha(arrayOfString[1]);
          parambE.PInterfaceAlpha(am);
          continue;
        } 
        PInterfaceBravo(m, "Unrecognized entry. Ignoring.");
      } catch (Exception exception) {
        PInterfaceAlpha(m, "Syntax Error.");
      } 
    } 
  }
  
  private void e(R paramR, bE parambE, J paramJ, String paramString) {
    ArrayList arrayList = PInterfaceAlpha(paramJ, paramR, paramString);
    aA aA1 = null;
    aA aA2 = null;
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
            bv bv = parambE.PInterfaceCharlie(str);
            if (bv == null) {
              PInterfaceBravo(m, "Menu: " + aA1.e() + " not added, menu dialog \"" + str + "\" not found");
              continue;
            } 
            bv.PInterfaceAlpha(aA1);
          } 
          continue;
        } 
        if (str1.startsWith("subMenu")) {
          aA2 = null;
          if (aA1 == null) {
            PInterfaceAlpha(m, "Adding subMenu before main menu defined");
            continue;
          } 
          aA aA = PInterfaceAlpha(m, true);
          PInterfaceAlpha(paramR, m, aA.aJ(), false);
          if (parambE.PInterfaceCharlie(aA.d()) == null && PInterfaceCharlie(aA.d()))
            PInterfaceAlpha(paramR, aA.d(), aA.KInterfaceFoxtrot()); 
          if (parambE.PInterfaceCharlie(aA.d()) == null && !PInterfaceCharlie(aA.d()) && parambE.PInterfaceBravo(aA.d()) == null)
            PInterfaceBravo(m, "Unknown Menu Target: " + aA.d()); 
          aA1.PInterfaceAlpha(aA);
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("groupMenu")) {
          if (aA1 == null) {
            PInterfaceAlpha(m, "Adding groupMenu before main menu defined");
            continue;
          } 
          String str2 = m.e();
          String[] arrayOfString = j(str2);
          aA2 = new aA();
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
          aA aA = PInterfaceAlpha(m, true);
          PInterfaceAlpha(paramR, m, aA.aJ(), false);
          if (parambE.PInterfaceCharlie(aA.d()) == null && PInterfaceCharlie(aA.d()))
            PInterfaceAlpha(paramR, aA.d(), aA.KInterfaceFoxtrot()); 
          if (parambE.PInterfaceCharlie(aA.d()) == null && !PInterfaceCharlie(aA.d()) && parambE.PInterfaceBravo(aA.d()) == null)
            PInterfaceBravo(m, "Unknown Menu Target: " + aA.d()); 
          aA2.PInterfaceAlpha(aA);
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
          aA aA = PInterfaceAlpha(m, true);
          PInterfaceAlpha(paramR, m, aA.aJ(), false);
          if (parambE.PInterfaceCharlie(aA.d()) == null && PInterfaceCharlie(aA.d()))
            PInterfaceAlpha(paramR, aA.d(), aA.KInterfaceFoxtrot()); 
          if (parambE.PInterfaceCharlie(aA.d()) == null && !PInterfaceCharlie(aA.d()) && parambE.PInterfaceBravo(aA.d()) == null)
            PInterfaceBravo(m, "Unknown Menu Target: " + aA.d()); 
          aA1.PInterfaceAlpha(arrayOfString[0], aA);
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
  
  private aA PInterfaceAlpha(bE parambE, M paramM, String paramString) {
    aA aA = PInterfaceAlpha(paramM, false);
    for (aA aA1 : parambE.PInterfaceCharlie()) {
      if (aA1.KInterfaceHotel().equals(aA.KInterfaceHotel())) {
        aA1.e(aA.KInterfaceIndia());
        aA1.u(aA.aJ());
        return aA1;
      } 
    } 
    if (paramString == null || paramString.equals("main"))
      parambE.PInterfaceAlpha(aA); 
    return aA;
  }
  
  private aA PInterfaceAlpha(M paramM, boolean paramBoolean) {
    String str = paramM.e();
    aA aA = new aA();
    aA.s(this.l);
    if (str.indexOf("\"     ") > 0)
      PInterfaceBravo(paramM, "Ini entry missing comma, repaired."); 
    String[] arrayOfString = j(str);
    byte PInterfaceBravo = 0;
    if (paramM.KInterfaceFoxtrot().equals("replaceSubMenu"))
      PInterfaceBravo++; 
    if (paramBoolean) {
      String str1 = arrayOfString[PInterfaceBravo++];
      if (str1.equals("std_separator")) {
        aA.PInterfaceAlpha(true);
        return aA;
      } 
      aA.PInterfaceAlpha(str1);
    } 
    try {
      String str1 = "";
      String str2 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++].trim(), "\"", "");
      aA.d(str2);
      if (str2.indexOf("&") != -1) {
        int KInterfaceIndia = str2.indexOf("&");
        str1 = str2.substring(KInterfaceIndia + 1, KInterfaceIndia + 2);
        aA.PInterfaceCharlie(str1);
      } 
      str2 = X.PInterfaceBravo(str2, "&", "");
      aA.PInterfaceBravo(str2);
      if (paramBoolean && arrayOfString.length > PInterfaceBravo)
        try {
          if (I.PInterfaceAlpha(arrayOfString[PInterfaceBravo]))
            aA.PInterfaceAlpha((int)I.PInterfaceBravo(arrayOfString[PInterfaceBravo++].trim())); 
        } catch (Exception exception) {} 
      if (arrayOfString.length > PInterfaceBravo) {
        String str3 = arrayOfString[PInterfaceBravo++];
        str3 = X.PInterfaceBravo(str3, "{", "");
        str3 = X.PInterfaceBravo(str3, "}", "").trim();
        aA.u(str3);
      } 
      if (arrayOfString.length > PInterfaceBravo) {
        String str3 = arrayOfString[PInterfaceBravo++];
        str3 = X.PInterfaceBravo(str3, "{", "");
        str3 = X.PInterfaceBravo(str3, "}", "").trim();
        aA.e(str3);
      } 
    } catch (Exception exception) {
      PInterfaceBravo(paramM, "Error paring Menu.");
      exception.printStackTrace();
    } 
    return aA;
  }
  
  private boolean PInterfaceAlpha(Object paramObject, String paramString) {
    if (paramObject != null)
      return false; 
    D.PInterfaceBravo("ini error, Tried to load row: \n\t" + paramString + "\n\tbut Object not initialized.");
    return true;
  }
  
  private bj d(String paramString) {
    bj bj = new bj();
    bj.s(this.l);
    String str1 = q(paramString);
    String[] arrayOfString = j(str1);
    byte PInterfaceBravo = 0;
    String str2 = arrayOfString[PInterfaceBravo++];
    str2 = X.PInterfaceBravo(str2, "\"", "");
    if (str2 != null && !str2.equals(""))
      bj.s(str2.trim()); 
    String str3 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", "");
    bj.PInterfaceAlpha(str3);
    String str4 = arrayOfString[PInterfaceBravo++];
    bj.PInterfaceBravo(str4);
    if (arrayOfString.length > PInterfaceBravo) {
      String str = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
      str = X.PInterfaceBravo(str, "}", "").trim();
      bj.PInterfaceCharlie(str);
    } 
    return bj;
  }
  
  private bq PInterfaceAlpha(R paramR, M paramM) {
    bq bq = new bq();
    return PInterfaceAlpha(paramR, paramM, bq);
  }
  
  private bq PInterfaceAlpha(R paramR, M paramM, bq parambq) {
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
    parambq.PInterfaceBravo(da.PInterfaceAlpha().PInterfaceAlpha(paramR, str3));
    if (arrayOfString.length > PInterfaceBravo) {
      String str = arrayOfString[PInterfaceBravo++];
      if (str.startsWith("{") && str.endsWith("}")) {
        try {
          db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, str);
          parambq.PInterfaceAlpha(db);
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
    if (parambq instanceof bk && arrayOfString.length > PInterfaceBravo) {
      String str = arrayOfString[PInterfaceBravo++];
      if (paramR.ExceptionPrintstacktrace(str) == null) {
        PInterfaceBravo(paramM, str + " not defined as an OutputChannel! Ignored");
      } else {
        ((bk)parambq).PInterfaceAlpha(str);
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
  
  private bq PInterfaceBravo(R paramR, M paramM) {
    String str1 = paramM.PInterfaceBravo();
    bq bq = new bq();
    bq.s(this.l);
    String str2 = q(str1);
    String[] arrayOfString = j(str2);
    byte PInterfaceBravo = 0;
    String str3 = arrayOfString[PInterfaceBravo++];
    str3 = X.PInterfaceBravo(str3, "\"", "");
    if (str3.startsWith("!")) {
      bq.PInterfaceAlpha(true);
      str3 = str3.substring(1);
    } else if (str3.startsWith("#")) {
      bq.PInterfaceBravo(true);
      str3 = str3.substring(1);
    } 
    bq.PInterfaceBravo(da.PInterfaceAlpha().PInterfaceAlpha(paramR, str3));
    if (arrayOfString.length > PInterfaceBravo) {
      String str = arrayOfString[PInterfaceBravo++];
      bq.PInterfaceBravo(str);
    } 
    if (arrayOfString.length > PInterfaceBravo) {
      String str = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
      str = X.PInterfaceBravo(str, "}", "").trim();
      bq.u(str);
    } 
    if (arrayOfString.length > PInterfaceBravo) {
      String str = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
      str = X.PInterfaceBravo(str, "}", "").trim();
      bq.KInterfaceFoxtrot(str);
    } 
    if (arrayOfString.length > PInterfaceBravo) {
      String str = arrayOfString[PInterfaceBravo++];
      if (str.equals("displayInHex")) {
        bq.e(true);
      } else {
        PInterfaceBravo(paramM, "Unknown 5th position attribute: " + str + ", known field Attribute: displayInHex");
      } 
    } 
    return bq;
  }
  
  private by PInterfaceCharlie(R paramR, M paramM) {
    String str1 = paramM.PInterfaceBravo();
    by by = new by();
    by.s(this.l);
    String str2 = q(str1);
    String[] arrayOfString = j(str2);
    byte PInterfaceBravo = 0;
    String str3 = arrayOfString[PInterfaceBravo++];
    if (str3.equals("horizontal")) {
      by.KInterfaceFoxtrot(true);
    } else if (!str3.equals("vertical")) {
      PInterfaceBravo(paramM, "Orientation must be horizontal or vertical. Unknown value: " + str3);
    } 
    String str4 = arrayOfString[PInterfaceBravo++];
    str4 = X.PInterfaceBravo(str4, "\"", "");
    by.PInterfaceBravo(da.PInterfaceAlpha().PInterfaceAlpha(paramR, str4));
    if (arrayOfString.length > PInterfaceBravo) {
      String str = arrayOfString[PInterfaceBravo++];
      if (str.startsWith("{") && str.endsWith("}"))
        try {
          db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, str);
          by.PInterfaceAlpha(db);
          str = null;
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          PInterfaceAlpha(paramM, "Error in String expression");
        }  
      by.PInterfaceBravo(str);
    } 
    if (arrayOfString.length > PInterfaceBravo) {
      String str = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
      str = X.PInterfaceBravo(str, "}", "").trim();
      by.u(str);
    } 
    if (arrayOfString.length > PInterfaceBravo) {
      String str = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
      str = X.PInterfaceBravo(str, "}", "").trim();
      by.KInterfaceFoxtrot(str);
    } 
    return by;
  }
  
  private bC d(R paramR, M paramM) {
    String str1 = paramM.PInterfaceBravo();
    bC bC = new bC();
    bC.s(this.l);
    String str2 = q(str1);
    String[] arrayOfString = j(str2);
    byte PInterfaceBravo = 0;
    String str3 = arrayOfString[PInterfaceBravo++];
    str3 = X.PInterfaceBravo(str3, "\"", "");
    if (str3.startsWith("!")) {
      bC.PInterfaceAlpha(true);
      str3 = str3.substring(1);
    } else if (str3.startsWith("#")) {
      bC.PInterfaceBravo(true);
      str3 = str3.substring(1);
    } 
    bC.PInterfaceBravo(da.PInterfaceAlpha().PInterfaceAlpha(paramR, str3));
    if (arrayOfString.length > PInterfaceBravo) {
      String str = arrayOfString[PInterfaceBravo++];
      if (str.indexOf("[") > 0) {
        String str4 = str.substring(0, str.indexOf("["));
        String str5 = str.substring(str.indexOf("["));
        str5 = X.PInterfaceBravo(str5, "[", "");
        str5 = X.PInterfaceBravo(str5, "]", "");
        bC.PInterfaceAlpha(X.ExceptionPrintstacktrace(str5));
        str = str4;
      } 
      bC.PInterfaceBravo(str);
    } 
    if (arrayOfString.length > PInterfaceBravo) {
      String str = arrayOfString[PInterfaceBravo++];
      if (str.equals("horizontal")) {
        bC.PInterfaceCharlie(bC.PInterfaceAlpha);
      } else if (str.equals("vertical")) {
        bC.PInterfaceCharlie(bC.PInterfaceBravo);
      } else {
        PInterfaceBravo(paramM, "Unknown Slider orientation: " + str + ", valid values: (horizontal, vertical). using default: horizontal");
        bC.PInterfaceCharlie(bC.PInterfaceAlpha);
      } 
    } 
    if (arrayOfString.length > PInterfaceBravo) {
      String str = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
      str = X.PInterfaceBravo(str, "}", "").trim();
      bC.u(str);
    } 
    return bC;
  }
  
  private E e(R paramR, M paramM) {
    E e = new E();
    e.s(this.l);
    String[] arrayOfString = j(paramM.e());
    e.PInterfaceBravo(da.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString[0]));
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
    d.PInterfaceBravo(da.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString[0]));
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
    PInterfaceCharlie.PInterfaceBravo(da.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString[0]));
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
        double d = KInterfaceIndia.PInterfaceAlpha(paramString1, (aI)paramR);
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
  
  protected void PInterfaceAlpha(R paramR, bR parambR, String paramString1, String paramString2, boolean paramBoolean) {
    if (PInterfaceAlpha() && parambR != null && parambR.PInterfaceCharlie() != null && !parambR.PInterfaceCharlie().equals("")) {
      if (paramString1.equals("toggleSwitchOn"))
        D.PInterfaceCharlie("break: 48s35"); 
      try {
        String str = parambR.PInterfaceCharlie();
        if (str.contains("%INDEX%"))
          str = X.PInterfaceBravo(str, "%INDEX%", "0"); 
        double d = KInterfaceIndia.PInterfaceAlpha(str, (aI)paramR);
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
          aM aM = paramR.PInterfaceCharlie(m.e());
          if (aM == null) {
            PInterfaceAlpha(m, "Constant Not Found: " + m.e());
          } else if (!aM.KInterfaceIndia().equals("array")) {
            PInterfaceAlpha(m, "scatteredOffsetArray must be of type array");
          } else {
            paramR.O().p(m.e());
          } 
        } else if (str.equals("scatteredGetEnabled")) {
          dj dj = dk.PInterfaceAlpha((aI)paramR, m.e());
          paramR.O().e(dj);
        } else if (!F.PInterfaceAlpha(str)) {
          aH aH = PInterfaceAlpha(m, paramR, KInterfaceIndia, j);
          boolean bool = (paramR.O() == null || paramR.O().e()) ? true : false;
          aH.PInterfaceAlpha(bool);
          paramR.PInterfaceAlpha(aH);
          if (!aH.PInterfaceBravo().equals("formula")) {
            KInterfaceIndia = aH.PInterfaceAlpha() + aH.l();
            j = aH.PInterfaceAlpha();
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
          aH aH = paramR.ExceptionPrintstacktrace(str);
          if (aH != null && aH.k() != null && !aH.k().contains("AppEvent."))
            PInterfaceAlpha(paramR, m, aH.k(), true); 
          if (aH.ExceptionPrintstacktrace() instanceof bR) {
            bR bR = (bR)aH.ExceptionPrintstacktrace();
            PInterfaceAlpha(paramR, m, bR.PInterfaceCharlie(), true);
          } 
          if (aH.j() instanceof bR) {
            bR bR = (bR)aH.j();
            PInterfaceAlpha(paramR, m, bR.PInterfaceCharlie(), true);
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
    //   49: invokevirtual PInterfaceAlpha : (Ljava/lang/String;)LG/aI;
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
    //   74: invokevirtual PInterfaceAlpha : (LG/aI;)V
    //   77: invokestatic PInterfaceAlpha : ()LG/KInterfaceHotel;
    //   80: new java/lang/StringBuilder
    //   83: dup
    //   84: invokespecial <init> : ()V
    //   87: aload_1
    //   88: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   91: ldc_w '_ExtendedReplay'
    //   94: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: invokevirtual toString : ()Ljava/lang/String;
    //   100: invokevirtual PInterfaceAlpha : (Ljava/lang/String;)LG/aI;
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
    //   125: invokevirtual PInterfaceAlpha : (LG/aI;)V
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
    //   177: invokevirtual PInterfaceCharlie : (Ljava/lang/String;)LG/aM;
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
    //   237: ldc_w 'replayConfigTable must be of type array'
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
    //   278: invokestatic PInterfaceAlpha : (LG/aI;Ljava/lang/String;)LG/dj;
    //   281: astore #13
    //   283: aload_1
    //   284: invokevirtual O : ()LG/F;
    //   287: aload #13
    //   289: invokevirtual KInterfaceFoxtrot : (LG/dj;)V
    //   292: goto -> 502
    //   295: aload #12
    //   297: ldc_w 'replayRecordLength'
    //   300: invokevirtual equals : (Ljava/lang/Object;)Z
    //   303: ifeq -> 329
    //   306: aload_1
    //   307: aload #5
    //   309: invokevirtual e : ()Ljava/lang/String;
    //   312: invokestatic PInterfaceAlpha : (LG/aI;Ljava/lang/String;)LG/dj;
    //   315: astore #13
    //   317: aload_1
    //   318: invokevirtual O : ()LG/F;
    //   321: aload #13
    //   323: invokevirtual ExceptionPrintstacktrace : (LG/dj;)V
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
    //   352: invokespecial PInterfaceAlpha : (LW/M;LG/R;IILG/aI;)LG/bb;
    //   355: astore #13
    //   357: goto -> 375
    //   360: aload_0
    //   361: aload #5
    //   363: aload_1
    //   364: iload #6
    //   366: iload #7
    //   368: aload #9
    //   370: invokespecial PInterfaceAlpha : (LW/M;LG/R;IILG/aI;)LG/bb;
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
    //   418: invokevirtual PInterfaceAlpha : (LG/bb;)V
    //   421: goto -> 468
    //   424: aload_3
    //   425: ldc 'ExtendedReplay'
    //   427: invokevirtual equals : (Ljava/lang/Object;)Z
    //   430: ifeq -> 442
    //   433: aload_1
    //   434: aload #13
    //   436: invokevirtual PInterfaceBravo : (LG/bb;)V
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
    //   603: invokevirtual KInterfaceIndia : (Ljava/lang/String;)LG/bb;
    //   606: astore #13
    //   608: goto -> 619
    //   611: aload_1
    //   612: aload #12
    //   614: invokevirtual KInterfaceHotel : (Ljava/lang/String;)LG/bb;
    //   617: astore #13
    //   619: aload #13
    //   621: ifnull -> 632
    //   624: aload #13
    //   626: invokevirtual k : ()Ljava/lang/String;
    //   629: ifnull -> 632
    //   632: aload #13
    //   634: invokevirtual ExceptionPrintstacktrace : ()LG/dj;
    //   637: instanceof G/bR
    //   640: ifeq -> 666
    //   643: aload #13
    //   645: invokevirtual ExceptionPrintstacktrace : ()LG/dj;
    //   648: checkcast G/bR
    //   651: astore #14
    //   653: aload_0
    //   654: aload_1
    //   655: aload #5
    //   657: aload #14
    //   659: invokevirtual PInterfaceCharlie : ()Ljava/lang/String;
    //   662: iconst_1
    //   663: invokevirtual PInterfaceAlpha : (LG/R;LW/M;Ljava/lang/String;Z)V
    //   666: aload #13
    //   668: invokevirtual j : ()LG/dj;
    //   671: instanceof G/bR
    //   674: ifeq -> 700
    //   677: aload #13
    //   679: invokevirtual j : ()LG/dj;
    //   682: checkcast G/bR
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
          ah ah = j(paramR, m);
          ah.d(str);
          if (!PInterfaceBravo(paramR, ah.KInterfaceIndia()))
            PInterfaceBravo(m, "[GaugeConfigurations] gauge template assigned to undefined OutputChannel: " + ah.KInterfaceIndia()); 
          paramR.PInterfaceAlpha(ah);
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
          bf bf = new bf(KInterfaceFoxtrot);
          bf.v(arrayOfString[b1++]);
          String str1 = KInterfaceFoxtrot(arrayOfString[b1++]);
          bf.PInterfaceCharlie(str1);
          bf.PInterfaceBravo(arrayOfString[b1++]);
          String str2 = arrayOfString[b1++].trim();
          if (str2.startsWith("{")) {
            String str3 = str2;
            str3 = X.PInterfaceBravo(str3, "{", "");
            str3 = X.PInterfaceBravo(str3, "}", "");
            bf.u(str3);
          } 
          bf.PInterfaceAlpha(PInterfaceBravo++);
          paramR.PInterfaceAlpha(bf);
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
          bP bP = new bP(str);
          bP.PInterfaceAlpha(str1);
          paramR.PInterfaceAlpha(bP);
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
          for (ac ac1 : paramR.ExceptionPrintstacktrace()) {
            if (ac1.aL().equals(str2)) {
              bool1 = true;
              break;
            } 
          } 
          if (!bool1)
            PInterfaceBravo(m, "No field by this name found in the [Datalog] section."); 
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
          PInterfaceBravo(m, "Invalid graph definition. Should be format: graphX.Y  Example: graph0.1");
        } 
        continue;
      } 
      if (str1.equals("logViewName")) {
        str = KInterfaceFoxtrot(m.e());
        x = new x();
        byte b1 = 1;
        if (paramR.B(str) != null) {
          PInterfaceBravo(m, "Each Data logViewName must be unique!");
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
          cb.PInterfaceAlpha().PInterfaceAlpha(str2, Integer.parseInt(arrayOfString[1]));
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
            al al = PInterfaceAlpha(m, (aI)paramR, KInterfaceIndia, j);
            paramR.PInterfaceAlpha(al);
            KInterfaceIndia = al.PInterfaceAlpha() + al.l();
            j = al.PInterfaceAlpha();
          } else if (!str1.startsWith("defaultExtension")) {
            if (str1.startsWith("entry")) {
              ac ac1 = k(paramR, m);
              if (this.j && arrayList1.contains(ac1.PInterfaceBravo()) && (ac1.aJ() == null || ac1.aJ().isEmpty()))
                PInterfaceBravo(m, "Duplicate Data Log Field naming, the header " + ac1.PInterfaceBravo() + "has already been defined."); 
              if (paramR.ExceptionPrintstacktrace(ac1.PInterfaceAlpha()) == null && !cu.PInterfaceAlpha().e(ac1.PInterfaceAlpha())) {
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
                PInterfaceBravo(m, "DataLogField category cannot be more than 34 in length. Truncating: " + str);
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
  
  private void PInterfaceCharlie(R paramR, bE parambE, J paramJ) {
    ArrayList<M> arrayList = PInterfaceAlpha(paramJ, paramR, "FTPBrowser");
    M m = null;
    bo bo = null;
    for (byte PInterfaceBravo = 0; PInterfaceBravo < arrayList.size(); PInterfaceBravo++) {
      try {
        m = arrayList.get(PInterfaceBravo);
        String str1 = m.KInterfaceFoxtrot();
        String str2 = m.e();
        if (str1.equals("ftpBrowser")) {
          bo = new bo();
          String[] arrayOfString = j(q(str2));
          bo.v(arrayOfString[0]);
          bo.s(arrayOfString[1]);
          if (arrayOfString.length > 2)
            bo.u(arrayOfString[2]); 
          parambE.PInterfaceAlpha((bv)bo);
        } else if (str1.equals("host")) {
          bo.PInterfaceAlpha(q(str2));
        } else if (str1.equals("port")) {
          bo.PInterfaceAlpha(X.ExceptionPrintstacktrace(str2));
        } else if (str1.equals("user")) {
          bo.PInterfaceBravo(str2);
        } else if (str1.equals("password")) {
          bo.PInterfaceCharlie(str2);
        } else if (str1.equals("passiveMode")) {
          bo.PInterfaceAlpha(str2.equalsIgnoreCase("true"));
        } else if (str1.equals("browseEnable")) {
          String[] arrayOfString = j(q(str2));
          String str3 = KInterfaceFoxtrot(arrayOfString[0]);
          String str4 = arrayOfString[1].trim();
          str4 = X.PInterfaceBravo(str4, "{", "");
          str4 = X.PInterfaceBravo(str4, "}", "");
          bo.PInterfaceAlpha(str4, str3);
        } else if (str1.equals("readWriteEnable")) {
          String[] arrayOfString = j(q(str2));
          String str3 = KInterfaceFoxtrot(arrayOfString[0]);
          String str4 = arrayOfString[1].trim();
          str4 = X.PInterfaceBravo(str4, "{", "");
          str4 = X.PInterfaceBravo(str4, "}", "");
          PInterfaceAlpha(paramR, m, str4, true);
          bo.PInterfaceBravo(str4, str3);
        } else {
          PInterfaceBravo(m, "Unrecognized DataLog entry.");
        } 
      } catch (NullPointerException nullPointerException) {
        PInterfaceAlpha(m, "ftpBrowser must be defined before other attributes!\nftpBrowser = referenceName, \"Title\", enableCondition");
      } catch (Exception exception) {
        PInterfaceAlpha(m, exception.getMessage() + "\nEntry ignored.");
      } 
    } 
  }
  
  private void j(R paramR, J paramJ) {
    ArrayList<M> arrayList = PInterfaceAlpha(paramJ, paramR, "TableEditor");
    be be = null;
    bi bi = null;
    for (byte b1 = 0; b1 < arrayList.size(); b1++) {
      M m = arrayList.get(b1);
      String str = m.PInterfaceBravo();
      try {
        if (str.startsWith("table")) {
          be = new be();
          be.s(this.l);
          bi = new bi();
          String[] arrayOfString1 = j(q(str));
          be.v(arrayOfString1[0]);
          bi.PInterfaceAlpha(arrayOfString1[0]);
          bi.v(arrayOfString1[1]);
          db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString1[2]);
          be.d(db);
          bi.s(arrayOfString1[2]);
          paramR.PInterfaceAlpha(be);
          paramR.PInterfaceAlpha(bi);
          if (paramR.e() != null)
            paramR.e().PInterfaceAlpha((bv)be); 
        } else if (str.startsWith("xBins")) {
          if (be == null)
            throw new ExceptionPrintstacktrace("Error in [TableEditor] Section, 1st row should be table = XXX, found \n" + m); 
          String[] arrayOfString1 = j(q(str));
          be.PInterfaceAlpha(arrayOfString1[0]);
          be.d(arrayOfString1[1]);
          be.KInterfaceFoxtrot(arrayOfString1[1].toUpperCase());
          if (paramR.PInterfaceCharlie(be.PInterfaceAlpha()) == null)
            PInterfaceBravo(m, "Table: " + be.aL() + ", Assigned xBin not found: " + be.PInterfaceAlpha()); 
          if (be.d() != null && be.d().length() > 0 && paramR.ExceptionPrintstacktrace(be.d()) == null)
            PInterfaceBravo(m, "Table: " + be.aL() + ", Assigned xBin Channel not found: " + be.d()); 
          if (arrayOfString1.length > 2 && arrayOfString1[2].equals("readOnly"))
            be.PInterfaceBravo(true); 
        } else if (str.startsWith("yBins")) {
          if (be == null)
            throw new ExceptionPrintstacktrace("Error in [TableEditor] Section, 1st row should be table = XXX, found \n" + m); 
          String[] arrayOfString1 = j(q(str));
          be.PInterfaceBravo(arrayOfString1[0]);
          be.e(arrayOfString1[1]);
          be.ExceptionPrintstacktrace(arrayOfString1[1].toUpperCase());
          if (paramR.PInterfaceCharlie(be.PInterfaceBravo()) == null)
            PInterfaceBravo(m, "Table: " + be.aL() + ", Assigned y Bin not found: " + be.PInterfaceBravo()); 
          if (be.KInterfaceFoxtrot() != null && be.KInterfaceFoxtrot().length() > 0 && paramR.ExceptionPrintstacktrace(be.KInterfaceFoxtrot()) == null)
            PInterfaceBravo(m, "Table: " + be.aL() + ", Assigned y Bin Channel not found: " + be.KInterfaceFoxtrot()); 
          if (arrayOfString1.length > 2 && arrayOfString1[2].equals("readOnly"))
            be.PInterfaceCharlie(true); 
        } else if (str.startsWith("zBins")) {
          if (be == null)
            throw new ExceptionPrintstacktrace("Error in [TableEditor] Section, 1st row should be table = XXX, found \n" + m); 
          be.PInterfaceCharlie(q(str));
          if (paramR.PInterfaceCharlie(be.PInterfaceCharlie()) == null)
            PInterfaceBravo(m, "Table: " + be.aL() + ", Assigned y Bin not found: " + be.PInterfaceCharlie()); 
        } else if (str.startsWith("upDownLabel")) {
          if (be == null)
            throw new ExceptionPrintstacktrace("Error in [TableEditor] Section, 1st row should be table = XXX, found \n" + m); 
          String[] arrayOfString1 = j(q(str));
          be.PInterfaceAlpha(arrayOfString1);
        } else if (str.startsWith("gridOrient")) {
          if (be == null)
            throw new ExceptionPrintstacktrace("Error in [TableEditor] Section, 1st row should be table = XXX, found \n" + m); 
          String[] arrayOfString1 = j(q(str));
          bi.PInterfaceBravo(360 - X.ExceptionPrintstacktrace(arrayOfString1[0]) + 90);
          bi.PInterfaceAlpha(360 - X.ExceptionPrintstacktrace(arrayOfString1[2]));
        } else if (str.startsWith("topicHelp")) {
          if (be == null)
            throw new ExceptionPrintstacktrace("Error in [TableEditor] Section, 1st row should be table = XXX, found \n" + m); 
          db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, q(str));
          be.e(db);
          if (bi != null)
            bi.e(db); 
          String str1 = KInterfaceFoxtrot(q(str));
          if (str1.startsWith("http:/") || str1.startsWith("file:/")) {
            aj aj = new aj();
            aj.PInterfaceAlpha(db);
            aj.PInterfaceBravo(db);
            if (be.M() != null && be.M().length() > 0) {
              aj.PInterfaceBravo(be.M());
            } else {
              aj.PInterfaceBravo("Web Help");
            } 
            paramR.e().PInterfaceAlpha(aj);
          } 
        } else if (str.startsWith("xyLabels")) {
          String[] arrayOfString1 = j(q(str));
          if (arrayOfString1.length > 2)
            PInterfaceBravo(m, "Extra attributes, ignoring."); 
          if (arrayOfString1.length > 0) {
            db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString1[0]);
            be.PInterfaceAlpha(db);
          } 
          if (arrayOfString1.length > 1) {
            db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, arrayOfString1[1]);
            be.PInterfaceBravo(db);
          } 
        } else if (m.KInterfaceFoxtrot().equals("userPassword")) {
          String str1 = m.e();
          aM aM = paramR.PInterfaceCharlie(str1);
          if (aM != null && aM.z() >= 4) {
            be.z(str1);
            paramR.PInterfaceCharlie(true);
          } else {
            PInterfaceBravo(m, "Invalid value for userPassword Parameter. Must be the name of PInterfaceAlpha defined U32 Constant. Invalid Value: " + str1);
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
      Iterator<bi> iterator = paramR.o();
      while (iterator.hasNext())
        paramR.PInterfaceAlpha(((bi)iterator.next()).aL(), arrayOfString); 
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
    dm dm = null;
    de de = null;
    M m = null;
    String str = null;
    for (byte PInterfaceBravo = 0; PInterfaceBravo < arrayList.size(); PInterfaceBravo++) {
      m = arrayList.get(PInterfaceBravo);
      str = m.PInterfaceBravo();
      try {
        if (str.startsWith("veAnalyzeMap")) {
          String[] arrayOfString = j(q(str));
          dm = new dm();
          dm = PInterfaceAlpha(paramR, dm, arrayOfString);
          paramR.PInterfaceAlpha(dm);
          de = null;
        } else {
          de de1;
          if (str.startsWith("trimAnalyzeMap")) {
            String[] arrayOfString = j(q(str));
            de = new de();
            de = (de)PInterfaceAlpha(paramR, (dm)de, arrayOfString);
            paramR.PInterfaceAlpha(de);
            de1 = de;
          } else if (str.startsWith("trimTable")) {
            if (de == null) {
              PInterfaceBravo(m, "Found trimTable, but trimAnalyzeMap must be defined 1st.");
            } else {
              df df = KInterfaceHotel(paramR, m);
              de.PInterfaceAlpha(df);
            } 
          } else if (str.startsWith("filter")) {
            aW aW = KInterfaceIndia(paramR, m);
            de1.PInterfaceAlpha(aW);
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
    dp dp = null;
    M m = null;
    String str = null;
    for (byte PInterfaceBravo = 0; PInterfaceBravo < arrayList.size(); PInterfaceBravo++) {
      m = arrayList.get(PInterfaceBravo);
      str = m.PInterfaceBravo();
      try {
        if (str.startsWith("wueAnalyzeMap")) {
          String[] arrayOfString = j(q(str));
          dp = PInterfaceAlpha(paramR, arrayOfString);
          paramR.PInterfaceAlpha(dp);
        } else if (str.startsWith("filter")) {
          aW aW = KInterfaceIndia(paramR, m);
          dp.PInterfaceAlpha(aW);
        } else if (str.startsWith("option")) {
          String str1 = m.e();
          try {
            dp.k(str1);
          } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
            PInterfaceBravo(m, ExceptionPrintstacktrace.getMessage());
          } 
        } else if (str.startsWith("lambdaTargetTables")) {
          String[] arrayOfString = j(q(str));
          for (byte b1 = 0; b1 < arrayOfString.length; b1++)
            dp.j(arrayOfString[b1]); 
        } else if (str.startsWith("wuePercentOffset")) {
          float KInterfaceFoxtrot = Float.parseFloat(m.e());
          dp.PInterfaceAlpha(KInterfaceFoxtrot);
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
  
  private df KInterfaceHotel(R paramR, M paramM) {
    df df = new df();
    String[] arrayOfString = j(paramM.e());
    if (arrayOfString.length < 3) {
      PInterfaceAlpha(paramM, "trimTable requires 3 parameters: trimTable = tableName,  label, afrChannel, egoCorr, enableCondition(optional), or trimTable = tableName, label, egoSensorIndexEpression,  enableCondition");
    } else {
      df.PInterfaceAlpha(arrayOfString[0]);
      df.e(KInterfaceFoxtrot(arrayOfString[1]));
      if (arrayOfString[2].trim().startsWith("{")) {
        String str = arrayOfString[2];
        str = X.PInterfaceBravo(str, "{", "");
        str = X.PInterfaceBravo(str, "}", "");
        df.KInterfaceFoxtrot(str);
        if (arrayOfString.length > 3) {
          String str1 = arrayOfString[3];
          str1 = X.PInterfaceBravo(str1, "{", "");
          str1 = X.PInterfaceBravo(str1, "}", "");
          df.d(str1);
        } 
      } else {
        df.PInterfaceBravo(arrayOfString[2]);
        df.PInterfaceCharlie(arrayOfString[3]);
        if (paramR.ExceptionPrintstacktrace(df.PInterfaceCharlie()) == null)
          PInterfaceBravo(paramM, "Trim Table lambda/afr channel " + df.PInterfaceCharlie() + " not found!"); 
        if (paramR.ExceptionPrintstacktrace(df.d()) == null)
          PInterfaceBravo(paramM, "Trim Table EGO Correction channel " + df.d() + " not found!"); 
        if (arrayOfString.length > 4) {
          String str = arrayOfString[4];
          str = X.PInterfaceBravo(str, "{", "");
          str = X.PInterfaceBravo(str, "}", "");
          df.d(str);
        } 
      } 
    } 
    return df;
  }
  
  private aW KInterfaceIndia(R paramR, M paramM) {
    String str = paramM.PInterfaceBravo();
    String[] arrayOfString = j(q(str));
    aW aW = new aW();
    if ("std_Expression".equals(arrayOfString[0])) {
      aW.PInterfaceAlpha(256);
      aW.v(arrayOfString[0]);
      aW.d(X.PInterfaceBravo(arrayOfString[1], "\"", ""));
      String str1 = X.PInterfaceBravo(arrayOfString[2], "{", "");
      str1 = X.PInterfaceBravo(str1, "}", "");
      aW.e(str1);
      aW.PInterfaceAlpha(Boolean.parseBoolean(arrayOfString[3]));
      PInterfaceAlpha(paramR, paramM, str1, false);
      return aW;
    } 
    if (aW.PInterfaceCharlie(arrayOfString[0])) {
      aW.PInterfaceAlpha(256);
      aW.v(arrayOfString[0]);
      return aW;
    } 
    aW.v(arrayOfString[0]);
    aW.d(X.PInterfaceBravo(arrayOfString[1], "\"", ""));
    aW.PInterfaceAlpha(arrayOfString[2]);
    aW.PInterfaceBravo(arrayOfString[3]);
    try {
      dj dj = dk.PInterfaceAlpha((aI)paramR, arrayOfString[4]);
      aW.PInterfaceAlpha(dj);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      PInterfaceBravo(paramM, "Failed to parse qualifying value or expression.");
    } 
    aW.PInterfaceAlpha(Boolean.parseBoolean(arrayOfString[5]));
    return aW;
  }
  
  private dm PInterfaceAlpha(R paramR, dm paramdm, String[] paramArrayOfString) {
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
    be be1 = (be)paramR.e().PInterfaceCharlie(paramdm.PInterfaceBravo());
    if (be1 == null)
      throw new ExceptionPrintstacktrace("Error loading VeAnalyzeMap, the table " + paramdm.PInterfaceBravo() + " not found in current configuration. Was it loaded yet?"); 
    be be2 = (be)paramR.e().PInterfaceCharlie(paramdm.PInterfaceCharlie());
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
  
  private dp PInterfaceAlpha(R paramR, String[] paramArrayOfString) {
    dp dp = new dp();
    dp.PInterfaceCharlie(paramArrayOfString[0]);
    dp.ExceptionPrintstacktrace(paramArrayOfString[1]);
    dp.KInterfaceFoxtrot(paramArrayOfString[2]);
    dp.o(paramArrayOfString[2]);
    if (paramArrayOfString.length > 3) {
      dp.d(paramArrayOfString[3]);
    } else {
      throw new ExceptionPrintstacktrace("Error loading VeAnalyzeMap for " + dp.PInterfaceCharlie() + " There is no lambdaChannel defined.");
    } 
    if (paramArrayOfString.length > 4) {
      dp.e(paramArrayOfString[4]);
    } else {
      throw new ExceptionPrintstacktrace("Error loading VeAnalyzeMap for " + dp.PInterfaceCharlie() + " There is no Coolant Temp Channel defined.");
    } 
    if (paramArrayOfString.length > 5) {
      dp.m(paramArrayOfString[5]);
    } else {
      throw new ExceptionPrintstacktrace("Error loading VeAnalyzeMap for " + dp.PInterfaceCharlie() + " There is no Warmup Enrichment Channel defined.");
    } 
    if (paramArrayOfString.length > 6)
      dp.KInterfaceHotel(paramArrayOfString[6]); 
    if (paramArrayOfString.length > 7) {
      String str = X.PInterfaceBravo(paramArrayOfString[7], "{", "");
      str = X.PInterfaceBravo(str, "}", "");
      dp.KInterfaceIndia(str);
    } 
    bm bm = (bm)paramR.e().PInterfaceCharlie(dp.PInterfaceCharlie());
    if (bm == null)
      throw new ExceptionPrintstacktrace("Error loading WueAnalyzeMap, the CurveGraph " + dp.PInterfaceCharlie() + " not found in current configuration. Was it loaded yet?"); 
    be be = (be)paramR.e().PInterfaceCharlie(dp.KInterfaceFoxtrot());
    if (be == null && !dp.KInterfaceFoxtrot().endsWith("afrTSCustom"))
      throw new ExceptionPrintstacktrace("Error loading WueAnalyzeMap, the Curve Graph " + dp.PInterfaceCharlie() + " was defined as the Lambda Target Table, but not found in current configuration. Was it loaded yet?"); 
    if (!dp.KInterfaceFoxtrot().endsWith("afrTSCustom")) {
      if (be.d() != null)
        dp.p(be.d()); 
      if (be.KInterfaceFoxtrot() != null)
        dp.q(be.KInterfaceFoxtrot()); 
    } 
    dp.PInterfaceAlpha(bm.PInterfaceBravo(0));
    dp.PInterfaceBravo(bm.d(0));
    if (bm.d() < 2)
      throw new ExceptionPrintstacktrace("Error loading WueAnalyzeMap, the Curve Graph " + dp.PInterfaceCharlie() + " does not have PInterfaceAlpha wue Analyze working array defined as PInterfaceAlpha second curve."); 
    dp.n(bm.PInterfaceBravo(1));
    dp.e(bm.l());
    return dp;
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
          ak ak = PInterfaceAlpha(m, paramR);
          ak.PInterfaceAlpha(false);
          paramR.PInterfaceAlpha(ak);
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
          dj dj = dk.PInterfaceAlpha((aI)paramR, arrayOfString[1]);
          KInterfaceFoxtrot KInterfaceFoxtrot = new KInterfaceFoxtrot(paramR, KInterfaceIndia, dj);
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
    aM aM = null;
    for (M m : PInterfaceAlpha(paramJ, paramR, "Constants")) {
      try {
        if (m.KInterfaceFoxtrot().equals("page")) {
          KInterfaceIndia = X.ExceptionPrintstacktrace(m.e()) - 1;
          aM = null;
          continue;
        } 
        if (!F.PInterfaceAlpha(m.KInterfaceFoxtrot())) {
          if (KInterfaceIndia >= 0) {
            aM aM1 = PInterfaceAlpha(paramR, m, KInterfaceIndia, aM);
            aM1.e(paramR.O().I());
            paramR.PInterfaceAlpha(aM1);
            aM = aM1;
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
        aM aM = l(paramR, m);
        paramR.PInterfaceAlpha(aM);
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
    cd cd = null;
    cf cf = null;
    for (M m : PInterfaceAlpha(paramJ, paramR, "LoggerDefinition")) {
      try {
        String str = m.KInterfaceFoxtrot();
        if (str.equals("loggerDef")) {
          if (cd != null && cd.n().equals("UDP_Stream") && cd.o() <= 0)
            PInterfaceAlpha(m, cd.ExceptionPrintstacktrace() + " is defineds as ProcessorType " + "UDP_Stream" + ", but no slave port has been defined."); 
          cd = new cd();
          String[] arrayOfString = j(m.e());
          String str1 = KInterfaceFoxtrot(arrayOfString[1]);
          cd.PInterfaceCharlie(str1);
          cd.PInterfaceAlpha(arrayOfString[2]);
          paramR.PInterfaceAlpha(cd);
          continue;
        } 
        if (str.equals("dataReadCommand")) {
          String str1 = KInterfaceFoxtrot(m.e());
          cd.d(str1);
          continue;
        } 
        if (str.equals("startCommand")) {
          String str1 = KInterfaceFoxtrot(m.e());
          cd.e(str1);
          continue;
        } 
        if (str.equals("stopCommand")) {
          String str1 = KInterfaceFoxtrot(m.e());
          cd.KInterfaceFoxtrot(str1);
          continue;
        } 
        if (str.equals("dataLength")) {
          cd.PInterfaceCharlie(X.ExceptionPrintstacktrace(m.e()));
          continue;
        } 
        if (str.equals("continuousRead")) {
          String str1 = m.e();
          cd.PInterfaceAlpha(Boolean.parseBoolean(str1));
          continue;
        } 
        if (str.equals("dataReadyCondition")) {
          String str1 = X.PInterfaceBravo(m.e(), "{", "");
          str1 = X.PInterfaceBravo(str1, "}", "");
          cd.PInterfaceBravo(str1);
          continue;
        } 
        if (str.equals("dataReadTimeout")) {
          int KInterfaceIndia = X.ExceptionPrintstacktrace(m.e());
          cd.PInterfaceAlpha(KInterfaceIndia);
          continue;
        } 
        if (str.equals("dataLength")) {
          int KInterfaceIndia = X.ExceptionPrintstacktrace(m.e());
          continue;
        } 
        if (str.equals("logProcessorType")) {
          cd.ExceptionPrintstacktrace(m.e());
          continue;
        } 
        if (str.equals("slavePort")) {
          int KInterfaceIndia = X.ExceptionPrintstacktrace(m.e());
          cd.d(KInterfaceIndia);
          continue;
        } 
        if (str.equals("recordFieldGenerator")) {
          String[] arrayOfString = j(m.e());
          if (arrayOfString.length > 1) {
            if (arrayOfString[0].equals("generateFromOutpcOffsets")) {
              ch ch = new ch();
              ch.PInterfaceAlpha(paramR);
              if (arrayOfString.length > 1) {
                ch.PInterfaceAlpha(arrayOfString[1]);
              } else {
                PInterfaceBravo(m, "1D Array Constant containing Outpc offsets required.");
              } 
              cd.PInterfaceAlpha((cg)ch);
            } 
            continue;
          } 
          PInterfaceBravo(m, "Field Generator type required.");
          continue;
        } 
        if (str.equals("recordDef")) {
          cf = new cf();
          String[] arrayOfString = j(m.e());
          cf.e(X.ExceptionPrintstacktrace(arrayOfString[0]));
          cf.KInterfaceFoxtrot(X.ExceptionPrintstacktrace(arrayOfString[1]));
          cf.d(X.ExceptionPrintstacktrace(arrayOfString[2]));
          cd.PInterfaceAlpha(cf);
          continue;
        } 
        if (str.equals("recordField")) {
          ce ce = new ce();
          String[] arrayOfString = j(m.e());
          ce.PInterfaceBravo(arrayOfString[0]);
          String str1 = arrayOfString[1];
          db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(str1, "\"", ""));
          ce.PInterfaceAlpha(db);
          int KInterfaceIndia = X.ExceptionPrintstacktrace(arrayOfString[2]);
          int j = X.ExceptionPrintstacktrace(arrayOfString[3]);
          ce.PInterfaceAlpha(j, KInterfaceIndia);
          dj dj = dk.PInterfaceAlpha((aI)paramR, arrayOfString[4]);
          ce.PInterfaceAlpha(dj);
          byte PInterfaceBravo = 5;
          if (!arrayOfString[PInterfaceBravo].startsWith("\"")) {
            dj dj1 = dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]);
            ce.PInterfaceBravo(dj1);
          } 
          String str2 = KInterfaceFoxtrot(arrayOfString[PInterfaceBravo++]);
          ce.PInterfaceCharlie(str2);
          if (arrayOfString.length > PInterfaceBravo) {
            String str3 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
            str3 = X.PInterfaceBravo(str3, "}", "");
            ce.e(str3);
          } 
          if (arrayOfString.length > PInterfaceBravo && arrayOfString[PInterfaceBravo++].equals("hidden"))
            ce.PInterfaceAlpha(true); 
          cf.PInterfaceAlpha(ce);
          continue;
        } 
        if (str.equals("headerField")) {
          ce ce = new ce();
          String[] arrayOfString = j(m.e());
          ce.PInterfaceBravo(arrayOfString[0]);
          String str1 = KInterfaceFoxtrot(arrayOfString[1]);
          db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(str1, "\"", ""));
          ce.PInterfaceAlpha(db);
          int KInterfaceIndia = X.ExceptionPrintstacktrace(arrayOfString[2]);
          int j = X.ExceptionPrintstacktrace(arrayOfString[3]);
          ce.PInterfaceAlpha(j, KInterfaceIndia);
          dj dj = dk.PInterfaceAlpha((aI)paramR, arrayOfString[4]);
          ce.PInterfaceAlpha(dj);
          byte PInterfaceBravo = 5;
          if (!arrayOfString[PInterfaceBravo].startsWith("\"")) {
            dj dj1 = dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]);
            ce.PInterfaceBravo(dj1);
          } 
          String str2 = KInterfaceFoxtrot(arrayOfString[PInterfaceBravo++]);
          ce.PInterfaceCharlie(str2);
          if (arrayOfString.length > PInterfaceBravo) {
            String str3 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "{", "");
            str3 = X.PInterfaceBravo(str3, "}", "");
            ce.e(str3);
          } 
          if (arrayOfString.length > PInterfaceBravo && arrayOfString[PInterfaceBravo++].equals("hidden"))
            ce.PInterfaceAlpha(true); 
          cf.PInterfaceCharlie(ce);
          continue;
        } 
        if (str.equals("calcField")) {
          cc cc = new cc();
          String[] arrayOfString = j(m.e());
          cc.PInterfaceBravo(arrayOfString[0]);
          db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[1], "\"", ""));
          cc.PInterfaceAlpha(db);
          String str1 = KInterfaceFoxtrot(arrayOfString[2]);
          cc.PInterfaceCharlie(str1);
          String str2 = X.PInterfaceBravo(arrayOfString[3], "{", "");
          str2 = X.PInterfaceBravo(str2, "}", "");
          cc.PInterfaceAlpha(str2);
          if (arrayOfString.length > 4 && arrayOfString[4].equals("hidden"))
            cc.PInterfaceAlpha(true); 
          cf.PInterfaceAlpha(cc);
          continue;
        } 
        if (str.equals("stdLogger")) {
          paramR.l(m.e());
          continue;
        } 
        if (str.equals("overlaidDatasetCount")) {
          cd.e(Integer.parseInt(m.e()));
          continue;
        } 
        if (str.equals("defaultXAxis")) {
          cd.KInterfaceIndia(m.e());
          continue;
        } 
        if (str.equals("verticalMarker")) {
          String[] arrayOfString = j(m.e());
          String str1 = KInterfaceFoxtrot(arrayOfString[0]);
          String str2 = KInterfaceFoxtrot(arrayOfString[1]);
          String str3 = KInterfaceFoxtrot(arrayOfString[2]);
          double d = Double.parseDouble(arrayOfString[3]);
          ci ci = new ci(str1, str2, str3, d);
          cd.PInterfaceAlpha(ci);
          continue;
        } 
        if (str.equals("stopOnExit")) {
          cd.PInterfaceBravo(Boolean.parseBoolean(m.e().trim()));
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
          dj dj = dk.PInterfaceAlpha((aI)paramR, m.e());
          paramR.O().PInterfaceAlpha(dj);
          continue;
        } 
        if (str.equals("sdTurboActive")) {
          dj dj = dk.PInterfaceAlpha((aI)paramR, m.e());
          paramR.O().PInterfaceBravo(dj);
          continue;
        } 
        if (str.equals("fullTimeTurboEnabled")) {
          dj dj = dk.PInterfaceAlpha((aI)paramR, m.e());
          paramR.O().PInterfaceCharlie(dj);
          continue;
        } 
        if (str.equals("runtimeTurboActive")) {
          dj dj = dk.PInterfaceAlpha((aI)paramR, m.e());
          paramR.O().d(dj);
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
        bI bI = PInterfaceBravo(m);
        paramR.PInterfaceAlpha(true);
        if (bI.aJ() != null && bI.aJ().trim().length() > 0)
          PInterfaceAlpha(paramR, m, bI.aJ(), false); 
        if (str.equals("addTool")) {
          bv bv = paramR.e().PInterfaceCharlie(bI.PInterfaceAlpha());
          if (bv == null) {
            PInterfaceBravo(m, "Target UI component " + bI.PInterfaceAlpha() + " is not in the currently loaded configuration.\nI can not add tool " + bI.aL() + ", This line will be ignored.");
            continue;
          } 
          if (bI.aL().equals("veTableGenerator") || bI.aL().equals("afrTableGenerator") || bI.aL().equals("Calculator") || bI.aL().equals("TwoPointCalculator")) {
            bv.PInterfaceAlpha(bI);
            continue;
          } 
          PInterfaceBravo(m, "Tool " + bI.aL() + " is not supported by this version of application.\nI don't know how to add it, this line will be ignored.\nSupported Tools: veTableGenerator, afrTableGenerator, Calculator, TwoPointCalculator");
          continue;
        } 
        if (str.equals("removeTool")) {
          bv bv = paramR.e().PInterfaceCharlie(bI.PInterfaceAlpha());
          if (bv == null) {
            PInterfaceBravo(m, "Target UI component " + bI.PInterfaceAlpha() + " is not in the currently loaded configuration.\nI can not remove tool " + bI.aL() + ", This line will be ignored.");
            continue;
          } 
          if (bI.aL().equals("veTableGenerator") || bI.aL().equals("afrTableGenerator")) {
            bv.PInterfaceBravo(bI);
            continue;
          } 
          PInterfaceBravo(m, "Tool " + bI.aL() + " is not supported by this version of application.\nI don't know how to remove it, this line will be ignored.");
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
  
  private bI PInterfaceBravo(M paramM) {
    String[] arrayOfString = j(paramM.e());
    bI bI = new bI();
    bI.s(this.l);
    bI.v(arrayOfString[0]);
    String str = X.PInterfaceBravo(arrayOfString[1], "\"", "");
    bI.PInterfaceBravo(str);
    bI.PInterfaceAlpha(arrayOfString[2]);
    if (arrayOfString.length > 3) {
      String str1 = X.PInterfaceBravo(arrayOfString[2], "{", "");
      str1 = X.PInterfaceBravo(str1, "}", "");
      bI.u(str1);
    } 
    return bI;
  }
  
  private void s(R paramR, J paramJ) {
    F KInterfaceFoxtrot = (paramR.O() != null) ? paramR.O() : new F();
    KInterfaceFoxtrot.PInterfaceAlpha((aI)paramR);
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
  
  public void PInterfaceAlpha(R paramR, bE parambE, J paramJ) {
    aX aX = null;
    bG bG = null;
    bu bu = null;
    bn bn = null;
    ArrayList arrayList = PInterfaceAlpha(paramJ, paramR, "ReferenceTables");
    arrayList = PInterfaceAlpha(arrayList, paramR);
    for (M m : arrayList) {
      String str = m.PInterfaceBravo();
      try {
        if (str.startsWith("referenceTable")) {
          aX = new aX();
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          aX.v(arrayOfString[0].trim());
          if (arrayOfString.length > 1)
            aX.s(X.PInterfaceBravo(arrayOfString[1], "\"", "")); 
          parambE.PInterfaceAlpha((bv)aX);
          continue;
        } 
        if (str.startsWith("topicHelp")) {
          db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, q(str));
          aX.e(db);
          if (db.PInterfaceAlpha().startsWith("http:/") || db.PInterfaceAlpha().startsWith("file:/")) {
            aj aj = new aj();
            aj.PInterfaceAlpha(db);
            aj.PInterfaceBravo(db);
            if (aX.M() != null && aX.M().length() > 0) {
              aj.PInterfaceBravo(aX.M());
            } else {
              aj.PInterfaceBravo("Web Help");
            } 
            parambE.PInterfaceAlpha(aj);
          } 
          continue;
        } 
        if (str.startsWith("tableIdentifier")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          if (arrayOfString.length % 2 != 0)
            PInterfaceAlpha(m, "ReferenceTables::tableIdentifier has wrong number of parameters."); 
          for (byte PInterfaceBravo = 0; PInterfaceBravo + 1 < arrayOfString.length; PInterfaceBravo++) {
            aX.PInterfaceAlpha(arrayOfString[PInterfaceBravo], arrayOfString[PInterfaceBravo + 1]);
            PInterfaceBravo++;
          } 
          continue;
        } 
        if (str.startsWith("solutionsLabel")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          aX.PInterfaceBravo(X.PInterfaceBravo(arrayOfString[0], "\"", ""));
          continue;
        } 
        if (str.startsWith("tableStartOffset")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          aX.PInterfaceCharlie(X.ExceptionPrintstacktrace(arrayOfString[0]));
          continue;
        } 
        if (str.startsWith("writeCommand")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          aX.PInterfaceAlpha(KInterfaceFoxtrot(arrayOfString[0]));
          continue;
        } 
        if (str.startsWith("scale")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          aX.PInterfaceAlpha(Double.parseDouble(arrayOfString[0]));
          continue;
        } 
        if (str.startsWith("tableGenerator")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          byte PInterfaceBravo = 0;
          String str2 = arrayOfString[PInterfaceBravo++];
          if (str2.equals("thermGenerator")) {
            bG = new bG();
            bG.PInterfaceCharlie(str2);
            if (arrayOfString.length > PInterfaceBravo)
              bG.d(X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", "")); 
            aX.PInterfaceAlpha((bF)bG);
            continue;
          } 
          if (str2.equals("fileBrowseGenerator")) {
            bn = new bn();
            bn.PInterfaceCharlie(str2);
            if (arrayOfString.length > PInterfaceBravo)
              bn.d(X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", "")); 
            aX.PInterfaceAlpha((bF)bn);
            continue;
          } 
          if (str2.equals("linearGenerator")) {
            bu = new bu();
            bu.PInterfaceCharlie(str2);
            if (arrayOfString.length > PInterfaceBravo)
              bu.d(X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", "")); 
            if (arrayOfString.length > PInterfaceBravo)
              bu.PInterfaceAlpha(X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", "")); 
            if (arrayOfString.length > PInterfaceBravo)
              bu.PInterfaceBravo(X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", "")); 
            if (arrayOfString.length > PInterfaceBravo)
              bu.PInterfaceAlpha(Double.parseDouble(arrayOfString[PInterfaceBravo++])); 
            if (arrayOfString.length > PInterfaceBravo)
              bu.PInterfaceBravo(Double.parseDouble(arrayOfString[PInterfaceBravo++])); 
            if (arrayOfString.length > PInterfaceBravo)
              bu.PInterfaceCharlie(Double.parseDouble(arrayOfString[PInterfaceBravo++])); 
            if (arrayOfString.length > PInterfaceBravo)
              bu.d(Double.parseDouble(arrayOfString[PInterfaceBravo++])); 
            aX.PInterfaceAlpha((bF)bu);
          } 
          continue;
        } 
        if (str.startsWith("adcCount")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          aX.PInterfaceAlpha(X.ExceptionPrintstacktrace(arrayOfString[0]));
          continue;
        } 
        if (str.startsWith("bytesPerAdc")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          aX.PInterfaceBravo(X.ExceptionPrintstacktrace(arrayOfString[0]));
          continue;
        } 
        if (str.startsWith("tableLimits")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          aX.PInterfaceAlpha(arrayOfString[0], Double.parseDouble(arrayOfString[1]), Double.parseDouble(arrayOfString[2]), Double.parseDouble(arrayOfString[3]));
          continue;
        } 
        if (str.startsWith("thermOption")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          try {
            bH bH = new bH();
            byte PInterfaceBravo = 0;
            bH.PInterfaceAlpha(X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
            bH.PInterfaceAlpha(Double.parseDouble(arrayOfString[PInterfaceBravo++]));
            bH.PInterfaceBravo(Double.parseDouble(arrayOfString[PInterfaceBravo++]));
            bH.PInterfaceCharlie(Double.parseDouble(arrayOfString[PInterfaceBravo++]));
            bH.d(Double.parseDouble(arrayOfString[PInterfaceBravo++]));
            bH.e(Double.parseDouble(arrayOfString[PInterfaceBravo++]));
            bH.KInterfaceFoxtrot(Double.parseDouble(arrayOfString[PInterfaceBravo++]));
            bH.ExceptionPrintstacktrace(Double.parseDouble(arrayOfString[PInterfaceBravo++]));
            if (bG != null) {
              bG.PInterfaceAlpha(bH);
              continue;
            } 
            PInterfaceBravo(m, "thermOption defined before PInterfaceAlpha thermGenerator! The following line must be declared after PInterfaceAlpha thermGenerator.");
          } catch (Exception exception) {
            PInterfaceAlpha(m, "Invalid ini entry. thermOption must have the format:\nthermOption\t= name, resistor bias, tempPoint1(" + T.PInterfaceAlpha() + "C), resPoint1, tempPoint2, resPoint2, tempPoint3, resPoint3");
          } 
          continue;
        } 
        if (str.startsWith("solution")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          ba ba = new ba();
          ba.PInterfaceAlpha(X.PInterfaceBravo(arrayOfString[0], "\"", ""));
          String str2 = arrayOfString[1];
          str2 = X.PInterfaceBravo(str2, "{", "");
          str2 = X.PInterfaceBravo(str2, "}", "");
          ba.PInterfaceBravo(str2);
          aX.PInterfaceAlpha(ba);
        } 
      } catch (Exception exception) {
        PInterfaceAlpha(m, "Invalid Ini entry for reference table, Ignored.");
      } 
    } 
  }
  
  public void PInterfaceBravo(R paramR, bE parambE, J paramJ) {
    aS aS = null;
    ArrayList arrayList = PInterfaceAlpha(paramJ, paramR, "PortEditor");
    arrayList = PInterfaceAlpha(arrayList, paramR);
    for (M m : arrayList) {
      PInterfaceAlpha(m);
      String str = m.PInterfaceBravo();
      try {
        if (str.startsWith("portEditor")) {
          aS = new aS();
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          aS.v(arrayOfString[0].trim());
          if (arrayOfString.length > 1)
            aS.s(X.PInterfaceBravo(arrayOfString[1], "\"", "")); 
          parambE.PInterfaceAlpha((bv)aS);
          continue;
        } 
        if (str.startsWith("topicHelp")) {
          db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, q(str));
          aS.e(db);
          if (db.PInterfaceAlpha().startsWith("http:/") || db.PInterfaceAlpha().startsWith("file:/")) {
            aj aj = new aj();
            aj.PInterfaceAlpha(db);
            aj.PInterfaceBravo(db);
            if (aS.M() != null && aS.M().length() > 0) {
              aj.PInterfaceBravo(aS.M());
            } else {
              aj.PInterfaceBravo("Web Help");
            } 
            parambE.PInterfaceAlpha(aj);
          } 
          continue;
        } 
        if (str.startsWith("enabledPorts")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          if (arrayOfString.length < 2)
            PInterfaceAlpha(m, "PortEditor::enabledPorts requires at least 2 parameters."); 
          aS.PInterfaceCharlie(arrayOfString[0]);
          for (byte PInterfaceBravo = 1; PInterfaceBravo < arrayOfString.length; PInterfaceBravo++)
            aS.PInterfaceAlpha(arrayOfString[PInterfaceBravo]); 
          continue;
        } 
        if (str.startsWith("outputCanId")) {
          String str1 = q(str);
          aS.l(str1);
          continue;
        } 
        if (str.startsWith("outputCanId")) {
          String str1 = q(str);
          aS.l(str1);
          continue;
        } 
        if (str.startsWith("outputOffset")) {
          String str1 = q(str);
          aS.e(str1);
          continue;
        } 
        if (str.startsWith("outputName")) {
          String str1 = q(str);
          aS.n(str1);
          continue;
        } 
        if (str.startsWith("outputSize")) {
          String str1 = q(str);
          aS.d(str1);
          continue;
        } 
        if (str.startsWith("threshold")) {
          String str1 = q(str);
          aS.ExceptionPrintstacktrace(str1);
          continue;
        } 
        if (str.startsWith("hysteresis")) {
          String str1 = q(str);
          aS.KInterfaceHotel(str1);
          continue;
        } 
        if (str.startsWith("powerOnValue")) {
          String str1 = q(str);
          aS.a_(str1);
          continue;
        } 
        if (str.startsWith("triggerValue")) {
          String str1 = q(str);
          aS.j(str1);
          continue;
        } 
        if (str.startsWith("activateOption")) {
          String str1 = q(str);
          aS.m(str1);
          continue;
        } 
        if (str.startsWith("portActiveDelay")) {
          String str1 = q(str);
          aS.o(str1);
          continue;
        } 
        if (str.startsWith("portInactiveDelay")) {
          String str1 = q(str);
          aS.p(str1);
          continue;
        } 
        if (str.startsWith("portCustomAttributes")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          for (String str2 : arrayOfString) {
            str2 = str2.trim();
            if (!str2.isEmpty())
              aS.q(str2); 
          } 
          continue;
        } 
        if (str.startsWith("portCustomLabels")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          for (String str2 : arrayOfString) {
            str2 = KInterfaceFoxtrot(str2.trim());
            if (!str2.isEmpty())
              aS.r(str2); 
          } 
          continue;
        } 
        if (str.startsWith("operators")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          aS.KInterfaceFoxtrot(arrayOfString[0]);
          aM aM = paramR.PInterfaceCharlie(arrayOfString[0]);
          for (byte PInterfaceBravo = 1; PInterfaceBravo < arrayOfString.length; PInterfaceBravo++) {
            String str2 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo], "\"", "");
            if (str2.length() != 1)
              PInterfaceBravo(m, "Invalid operator in Port Editor."); 
            Character character = new Character(str2.charAt(0));
            aS.PInterfaceAlpha(character);
            aM.PInterfaceAlpha(character.charValue());
          } 
          continue;
        } 
        if (str.startsWith("conditionRelationship")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          aS.k(arrayOfString[0]);
          aM aM = paramR.PInterfaceCharlie(arrayOfString[0]);
          for (byte PInterfaceBravo = 1; PInterfaceBravo < arrayOfString.length; PInterfaceBravo++) {
            String str2 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo], "\"", "");
            if (str2.length() != 1)
              PInterfaceBravo(m, "Invalid conditionRelationship in Port Editor."); 
            Character character = new Character(str2.charAt(0));
            aS.PInterfaceBravo(character);
            aM.PInterfaceAlpha(character.charValue());
          } 
          continue;
        } 
        if (m.KInterfaceFoxtrot().equals("portEnabledCondition")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          if (arrayOfString.length != aS.s())
            PInterfaceBravo(m, "Number of Ports does not match number of portEnableCondition! " + aS.s() + " Ports, " + arrayOfString.length + " portEnabledConditions. Check your indexing"); 
          for (String str2 : arrayOfString) {
            str2 = X.PInterfaceBravo(str2, "{", "");
            str2 = X.PInterfaceBravo(str2, "}", "");
            PInterfaceAlpha(paramR, m, str2, false);
            aS.PInterfaceBravo(str2);
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
  
  private ah j(R paramR, M paramM) {
    String str1 = paramM.PInterfaceBravo();
    ah ah = new ah();
    ah.s(this.l);
    ah.v(p(str1));
    String str2 = q(str1);
    String[] arrayOfString = j(str2);
    try {
      byte PInterfaceBravo = 0;
      String str = arrayOfString[PInterfaceBravo++];
      ah.PInterfaceAlpha(str);
      db db1 = da.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
      ah.PInterfaceBravo(db1);
      db db2 = da.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
      ah.PInterfaceAlpha(db2);
      dj dj1 = dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]);
      ah.PInterfaceAlpha(dj1);
      dj dj2 = dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]);
      ah.PInterfaceBravo(dj2);
      if (arrayOfString.length > PInterfaceBravo) {
        PInterfaceAlpha(paramR, paramM, arrayOfString[PInterfaceBravo], "Invalid Low Critical Expression", false);
        ah.KInterfaceHotel(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]));
      } 
      if (arrayOfString.length > PInterfaceBravo) {
        PInterfaceAlpha(paramR, paramM, arrayOfString[PInterfaceBravo], "Invalid Low Warning Expression", false);
        ah.PInterfaceCharlie(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]));
      } 
      if (arrayOfString.length > PInterfaceBravo) {
        PInterfaceAlpha(paramR, paramM, arrayOfString[PInterfaceBravo], "Invalid High Warning Expression", false);
        ah.d(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]));
      } 
      if (arrayOfString.length > PInterfaceBravo) {
        PInterfaceAlpha(paramR, paramM, arrayOfString[PInterfaceBravo], "Invalid LHigh Critical Expression", false);
        ah.e(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]));
      } 
      if (arrayOfString.length > PInterfaceBravo) {
        PInterfaceAlpha(paramR, paramM, arrayOfString[PInterfaceBravo], "Invalid Value Digits Expression", false);
        ah.KInterfaceFoxtrot(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]));
      } 
      if (arrayOfString.length > PInterfaceBravo) {
        PInterfaceAlpha(paramR, paramM, arrayOfString[PInterfaceBravo], "Invalid Label Digits Expression", false);
        ah.ExceptionPrintstacktrace(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]));
      } 
      if (arrayOfString.length > PInterfaceBravo) {
        String str3 = arrayOfString[PInterfaceBravo++];
        str3 = X.PInterfaceBravo(str3, "{", "");
        str3 = X.PInterfaceBravo(str3, "}", "");
        ah.u(str3);
        PInterfaceAlpha(paramR, paramM, str3, "Invalid Enabled Expression", false);
      } 
      if (dj1 instanceof B && dj2 instanceof B && ah.PInterfaceAlpha() > ah.d()) {
        double d = ah.PInterfaceAlpha();
        ah.PInterfaceAlpha(ah.d());
        ah.PInterfaceBravo(d);
        ah.PInterfaceAlpha(true);
      } 
      if (ah.o() instanceof bR) {
        bR bR = (bR)ah.o();
        PInterfaceAlpha(paramR, paramM, bR.PInterfaceCharlie(), "Invalid Low Critical Expression", false);
      } 
      if (ah.KInterfaceFoxtrot() instanceof bR) {
        bR bR = (bR)ah.KInterfaceFoxtrot();
        PInterfaceAlpha(paramR, paramM, bR.PInterfaceCharlie(), "Invalid Low Warning Expression", false);
      } 
      if (ah.KInterfaceHotel() instanceof bR) {
        bR bR = (bR)ah.KInterfaceHotel();
        PInterfaceAlpha(paramR, paramM, bR.PInterfaceCharlie(), "Invalid High Critical Expression", false);
      } 
      if (ah.ExceptionPrintstacktrace() instanceof bR) {
        bR bR = (bR)ah.ExceptionPrintstacktrace();
        PInterfaceAlpha(paramR, paramM, bR.PInterfaceCharlie(), "Invalid high Warning Expression", false);
      } 
    } catch (Exception exception) {
      throw new ExceptionPrintstacktrace("Corrupt Gauge Entry :\n" + str1);
    } 
    return ah;
  }
  
  private k ExceptionPrintstacktrace(String paramString) {
    paramString = paramString.trim();
    return paramString.equals("white") ? k.PInterfaceAlpha : (paramString.equalsIgnoreCase("red") ? k.k : (paramString.equalsIgnoreCase("black") ? k.KInterfaceIndia : (paramString.equalsIgnoreCase("green") ? k.s : (paramString.equalsIgnoreCase("cyan") ? k.w : (paramString.equalsIgnoreCase("blue") ? k.y : (paramString.equalsIgnoreCase("grey") ? k.e : (paramString.equalsIgnoreCase("gray") ? k.e : (paramString.equalsIgnoreCase("darkGray") ? k.ExceptionPrintstacktrace : (paramString.equalsIgnoreCase("lightGray") ? k.PInterfaceCharlie : (paramString.equalsIgnoreCase("darkGrey") ? k.ExceptionPrintstacktrace : (paramString.equalsIgnoreCase("lightGrey") ? k.PInterfaceCharlie : (paramString.equalsIgnoreCase("yellow") ? k.q : (paramString.equalsIgnoreCase("transparent") ? k.A : (paramString.equalsIgnoreCase("magenta") ? k.v : k.l))))))))))))));
  }
  
  private ak PInterfaceAlpha(M paramM, R paramR) {
    ak ak = new ak();
    ak.s(this.l);
    String str = paramM.e();
    String[] arrayOfString = j(str);
    try {
      byte PInterfaceBravo = 0;
      String str1 = arrayOfString[PInterfaceBravo++];
      str1 = X.PInterfaceBravo(str1, "{", "");
      str1 = X.PInterfaceBravo(str1, "}", "");
      db db1 = da.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
      ak.PInterfaceBravo(db1);
      db db2 = da.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
      ak.PInterfaceAlpha(db2);
      ak.v(KInterfaceIndia(ak.PInterfaceBravo()));
      if (arrayOfString.length > PInterfaceBravo)
        ak.PInterfaceBravo(ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++])); 
      if (arrayOfString.length > PInterfaceBravo)
        ak.d(ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++])); 
      if (arrayOfString.length > PInterfaceBravo)
        ak.PInterfaceAlpha(ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++])); 
      if (arrayOfString.length > PInterfaceBravo)
        ak.PInterfaceCharlie(ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++])); 
      aH aH = new aH(paramR.PInterfaceCharlie());
      aH.v(ak.aL() + "OC");
      aH.e(str1);
      aH.PInterfaceAlpha("formula");
      aH.PInterfaceCharlie(dk.PInterfaceAlpha(0.0D));
      PInterfaceAlpha(paramR, paramM, str1, "Invalid Indicator Expression: ", false);
      paramR.PInterfaceAlpha(aH);
      if (paramR.ExceptionPrintstacktrace(str1.trim()) != null) {
        ak.PInterfaceAlpha(str1.trim());
      } else {
        String str2 = KInterfaceHotel(str1);
        if (str2.length() > 1 && !I.PInterfaceAlpha(str2.substring(0, 1))) {
          aH = new aH(paramR.PInterfaceCharlie());
          aH.v(str2 + "_OC");
          aH.e(str1);
          aH.PInterfaceAlpha("formula");
          PInterfaceAlpha(paramR, paramM, str1, "Invalid Indicator Expression: ", false);
          paramR.PInterfaceAlpha(aH);
          ak.PInterfaceAlpha(aH.aL());
        } 
      } 
    } catch (Exception exception) {
      PInterfaceAlpha(paramM, "Corrupt Indicator Entry");
    } 
    return ak;
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
  
  private ac k(R paramR, M paramM) {
    ac ac1 = new ac();
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
          aH aH = new aH(paramR.PInterfaceCharlie());
          aH.PInterfaceAlpha("formula");
          aH.e("AppEvent.dataLogTime");
          aH.v(str3);
          aH.PInterfaceCharlie("s");
          paramR.PInterfaceAlpha(aH);
        } 
      } 
      ac1.PInterfaceBravo(str3);
      String str4 = X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", "");
      db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, str4);
      if (db instanceof PInterfaceCharlie) {
        String str = db.PInterfaceAlpha();
        if (str.length() > 0 && (str.getBytes()[0] == 42 || str.getBytes()[0] == 37 || str.getBytes()[0] == 47 || str.getBytes()[0] == 94 || str.getBytes()[0] == 33 || str.getBytes()[0] == 38 || str.getBytes()[0] == 43 || str.getBytes()[0] == 126 || str.getBytes()[0] == 61 || str.getBytes()[0] == 126 || str.getBytes()[0] == 45)) {
          PInterfaceAlpha(paramM, "Log Field units cannot start with special / mathematical characters.");
          str = PInterfaceBravo(str);
          ((PInterfaceCharlie)db).PInterfaceAlpha(str);
        } 
      } 
      ac1.PInterfaceAlpha(db);
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
          ac1.PInterfaceAlpha((dj)new bR((aI)paramR, str5));
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
  
  private aH PInterfaceAlpha(M paramM, R paramR, int paramInt1, int paramInt2) {
    aH aH = new aH(paramR.PInterfaceCharlie());
    aH.s(this.l);
    String str1 = paramM.PInterfaceBravo();
    aH.v(p(str1));
    boolean bool = (paramR.O() != null && paramR.O().al().equals("XCP")) ? true : false;
    String str2 = q(str1);
    String[] arrayOfString = j(str2);
    byte PInterfaceBravo = 0;
    try {
      if (str2.startsWith("scalar") || str2.startsWith("dotScalar")) {
        aH.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
        aH.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
        String str = arrayOfString[PInterfaceBravo++];
        if (bool) {
          long l = (paramR.O().af() + X.ExceptionPrintstacktrace(str));
          aH.PInterfaceAlpha(l);
          str = "nextOffset";
        } 
        if (str.equals("nextOffset")) {
          aH.PInterfaceAlpha(paramInt1);
        } else if (str.equals("lastOffset")) {
          aH.PInterfaceAlpha(paramInt2);
        } else {
          int KInterfaceIndia = X.ExceptionPrintstacktrace(str);
          if (KInterfaceIndia < paramInt1);
          aH.PInterfaceAlpha(KInterfaceIndia);
        } 
        if (arrayOfString.length > PInterfaceBravo) {
          if (arrayOfString.length > PInterfaceBravo) {
            db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
            aH.PInterfaceAlpha(db);
          } 
          aH.PInterfaceAlpha(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]));
          if (str2.startsWith("dotScalar")) {
            aH.PInterfaceCharlie(X.ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++]));
          } else {
            aH.PInterfaceBravo(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]));
          } 
        } 
        while (arrayOfString.length > PInterfaceBravo) {
          String str3 = arrayOfString[PInterfaceBravo++];
          if (str3.equals("hidden")) {
            aH.PInterfaceCharlie(dk.PInterfaceAlpha(0.0D));
            continue;
          } 
          if (str3.startsWith("{")) {
            aH.PInterfaceCharlie(dk.PInterfaceAlpha((aI)paramR, str3));
            continue;
          } 
          if (str3.equals("persistValue"))
            continue; 
          PInterfaceBravo(paramM, "Unknown OutputChannel visible condition or flag");
        } 
      } else if (arrayOfString.length > 0 && arrayOfString[0].equals("bits")) {
        aH.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
        aH.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
        String str3 = arrayOfString[PInterfaceBravo++];
        if (bool) {
          long l = (paramR.O().af() + X.ExceptionPrintstacktrace(str3));
          aH.PInterfaceAlpha(l);
          str3 = "nextOffset";
        } 
        if (str3.equals("nextOffset")) {
          aH.PInterfaceAlpha(paramInt1);
        } else if (str3.equals("lastOffset")) {
          aH.PInterfaceAlpha(paramInt2);
        } else {
          int KInterfaceIndia = X.ExceptionPrintstacktrace(str3);
          if (KInterfaceIndia < paramInt1 - aH.l());
          aH.PInterfaceAlpha(KInterfaceIndia);
        } 
        String str4 = arrayOfString[PInterfaceBravo++];
        aH.d(m(str4));
        aH.e(n(str4));
        while (PInterfaceBravo < arrayOfString.length) {
          try {
            aH.d(X.PInterfaceBravo(arrayOfString[PInterfaceBravo], "\"", ""));
          } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
            PInterfaceBravo(paramM, ExceptionPrintstacktrace.getLocalizedMessage());
          } 
          PInterfaceBravo++;
        } 
      } else if (str2.startsWith("{")) {
        aH.PInterfaceAlpha("formula");
        String str = arrayOfString[PInterfaceBravo++];
        str = X.PInterfaceBravo(str, "{", "");
        str = X.PInterfaceBravo(str, "}", "");
        str = k(str);
        aH.e(str);
        if (arrayOfString.length > 1 && arrayOfString.length > PInterfaceBravo) {
          db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
          aH.PInterfaceAlpha(db);
        } 
        while (arrayOfString.length > PInterfaceBravo) {
          String str3 = arrayOfString[PInterfaceBravo++];
          if (str3.equals("hidden")) {
            aH.PInterfaceCharlie(dk.PInterfaceAlpha(0.0D));
            continue;
          } 
          if (str3.startsWith("{")) {
            aH.PInterfaceCharlie(dk.PInterfaceAlpha((aI)paramR, str3));
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
    return aH;
  }
  
  private bb PInterfaceAlpha(M paramM, R paramR, int paramInt1, int paramInt2, aI paramaI) {
    bb bb = new bb(paramaI.ac());
    String str1 = paramM.PInterfaceBravo();
    bb.v(p(str1));
    String str2 = q(str1);
    String[] arrayOfString = j(str2);
    byte PInterfaceBravo = 0;
    try {
      if (str2.startsWith("scalar")) {
        bb.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
        bb.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
        String str = arrayOfString[PInterfaceBravo++];
        if (str.equals("nextOffset")) {
          bb.PInterfaceAlpha(paramInt1);
        } else if (str.equals("lastOffset")) {
          bb.PInterfaceAlpha(paramInt2);
        } else {
          int KInterfaceIndia = X.ExceptionPrintstacktrace(str);
          if (KInterfaceIndia < paramInt1);
          bb.PInterfaceAlpha(KInterfaceIndia);
        } 
        if (arrayOfString.length > PInterfaceBravo) {
          if (arrayOfString.length > PInterfaceBravo) {
            db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
            bb.PInterfaceAlpha(db);
          } 
          bb.PInterfaceAlpha(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]));
          bb.PInterfaceBravo(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]));
        } 
        if (arrayOfString.length > PInterfaceBravo) {
          try {
            bb.KInterfaceFoxtrot(X.ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++]));
          } catch (NumberFormatException numberFormatException) {
            PInterfaceBravo(paramM, "Invalid DLRAM_AddPad value");
          } 
        } else {
          PInterfaceBravo(paramM, "Pad Address not optional.");
        } 
        if (arrayOfString.length > PInterfaceBravo)
          try {
            bb.PInterfaceBravo(X.ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++]));
          } catch (NumberFormatException numberFormatException) {
            PInterfaceBravo(paramM, "Invalid digits value");
          }  
        if (arrayOfString.length > PInterfaceBravo) {
          String str3 = arrayOfString[PInterfaceBravo++];
          if (str3.equals("hidden")) {
            bb.PInterfaceCharlie(dk.PInterfaceAlpha(0.0D));
          } else if (str3.startsWith("{")) {
            bb.PInterfaceCharlie(dk.PInterfaceAlpha((aI)paramR, str3));
          } else {
            PInterfaceBravo(paramM, "Unknown Replay visible condition or flag");
          } 
        } 
      } else if (str2.startsWith("dotScalar")) {
        bb.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
        bb.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
        String str = arrayOfString[PInterfaceBravo++];
        if (str.equals("nextOffset")) {
          bb.PInterfaceAlpha(paramInt1);
        } else if (str.equals("lastOffset")) {
          bb.PInterfaceAlpha(paramInt2);
        } else {
          int KInterfaceIndia = X.ExceptionPrintstacktrace(str);
          if (KInterfaceIndia < paramInt1);
          bb.PInterfaceAlpha(KInterfaceIndia);
        } 
        if (arrayOfString.length > PInterfaceBravo) {
          if (arrayOfString.length > PInterfaceBravo) {
            db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
            bb.PInterfaceAlpha(db);
          } 
          bb.PInterfaceAlpha(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]));
          if (arrayOfString.length > PInterfaceBravo) {
            try {
              bb.PInterfaceCharlie(X.ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++]));
            } catch (NumberFormatException numberFormatException) {
              PInterfaceBravo(paramM, "Invalid decimal bits value");
            } 
          } else {
            PInterfaceBravo(paramM, "Decimal bits is required for paramClass dotScalar");
          } 
        } 
        if (arrayOfString.length > PInterfaceBravo)
          try {
            bb.KInterfaceFoxtrot(X.ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++]));
          } catch (NumberFormatException numberFormatException) {
            PInterfaceBravo(paramM, "Invalid DLRAM_AddPad value");
          }  
        if (arrayOfString.length > PInterfaceBravo)
          try {
            bb.PInterfaceBravo(X.ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++]));
          } catch (NumberFormatException numberFormatException) {
            PInterfaceBravo(paramM, "Invalid digits value");
          }  
        while (arrayOfString.length > PInterfaceBravo) {
          String str3 = arrayOfString[PInterfaceBravo++];
          if (str3.equals("hidden")) {
            bb.PInterfaceCharlie(dk.PInterfaceAlpha(0.0D));
            continue;
          } 
          if (str3.startsWith("{")) {
            bb.PInterfaceCharlie(dk.PInterfaceAlpha((aI)paramR, str3));
            continue;
          } 
          PInterfaceBravo(paramM, "Unknown Replay visible condition or flag");
        } 
      } else if (arrayOfString.length > 0 && arrayOfString[0].equals("bits")) {
        bb.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
        bb.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
        String str3 = arrayOfString[PInterfaceBravo++];
        if (str3.equals("nextOffset")) {
          bb.PInterfaceAlpha(paramInt1);
        } else if (str3.equals("lastOffset")) {
          bb.PInterfaceAlpha(paramInt2);
        } else {
          int KInterfaceIndia = X.ExceptionPrintstacktrace(str3);
          if (KInterfaceIndia < paramInt1 - bb.l());
          bb.PInterfaceAlpha(KInterfaceIndia);
        } 
        String str4 = arrayOfString[PInterfaceBravo++];
        bb.d(m(str4));
        bb.e(n(str4));
        while (PInterfaceBravo < arrayOfString.length) {
          try {
            bb.d(X.PInterfaceBravo(arrayOfString[PInterfaceBravo], "\"", ""));
          } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
            PInterfaceBravo(paramM, ExceptionPrintstacktrace.getLocalizedMessage());
          } 
          PInterfaceBravo++;
        } 
      } else if (str2.startsWith("{")) {
        bb.PInterfaceAlpha("formula");
        String str = arrayOfString[PInterfaceBravo++];
        str = X.PInterfaceBravo(str, "{", "");
        str = X.PInterfaceBravo(str, "}", "");
        str = k(str);
        bb.e(str);
        if (arrayOfString.length > 1 && arrayOfString.length > PInterfaceBravo) {
          db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
          bb.PInterfaceAlpha(db);
        } 
        if (arrayOfString.length > 2) {
          String str3 = arrayOfString[PInterfaceBravo++];
          if (str3.equals("hidden")) {
            bb.PInterfaceCharlie(dk.PInterfaceAlpha(0.0D));
          } else if (str3.startsWith("{")) {
            bb.PInterfaceCharlie(dk.PInterfaceAlpha((aI)paramR, str3));
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
    return bb;
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
  
  private al PInterfaceAlpha(M paramM, aI paramaI, int paramInt1, int paramInt2) {
    al al = new al(paramaI.ac());
    al.s(this.l);
    String str = paramM.PInterfaceBravo();
    byte PInterfaceBravo = 0;
    try {
      String str1 = q(str);
      String[] arrayOfString = j(str1);
      al.v(X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
      String str2 = arrayOfString[PInterfaceBravo++];
      if (str2.equals("scalar")) {
        al.PInterfaceAlpha(str2);
        al.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
        String str3 = arrayOfString[PInterfaceBravo++];
        if (str3.equals("nextOffset")) {
          al.PInterfaceAlpha(paramInt1);
        } else if (str3.equals("lastOffset")) {
          al.PInterfaceAlpha(paramInt2);
        } else {
          int KInterfaceIndia = X.ExceptionPrintstacktrace(str3);
          al.PInterfaceAlpha(KInterfaceIndia);
        } 
        if (arrayOfString.length > PInterfaceBravo) {
          al.PInterfaceCharlie(arrayOfString[PInterfaceBravo++]);
          al.PInterfaceAlpha(Double.parseDouble(arrayOfString[PInterfaceBravo++]));
          al.PInterfaceBravo(Double.parseDouble(arrayOfString[PInterfaceBravo++]));
        } 
      } else if (str2.equals("bits")) {
        al.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
        al.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
        al.PInterfaceAlpha(X.ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++]));
        String str3 = arrayOfString[PInterfaceBravo++];
        al.d(m(str3));
        al.e(n(str3));
      } 
    } catch (Exception exception) {
      PInterfaceAlpha(paramM, "Malformed Internal Log Field entry.");
    } 
    return al;
  }
  
  private aM PInterfaceAlpha(R paramR, M paramM, int paramInt, aM paramaM) {
    aM aM1;
    String str1 = paramM.PInterfaceBravo();
    String str2 = p(str1);
    String str3 = q(str1);
    if (str3.startsWith("oddArray")) {
      aK aK = new aK();
    } else {
      aM1 = new aM();
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
            aM1.PInterfaceAlpha((bW)new cm(paramaM));
          } else {
            aM1.PInterfaceAlpha((bW)new bX(0));
          } 
        } else if (str5.equals("lastOffset")) {
          if (paramaM != null) {
            aM1.PInterfaceAlpha(paramaM.KInterfaceFoxtrot());
          } else {
            aM1.PInterfaceAlpha((bW)new bX(0));
          } 
        } else {
          int k = X.ExceptionPrintstacktrace(str5);
          aM1.PInterfaceAlpha((bW)new bX(k));
        } 
        str6 = arrayOfString[PInterfaceBravo++];
      } else {
        aM1.PInterfaceAlpha((bW)new bX(X.ExceptionPrintstacktrace(str5.substring(0, str5.indexOf("[")))));
        str6 = str5.substring(str5.indexOf("["));
      } 
      aM1.KInterfaceFoxtrot(m(str6));
      aM1.ExceptionPrintstacktrace(n(str6));
      aM1.PInterfaceCharlie(o(str6));
      if (arrayOfString.length > PInterfaceBravo && arrayOfString[PInterfaceBravo].trim().startsWith("$")) {
        String str7 = arrayOfString[PInterfaceBravo].trim().substring(1);
        String str8 = (String)this.e.get(str7);
        if (str8 == null || str8.isEmpty()) {
          PInterfaceBravo(paramM, "String List not found. " + str7 + " Must be defined in ini file.");
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
          PInterfaceBravo(paramM, "Invalid Option List. Expected formats are: \"Option1\", \"Option2\", etc OR: index=\"Option1\", index=\"Option2\", etc. index must be PInterfaceAlpha valid integer.");
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
          aM1.PInterfaceAlpha((bW)new cm(paramaM));
        } else {
          aM1.PInterfaceAlpha((bW)new bX(0));
        } 
      } else if (str.equals("lastOffset")) {
        if (paramaM != null) {
          aM1.PInterfaceAlpha(paramaM.KInterfaceFoxtrot());
        } else {
          aM1.PInterfaceAlpha((bW)new bX(0));
        } 
      } else {
        int KInterfaceIndia = X.ExceptionPrintstacktrace(str);
        aM1.PInterfaceAlpha((bW)new bX(KInterfaceIndia));
      } 
      A PInterfaceAlpha = PInterfaceAlpha(paramR, paramM, arrayOfString[PInterfaceBravo++]);
      aM1.PInterfaceAlpha(PInterfaceAlpha);
      if (arrayOfString.length > PInterfaceBravo) {
        db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
        aM1.PInterfaceAlpha(db);
      } 
      if (arrayOfString.length > PInterfaceBravo)
        aM1.PInterfaceAlpha(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++])); 
      if (arrayOfString.length > PInterfaceBravo)
        aM1.PInterfaceBravo(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++])); 
      if (arrayOfString.length > PInterfaceBravo)
        aM1.PInterfaceCharlie(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++])); 
      if (arrayOfString.length > PInterfaceBravo)
        aM1.d(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++])); 
      try {
        if (arrayOfString.length > PInterfaceBravo)
          aM1.e(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++])); 
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
          aM1.PInterfaceAlpha((bW)new cm(paramaM));
        } else {
          aM1.PInterfaceAlpha((bW)new bX(0));
        } 
      } else if (str.equals("lastOffset")) {
        if (paramaM != null) {
          aM1.PInterfaceAlpha(paramaM.KInterfaceFoxtrot());
        } else {
          aM1.PInterfaceAlpha((bW)new bX(0));
        } 
      } else {
        int KInterfaceIndia = X.ExceptionPrintstacktrace(str);
        aM1.PInterfaceAlpha((bW)new bX(KInterfaceIndia));
      } 
      if (arrayOfString.length > PInterfaceBravo) {
        db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
        aM1.PInterfaceAlpha(db);
        aM1.PInterfaceAlpha(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]));
        aM1.PInterfaceBravo(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]));
        if (arrayOfString.length > PInterfaceBravo + 2) {
          aM1.PInterfaceCharlie(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]));
          aM1.d(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]));
          aM1.e(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]));
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
          aM1.PInterfaceAlpha((bW)new cm(paramaM));
        } else {
          aM1.PInterfaceAlpha((bW)new bX(0));
        } 
      } else if (str.equals("lastOffset")) {
        if (paramaM != null) {
          aM1.PInterfaceAlpha(paramaM.KInterfaceFoxtrot());
        } else {
          aM1.PInterfaceAlpha((bW)new bX(0));
        } 
      } else {
        int KInterfaceIndia = X.ExceptionPrintstacktrace(str);
        aM1.PInterfaceAlpha((bW)new bX(KInterfaceIndia));
      } 
      aM1.PInterfaceAlpha(1, X.ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++]));
      if (arrayOfString.length > PInterfaceBravo) {
        String str4 = arrayOfString[PInterfaceBravo++];
        try {
          aM1.e(dk.PInterfaceAlpha((aI)paramR, str4));
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
  
  private aM l(R paramR, M paramM) {
    String str1 = paramM.PInterfaceBravo();
    ca ca = new ca();
    String str2 = p(str1);
    String str3 = q(str1);
    ca.v(str2);
    ca.PInterfaceCharlie(-1);
    ca.PInterfaceAlpha((bW)new bX(0));
    String[] arrayOfString = j(str3);
    byte PInterfaceBravo = 0;
    if (arrayOfString[0].equals(ca.d) || arrayOfString[0].equals(ca.e)) {
      if (arrayOfString.length < 2) {
        PInterfaceAlpha(paramM, "2 parameters required for paramClass: channelValueOnConnect or continuousChannelValue");
      } else {
        ca.PInterfaceAlpha(arrayOfString[0]);
        ca.ExceptionPrintstacktrace(arrayOfString[1]);
        ca.PInterfaceBravo("S32");
        cy.PInterfaceAlpha(paramR).PInterfaceAlpha(ca);
      } 
    } else if (str3.startsWith("bits")) {
      ca.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
      String str4 = arrayOfString[PInterfaceBravo++];
      ca.PInterfaceBravo(str4);
      String str5 = arrayOfString[PInterfaceBravo++];
      ca.KInterfaceFoxtrot(m(str5));
      ca.ExceptionPrintstacktrace(n(str5));
      ca.PInterfaceCharlie(o(str5));
      while (PInterfaceBravo < arrayOfString.length) {
        ca.d(arrayOfString[PInterfaceBravo]);
        PInterfaceBravo++;
      } 
    } else if (str3.startsWith("array")) {
      ca.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
      ca.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
      A PInterfaceAlpha = PInterfaceAlpha(paramR, paramM, arrayOfString[PInterfaceBravo++]);
      ca.PInterfaceAlpha(PInterfaceAlpha);
      if (arrayOfString.length > PInterfaceBravo) {
        db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
        ca.PInterfaceAlpha(db);
      } 
      if (arrayOfString.length > PInterfaceBravo)
        ca.PInterfaceAlpha(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++])); 
      if (arrayOfString.length > PInterfaceBravo)
        ca.PInterfaceBravo(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++])); 
      if (arrayOfString.length > PInterfaceBravo)
        ca.PInterfaceCharlie(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++])); 
      if (arrayOfString.length > PInterfaceBravo)
        ca.d(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++])); 
      if (arrayOfString.length > PInterfaceBravo)
        ca.e(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++])); 
      if (arrayOfString.length > PInterfaceBravo)
        while (PInterfaceBravo < arrayOfString.length) {
          if (arrayOfString[PInterfaceBravo].equals("noSizeMutation")) {
            ca.PInterfaceCharlie(false);
          } else if (arrayOfString[PInterfaceBravo].equals("noMsqSave") || arrayOfString[PInterfaceBravo].equals("noSaveToMsq")) {
            ca.PInterfaceBravo(false);
          } 
          PInterfaceBravo++;
        }  
    } else if (str3.startsWith("scalar")) {
      ca.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
      ca.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
      if (arrayOfString.length > PInterfaceBravo) {
        db db = da.PInterfaceAlpha().PInterfaceAlpha(paramR, X.PInterfaceBravo(arrayOfString[PInterfaceBravo++], "\"", ""));
        ca.PInterfaceAlpha(db);
        ca.PInterfaceAlpha(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]));
        ca.PInterfaceBravo(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]));
        if (arrayOfString.length > PInterfaceBravo + 2) {
          ca.PInterfaceCharlie(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]));
          ca.d(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]));
          ca.e(dk.PInterfaceAlpha((aI)paramR, arrayOfString[PInterfaceBravo++]));
          if (arrayOfString.length > PInterfaceBravo && (arrayOfString[PInterfaceBravo].equals("noLocalUpdate") || arrayOfString[PInterfaceBravo].equals("noSaveToMsq") || arrayOfString[PInterfaceBravo].equals("noMsqSave"))) {
            ca.PInterfaceBravo(false);
          } else if (arrayOfString.length > PInterfaceBravo) {
            PInterfaceBravo(paramM, "Unknown Constant Option: " + arrayOfString[PInterfaceBravo]);
          } 
          PInterfaceBravo++;
        } 
      } 
    } else if (str3.startsWith("string")) {
      ca.PInterfaceAlpha(arrayOfString[PInterfaceBravo++]);
      ca.PInterfaceBravo(arrayOfString[PInterfaceBravo++]);
      ca.PInterfaceAlpha(1, X.ExceptionPrintstacktrace(arrayOfString[PInterfaceBravo++]));
      if (arrayOfString.length > PInterfaceBravo) {
        String str = arrayOfString[PInterfaceBravo++];
        try {
          ca.e(dk.PInterfaceAlpha((aI)paramR, str));
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          PInterfaceBravo(paramM, "Invalid String parameter Option for columns: " + str);
        } 
      } 
      if (arrayOfString.length > PInterfaceBravo);
    } else {
      PInterfaceBravo(paramM, "Unknown paramClass for ini entry.");
    } 
    return (aM)ca;
  }
  
  private A PInterfaceAlpha(R paramR, M paramM, String paramString) {
    B b1;
    B b2;
    if (paramString.contains("{")) {
      String[] arrayOfString = l(paramString);
      if (arrayOfString.length == 2) {
        bR bR3 = new bR((aI)paramR, arrayOfString[0]);
        if ((bR3.PInterfaceBravo()).length > 1)
          PInterfaceBravo(paramM, "Columns Expression should have 1 variable for Table Widgets to offer resizing."); 
        bR bR4 = new bR((aI)paramR, arrayOfString[1]);
        if ((bR4.PInterfaceBravo()).length > 1)
          PInterfaceBravo(paramM, "Row Expression should have 1 variable for Table Widgets to offer resizing."); 
        bR bR1 = bR3;
        bR bR2 = bR4;
      } else if (arrayOfString.length == 1) {
        b1 = new B(1.0D);
        bR bR = new bR((aI)paramR, arrayOfString[0]);
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
    return new A((dj)b1, (dj)b2);
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
        paramR.e().PInterfaceAlpha((bv)KInterfaceIndia);
      } else if (paramString.equals("std_accel")) {
        PInterfaceAlpha PInterfaceAlpha = new PInterfaceAlpha(paramR, paramInt, true);
        paramR.e().PInterfaceAlpha((bv)PInterfaceAlpha);
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
            PInterfaceBravo(paramM, "#defines String List not found. " + str1 + " Must be defined in ini above usage point.");
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