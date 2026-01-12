package v;

import com.efiAnalytics.apps.ts.dashboard.DashLabel;
import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.Indicator;
import com.efiAnalytics.apps.ts.tuningViews.tuneComps.BurnButtonTv;
import com.efiAnalytics.apps.ts.tuningViews.tuneComps.SelectableTable;
import com.efiAnalytics.apps.ts.tuningViews.tuneComps.TableCellCrossHair;
import com.efiAnalytics.apps.ts.tuningViews.tuneComps.TuneSettingsPanel;
import com.efiAnalytics.apps.ts.tuningViews.tuneComps.TuneViewGaugeCluster;

public class VInterfaceAlpha {
  public static String a = "Gauge";

  public static String b = "Indicator";

  public static String c = "Label";

  public static String d = "com.efiAnalytics.tunerStudio.Gauge";

  public static String e = "com.efiAnalytics.tunerStudio.Indicator";

  public static String f = "com.efiAnalytics.tunerStudio.dashboard.DashLabel";

  public static String g = "ValueProvider";

  public static String h = "TuneGaugeCluster";

  public static String i = "TuneSlectableTable";

  public static String j = "TuneSettingsPanel";

  public static String k = "BurnButtonTv";

  public static String l = "TableCellCrossHair";

  public static Class a(String paramString) {
    return (paramString.equals("com.efiAnalytics.tunerStudio.Gauge") || paramString.equals(a))
        ? Gauge.class
        : ((paramString.equals("com.efiAnalytics.tunerStudio.Indicator") || paramString.equals(b))
            ? Indicator.class
            : ((paramString.equals(d)
                    || paramString.equals(c)
                    || paramString.equals("com.efiAnalytics.tunerStudio.dashboard.DashLabel"))
                ? DashLabel.class
                : (paramString.equals(h)
                    ? TuneViewGaugeCluster.class
                    : (paramString.equals(i)
                        ? SelectableTable.class
                        : (paramString.equals(j)
                            ? TuneSettingsPanel.class
                            : (paramString.equals(k)
                                ? BurnButtonTv.class
                                : (paramString.equals(l)
                                    ? TableCellCrossHair.class
                                    : Class.forName(paramString))))))));
  }

  public static String a(Object paramObject) {
    Class<?> clazz = paramObject.getClass();
    return (paramObject instanceof Gauge)
        ? a
        : ((paramObject instanceof Indicator)
            ? b
            : ((paramObject instanceof DashLabel)
                ? c
                : ((paramObject instanceof G.dj)
                    ? g
                    : ((paramObject instanceof TuneViewGaugeCluster)
                        ? h
                        : ((paramObject instanceof SelectableTable)
                            ? i
                            : ((paramObject instanceof TuneSettingsPanel)
                                ? j
                                : ((paramObject instanceof BurnButtonTv)
                                    ? k
                                    : ((paramObject instanceof TableCellCrossHair)
                                        ? l
                                        : clazz.getName()))))))));
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/v/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
