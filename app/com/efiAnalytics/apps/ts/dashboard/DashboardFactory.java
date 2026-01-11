package com.efiAnalytics.apps.ts.dashboard;

import G.R;
import G.ah;
import G.ak;
import G.cr;
import G.cu;
import G.k;
import I.d;
import V.a;
import aE.a;
import bH.D;
import bH.S;
import bH.T;
import com.efiAnalytics.apps.ts.dashboard.renderers.BasicReadoutGaugePainter;
import com.efiAnalytics.apps.ts.dashboard.renderers.GaugePainter;
import com.efiAnalytics.apps.ts.dashboard.renderers.HistogramPainter;
import com.efiAnalytics.apps.ts.dashboard.renderers.e;
import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r.a;
import r.j;
import v.c;

public class DashboardFactory {
  public static int a = 1;
  
  public static String b = null;
  
  public static String c = "/com/efiAnalytics/apps/ts/dashboard/default.gauge";
  
  private Gauge e = null;
  
  private final int f = 300;
  
  private final int g = 300;
  
  private final int h = 360;
  
  private final int i = 0;
  
  private final int j = 6;
  
  private static DashboardFactory k = new DashboardFactory();
  
  public static Color d = Color.GRAY;
  
  public static boolean a(R paramR, Z paramZ) {
    for (Component component : paramZ.c()) {
      if (component instanceof SingleChannelDashComponent) {
        SingleChannelDashComponent singleChannelDashComponent = (SingleChannelDashComponent)component;
        if (singleChannelDashComponent.getOutputChannel() != null && !singleChannelDashComponent.getOutputChannel().isEmpty() && !singleChannelDashComponent.getEcuConfigurationName().equals(cu.a) && paramR.g(singleChannelDashComponent.getOutputChannel()) == null)
          return false; 
      } 
    } 
    return true;
  }
  
  public void a(x paramx, a parama, String paramString) {
    String str = a(parama, paramString);
    paramx.d(str);
  }
  
  private String a(a parama, String paramString) {
    return parama.m() + paramString + "." + a.co;
  }
  
  public Z a(R paramR, a parama, String paramString, int paramInt) {
    String str = a(parama, paramString);
    File file = new File(str);
    return file.exists() ? (new c(j.G())).a(str) : a(paramR, paramString, paramInt);
  }
  
  private Z b(R paramR, String paramString) {
    double d4;
    String[] arrayOfString = c(paramR, "FrontPage");
    File file = new File(j.h(), paramString);
    if (!file.exists())
      throw new a("Invalid Dashboard Template: " + paramString); 
    Z z = (new c(j.G())).a(file.getAbsolutePath());
    ArrayList<ah> arrayList = a(paramR, arrayOfString, true);
    z.b(paramR.i());
    byte b1 = 7;
    double d1 = 0.004D;
    double d2 = 0.002D;
    int i = 1 + (arrayList.size() - 1) / b1;
    Gauge gauge = null;
    Component[] arrayOfComponent = z.c();
    ArrayList<s> arrayList1 = new ArrayList();
    for (Component component : arrayOfComponent) {
      if (gauge == null && component instanceof Gauge)
        gauge = (Gauge)component; 
      if (component instanceof s)
        arrayList1.add((s)component); 
    } 
    if (gauge == null) {
      gauge = new Gauge();
      gauge.setGaugePainter((GaugePainter)new BasicReadoutGaugePainter());
    } 
    byte b2 = 14;
    int j = paramR.w();
    byte b3 = (j > 0) ? (j / b2 + 1) : 0;
    if (b3 == 1 && paramR.w() > b2)
      b3 = 2; 
    double d3 = 0.031D;
    byte b4 = 0;
    int k = (int)Math.ceil((j / b3));
    if (j > 0) {
      d4 = (j % b3 == 0) ? (b3 / j) : (1.0F / k);
    } else {
      d4 = 0.0D;
    } 
    double d5 = 1.0D / b1;
    double d6 = (0.5D - b3 * d3) / i;
    if (d6 > 0.09D)
      d6 = 0.09D; 
    s[] arrayOfS = new s[arrayList1.size() + arrayList.size() + j];
    byte b5 = 0;
    for (s s : arrayList1) {
      arrayOfS[b5] = s;
      b5++;
    } 
    double d7 = 0.0015D;
    double d8 = 1.0D - i * d6 - b3 * d3;
    for (byte b6 = 0; b6 < i; b6++) {
      double d = d8 + d6 * b6;
      for (byte b = 0; b < b1 && b6 * b1 + b < arrayList.size(); b++) {
        int m = b6 * b1 + b;
        ah ah = arrayList.get(m);
        Gauge gauge1 = new Gauge();
        a(gauge, gauge1);
        a(gauge1, ah);
        gauge1.setRelativeX(b * d5 + d2);
        gauge1.setRelativeY(d);
        gauge1.setRelativeWidth(d5 - d2 * 2.0D);
        gauge1.setRelativeHeight(d6 - d1 * 2.0D);
        arrayOfS[b5] = gauge1;
        b5++;
      } 
    } 
    double d9 = d8 + d6 * i + d1;
    Iterator<ak> iterator = paramR.A();
    while (iterator.hasNext()) {
      ak ak = iterator.next();
      if (ak.k()) {
        Indicator indicator = new Indicator();
        double d10 = (int)(b4 * d4);
        indicator.setRelativeX((d7 + b4 * d4) % 1.0D);
        double d11 = d9 + d4 * d10;
        indicator.setRelativeY(d11);
        indicator.setRelativeWidth(d4 - d7 * 2.0D);
        indicator.setRelativeHeight(d3 - d7 * 2.0D);
        indicator.setOnText(ak.a().toString());
        indicator.setOnBackgroundColor(new Color(ak.g().a()));
        indicator.setOnTextColor(new Color(ak.i().a()));
        indicator.setOffText(ak.d().toString());
        indicator.setOffBackgroundColor(new Color(ak.h().a()));
        indicator.setOffTextColor(new Color(ak.j().a()));
        indicator.setOutputChannel(ak.f());
        b4++;
        arrayOfS[b5] = indicator;
        b5++;
      } 
    } 
    z.a((Component[])arrayOfS);
    return z;
  }
  
  public Z a(R paramR, String paramString, int paramInt) {
    int i = -1;
    int j = -1;
    String[] arrayOfString = c(paramR, paramString);
    if (arrayOfString == null)
      throw new a("Cluster not found for " + paramString + ", and no default gauge set defined in configuration."); 
    int k = a(paramR, arrayOfString);
    if (a(paramString))
      try {
        return b(paramR, b);
      } catch (a a) {
        a.printStackTrace();
      }  
    if (paramInt == 1) {
      i = k / 2;
      j = 2;
    } else if (paramInt == 2) {
      j = k / 2;
      i = 2;
    } else if (paramInt == 6) {
      j = k;
      i = 1;
    } else {
      if (paramInt == 4)
        return a(paramR, paramString, true, 1); 
      if (paramInt == 5) {
        Z z = a(paramR, paramString, false, 1);
        z.b(c());
        return z;
      } 
      double d = Math.sqrt(arrayOfString.length);
      j = (d > (int)d) ? ((int)d + 1) : (int)d;
      i = j;
    } 
    return a(paramR, paramString, j, i);
  }
  
  private String[] c(R paramR, String paramString) {
    String[] arrayOfString = paramR.j(paramString);
    if (arrayOfString == null) {
      arrayOfString = paramR.j("Default");
      if (arrayOfString == null || arrayOfString.length == 0)
        arrayOfString = paramR.j("FrontPage"); 
      if ((paramString.startsWith("veAnalyze_") || paramString.startsWith("wueAnalyze_")) && !paramString.endsWith("_histogram") && arrayOfString.length > 3) {
        String[] arrayOfString1 = new String[3];
        arrayOfString1[0] = arrayOfString[0];
        arrayOfString1[1] = arrayOfString[1];
        arrayOfString1[2] = arrayOfString[2];
        return arrayOfString1;
      } 
    } 
    return arrayOfString;
  }
  
  public Z a(R paramR, String paramString, boolean paramBoolean, int paramInt) {
    String[] arrayOfString = c(paramR, paramString);
    ArrayList arrayList = a(paramR, arrayOfString, paramBoolean);
    Z z = a(arrayList, paramInt);
    z.b(paramR.i());
    return z;
  }
  
  public Z a(ArrayList<ah> paramArrayList, int paramInt) {
    Z z = new Z();
    z.a(Color.BLACK);
    double d1 = 1.0D / paramInt;
    double d2 = 0.33D / paramInt;
    int i = (int)Math.ceil(paramArrayList.size() / paramInt);
    double d3 = 1.0D / i;
    ArrayList<Gauge> arrayList = new ArrayList();
    for (byte b = 0; b < i; b++) {
      for (byte b1 = 0; b1 < paramInt; b1++) {
        int j = b1 + paramInt * b;
        double d = b1 * d1;
        if (j < paramArrayList.size()) {
          ah ah = paramArrayList.get(j);
          Gauge gauge = new Gauge();
          gauge.setRelativeX(d);
          gauge.setRelativeY(b * d3);
          gauge.setRelativeWidth(d1);
          gauge.setRelativeHeight(d3);
          gauge.setBackColor(new Color(0, 0, 0, 0));
          gauge.setFontColor(Color.WHITE);
          gauge = b(gauge, ah);
          int k = (int)(Math.random() * 2.147483647E9D);
          HistogramPainter histogramPainter = new HistogramPainter();
          gauge.setNeedleColor(a(j));
          gauge.setGaugePainter((GaugePainter)histogramPainter);
          gauge.setGroupId(k);
          arrayList.add(gauge);
          gauge = new Gauge();
          gauge.setRelativeX(d + d1 - d2);
          gauge.setRelativeY(b * d3 + d3 / 3.3D);
          gauge.setRelativeWidth(d2);
          gauge.setRelativeHeight(d3 / 5.0D);
          gauge.setBackColor(new Color(0, 0, 0, 0));
          gauge.setWarnColor(Color.BLACK);
          gauge.setCriticalColor(Color.BLACK);
          gauge.setFontColor(Color.WHITE);
          gauge = b(gauge, ah);
          gauge.setBorderWidth(0);
          gauge.setTitle("");
          gauge.setUnits("");
          gauge.setFontSizeAdjustment(2);
          gauge.setGaugePainter((GaugePainter)new BasicReadoutGaugePainter());
          gauge.setWarnColor(gauge.getBackColor());
          gauge.setCriticalColor(gauge.getBackColor());
          gauge.setGroupId(k);
          arrayList.add(gauge);
        } 
      } 
    } 
    z.a(arrayList.<Component>toArray((Component[])new Gauge[arrayList.size()]));
    return z;
  }
  
  private Color a(int paramInt) {
    int i = paramInt % 5;
    switch (i) {
      case 0:
        return Color.CYAN;
      case 1:
        return Color.RED;
      case 2:
        return Color.YELLOW;
      case 3:
        return Color.GREEN;
      case 4:
        return Color.MAGENTA;
    } 
    return new Color(0, 255, 0);
  }
  
  private Gauge a(Gauge paramGauge, ah paramah) {
    paramGauge.setTitle(paramah.k().toString());
    paramGauge.setUnits(paramah.j().toString());
    paramGauge.setMinVP(paramah.b());
    paramGauge.setMaxVP(paramah.e());
    paramGauge.setLowWarningVP(paramah.f());
    paramGauge.setLowCriticalVP(paramah.o());
    paramGauge.setHighWarningVP(paramah.g());
    paramGauge.setHighCriticalVP(paramah.h());
    paramGauge.setOutputChannel(paramah.i());
    paramGauge.setValueDigits(paramah.m());
    paramGauge.setLabelDigits(paramah.n());
    paramGauge.setValue(paramah.d());
    return paramGauge;
  }
  
  private Gauge b(Gauge paramGauge, ah paramah) {
    paramGauge.setTitle(paramah.k().toString());
    paramGauge.setUnits(paramah.j().toString());
    paramGauge.setMin(paramah.b());
    paramGauge.setMax(paramah.e());
    paramGauge.setLowWarning(paramah.f());
    paramGauge.setLowCritical(paramah.o());
    paramGauge.setHighWarning(paramah.g());
    paramGauge.setHighCritical(paramah.h());
    paramGauge.setOutputChannel(paramah.i());
    paramGauge.setValueDigits(paramah.m());
    paramGauge.setLabelDigits(paramah.n());
    paramGauge.setBorderWidth(1);
    paramGauge.setValue(paramah.d());
    return paramGauge;
  }
  
  private boolean a(String paramString) {
    return (b != null && a == 7 && paramString != null && paramString.equals("FrontPage"));
  }
  
  public Z a(R paramR, String paramString, int paramInt1, int paramInt2) {
    if (a(paramString))
      try {
        return b(paramR, b);
      } catch (a a) {
        a.printStackTrace();
      }  
    String[] arrayOfString = c(paramR, paramString);
    Gauge gauge = d();
    ArrayList<ah> arrayList = a(paramR, arrayOfString, true);
    Z z = new Z();
    z.a(Color.BLACK);
    z.b(paramR.i());
    double d1 = 0.0D;
    double d2 = 0.0015D;
    double d3 = 0.0015D;
    ArrayList<ak> arrayList1 = a();
    if (paramString.equals("FrontPage")) {
      d2 = 0.005D;
      d1 = 0.031D;
      z.a(new Color(51, 51, 51));
      z.b(new Color(20, 20, 20));
    } 
    double d4 = 1.0D / paramInt2;
    byte b1 = 14;
    int i = paramR.w() + arrayList1.size();
    int j = i / b1 + 1;
    if (j == 1 && paramR.w() > b1)
      j = 2; 
    double d5 = (1.0D - j * d1) / paramInt1;
    s[] arrayOfS = new s[arrayList.size()];
    byte b2;
    for (b2 = 0; b2 < paramInt1; b2++) {
      for (byte b = 0; b < paramInt2; b++) {
        int k = b + paramInt2 * b2;
        if (k < arrayList.size()) {
          ah ah = arrayList.get(k);
          Gauge gauge1 = new Gauge();
          gauge1.setRelativeX(b * d4 + d3);
          gauge1.setRelativeY(b2 * d5 + d2);
          gauge1.setRelativeWidth(d4 - d3 * 2.0D);
          gauge1.setRelativeHeight(d5 - d2 * 2.0D);
          gauge1.setEcuConfigurationName(paramR.c());
          if (gauge != null) {
            gauge1 = a(gauge, gauge1);
          } else {
            gauge1.setSweepAngle(300);
            gauge1.setSweepBeginDegree(300);
            gauge1.setFaceAngle(360);
            gauge1.setStartAngle(0);
            gauge1.setRelativeBorderWidth2(0.02D);
            gauge1.setDisplayValueAt180(true);
          } 
          gauge1.setCounterClockwise(ah.q());
          gauge1.setTitle(ah.k().toString());
          gauge1.setUnits(ah.j().toString());
          gauge1.setMin(ah.b());
          gauge1.setMax(ah.e());
          gauge1.setLowWarning(ah.f());
          gauge1.setLowCritical(ah.o());
          gauge1.setHighWarning(ah.g());
          gauge1.setHighCritical(ah.h());
          gauge1.setOutputChannel(ah.i());
          gauge1.setValueDigits(ah.m());
          gauge1.setLabelDigits(ah.n());
          gauge1.setValue(ah.d());
          arrayOfS[k] = gauge1;
        } 
      } 
    } 
    if (paramString.equals("FrontPage")) {
      z.a(ab.a());
      b2 = 0;
      int k = (int)Math.ceil((i / j));
      double d6 = (i % j == 0) ? (j / i) : (1.0F / k);
      s[] arrayOfS1 = new s[arrayOfS.length + i];
      System.arraycopy(arrayOfS, 0, arrayOfS1, 0, arrayOfS.length);
      arrayOfS = arrayOfS1;
      double d7 = 0.0015D;
      null = paramR.A();
      while (null.hasNext()) {
        ak ak = null.next();
        if (ak.k()) {
          Indicator indicator = new Indicator();
          double d = (int)(b2 * d6);
          indicator.setRelativeX((d7 + b2 * d6) % 1.0D);
          indicator.setRelativeY(1.0D - d7 - d1 * (j - d));
          indicator.setRelativeWidth(d6 - d7 * 2.0D);
          indicator.setRelativeHeight(d1 - d7 * 2.0D);
          indicator.setOnText(ak.a().toString());
          indicator.setOnBackgroundColor(new Color(ak.g().a()));
          indicator.setOnTextColor(new Color(ak.i().a()));
          indicator.setOffText(ak.d().toString());
          indicator.setOffBackgroundColor(new Color(ak.h().a()));
          indicator.setOffTextColor(new Color(ak.j().a()));
          indicator.setOutputChannel(ak.f());
          arrayOfS[arrayOfS.length - b2 - 1] = indicator;
          b2++;
        } 
      } 
      for (ak ak : arrayList1) {
        Indicator indicator = new Indicator();
        double d = (int)(b2 * d6);
        indicator.setEcuConfigurationName(cu.a);
        indicator.setRelativeX((d7 + b2 * d6) % 1.0D);
        indicator.setRelativeY(1.0D - d7 - d1 * (j - d));
        indicator.setRelativeWidth(d6 - d7 * 2.0D);
        indicator.setRelativeHeight(d1 - d7 * 2.0D);
        indicator.setOnText(ak.a().toString());
        indicator.setOnBackgroundColor(a(ak.g()));
        indicator.setOnTextColor(a(ak.i()));
        indicator.setOffText(ak.d().toString());
        indicator.setOffBackgroundColor(a(ak.h()));
        indicator.setOffTextColor(a(ak.j()));
        indicator.setOutputChannel(ak.f());
        arrayOfS[arrayOfS.length - b2 - 1] = indicator;
        b2++;
      } 
    } else {
      z.a(ab.b());
    } 
    z.a((Component[])arrayOfS);
    z.b(c());
    b(paramR, z);
    return z;
  }
  
  private Color a(k paramk) {
    return new Color(paramk.b(), paramk.c(), paramk.d(), paramk.e());
  }
  
  private Color c() {
    return d;
  }
  
  public Z a(R paramR) {
    return a((cr)paramR);
  }
  
  public Z b(R paramR) {
    ArrayList<String> arrayList = new ArrayList();
    arrayList.add("rpm");
    arrayList.add("map");
    arrayList.add("mat");
    arrayList.add("clt");
    arrayList.add("O2");
    arrayList.add("tps");
    arrayList.add("warmupEnrich");
    arrayList.add("batteryVoltage");
    if (paramR.d("NARROW_BAND_EGO") != null) {
      arrayList.add("egoVoltage");
    } else if (paramR.g("afr") != null) {
      arrayList.add("afr");
    } else if (paramR.g("afr1") != null) {
      arrayList.add("afr1");
    } else if (paramR.g("lambda") != null) {
      arrayList.add("lambda");
    } 
    arrayList.add("coolant");
    arrayList.add("throttle");
    arrayList.add("advance");
    arrayList.add("pulseWidth1");
    arrayList.add("gammaEnrich");
    arrayList.add("veCurr1");
    arrayList.add("advSpark");
    arrayList.add("iacstep");
    ArrayList<ah> arrayList1 = new ArrayList();
    String[] arrayOfString = paramR.s();
    Object[] arrayOfObject = S.a((Object[])arrayOfString);
    for (byte b = 0; b < arrayOfObject.length; b++) {
      if (arrayList.contains(arrayOfObject[b])) {
        ah ah = a(paramR, (String)arrayOfObject[b]);
        if (ah != null)
          arrayList1.add(ah); 
      } 
    } 
    List list = S.a(arrayList1);
    ArrayList<ah> arrayList2 = new ArrayList();
    Iterator<ah> iterator = list.iterator();
    while (iterator.hasNext())
      arrayList2.add(iterator.next()); 
    Z z = a(arrayList2, 2);
    return a(z, paramR.c());
  }
  
  public Z a(Z paramZ, String paramString) {
    Component[] arrayOfComponent = paramZ.c();
    for (Component component : arrayOfComponent) {
      if (component instanceof s) {
        s s = (s)component;
        s.setEcuConfigurationName(paramString);
      } 
    } 
    return paramZ;
  }
  
  public int a(R paramR, String[] paramArrayOfString) {
    byte b = 0;
    for (String str : paramArrayOfString) {
      if (paramR.k(str) != null)
        b++; 
    } 
    return b;
  }
  
  public Z a(cr paramcr) {
    String[] arrayOfString = paramcr.s();
    Object[] arrayOfObject = S.a((Object[])arrayOfString);
    Z z = new Z();
    z.a(Color.LIGHT_GRAY);
    s[] arrayOfS = new s[arrayOfObject.length];
    double d1 = 2.0D;
    int i = (int)Math.round(Math.sqrt(d1 * arrayOfObject.length));
    int j = (int)Math.ceil(arrayOfObject.length / i);
    while ((i - 1) * j >= arrayOfObject.length)
      i--; 
    double d2 = 1.0D / j;
    double d3 = 1.0D / i;
    double d4 = 0.001D;
    double d5 = 0.001D;
    for (byte b = 0; b < i; b++) {
      for (byte b1 = 0; b1 < j; b1++) {
        int k = b1 + j * b;
        if (k >= arrayOfObject.length)
          break; 
        String str = (String)arrayOfObject[k];
        Gauge gauge = new Gauge();
        gauge.setGaugePainter((GaugePainter)new BasicReadoutGaugePainter());
        gauge.setOutputChannel(str);
        gauge.setEcuConfigurationName(paramcr.c());
        gauge.setRelativeX(b1 * d2 + d5);
        gauge.setRelativeY(b * d3 + d4);
        gauge.setRelativeWidth(d2 - d5 * 2.0D);
        gauge.setRelativeHeight(d3 - d4 * 2.0D);
        gauge.setBorderWidth(0);
        gauge.setBackColor(Color.BLACK);
        gauge.setWarnColor(Color.BLACK);
        gauge.setCriticalColor(Color.BLACK);
        gauge.setFontColor(Color.WHITE);
        gauge.setTitle(str);
        gauge.setUnits("");
        arrayOfS[k] = gauge;
      } 
    } 
    z.a((Component[])arrayOfS);
    return z;
  }
  
  private ArrayList a(R paramR, String[] paramArrayOfString, boolean paramBoolean) {
    ArrayList<ah> arrayList = new ArrayList();
    for (String str : paramArrayOfString) {
      if (paramR.k(str) != null && (!str.equals("veBucketGauge") || paramBoolean))
        arrayList.add(paramR.k(str)); 
    } 
    return arrayList;
  }
  
  public Z b(R paramR, Z paramZ) {
    boolean bool1 = (paramR.d("CELSIUS") != null) ? true : false;
    boolean bool2 = (paramR.d("NARROW_BAND_EGO") != null) ? true : false;
    boolean bool3 = (paramR.d("LAMBDA") != null) ? true : false;
    Component[] arrayOfComponent = paramZ.c();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (arrayOfComponent[b] instanceof Gauge) {
        Gauge gauge = (Gauge)arrayOfComponent[b];
        if (paramR.O().ae() && ((bool1 && gauge.getUnits() != null && (gauge.getUnits().contains(T.a() + "F") || gauge.getUnits().endsWith("F"))) || (!bool1 && gauge.getUnits() != null && (gauge.getUnits().contains(T.a() + "C") || gauge.getUnits().endsWith("C"))) || (gauge.units() != null && gauge.units().contains("%TEMP")))) {
          ah ah = a(paramR, gauge.getOutputChannel());
          if (ah != null) {
            gauge.setMin(ah.b());
            gauge.setMax(ah.e());
            gauge.setLowWarning(ah.f());
            gauge.setLowCritical(ah.o());
            gauge.setHighWarning(ah.g());
            gauge.setHighCritical(ah.h());
            if (bool1) {
              gauge.setUnits(T.a() + "C");
            } else {
              gauge.setUnits(T.a() + "F");
            } 
          } 
        } else if (bool2 && gauge.getOutputChannel() != null && gauge.getOutputChannel().contains("afr")) {
          ah ah = a(paramR, "egoVoltage");
          if (ah != null) {
            gauge.setMin(ah.b());
            gauge.setMax(ah.e());
            gauge.setUnits(ah.j().toString());
            gauge.setTitle(ah.k().toString());
            gauge.setOutputChannel(ah.i());
            gauge.setLowWarning(ah.f());
            gauge.setLowCritical(ah.o());
            gauge.setHighWarning(ah.g());
            gauge.setHighCritical(ah.h());
          } 
        } 
      } 
    } 
    return paramZ;
  }
  
  public ah a(R paramR, String paramString) {
    Iterator<ah> iterator = paramR.B();
    while (iterator.hasNext()) {
      ah ah = iterator.next();
      if (ah.i().equals(paramString))
        return ah; 
    } 
    return null;
  }
  
  public ArrayList a() {
    ArrayList<ak> arrayList = new ArrayList();
    Iterator<ak> iterator = d.a().b();
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    return arrayList;
  }
  
  private Gauge d() {
    if (this.e == null && c != null && !c.isEmpty())
      try {
        InputStream inputStream = getClass().getResourceAsStream(c);
        ArrayList<Gauge> arrayList = (new c(j.G())).a(inputStream);
        if (arrayList.size() > 0)
          for (s s : arrayList) {
            if (s instanceof Gauge) {
              this.e = arrayList.get(0);
              break;
            } 
          }  
      } catch (Exception exception) {
        D.b("Failed to load Gauge Template, will use generated gauges: " + exception.getLocalizedMessage());
      }  
    if (this.e == null) {
      this.e = new Gauge();
      this.e.setSweepAngle(300);
      this.e.setSweepBeginDegree(300);
      this.e.setFaceAngle(360);
      this.e.setStartAngle(0);
      this.e.setRelativeBorderWidth2(0.02D);
    } 
    return this.e;
  }
  
  public static Gauge b() {
    Gauge gauge1 = new Gauge();
    Gauge gauge2 = k.d();
    return a(gauge2, gauge1);
  }
  
  public static Gauge a(File paramFile) {
    if (paramFile == null)
      return b(); 
    Gauge gauge = null;
    ArrayList<Gauge> arrayList = (new c(j.G())).b(paramFile.getAbsolutePath());
    if (arrayList.size() > 0)
      for (s s : arrayList) {
        if (s instanceof Gauge) {
          gauge = arrayList.get(0);
          break;
        } 
      }  
    if (gauge != null) {
      gauge.setGroupId(0);
      gauge.setTitle("Title");
      gauge.setUnits("Units");
      gauge.setEcuConfigurationName("");
      gauge.setOutputChannel((String)null);
      gauge.setMinVP(Integer.valueOf(0));
      gauge.setMaxVP(Integer.valueOf(100));
      gauge.setValue(35.0D);
      gauge.setLowCriticalVP(Integer.valueOf(5));
      gauge.setLowWarningVP(Integer.valueOf(10));
      gauge.setHighWarningVP(Integer.valueOf(80));
      gauge.setHighCriticalVP(Integer.valueOf(90));
      return gauge;
    } 
    return new Gauge();
  }
  
  public static Gauge a(Gauge paramGauge1, Gauge paramGauge2) {
    paramGauge2.setSweepAngle(paramGauge1.getSweepAngle());
    paramGauge2.setSweepBeginDegree(paramGauge1.getSweepBeginDegree());
    paramGauge2.setFaceAngle(paramGauge1.getFaceAngle());
    paramGauge2.setStartAngle(paramGauge1.getStartAngle());
    paramGauge2.setRelativeBorderWidth2(paramGauge1.getRelativeBorderWidth2());
    paramGauge2.setBackColor(paramGauge1.getBackColor());
    paramGauge2.setFontColor(paramGauge1.getFontColor());
    paramGauge2.setCriticalColor(paramGauge1.getCriticalColor());
    paramGauge2.setWarnColor(paramGauge1.getWarnColor());
    paramGauge2.setNeedleColor(paramGauge1.getNeedleColor());
    paramGauge2.setTrimColor(paramGauge1.getTrimColor());
    paramGauge2.setFontFamily(paramGauge1.getFontFamily());
    paramGauge2.setFontSizeAdjustment(paramGauge1.getFontSizeAdjustment());
    paramGauge2.setBackgroundImageFileName(paramGauge1.getBackgroundImageFileName());
    paramGauge2.setNeedleImageFileName(paramGauge1.getNeedleImageFileName());
    paramGauge2.setNeedleSmoothing(paramGauge1.getNeedleSmoothing());
    paramGauge2.setDisplayValueAt180(paramGauge1.isDisplayValueAt180());
    paramGauge2.setBorderWidth(paramGauge1.getBorderWidth());
    paramGauge2.setGaugePainter(e.a(e.a(paramGauge1.getGaugePainter())));
    return paramGauge2;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/aa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */