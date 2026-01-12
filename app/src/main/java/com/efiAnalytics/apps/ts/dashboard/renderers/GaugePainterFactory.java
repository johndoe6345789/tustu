package com.efiAnalytics.apps.ts.dashboard.renderers;

public class GaugePainterFactory {
  public static final String a = AnalogBarPainter.NAME;

  public static final String b = AnalogMovingBarGaugePainter.NAME;

  public static final String c = HorizontalDashedBar.NAME;

  public static final String d = RectangleIndicatorPainter.NAME;

  public static GaugePainter a(String paramString) {
    return (GaugePainter)
        ((paramString.equals("Basic Readout")
                || paramString.equals(
                    "com.efiAnalytics.tunerStudio.renderers.BasicReadoutGaugePainter"))
            ? new BasicReadoutGaugePainter()
            : ((paramString.equals("Analog Gauge")
                    || paramString.equals(
                        "com.efiAnalytics.tunerStudio.renderers.AnalogGaugePainter"))
                ? new AnalogGaugePainter()
                : ((paramString.equals("Circle Analog Gauge")
                        || paramString.equals(
                            "com.efiAnalytics.tunerStudio.renderers.RoundAnalogGaugePainter"))
                    ? new RoundAnalogGaugePainter()
                    : ((paramString.equals("Vertical Bar Gauge")
                            || paramString.equals(
                                "com.efiAnalytics.tunerStudio.renderers.VerticalBarPainter"))
                        ? new VerticalBarPainter()
                        : ((paramString.equals("Horizontal Bar Gauge")
                                || paramString.equals(
                                    "com.efiAnalytics.tunerStudio.renderers.HorizontalBarPainter"))
                            ? new HorizontalBarPainter()
                            : ((paramString.equals("Histogram")
                                    || paramString.equals(
                                        "com.efiAnalytics.tunerStudio.renderers.HistogramPainter")
                                    || paramString.equals("Line Graph"))
                                ? new HistogramPainter()
                                : ((paramString.equals(a)
                                        || paramString.equals(
                                            "com.efiAnalytics.tunerStudio.renderers.AnalogBarPainter"))
                                    ? new AnalogBarPainter()
                                    : ((paramString.equals(b)
                                            || paramString.equals(
                                                "com.efiAnalytics.tunerStudio.renderers.AnalogMovingBarGaugePainter"))
                                        ? new AnalogMovingBarGaugePainter()
                                        : ((paramString.equals("Vertical Dashed Bar Gauge")
                                                || paramString.equals(
                                                    "com.efiAnalytics.tunerStudio.renderers.VerticalDashedBarPainter"))
                                            ? new VerticalDashedBarPainter()
                                            : ((paramString.equals(c)
                                                    || paramString.equals(
                                                        "com.efiAnalytics.tunerStudio.renderers.HorizontalDashedBar"))
                                                ? new HorizontalDashedBar()
                                                : ((paramString.equals("Horizontal Line Gauge")
                                                        || paramString.equals(
                                                            "com.efiAnalytics.tunerStudio.renderers.HorizontalLinePainter"))
                                                    ? new HorizontalLinePainter()
                                                    : (paramString.equals("Asymetric Sweep Gauge")
                                                        ? new AsymetricSweepRenderer()
                                                        : new BasicReadoutGaugePainter()))))))))))));
  }

  public static String a(Object paramObject) {
    return (paramObject instanceof BasicReadoutGaugePainter)
        ? "Basic Readout"
        : ((paramObject instanceof VerticalBarPainter)
            ? "Vertical Bar Gauge"
            : ((paramObject instanceof HorizontalLinePainter)
                ? "Horizontal Line Gauge"
                : ((paramObject instanceof HorizontalBarPainter)
                    ? "Horizontal Bar Gauge"
                    : ((paramObject instanceof HistogramPainter)
                        ? "Line Graph"
                        : ((paramObject instanceof AnalogMovingBarGaugePainter)
                            ? b
                            : ((paramObject instanceof AnalogBarPainter)
                                ? a
                                : ((paramObject instanceof VerticalDashedBarPainter)
                                    ? "Vertical Dashed Bar Gauge"
                                    : ((paramObject instanceof RoundAnalogGaugePainter)
                                        ? "Circle Analog Gauge"
                                        : ((paramObject instanceof AnalogGaugePainter)
                                            ? "Analog Gauge"
                                            : ((paramObject instanceof HorizontalDashedBar)
                                                ? c
                                                : ((paramObject instanceof AsymetricSweepRenderer)
                                                    ? "Asymetric Sweep Gauge"
                                                    : ((paramObject
                                                            instanceof RectangleIndicatorPainter)
                                                        ? d
                                                        : ((paramObject
                                                                instanceof BulbIndicatorPainter)
                                                            ? "Bulb Indicator"
                                                            : ((paramObject
                                                                    instanceof IndicatorPainter)
                                                                ? d
                                                                : "Analog Gauge"))))))))))))));
  }

  public static IndicatorPainter b(String paramString) {
    return (IndicatorPainter)
        ((paramString.equals(d)
                || paramString.equals(
                    "com.efiAnalytics.tunerStudio.renderers.RectangleIndicatorPainter"))
            ? new RectangleIndicatorPainter()
            : ((paramString.equals("Bulb Indicator")
                    || paramString.equals(
                        "com.efiAnalytics.tunerStudio.renderers.BulbIndicatorPainter"))
                ? new BulbIndicatorPainter()
                : new RectangleIndicatorPainter()));
  }

  public static GaugePainter[] a() {
    return new GaugePainter[] {
      new AnalogBarPainter(),
      new AnalogGaugePainter(),
      new AnalogMovingBarGaugePainter(),
      new AsymetricSweepRenderer(),
      new BasicReadoutGaugePainter(),
      new RoundAnalogGaugePainter(),
      new HorizontalDashedBar(),
      new HorizontalLinePainter(),
      new HorizontalBarPainter(),
      new HistogramPainter(),
      new VerticalBarPainter(),
      new VerticalDashedBarPainter()
    };
  }

  public static IndicatorPainter[] b() {
    return new IndicatorPainter[] {new RectangleIndicatorPainter(), new BulbIndicatorPainter()};
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/renderers/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
