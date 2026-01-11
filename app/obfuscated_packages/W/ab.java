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
import G.c;
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
import G.i;
import G.k;
import G.x;
import G.y;
import K.a;
import K.f;
import K.h;
import K.i;
import P.a;
import P.b;
import P.c;
import V.c;
import V.g;
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
  public static File a = new File("./inc");
  
  public static File b = null;
  
  public static File c = null;
  
  private boolean j = true;
  
  double d = 3.79D;
  
  private final K k = new ad(this);
  
  private boolean l = false;
  
  private boolean m = false;
  
  Map e = new HashMap<>();
  
  public static int f = 1;
  
  public static int g = 2;
  
  public static int h = 4;
  
  public static int i = 8;
  
  private static ac n = null;
  
  private static HashMap o = new HashMap<>();
  
  public ab() {
    D.d("Supported iniSpecVersion=" + this.d);
  }
  
  public R a(R paramR, String paramString) {
    return a(paramR, paramString, true);
  }
  
  public R a(R paramR, String paramString, boolean paramBoolean) {
    return a(paramR, paramString, paramBoolean, f);
  }
  
  public R a(R paramR, String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    return paramBoolean2 ? a(paramR, paramString, paramBoolean1, g) : a(paramR, paramString, paramBoolean1, f);
  }
  
  public R a(R paramR, String paramString, boolean paramBoolean, int paramInt) {
    long l = System.currentTimeMillis();
    aa aa = new aa();
    aa.a();
    J j = a(paramString);
    aa.b();
    String str1 = (paramString.indexOf(File.separator) != -1) ? paramString.substring(paramString.lastIndexOf(File.separator) + 1) : paramString;
    D.d("Read file " + str1 + ": " + aa.c() + "ms");
    aa.a();
    ArrayList arrayList = a(j, paramR);
    j.a(arrayList);
    aa.b();
    D.d("Filtered ini: " + aa.c() + "ms");
    String str2 = "";
    M m1 = j.a("TunerStudio", "iniSpecVersion");
    if (m1 != null) {
      double d = -1.0D;
      try {
        d = Double.parseDouble(m1.e());
      } catch (Exception exception) {
        a(m1, "Invalid iniSpecVersion, a numeric value is expected.");
      } 
      if (d > this.d) {
        a(m1, "ECU Definition File " + m1.g() + " requires a newer version of this application.\nRequired Specification: " + d + "\nSupported Specification: " + this.d + "\n\nPlease upgrade to a newer version.");
        throw new g("A newer version of this application is required to load ECU Definition File " + m1.g() + ".", 2);
      } 
    } 
    M m2 = j.a("TunerStudio", "iniVersion");
    if (m2 != null) {
      double d = 0.0D;
      try {
        d = Double.parseDouble(m2.e());
        D.d("iniVersion =" + d);
      } catch (Exception exception) {
        a(m1, "Invalid iniVersion, a numeric value is expected.");
      } 
    } else {
      D.d("No iniVersion defined");
    } 
    try {
      boolean bool = false;
      if (paramBoolean && (paramR.i() == null || paramR.i().equals(""))) {
        M m3 = j.a("MegaTune", "signature");
        M m4 = j.a("MegaTune", "signaturePrefix");
        if (m3 == null || m3.d())
          m3 = j.a("TunerStudio", "signature"); 
        if (m4 == null || m4.d())
          m4 = j.a("TunerStudio", "signaturePrefix"); 
        if (m3 == null || m3.d())
          a(m3, "firmware serial signature entry not found in ECU Definition."); 
        if (m4 != null && !m4.d())
          paramR.y(X.b(m4.e().trim(), "\"", "")); 
        String str = X.b(m3.e().trim(), "\"", "");
        paramR.e(str);
        D.c("ini signature: " + str);
        str2 = "Loading Controller Commands";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        aa.a();
        s(paramR, j);
        aa.b();
        str2 = "Loaded Controller Commands";
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms"); 
        str2 = "Initializing offline data store";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        aa.a();
        paramR.j();
        aa.b();
        str2 = "Initialized offline data store";
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms"); 
        paramR.h().a(paramR.O().e());
      } 
      if (A.i().b()) {
        aa.a();
        str2 = "Loading PcVariables";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        n(paramR, j);
        aa.b();
        str2 = "Loaded PcVariables";
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms"); 
        aa.a();
        str2 = "Loading Constants";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        m(paramR, j);
        aa.b();
        str2 = "Loaded Constants";
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms"); 
        aa.a();
        str2 = "Loading OutputChannels";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        e(paramR, j);
        aa.b();
        str2 = "Loaded OutputChannels";
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms"); 
        if (!j.b("Replay").isEmpty()) {
          aa.a();
          str2 = "Loading Replay Channels";
          if (bool)
            D.d("[" + str1 + "]" + str2); 
          c(paramR, j, "Replay");
          aa.b();
          str2 = "Loaded Replay Channels";
          if (bool)
            D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms"); 
        } 
        if (!j.b("ExtendedReplay").isEmpty()) {
          aa.a();
          str2 = "Loading ExtendedReplay Channels";
          if (bool)
            D.d("[" + str1 + "]" + str2); 
          c(paramR, j, "ExtendedReplay");
          aa.b();
          str2 = "Loaded ExtendedReplay Channels";
          if (bool)
            D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms"); 
        } 
      } 
      if ((paramInt & f) != 0 || (paramInt & h) != 0 || (paramInt & i) != 0) {
        aa.a();
        str2 = "Loading Tables";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        if (paramR.e() == null)
          paramR.a(new bE()); 
        j(paramR, j);
        aa.b();
        str2 = "Loaded Tables";
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms"); 
      } 
      aa.a();
      str2 = "Loading Gauge Definitions";
      if (bool)
        D.d("[" + str1 + "]" + str2); 
      f(paramR, j);
      aa.b();
      str2 = "Loaded Gauge Definitions";
      if (bool)
        D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms"); 
      aa.a();
      str2 = "Loading Custom ControllerCommands";
      if (bool)
        D.d("[" + str1 + "]" + str2); 
      b(paramR, j, "ControllerCommands");
      aa.b();
      str2 = "Loaded Custom ControllerCommands";
      if (bool)
        D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms"); 
      aa.a();
      str2 = "Loading PortEditor";
      if (bool)
        D.d("[" + str1 + "]" + str2); 
      if (paramR.e() == null)
        paramR.a(new bE()); 
      b(paramR, paramR.e(), j);
      aa.b();
      str2 = "Loaded PortEditor";
      if (bool)
        D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms"); 
      if ((paramInt & f) != 0 || (paramInt & i) != 0) {
        aa.a();
        str2 = "Loading UI Structure";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        d(paramR, j);
        aa.b();
        str2 = "Loaded UI Structure";
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms"); 
      } 
      aa.a();
      str2 = "Loading DataLog Fields";
      if (bool)
        D.d("[" + str1 + "]" + str2); 
      i(paramR, j);
      aa.b();
      str2 = "Loaded DataLog Fields";
      if (bool)
        D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms"); 
      aa.a();
      str2 = "Loading Front Page";
      if (bool)
        D.d("[" + str1 + "]" + str2); 
      k(paramR, j);
      aa.b();
      str2 = "Loaded Front Page";
      if (bool)
        D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms"); 
      aa.a();
      str2 = "Loading Verbiage Over-rides";
      if (bool)
        D.d("[" + str1 + "]" + str2); 
      a(paramR, j);
      aa.b();
      str2 = "Loaded Verbiage Over-rides";
      if (bool)
        D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms"); 
      aa.a();
      str2 = "Loading ConstantsExtensions";
      if (bool)
        D.d("[" + str1 + "]" + str2); 
      a(paramR, j, "ConstantsExtensions");
      aa.b();
      str2 = "Loaded ConstantsExtensions";
      if (bool)
        D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms"); 
      aa.a();
      str2 = "Loading [TurboBaud]";
      if (bool)
        D.d("[" + str1 + "]" + str2); 
      p(paramR, j);
      aa.b();
      str2 = "Loaded [TurboBaud]";
      if (bool)
        D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms"); 
      if ((paramInt & f) != 0) {
        aa.a();
        str2 = "Loading [EventTriggers]";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        l(paramR, j);
        aa.b();
        str2 = "Loaded [EventTriggers]";
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms"); 
      } 
      b(paramR);
      if ((paramInt & f) != 0) {
        aa.a();
        str2 = "Loading VE Analyze Maps";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        b(paramR, j);
        aa.b();
        str2 = "Loaded VE Analyze Maps";
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms"); 
        aa.a();
        str2 = "Loading WUE Analyze Maps";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        c(paramR, j);
        aa.b();
        str2 = "Loaded WUE Analyze Maps";
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms"); 
        aa.a();
        str2 = "Loading [Tools]";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        q(paramR, j);
        aa.b();
        str2 = "Loaded [Tools]";
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms"); 
        aa.a();
        str2 = "Loading ini [LoggerDefinition]";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        o(paramR, j);
        aa.b();
        str2 = "Loaded ini [LoggerDefinition]";
        if (bool)
          D.d(str2 + ": " + aa.c() + "ms"); 
        aa.a();
        str2 = "Validating ValueProvider expressions";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        a(paramR);
        aa.b();
        str2 = "Validated ValueProvider expressions";
        if (bool)
          D.d(str2 + ": " + aa.c() + "ms"); 
        aa.a();
        str2 = "Loading ini [SettingContextHelp]";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        r(paramR, j);
        str2 = "Loaded ini [SettingContextHelp]";
        aa.b();
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms"); 
        aa.a();
        str2 = "Loading ini [DatalogViews]";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        h(paramR, j);
        str2 = "Loaded ini [DatalogViews]";
        aa.b();
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms"); 
        aa.a();
        str2 = "Loading ini [TuningViews]";
        if (bool)
          D.d("[" + str1 + "]" + str2); 
        g(paramR, j);
        str2 = "Loaded ini [TuningViews]";
        aa.b();
        if (bool)
          D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms"); 
        D.d("Loaded All known ini sections");
      } else {
        D.d("Loaded All Read Only ini sections");
      } 
    } catch (g g) {
      g.printStackTrace();
      throw new g("Invalid Ini entry in " + str2, g);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new g("Invalid Ini row in " + str2, exception);
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
  
  public R a(R paramR, String paramString1, String paramString2) {
    aa aa = new aa();
    aa.a();
    this.m = true;
    J j = a(paramString1);
    aa.b();
    String str1 = paramString1.contains(File.separator) ? paramString1.substring(paramString1.lastIndexOf(File.separator) + 1) : paramString1;
    D.d("Read file " + str1 + ": " + aa.c() + "ms");
    aa.a();
    ArrayList arrayList = a(j, paramR);
    j.a(arrayList);
    aa.b();
    D.d("Filtered ini: " + aa.c() + "ms");
    String str2 = "";
    M m = j.a("TunerStudio", "iniSpecVersion");
    if (m != null) {
      double d = -1.0D;
      try {
        d = Double.parseDouble(m.e());
      } catch (Exception exception) {
        a(m, "Invalid iniSpecVersion, a numeric value is expected.");
      } 
      if (d > this.d) {
        a(m, "ECU Definition File " + m.g() + " requires a newer version of this application.\nRequired Specification: " + d + "\nSupported Specification: " + this.d + "\n\nPlease upgrade to a newer version.");
        throw new g("A newer version of this application is required to load ECU Definition File " + m.g() + ".", 2);
      } 
    } 
    try {
      aa.a();
      str2 = "Loading ini [EncodedData]";
      D.d("[" + str1 + "]" + str2);
      d(paramR, j, paramString2);
      str2 = "Loaded ini [EncodedData]";
      aa.b();
      D.d("[" + str1 + "]" + str2 + ": " + aa.c() + "ms");
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new g("Invalid Ini row in " + str2, exception);
    } finally {
      this.e.clear();
    } 
    return paramR;
  }
  
  private void a(R paramR) {
    if (!a()) {
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
        a(paramR, bR, aM.aL(), str1, true);
      } 
      if (aM.G() instanceof bR) {
        bR bR = (bR)aM.G();
        a(paramR, bR, aM.aL(), str2, true);
      } 
      if (aM.t() instanceof bR) {
        bR bR = (bR)aM.t();
        a(paramR, bR, aM.aL(), str4, true);
      } 
      if (aM.u() instanceof bR) {
        bR bR = (bR)aM.u();
        a(paramR, bR, aM.aL(), str3, true);
      } 
      if (aM.w() instanceof bR) {
        bR bR = (bR)aM.w();
        a(paramR, bR, aM.aL(), str5, true);
      } 
      if (aM.q() instanceof d) {
        d d = (d)aM.q();
        try {
          d.a();
        } catch (Exception exception) {
          b((M)null, "[Constant] " + aM.aL() + ": Invalid Units Expression.");
        } 
      } 
    } 
  }
  
  private void b(R paramR) {
    if (this.j && paramR != null && paramR.O() != null && paramR.O().o() != null && paramR.O().n() > paramR.O().G(0) && !paramR.O().N())
      D.b("blockingFactor smaller than ochBlockSize, but ochCommand does not support blocking."); 
  }
  
  private void a(M paramM, String paramString) {
    if (paramM == null) {
      D.a(paramString);
    } else {
      D.a(paramString + ", Problem at:\n" + paramM.toString() + "\n");
    } 
  }
  
  private void b(M paramM, String paramString) {
    if (paramM == null) {
      D.b(paramString);
    } else {
      D.b(paramString + ", Problem at:\n" + paramM.toString() + "\n");
    } 
  }
  
  private void c() {
    if (n == null) {
      n = new ac(this);
      n.start();
    } else {
      n.a();
    } 
  }
  
  public J a(String paramString) {
    c();
    if (o.containsKey(paramString))
      return (J)o.get(paramString); 
    J j = new J();
    j.a(this.k);
    if (!this.m)
      j.c("EncodedData"); 
    try {
      j.a(new File(paramString));
    } catch (Exception exception) {
      throw new g("Error reading ini file. " + paramString + "\n" + exception.getMessage(), exception);
    } 
    try {
      Iterator<String> iterator = j.c();
      while (iterator.hasNext()) {
        String str = iterator.next();
        a(j, (new File(paramString)).getParentFile(), str);
      } 
    } catch (Exception exception) {
      throw new g("Error reading include file. \n\n" + exception.getMessage(), exception);
    } 
    return j;
  }
  
  protected void a(J paramJ, File paramFile, String paramString) {
    J j = new J();
    j.a(this.k);
    if (!this.m)
      j.c("EncodedData"); 
    File file = new File(paramFile, paramString);
    if (!file.exists())
      file = new File(paramFile.getParent() + "/inc", paramString); 
    if (!file.exists() && b != null)
      file = new File(b, paramString); 
    if (!file.exists())
      file = new File(a, paramString); 
    j.a(file);
    Iterator<String> iterator = j.b();
    while (iterator.hasNext()) {
      String str = iterator.next();
      if (paramJ.b(str) != null) {
        N n = paramJ.b(str);
        if (n == null) {
          M m = new M(paramString);
          m.a("[" + str + "]", -1);
          paramJ.a().add(m);
        } 
        for (M m : j.b(str))
          paramJ.a(str, m); 
      } 
    } 
  }
  
  private boolean c(String paramString) {
    return bM.a(paramString);
  }
  
  private void d(R paramR, J paramJ) {
    bE bE = (paramR.e() == null) ? new bE() : paramR.e();
    c(paramR, bE, paramJ, "CurveEditor");
    c(paramR, bE, paramJ, "CurveEditorTS");
    try {
      a(paramR, bE, paramJ);
    } catch (g g) {
      D.a("Error loading EcuReference Tables");
      g.printStackTrace();
    } 
    try {
      D.d("Loading Trigger Wheels");
      b(paramR, bE, paramJ, "TriggerWheel");
    } catch (Exception exception) {
      D.a("Error loading [TriggerWheel] section of ini.");
      exception.printStackTrace();
    } 
    ArrayList arrayList = a(paramJ, paramR, "UserDefined");
    if (arrayList != null && !arrayList.isEmpty()) {
      D.d("Loading Depricated ini section [UserDefined], use [UiDialogs]");
      a(paramR, bE, paramJ, "UserDefined");
    } 
    arrayList = a(paramJ, paramR, "UserDefinedTS");
    if (arrayList != null && !arrayList.isEmpty()) {
      D.d("Loading Depricated ini section [UserDefinedTS], use [UiDialogs]");
      a(paramR, bE, paramJ, "UserDefinedTS");
    } 
    a(paramR, bE, paramJ, "UiDialogs");
    c(paramR, bE, paramJ);
    e(paramR, bE, paramJ, "Menu");
    e(paramR, bE, paramJ, "MenuTS");
    d(paramR, bE, paramJ, "KeyActions");
  }
  
  private void a(M paramM) {
    int i = X.b(paramM.b(), "\"");
    if (i == -1 || i % 2 == 0)
      return; 
    b(paramM, "Open ended String value");
  }
  
  private void a(R paramR, bE parambE, J paramJ, String paramString) {
    ArrayList arrayList1 = a(paramJ, paramR, paramString);
    if (arrayList1 == null || arrayList1.isEmpty())
      return; 
    Iterator<be> iterator = paramR.n();
    while (iterator.hasNext()) {
      be be = iterator.next();
      parambE.a((bv)be);
    } 
    iterator = paramR.o();
    while (iterator.hasNext()) {
      bi bi = (bi)iterator.next();
      parambE.a((bv)bi);
    } 
    iterator = null;
    br br = null;
    aj aj = null;
    bx bx = null;
    bt bt = null;
    bz bz = null;
    ArrayList arrayList2 = new ArrayList();
    for (M m : arrayList1) {
      String str = m.b();
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
            D.c("break 5988812"); 
          if (arrayList2.contains(bv.aL()))
            b(m, "dialog name '" + bv.aL() + "' already assigned. Menus will reference the last definition"); 
          if (arrayOfString.length > 1) {
            db db = da.a().a(paramR, arrayOfString[1]);
            bv.d(db);
          } 
          if (arrayOfString.length > 2)
            if (arrayOfString[2].equals("border")) {
              bv.i(2);
            } else if (arrayOfString[2].equals("xAxis")) {
              bv.i(0);
            } else if (arrayOfString[2].equals("yAxis")) {
              bv.i(1);
            } else if (arrayOfString[2].equals("card")) {
              bv.i(3);
            } else if (arrayOfString[2].equals("indexCard")) {
              bv.i(4);
            } else if (!I.a(arrayOfString[2])) {
              b(m, "Invalid layout defined for panel.\n Valid values: border, xAxis, yAxis, indexCard. Using default yAxis.");
              bv.i(1);
            }  
          if (arrayOfString.length > 3)
            bv.y(arrayOfString[3]); 
          parambE.a(bv);
          continue;
        } 
        if (str.startsWith("panel")) {
          bD bD;
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          if (arrayOfString[0].trim().equals(bv.aL()) || arrayOfString[0].trim().equals("customPressure5v")) {
            a(m, "Attempting to add a panel to itself! Ignoring row.");
            continue;
          } 
          bv bv1 = parambE.c(arrayOfString[0].trim());
          if (bv1 == null && c(arrayOfString[0].trim())) {
            bD = new bD();
            bD.v(arrayOfString[0].trim());
            parambE.a((bv)bD);
          } 
          if (bD == null) {
            b(m, "Nested Panel " + arrayOfString[0].trim() + " not found in UI structure. Either it is not defined in this ini file or it is being referenced before it was defined.");
            continue;
          } 
          bv bv2 = new bv();
          bv2.h(true);
          bv2.a((bv)bD);
          byte b = 1;
          if (arrayOfString.length > b && (bv.R() == 2 || !arrayOfString[b].startsWith("{")))
            try {
              String str2 = arrayOfString[b++].trim();
              if (bv.R() == 2 && !str2.equals("Center") && !str2.equals("North") && !str2.equals("South") && !str2.equals("East") && !str2.equals("West")) {
                b(m, "Invalid placement constraint for border layout: " + str2 + ", Valid border constraints are: North, South, East, West or Center");
                str2 = "Center";
              } 
              bv2.t(str2);
            } catch (g g) {
              b(m, g.getMessage());
            }  
          if (arrayOfString.length > b) {
            String str2 = X.b(arrayOfString[b++], "{", "");
            str2 = X.b(str2, "}", "").trim();
            a(paramR, m, str2, false);
            bv2.u(str2);
            bD.u(str2);
          } 
          if (arrayOfString.length > b) {
            String str2 = X.b(arrayOfString[b++], "{", "");
            str2 = X.b(str2, "}", "").trim();
            a(paramR, m, str2, false);
            bv2.x(str2);
          } 
          bv.a(bv2);
          continue;
        } 
        if (str.startsWith("gauge")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          bB bB = new bB();
          bB.a(arrayOfString[0].trim());
          ah ah = paramR.k(arrayOfString[0].trim());
          if (ah == null) {
            a(m, "Gauge Template " + arrayOfString[0].trim() + " not found.");
            continue;
          } 
          if (arrayOfString.length > 1)
            try {
              bB.t(arrayOfString[1].trim());
            } catch (g g) {
              b(m, g.getMessage());
            }  
          if (arrayOfString.length > 2) {
            String str2 = X.b(arrayOfString[2], "{", "");
            str2 = X.b(str2, "}", "").trim();
            a(paramR, m, str2, false);
            bB.u(str2);
          } 
          bv.a((bv)bB);
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
            } catch (g g) {
              b(m, g.getMessage());
            } 
          } else {
            br.t("South");
          } 
          if (arrayOfString.length > 3) {
            br.u(arrayOfString[3]);
            a(paramR, m, br.aJ(), false);
          } 
          bv.a((bv)br);
          continue;
        } 
        if (str.startsWith("graphLine")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          bs bs = new bs();
          byte b = 0;
          bs.a(arrayOfString[b++]);
          if (paramR.g(bs.a()) == null)
            b(m, "LiveGraph graphLine assigned to invalid OutputChannel."); 
          if (arrayOfString.length > b)
            bs.b(arrayOfString[b++]); 
          if (arrayOfString.length > b)
            bs.a(Double.parseDouble(arrayOfString[b++])); 
          if (arrayOfString.length > b)
            bs.b(Double.parseDouble(arrayOfString[b++])); 
          if (arrayOfString.length > b && arrayOfString[b++].equalsIgnoreCase("auto"))
            bs.a(true); 
          if (arrayOfString.length > b && arrayOfString[b++].equalsIgnoreCase("auto"))
            bs.b(true); 
          br.a(bs);
          continue;
        } 
        if (str.startsWith("logFieldSelector")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          ag ag = new ag();
          byte b = 0;
          ag.v(arrayOfString[b++]);
          if (arrayOfString.length > b)
            ag.s(X.b(arrayOfString[b++], "\"", "")); 
          if (arrayOfString.length > b) {
            ag.a(arrayOfString[b++]);
            if (paramR.c(ag.a()) == null)
              b(m, "Invalid Offset Parameter Name, " + ag.a() + " not found."); 
          } 
          if (arrayOfString.length > b) {
            ag.b(arrayOfString[b++]);
            if (paramR.c(ag.b()) == null)
              b(m, "Invalid Length Parameter Name, " + ag.b() + " not found."); 
          } 
          if (arrayOfString.length > b) {
            String str2 = X.b(arrayOfString[b++], "{", "");
            str2 = X.b(str2, "}", "");
            try {
              dj dj = dk.a((aI)paramR, str2);
              ag.a(dj);
            } catch (Exception exception) {
              b(m, "Invalid Size Parameter Name, " + ag.c() + " not found and not numeric.");
            } 
          } 
          if (arrayOfString.length > b) {
            String str2 = arrayOfString[b++];
            try {
              int i = X.g(str2);
              ag.a(i);
            } catch (Exception exception) {
              b(m, "Invalid Inactive size, " + str2 + "  not numeric.");
            } 
          } 
          parambE.a((bv)ag);
          continue;
        } 
        if (str.startsWith("replayFieldSelector")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          bc bc = new bc();
          byte b = 0;
          bc.v(arrayOfString[b++]);
          if (arrayOfString.length > b)
            bc.s(X.b(arrayOfString[b++], "\"", "")); 
          if (arrayOfString.length > b) {
            bc.b(arrayOfString[b++]);
            if (paramR.c(bc.d()) == null)
              b(m, "Invalid Offset Parameter Name, " + bc.d() + " not found."); 
          } 
          if (arrayOfString.length > b) {
            bc.a(arrayOfString[b++]);
            if (!bc.b() && paramR.c(bc.a()) == null)
              b(m, "Invalid Size Parameter Name, " + bc.a() + " not found and not numeric."); 
          } 
          if (arrayOfString.length > b) {
            String str2 = arrayOfString[b++];
            try {
              int i = X.g(str2);
              bc.a(i);
            } catch (Exception exception) {
              b(m, "Invalid Inactive, " + str2 + "  not numeric.");
            } 
          } 
          parambE.a((bv)bc);
          continue;
        } 
        if (str.startsWith("settingSelector") && bv != null) {
          bx = new bx();
          String str1 = q(str);
          byte b = 0;
          String[] arrayOfString = j(str1);
          String str2 = arrayOfString[b++];
          bx.b(da.a().a(paramR, str2));
          if (arrayOfString.length > b) {
            String str3 = X.b(arrayOfString[b++], "{", "");
            str3 = X.b(str3, "}", "").trim();
            a(paramR, m, str3, false);
            bx.u(str3);
            if (arrayOfString.length > b) {
              str3 = X.b(arrayOfString[b++], "{", "");
              str3 = X.b(str3, "}", "").trim();
              a(paramR, m, str3, false);
              bx.f(str3);
            } 
          } 
          bv.a((bA)bx);
          continue;
        } 
        if (str.startsWith("enabledCondition") && bv != null) {
          String str1 = q(str);
          String str2 = X.b(str1, "{", "");
          str2 = X.b(str2, "}", "").trim();
          a(paramR, m, str2, false);
          bv.u(str2);
          continue;
        } 
        if (str.startsWith("settingOption") && bv != null) {
          if (bx == null) {
            a(m, "Ini error: Found settingOption before settingSelector.");
            continue;
          } 
          bw bw = new bw();
          String str1 = q(str);
          byte b = 0;
          String[] arrayOfString = j(str1);
          bw.b(f(arrayOfString[b++]));
          while (b < arrayOfString.length) {
            String str2 = p(arrayOfString[b]);
            String str3 = q(arrayOfString[b]);
            double d = 0.0D;
            try {
              d = Double.parseDouble(str3);
            } catch (Exception exception) {
              a(m, "Value for " + str2 + " should be numeric in row.");
            } 
            bw.a(str2, d);
            b++;
          } 
          bx.a(bw);
          continue;
        } 
        if (str.startsWith("calibrationField") && bv != null) {
          bk bk = new bk();
          a(paramR, m, (bq)bk);
          a(paramR, m, bk.aJ(), false);
          if (bk.b() != null && !bk.b().equals("") && paramR.c(bk.b()) == null) {
            b(m, "[" + paramString + "] field assigned to invalid Constant '" + bk.b() + "'.");
          } else if (bk.b() != null && !bk.b().equals("") && paramR.c(bk.b()).i().equals("array") && !str.contains("[")) {
            b(m, "[" + paramString + "] field assigned to array Constant '" + bk.b() + "'. Use array1D for array Constants");
          } 
          bv.a((bA)bk);
          continue;
        } 
        if (str.startsWith("field") && bv != null) {
          bq bq = a(paramR, m);
          a(paramR, m, bq.aJ(), false);
          if (bq.b() != null && !bq.b().equals("") && paramR.c(bq.b()) == null) {
            b(m, "[" + paramString + "] field assigned to invalid Constant '" + bq.b() + "'.");
          } else if (bq.b() != null && !bq.b().equals("") && paramR.c(bq.b()).i().equals("array") && !str.contains("[")) {
            b(m, "[" + paramString + "] field assigned to array Constant '" + bq.b() + "'. Use array1D for array Constants");
          } 
          bv.a((bA)bq);
          continue;
        } 
        if (str.startsWith("radio") && bv != null) {
          by by = c(paramR, m);
          a(paramR, m, by.aJ(), false);
          if (by.b() != null && !by.b().equals("") && paramR.c(by.b()) == null) {
            b(m, "[" + paramString + "] field assigned to invalid Constant '" + by.b() + "'.");
          } else if (by.b() != null && !by.b().equals("") && paramR.c(by.b()).i().equals("array") && !str.contains("[")) {
            b(m, "[" + paramString + "] field assigned to array Constant '" + by.b() + "'. Use array1D for array Constants");
          } 
          bv.a((bA)by);
          continue;
        } 
        if (str.startsWith("channelSelector") && bv != null) {
          try {
            E e = e(paramR, m);
            a(paramR, m, e.aJ(), false);
            if (e.a() != null && !e.a().equals("") && paramR.c(e.a()) == null)
              b(m, "[" + paramString + "] Channel Selector assigned to invalid offset Constant '" + e.a() + "'."); 
            if (e.c() != null && !e.c().equals("") && paramR.c(e.c()) == null)
              b(m, "[" + paramString + "] Channel Selector assigned to invalid Length Constant '" + e.a() + "'."); 
            if (paramR.c(e.a()) != null && !paramR.c(e.a()).i().equals("scalar"))
              a(m, "Constant: " + e.a() + " not of type scalar. Only Scalar is supported for channelSelector."); 
            if (paramR.c(e.c()) != null && !paramR.c(e.c()).i().equals("scalar"))
              a(m, "Constant: " + e.c() + " not of type scalar. Only Scalar is supported for channelSelector."); 
            bv.a((bA)e);
          } catch (Exception exception) {
            a(m, "Syntax error. Proper usage:\n   channelSelector = \"Label Text\", offset_scalar, len_scalar, can_id_scaler(optional), { enable condition (optional)}, { visible condition (optional)}");
          } 
          continue;
        } 
        if (str.startsWith("canDeviceSelector") && bv != null) {
          try {
            D d = f(paramR, m);
            a(paramR, m, d.aJ(), false);
            if (d.a() != null && !d.a().equals("") && paramR.c(d.a()) == null)
              b(m, "[" + paramString + "] CAN Device Selector assigned to invalid can ID Constant '" + d.a() + "'."); 
            if (paramR.c(d.a()) != null && !paramR.c(d.a()).i().equals("scalar"))
              a(m, "Constant: " + d.a() + " not of type scalar. Only Scalar is supported for canDeviceSelector."); 
            bv.a((bA)d);
          } catch (Exception exception) {
            a(m, "Syntax error. Proper usage:\n   canDeviceSelector = \"Label Text\", can_id_scaler, { enable condition (optional)}, { visible condition (optional)}");
          } 
          continue;
        } 
        if (str.startsWith("canClientIdSelector") && bv != null) {
          try {
            C c = g(paramR, m);
            a(paramR, m, c.aJ(), false);
            if (c.a() != null && !c.a().equals("") && paramR.c(c.a()) == null)
              b(m, "[" + paramString + "] CAN Device Selector assigned to invalid can ID Constant '" + c.a() + "'."); 
            if (paramR.c(c.a()) != null && !paramR.c(c.a()).i().equals("scalar"))
              a(m, "Constant: " + c.a() + " not of type scalar. Only Scalar is supported for canDeviceSelector."); 
            bv.a((bA)c);
          } catch (Exception exception) {
            a(m, "Syntax error. Proper usage:\n   canDeviceSelector = \"Label Text\", can_id_scaler, { enable condition (optional)}, { visible condition (optional)}");
          } 
          continue;
        } 
        if (str.startsWith("slider") && bv != null) {
          bC bC = d(paramR, m);
          a(paramR, m, bC.aJ(), false);
          if (bC.b() != null && !bC.b().equals("") && paramR.c(bC.b()) == null)
            b(m, "[" + paramString + "] field assigned to invalid Constant '" + bC.b() + "'."); 
          if (paramR.c(bC.b()) != null && !paramR.c(bC.b()).i().equals("scalar"))
            a(m, "Constant: " + bC.b() + " not of type scalar. Only Scalar is supported for Sliders."); 
          bv.a((bA)bC);
          continue;
        } 
        if (str.startsWith("commandButton") && bv != null) {
          byte b;
          bl bl = new bl();
          bl.v(m.f());
          String[] arrayOfString = j(m.e());
          bl.b(da.a().a(paramR, arrayOfString[0]));
          bl.a(arrayOfString[1]);
          if (arrayOfString.length > 2 && arrayOfString[2].startsWith("{")) {
            String str1 = X.b(arrayOfString[2], "{", "");
            str1 = X.b(str1, "}", "");
            bl.u(str1.trim());
            a(paramR, m, bl.aJ(), false);
            b = 3;
          } else {
            b = 2;
          } 
          while (arrayOfString.length > b) {
            if (arrayOfString[b].equals("clickOnClose")) {
              bl.a(bl.f);
            } else if (arrayOfString[b].equals("clickOnCloseIfEnabled")) {
              bl.a(bl.b);
            } else if (arrayOfString[b].equals("clickOnCloseIfDisabled")) {
              bl.a(bl.c);
            } else if (arrayOfString[b].equals("closeDialogOnClick")) {
              bl.a(bl.e);
            } else if (arrayOfString[b].equals("showMessageOnClick")) {
              if (arrayOfString.length > b + 1) {
                bl.a(bl.d);
                String str1 = f(arrayOfString[++b]);
                bl.b(str1);
              } else {
                b(m, "Message required with showMessageOnClick flag");
              } 
            } else {
              b(m, "Unknown commandButton attribute: " + arrayOfString[3] + ", know attributes include: clickOnCloseIfEnabled, clickOnCloseIfDisabled and clickOnClose");
            } 
            b++;
          } 
          if (bl.a() == null || bl.a().equals("") || paramR.O().b(bl.a()) == null)
            b(m, "[" + paramString + "] commandButton assigned to invalid ControllerCommands '" + bl.a() + "'."); 
          bv.a((bA)bl);
          continue;
        } 
        if (str.startsWith("displayOnlyField") && bv != null) {
          bq bq = a(paramR, m);
          bq.d(true);
          a(paramR, m, bq.aJ(), false);
          if (bq.b() != null && !bq.b().equals("") && paramR.c(bq.b()) == null)
            b(m, "[" + paramString + "] displayField assigned to invalid Constant '" + bq.b() + "'."); 
          bv.a((bA)bq);
          continue;
        } 
        if (str.startsWith("runtimeValue") && bv != null) {
          bq bq = b(paramR, m);
          bq.d(true);
          a(paramR, m, bq.aJ(), false);
          if (bq.b() != null && !bq.b().equals("") && paramR.g(bq.b()) == null)
            b(m, "[" + paramString + "] displayField assigned to invalid Constant '" + bq.b() + "'."); 
          bv.a((bA)bq);
          continue;
        } 
        if (str.startsWith("topicHelp") && bv != null) {
          db db = da.a().a(paramR, q(str));
          bv.e(db);
          if (db.a().startsWith("http:/") || db.a().startsWith("file:/")) {
            aj = new aj();
            aj.a(db);
            aj.b(db);
            if (bv.M() != null && bv.M().length() > 0) {
              if (db.a().startsWith("http:/")) {
                aj.b("Web - " + bv.M());
              } else {
                aj.b(bv.M());
              } 
            } else if (db.a().startsWith("file:/")) {
              aj.b("Manual Help");
            } else {
              aj.b("Web Help");
            } 
            parambE.a(aj);
          } 
          continue;
        } 
        if (str.startsWith("help")) {
          aj = new aj();
          String[] arrayOfString = j(q(str));
          aj.a(da.a().a(paramR, arrayOfString[0]));
          if (arrayOfString.length > 1)
            aj.b(X.b(arrayOfString[1], "\"", "")); 
          parambE.a(aj);
          continue;
        } 
        if (str.startsWith("text") && aj != null) {
          aj.a(X.b(q(str), "\"", "") + "\n");
          continue;
        } 
        if (str.startsWith("webHelp") && aj != null) {
          db db = da.a().a(paramR, q(str));
          aj.b(db);
          continue;
        } 
        if (str.startsWith("array1D")) {
          if (bv != null) {
            bj bj = d(str);
            a(paramR, m, bj.c(), false);
            bv.a((bv)bj);
            continue;
          } 
          a(m, "Could not load array1D because the parent panel was not defined 1st.");
          continue;
        } 
        if (m.f().equals("indicatorPanel")) {
          String[] arrayOfString = j(q(str));
          bt = new bt();
          bt.v(arrayOfString[0]);
          parambE.a((bv)bt);
          if (arrayOfString.length > 1)
            bt.a((int)I.b(arrayOfString[1])); 
          if (arrayOfString.length > 2) {
            String str1 = X.b(arrayOfString[2], "{", "");
            str1 = X.b(str1, "}", "").trim();
            a(paramR, m, str1, false);
            bt.u(str1);
          } 
          if (arrayOfString.length > 3) {
            String str1 = X.b(arrayOfString[3], "{", "");
            str1 = X.b(str1, "}", "").trim();
            a(paramR, m, str1, false);
            bt.x(str1);
          } 
          continue;
        } 
        if (m.f().equals("indicator")) {
          if (bt == null) {
            b(m, "indicator defined in " + paramString + " with no indicatorPanel defined, ignoring.");
            continue;
          } 
          ak ak = a(m, paramR);
          bt.a(ak);
          continue;
        } 
        if (m.f().equals("readoutPanel")) {
          String[] arrayOfString = j(q(str));
          bz = new bz();
          bz.v(arrayOfString[0]);
          parambE.a((bv)bz);
          if (arrayOfString.length > 1)
            bz.a((int)I.b(arrayOfString[1])); 
          if (arrayOfString.length > 2) {
            String str1 = X.b(arrayOfString[2], "{", "");
            str1 = X.b(str1, "}", "").trim();
            a(paramR, m, str1, false);
            bz.u(str1);
          } 
          if (arrayOfString.length > 3) {
            String str1 = X.b(arrayOfString[3], "{", "");
            str1 = X.b(str1, "}", "").trim();
            a(paramR, m, str1, false);
            bz.x(str1);
          } 
          continue;
        } 
        if (m.f().equals("readout")) {
          if (bz == null) {
            b(m, "readout defined in " + paramString + " with no readoutPanel defined, ignoring.");
            continue;
          } 
          String[] arrayOfString = j(q(str));
          if (arrayOfString.length == 1) {
            ah ah1 = paramR.k(arrayOfString[0]);
            if (ah1 != null) {
              bz.a(ah1);
              continue;
            } 
            aH aH = paramR.g(arrayOfString[0]);
            if (aH != null) {
              ah1 = new ah();
              ah1.a(arrayOfString[0]);
              ah1.c(arrayOfString[0]);
              ah1.a(-1.0E9D);
              ah1.b(1.0E9D);
              ah1.e(1.0E8D);
              ah1.d(1.0E8D);
              bz.a(ah1);
              continue;
            } 
            b(m, "Unrecognized readout entry " + paramString + ", " + arrayOfString[0] + " not recognized as OutputChannel or Guage Definition");
            continue;
          } 
          ah ah = j(paramR, m);
          bz.a(ah);
          continue;
        } 
        if (m.f().equals("userPassword")) {
          String str1 = m.e();
          aM aM = paramR.c(str1);
          if (aM != null && aM.z() >= 4) {
            bv.z(str1);
            paramR.c(true);
            continue;
          } 
          b(m, "Invalid value for userPassword Parameter. Must be the name of a defined U32 Constant. Invalid Value: " + str1);
          continue;
        } 
        b(m, "Unrecognized ini entry in " + paramString + ", ignoring.");
      } catch (Exception exception) {
        a(m, "Invalid record in " + paramString + ", I don't know how to handle. It may cause more errors");
      } 
    } 
  }
  
  private void b(R paramR, bE parambE, J paramJ, String paramString) {
    aj aj = null;
    ArrayList arrayList = a(paramJ, paramR, paramString);
    bJ bJ = null;
    c c = null;
    for (M m : arrayList) {
      String str = m.b();
      try {
        if (str.startsWith("wheelPattern")) {
          String[] arrayOfString = j(q(str));
          if (arrayOfString.length < 2) {
            a(m, "Not enough Parameters for wheelPattern entry.");
            continue;
          } 
          if (arrayOfString[1].equals("basicPattern")) {
            b b = new b();
            b.v(arrayOfString[0]);
            b.b(arrayOfString[2]);
            b.c(arrayOfString[3]);
            b.d(arrayOfString[4]);
            if (arrayOfString.length > 5)
              b.e(arrayOfString[5]); 
            parambE.a((bL)b);
            continue;
          } 
          if (arrayOfString[1].equals("fixedAngle"))
            continue; 
          if (arrayOfString[1].equals("bitArrayPattern")) {
            if (arrayOfString.length < 4) {
              a(m, "bitArrayPattern requires 4 parameters:\nname, designerPattern, constantBitsArray, constantOffset, [constantCapture]");
              continue;
            } 
            a a = new a();
            a.v(arrayOfString[0]);
            a.a(arrayOfString[1]);
            a.b(arrayOfString[2]);
            if (arrayOfString.length > 3)
              a.d(arrayOfString[3]); 
            if (arrayOfString.length > 4)
              a.c(arrayOfString[4]); 
            parambE.a((bL)a);
            continue;
          } 
          a(m, "Invalid WheelPattern class.");
          continue;
        } 
        if (str.startsWith("triggerWheel")) {
          bJ = new bJ();
          String[] arrayOfString = j(q(str));
          bJ.v(arrayOfString[0]);
          parambE.a((bv)bJ);
          if (arrayOfString.length > 1)
            bJ.s(X.b(arrayOfString[1], "\"", "")); 
          if (arrayOfString.length > 2) {
            String str1 = X.b(arrayOfString[2], "{", "");
            str1 = X.b(str1, "}", "").trim();
            a(paramR, m, str1, false);
            bJ.u(str1);
          } 
          bJ.a(str.startsWith("triggerWheelDesigner"));
          continue;
        } 
        if (str.startsWith("topicHelp") && !a(bJ, str)) {
          db db = da.a().a(paramR, q(str));
          bJ.e(db);
          if (db.a().startsWith("http:/") || db.a().startsWith("file:/")) {
            aj = new aj();
            aj.a(db);
            aj.b(db);
            if (bJ != null && bJ.M() != null && bJ.M().length() > 0) {
              aj.b(bJ.M());
            } else {
              aj.b("Web Help");
            } 
            parambE.a(aj);
          } 
          continue;
        } 
        if (str.startsWith("inputCapturePointParameterName") && c != null) {
          String str1 = q(str);
          c.b(str1.trim());
          continue;
        } 
        if (str.startsWith("solutionWheelPattern") && bJ != null) {
          String[] arrayOfString = j(q(str));
          String str1 = X.b(arrayOfString[1], "{", "");
          str1 = X.b(str1, "}", "");
          a(paramR, m, str1, false);
          String str2 = arrayOfString[0];
          if (parambE.a(str2) == null) {
            a(m, "Attempt to add trigger wheel pattern " + str2 + " to triggerWheel, but wheel pattern is not defined.\nThe wheelPattern should be defined above the triggerWheel you are adding it to.");
            continue;
          } 
          bL bL = parambE.a(str2);
          if (bL == null) {
            b(m, "Wheel Pattern: " + str2 + " not found in current configuration. Was it defined after this row?");
            continue;
          } 
          bJ.a(str1, bL);
          continue;
        } 
        if (str.startsWith("preferredSize") && bJ != null) {
          String str1 = q(str);
          String[] arrayOfString = j(q(str));
          int i = X.g(arrayOfString[0]);
          int j = X.g(arrayOfString[1]);
          A a = new A(i, j);
          bJ.a(a);
          continue;
        } 
        if (bJ == null) {
          b(m, "Syntax Error in ini section [" + paramString + "], a triggerWheel was should be defined first.");
          continue;
        } 
        b(m, "Syntax Error in ini section [" + paramString + "], line not understood and ignored.");
      } catch (Exception exception) {
        a(m, "Sysntax Error in [" + paramString + "], I don't know how to handle.");
        exception.printStackTrace();
      } 
    } 
  }
  
  private void a(R paramR, J paramJ, String paramString) {
    ArrayList arrayList = a(paramJ, paramR, paramString);
    for (M m : arrayList) {
      String str = m.b();
      try {
        if (str.startsWith("requiresPowerCycle")) {
          aM aM = paramR.c(m.e());
          if (aM == null) {
            b(m, m.e() + " not found, can not assign requiresPowerCycle.");
            continue;
          } 
          aM.d(true);
          continue;
        } 
        if (str.startsWith("readOnly")) {
          String[] arrayOfString = j(q(str));
          aM aM = paramR.c(arrayOfString[0]);
          if (aM == null) {
            b(m, arrayOfString[0] + " not found, can not set to read only.");
            continue;
          } 
          aM.f(true);
          continue;
        } 
        if (str.startsWith("defaultValue")) {
          String[] arrayOfString = j(q(str));
          aM aM = paramR.c(arrayOfString[0]);
          if (aM == null) {
            b(m, arrayOfString[0] + " not found, can not assign defaultValue.");
            continue;
          } 
          boolean bool = aM.H();
          aM.f(false);
          String str1 = arrayOfString[1];
          if (str1.startsWith("\"") && aM.i().equals("bits")) {
            aM.e(str1);
          } else if (aM.i().equals("array")) {
            double[][] arrayOfDouble = new double[aM.a()][aM.m()];
            String str2 = m.e();
            String str3 = str2.substring(str2.indexOf(",") + 1).replace("\\n", "\n");
            str3 = str3.replace("  ", " ").trim();
            if (str3.indexOf("\n") == -1)
              str3 = str3.replace(" ", "\n"); 
            str3 = str3 + "\n";
            try {
              arrayOfDouble = X.a(arrayOfDouble, str3);
            } catch (Exception exception) {
              b(m, "Wrong number of values?");
            } 
            aM.a(paramR.h(), arrayOfDouble);
          } else if (aM.i().equals("string")) {
            str1 = f(str1);
            aM.f(str1);
          } else {
            double d = Double.parseDouble(str1);
            aM.d(d);
          } 
          aM.f(bool);
          continue;
        } 
        if (str.startsWith("rawValue")) {
          String[] arrayOfString = j(q(str));
          aM aM = paramR.c(arrayOfString[0]);
          if (aM == null) {
            b(m, arrayOfString[0] + " not found, can not assign rawValue.");
            continue;
          } 
          boolean bool = aM.H();
          aM.f(false);
          String str1 = arrayOfString[1];
          if (str1.startsWith("\"") && aM.i().equals("bits")) {
            b(m, "bit types not not supported byte assign rawValue.");
          } else {
            int[] arrayOfInt = new int[aM.z()];
            String str2 = m.e();
            String str3 = str2.substring(str2.indexOf(",") + 1);
            str3 = str3.replace("  ", " ").trim();
            arrayOfInt = X.d(str3, " ");
            aM.a(paramR.h(), arrayOfInt);
          } 
          aM.f(bool);
          continue;
        } 
        if (str.startsWith("useScaleAsDivisor")) {
          String[] arrayOfString = j(m.e());
          aM aM = paramR.c(arrayOfString[0]);
          if (aM != null) {
            aM.f(dk.a((aI)paramR, arrayOfString[1]));
            continue;
          } 
          b(m, "Constant: " + arrayOfString[0] + " not found.");
          continue;
        } 
        if (str.startsWith("maintainConstantValue")) {
          String[] arrayOfString = j(m.e());
          aM aM = paramR.c(arrayOfString[0]);
          if (aM == null) {
            a(m, "Constant " + arrayOfString[0] + " not found! format: maintainConstantValue = scalarConstantName, { expression }");
            continue;
          } 
          if (!aM.i().equals("scalar") && !aM.i().equals("bits")) {
            a(m, "Only Scalar and Bit Constants supported! format: maintainConstantValue = scalarConstantName, { expression }");
            continue;
          } 
          if (arrayOfString.length <= 1) {
            a(m, "Expression not optional! format: maintainConstantValue = scalarConstantName, { expression }");
            continue;
          } 
          String str1 = arrayOfString[1];
          str1 = X.b(str1, "{", "");
          str1 = X.b(str1, "}", "");
          aQ.a().a(aM, paramR, str1);
          a(paramR, m, str1, true);
          continue;
        } 
        if (str.startsWith("reverseIndex")) {
          String[] arrayOfString = j(m.e());
          aM aM = paramR.c(arrayOfString[0]);
          if (aM != null) {
            aM.g(dk.a((aI)paramR, "1"));
            continue;
          } 
          b(m, "Constant: " + arrayOfString[0] + " not found.");
          continue;
        } 
        if (str.startsWith("oppositeEndian")) {
          String[] arrayOfString = j(m.e());
          aM aM = paramR.c(arrayOfString[0]);
          if (aM != null) {
            aM.h(true);
            continue;
          } 
          b(m, "Constant: " + arrayOfString[0] + " not found.");
          continue;
        } 
        if (str.startsWith("controllerPriority")) {
          String[] arrayOfString = j(m.e());
          aM aM = paramR.c(arrayOfString[0]);
          if (aM != null) {
            aM.i(true);
            continue;
          } 
          b(m, "Constant: " + arrayOfString[0] + " not found.");
          continue;
        } 
        if (str.startsWith("noMsqSave") || str.startsWith("noSaveToMsq") || str.startsWith("noLocalUpdate")) {
          String[] arrayOfString = j(m.e());
          aM aM = paramR.c(arrayOfString[0]);
          if (aM != null) {
            aM.b(false);
            continue;
          } 
          b(m, "Constant: " + arrayOfString[0] + " not found.");
          continue;
        } 
        if (str.startsWith("maximumElements")) {
          String[] arrayOfString = j(m.e());
          aM aM = paramR.c(arrayOfString[0]);
          if (aM != null) {
            aM.d(X.g(arrayOfString[1]));
            continue;
          } 
          b(m, "Constant: " + arrayOfString[0] + " not found.");
          continue;
        } 
        if (str.startsWith("useMappingTable")) {
          String[] arrayOfString = j(m.e());
          aM aM = paramR.c(arrayOfString[0]);
          if (aM != null && arrayOfString.length > 1) {
            F f = F.b(paramR.F(), arrayOfString[1]);
            if (f != null) {
              aM.a(f);
              continue;
            } 
            b(m, "Failed to load Mapping file: " + arrayOfString[1]);
            continue;
          } 
          if (aM != null) {
            b(m, "missing required mapping file.");
            continue;
          } 
          b(m, "Constant: " + arrayOfString[0] + " not found.");
          continue;
        } 
        b(m, "Unrecognized row, don't know what to do.");
      } catch (Exception exception) {
        a(m, "Syntax Error in " + paramString + ", values not as expected. Message:\n" + exception.getLocalizedMessage());
      } 
    } 
  }
  
  private void b(R paramR, J paramJ, String paramString) {
    ArrayList arrayList = a(paramJ, paramR, paramString);
    for (M m : arrayList) {
      try {
        String str = m.f();
        String[] arrayOfString = j(m.e());
        if (str.equals("displayCommand")) {
          if (arrayOfString.length < 2) {
            a(m, "Required parameters missing. Proper usage: displayCommand = commandName, \"Displaylabel\"");
            continue;
          } 
          String str1 = f(arrayOfString[1]);
          if (!paramR.O().a(arrayOfString[0], str1, true))
            a(m, "controllerCommand not found"); 
          continue;
        } 
        paramR.O().a(str, arrayOfString);
      } catch (Exception exception) {
        a(m, "Syntax Error in " + paramString + ", values not as expected.");
      } 
    } 
  }
  
  private void c(R paramR, bE parambE, J paramJ, String paramString) {
    aj aj = null;
    ArrayList arrayList = a(paramJ, paramR, paramString);
    bm bm = null;
    for (M m : arrayList) {
      String str = m.b();
      try {
        if (str.startsWith("curve")) {
          bm = new bm();
          bm.s(this.l);
          String[] arrayOfString = j(q(str));
          bm.v(arrayOfString[0]);
          parambE.a((bv)bm);
          if (arrayOfString.length > 1) {
            db db = da.a().a(paramR, arrayOfString[1].trim());
            bm.d(db);
          } 
          continue;
        } 
        if (str.startsWith("topicHelp") && !a(bm, str)) {
          db db = da.a().a(paramR, q(str));
          bm.e(db);
          if (db.a().startsWith("http:/") || db.a().startsWith("file:/")) {
            aj = new aj();
            aj.a(db);
            aj.b(db);
            if (bm.M() != null && bm.M().length() > 0) {
              aj.b(bm.M());
            } else {
              aj.b("Web Help");
            } 
            parambE.a(aj);
          } 
          continue;
        } 
        if (str.startsWith("enabledCondition") && bm != null) {
          String str1 = q(str);
          String str2 = X.b(str1, "{", "");
          str2 = X.b(str2, "}", "").trim();
          bm.u(str2);
          a(paramR, m, str2, false);
          continue;
        } 
        if (str.startsWith("columnLabel") && !a(bm, str)) {
          String[] arrayOfString = j(q(str));
          byte b = 0;
          while (b < arrayOfString.length) {
            if (arrayOfString.length > b + 1) {
              db db1 = da.a().a(paramR, arrayOfString[b++].trim());
              bm.c(db1);
              db1 = da.a().a(paramR, arrayOfString[b++].trim());
              bm.a(db1);
              continue;
            } 
            db db = da.a().a(paramR, arrayOfString[b++].trim());
            bm.a(db);
          } 
          continue;
        } 
        if (str.startsWith("xAxis") && !a(bm, str)) {
          String[] arrayOfString = j(q(str));
          bm.c(dk.a((aI)paramR, arrayOfString[0]));
          bm.d(dk.a((aI)paramR, arrayOfString[1]));
          if (arrayOfString.length > 2)
            bm.h(X.g(arrayOfString[2].trim())); 
          continue;
        } 
        if (str.startsWith("yAxis") && !a(bm, str)) {
          String[] arrayOfString = j(q(str));
          bm.a(dk.a((aI)paramR, arrayOfString[0]));
          bm.b(dk.a((aI)paramR, arrayOfString[1]));
          if (arrayOfString.length > 2)
            bm.g(X.g(arrayOfString[2].trim())); 
          continue;
        } 
        if (str.startsWith("xBins") && !a(bm, str)) {
          String[] arrayOfString = j(q(str));
          String str1 = X.b(arrayOfString[0].trim(), "\"", "");
          if (paramR.c(str1) == null)
            a(m, "CurveGraph xBin not a valid Constant."); 
          bm.c(str1);
          if (arrayOfString.length > 1)
            bm.d(arrayOfString[1].trim()); 
          if (arrayOfString.length > 2 && arrayOfString[2].equals("readOnly"))
            bm.e(true); 
          continue;
        } 
        if (str.startsWith("yBins") && !a(bm, str)) {
          String str2;
          String[] arrayOfString = j(q(str));
          byte b = 0;
          String str1 = X.b(arrayOfString[b++].trim(), "\"", "");
          if (paramR.c(str1) == null)
            a(m, "CurveGraph yBin not a valid Constant."); 
          if (arrayOfString.length > b && !arrayOfString[b].startsWith("{"))
            bm.b(arrayOfString[b++].trim()); 
          if (arrayOfString.length > b) {
            str2 = X.b(arrayOfString[b++], "{", "");
            str2 = X.b(str2, "}", "");
          } else {
            str2 = "";
          } 
          bm.a(str1, str2);
          continue;
        } 
        if (str.startsWith("lineLabel") && !a(bm, str)) {
          String[] arrayOfString = j(q(str));
          db db = da.a().a(paramR, arrayOfString[0].trim());
          bm.b(db);
          continue;
        } 
        if (str.startsWith("gauge") && !a(bm, str)) {
          String[] arrayOfString = j(q(str));
          if (arrayOfString.length > 0)
            bm.e(arrayOfString[0].trim()); 
          continue;
        } 
        if (m.f().equals("showTextValues") && !a(bm, str)) {
          String[] arrayOfString = j(q(str));
          if (arrayOfString.length > 0)
            try {
              bm.a(Boolean.parseBoolean(arrayOfString[0].trim()));
            } catch (Exception exception) {
              b(m, "showTextValues expects true or false");
            }  
          continue;
        } 
        if (m.f().equals("size") && !a(bm, str)) {
          String[] arrayOfString = j(q(str));
          if (arrayOfString.length != 2)
            b(m, "CurvePanel suggestedSize should have 2 values\nsuggestedSize = width, height"); 
          A a = new A(X.g(arrayOfString[0]), X.g(arrayOfString[1]));
          bm.a(a);
          continue;
        } 
        if (m.f().equals("showXYDataPlot") && !a(bm, str)) {
          String[] arrayOfString = j(q(str));
          if (arrayOfString.length < 3) {
            b(m, "CurvePanel showXYDataPlot must have at least 3 values\nshowXYDataPlot = displayByDefaultBoolean, xFieldName, yFieldName, [ DataDisplayCondition ] }");
            continue;
          } 
          bm.f(Boolean.parseBoolean(arrayOfString[0]));
          bm.f(arrayOfString[1]);
          bm.g(arrayOfString[2]);
          if (arrayOfString.length > 3) {
            String str1 = arrayOfString[3];
            str1 = X.b(str1, "{", "");
            str1 = X.b(str1, "}", "");
            bm.h(str1);
          } 
          continue;
        } 
        if (m.f().equals("userPassword")) {
          String str1 = m.e();
          aM aM = paramR.c(str1);
          if (aM != null && aM.z() >= 4) {
            bm.z(str1);
            paramR.c(true);
            continue;
          } 
          b(m, "Invalid value for userPassword Parameter. Must be the name of a defined U32 Constant. Invalid Value: " + str1);
          continue;
        } 
        if (m.f().equals("suppressGraph")) {
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
          str1 = X.b(str1, "{", "");
          str1 = X.b(str1, "}", "");
          bm.e(dk.a((aI)paramR, str1));
          a(paramR, m, str1, false);
          continue;
        } 
        b(m, "Unrecognizedd entry. Do not know how to handle ini row.");
      } catch (Exception exception) {
        a(m, "Syntax Error in " + paramString + ", values not as expected.");
      } 
    } 
  }
  
  private void d(R paramR, bE parambE, J paramJ, String paramString) {
    ArrayList arrayList = a(paramJ, paramR, paramString);
    for (M m : arrayList) {
      try {
        if (m.f().equals("showPanel")) {
          String[] arrayOfString = j(m.e());
          am am = new am(paramR);
          am.c("showPanel");
          am.b(arrayOfString[0]);
          am.a(arrayOfString[1]);
          parambE.a(am);
          continue;
        } 
        b(m, "Unrecognized entry. Ignoring.");
      } catch (Exception exception) {
        a(m, "Syntax Error.");
      } 
    } 
  }
  
  private void e(R paramR, bE parambE, J paramJ, String paramString) {
    ArrayList arrayList = a(paramJ, paramR, paramString);
    aA aA1 = null;
    aA aA2 = null;
    String str = null;
    for (M m : arrayList) {
      a(m);
      String str1 = m.b();
      try {
        if (str1.startsWith("menuDialog")) {
          str = q(str1);
          aA2 = null;
          aA1 = null;
          continue;
        } 
        if (m.f().equals("menu")) {
          aA2 = null;
          aA1 = a(parambE, m, str);
          a(paramR, m, aA1.aJ(), false);
          if (str != null && !str.equals("main")) {
            bv bv = parambE.c(str);
            if (bv == null) {
              b(m, "Menu: " + aA1.e() + " not added, menu dialog \"" + str + "\" not found");
              continue;
            } 
            bv.a(aA1);
          } 
          continue;
        } 
        if (str1.startsWith("subMenu")) {
          aA2 = null;
          if (aA1 == null) {
            a(m, "Adding subMenu before main menu defined");
            continue;
          } 
          aA aA = a(m, true);
          a(paramR, m, aA.aJ(), false);
          if (parambE.c(aA.d()) == null && c(aA.d()))
            a(paramR, aA.d(), aA.f()); 
          if (parambE.c(aA.d()) == null && !c(aA.d()) && parambE.b(aA.d()) == null)
            b(m, "Unknown Menu Target: " + aA.d()); 
          aA1.a(aA);
          continue;
        } 
        if (m.f().equals("groupMenu")) {
          if (aA1 == null) {
            a(m, "Adding groupMenu before main menu defined");
            continue;
          } 
          String str2 = m.e();
          String[] arrayOfString = j(str2);
          aA2 = new aA();
          byte b = 0;
          if (!arrayOfString[b].contains("\""))
            aA2.v(arrayOfString[b++]); 
          String str3 = f(arrayOfString[b++]);
          aA2.b(str3);
          aA2.d(str3);
          if (arrayOfString.length > b) {
            String str4 = X.b(arrayOfString[b++], "{", "");
            str4 = X.b(str4, "}", "");
            aA2.u(str4);
            a(paramR, m, aA2.aJ(), false);
          } 
          if (arrayOfString.length > b) {
            String str4 = X.b(arrayOfString[b++], "{", "");
            str4 = X.b(str4, "}", "");
            aA2.e(str4);
            a(paramR, m, aA2.aJ(), false);
          } 
          aA1.a(aA2);
          continue;
        } 
        if (m.f().equals("groupChildMenu")) {
          if (aA2 == null) {
            a(m, "Adding menuGroupChild before menuGroup defined");
            continue;
          } 
          aA aA = a(m, true);
          a(paramR, m, aA.aJ(), false);
          if (parambE.c(aA.d()) == null && c(aA.d()))
            a(paramR, aA.d(), aA.f()); 
          if (parambE.c(aA.d()) == null && !c(aA.d()) && parambE.b(aA.d()) == null)
            b(m, "Unknown Menu Target: " + aA.d()); 
          aA2.a(aA);
          continue;
        } 
        if (str1.startsWith("removeSubMenu")) {
          if (aA1 == null)
            a(m, "removeSubMenu before main menu defined"); 
          String[] arrayOfString = j(m.e());
          if (arrayOfString == null || arrayOfString.length < 1) {
            b(m, "At least 1 value refering to the target dialog is required.");
            continue;
          } 
          paramR.e().a(aA1.h(), arrayOfString[0]);
          continue;
        } 
        if (str1.startsWith("updateSubMenuLabel")) {
          if (aA1 == null)
            a(m, "updateSubMenuLabel before main menu defined"); 
          String[] arrayOfString = j(m.e());
          if (arrayOfString == null || arrayOfString.length < 2) {
            b(m, "At least 2 attributes. \"updateSubMenuLabel = [CurrentTarget], [new label]\"");
            continue;
          } 
          String str2 = f(arrayOfString[1]);
          aA1.a(aA1.h(), arrayOfString[0], str2);
          continue;
        } 
        if (str1.startsWith("replaceSubMenu")) {
          if (aA1 == null)
            a(m, "replaceSubMenu before main menu defined"); 
          String[] arrayOfString = j(m.e());
          if (arrayOfString == null || arrayOfString.length < 1) {
            b(m, "At least 3 attributes. \"replaceSubMenu = [cargetOfReplace], [newTarget], [newLabel]\"");
            continue;
          } 
          aA aA = a(m, true);
          a(paramR, m, aA.aJ(), false);
          if (parambE.c(aA.d()) == null && c(aA.d()))
            a(paramR, aA.d(), aA.f()); 
          if (parambE.c(aA.d()) == null && !c(aA.d()) && parambE.b(aA.d()) == null)
            b(m, "Unknown Menu Target: " + aA.d()); 
          aA1.a(arrayOfString[0], aA);
          continue;
        } 
        if (str1.startsWith("plugIn"))
          continue; 
        b(m, "[Menu] Row not understood, unknown keyword: " + m.f() + ". Please check syntax.");
      } catch (Exception exception) {
        a(m, "Malformed ini in " + paramString + ", I don't know how to handle.");
      } 
    } 
    paramR.a(parambE);
  }
  
  private aA a(bE parambE, M paramM, String paramString) {
    aA aA = a(paramM, false);
    for (aA aA1 : parambE.c()) {
      if (aA1.h().equals(aA.h())) {
        aA1.e(aA.i());
        aA1.u(aA.aJ());
        return aA1;
      } 
    } 
    if (paramString == null || paramString.equals("main"))
      parambE.a(aA); 
    return aA;
  }
  
  private aA a(M paramM, boolean paramBoolean) {
    String str = paramM.e();
    aA aA = new aA();
    aA.s(this.l);
    if (str.indexOf("\"     ") > 0)
      b(paramM, "Ini entry missing comma, repaired."); 
    String[] arrayOfString = j(str);
    byte b = 0;
    if (paramM.f().equals("replaceSubMenu"))
      b++; 
    if (paramBoolean) {
      String str1 = arrayOfString[b++];
      if (str1.equals("std_separator")) {
        aA.a(true);
        return aA;
      } 
      aA.a(str1);
    } 
    try {
      String str1 = "";
      String str2 = X.b(arrayOfString[b++].trim(), "\"", "");
      aA.d(str2);
      if (str2.indexOf("&") != -1) {
        int i = str2.indexOf("&");
        str1 = str2.substring(i + 1, i + 2);
        aA.c(str1);
      } 
      str2 = X.b(str2, "&", "");
      aA.b(str2);
      if (paramBoolean && arrayOfString.length > b)
        try {
          if (I.a(arrayOfString[b]))
            aA.a((int)I.b(arrayOfString[b++].trim())); 
        } catch (Exception exception) {} 
      if (arrayOfString.length > b) {
        String str3 = arrayOfString[b++];
        str3 = X.b(str3, "{", "");
        str3 = X.b(str3, "}", "").trim();
        aA.u(str3);
      } 
      if (arrayOfString.length > b) {
        String str3 = arrayOfString[b++];
        str3 = X.b(str3, "{", "");
        str3 = X.b(str3, "}", "").trim();
        aA.e(str3);
      } 
    } catch (Exception exception) {
      b(paramM, "Error paring Menu.");
      exception.printStackTrace();
    } 
    return aA;
  }
  
  private boolean a(Object paramObject, String paramString) {
    if (paramObject != null)
      return false; 
    D.b("ini error, Tried to load row: \n\t" + paramString + "\n\tbut Object not initialized.");
    return true;
  }
  
  private bj d(String paramString) {
    bj bj = new bj();
    bj.s(this.l);
    String str1 = q(paramString);
    String[] arrayOfString = j(str1);
    byte b = 0;
    String str2 = arrayOfString[b++];
    str2 = X.b(str2, "\"", "");
    if (str2 != null && !str2.equals(""))
      bj.s(str2.trim()); 
    String str3 = X.b(arrayOfString[b++], "\"", "");
    bj.a(str3);
    String str4 = arrayOfString[b++];
    bj.b(str4);
    if (arrayOfString.length > b) {
      String str = X.b(arrayOfString[b++], "{", "");
      str = X.b(str, "}", "").trim();
      bj.c(str);
    } 
    return bj;
  }
  
  private bq a(R paramR, M paramM) {
    bq bq = new bq();
    return a(paramR, paramM, bq);
  }
  
  private bq a(R paramR, M paramM, bq parambq) {
    String str1 = paramM.b();
    parambq.s(this.l);
    String str2 = q(str1);
    String[] arrayOfString = j(str2);
    byte b = 0;
    String str3 = arrayOfString[b++];
    str3 = X.b(str3, "\"", "");
    if (str3.startsWith("!")) {
      parambq.a(true);
      str3 = str3.substring(1);
    } else if (str3.startsWith("#")) {
      parambq.b(true);
      str3 = str3.substring(1);
    } 
    parambq.b(da.a().a(paramR, str3));
    if (arrayOfString.length > b) {
      String str = arrayOfString[b++];
      if (str.startsWith("{") && str.endsWith("}")) {
        try {
          db db = da.a().a(paramR, str);
          parambq.a(db);
          str = null;
        } catch (g g) {
          a(paramM, "Error in String expression");
        } 
      } else if (str.indexOf("[") > 0) {
        String str4 = str.substring(0, str.indexOf("["));
        String str5 = str.substring(str.indexOf("["));
        str5 = X.b(str5, "[", "");
        str5 = X.b(str5, "]", "");
        parambq.a(X.g(str5));
        str = str4;
      } 
      parambq.b(str);
    } 
    if (parambq instanceof bk && arrayOfString.length > b) {
      String str = arrayOfString[b++];
      if (paramR.g(str) == null) {
        b(paramM, str + " not defined as an OutputChannel! Ignored");
      } else {
        ((bk)parambq).a(str);
      } 
    } 
    if (arrayOfString.length > b) {
      String str = X.b(arrayOfString[b++], "{", "");
      str = X.b(str, "}", "").trim();
      parambq.u(str);
    } 
    if (arrayOfString.length > b) {
      String str = X.b(arrayOfString[b++], "{", "");
      str = X.b(str, "}", "").trim();
      parambq.f(str);
    } 
    if (arrayOfString.length > b) {
      String str = arrayOfString[b++];
      if (str.equals("displayInHex")) {
        parambq.e(true);
      } else {
        b(paramM, "Unknown 5th position attribute: " + str + ", known field Attribute: displayInHex");
      } 
    } 
    return parambq;
  }
  
  private bq b(R paramR, M paramM) {
    String str1 = paramM.b();
    bq bq = new bq();
    bq.s(this.l);
    String str2 = q(str1);
    String[] arrayOfString = j(str2);
    byte b = 0;
    String str3 = arrayOfString[b++];
    str3 = X.b(str3, "\"", "");
    if (str3.startsWith("!")) {
      bq.a(true);
      str3 = str3.substring(1);
    } else if (str3.startsWith("#")) {
      bq.b(true);
      str3 = str3.substring(1);
    } 
    bq.b(da.a().a(paramR, str3));
    if (arrayOfString.length > b) {
      String str = arrayOfString[b++];
      bq.b(str);
    } 
    if (arrayOfString.length > b) {
      String str = X.b(arrayOfString[b++], "{", "");
      str = X.b(str, "}", "").trim();
      bq.u(str);
    } 
    if (arrayOfString.length > b) {
      String str = X.b(arrayOfString[b++], "{", "");
      str = X.b(str, "}", "").trim();
      bq.f(str);
    } 
    if (arrayOfString.length > b) {
      String str = arrayOfString[b++];
      if (str.equals("displayInHex")) {
        bq.e(true);
      } else {
        b(paramM, "Unknown 5th position attribute: " + str + ", known field Attribute: displayInHex");
      } 
    } 
    return bq;
  }
  
  private by c(R paramR, M paramM) {
    String str1 = paramM.b();
    by by = new by();
    by.s(this.l);
    String str2 = q(str1);
    String[] arrayOfString = j(str2);
    byte b = 0;
    String str3 = arrayOfString[b++];
    if (str3.equals("horizontal")) {
      by.f(true);
    } else if (!str3.equals("vertical")) {
      b(paramM, "Orientation must be horizontal or vertical. Unknown value: " + str3);
    } 
    String str4 = arrayOfString[b++];
    str4 = X.b(str4, "\"", "");
    by.b(da.a().a(paramR, str4));
    if (arrayOfString.length > b) {
      String str = arrayOfString[b++];
      if (str.startsWith("{") && str.endsWith("}"))
        try {
          db db = da.a().a(paramR, str);
          by.a(db);
          str = null;
        } catch (g g) {
          a(paramM, "Error in String expression");
        }  
      by.b(str);
    } 
    if (arrayOfString.length > b) {
      String str = X.b(arrayOfString[b++], "{", "");
      str = X.b(str, "}", "").trim();
      by.u(str);
    } 
    if (arrayOfString.length > b) {
      String str = X.b(arrayOfString[b++], "{", "");
      str = X.b(str, "}", "").trim();
      by.f(str);
    } 
    return by;
  }
  
  private bC d(R paramR, M paramM) {
    String str1 = paramM.b();
    bC bC = new bC();
    bC.s(this.l);
    String str2 = q(str1);
    String[] arrayOfString = j(str2);
    byte b = 0;
    String str3 = arrayOfString[b++];
    str3 = X.b(str3, "\"", "");
    if (str3.startsWith("!")) {
      bC.a(true);
      str3 = str3.substring(1);
    } else if (str3.startsWith("#")) {
      bC.b(true);
      str3 = str3.substring(1);
    } 
    bC.b(da.a().a(paramR, str3));
    if (arrayOfString.length > b) {
      String str = arrayOfString[b++];
      if (str.indexOf("[") > 0) {
        String str4 = str.substring(0, str.indexOf("["));
        String str5 = str.substring(str.indexOf("["));
        str5 = X.b(str5, "[", "");
        str5 = X.b(str5, "]", "");
        bC.a(X.g(str5));
        str = str4;
      } 
      bC.b(str);
    } 
    if (arrayOfString.length > b) {
      String str = arrayOfString[b++];
      if (str.equals("horizontal")) {
        bC.c(bC.a);
      } else if (str.equals("vertical")) {
        bC.c(bC.b);
      } else {
        b(paramM, "Unknown Slider orientation: " + str + ", valid values: (horizontal, vertical). using default: horizontal");
        bC.c(bC.a);
      } 
    } 
    if (arrayOfString.length > b) {
      String str = X.b(arrayOfString[b++], "{", "");
      str = X.b(str, "}", "").trim();
      bC.u(str);
    } 
    return bC;
  }
  
  private E e(R paramR, M paramM) {
    E e = new E();
    e.s(this.l);
    String[] arrayOfString = j(paramM.e());
    e.b(da.a().a(paramR, arrayOfString[0]));
    e.a(arrayOfString[1]);
    e.b(arrayOfString[2]);
    byte b = 3;
    while (arrayOfString.length > b && !arrayOfString[b].trim().startsWith("{")) {
      if (b == 3) {
        String str1 = arrayOfString[b++];
        e.c(str1);
        continue;
      } 
      String str = arrayOfString[b++];
      try {
        e.d(str);
      } catch (g g) {
        b(paramM, g.getLocalizedMessage());
      } 
    } 
    if (arrayOfString.length > b) {
      String str = arrayOfString[b++];
      str = X.b(str, "{", "");
      str = X.b(str, "}", "");
      e.u(str);
    } 
    if (arrayOfString.length > b) {
      String str = arrayOfString[b++];
      str = X.b(str, "{", "");
      str = X.b(str, "}", "");
      e.f(str);
    } 
    return e;
  }
  
  private D f(R paramR, M paramM) {
    D d = new D();
    d.s(this.l);
    String[] arrayOfString = j(paramM.e());
    d.b(da.a().a(paramR, arrayOfString[0]));
    d.a(arrayOfString[1]);
    if (arrayOfString.length > 2) {
      String str = arrayOfString[2];
      str = X.b(str, "{", "");
      str = X.b(str, "}", "");
      d.u(str);
    } 
    if (arrayOfString.length > 3) {
      String str = arrayOfString[3];
      str = X.b(str, "{", "");
      str = X.b(str, "}", "");
      d.f(str);
    } 
    return d;
  }
  
  private C g(R paramR, M paramM) {
    C c = new C();
    c.s(this.l);
    String[] arrayOfString = j(paramM.e());
    c.b(da.a().a(paramR, arrayOfString[0]));
    c.a(arrayOfString[1]);
    if (arrayOfString.length > 2) {
      String str = arrayOfString[2];
      str = X.b(str, "{", "");
      str = X.b(str, "}", "");
      c.u(str);
    } 
    if (arrayOfString.length > 3) {
      String str = arrayOfString[3];
      str = X.b(str, "{", "");
      str = X.b(str, "}", "");
      c.f(str);
    } 
    return c;
  }
  
  protected void a(R paramR, M paramM, String paramString, boolean paramBoolean) {
    a(paramR, paramM, paramString, (String)null, paramBoolean);
  }
  
  protected void a(R paramR, M paramM, String paramString1, String paramString2, boolean paramBoolean) {
    if (a() && paramString1 != null && !paramString1.equals("")) {
      if (paramString1.startsWith("{"))
        paramString1 = paramString1.substring(1, paramString1.length() - 1); 
      try {
        if (paramString1.contains("%INDEX%"))
          paramString1 = X.b(paramString1, "%INDEX%", "0"); 
        double d = i.a(paramString1, (aI)paramR);
      } catch (Exception exception) {
        if (exception instanceof java.io.FileNotFoundException) {
          a(paramM, exception.getLocalizedMessage());
        } else if (!(exception instanceof ax.u)) {
          String str = (paramString2 == null) ? exception.getMessage() : (paramString2 + " \n" + exception.getMessage());
          if (paramBoolean) {
            Logger.getLogger(ab.class.getName()).log(Level.WARNING, paramString2, exception);
            a(paramM, str);
          } else {
            b(paramM, str);
          } 
        } 
      } catch (StackOverflowError stackOverflowError) {
        a(paramM, "Circular Dependency! Formula can not reference itself.");
      } 
    } 
  }
  
  protected void a(R paramR, bR parambR, String paramString1, String paramString2, boolean paramBoolean) {
    if (a() && parambR != null && parambR.c() != null && !parambR.c().equals("")) {
      if (paramString1.equals("toggleSwitchOn"))
        D.c("break: 48s35"); 
      try {
        String str = parambR.c();
        if (str.contains("%INDEX%"))
          str = X.b(str, "%INDEX%", "0"); 
        double d = i.a(str, (aI)paramR);
      } catch (Exception exception) {
        if (!(exception instanceof ax.u)) {
          String str = "expression error in ini entry for " + paramString1 + ", attribute: " + paramString2 + "\n" + exception.getMessage();
          exception.printStackTrace();
          if (paramBoolean) {
            D.a(str);
          } else {
            D.b(str);
          } 
        } 
      } catch (StackOverflowError stackOverflowError) {
        String str = "Circular Dependency! Formula can not reference itself. Ini entry " + paramString1 + ", attribute: " + paramString2 + ", expression:" + parambR.c();
        D.a(str);
      } 
    } 
  }
  
  private void e(R paramR, J paramJ) {
    ArrayList<M> arrayList = a(paramJ, paramR, "OutputChannels");
    M m = null;
    int i = 0;
    int j = 0;
    byte b;
    for (b = 0; b < arrayList.size(); b++) {
      try {
        m = arrayList.get(b);
        String str = m.f();
        if (str.equals("scatteredOffsetArray")) {
          aM aM = paramR.c(m.e());
          if (aM == null) {
            a(m, "Constant Not Found: " + m.e());
          } else if (!aM.i().equals("array")) {
            a(m, "scatteredOffsetArray must be of type array");
          } else {
            paramR.O().p(m.e());
          } 
        } else if (str.equals("scatteredGetEnabled")) {
          dj dj = dk.a((aI)paramR, m.e());
          paramR.O().e(dj);
        } else if (!F.a(str)) {
          aH aH = a(m, paramR, i, j);
          boolean bool = (paramR.O() == null || paramR.O().e()) ? true : false;
          aH.a(bool);
          paramR.a(aH);
          if (!aH.b().equals("formula")) {
            i = aH.a() + aH.l();
            j = aH.a();
          } 
        } 
      } catch (Exception exception) {
        a(m, "Malformed [OutputChannel] entry");
      } 
    } 
    for (b = 0; b < arrayList.size(); b++) {
      try {
        m = arrayList.get(b);
        String str = m.f();
        if (!F.a(str) && !str.equals("scatteredOffsetArray") && !str.equals("scatteredGetEnabled")) {
          aH aH = paramR.g(str);
          if (aH != null && aH.k() != null && !aH.k().contains("AppEvent."))
            a(paramR, m, aH.k(), true); 
          if (aH.g() instanceof bR) {
            bR bR = (bR)aH.g();
            a(paramR, m, bR.c(), true);
          } 
          if (aH.j() instanceof bR) {
            bR bR = (bR)aH.j();
            a(paramR, m, bR.c(), true);
          } 
        } 
      } catch (Exception exception) {
        a(m, "Malformed [OutputChannel] entry");
      } 
    } 
  }
  
  private void c(R paramR, J paramJ, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: aload_1
    //   3: aload_3
    //   4: invokevirtual a : (LW/J;LG/R;Ljava/lang/String;)Ljava/util/ArrayList;
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
    //   26: invokestatic a : ()LG/h;
    //   29: new java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial <init> : ()V
    //   36: aload_1
    //   37: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   40: ldc_w '_Replay'
    //   43: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: invokevirtual toString : ()Ljava/lang/String;
    //   49: invokevirtual a : (Ljava/lang/String;)LG/aI;
    //   52: astore #9
    //   54: aload #9
    //   56: ifnonnull -> 77
    //   59: new H/e
    //   62: dup
    //   63: aload_1
    //   64: invokespecial <init> : (LG/R;)V
    //   67: astore #9
    //   69: invokestatic a : ()LG/h;
    //   72: aload #9
    //   74: invokevirtual a : (LG/aI;)V
    //   77: invokestatic a : ()LG/h;
    //   80: new java/lang/StringBuilder
    //   83: dup
    //   84: invokespecial <init> : ()V
    //   87: aload_1
    //   88: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   91: ldc_w '_ExtendedReplay'
    //   94: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: invokevirtual toString : ()Ljava/lang/String;
    //   100: invokevirtual a : (Ljava/lang/String;)LG/aI;
    //   103: astore #10
    //   105: aload #10
    //   107: ifnonnull -> 128
    //   110: new H/d
    //   113: dup
    //   114: aload_1
    //   115: invokespecial <init> : (LG/R;)V
    //   118: astore #10
    //   120: invokestatic a : ()LG/h;
    //   123: aload #10
    //   125: invokevirtual a : (LG/aI;)V
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
    //   155: invokevirtual f : ()Ljava/lang/String;
    //   158: astore #12
    //   160: aload #12
    //   162: ldc_w 'replayConfigTable'
    //   165: invokevirtual equals : (Ljava/lang/Object;)Z
    //   168: ifeq -> 261
    //   171: aload_1
    //   172: aload #5
    //   174: invokevirtual e : ()Ljava/lang/String;
    //   177: invokevirtual c : (Ljava/lang/String;)LG/aM;
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
    //   214: invokespecial b : (LW/M;Ljava/lang/String;)V
    //   217: goto -> 258
    //   220: aload #13
    //   222: invokevirtual i : ()Ljava/lang/String;
    //   225: ldc_w 'array'
    //   228: invokevirtual equals : (Ljava/lang/Object;)Z
    //   231: ifne -> 246
    //   234: aload_0
    //   235: aload #5
    //   237: ldc_w 'replayConfigTable must be of type array'
    //   240: invokespecial a : (LW/M;Ljava/lang/String;)V
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
    //   278: invokestatic a : (LG/aI;Ljava/lang/String;)LG/dj;
    //   281: astore #13
    //   283: aload_1
    //   284: invokevirtual O : ()LG/F;
    //   287: aload #13
    //   289: invokevirtual f : (LG/dj;)V
    //   292: goto -> 502
    //   295: aload #12
    //   297: ldc_w 'replayRecordLength'
    //   300: invokevirtual equals : (Ljava/lang/Object;)Z
    //   303: ifeq -> 329
    //   306: aload_1
    //   307: aload #5
    //   309: invokevirtual e : ()Ljava/lang/String;
    //   312: invokestatic a : (LG/aI;Ljava/lang/String;)LG/dj;
    //   315: astore #13
    //   317: aload_1
    //   318: invokevirtual O : ()LG/F;
    //   321: aload #13
    //   323: invokevirtual g : (LG/dj;)V
    //   326: goto -> 502
    //   329: aload #12
    //   331: invokestatic a : (Ljava/lang/String;)Z
    //   334: ifne -> 502
    //   337: iload #8
    //   339: ifeq -> 360
    //   342: aload_0
    //   343: aload #5
    //   345: aload_1
    //   346: iload #6
    //   348: iload #7
    //   350: aload #10
    //   352: invokespecial a : (LW/M;LG/R;IILG/aI;)LG/bb;
    //   355: astore #13
    //   357: goto -> 375
    //   360: aload_0
    //   361: aload #5
    //   363: aload_1
    //   364: iload #6
    //   366: iload #7
    //   368: aload #9
    //   370: invokespecial a : (LW/M;LG/R;IILG/aI;)LG/bb;
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
    //   402: invokevirtual a : (Z)V
    //   405: aload_3
    //   406: ldc_w 'Replay'
    //   409: invokevirtual equals : (Ljava/lang/Object;)Z
    //   412: ifeq -> 424
    //   415: aload_1
    //   416: aload #13
    //   418: invokevirtual a : (LG/bb;)V
    //   421: goto -> 468
    //   424: aload_3
    //   425: ldc 'ExtendedReplay'
    //   427: invokevirtual equals : (Ljava/lang/Object;)Z
    //   430: ifeq -> 442
    //   433: aload_1
    //   434: aload #13
    //   436: invokevirtual b : (LG/bb;)V
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
    //   465: invokespecial a : (LW/M;Ljava/lang/String;)V
    //   468: aload #13
    //   470: invokevirtual b : ()Ljava/lang/String;
    //   473: ldc_w 'formula'
    //   476: invokevirtual equals : (Ljava/lang/Object;)Z
    //   479: ifne -> 502
    //   482: aload #13
    //   484: invokevirtual a : ()I
    //   487: aload #13
    //   489: invokevirtual l : ()I
    //   492: iadd
    //   493: istore #6
    //   495: aload #13
    //   497: invokevirtual a : ()I
    //   500: istore #7
    //   502: goto -> 516
    //   505: astore #12
    //   507: aload_0
    //   508: aload #5
    //   510: ldc_w 'Malformed [Replay] entry'
    //   513: invokespecial a : (LW/M;Ljava/lang/String;)V
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
    //   549: invokevirtual f : ()Ljava/lang/String;
    //   552: astore #12
    //   554: aload #12
    //   556: invokestatic a : (Ljava/lang/String;)Z
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
    //   603: invokevirtual i : (Ljava/lang/String;)LG/bb;
    //   606: astore #13
    //   608: goto -> 619
    //   611: aload_1
    //   612: aload #12
    //   614: invokevirtual h : (Ljava/lang/String;)LG/bb;
    //   617: astore #13
    //   619: aload #13
    //   621: ifnull -> 632
    //   624: aload #13
    //   626: invokevirtual k : ()Ljava/lang/String;
    //   629: ifnull -> 632
    //   632: aload #13
    //   634: invokevirtual g : ()LG/dj;
    //   637: instanceof G/bR
    //   640: ifeq -> 666
    //   643: aload #13
    //   645: invokevirtual g : ()LG/dj;
    //   648: checkcast G/bR
    //   651: astore #14
    //   653: aload_0
    //   654: aload_1
    //   655: aload #5
    //   657: aload #14
    //   659: invokevirtual c : ()Ljava/lang/String;
    //   662: iconst_1
    //   663: invokevirtual a : (LG/R;LW/M;Ljava/lang/String;Z)V
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
    //   693: invokevirtual c : ()Ljava/lang/String;
    //   696: iconst_1
    //   697: invokevirtual a : (LG/R;LW/M;Ljava/lang/String;Z)V
    //   700: goto -> 714
    //   703: astore #12
    //   705: aload_0
    //   706: aload #5
    //   708: ldc_w 'Malformed [Replay] entry'
    //   711: invokespecial a : (LW/M;Ljava/lang/String;)V
    //   714: iinc #11, 1
    //   717: goto -> 525
    //   720: return
    // Exception table:
    //   from	to	target	type
    //   141	502	505	java/lang/Exception
    //   535	700	703	java/lang/Exception
  }
  
  private void f(R paramR, J paramJ) {
    ArrayList<M> arrayList = a(paramJ, paramR, "GaugeConfigurations");
    String str = null;
    M m = null;
    for (byte b = 0; b < arrayList.size(); b++) {
      try {
        m = arrayList.get(b);
        a(m);
        if (m.b().startsWith("gaugeCategory")) {
          str = m.e();
          str = X.b(str, "\"", "");
        } else {
          ah ah = j(paramR, m);
          ah.d(str);
          if (!b(paramR, ah.i()))
            b(m, "[GaugeConfigurations] gauge template assigned to undefined OutputChannel: " + ah.i()); 
          paramR.a(ah);
        } 
      } catch (Exception exception) {
        b(m, exception.getMessage() + ", Gauge Entry ignored.");
      } 
    } 
  }
  
  private boolean b(R paramR, String paramString) {
    return (paramString != null && (paramR.g(paramString) != null || paramString.equals("veTuneValue")));
  }
  
  private void g(R paramR, J paramJ) {
    ArrayList arrayList = a(paramJ, paramR, "TuningViews");
    f f = new f(paramR, c, paramJ.d());
    byte b = 0;
    for (M m : arrayList) {
      String str = m.f();
      if (str.equals("tuningView")) {
        String[] arrayOfString = j(q(m.e()));
        if (arrayOfString.length < 4) {
          b(m, "Invalid Entry! tuningView requires 4 parameters.\nFormat:\n   tuningView = referenceName, \"User Title\", [md5 of decoded data], {optional enableCondition}");
          continue;
        } 
        try {
          byte b1 = 0;
          bf bf = new bf(f);
          bf.v(arrayOfString[b1++]);
          String str1 = f(arrayOfString[b1++]);
          bf.c(str1);
          bf.b(arrayOfString[b1++]);
          String str2 = arrayOfString[b1++].trim();
          if (str2.startsWith("{")) {
            String str3 = str2;
            str3 = X.b(str3, "{", "");
            str3 = X.b(str3, "}", "");
            bf.u(str3);
          } 
          bf.a(b++);
          paramR.a(bf);
        } catch (Exception exception) {
          b(m, "Invalid TuningView Entry! Unable to parse: " + exception.getLocalizedMessage());
        } 
        continue;
      } 
      b(m, "Invalid Entry! Unknown entry: " + str);
    } 
  }
  
  private void d(R paramR, J paramJ, String paramString) {
    ArrayList arrayList = a(paramJ, paramR, "EncodedData");
    for (M m : arrayList) {
      String str = m.f();
      if (paramString != null && str.equals(paramString)) {
        String str1 = m.e();
        if (str1 != null && !str1.isEmpty()) {
          bP bP = new bP(str);
          bP.a(str1);
          paramR.a(bP);
          continue;
        } 
        b(m, "Now Encoded Data found for: " + str);
      } 
    } 
  }
  
  private void h(R paramR, J paramJ) {
    ArrayList arrayList = a(paramJ, paramR, "DatalogViews");
    byte b = 0;
    String str = "Default";
    x x = new x();
    x.a(str);
    x.a(b++);
    boolean bool = false;
    for (M m : arrayList) {
      String str1 = m.f();
      if (str1.startsWith("graph")) {
        try {
          String str2 = f(m.e());
          boolean bool1 = false;
          for (ac ac1 : paramR.g()) {
            if (ac1.aL().equals(str2)) {
              bool1 = true;
              break;
            } 
          } 
          if (!bool1)
            b(m, "No field by this name found in the [Datalog] section."); 
          String str3 = str1.substring(str1.indexOf("h") + 1);
          int i = Integer.parseInt(str3.substring(0, str3.indexOf(".")));
          int j = Integer.parseInt(str3.substring(str3.indexOf(".") + 1));
          y y = new y(str2, i, j);
          x.a(y);
          if (!bool && x.a().equals("Default") && !x.b().isEmpty()) {
            paramR.a(x);
            bool = true;
          } 
        } catch (Exception exception) {
          b(m, "Invalid graph definition. Should be format: graphX.Y  Example: graph0.1");
        } 
        continue;
      } 
      if (str1.equals("logViewName")) {
        str = f(m.e());
        x = new x();
        byte b1 = 1;
        if (paramR.B(str) != null) {
          b(m, "Each Data logViewName must be unique!");
          String str2 = str;
          do {
            str = str2 + b1++;
          } while (paramR.B(str) != null);
        } 
        x.a(str);
        x.a(b++);
        paramR.a(x);
        continue;
      } 
      if (str1.equals("defaultSmoothing")) {
        String[] arrayOfString = j(q(m.e()));
        String str2 = f(arrayOfString[0]);
        try {
          cb.a().a(str2, Integer.parseInt(arrayOfString[1]));
        } catch (Exception exception) {
          b(m, "Syntax Error. Proper usage:\n   defaultSmoothing = \"FieldName\", 5");
        } 
        continue;
      } 
      b(m, "Syntax Error. Do not know how to handle this line.");
    } 
  }
  
  private void i(R paramR, J paramJ) {
    ArrayList<M> arrayList = a(paramJ, paramR, "Datalog");
    ArrayList<String> arrayList1 = new ArrayList();
    M m = null;
    int i = 0;
    int j = 0;
    String str = null;
    for (byte b = 0; b < arrayList.size(); b++) {
      try {
        m = arrayList.get(b);
        String str1 = m.b();
        if (!str1.startsWith("delimiter"))
          if (str1.startsWith("internalLogField")) {
            al al = a(m, (aI)paramR, i, j);
            paramR.a(al);
            i = al.a() + al.l();
            j = al.a();
          } else if (!str1.startsWith("defaultExtension")) {
            if (str1.startsWith("entry")) {
              ac ac1 = k(paramR, m);
              if (this.j && arrayList1.contains(ac1.b()) && (ac1.aJ() == null || ac1.aJ().isEmpty()))
                b(m, "Duplicate Data Log Field naming, the header " + ac1.b() + "has already been defined."); 
              if (paramR.g(ac1.a()) == null && !cu.a().e(ac1.a())) {
                a(m, "DataLog entry references non existent OutputChannel, ignored.");
              } else {
                if (this.j)
                  arrayList1.add(ac1.b()); 
                paramR.a(ac1);
              } 
              if (ac1.aJ() != null && !ac1.aJ().equals(""))
                a(paramR, m, ac1.aJ(), false); 
              if (str != null)
                ac1.e(str); 
            } else if (m.f().equals("category")) {
              str = f(m.e());
              if (str.length() > 34) {
                b(m, "DataLogField category cannot be more than 34 in length. Truncating: " + str);
                str = str.substring(0, 33);
              } 
            } else {
              b(m, "Unrecognized DataLog entry.");
            } 
          }  
      } catch (Exception exception) {
        a(m, exception.getMessage() + "\nDatalog Entry ignored.");
      } 
    } 
  }
  
  private void c(R paramR, bE parambE, J paramJ) {
    ArrayList<M> arrayList = a(paramJ, paramR, "FTPBrowser");
    M m = null;
    bo bo = null;
    for (byte b = 0; b < arrayList.size(); b++) {
      try {
        m = arrayList.get(b);
        String str1 = m.f();
        String str2 = m.e();
        if (str1.equals("ftpBrowser")) {
          bo = new bo();
          String[] arrayOfString = j(q(str2));
          bo.v(arrayOfString[0]);
          bo.s(arrayOfString[1]);
          if (arrayOfString.length > 2)
            bo.u(arrayOfString[2]); 
          parambE.a((bv)bo);
        } else if (str1.equals("host")) {
          bo.a(q(str2));
        } else if (str1.equals("port")) {
          bo.a(X.g(str2));
        } else if (str1.equals("user")) {
          bo.b(str2);
        } else if (str1.equals("password")) {
          bo.c(str2);
        } else if (str1.equals("passiveMode")) {
          bo.a(str2.equalsIgnoreCase("true"));
        } else if (str1.equals("browseEnable")) {
          String[] arrayOfString = j(q(str2));
          String str3 = f(arrayOfString[0]);
          String str4 = arrayOfString[1].trim();
          str4 = X.b(str4, "{", "");
          str4 = X.b(str4, "}", "");
          bo.a(str4, str3);
        } else if (str1.equals("readWriteEnable")) {
          String[] arrayOfString = j(q(str2));
          String str3 = f(arrayOfString[0]);
          String str4 = arrayOfString[1].trim();
          str4 = X.b(str4, "{", "");
          str4 = X.b(str4, "}", "");
          a(paramR, m, str4, true);
          bo.b(str4, str3);
        } else {
          b(m, "Unrecognized DataLog entry.");
        } 
      } catch (NullPointerException nullPointerException) {
        a(m, "ftpBrowser must be defined before other attributes!\nftpBrowser = referenceName, \"Title\", enableCondition");
      } catch (Exception exception) {
        a(m, exception.getMessage() + "\nEntry ignored.");
      } 
    } 
  }
  
  private void j(R paramR, J paramJ) {
    ArrayList<M> arrayList = a(paramJ, paramR, "TableEditor");
    be be = null;
    bi bi = null;
    for (byte b1 = 0; b1 < arrayList.size(); b1++) {
      M m = arrayList.get(b1);
      String str = m.b();
      try {
        if (str.startsWith("table")) {
          be = new be();
          be.s(this.l);
          bi = new bi();
          String[] arrayOfString1 = j(q(str));
          be.v(arrayOfString1[0]);
          bi.a(arrayOfString1[0]);
          bi.v(arrayOfString1[1]);
          db db = da.a().a(paramR, arrayOfString1[2]);
          be.d(db);
          bi.s(arrayOfString1[2]);
          paramR.a(be);
          paramR.a(bi);
          if (paramR.e() != null)
            paramR.e().a((bv)be); 
        } else if (str.startsWith("xBins")) {
          if (be == null)
            throw new g("Error in [TableEditor] Section, 1st row should be table = XXX, found \n" + m); 
          String[] arrayOfString1 = j(q(str));
          be.a(arrayOfString1[0]);
          be.d(arrayOfString1[1]);
          be.f(arrayOfString1[1].toUpperCase());
          if (paramR.c(be.a()) == null)
            b(m, "Table: " + be.aL() + ", Assigned xBin not found: " + be.a()); 
          if (be.d() != null && be.d().length() > 0 && paramR.g(be.d()) == null)
            b(m, "Table: " + be.aL() + ", Assigned xBin Channel not found: " + be.d()); 
          if (arrayOfString1.length > 2 && arrayOfString1[2].equals("readOnly"))
            be.b(true); 
        } else if (str.startsWith("yBins")) {
          if (be == null)
            throw new g("Error in [TableEditor] Section, 1st row should be table = XXX, found \n" + m); 
          String[] arrayOfString1 = j(q(str));
          be.b(arrayOfString1[0]);
          be.e(arrayOfString1[1]);
          be.g(arrayOfString1[1].toUpperCase());
          if (paramR.c(be.b()) == null)
            b(m, "Table: " + be.aL() + ", Assigned y Bin not found: " + be.b()); 
          if (be.f() != null && be.f().length() > 0 && paramR.g(be.f()) == null)
            b(m, "Table: " + be.aL() + ", Assigned y Bin Channel not found: " + be.f()); 
          if (arrayOfString1.length > 2 && arrayOfString1[2].equals("readOnly"))
            be.c(true); 
        } else if (str.startsWith("zBins")) {
          if (be == null)
            throw new g("Error in [TableEditor] Section, 1st row should be table = XXX, found \n" + m); 
          be.c(q(str));
          if (paramR.c(be.c()) == null)
            b(m, "Table: " + be.aL() + ", Assigned y Bin not found: " + be.c()); 
        } else if (str.startsWith("upDownLabel")) {
          if (be == null)
            throw new g("Error in [TableEditor] Section, 1st row should be table = XXX, found \n" + m); 
          String[] arrayOfString1 = j(q(str));
          be.a(arrayOfString1);
        } else if (str.startsWith("gridOrient")) {
          if (be == null)
            throw new g("Error in [TableEditor] Section, 1st row should be table = XXX, found \n" + m); 
          String[] arrayOfString1 = j(q(str));
          bi.b(360 - X.g(arrayOfString1[0]) + 90);
          bi.a(360 - X.g(arrayOfString1[2]));
        } else if (str.startsWith("topicHelp")) {
          if (be == null)
            throw new g("Error in [TableEditor] Section, 1st row should be table = XXX, found \n" + m); 
          db db = da.a().a(paramR, q(str));
          be.e(db);
          if (bi != null)
            bi.e(db); 
          String str1 = f(q(str));
          if (str1.startsWith("http:/") || str1.startsWith("file:/")) {
            aj aj = new aj();
            aj.a(db);
            aj.b(db);
            if (be.M() != null && be.M().length() > 0) {
              aj.b(be.M());
            } else {
              aj.b("Web Help");
            } 
            paramR.e().a(aj);
          } 
        } else if (str.startsWith("xyLabels")) {
          String[] arrayOfString1 = j(q(str));
          if (arrayOfString1.length > 2)
            b(m, "Extra attributes, ignoring."); 
          if (arrayOfString1.length > 0) {
            db db = da.a().a(paramR, arrayOfString1[0]);
            be.a(db);
          } 
          if (arrayOfString1.length > 1) {
            db db = da.a().a(paramR, arrayOfString1[1]);
            be.b(db);
          } 
        } else if (m.f().equals("userPassword")) {
          String str1 = m.e();
          aM aM = paramR.c(str1);
          if (aM != null && aM.z() >= 4) {
            be.z(str1);
            paramR.c(true);
          } else {
            b(m, "Invalid value for userPassword Parameter. Must be the name of a defined U32 Constant. Invalid Value: " + str1);
          } 
        } else if (!str.startsWith("gridHeight")) {
          b(m, "Do not understand row, no known keyword.");
        } 
      } catch (g g) {
        b(m, g.getMessage());
      } catch (Exception exception) {
        exception.printStackTrace();
        String str1 = "Error in [TableEditor] Section, I don't know how to handle this line.";
        a(m, str1);
        throw new g(str1);
      } 
    } 
    arrayList = a(paramJ, paramR, "Tuning");
    ArrayList<String> arrayList1 = new ArrayList();
    for (byte b2 = 0; b2 < arrayList.size(); b2++) {
      String str = ((M)arrayList.get(b2)).b();
      try {
        if (str.startsWith("gauge") && !str.startsWith("gaugeColumns")) {
          String[] arrayOfString1 = j(q(str));
          arrayList1.add(arrayOfString1[0]);
        } 
      } catch (Exception exception) {
        b(arrayList.get(b2), "Unable to load Table Gauges");
      } 
    } 
    String[] arrayOfString = new String[arrayList1.size()];
    for (byte b3 = 0; b3 < arrayList1.size(); b3++)
      arrayOfString[b3] = arrayList1.get(b3); 
    if (arrayOfString.length > 0) {
      Iterator<bi> iterator = paramR.o();
      while (iterator.hasNext())
        paramR.a(((bi)iterator.next()).aL(), arrayOfString); 
      paramR.a("Default", arrayOfString);
    } 
  }
  
  public void a(R paramR, J paramJ) {
    ArrayList<M> arrayList = a(paramJ, paramR, "VerbiageOverride");
    arrayList = a(arrayList, paramR);
    M m = null;
    try {
      for (byte b = 0; b < arrayList.size(); b++) {
        m = arrayList.get(b);
        String str1 = m.f();
        str1 = X.b(str1, "\"", "");
        String str2 = m.e();
        str2 = X.b(str2, "\"", "");
        paramR.c(str1, str2);
      } 
    } catch (Exception exception) {
      b(m, "Verbiage Over-ride not formatted properly, ignoring.");
    } 
  }
  
  public void b(R paramR, J paramJ) {
    ArrayList<M> arrayList = a(paramJ, paramR, "VeAnalyze");
    arrayList = a(arrayList, paramR);
    dm dm = null;
    de de = null;
    M m = null;
    String str = null;
    for (byte b = 0; b < arrayList.size(); b++) {
      m = arrayList.get(b);
      str = m.b();
      try {
        if (str.startsWith("veAnalyzeMap")) {
          String[] arrayOfString = j(q(str));
          dm = new dm();
          dm = a(paramR, dm, arrayOfString);
          paramR.a(dm);
          de = null;
        } else {
          de de1;
          if (str.startsWith("trimAnalyzeMap")) {
            String[] arrayOfString = j(q(str));
            de = new de();
            de = (de)a(paramR, (dm)de, arrayOfString);
            paramR.a(de);
            de1 = de;
          } else if (str.startsWith("trimTable")) {
            if (de == null) {
              b(m, "Found trimTable, but trimAnalyzeMap must be defined 1st.");
            } else {
              df df = h(paramR, m);
              de.a(df);
            } 
          } else if (str.startsWith("filter")) {
            aW aW = i(paramR, m);
            de1.a(aW);
          } else if (str.startsWith("option")) {
            String str1 = m.e();
            try {
              de1.n(str1);
            } catch (g g) {
              b(m, g.getMessage());
            } 
          } else if (str.startsWith("lambdaTargetTables")) {
            String[] arrayOfString = j(q(str));
            for (byte b1 = 0; b1 < arrayOfString.length; b1++)
              de1.i(arrayOfString[b1].trim()); 
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
            float f = Float.parseFloat(m.e());
            de1.a(f);
          } else {
            b(m, "Unrecognised row in [VeAnaltyzeMaps] section. I don't know how to handle this and will ignore");
          } 
        } 
      } catch (Exception exception) {
        a(m, "Error in section [VeAnalyzeMaps], unable to parse ini row. Error: " + exception.getLocalizedMessage());
      } 
    } 
  }
  
  public void c(R paramR, J paramJ) {
    ArrayList<M> arrayList = a(paramJ, paramR, "WueAnalyze");
    arrayList = a(arrayList, paramR);
    dp dp = null;
    M m = null;
    String str = null;
    for (byte b = 0; b < arrayList.size(); b++) {
      m = arrayList.get(b);
      str = m.b();
      try {
        if (str.startsWith("wueAnalyzeMap")) {
          String[] arrayOfString = j(q(str));
          dp = a(paramR, arrayOfString);
          paramR.a(dp);
        } else if (str.startsWith("filter")) {
          aW aW = i(paramR, m);
          dp.a(aW);
        } else if (str.startsWith("option")) {
          String str1 = m.e();
          try {
            dp.k(str1);
          } catch (g g) {
            b(m, g.getMessage());
          } 
        } else if (str.startsWith("lambdaTargetTables")) {
          String[] arrayOfString = j(q(str));
          for (byte b1 = 0; b1 < arrayOfString.length; b1++)
            dp.j(arrayOfString[b1]); 
        } else if (str.startsWith("wuePercentOffset")) {
          float f = Float.parseFloat(m.e());
          dp.a(f);
        } else {
          b(m, "Unrecognised row in [WueAnaltyzeMaps] section. I don't know how to handle this and will ignore");
        } 
      } catch (g g) {
        a(m, "Error in section [WueAnalyzeMaps]: " + g.getLocalizedMessage());
      } catch (Exception exception) {
        a(m, "Error in section [WueAnalyzeMaps], unable to parse ini row");
      } 
    } 
  }
  
  private df h(R paramR, M paramM) {
    df df = new df();
    String[] arrayOfString = j(paramM.e());
    if (arrayOfString.length < 3) {
      a(paramM, "trimTable requires 3 parameters: trimTable = tableName,  label, afrChannel, egoCorr, enableCondition(optional), or trimTable = tableName, label, egoSensorIndexEpression,  enableCondition");
    } else {
      df.a(arrayOfString[0]);
      df.e(f(arrayOfString[1]));
      if (arrayOfString[2].trim().startsWith("{")) {
        String str = arrayOfString[2];
        str = X.b(str, "{", "");
        str = X.b(str, "}", "");
        df.f(str);
        if (arrayOfString.length > 3) {
          String str1 = arrayOfString[3];
          str1 = X.b(str1, "{", "");
          str1 = X.b(str1, "}", "");
          df.d(str1);
        } 
      } else {
        df.b(arrayOfString[2]);
        df.c(arrayOfString[3]);
        if (paramR.g(df.c()) == null)
          b(paramM, "Trim Table lambda/afr channel " + df.c() + " not found!"); 
        if (paramR.g(df.d()) == null)
          b(paramM, "Trim Table EGO Correction channel " + df.d() + " not found!"); 
        if (arrayOfString.length > 4) {
          String str = arrayOfString[4];
          str = X.b(str, "{", "");
          str = X.b(str, "}", "");
          df.d(str);
        } 
      } 
    } 
    return df;
  }
  
  private aW i(R paramR, M paramM) {
    String str = paramM.b();
    String[] arrayOfString = j(q(str));
    aW aW = new aW();
    if ("std_Expression".equals(arrayOfString[0])) {
      aW.a(256);
      aW.v(arrayOfString[0]);
      aW.d(X.b(arrayOfString[1], "\"", ""));
      String str1 = X.b(arrayOfString[2], "{", "");
      str1 = X.b(str1, "}", "");
      aW.e(str1);
      aW.a(Boolean.parseBoolean(arrayOfString[3]));
      a(paramR, paramM, str1, false);
      return aW;
    } 
    if (aW.c(arrayOfString[0])) {
      aW.a(256);
      aW.v(arrayOfString[0]);
      return aW;
    } 
    aW.v(arrayOfString[0]);
    aW.d(X.b(arrayOfString[1], "\"", ""));
    aW.a(arrayOfString[2]);
    aW.b(arrayOfString[3]);
    try {
      dj dj = dk.a((aI)paramR, arrayOfString[4]);
      aW.a(dj);
    } catch (g g) {
      b(paramM, "Failed to parse qualifying value or expression.");
    } 
    aW.a(Boolean.parseBoolean(arrayOfString[5]));
    return aW;
  }
  
  private dm a(R paramR, dm paramdm, String[] paramArrayOfString) {
    paramdm.b(paramArrayOfString[0]);
    paramdm.c(paramArrayOfString[1]);
    paramdm.m(paramArrayOfString[1]);
    if (paramArrayOfString.length > 2) {
      paramdm.e(paramArrayOfString[2]);
    } else {
      throw new g("Error loading VeAnalyzeMap for " + paramdm.b() + " There is no lambdaChannel defined.");
    } 
    if (paramArrayOfString.length > 3)
      paramdm.f(paramArrayOfString[3]); 
    if (paramArrayOfString.length > 4) {
      String str = X.b(paramArrayOfString[4], "{", "");
      str = X.b(str, "}", "");
      paramdm.d(str);
    } 
    be be1 = (be)paramR.e().c(paramdm.b());
    if (be1 == null)
      throw new g("Error loading VeAnalyzeMap, the table " + paramdm.b() + " not found in current configuration. Was it loaded yet?"); 
    be be2 = (be)paramR.e().c(paramdm.c());
    if (be2 == null && !paramdm.c().endsWith("afrTSCustom"))
      throw new g("Error loading VeAnalyzeMap, the table " + paramdm.b() + " was defined as the Lambda Target Table, but not found in current configuration. Was it loaded yet?"); 
    if (!paramdm.c().endsWith("afrTSCustom")) {
      if (be2.d() != null)
        paramdm.p(be2.d()); 
      if (be2.f() != null)
        paramdm.q(be2.f()); 
    } 
    paramdm.g(be1.d());
    paramdm.h(be1.f());
    return paramdm;
  }
  
  private dp a(R paramR, String[] paramArrayOfString) {
    dp dp = new dp();
    dp.c(paramArrayOfString[0]);
    dp.g(paramArrayOfString[1]);
    dp.f(paramArrayOfString[2]);
    dp.o(paramArrayOfString[2]);
    if (paramArrayOfString.length > 3) {
      dp.d(paramArrayOfString[3]);
    } else {
      throw new g("Error loading VeAnalyzeMap for " + dp.c() + " There is no lambdaChannel defined.");
    } 
    if (paramArrayOfString.length > 4) {
      dp.e(paramArrayOfString[4]);
    } else {
      throw new g("Error loading VeAnalyzeMap for " + dp.c() + " There is no Coolant Temp Channel defined.");
    } 
    if (paramArrayOfString.length > 5) {
      dp.m(paramArrayOfString[5]);
    } else {
      throw new g("Error loading VeAnalyzeMap for " + dp.c() + " There is no Warmup Enrichment Channel defined.");
    } 
    if (paramArrayOfString.length > 6)
      dp.h(paramArrayOfString[6]); 
    if (paramArrayOfString.length > 7) {
      String str = X.b(paramArrayOfString[7], "{", "");
      str = X.b(str, "}", "");
      dp.i(str);
    } 
    bm bm = (bm)paramR.e().c(dp.c());
    if (bm == null)
      throw new g("Error loading WueAnalyzeMap, the CurveGraph " + dp.c() + " not found in current configuration. Was it loaded yet?"); 
    be be = (be)paramR.e().c(dp.f());
    if (be == null && !dp.f().endsWith("afrTSCustom"))
      throw new g("Error loading WueAnalyzeMap, the Curve Graph " + dp.c() + " was defined as the Lambda Target Table, but not found in current configuration. Was it loaded yet?"); 
    if (!dp.f().endsWith("afrTSCustom")) {
      if (be.d() != null)
        dp.p(be.d()); 
      if (be.f() != null)
        dp.q(be.f()); 
    } 
    dp.a(bm.b(0));
    dp.b(bm.d(0));
    if (bm.d() < 2)
      throw new g("Error loading WueAnalyzeMap, the Curve Graph " + dp.c() + " does not have a wue Analyze working array defined as a second curve."); 
    dp.n(bm.b(1));
    dp.e(bm.l());
    return dp;
  }
  
  private void k(R paramR, J paramJ) {
    ArrayList<M> arrayList = a(paramJ, paramR, "FrontPage");
    ArrayList<String> arrayList1 = new ArrayList();
    M m = null;
    for (byte b1 = 0; b1 < arrayList.size(); b1++) {
      m = arrayList.get(b1);
      String str = m.b();
      if (str.startsWith("gauge")) {
        String[] arrayOfString1 = j(q(str));
        if (arrayOfString1.length < 1 || paramR.k(arrayOfString1[0]) == null) {
          b(m, "Attempt to add undefined Gauge to Front Page.");
        } else {
          arrayList1.add(arrayOfString1[0]);
        } 
      } else if (str.startsWith("indicatorTemplate")) {
        if (e(str)) {
          ak ak = a(m, paramR);
          ak.a(false);
          paramR.a(ak);
        } 
      } else if (str.startsWith("indicator")) {
        if (e(str))
          paramR.a(a(m, paramR)); 
      } else if (!str.startsWith("egoLEDs")) {
        b(m, "Do not understand this line.");
      } 
    } 
    if (arrayList1.size() < 1)
      return; 
    String[] arrayOfString = new String[arrayList1.size()];
    for (byte b2 = 0; b2 < arrayList1.size(); b2++)
      arrayOfString[b2] = arrayList1.get(b2); 
    paramR.a(arrayOfString);
  }
  
  private boolean e(String paramString) {
    return true;
  }
  
  private void l(R paramR, J paramJ) {
    for (M m : a(paramJ, paramR, "EventTriggers")) {
      try {
        if (m.f().equals("timedPageRefresh")) {
          String[] arrayOfString = j(m.e());
          if (arrayOfString.length != 2 || !I.a(arrayOfString[0])) {
            b(m, "timedPageRefresh must have 2 numeric parameters: timedPageRefresh = [pageToRefresh], \n[timePeriodBetweenRefreshesInMs]");
            continue;
          } 
          int i = X.g(arrayOfString[0]) - 1;
          dj dj = dk.a((aI)paramR, arrayOfString[1]);
          f f = new f(paramR, i, dj);
          f.a();
          continue;
        } 
        if (m.f().equals("triggeredPageRefresh")) {
          String[] arrayOfString = j(m.e());
          if (arrayOfString.length != 2) {
            b(m, "triggeredPageRefresh must have 2 parameters: triggeredPageRefresh = [pageToRefresh], \n{[Expression To Trigger Page Read]}");
            continue;
          } 
          int i = X.g(arrayOfString[0]) - 1;
          String str = X.b(arrayOfString[1], "{", "");
          str = X.b(str, "}", "");
          a(paramR, m, str, true);
          h h = new h(paramR, i, str);
          continue;
        } 
        b(m, "Entry in [EventTriggers] not understood, ignoring.");
      } catch (Exception exception) {
        a(m, "Error loading [EventTriggers], " + exception.getMessage());
        exception.printStackTrace();
        throw new g("Critical Error found at or near ini entry:\n" + m);
      } 
    } 
  }
  
  private void m(R paramR, J paramJ) {
    int i = -1;
    aM aM = null;
    for (M m : a(paramJ, paramR, "Constants")) {
      try {
        if (m.f().equals("page")) {
          i = X.g(m.e()) - 1;
          aM = null;
          continue;
        } 
        if (!F.a(m.f())) {
          if (i >= 0) {
            aM aM1 = a(paramR, m, i, aM);
            aM1.e(paramR.O().I());
            paramR.a(aM1);
            aM = aM1;
            continue;
          } 
          b(m, "Entry in [Constants] Section before page assignment, ignoring.");
        } 
      } catch (g g) {
        a(m, "Error loading [Constant], " + g.getMessage());
        g.printStackTrace();
        throw new g("Critical Error found at or near ini entry:\n" + m + "\nDetails: " + g.getLocalizedMessage());
      } catch (Exception exception) {
        a(m, "Error loading [Constant], " + exception.getMessage());
        exception.printStackTrace();
        throw new g("Critical Error found at or near ini entry:\n" + m);
      } 
    } 
  }
  
  private void n(R paramR, J paramJ) {
    for (M m : a(paramJ, paramR, "PcVariables")) {
      try {
        aM aM = l(paramR, m);
        paramR.a(aM);
      } catch (g g) {
        a(m, "Error loading [PcVariables], " + g.getMessage());
      } catch (Exception exception) {
        a(m, "Error loading [PcVariables], " + exception.getMessage());
        exception.printStackTrace();
        throw new g("Critical Error found at or near ini entry:\n" + m);
      } 
    } 
  }
  
  private void o(R paramR, J paramJ) {
    cd cd = null;
    cf cf = null;
    for (M m : a(paramJ, paramR, "LoggerDefinition")) {
      try {
        String str = m.f();
        if (str.equals("loggerDef")) {
          if (cd != null && cd.n().equals("UDP_Stream") && cd.o() <= 0)
            a(m, cd.g() + " is defineds as ProcessorType " + "UDP_Stream" + ", but no slave port has been defined."); 
          cd = new cd();
          String[] arrayOfString = j(m.e());
          String str1 = f(arrayOfString[1]);
          cd.c(str1);
          cd.a(arrayOfString[2]);
          paramR.a(cd);
          continue;
        } 
        if (str.equals("dataReadCommand")) {
          String str1 = f(m.e());
          cd.d(str1);
          continue;
        } 
        if (str.equals("startCommand")) {
          String str1 = f(m.e());
          cd.e(str1);
          continue;
        } 
        if (str.equals("stopCommand")) {
          String str1 = f(m.e());
          cd.f(str1);
          continue;
        } 
        if (str.equals("dataLength")) {
          cd.c(X.g(m.e()));
          continue;
        } 
        if (str.equals("continuousRead")) {
          String str1 = m.e();
          cd.a(Boolean.parseBoolean(str1));
          continue;
        } 
        if (str.equals("dataReadyCondition")) {
          String str1 = X.b(m.e(), "{", "");
          str1 = X.b(str1, "}", "");
          cd.b(str1);
          continue;
        } 
        if (str.equals("dataReadTimeout")) {
          int i = X.g(m.e());
          cd.a(i);
          continue;
        } 
        if (str.equals("dataLength")) {
          int i = X.g(m.e());
          continue;
        } 
        if (str.equals("logProcessorType")) {
          cd.g(m.e());
          continue;
        } 
        if (str.equals("slavePort")) {
          int i = X.g(m.e());
          cd.d(i);
          continue;
        } 
        if (str.equals("recordFieldGenerator")) {
          String[] arrayOfString = j(m.e());
          if (arrayOfString.length > 1) {
            if (arrayOfString[0].equals("generateFromOutpcOffsets")) {
              ch ch = new ch();
              ch.a(paramR);
              if (arrayOfString.length > 1) {
                ch.a(arrayOfString[1]);
              } else {
                b(m, "1D Array Constant containing Outpc offsets required.");
              } 
              cd.a((cg)ch);
            } 
            continue;
          } 
          b(m, "Field Generator type required.");
          continue;
        } 
        if (str.equals("recordDef")) {
          cf = new cf();
          String[] arrayOfString = j(m.e());
          cf.e(X.g(arrayOfString[0]));
          cf.f(X.g(arrayOfString[1]));
          cf.d(X.g(arrayOfString[2]));
          cd.a(cf);
          continue;
        } 
        if (str.equals("recordField")) {
          ce ce = new ce();
          String[] arrayOfString = j(m.e());
          ce.b(arrayOfString[0]);
          String str1 = arrayOfString[1];
          db db = da.a().a(paramR, X.b(str1, "\"", ""));
          ce.a(db);
          int i = X.g(arrayOfString[2]);
          int j = X.g(arrayOfString[3]);
          ce.a(j, i);
          dj dj = dk.a((aI)paramR, arrayOfString[4]);
          ce.a(dj);
          byte b = 5;
          if (!arrayOfString[b].startsWith("\"")) {
            dj dj1 = dk.a((aI)paramR, arrayOfString[b++]);
            ce.b(dj1);
          } 
          String str2 = f(arrayOfString[b++]);
          ce.c(str2);
          if (arrayOfString.length > b) {
            String str3 = X.b(arrayOfString[b++], "{", "");
            str3 = X.b(str3, "}", "");
            ce.e(str3);
          } 
          if (arrayOfString.length > b && arrayOfString[b++].equals("hidden"))
            ce.a(true); 
          cf.a(ce);
          continue;
        } 
        if (str.equals("headerField")) {
          ce ce = new ce();
          String[] arrayOfString = j(m.e());
          ce.b(arrayOfString[0]);
          String str1 = f(arrayOfString[1]);
          db db = da.a().a(paramR, X.b(str1, "\"", ""));
          ce.a(db);
          int i = X.g(arrayOfString[2]);
          int j = X.g(arrayOfString[3]);
          ce.a(j, i);
          dj dj = dk.a((aI)paramR, arrayOfString[4]);
          ce.a(dj);
          byte b = 5;
          if (!arrayOfString[b].startsWith("\"")) {
            dj dj1 = dk.a((aI)paramR, arrayOfString[b++]);
            ce.b(dj1);
          } 
          String str2 = f(arrayOfString[b++]);
          ce.c(str2);
          if (arrayOfString.length > b) {
            String str3 = X.b(arrayOfString[b++], "{", "");
            str3 = X.b(str3, "}", "");
            ce.e(str3);
          } 
          if (arrayOfString.length > b && arrayOfString[b++].equals("hidden"))
            ce.a(true); 
          cf.c(ce);
          continue;
        } 
        if (str.equals("calcField")) {
          cc cc = new cc();
          String[] arrayOfString = j(m.e());
          cc.b(arrayOfString[0]);
          db db = da.a().a(paramR, X.b(arrayOfString[1], "\"", ""));
          cc.a(db);
          String str1 = f(arrayOfString[2]);
          cc.c(str1);
          String str2 = X.b(arrayOfString[3], "{", "");
          str2 = X.b(str2, "}", "");
          cc.a(str2);
          if (arrayOfString.length > 4 && arrayOfString[4].equals("hidden"))
            cc.a(true); 
          cf.a(cc);
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
          cd.i(m.e());
          continue;
        } 
        if (str.equals("verticalMarker")) {
          String[] arrayOfString = j(m.e());
          String str1 = f(arrayOfString[0]);
          String str2 = f(arrayOfString[1]);
          String str3 = f(arrayOfString[2]);
          double d = Double.parseDouble(arrayOfString[3]);
          ci ci = new ci(str1, str2, str3, d);
          cd.a(ci);
          continue;
        } 
        if (str.equals("stopOnExit")) {
          cd.b(Boolean.parseBoolean(m.e().trim()));
          continue;
        } 
        b(m, "Unkown entry in [LoggerDefinition], skipping");
      } catch (g g) {
        a(m, "Error loading [LoggerDefinition], " + g.getMessage());
      } catch (Exception exception) {
        a(m, "Error loading [LoggerDefinition], " + exception.getMessage());
        exception.printStackTrace();
      } 
    } 
  }
  
  private void p(R paramR, J paramJ) {
    for (M m : a(paramJ, paramR, "TurboBaud")) {
      try {
        String str = m.f();
        if (str.equals("turboBaudSpeed")) {
          dj dj = dk.a((aI)paramR, m.e());
          paramR.O().a(dj);
          continue;
        } 
        if (str.equals("sdTurboActive")) {
          dj dj = dk.a((aI)paramR, m.e());
          paramR.O().b(dj);
          continue;
        } 
        if (str.equals("fullTimeTurboEnabled")) {
          dj dj = dk.a((aI)paramR, m.e());
          paramR.O().c(dj);
          continue;
        } 
        if (str.equals("runtimeTurboActive")) {
          dj dj = dk.a((aI)paramR, m.e());
          paramR.O().d(dj);
          continue;
        } 
        if (!F.a(str))
          b(m, "Unknown Command"); 
      } catch (Exception exception) {
        a(m, "Error loading [TurboBaud], " + exception.getMessage());
        exception.printStackTrace();
      } 
    } 
  }
  
  private void q(R paramR, J paramJ) {
    for (M m : a(paramJ, paramR, "Tools")) {
      try {
        String str = m.f();
        bI bI = b(m);
        paramR.a(true);
        if (bI.aJ() != null && bI.aJ().trim().length() > 0)
          a(paramR, m, bI.aJ(), false); 
        if (str.equals("addTool")) {
          bv bv = paramR.e().c(bI.a());
          if (bv == null) {
            b(m, "Target UI component " + bI.a() + " is not in the currently loaded configuration.\nI can not add tool " + bI.aL() + ", This line will be ignored.");
            continue;
          } 
          if (bI.aL().equals("veTableGenerator") || bI.aL().equals("afrTableGenerator") || bI.aL().equals("Calculator") || bI.aL().equals("TwoPointCalculator")) {
            bv.a(bI);
            continue;
          } 
          b(m, "Tool " + bI.aL() + " is not supported by this version of application.\nI don't know how to add it, this line will be ignored.\nSupported Tools: veTableGenerator, afrTableGenerator, Calculator, TwoPointCalculator");
          continue;
        } 
        if (str.equals("removeTool")) {
          bv bv = paramR.e().c(bI.a());
          if (bv == null) {
            b(m, "Target UI component " + bI.a() + " is not in the currently loaded configuration.\nI can not remove tool " + bI.aL() + ", This line will be ignored.");
            continue;
          } 
          if (bI.aL().equals("veTableGenerator") || bI.aL().equals("afrTableGenerator")) {
            bv.b(bI);
            continue;
          } 
          b(m, "Tool " + bI.aL() + " is not supported by this version of application.\nI don't know how to remove it, this line will be ignored.");
        } 
      } catch (Exception exception) {
        a(m, "Error loading [Tools], " + exception.getMessage());
        exception.printStackTrace();
      } 
    } 
  }
  
  private void r(R paramR, J paramJ) {
    for (M m : a(paramJ, paramR, "SettingContextHelp")) {
      String str = m.b();
      if (str.length() > 3 && str.indexOf("=") != -1) {
        if (paramR.c(m.f()) == null && paramR.O().b(m.f()) == null) {
          b(m, "No Constant or Command Button found with name " + m.f());
          continue;
        } 
        String str1 = f(m.e());
        str1 = X.b(str1, "\\n", "\n");
        str1 = X.b(str1, "\\\"", "\"");
        paramR.d(m.f(), str1);
        continue;
      } 
      b(m, "Do not understand what to do with row, ignoring.");
    } 
  }
  
  private String f(String paramString) {
    if (paramString.charAt(0) == '"')
      paramString = paramString.substring(1); 
    if (paramString.endsWith("\""))
      paramString = paramString.substring(0, paramString.length() - 1); 
    return paramString;
  }
  
  private bI b(M paramM) {
    String[] arrayOfString = j(paramM.e());
    bI bI = new bI();
    bI.s(this.l);
    bI.v(arrayOfString[0]);
    String str = X.b(arrayOfString[1], "\"", "");
    bI.b(str);
    bI.a(arrayOfString[2]);
    if (arrayOfString.length > 3) {
      String str1 = X.b(arrayOfString[2], "{", "");
      str1 = X.b(str1, "}", "");
      bI.u(str1);
    } 
    return bI;
  }
  
  private void s(R paramR, J paramJ) {
    F f = (paramR.O() != null) ? paramR.O() : new F();
    f.a((aI)paramR);
    paramR.a(f);
    Iterator<String> iterator = paramJ.b();
    while (iterator.hasNext()) {
      String str = iterator.next();
      int i = -1;
      Iterator<M> iterator1 = a(paramJ, paramR, str).iterator();
      while (iterator1.hasNext()) {
        M m = iterator1.next();
        a(m);
        try {
          String str1 = m.f();
          if (str1.equals("page"))
            try {
              i = Integer.parseInt(m.e()) - 1;
            } catch (NumberFormatException numberFormatException) {
              b(m, "Invalid page number: " + m.e());
            }  
          if (F.a(str1)) {
            String str2 = m.e();
            str2 = X.b(str2, "\"", "");
            if (i >= 0) {
              f.a(str1, str2, i);
            } else {
              f.a(str1, str2);
            } 
            if (str2.indexOf("$") == -1 || str2.indexOf("$tsCanId") == -1);
            continue;
          } 
          if (str1.equals("helpManualDownloadRoot")) {
            String str2 = f(m.e());
            paramR.x(str2);
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
          String str1 = "Invalid row in ini file. Not sure how to handle this row:\n" + m;
          if (iterator1.hasNext())
            str1 = str1 + "\n" + iterator1.next(); 
          if (iterator1.hasNext())
            str1 = str1 + "\n" + iterator1.next(); 
          throw new g(str1);
        } 
      } 
    } 
  }
  
  public void a(R paramR, bE parambE, J paramJ) {
    aX aX = null;
    bG bG = null;
    bu bu = null;
    bn bn = null;
    ArrayList arrayList = a(paramJ, paramR, "ReferenceTables");
    arrayList = a(arrayList, paramR);
    for (M m : arrayList) {
      String str = m.b();
      try {
        if (str.startsWith("referenceTable")) {
          aX = new aX();
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          aX.v(arrayOfString[0].trim());
          if (arrayOfString.length > 1)
            aX.s(X.b(arrayOfString[1], "\"", "")); 
          parambE.a((bv)aX);
          continue;
        } 
        if (str.startsWith("topicHelp")) {
          db db = da.a().a(paramR, q(str));
          aX.e(db);
          if (db.a().startsWith("http:/") || db.a().startsWith("file:/")) {
            aj aj = new aj();
            aj.a(db);
            aj.b(db);
            if (aX.M() != null && aX.M().length() > 0) {
              aj.b(aX.M());
            } else {
              aj.b("Web Help");
            } 
            parambE.a(aj);
          } 
          continue;
        } 
        if (str.startsWith("tableIdentifier")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          if (arrayOfString.length % 2 != 0)
            a(m, "ReferenceTables::tableIdentifier has wrong number of parameters."); 
          for (byte b = 0; b + 1 < arrayOfString.length; b++) {
            aX.a(arrayOfString[b], arrayOfString[b + 1]);
            b++;
          } 
          continue;
        } 
        if (str.startsWith("solutionsLabel")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          aX.b(X.b(arrayOfString[0], "\"", ""));
          continue;
        } 
        if (str.startsWith("tableStartOffset")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          aX.c(X.g(arrayOfString[0]));
          continue;
        } 
        if (str.startsWith("writeCommand")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          aX.a(f(arrayOfString[0]));
          continue;
        } 
        if (str.startsWith("scale")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          aX.a(Double.parseDouble(arrayOfString[0]));
          continue;
        } 
        if (str.startsWith("tableGenerator")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          byte b = 0;
          String str2 = arrayOfString[b++];
          if (str2.equals("thermGenerator")) {
            bG = new bG();
            bG.c(str2);
            if (arrayOfString.length > b)
              bG.d(X.b(arrayOfString[b++], "\"", "")); 
            aX.a((bF)bG);
            continue;
          } 
          if (str2.equals("fileBrowseGenerator")) {
            bn = new bn();
            bn.c(str2);
            if (arrayOfString.length > b)
              bn.d(X.b(arrayOfString[b++], "\"", "")); 
            aX.a((bF)bn);
            continue;
          } 
          if (str2.equals("linearGenerator")) {
            bu = new bu();
            bu.c(str2);
            if (arrayOfString.length > b)
              bu.d(X.b(arrayOfString[b++], "\"", "")); 
            if (arrayOfString.length > b)
              bu.a(X.b(arrayOfString[b++], "\"", "")); 
            if (arrayOfString.length > b)
              bu.b(X.b(arrayOfString[b++], "\"", "")); 
            if (arrayOfString.length > b)
              bu.a(Double.parseDouble(arrayOfString[b++])); 
            if (arrayOfString.length > b)
              bu.b(Double.parseDouble(arrayOfString[b++])); 
            if (arrayOfString.length > b)
              bu.c(Double.parseDouble(arrayOfString[b++])); 
            if (arrayOfString.length > b)
              bu.d(Double.parseDouble(arrayOfString[b++])); 
            aX.a((bF)bu);
          } 
          continue;
        } 
        if (str.startsWith("adcCount")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          aX.a(X.g(arrayOfString[0]));
          continue;
        } 
        if (str.startsWith("bytesPerAdc")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          aX.b(X.g(arrayOfString[0]));
          continue;
        } 
        if (str.startsWith("tableLimits")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          aX.a(arrayOfString[0], Double.parseDouble(arrayOfString[1]), Double.parseDouble(arrayOfString[2]), Double.parseDouble(arrayOfString[3]));
          continue;
        } 
        if (str.startsWith("thermOption")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          try {
            bH bH = new bH();
            byte b = 0;
            bH.a(X.b(arrayOfString[b++], "\"", ""));
            bH.a(Double.parseDouble(arrayOfString[b++]));
            bH.b(Double.parseDouble(arrayOfString[b++]));
            bH.c(Double.parseDouble(arrayOfString[b++]));
            bH.d(Double.parseDouble(arrayOfString[b++]));
            bH.e(Double.parseDouble(arrayOfString[b++]));
            bH.f(Double.parseDouble(arrayOfString[b++]));
            bH.g(Double.parseDouble(arrayOfString[b++]));
            if (bG != null) {
              bG.a(bH);
              continue;
            } 
            b(m, "thermOption defined before a thermGenerator! The following line must be declared after a thermGenerator.");
          } catch (Exception exception) {
            a(m, "Invalid ini entry. thermOption must have the format:\nthermOption\t= name, resistor bias, tempPoint1(" + T.a() + "C), resPoint1, tempPoint2, resPoint2, tempPoint3, resPoint3");
          } 
          continue;
        } 
        if (str.startsWith("solution")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          ba ba = new ba();
          ba.a(X.b(arrayOfString[0], "\"", ""));
          String str2 = arrayOfString[1];
          str2 = X.b(str2, "{", "");
          str2 = X.b(str2, "}", "");
          ba.b(str2);
          aX.a(ba);
        } 
      } catch (Exception exception) {
        a(m, "Invalid Ini entry for reference table, Ignored.");
      } 
    } 
  }
  
  public void b(R paramR, bE parambE, J paramJ) {
    aS aS = null;
    ArrayList arrayList = a(paramJ, paramR, "PortEditor");
    arrayList = a(arrayList, paramR);
    for (M m : arrayList) {
      a(m);
      String str = m.b();
      try {
        if (str.startsWith("portEditor")) {
          aS = new aS();
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          aS.v(arrayOfString[0].trim());
          if (arrayOfString.length > 1)
            aS.s(X.b(arrayOfString[1], "\"", "")); 
          parambE.a((bv)aS);
          continue;
        } 
        if (str.startsWith("topicHelp")) {
          db db = da.a().a(paramR, q(str));
          aS.e(db);
          if (db.a().startsWith("http:/") || db.a().startsWith("file:/")) {
            aj aj = new aj();
            aj.a(db);
            aj.b(db);
            if (aS.M() != null && aS.M().length() > 0) {
              aj.b(aS.M());
            } else {
              aj.b("Web Help");
            } 
            parambE.a(aj);
          } 
          continue;
        } 
        if (str.startsWith("enabledPorts")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          if (arrayOfString.length < 2)
            a(m, "PortEditor::enabledPorts requires at least 2 parameters."); 
          aS.c(arrayOfString[0]);
          for (byte b = 1; b < arrayOfString.length; b++)
            aS.a(arrayOfString[b]); 
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
          aS.g(str1);
          continue;
        } 
        if (str.startsWith("hysteresis")) {
          String str1 = q(str);
          aS.h(str1);
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
            str2 = f(str2.trim());
            if (!str2.isEmpty())
              aS.r(str2); 
          } 
          continue;
        } 
        if (str.startsWith("operators")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          aS.f(arrayOfString[0]);
          aM aM = paramR.c(arrayOfString[0]);
          for (byte b = 1; b < arrayOfString.length; b++) {
            String str2 = X.b(arrayOfString[b], "\"", "");
            if (str2.length() != 1)
              b(m, "Invalid operator in Port Editor."); 
            Character character = new Character(str2.charAt(0));
            aS.a(character);
            aM.a(character.charValue());
          } 
          continue;
        } 
        if (str.startsWith("conditionRelationship")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          aS.k(arrayOfString[0]);
          aM aM = paramR.c(arrayOfString[0]);
          for (byte b = 1; b < arrayOfString.length; b++) {
            String str2 = X.b(arrayOfString[b], "\"", "");
            if (str2.length() != 1)
              b(m, "Invalid conditionRelationship in Port Editor."); 
            Character character = new Character(str2.charAt(0));
            aS.b(character);
            aM.a(character.charValue());
          } 
          continue;
        } 
        if (m.f().equals("portEnabledCondition")) {
          String str1 = q(str);
          String[] arrayOfString = j(str1);
          if (arrayOfString.length != aS.s())
            b(m, "Number of Ports does not match number of portEnableCondition! " + aS.s() + " Ports, " + arrayOfString.length + " portEnabledConditions. Check your indexing"); 
          for (String str2 : arrayOfString) {
            str2 = X.b(str2, "{", "");
            str2 = X.b(str2, "}", "");
            a(paramR, m, str2, false);
            aS.b(str2);
          } 
        } 
      } catch (Exception exception) {
        a(m, "Invalid Ini entry for reference table, Ignored.");
      } 
    } 
  }
  
  public ArrayList a(J paramJ, R paramR, String paramString) {
    return paramJ.b(paramString);
  }
  
  public ArrayList a(J paramJ, R paramR) {
    ArrayList arrayList = paramJ.a();
    return a(arrayList, paramR);
  }
  
  public ArrayList a(ArrayList<M> paramArrayList, R paramR) {
    ArrayList<M> arrayList = new ArrayList();
    M m = null;
    try {
      while (paramArrayList.size() > 0) {
        m = paramArrayList.get(0);
        String str = m.b();
        str = str.trim();
        if (str.startsWith("#if")) {
          arrayList = a(paramR, paramArrayList, arrayList, 0);
          continue;
        } 
        if (str.startsWith("#elif") || str.startsWith("#endif") || str.startsWith("#else")) {
          a(m, "#endif, #elif or #else found but no owning #if found");
          paramArrayList.remove(0);
          continue;
        } 
        paramArrayList.remove(0);
        if (str.startsWith("#define")) {
          String[] arrayOfString = m.f().split(" ");
          if (arrayOfString.length != 2) {
            b(m, "Invalid define entry, Name format error: " + m.f());
          } else {
            String str1 = arrayOfString[1];
            this.e.put(str1, c(m, m.e()));
          } 
        } 
        if (!str.startsWith("#")) {
          arrayList.add(m);
          continue;
        } 
        if (str.trim().startsWith("#error")) {
          String str1 = "A critical Error was encountered in this projects ini file.\n\nThe following message was provided:\n" + X.b(str, "#error", "").trim();
          throw new c(str1);
        } 
      } 
    } catch (g g) {
      throw g;
    } catch (Exception exception) {
      a(m, "Encountered a problem while applying user settings to ini.");
    } 
    return arrayList;
  }
  
  private ArrayList a(R paramR, ArrayList<M> paramArrayList1, ArrayList<M> paramArrayList2, int paramInt) {
    byte b = 0;
    boolean bool = false;
    M m = null;
    try {
      while (paramInt < paramArrayList1.size()) {
        m = paramArrayList1.get(paramInt);
        String str = m.b();
        paramArrayList1.remove(paramInt);
        if (str.startsWith("#if")) {
          b++;
        } else if (str.startsWith("#endif")) {
          b--;
        } 
        if (b <= 1 && str.startsWith("#if")) {
          bool = a(str, paramR);
          continue;
        } 
        if (str.startsWith("#if") && bool) {
          paramArrayList1.add(paramInt, m);
          paramArrayList2 = a(paramR, paramArrayList1, paramArrayList2, paramInt);
          b--;
          continue;
        } 
        if (b <= 1 && str.startsWith("#elif")) {
          if (bool) {
            a(paramArrayList1);
            bool = false;
            b--;
            return paramArrayList2;
          } 
          bool = a(str, paramR);
          continue;
        } 
        if (b == 1 && str.startsWith("#else")) {
          if (bool) {
            a(paramArrayList1);
            bool = false;
            b--;
            return paramArrayList2;
          } 
          bool = true;
          continue;
        } 
        if (b == 0 && str.startsWith("#endif"))
          return paramArrayList2; 
        if (str.startsWith("#error")) {
          String str1 = "A critical Error was encountered in this projects ini file.\nThe following message was provided:\n\n" + X.b(str, "#error", "").trim();
          throw new c(str1);
        } 
        if (!str.startsWith("#") && bool)
          paramArrayList2.add(m); 
      } 
    } catch (g g) {
      throw g;
    } catch (Exception exception) {
      exception.printStackTrace();
      a(m, "Error while applying #if #else Conditions at row:");
    } 
    return paramArrayList2;
  }
  
  private void a(ArrayList<M> paramArrayList) {
    byte b = 0;
    while (paramArrayList.size() > 0) {
      M m = paramArrayList.get(0);
      String str = m.b();
      paramArrayList.remove(0);
      if (str.startsWith("#if")) {
        b++;
        continue;
      } 
      if (str.startsWith("#endif")) {
        if (b == 0)
          break; 
        b--;
      } 
    } 
  }
  
  private boolean a(String paramString, R paramR) {
    if (paramString.startsWith("#")) {
      paramString = r(paramString);
    } else {
      paramString = paramString.trim();
    } 
    return (paramR.d(paramString) != null || paramString.equals("TUNERSTUDIO") || paramString.equals("INI_VERSION_2"));
  }
  
  private ah j(R paramR, M paramM) {
    String str1 = paramM.b();
    ah ah = new ah();
    ah.s(this.l);
    ah.v(p(str1));
    String str2 = q(str1);
    String[] arrayOfString = j(str2);
    try {
      byte b = 0;
      String str = arrayOfString[b++];
      ah.a(str);
      db db1 = da.a().a(paramR, X.b(arrayOfString[b++], "\"", ""));
      ah.b(db1);
      db db2 = da.a().a(paramR, X.b(arrayOfString[b++], "\"", ""));
      ah.a(db2);
      dj dj1 = dk.a((aI)paramR, arrayOfString[b++]);
      ah.a(dj1);
      dj dj2 = dk.a((aI)paramR, arrayOfString[b++]);
      ah.b(dj2);
      if (arrayOfString.length > b) {
        a(paramR, paramM, arrayOfString[b], "Invalid Low Critical Expression", false);
        ah.h(dk.a((aI)paramR, arrayOfString[b++]));
      } 
      if (arrayOfString.length > b) {
        a(paramR, paramM, arrayOfString[b], "Invalid Low Warning Expression", false);
        ah.c(dk.a((aI)paramR, arrayOfString[b++]));
      } 
      if (arrayOfString.length > b) {
        a(paramR, paramM, arrayOfString[b], "Invalid High Warning Expression", false);
        ah.d(dk.a((aI)paramR, arrayOfString[b++]));
      } 
      if (arrayOfString.length > b) {
        a(paramR, paramM, arrayOfString[b], "Invalid LHigh Critical Expression", false);
        ah.e(dk.a((aI)paramR, arrayOfString[b++]));
      } 
      if (arrayOfString.length > b) {
        a(paramR, paramM, arrayOfString[b], "Invalid Value Digits Expression", false);
        ah.f(dk.a((aI)paramR, arrayOfString[b++]));
      } 
      if (arrayOfString.length > b) {
        a(paramR, paramM, arrayOfString[b], "Invalid Label Digits Expression", false);
        ah.g(dk.a((aI)paramR, arrayOfString[b++]));
      } 
      if (arrayOfString.length > b) {
        String str3 = arrayOfString[b++];
        str3 = X.b(str3, "{", "");
        str3 = X.b(str3, "}", "");
        ah.u(str3);
        a(paramR, paramM, str3, "Invalid Enabled Expression", false);
      } 
      if (dj1 instanceof B && dj2 instanceof B && ah.a() > ah.d()) {
        double d = ah.a();
        ah.a(ah.d());
        ah.b(d);
        ah.a(true);
      } 
      if (ah.o() instanceof bR) {
        bR bR = (bR)ah.o();
        a(paramR, paramM, bR.c(), "Invalid Low Critical Expression", false);
      } 
      if (ah.f() instanceof bR) {
        bR bR = (bR)ah.f();
        a(paramR, paramM, bR.c(), "Invalid Low Warning Expression", false);
      } 
      if (ah.h() instanceof bR) {
        bR bR = (bR)ah.h();
        a(paramR, paramM, bR.c(), "Invalid High Critical Expression", false);
      } 
      if (ah.g() instanceof bR) {
        bR bR = (bR)ah.g();
        a(paramR, paramM, bR.c(), "Invalid high Warning Expression", false);
      } 
    } catch (Exception exception) {
      throw new g("Corrupt Gauge Entry :\n" + str1);
    } 
    return ah;
  }
  
  private k g(String paramString) {
    paramString = paramString.trim();
    return paramString.equals("white") ? k.a : (paramString.equalsIgnoreCase("red") ? k.k : (paramString.equalsIgnoreCase("black") ? k.i : (paramString.equalsIgnoreCase("green") ? k.s : (paramString.equalsIgnoreCase("cyan") ? k.w : (paramString.equalsIgnoreCase("blue") ? k.y : (paramString.equalsIgnoreCase("grey") ? k.e : (paramString.equalsIgnoreCase("gray") ? k.e : (paramString.equalsIgnoreCase("darkGray") ? k.g : (paramString.equalsIgnoreCase("lightGray") ? k.c : (paramString.equalsIgnoreCase("darkGrey") ? k.g : (paramString.equalsIgnoreCase("lightGrey") ? k.c : (paramString.equalsIgnoreCase("yellow") ? k.q : (paramString.equalsIgnoreCase("transparent") ? k.A : (paramString.equalsIgnoreCase("magenta") ? k.v : k.l))))))))))))));
  }
  
  private ak a(M paramM, R paramR) {
    ak ak = new ak();
    ak.s(this.l);
    String str = paramM.e();
    String[] arrayOfString = j(str);
    try {
      byte b = 0;
      String str1 = arrayOfString[b++];
      str1 = X.b(str1, "{", "");
      str1 = X.b(str1, "}", "");
      db db1 = da.a().a(paramR, X.b(arrayOfString[b++], "\"", ""));
      ak.b(db1);
      db db2 = da.a().a(paramR, X.b(arrayOfString[b++], "\"", ""));
      ak.a(db2);
      ak.v(i(ak.b()));
      if (arrayOfString.length > b)
        ak.b(g(arrayOfString[b++])); 
      if (arrayOfString.length > b)
        ak.d(g(arrayOfString[b++])); 
      if (arrayOfString.length > b)
        ak.a(g(arrayOfString[b++])); 
      if (arrayOfString.length > b)
        ak.c(g(arrayOfString[b++])); 
      aH aH = new aH(paramR.c());
      aH.v(ak.aL() + "OC");
      aH.e(str1);
      aH.a("formula");
      aH.c(dk.a(0.0D));
      a(paramR, paramM, str1, "Invalid Indicator Expression: ", false);
      paramR.a(aH);
      if (paramR.g(str1.trim()) != null) {
        ak.a(str1.trim());
      } else {
        String str2 = h(str1);
        if (str2.length() > 1 && !I.a(str2.substring(0, 1))) {
          aH = new aH(paramR.c());
          aH.v(str2 + "_OC");
          aH.e(str1);
          aH.a("formula");
          a(paramR, paramM, str1, "Invalid Indicator Expression: ", false);
          paramR.a(aH);
          ak.a(aH.aL());
        } 
      } 
    } catch (Exception exception) {
      a(paramM, "Corrupt Indicator Entry");
    } 
    return ak;
  }
  
  private String h(String paramString) {
    null = X.b(paramString, " ", "");
    null = X.b(null, "<", "LT");
    null = X.b(null, ">", "GT");
    null = X.b(null, "&", "AND");
    null = X.b(null, "|", "OR");
    null = X.b(null, "=", "EQ");
    null = X.b(null, "-", "MN");
    null = X.b(null, "+", "PL");
    null = X.b(null, "%", "MOD");
    null = X.b(null, "/", "DIV");
    null = X.b(null, "!", "NOT");
    null = X.b(null, "^", "XOR");
    null = X.b(null, "*", "x");
    null = X.b(null, ",", "Com");
    null = X.b(null, "[", "LB");
    null = X.b(null, "]", "RB");
    null = X.b(null, "(", "LP");
    null = X.b(null, ")", "RP");
    null = X.b(null, "?", "QU");
    return X.b(null, ":", "COL");
  }
  
  private String i(String paramString) {
    return X.e(paramString);
  }
  
  private String[] j(String paramString) {
    return Q.c(paramString);
  }
  
  private ac k(R paramR, M paramM) {
    ac ac1 = new ac();
    String str1 = paramM.b();
    ac1.s(this.l);
    String str2 = q(str1);
    String[] arrayOfString = j(str2);
    try {
      byte b = 0;
      String str3 = arrayOfString[b++];
      if (str3.equals("time")) {
        str3 = "dataLogTime";
        if (paramR.g(str3) == null) {
          aH aH = new aH(paramR.c());
          aH.a("formula");
          aH.e("AppEvent.dataLogTime");
          aH.v(str3);
          aH.c("s");
          paramR.a(aH);
        } 
      } 
      ac1.b(str3);
      String str4 = X.b(arrayOfString[b++], "\"", "");
      db db = da.a().a(paramR, str4);
      if (db instanceof c) {
        String str = db.a();
        if (str.length() > 0 && (str.getBytes()[0] == 42 || str.getBytes()[0] == 37 || str.getBytes()[0] == 47 || str.getBytes()[0] == 94 || str.getBytes()[0] == 33 || str.getBytes()[0] == 38 || str.getBytes()[0] == 43 || str.getBytes()[0] == 126 || str.getBytes()[0] == 61 || str.getBytes()[0] == 126 || str.getBytes()[0] == 45)) {
          a(paramM, "Log Field units cannot start with special / mathematical characters.");
          str = b(str);
          ((c)db).a(str);
        } 
      } 
      ac1.a(db);
      ac1.v(str4);
      b++;
      ac1.a(arrayOfString[++b]);
      if (arrayOfString.length > b) {
        String str = arrayOfString[b++];
        str = X.b(str, "{", "");
        str = X.b(str, "}", "").trim();
        ac1.u(str);
        if (arrayOfString.length > b) {
          String str5 = arrayOfString[b++];
          str5 = X.b(str5, "{", "");
          str5 = X.b(str5, "}", "").trim();
          ac1.a((dj)new bR((aI)paramR, str5));
        } 
      } 
    } catch (Exception exception) {
      throw new g("Corrupt DataLog Entry :\n" + str1);
    } 
    return ac1;
  }
  
  public String b(String paramString) {
    if (paramString != null) {
      paramString = X.b(paramString, "/", "");
      paramString = X.b(paramString, "+", "_");
      paramString = X.b(paramString, "*", "x");
      paramString = X.b(paramString, "%", "");
      paramString = X.b(paramString, "^", "");
      paramString = X.b(paramString, "|", "");
      paramString = X.b(paramString, "(", "_");
      paramString = X.b(paramString, ")", "_");
      paramString = X.b(paramString, "{", "");
      paramString = X.b(paramString, "}", "");
      paramString = X.b(paramString, "$", "");
      paramString = X.b(paramString, "&", "");
    } 
    return paramString;
  }
  
  private aH a(M paramM, R paramR, int paramInt1, int paramInt2) {
    aH aH = new aH(paramR.c());
    aH.s(this.l);
    String str1 = paramM.b();
    aH.v(p(str1));
    boolean bool = (paramR.O() != null && paramR.O().al().equals("XCP")) ? true : false;
    String str2 = q(str1);
    String[] arrayOfString = j(str2);
    byte b = 0;
    try {
      if (str2.startsWith("scalar") || str2.startsWith("dotScalar")) {
        aH.a(arrayOfString[b++]);
        aH.b(arrayOfString[b++]);
        String str = arrayOfString[b++];
        if (bool) {
          long l = (paramR.O().af() + X.g(str));
          aH.a(l);
          str = "nextOffset";
        } 
        if (str.equals("nextOffset")) {
          aH.a(paramInt1);
        } else if (str.equals("lastOffset")) {
          aH.a(paramInt2);
        } else {
          int i = X.g(str);
          if (i < paramInt1);
          aH.a(i);
        } 
        if (arrayOfString.length > b) {
          if (arrayOfString.length > b) {
            db db = da.a().a(paramR, X.b(arrayOfString[b++], "\"", ""));
            aH.a(db);
          } 
          aH.a(dk.a((aI)paramR, arrayOfString[b++]));
          if (str2.startsWith("dotScalar")) {
            aH.c(X.g(arrayOfString[b++]));
          } else {
            aH.b(dk.a((aI)paramR, arrayOfString[b++]));
          } 
        } 
        while (arrayOfString.length > b) {
          String str3 = arrayOfString[b++];
          if (str3.equals("hidden")) {
            aH.c(dk.a(0.0D));
            continue;
          } 
          if (str3.startsWith("{")) {
            aH.c(dk.a((aI)paramR, str3));
            continue;
          } 
          if (str3.equals("persistValue"))
            continue; 
          b(paramM, "Unknown OutputChannel visible condition or flag");
        } 
      } else if (arrayOfString.length > 0 && arrayOfString[0].equals("bits")) {
        aH.a(arrayOfString[b++]);
        aH.b(arrayOfString[b++]);
        String str3 = arrayOfString[b++];
        if (bool) {
          long l = (paramR.O().af() + X.g(str3));
          aH.a(l);
          str3 = "nextOffset";
        } 
        if (str3.equals("nextOffset")) {
          aH.a(paramInt1);
        } else if (str3.equals("lastOffset")) {
          aH.a(paramInt2);
        } else {
          int i = X.g(str3);
          if (i < paramInt1 - aH.l());
          aH.a(i);
        } 
        String str4 = arrayOfString[b++];
        aH.d(m(str4));
        aH.e(n(str4));
        while (b < arrayOfString.length) {
          try {
            aH.d(X.b(arrayOfString[b], "\"", ""));
          } catch (g g) {
            b(paramM, g.getLocalizedMessage());
          } 
          b++;
        } 
      } else if (str2.startsWith("{")) {
        aH.a("formula");
        String str = arrayOfString[b++];
        str = X.b(str, "{", "");
        str = X.b(str, "}", "");
        str = k(str);
        aH.e(str);
        if (arrayOfString.length > 1 && arrayOfString.length > b) {
          db db = da.a().a(paramR, X.b(arrayOfString[b++], "\"", ""));
          aH.a(db);
        } 
        while (arrayOfString.length > b) {
          String str3 = arrayOfString[b++];
          if (str3.equals("hidden")) {
            aH.c(dk.a(0.0D));
            continue;
          } 
          if (str3.startsWith("{")) {
            aH.c(dk.a((aI)paramR, str3));
            continue;
          } 
          if (str3.equals("persistValue"))
            continue; 
          b(paramM, "Unknown OutputChannel visible condition or flag");
        } 
      } else {
        throw new g("Malformed OutputChannel entry.");
      } 
    } catch (NumberFormatException numberFormatException) {
      throw new g("Malformed OutputChannel entry.");
    } 
    return aH;
  }
  
  private bb a(M paramM, R paramR, int paramInt1, int paramInt2, aI paramaI) {
    bb bb = new bb(paramaI.ac());
    String str1 = paramM.b();
    bb.v(p(str1));
    String str2 = q(str1);
    String[] arrayOfString = j(str2);
    byte b = 0;
    try {
      if (str2.startsWith("scalar")) {
        bb.a(arrayOfString[b++]);
        bb.b(arrayOfString[b++]);
        String str = arrayOfString[b++];
        if (str.equals("nextOffset")) {
          bb.a(paramInt1);
        } else if (str.equals("lastOffset")) {
          bb.a(paramInt2);
        } else {
          int i = X.g(str);
          if (i < paramInt1);
          bb.a(i);
        } 
        if (arrayOfString.length > b) {
          if (arrayOfString.length > b) {
            db db = da.a().a(paramR, X.b(arrayOfString[b++], "\"", ""));
            bb.a(db);
          } 
          bb.a(dk.a((aI)paramR, arrayOfString[b++]));
          bb.b(dk.a((aI)paramR, arrayOfString[b++]));
        } 
        if (arrayOfString.length > b) {
          try {
            bb.f(X.g(arrayOfString[b++]));
          } catch (NumberFormatException numberFormatException) {
            b(paramM, "Invalid DLRAM_AddPad value");
          } 
        } else {
          b(paramM, "Pad Address not optional.");
        } 
        if (arrayOfString.length > b)
          try {
            bb.b(X.g(arrayOfString[b++]));
          } catch (NumberFormatException numberFormatException) {
            b(paramM, "Invalid digits value");
          }  
        if (arrayOfString.length > b) {
          String str3 = arrayOfString[b++];
          if (str3.equals("hidden")) {
            bb.c(dk.a(0.0D));
          } else if (str3.startsWith("{")) {
            bb.c(dk.a((aI)paramR, str3));
          } else {
            b(paramM, "Unknown Replay visible condition or flag");
          } 
        } 
      } else if (str2.startsWith("dotScalar")) {
        bb.a(arrayOfString[b++]);
        bb.b(arrayOfString[b++]);
        String str = arrayOfString[b++];
        if (str.equals("nextOffset")) {
          bb.a(paramInt1);
        } else if (str.equals("lastOffset")) {
          bb.a(paramInt2);
        } else {
          int i = X.g(str);
          if (i < paramInt1);
          bb.a(i);
        } 
        if (arrayOfString.length > b) {
          if (arrayOfString.length > b) {
            db db = da.a().a(paramR, X.b(arrayOfString[b++], "\"", ""));
            bb.a(db);
          } 
          bb.a(dk.a((aI)paramR, arrayOfString[b++]));
          if (arrayOfString.length > b) {
            try {
              bb.c(X.g(arrayOfString[b++]));
            } catch (NumberFormatException numberFormatException) {
              b(paramM, "Invalid decimal bits value");
            } 
          } else {
            b(paramM, "Decimal bits is required for paramClass dotScalar");
          } 
        } 
        if (arrayOfString.length > b)
          try {
            bb.f(X.g(arrayOfString[b++]));
          } catch (NumberFormatException numberFormatException) {
            b(paramM, "Invalid DLRAM_AddPad value");
          }  
        if (arrayOfString.length > b)
          try {
            bb.b(X.g(arrayOfString[b++]));
          } catch (NumberFormatException numberFormatException) {
            b(paramM, "Invalid digits value");
          }  
        while (arrayOfString.length > b) {
          String str3 = arrayOfString[b++];
          if (str3.equals("hidden")) {
            bb.c(dk.a(0.0D));
            continue;
          } 
          if (str3.startsWith("{")) {
            bb.c(dk.a((aI)paramR, str3));
            continue;
          } 
          b(paramM, "Unknown Replay visible condition or flag");
        } 
      } else if (arrayOfString.length > 0 && arrayOfString[0].equals("bits")) {
        bb.a(arrayOfString[b++]);
        bb.b(arrayOfString[b++]);
        String str3 = arrayOfString[b++];
        if (str3.equals("nextOffset")) {
          bb.a(paramInt1);
        } else if (str3.equals("lastOffset")) {
          bb.a(paramInt2);
        } else {
          int i = X.g(str3);
          if (i < paramInt1 - bb.l());
          bb.a(i);
        } 
        String str4 = arrayOfString[b++];
        bb.d(m(str4));
        bb.e(n(str4));
        while (b < arrayOfString.length) {
          try {
            bb.d(X.b(arrayOfString[b], "\"", ""));
          } catch (g g) {
            b(paramM, g.getLocalizedMessage());
          } 
          b++;
        } 
      } else if (str2.startsWith("{")) {
        bb.a("formula");
        String str = arrayOfString[b++];
        str = X.b(str, "{", "");
        str = X.b(str, "}", "");
        str = k(str);
        bb.e(str);
        if (arrayOfString.length > 1 && arrayOfString.length > b) {
          db db = da.a().a(paramR, X.b(arrayOfString[b++], "\"", ""));
          bb.a(db);
        } 
        if (arrayOfString.length > 2) {
          String str3 = arrayOfString[b++];
          if (str3.equals("hidden")) {
            bb.c(dk.a(0.0D));
          } else if (str3.startsWith("{")) {
            bb.c(dk.a((aI)paramR, str3));
          } else {
            b(paramM, "Unknown Replay visible condition or flag");
          } 
        } 
      } else {
        throw new g("Malformed OutputChannel entry.");
      } 
    } catch (NumberFormatException numberFormatException) {
      throw new g("Malformed OutputChannel entry.");
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
  
  private al a(M paramM, aI paramaI, int paramInt1, int paramInt2) {
    al al = new al(paramaI.ac());
    al.s(this.l);
    String str = paramM.b();
    byte b = 0;
    try {
      String str1 = q(str);
      String[] arrayOfString = j(str1);
      al.v(X.b(arrayOfString[b++], "\"", ""));
      String str2 = arrayOfString[b++];
      if (str2.equals("scalar")) {
        al.a(str2);
        al.b(arrayOfString[b++]);
        String str3 = arrayOfString[b++];
        if (str3.equals("nextOffset")) {
          al.a(paramInt1);
        } else if (str3.equals("lastOffset")) {
          al.a(paramInt2);
        } else {
          int i = X.g(str3);
          al.a(i);
        } 
        if (arrayOfString.length > b) {
          al.c(arrayOfString[b++]);
          al.a(Double.parseDouble(arrayOfString[b++]));
          al.b(Double.parseDouble(arrayOfString[b++]));
        } 
      } else if (str2.equals("bits")) {
        al.a(arrayOfString[b++]);
        al.b(arrayOfString[b++]);
        al.a(X.g(arrayOfString[b++]));
        String str3 = arrayOfString[b++];
        al.d(m(str3));
        al.e(n(str3));
      } 
    } catch (Exception exception) {
      a(paramM, "Malformed Internal Log Field entry.");
    } 
    return al;
  }
  
  private aM a(R paramR, M paramM, int paramInt, aM paramaM) {
    aM aM1;
    String str1 = paramM.b();
    String str2 = p(str1);
    String str3 = q(str1);
    if (str3.startsWith("oddArray")) {
      aK aK = new aK();
    } else {
      aM1 = new aM();
    } 
    aM1.s(this.l);
    aM1.v(str2);
    aM1.c(paramInt);
    String[] arrayOfString = j(str3);
    byte b = 0;
    if (str3.startsWith("bits")) {
      aM1.a(arrayOfString[b++]);
      String str4 = arrayOfString[b++];
      String str5 = null;
      if (str4.indexOf("8  ") == -1) {
        aM1.b(str4);
        str5 = arrayOfString[b++];
      } else {
        aM1.b(str4.substring(0, str4.indexOf("8  ")));
        str5 = str4.substring(str4.indexOf("8  ") + 1).trim();
        b(paramM, "Constants entry missing comma, but corrected.");
      } 
      String str6 = null;
      if (str5.indexOf("[") == -1) {
        if (str5.equals("nextOffset")) {
          if (paramaM != null) {
            aM1.a((bW)new cm(paramaM));
          } else {
            aM1.a((bW)new bX(0));
          } 
        } else if (str5.equals("lastOffset")) {
          if (paramaM != null) {
            aM1.a(paramaM.f());
          } else {
            aM1.a((bW)new bX(0));
          } 
        } else {
          int k = X.g(str5);
          aM1.a((bW)new bX(k));
        } 
        str6 = arrayOfString[b++];
      } else {
        aM1.a((bW)new bX(X.g(str5.substring(0, str5.indexOf("[")))));
        str6 = str5.substring(str5.indexOf("["));
      } 
      aM1.f(m(str6));
      aM1.g(n(str6));
      aM1.c(o(str6));
      if (arrayOfString.length > b && arrayOfString[b].trim().startsWith("$")) {
        String str7 = arrayOfString[b].trim().substring(1);
        String str8 = (String)this.e.get(str7);
        if (str8 == null || str8.isEmpty()) {
          b(paramM, "String List not found. " + str7 + " Must be defined in ini file.");
        } else {
          String[] arrayOfString1 = j(str8);
          while (arrayOfString.length > ++b) {
            try {
              String[] arrayOfString2 = arrayOfString[b].split("=");
              int k = X.g(arrayOfString2[0].trim());
              arrayOfString1[k] = arrayOfString2[1].trim();
            } catch (Exception exception) {
              b(paramM, "Malformed Option over-ride: " + arrayOfString[b] + " Proper format for index 1: 1=\"My Override String\"");
            } 
            b++;
          } 
          for (String str : arrayOfString1) {
            try {
              aM1.d(str);
            } catch (g g) {
              b(paramM, g.getLocalizedMessage());
            } 
          } 
        } 
      } else {
        HashMap<Object, Object> hashMap = null;
        ArrayList<String> arrayList = new ArrayList();
        int k = -1;
        try {
          while (b < arrayOfString.length) {
            if (arrayOfString[b].indexOf("=") > 0 && arrayOfString[b].indexOf("=") < arrayOfString[b].indexOf("\"")) {
              if (hashMap == null)
                hashMap = new HashMap<>(); 
              String str7 = arrayOfString[b].substring(0, arrayOfString[b].indexOf("="));
              String str8 = arrayOfString[b].substring(arrayOfString[b].indexOf("=") + 1, arrayOfString[b].length());
              Integer integer = Integer.valueOf(Integer.parseInt(str7));
              if (integer.intValue() > k)
                k = integer.intValue(); 
              hashMap.put(integer, str8);
            } else {
              String str = arrayOfString[b];
              arrayList.add(str);
            } 
            b++;
          } 
          if (hashMap == null) {
            for (String str : arrayList) {
              try {
                aM1.d(str);
              } catch (g g) {
                b(paramM, g.getLocalizedMessage());
              } 
            } 
          } else {
            int m = (int)Math.pow(2.0D, aM1.x());
            for (byte b1 = 0; b1 < m; b1++) {
              if (hashMap.get(Integer.valueOf(b1)) != null) {
                try {
                  aM1.d((String)hashMap.get(Integer.valueOf(b1)));
                } catch (g g) {
                  b(paramM, g.getLocalizedMessage());
                } 
              } else {
                try {
                  aM1.d("INVALID");
                } catch (g g) {
                  b(paramM, g.getLocalizedMessage());
                } 
              } 
            } 
          } 
        } catch (Exception exception) {
          b(paramM, "Invalid Option List. Expected formats are: \"Option1\", \"Option2\", etc OR: index=\"Option1\", index=\"Option2\", etc. index must be a valid integer.");
        } 
      } 
      int i = (int)Math.pow(2.0D, aM1.x());
      int j = aM1.y().size();
      if (i > j) {
        if (!paramR.O().at())
          b(paramM, "bit Constant " + aM1.aL() + ", contains fewer options (" + aM1.y().size() + ") than expected(" + i + "), padding remaining with \"INVALID\""); 
        for (int k = j; k < i; k++)
          aM1.d("INVALID"); 
      } 
    } else if (str3.startsWith("array") || str3.startsWith("oddArray")) {
      aM1.a(arrayOfString[b++]);
      aM1.b(arrayOfString[b++]);
      String str = arrayOfString[b++];
      if (str.equals("nextOffset")) {
        if (paramaM != null) {
          aM1.a((bW)new cm(paramaM));
        } else {
          aM1.a((bW)new bX(0));
        } 
      } else if (str.equals("lastOffset")) {
        if (paramaM != null) {
          aM1.a(paramaM.f());
        } else {
          aM1.a((bW)new bX(0));
        } 
      } else {
        int i = X.g(str);
        aM1.a((bW)new bX(i));
      } 
      A a = a(paramR, paramM, arrayOfString[b++]);
      aM1.a(a);
      if (arrayOfString.length > b) {
        db db = da.a().a(paramR, X.b(arrayOfString[b++], "\"", ""));
        aM1.a(db);
      } 
      if (arrayOfString.length > b)
        aM1.a(dk.a((aI)paramR, arrayOfString[b++])); 
      if (arrayOfString.length > b)
        aM1.b(dk.a((aI)paramR, arrayOfString[b++])); 
      if (arrayOfString.length > b)
        aM1.c(dk.a((aI)paramR, arrayOfString[b++])); 
      if (arrayOfString.length > b)
        aM1.d(dk.a((aI)paramR, arrayOfString[b++])); 
      try {
        if (arrayOfString.length > b)
          aM1.e(dk.a((aI)paramR, arrayOfString[b++])); 
      } catch (g g) {
        b(paramM, g.getMessage());
      } 
      if (arrayOfString.length > b)
        while (b < arrayOfString.length) {
          if (arrayOfString[b].equals("noSizeMutation")) {
            aM1.c(false);
          } else if (arrayOfString[b].equals("noMsqSave") || arrayOfString[b].equals("noSaveToMsq")) {
            aM1.b(false);
          } 
          b++;
        }  
    } else if (str3.startsWith("scalar")) {
      aM1.a(arrayOfString[b++]);
      aM1.b(arrayOfString[b++]);
      String str = arrayOfString[b++];
      if (str.equals("nextOffset")) {
        if (paramaM != null) {
          aM1.a((bW)new cm(paramaM));
        } else {
          aM1.a((bW)new bX(0));
        } 
      } else if (str.equals("lastOffset")) {
        if (paramaM != null) {
          aM1.a(paramaM.f());
        } else {
          aM1.a((bW)new bX(0));
        } 
      } else {
        int i = X.g(str);
        aM1.a((bW)new bX(i));
      } 
      if (arrayOfString.length > b) {
        db db = da.a().a(paramR, X.b(arrayOfString[b++], "\"", ""));
        aM1.a(db);
        aM1.a(dk.a((aI)paramR, arrayOfString[b++]));
        aM1.b(dk.a((aI)paramR, arrayOfString[b++]));
        if (arrayOfString.length > b + 2) {
          aM1.c(dk.a((aI)paramR, arrayOfString[b++]));
          aM1.d(dk.a((aI)paramR, arrayOfString[b++]));
          aM1.e(dk.a((aI)paramR, arrayOfString[b++]));
          if (arrayOfString.length > b && (arrayOfString[b].equals("noLocalUpdate") || arrayOfString[b].equals("noSaveToMsq") || arrayOfString[b].equals("noMsqSave"))) {
            aM1.b(false);
          } else if (arrayOfString.length > b && arrayOfString[b].equals("controllerPriority")) {
            aM1.i(true);
          } else if (arrayOfString.length > b) {
            b(paramM, "Unknown Constant Option: " + arrayOfString[b]);
          } 
          b++;
        } 
      } 
    } else if (str3.startsWith("string")) {
      aM1.a(arrayOfString[b++]);
      aM1.b(arrayOfString[b++]);
      String str = arrayOfString[b++];
      if (str.equals("nextOffset")) {
        if (paramaM != null) {
          aM1.a((bW)new cm(paramaM));
        } else {
          aM1.a((bW)new bX(0));
        } 
      } else if (str.equals("lastOffset")) {
        if (paramaM != null) {
          aM1.a(paramaM.f());
        } else {
          aM1.a((bW)new bX(0));
        } 
      } else {
        int i = X.g(str);
        aM1.a((bW)new bX(i));
      } 
      aM1.a(1, X.g(arrayOfString[b++]));
      if (arrayOfString.length > b) {
        String str4 = arrayOfString[b++];
        try {
          aM1.e(dk.a((aI)paramR, str4));
        } catch (g g) {
          b(paramM, "Invalid String parameter Option for columns: " + str4);
        } 
      } 
      if (arrayOfString.length > b)
        b(paramM, "Unknown Constant Option: " + arrayOfString[b]); 
    } else {
      a(paramM, "Unknown paramClass for ini entry.");
    } 
    return aM1;
  }
  
  private aM l(R paramR, M paramM) {
    String str1 = paramM.b();
    ca ca = new ca();
    String str2 = p(str1);
    String str3 = q(str1);
    ca.v(str2);
    ca.c(-1);
    ca.a((bW)new bX(0));
    String[] arrayOfString = j(str3);
    byte b = 0;
    if (arrayOfString[0].equals(ca.d) || arrayOfString[0].equals(ca.e)) {
      if (arrayOfString.length < 2) {
        a(paramM, "2 parameters required for paramClass: channelValueOnConnect or continuousChannelValue");
      } else {
        ca.a(arrayOfString[0]);
        ca.g(arrayOfString[1]);
        ca.b("S32");
        cy.a(paramR).a(ca);
      } 
    } else if (str3.startsWith("bits")) {
      ca.a(arrayOfString[b++]);
      String str4 = arrayOfString[b++];
      ca.b(str4);
      String str5 = arrayOfString[b++];
      ca.f(m(str5));
      ca.g(n(str5));
      ca.c(o(str5));
      while (b < arrayOfString.length) {
        ca.d(arrayOfString[b]);
        b++;
      } 
    } else if (str3.startsWith("array")) {
      ca.a(arrayOfString[b++]);
      ca.b(arrayOfString[b++]);
      A a = a(paramR, paramM, arrayOfString[b++]);
      ca.a(a);
      if (arrayOfString.length > b) {
        db db = da.a().a(paramR, X.b(arrayOfString[b++], "\"", ""));
        ca.a(db);
      } 
      if (arrayOfString.length > b)
        ca.a(dk.a((aI)paramR, arrayOfString[b++])); 
      if (arrayOfString.length > b)
        ca.b(dk.a((aI)paramR, arrayOfString[b++])); 
      if (arrayOfString.length > b)
        ca.c(dk.a((aI)paramR, arrayOfString[b++])); 
      if (arrayOfString.length > b)
        ca.d(dk.a((aI)paramR, arrayOfString[b++])); 
      if (arrayOfString.length > b)
        ca.e(dk.a((aI)paramR, arrayOfString[b++])); 
      if (arrayOfString.length > b)
        while (b < arrayOfString.length) {
          if (arrayOfString[b].equals("noSizeMutation")) {
            ca.c(false);
          } else if (arrayOfString[b].equals("noMsqSave") || arrayOfString[b].equals("noSaveToMsq")) {
            ca.b(false);
          } 
          b++;
        }  
    } else if (str3.startsWith("scalar")) {
      ca.a(arrayOfString[b++]);
      ca.b(arrayOfString[b++]);
      if (arrayOfString.length > b) {
        db db = da.a().a(paramR, X.b(arrayOfString[b++], "\"", ""));
        ca.a(db);
        ca.a(dk.a((aI)paramR, arrayOfString[b++]));
        ca.b(dk.a((aI)paramR, arrayOfString[b++]));
        if (arrayOfString.length > b + 2) {
          ca.c(dk.a((aI)paramR, arrayOfString[b++]));
          ca.d(dk.a((aI)paramR, arrayOfString[b++]));
          ca.e(dk.a((aI)paramR, arrayOfString[b++]));
          if (arrayOfString.length > b && (arrayOfString[b].equals("noLocalUpdate") || arrayOfString[b].equals("noSaveToMsq") || arrayOfString[b].equals("noMsqSave"))) {
            ca.b(false);
          } else if (arrayOfString.length > b) {
            b(paramM, "Unknown Constant Option: " + arrayOfString[b]);
          } 
          b++;
        } 
      } 
    } else if (str3.startsWith("string")) {
      ca.a(arrayOfString[b++]);
      ca.b(arrayOfString[b++]);
      ca.a(1, X.g(arrayOfString[b++]));
      if (arrayOfString.length > b) {
        String str = arrayOfString[b++];
        try {
          ca.e(dk.a((aI)paramR, str));
        } catch (g g) {
          b(paramM, "Invalid String parameter Option for columns: " + str);
        } 
      } 
      if (arrayOfString.length > b);
    } else {
      b(paramM, "Unknown paramClass for ini entry.");
    } 
    return (aM)ca;
  }
  
  private A a(R paramR, M paramM, String paramString) {
    B b1;
    B b2;
    if (paramString.contains("{")) {
      String[] arrayOfString = l(paramString);
      if (arrayOfString.length == 2) {
        bR bR3 = new bR((aI)paramR, arrayOfString[0]);
        if ((bR3.b()).length > 1)
          b(paramM, "Columns Expression should have 1 variable for Table Widgets to offer resizing."); 
        bR bR4 = new bR((aI)paramR, arrayOfString[1]);
        if ((bR4.b()).length > 1)
          b(paramM, "Row Expression should have 1 variable for Table Widgets to offer resizing."); 
        bR bR1 = bR3;
        bR bR2 = bR4;
      } else if (arrayOfString.length == 1) {
        b1 = new B(1.0D);
        bR bR = new bR((aI)paramR, arrayOfString[0]);
      } else {
        throw new g("Failed to parse array dimension from: " + paramString);
      } 
    } else {
      int i = paramString.toLowerCase().indexOf("x");
      if (i != -1) {
        b1 = new B(X.g(paramString.substring(1, i).trim()));
        b2 = new B(X.g(paramString.substring(i + 1, paramString.indexOf("]", i)).trim()));
      } else {
        b1 = new B(1.0D);
        b2 = new B(X.g(paramString.substring(paramString.indexOf("[") + 1, paramString.indexOf("]")).trim()));
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
    int i = 0;
    boolean bool = false;
    ArrayList<String> arrayList = new ArrayList();
    for (int j = i; j < paramString.length(); j++) {
      if (paramString.charAt(j) == '{') {
        i = j + 1;
        bool = true;
      } else if (paramString.charAt(j) == '}' || (!bool && paramString.charAt(j) == 'x') || j == paramString.length() - 1) {
        String str = paramString.substring(i, j);
        arrayList.add(str);
        bool = false;
        i = j + 1;
        while (j < paramString.length() - 1 && paramString.charAt(j + 1) != '{')
          j++; 
      } 
    } 
    return arrayList.<String>toArray(new String[arrayList.size()]);
  }
  
  private int m(String paramString) {
    return X.g(paramString.substring(1, paramString.indexOf(":")));
  }
  
  private int n(String paramString) {
    String str1 = paramString.substring(paramString.indexOf(":") + 1);
    String str2 = (str1.indexOf("+") != -1) ? str1.substring(0, str1.indexOf("+")) : str1.substring(0, str1.indexOf("]"));
    return X.g(str2.trim());
  }
  
  private double o(String paramString) {
    return (paramString.indexOf("+") != -1) ? Double.parseDouble(paramString.substring(paramString.indexOf("+") + 1, paramString.indexOf("]"))) : 0.0D;
  }
  
  private String p(String paramString) {
    return Q.b(paramString);
  }
  
  private String q(String paramString) {
    return Q.a(paramString);
  }
  
  private String r(String paramString) {
    String str = paramString.trim();
    int i = str.indexOf(" ");
    str = str.substring(i).trim();
    int j = str.indexOf(" ", i + 1);
    if (j < 0)
      j = str.length(); 
    return str.substring(0, j).trim();
  }
  
  public boolean a() {
    return this.j;
  }
  
  public void a(boolean paramBoolean) {
    this.j = paramBoolean;
  }
  
  private void a(R paramR, String paramString, int paramInt) {
    if (paramString != null && !paramString.equals("") && paramR.e().c(paramString) == null)
      if (paramString.equals("std_warmup")) {
        i i = new i(paramR, paramInt);
        paramR.e().a((bv)i);
      } else if (paramString.equals("std_accel")) {
        a a = new a(paramR, paramInt, true);
        paramR.e().a((bv)a);
      }  
  }
  
  public void b(boolean paramBoolean) {
    this.l = paramBoolean;
  }
  
  private String c(M paramM, String paramString) {
    if (paramString.contains("$")) {
      String[] arrayOfString = j(paramString);
      StringBuilder stringBuilder = new StringBuilder();
      for (byte b = 0; b < arrayOfString.length; b++) {
        String str = arrayOfString[b];
        if (str.trim().startsWith("$")) {
          String str1 = arrayOfString[b].trim().substring(1);
          String str2 = (String)this.e.get(str1);
          if (str2 == null || str2.isEmpty()) {
            b(paramM, "#defines String List not found. " + str1 + " Must be defined in ini above usage point.");
          } else {
            stringBuilder.append(str2);
          } 
        } else {
          stringBuilder.append(str);
        } 
        if (b < arrayOfString.length - 1)
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