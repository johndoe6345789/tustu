package h;

import W.V;
import W.W;
import W.X;
import W.aa;
import W.ak;
import ak.aI;
import ak.ao;
import ak.e;
import ak.g;
import bH.X;
import g.a;
import j.a;
import java.util.ArrayList;

public class b {
  private static b o = null;
  
  ArrayList a = new ArrayList();
  
  public static String b = " Lite!";
  
  public static String c = "MS";
  
  public static String d = "(Beta)";
  
  public static String e = "BigStuff3";
  
  public static String f = "EmbeddedBS3";
  
  public static String g = "EmbeddedMS";
  
  public static String h = "Acquisition";
  
  public static String i = "HD";
  
  public static String j = "MegaLogViewer";
  
  public static String k = j;
  
  public static String l = "Dyno Spectrum Data";
  
  private a p = new e(this);
  
  public static String[] m = new String[] { "MAP", "Load", "TPS", "TP", "TP ADC", "TPS 8Bit" };
  
  public static Class n = null;
  
  public static b a() {
    if (o == null)
      o = new b(); 
    return o;
  }
  
  public void a(String paramString1, String paramString2) {
    this.a = new ArrayList();
    if (paramString2.contains(d))
      paramString2 = X.b(paramString2, d, ""); 
    if (paramString1.equals(j)) {
      if (paramString2.equals(c)) {
        this.a.add("triggerLogViewer");
        this.a.add("scatterPlots");
        this.a.add("tuningPanelVisible");
        this.a.add("advancedVeAnalyze");
        this.a.add("veAnalyze");
        this.a.add("optionalFields");
        this.a.add("customFields");
        this.a.add("compareMode");
        this.a.add("upgradeOldRegistration");
        this.a.add("searchLogFiles");
        this.a.add("tablePremium");
        this.a.add("fileEditing");
        this.a.add("optionalQuickSelect");
        this.a.add("selectGraphTraceCount");
        this.a.add("selectableFields");
        this.a.add("optionalTableLayouts");
        this.a.add("advancedMathFunctions");
        this.a.add("selectableLookAndFeel");
        this.a.add("tabbedQuickViews");
        this.a.add("spoji[asfi2309jdi234iofwae2344");
        this.a.add("okdsas32lkg09832jnegm7");
        this.a.add("timeslipData");
        this.p = new f(this);
        W.a().a(X.m, aI.class);
        W.a().a(X.I, ao.class);
        V.d = false;
      } else if (paramString2.equals(f)) {
        this.a.add("tuningPanelVisible");
        this.a.add("advancedVeAnalyze");
        this.a.add("compareMode");
        this.a.add("optionalQuickSelect");
        this.a.add("searchLogFiles");
        this.a.add("tablePremium");
        this.a.add("fileEditing");
        this.a.add("timeslipData");
        this.a.add("selectableFields");
        this.a.add("advancedMathFunctions");
        this.a.add("fieldNameNormalization");
        this.a.add("okdsas32lkg09832jnegm7");
        this.a.add("tabbedQuickViews");
        this.a.add("fileEditing");
        this.a.add(";lkewlk nbi3k48tjh265'");
        this.a.add("4e345hggsdhd4812hfd43-0gdk");
        this.a.add("fieldSmoothing");
        i.v = ",";
        this.p = new f(this);
        W.a().a(X.w, e.class);
        W.a().a(X.I, ao.class);
        V.d = false;
        n = a.class;
      } else if (paramString2.equals(g)) {
        this.a.add("tuningPanelVisible");
        this.a.add("advancedVeAnalyze");
        this.a.add("compareMode");
        this.a.add("searchLogFiles");
        this.a.add("optionalQuickSelect");
        this.a.add("timeslipData");
        this.a.add("tablePremium");
        this.a.add("fileEditing");
        this.a.add("selectableFields");
        this.a.add("advancedMathFunctions");
        this.a.add("fieldNameNormalization");
        this.a.add("tabbedQuickViews");
        this.a.add("spoji[asfi2309jdi234iofwae2344");
        this.a.add("okdsas32lkg09832jnegm7");
        this.a.add("fileEditing");
        this.a.add(";lkewlk nbi3k48tjh265'");
        this.a.add("4e345hggsdhd4812hfd43-0gdk");
        this.a.add("fieldSmoothing");
        this.p = new f(this);
        W.a().a(X.I, ao.class);
        V.d = false;
      } else if (paramString2.equals(i)) {
        d();
        this.p = new f(this);
      } else if (paramString2.equals(i + b)) {
        e();
      } else if (paramString2.equals(e)) {
        c();
        this.p = new f(this);
        char[] arrayOfChar = { 
            'E', 'F', 'I', 'A', 'K', 'e', 'y', '!', '0', '8', 
            '8', '2', '8', '3', '5', '4' };
        ak.a(arrayOfChar);
      } else if (paramString2.equals(e + b)) {
        b();
        char[] arrayOfChar = { 
            'E', 'F', 'I', 'A', 'K', 'e', 'y', '!', '0', '8', 
            '8', '2', '8', '3', '5', '4' };
        ak.a(arrayOfChar);
      } else if (paramString2.equals(c + b)) {
        this.a.add("tuningPanelVisible");
        this.a.add("showRegisterTab");
        this.a.add("upgradeOldRegistration");
        this.a.add("limitFileLoadSize");
        this.a.add("veAnalyze");
        W.a().a(X.I, ao.class);
        V.d = false;
      } else {
        this.a.add("tuningPanelVisible");
        this.a.add("showRegisterTab");
        this.a.add("upgradeOldRegistration");
        W.a().a(X.I, ao.class);
      } 
    } else if (paramString1.equals(k)) {
      if (paramString2.equals(e)) {
        c();
        this.p = new f(this);
      } else {
        b();
      } 
    } else if (paramString1.equals(l)) {
      if (paramString2.contains(b.trim())) {
        e();
      } else {
        d();
        this.p = new f(this);
      } 
      this.a.remove("triggerLogViewer");
      this.a.add("tuningPanelVisible");
    } 
    this.a.add("upgradeOldRegistration");
    g.q = a().a("limitFileLoadSize");
  }
  
  private void b() {
    i.m = "https://www.efianalytics.com/BigStuffLog/";
    i.n = "https://www.efianalytics.com/register/viewProduct.jsp?productCode=BigStuffLog";
    this.a.add("showRegisterTab");
    this.a.add("upgradeOldRegistration");
    this.a.add("optionalQuickSelect");
    this.a.add("tuningPanelVisible");
    this.a.add("fieldNameNormalization");
    g.b.a(2500);
    aa.d = true;
    W.a().a(X.a, e.class);
    W.a().a(X.w, e.class);
    W.a().a(X.I, ao.class);
    V.d = true;
    String[] arrayOfString = { "MAP", "TPS_Pct", "Boost", "kPaFromPsi" };
    m = arrayOfString;
    n = a.class;
    n = a.class;
  }
  
  private void c() {
    i.m = "https://www.efianalytics.com/BigStuffLog/";
    i.n = "https://www.efianalytics.com/register/viewProduct.jsp?productCode=BigStuffLog";
    this.a.add("scatterPlots");
    this.a.add("tableGenerator");
    this.a.add("tuningPanelVisible");
    this.a.add("hideLoadReversedOption");
    this.a.add("hideRpmX100Option");
    this.a.add("advancedVeAnalyze");
    this.a.add("veAnalyze");
    this.a.add("optionalFields");
    this.a.add("customFields");
    this.a.add("compareMode");
    this.a.add("searchLogFiles");
    this.a.add("tablePremium");
    this.a.add("fileEditing");
    this.a.add("advancedMathFunctions");
    this.a.add("optionalQuickSelect");
    this.a.add("selectGraphTraceCount");
    this.a.add("selectableFields");
    this.a.add("optionalTableLayouts");
    this.a.add("timeslipData");
    this.a.add("hideYaxisSelection");
    this.a.add("fieldNameNormalization");
    this.a.add("tabbedQuickViews");
    this.a.add("fieldSmoothing");
    this.a.add("triggerLogViewer");
    this.a.add("okdsas32lkg09832jnegm7");
    this.a.add("timeslipData");
    this.a.add(";lkewlk nbi3k48tjh265'");
    i.v = ",";
    aa.d = true;
    W.a().a(X.a, g.class);
    W.a().a(X.w, e.class);
    W.a().a(X.I, ao.class);
    V.d = false;
    String[] arrayOfString = { "MAP", "Scaled_Load", "Scaled Load", "Scld_Load", "TPS", "TP ADC", "kPaFromPsi" };
    m = arrayOfString;
  }
  
  private void d() {
    this.a.add("scatterPlots");
    this.a.add("triggerLogViewer");
    this.a.add("tableGenerator");
    this.a.add("tuningPanelVisible");
    this.a.add("advancedVeAnalyze");
    this.a.add("veAnalyze");
    this.a.add("tablePremium");
    this.a.add("optionalFields");
    this.a.add("customFields");
    this.a.add("compareMode");
    this.a.add("hideRpmX100Option");
    this.a.add("searchLogFiles");
    this.a.add("fileEditing");
    this.a.add("selectableLookAndFeel");
    this.a.add("optionalQuickSelect");
    this.a.add("selectGraphTraceCount");
    this.a.add("selectableFields");
    this.a.add("optionalTableLayouts");
    this.a.add("advancedMathFunctions");
    this.a.add("fillNaN");
    this.a.add("timeslipData");
    this.a.add("fieldSmoothing");
    this.a.add("fieldNameNormalization");
    this.a.add("fieldNameNormalizationEditable");
    this.a.add("tabbedQuickViews");
    this.a.add("fa-9fdspoijoijnfdz09jfdsa098j");
    this.a.add("fdsahoirew098rew3284lksafd");
    this.a.add("spoji[asfi2309jdi234iofwae2344");
    this.a.add("okdsas32lkg09832jnegm7");
    this.a.add("4e345hggsdhd4812hfd43-0gdk");
    this.a.add("lkj094320/    q0-fmtg8vc");
    this.a.add(";lkewlk nbi3k48tjh265'");
    i.aK = false;
    i.p = false;
    c c = new c(this);
    c.start();
  }
  
  private void e() {
    this.a.add("scatterPlots");
    this.a.add("tuningPanelVisible");
    this.a.add("tableGenerator");
    this.a.add("veAnalyze");
    this.a.add("hideRpmX100Option");
    this.a.add("showRegisterTab");
    this.a.add("fieldSmoothing");
    this.a.add("fieldNameNormalizationEditable");
    this.a.add("fieldNameNormalization");
    this.a.add("tabbedQuickViews");
    this.a.add("4e345hggsdhd4812hfd43-0gdk");
    this.a.add("lkj094320/    q0-fmtg8vc");
    i.p = false;
    g.b.a(1000);
    d d = new d(this);
    d.start();
  }
  
  public boolean a(String paramString) {
    return this.a.contains(paramString);
  }
  
  public boolean b(String paramString) {
    return this.p.a(paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/h/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */