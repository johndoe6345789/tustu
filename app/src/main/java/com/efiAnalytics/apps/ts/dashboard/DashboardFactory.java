package com.efiAnalytics.apps.ts.dashboard;

import G.Exceptionprintstacktrace;
import G.GComponentCr;
import G.GInterfaceAh;
import G.ManagerUsingArrayList;
import G.R;
import G.k;
import I.IInterfaceDelta;
import V.ExceptionInVPackage;
import aE.ExceptionInVPackage;
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
import r.ExceptionInVPackage;
import r.ThreadedFile;
import v.IOInVPackage;

public class DashboardFactory {
  public static int ExceptionInVPackage = 1;

  public static String b = null;

  public static String IOInVPackage = "/com/efiAnalytics/apps/ts/dashboard/default.gauge";

  private Gauge e = null;

  private final int f = 300;

  private final int g = 300;

  private final int h = 360;

  private final int i = 0;

  private final int ThreadedFile = 6;

  private static DashboardFactory k = new DashboardFactory();

  public static Color IInterfaceDelta = Color.GRAY;

  public static boolean ExceptionInVPackage(R paramR, Z paramZ) {
    for (Component component : paramZ.IOInVPackage()) {
      if (component instanceof SingleChannelDashComponent) {
        SingleChannelDashComponent singleChannelDashComponent =
            (SingleChannelDashComponent) component;
        if (singleChannelDashComponent.getOutputChannel() != null
            && !singleChannelDashComponent.getOutputChannel().isEmpty()
            && !singleChannelDashComponent
                .getEcuConfigurationName()
                .equals(ManagerUsingArrayList.ExceptionInVPackage)
            && paramR.g(singleChannelDashComponent.getOutputChannel()) == null) return false;
      }
    }
    return true;
  }

  public void ExceptionInVPackage(x paramx, ExceptionInVPackage parama, String paramString) {
    String str = ExceptionInVPackage(parama, paramString);
    paramx.IInterfaceDelta(str);
  }

  private String ExceptionInVPackage(ExceptionInVPackage parama, String paramString) {
    return parama.m() + paramString + "." + ExceptionInVPackage.co;
  }

  public Z ExceptionInVPackage(
      R paramR, ExceptionInVPackage parama, String paramString, int paramInt) {
    String str = ExceptionInVPackage(parama, paramString);
    File file = new File(str);
    return file.exists()
        ? (new IOInVPackage(ThreadedFile.G())).ExceptionInVPackage(str)
        : ExceptionInVPackage(paramR, paramString, paramInt);
  }

  private Z b(R paramR, String paramString) {
    double d4;
    String[] arrayOfString = IOInVPackage(paramR, "FrontPage");
    File file = new File(ThreadedFile.h(), paramString);
    if (!file.exists()) throw new ExceptionInVPackage("Invalid Dashboard Template: " + paramString);
    Z z = (new IOInVPackage(ThreadedFile.G())).ExceptionInVPackage(file.getAbsolutePath());
    ArrayList<GInterfaceAh> arrayList = ExceptionInVPackage(paramR, arrayOfString, true);
    z.b(paramR.i());
    byte b1 = 7;
    double d1 = 0.004D;
    double d2 = 0.002D;
    int i = 1 + (arrayList.size() - 1) / b1;
    Gauge gauge = null;
    Component[] arrayOfComponent = z.IOInVPackage();
    ArrayList<s> arrayList1 = new ArrayList();
    for (Component component : arrayOfComponent) {
      if (gauge == null && component instanceof Gauge) gauge = (Gauge) component;
      if (component instanceof s) arrayList1.add((s) component);
    }
    if (gauge == null) {
      gauge = new Gauge();
      gauge.setGaugePainter((GaugePainter) new BasicReadoutGaugePainter());
    }
    byte b2 = 14;
    int ThreadedFile = paramR.w();
    byte b3 = (ThreadedFile > 0) ? (ThreadedFile / b2 + 1) : 0;
    if (b3 == 1 && paramR.w() > b2) b3 = 2;
    double d3 = 0.031D;
    byte b4 = 0;
    int k = (int) Math.ceil((ThreadedFile / b3));
    if (ThreadedFile > 0) {
      d4 = (ThreadedFile % b3 == 0) ? (b3 / ThreadedFile) : (1.0F / k);
    } else {
      d4 = 0.0D;
    }
    double d5 = 1.0D / b1;
    double d6 = (0.5D - b3 * d3) / i;
    if (d6 > 0.09D) d6 = 0.09D;
    s[] arrayOfS = new s[arrayList1.size() + arrayList.size() + ThreadedFile];
    byte b5 = 0;
    for (s s : arrayList1) {
      arrayOfS[b5] = s;
      b5++;
    }
    double d7 = 0.0015D;
    double d8 = 1.0D - i * d6 - b3 * d3;
    for (byte b6 = 0; b6 < i; b6++) {
      double IInterfaceDelta = d8 + d6 * b6;
      for (byte b = 0; b < b1 && b6 * b1 + b < arrayList.size(); b++) {
        int m = b6 * b1 + b;
        GInterfaceAh GInterfaceAh = arrayList.get(m);
        Gauge gauge1 = new Gauge();
        ExceptionInVPackage(gauge, gauge1);
        ExceptionInVPackage(gauge1, GInterfaceAh);
        gauge1.setRelativeX(b * d5 + d2);
        gauge1.setRelativeY(IInterfaceDelta);
        gauge1.setRelativeWidth(d5 - d2 * 2.0D);
        gauge1.setRelativeHeight(d6 - d1 * 2.0D);
        arrayOfS[b5] = gauge1;
        b5++;
      }
    }
    double d9 = d8 + d6 * i + d1;
    Iterator<Exceptionprintstacktrace> iterator = paramR.A();
    while (iterator.hasNext()) {
      Exceptionprintstacktrace Exceptionprintstacktrace = iterator.next();
      if (Exceptionprintstacktrace.k()) {
        Indicator indicator = new Indicator();
        double d10 = (int) (b4 * d4);
        indicator.setRelativeX((d7 + b4 * d4) % 1.0D);
        double d11 = d9 + d4 * d10;
        indicator.setRelativeY(d11);
        indicator.setRelativeWidth(d4 - d7 * 2.0D);
        indicator.setRelativeHeight(d3 - d7 * 2.0D);
        indicator.setOnText(Exceptionprintstacktrace.ExceptionInVPackage().toString());
        indicator.setOnBackgroundColor(
            new Color(Exceptionprintstacktrace.g().ExceptionInVPackage()));
        indicator.setOnTextColor(new Color(Exceptionprintstacktrace.i().ExceptionInVPackage()));
        indicator.setOffText(Exceptionprintstacktrace.IInterfaceDelta().toString());
        indicator.setOffBackgroundColor(
            new Color(Exceptionprintstacktrace.h().ExceptionInVPackage()));
        indicator.setOffTextColor(
            new Color(Exceptionprintstacktrace.ThreadedFile().ExceptionInVPackage()));
        indicator.setOutputChannel(Exceptionprintstacktrace.f());
        b4++;
        arrayOfS[b5] = indicator;
        b5++;
      }
    }
    z.ExceptionInVPackage((Component[]) arrayOfS);
    return z;
  }

  public Z ExceptionInVPackage(R paramR, String paramString, int paramInt) {
    int i = -1;
    int ThreadedFile = -1;
    String[] arrayOfString = IOInVPackage(paramR, paramString);
    if (arrayOfString == null)
      throw new ExceptionInVPackage(
          "Cluster not found for "
              + paramString
              + ", and no default gauge set defined in configuration.");
    int k = ExceptionInVPackage(paramR, arrayOfString);
    if (ExceptionInVPackage(paramString))
      try {
        return b(paramR, b);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        ExceptionInVPackage.printStackTrace();
      }
    if (paramInt == 1) {
      i = k / 2;
      ThreadedFile = 2;
    } else if (paramInt == 2) {
      ThreadedFile = k / 2;
      i = 2;
    } else if (paramInt == 6) {
      ThreadedFile = k;
      i = 1;
    } else {
      if (paramInt == 4) return ExceptionInVPackage(paramR, paramString, true, 1);
      if (paramInt == 5) {
        Z z = ExceptionInVPackage(paramR, paramString, false, 1);
        z.b(IOInVPackage());
        return z;
      }
      double IInterfaceDelta = Math.sqrt(arrayOfString.length);
      ThreadedFile =
          (IInterfaceDelta > (int) IInterfaceDelta)
              ? ((int) IInterfaceDelta + 1)
              : (int) IInterfaceDelta;
      i = ThreadedFile;
    }
    return ExceptionInVPackage(paramR, paramString, ThreadedFile, i);
  }

  private String[] IOInVPackage(R paramR, String paramString) {
    String[] arrayOfString = paramR.ThreadedFile(paramString);
    if (arrayOfString == null) {
      arrayOfString = paramR.ThreadedFile("Default");
      if (arrayOfString == null || arrayOfString.length == 0)
        arrayOfString = paramR.ThreadedFile("FrontPage");
      if ((paramString.startsWith("veAnalyze_") || paramString.startsWith("wueAnalyze_"))
          && !paramString.endsWith("_histogram")
          && arrayOfString.length > 3) {
        String[] arrayOfString1 = new String[3];
        arrayOfString1[0] = arrayOfString[0];
        arrayOfString1[1] = arrayOfString[1];
        arrayOfString1[2] = arrayOfString[2];
        return arrayOfString1;
      }
    }
    return arrayOfString;
  }

  public Z ExceptionInVPackage(R paramR, String paramString, boolean paramBoolean, int paramInt) {
    String[] arrayOfString = IOInVPackage(paramR, paramString);
    ArrayList arrayList = ExceptionInVPackage(paramR, arrayOfString, paramBoolean);
    Z z = ExceptionInVPackage(arrayList, paramInt);
    z.b(paramR.i());
    return z;
  }

  public Z ExceptionInVPackage(ArrayList<GInterfaceAh> paramArrayList, int paramInt) {
    Z z = new Z();
    z.ExceptionInVPackage(Color.BLACK);
    double d1 = 1.0D / paramInt;
    double d2 = 0.33D / paramInt;
    int i = (int) Math.ceil(paramArrayList.size() / paramInt);
    double d3 = 1.0D / i;
    ArrayList<Gauge> arrayList = new ArrayList();
    for (byte b = 0; b < i; b++) {
      for (byte b1 = 0; b1 < paramInt; b1++) {
        int ThreadedFile = b1 + paramInt * b;
        double IInterfaceDelta = b1 * d1;
        if (ThreadedFile < paramArrayList.size()) {
          GInterfaceAh GInterfaceAh = paramArrayList.get(ThreadedFile);
          Gauge gauge = new Gauge();
          gauge.setRelativeX(IInterfaceDelta);
          gauge.setRelativeY(b * d3);
          gauge.setRelativeWidth(d1);
          gauge.setRelativeHeight(d3);
          gauge.setBackColor(new Color(0, 0, 0, 0));
          gauge.setFontColor(Color.WHITE);
          gauge = b(gauge, GInterfaceAh);
          int k = (int) (Math.random() * 2.147483647E9D);
          HistogramPainter histogramPainter = new HistogramPainter();
          gauge.setNeedleColor(ExceptionInVPackage(ThreadedFile));
          gauge.setGaugePainter((GaugePainter) histogramPainter);
          gauge.setGroupId(k);
          arrayList.add(gauge);
          gauge = new Gauge();
          gauge.setRelativeX(IInterfaceDelta + d1 - d2);
          gauge.setRelativeY(b * d3 + d3 / 3.3D);
          gauge.setRelativeWidth(d2);
          gauge.setRelativeHeight(d3 / 5.0D);
          gauge.setBackColor(new Color(0, 0, 0, 0));
          gauge.setWarnColor(Color.BLACK);
          gauge.setCriticalColor(Color.BLACK);
          gauge.setFontColor(Color.WHITE);
          gauge = b(gauge, GInterfaceAh);
          gauge.setBorderWidth(0);
          gauge.setTitle("");
          gauge.setUnits("");
          gauge.setFontSizeAdjustment(2);
          gauge.setGaugePainter((GaugePainter) new BasicReadoutGaugePainter());
          gauge.setWarnColor(gauge.getBackColor());
          gauge.setCriticalColor(gauge.getBackColor());
          gauge.setGroupId(k);
          arrayList.add(gauge);
        }
      }
    }
    z.ExceptionInVPackage(arrayList.<Component>toArray((Component[]) new Gauge[arrayList.size()]));
    return z;
  }

  private Color ExceptionInVPackage(int paramInt) {
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

  private Gauge ExceptionInVPackage(Gauge paramGauge, GInterfaceAh paramah) {
    paramGauge.setTitle(paramah.k().toString());
    paramGauge.setUnits(paramah.ThreadedFile().toString());
    paramGauge.setMinVP(paramah.b());
    paramGauge.setMaxVP(paramah.e());
    paramGauge.setLowWarningVP(paramah.f());
    paramGauge.setLowCriticalVP(paramah.o());
    paramGauge.setHighWarningVP(paramah.g());
    paramGauge.setHighCriticalVP(paramah.h());
    paramGauge.setOutputChannel(paramah.i());
    paramGauge.setValueDigits(paramah.m());
    paramGauge.setLabelDigits(paramah.n());
    paramGauge.setValue(paramah.IInterfaceDelta());
    return paramGauge;
  }

  private Gauge b(Gauge paramGauge, GInterfaceAh paramah) {
    paramGauge.setTitle(paramah.k().toString());
    paramGauge.setUnits(paramah.ThreadedFile().toString());
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
    paramGauge.setValue(paramah.IInterfaceDelta());
    return paramGauge;
  }

  private boolean ExceptionInVPackage(String paramString) {
    return (b != null
        && ExceptionInVPackage == 7
        && paramString != null
        && paramString.equals("FrontPage"));
  }

  public Z ExceptionInVPackage(R paramR, String paramString, int paramInt1, int paramInt2) {
    if (ExceptionInVPackage(paramString))
      try {
        return b(paramR, b);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        ExceptionInVPackage.printStackTrace();
      }
    String[] arrayOfString = IOInVPackage(paramR, paramString);
    Gauge gauge = IInterfaceDelta();
    ArrayList<GInterfaceAh> arrayList = ExceptionInVPackage(paramR, arrayOfString, true);
    Z z = new Z();
    z.ExceptionInVPackage(Color.BLACK);
    z.b(paramR.i());
    double d1 = 0.0D;
    double d2 = 0.0015D;
    double d3 = 0.0015D;
    ArrayList<Exceptionprintstacktrace> arrayList1 = ExceptionInVPackage();
    if (paramString.equals("FrontPage")) {
      d2 = 0.005D;
      d1 = 0.031D;
      z.ExceptionInVPackage(new Color(51, 51, 51));
      z.b(new Color(20, 20, 20));
    }
    double d4 = 1.0D / paramInt2;
    byte b1 = 14;
    int i = paramR.w() + arrayList1.size();
    int ThreadedFile = i / b1 + 1;
    if (ThreadedFile == 1 && paramR.w() > b1) ThreadedFile = 2;
    double d5 = (1.0D - ThreadedFile * d1) / paramInt1;
    s[] arrayOfS = new s[arrayList.size()];
    byte b2;
    for (b2 = 0; b2 < paramInt1; b2++) {
      for (byte b = 0; b < paramInt2; b++) {
        int k = b + paramInt2 * b2;
        if (k < arrayList.size()) {
          GInterfaceAh GInterfaceAh = arrayList.get(k);
          Gauge gauge1 = new Gauge();
          gauge1.setRelativeX(b * d4 + d3);
          gauge1.setRelativeY(b2 * d5 + d2);
          gauge1.setRelativeWidth(d4 - d3 * 2.0D);
          gauge1.setRelativeHeight(d5 - d2 * 2.0D);
          gauge1.setEcuConfigurationName(paramR.IOInVPackage());
          if (gauge != null) {
            gauge1 = ExceptionInVPackage(gauge, gauge1);
          } else {
            gauge1.setSweepAngle(300);
            gauge1.setSweepBeginDegree(300);
            gauge1.setFaceAngle(360);
            gauge1.setStartAngle(0);
            gauge1.setRelativeBorderWidth2(0.02D);
            gauge1.setDisplayValueAt180(true);
          }
          gauge1.setCounterClockwise(GInterfaceAh.q());
          gauge1.setTitle(GInterfaceAh.k().toString());
          gauge1.setUnits(GInterfaceAh.ThreadedFile().toString());
          gauge1.setMin(GInterfaceAh.b());
          gauge1.setMax(GInterfaceAh.e());
          gauge1.setLowWarning(GInterfaceAh.f());
          gauge1.setLowCritical(GInterfaceAh.o());
          gauge1.setHighWarning(GInterfaceAh.g());
          gauge1.setHighCritical(GInterfaceAh.h());
          gauge1.setOutputChannel(GInterfaceAh.i());
          gauge1.setValueDigits(GInterfaceAh.m());
          gauge1.setLabelDigits(GInterfaceAh.n());
          gauge1.setValue(GInterfaceAh.IInterfaceDelta());
          arrayOfS[k] = gauge1;
        }
      }
    }
    if (paramString.equals("FrontPage")) {
      z.ExceptionInVPackage(ab.ExceptionInVPackage());
      b2 = 0;
      int k = (int) Math.ceil((i / ThreadedFile));
      double d6 = (i % ThreadedFile == 0) ? (ThreadedFile / i) : (1.0F / k);
      s[] arrayOfS1 = new s[arrayOfS.length + i];
      System.arraycopy(arrayOfS, 0, arrayOfS1, 0, arrayOfS.length);
      arrayOfS = arrayOfS1;
      double d7 = 0.0015D;
      null = paramR.A();
      while (null.hasNext()) {
        Exceptionprintstacktrace Exceptionprintstacktrace = null.next();
        if (Exceptionprintstacktrace.k()) {
          Indicator indicator = new Indicator();
          double IInterfaceDelta = (int) (b2 * d6);
          indicator.setRelativeX((d7 + b2 * d6) % 1.0D);
          indicator.setRelativeY(1.0D - d7 - d1 * (ThreadedFile - IInterfaceDelta));
          indicator.setRelativeWidth(d6 - d7 * 2.0D);
          indicator.setRelativeHeight(d1 - d7 * 2.0D);
          indicator.setOnText(Exceptionprintstacktrace.ExceptionInVPackage().toString());
          indicator.setOnBackgroundColor(
              new Color(Exceptionprintstacktrace.g().ExceptionInVPackage()));
          indicator.setOnTextColor(new Color(Exceptionprintstacktrace.i().ExceptionInVPackage()));
          indicator.setOffText(Exceptionprintstacktrace.IInterfaceDelta().toString());
          indicator.setOffBackgroundColor(
              new Color(Exceptionprintstacktrace.h().ExceptionInVPackage()));
          indicator.setOffTextColor(
              new Color(Exceptionprintstacktrace.ThreadedFile().ExceptionInVPackage()));
          indicator.setOutputChannel(Exceptionprintstacktrace.f());
          arrayOfS[arrayOfS.length - b2 - 1] = indicator;
          b2++;
        }
      }
      for (Exceptionprintstacktrace Exceptionprintstacktrace : arrayList1) {
        Indicator indicator = new Indicator();
        double IInterfaceDelta = (int) (b2 * d6);
        indicator.setEcuConfigurationName(ManagerUsingArrayList.ExceptionInVPackage);
        indicator.setRelativeX((d7 + b2 * d6) % 1.0D);
        indicator.setRelativeY(1.0D - d7 - d1 * (ThreadedFile - IInterfaceDelta));
        indicator.setRelativeWidth(d6 - d7 * 2.0D);
        indicator.setRelativeHeight(d1 - d7 * 2.0D);
        indicator.setOnText(Exceptionprintstacktrace.ExceptionInVPackage().toString());
        indicator.setOnBackgroundColor(ExceptionInVPackage(Exceptionprintstacktrace.g()));
        indicator.setOnTextColor(ExceptionInVPackage(Exceptionprintstacktrace.i()));
        indicator.setOffText(Exceptionprintstacktrace.IInterfaceDelta().toString());
        indicator.setOffBackgroundColor(ExceptionInVPackage(Exceptionprintstacktrace.h()));
        indicator.setOffTextColor(ExceptionInVPackage(Exceptionprintstacktrace.ThreadedFile()));
        indicator.setOutputChannel(Exceptionprintstacktrace.f());
        arrayOfS[arrayOfS.length - b2 - 1] = indicator;
        b2++;
      }
    } else {
      z.ExceptionInVPackage(ab.b());
    }
    z.ExceptionInVPackage((Component[]) arrayOfS);
    z.b(IOInVPackage());
    b(paramR, z);
    return z;
  }

  private Color ExceptionInVPackage(k paramk) {
    return new Color(paramk.b(), paramk.IOInVPackage(), paramk.IInterfaceDelta(), paramk.e());
  }

  private Color IOInVPackage() {
    return IInterfaceDelta;
  }

  public Z ExceptionInVPackage(R paramR) {
    return ExceptionInVPackage((GComponentCr) paramR);
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
    if (paramR.IInterfaceDelta("NARROW_BAND_EGO") != null) {
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
    ArrayList<GInterfaceAh> arrayList1 = new ArrayList();
    String[] arrayOfString = paramR.s();
    Object[] arrayOfObject = S.ExceptionInVPackage((Object[]) arrayOfString);
    for (byte b = 0; b < arrayOfObject.length; b++) {
      if (arrayList.contains(arrayOfObject[b])) {
        GInterfaceAh GInterfaceAh = ExceptionInVPackage(paramR, (String) arrayOfObject[b]);
        if (GInterfaceAh != null) arrayList1.add(GInterfaceAh);
      }
    }
    List list = S.ExceptionInVPackage(arrayList1);
    ArrayList<GInterfaceAh> arrayList2 = new ArrayList();
    Iterator<GInterfaceAh> iterator = list.iterator();
    while (iterator.hasNext()) arrayList2.add(iterator.next());
    Z z = ExceptionInVPackage(arrayList2, 2);
    return ExceptionInVPackage(z, paramR.IOInVPackage());
  }

  public Z ExceptionInVPackage(Z paramZ, String paramString) {
    Component[] arrayOfComponent = paramZ.IOInVPackage();
    for (Component component : arrayOfComponent) {
      if (component instanceof s) {
        s s = (s) component;
        s.setEcuConfigurationName(paramString);
      }
    }
    return paramZ;
  }

  public int ExceptionInVPackage(R paramR, String[] paramArrayOfString) {
    byte b = 0;
    for (String str : paramArrayOfString) {
      if (paramR.k(str) != null) b++;
    }
    return b;
  }

  public Z ExceptionInVPackage(GComponentCr paramcr) {
    String[] arrayOfString = paramcr.s();
    Object[] arrayOfObject = S.ExceptionInVPackage((Object[]) arrayOfString);
    Z z = new Z();
    z.ExceptionInVPackage(Color.LIGHT_GRAY);
    s[] arrayOfS = new s[arrayOfObject.length];
    double d1 = 2.0D;
    int i = (int) Math.round(Math.sqrt(d1 * arrayOfObject.length));
    int ThreadedFile = (int) Math.ceil(arrayOfObject.length / i);
    while ((i - 1) * ThreadedFile >= arrayOfObject.length) i--;
    double d2 = 1.0D / ThreadedFile;
    double d3 = 1.0D / i;
    double d4 = 0.001D;
    double d5 = 0.001D;
    for (byte b = 0; b < i; b++) {
      for (byte b1 = 0; b1 < ThreadedFile; b1++) {
        int k = b1 + ThreadedFile * b;
        if (k >= arrayOfObject.length) break;
        String str = (String) arrayOfObject[k];
        Gauge gauge = new Gauge();
        gauge.setGaugePainter((GaugePainter) new BasicReadoutGaugePainter());
        gauge.setOutputChannel(str);
        gauge.setEcuConfigurationName(paramcr.IOInVPackage());
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
    z.ExceptionInVPackage((Component[]) arrayOfS);
    return z;
  }

  private ArrayList ExceptionInVPackage(
      R paramR, String[] paramArrayOfString, boolean paramBoolean) {
    ArrayList<GInterfaceAh> arrayList = new ArrayList();
    for (String str : paramArrayOfString) {
      if (paramR.k(str) != null && (!str.equals("veBucketGauge") || paramBoolean))
        arrayList.add(paramR.k(str));
    }
    return arrayList;
  }

  public Z b(R paramR, Z paramZ) {
    boolean bool1 = (paramR.IInterfaceDelta("CELSIUS") != null) ? true : false;
    boolean bool2 = (paramR.IInterfaceDelta("NARROW_BAND_EGO") != null) ? true : false;
    boolean bool3 = (paramR.IInterfaceDelta("LAMBDA") != null) ? true : false;
    Component[] arrayOfComponent = paramZ.IOInVPackage();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (arrayOfComponent[b] instanceof Gauge) {
        Gauge gauge = (Gauge) arrayOfComponent[b];
        if (paramR.O().ae()
            && ((bool1
                    && gauge.getUnits() != null
                    && (gauge.getUnits().contains(T.ExceptionInVPackage() + "F")
                        || gauge.getUnits().endsWith("F")))
                || (!bool1
                    && gauge.getUnits() != null
                    && (gauge.getUnits().contains(T.ExceptionInVPackage() + "C")
                        || gauge.getUnits().endsWith("C")))
                || (gauge.units() != null && gauge.units().contains("%TEMP")))) {
          GInterfaceAh GInterfaceAh = ExceptionInVPackage(paramR, gauge.getOutputChannel());
          if (GInterfaceAh != null) {
            gauge.setMin(GInterfaceAh.b());
            gauge.setMax(GInterfaceAh.e());
            gauge.setLowWarning(GInterfaceAh.f());
            gauge.setLowCritical(GInterfaceAh.o());
            gauge.setHighWarning(GInterfaceAh.g());
            gauge.setHighCritical(GInterfaceAh.h());
            if (bool1) {
              gauge.setUnits(T.ExceptionInVPackage() + "C");
            } else {
              gauge.setUnits(T.ExceptionInVPackage() + "F");
            }
          }
        } else if (bool2
            && gauge.getOutputChannel() != null
            && gauge.getOutputChannel().contains("afr")) {
          GInterfaceAh GInterfaceAh = ExceptionInVPackage(paramR, "egoVoltage");
          if (GInterfaceAh != null) {
            gauge.setMin(GInterfaceAh.b());
            gauge.setMax(GInterfaceAh.e());
            gauge.setUnits(GInterfaceAh.ThreadedFile().toString());
            gauge.setTitle(GInterfaceAh.k().toString());
            gauge.setOutputChannel(GInterfaceAh.i());
            gauge.setLowWarning(GInterfaceAh.f());
            gauge.setLowCritical(GInterfaceAh.o());
            gauge.setHighWarning(GInterfaceAh.g());
            gauge.setHighCritical(GInterfaceAh.h());
          }
        }
      }
    }
    return paramZ;
  }

  public GInterfaceAh ExceptionInVPackage(R paramR, String paramString) {
    Iterator<GInterfaceAh> iterator = paramR.B();
    while (iterator.hasNext()) {
      GInterfaceAh GInterfaceAh = iterator.next();
      if (GInterfaceAh.i().equals(paramString)) return GInterfaceAh;
    }
    return null;
  }

  public ArrayList ExceptionInVPackage() {
    ArrayList<Exceptionprintstacktrace> arrayList = new ArrayList();
    Iterator<Exceptionprintstacktrace> iterator = IInterfaceDelta.ExceptionInVPackage().b();
    while (iterator.hasNext()) arrayList.add(iterator.next());
    return arrayList;
  }

  private Gauge IInterfaceDelta() {
    if (this.e == null && IOInVPackage != null && !IOInVPackage.isEmpty())
      try {
        InputStream inputStream = getClass().getResourceAsStream(IOInVPackage);
        ArrayList<Gauge> arrayList =
            (new IOInVPackage(ThreadedFile.G())).ExceptionInVPackage(inputStream);
        if (arrayList.size() > 0)
          for (s s : arrayList) {
            if (s instanceof Gauge) {
              this.e = arrayList.get(0);
              break;
            }
          }
      } catch (Exception exception) {
        D.b(
            "Failed to load Gauge Template, will use generated gauges: "
                + exception.getLocalizedMessage());
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
    Gauge gauge2 = k.IInterfaceDelta();
    return ExceptionInVPackage(gauge2, gauge1);
  }

  public static Gauge ExceptionInVPackage(File paramFile) {
    if (paramFile == null) return b();
    Gauge gauge = null;
    ArrayList<Gauge> arrayList =
        (new IOInVPackage(ThreadedFile.G())).b(paramFile.getAbsolutePath());
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
      gauge.setOutputChannel((String) null);
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

  public static Gauge ExceptionInVPackage(Gauge paramGauge1, Gauge paramGauge2) {
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
    paramGauge2.setGaugePainter(
        e.ExceptionInVPackage(e.ExceptionInVPackage(paramGauge1.getGaugePainter())));
    return paramGauge2;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/aa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
