package t;

import G.R;
import G.aI;
import G.dj;
import G.dk;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import com.efiAnalytics.apps.ts.dashboard.DashLabel;
import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.Indicator;
import com.efiAnalytics.apps.ts.dashboard.SingleChannelDashComponent;
import com.efiAnalytics.apps.ts.dashboard.r;
import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.ui.bV;
import DComponentDelta.DComponentDelta;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;

public class ai {
  private ArrayList ExceptionInVPackage = null;
  
  public ArrayList ExceptionInVPackage() {
    return this.ExceptionInVPackage;
  }
  
  public void ExceptionInVPackage(ArrayList paramArrayList) {
    this.ExceptionInVPackage = paramArrayList;
  }
  
  protected boolean b(ArrayList paramArrayList) {
    if (paramArrayList == null || paramArrayList.isEmpty())
      return false; 
    for (s s : paramArrayList) {
      if (s instanceof Indicator)
        return true; 
    } 
    return false;
  }
  
  protected boolean c(ArrayList paramArrayList) {
    if (paramArrayList == null || paramArrayList.size() == 0)
      return false; 
    for (s s : paramArrayList) {
      if (s instanceof Gauge)
        return true; 
    } 
    return false;
  }
  
  protected boolean DComponentDelta(ArrayList paramArrayList) {
    if (paramArrayList == null || paramArrayList.size() == 0)
      return false; 
    for (s s : paramArrayList) {
      if (s instanceof DashLabel)
        return true; 
    } 
    return false;
  }
  
  public void ExceptionInVPackage(String paramString) {
    for (s s : this.ExceptionInVPackage) {
      s.setFontFamily(paramString);
      s.invalidate();
      s.repaint();
    } 
  }
  
  public void ExceptionInVPackage(double paramDouble) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof SingleChannelDashComponent) {
        ((SingleChannelDashComponent)s).setValue(paramDouble);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void ExceptionInVPackage(boolean paramBoolean) {
    for (s s : this.ExceptionInVPackage) {
      s.setItalicFont(paramBoolean);
      s.invalidate();
      s.repaint();
    } 
  }
  
  public void b(String paramString) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof SingleChannelDashComponent) {
        SingleChannelDashComponent singleChannelDashComponent = (SingleChannelDashComponent)s;
        singleChannelDashComponent.setOutputChannel(paramString);
        try {
          singleChannelDashComponent.subscribeToOutput();
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          bV.DComponentDelta(ExceptionInVPackage.getMessage(), (Component)s);
        } 
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void c(String paramString) {
    for (s s : this.ExceptionInVPackage) {
      s.setEcuConfigurationName(paramString);
      if (s instanceof SingleChannelDashComponent) {
        try {
          SingleChannelDashComponent singleChannelDashComponent = (SingleChannelDashComponent)s;
          singleChannelDashComponent.subscribeToOutput();
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          bV.DComponentDelta(ExceptionInVPackage.getMessage(), (Component)s);
        } 
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void ExceptionInVPackage(int paramInt) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge) {
        Gauge gauge = (Gauge)s;
        gauge.setFaceAngle(paramInt);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void DComponentDelta(String paramString) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge) {
        ((Gauge)s).setBackgroundImageFileName(paramString);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void e(String paramString) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge) {
        ((Gauge)s).setNeedleImageFileName(paramString);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void f(String paramString) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Indicator) {
        ((Indicator)s).setOnImageFileName(paramString);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void ExceptionPrintstacktrace(String paramString) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Indicator) {
        ((Indicator)s).setOffImageFileName(paramString);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void h(String paramString) {
    for (s s : this.ExceptionInVPackage) {
      s.invalidate();
      s.setId(paramString);
    } 
  }
  
  public void b(int paramInt) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge) {
        Gauge gauge = (Gauge)s;
        gauge.setStartAngle(paramInt);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void c(int paramInt) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge) {
        Gauge gauge = (Gauge)s;
        gauge.setSweepBeginDegree(paramInt);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void DComponentDelta(int paramInt) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge) {
        Gauge gauge = (Gauge)s;
        gauge.setNeedleSmoothing(paramInt);
      } 
    } 
  }
  
  public void e(int paramInt) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge) {
        Gauge gauge = (Gauge)s;
        gauge.setSweepAngle(paramInt);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void f(int paramInt) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge) {
        Gauge gauge = (Gauge)s;
        double DComponentDelta = paramInt / gauge.getShortestSize();
        gauge.setRelativeBorderWidth2(DComponentDelta);
        gauge.invalidate();
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void ExceptionPrintstacktrace(int paramInt) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge) {
        Gauge gauge = (Gauge)s;
        gauge.setFontSizeAdjustment(paramInt);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void i(String paramString) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge) {
        Gauge gauge = (Gauge)s;
        gauge.setTitle(paramString);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void j(String paramString) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge) {
        Gauge gauge = (Gauge)s;
        gauge.setUnits(paramString);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void ExceptionInVPackage(Color paramColor) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge) {
        Gauge gauge = (Gauge)s;
        gauge.setTrimColor(paramColor);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void b(Color paramColor) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge) {
        Gauge gauge = (Gauge)s;
        gauge.setBackColor(paramColor);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void c(Color paramColor) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge) {
        Gauge gauge = (Gauge)s;
        gauge.setFontColor(paramColor);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void DComponentDelta(Color paramColor) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge) {
        Gauge gauge = (Gauge)s;
        gauge.setNeedleColor(paramColor);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void e(Color paramColor) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge) {
        Gauge gauge = (Gauge)s;
        gauge.setWarnColor(paramColor);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void f(Color paramColor) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge) {
        Gauge gauge = (Gauge)s;
        gauge.setCriticalColor(paramColor);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void h(int paramInt) {
    for (s s : this.ExceptionInVPackage) {
      s.setBounds(paramInt, s.getY(), s.getWidth(), s.getHeight());
      s.updateRelativeBoundsToCurrent();
      s.invalidate();
      s.repaint();
    } 
  }
  
  public void i(int paramInt) {
    for (s s : this.ExceptionInVPackage) {
      s.setBounds(s.getX(), paramInt, s.getWidth(), s.getHeight());
      s.updateRelativeBoundsToCurrent();
      s.invalidate();
      s.repaint();
    } 
  }
  
  public void j(int paramInt) {
    for (s s : this.ExceptionInVPackage) {
      s.setBounds(s.getX(), s.getY(), paramInt, s.getHeight());
      s.updateRelativeBoundsToCurrent();
      s.invalidate();
      s.repaint();
    } 
  }
  
  public void k(int paramInt) {
    for (s s : this.ExceptionInVPackage) {
      s.setBounds(s.getX(), s.getY(), s.getWidth(), paramInt);
      s.updateRelativeBoundsToCurrent();
      s.invalidate();
      s.repaint();
    } 
  }
  
  private void ExceptionInVPackage(dj paramdj) {
    if (Double.isNaN(paramdj.ExceptionInVPackage()))
      throw new ExceptionInVPackage("Invalid value: " + paramdj.toString()); 
  }
  
  public void k(String paramString) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge)
        try {
          R r = r.ExceptionInVPackage(s);
          dj dj = dk.ExceptionInVPackage((aI)r, paramString);
          ExceptionInVPackage(dj);
          Gauge gauge = (Gauge)s;
          gauge.setMinVP(dj);
          s.invalidate();
          s.repaint();
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          throw new ExceptionInVPackage(ExceptionPrintstacktrace.getLocalizedMessage());
        }  
    } 
  }
  
  public void l(String paramString) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge)
        try {
          R r = r.ExceptionInVPackage(s);
          dj dj = dk.ExceptionInVPackage((aI)r, paramString);
          ExceptionInVPackage(dj);
          Gauge gauge = (Gauge)s;
          gauge.setMaxVP(dj);
          s.invalidate();
          s.repaint();
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          throw new ExceptionInVPackage(ExceptionPrintstacktrace.getLocalizedMessage());
        }  
    } 
  }
  
  public void m(String paramString) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge)
        try {
          R r = r.ExceptionInVPackage(s);
          dj dj = dk.ExceptionInVPackage((aI)r, paramString);
          ExceptionInVPackage(dj);
          Gauge gauge = (Gauge)s;
          gauge.setLowWarningVP(dj);
          s.invalidate();
          s.repaint();
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          throw new ExceptionInVPackage(ExceptionPrintstacktrace.getLocalizedMessage());
        }  
    } 
  }
  
  public void n(String paramString) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge)
        try {
          R r = r.ExceptionInVPackage(s);
          dj dj = dk.ExceptionInVPackage((aI)r, paramString);
          ExceptionInVPackage(dj);
          Gauge gauge = (Gauge)s;
          gauge.setLowCriticalVP(dj);
          s.invalidate();
          s.repaint();
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          throw new ExceptionInVPackage(ExceptionPrintstacktrace.getLocalizedMessage());
        }  
    } 
  }
  
  public void o(String paramString) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge)
        try {
          R r = r.ExceptionInVPackage(s);
          dj dj = dk.ExceptionInVPackage((aI)r, paramString);
          ExceptionInVPackage(dj);
          Gauge gauge = (Gauge)s;
          gauge.setHighWarningVP(dj);
          s.invalidate();
          s.repaint();
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          throw new ExceptionInVPackage(ExceptionPrintstacktrace.getLocalizedMessage());
        }  
    } 
  }
  
  public void p(String paramString) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge)
        try {
          R r = r.ExceptionInVPackage(s);
          dj dj = dk.ExceptionInVPackage((aI)r, paramString);
          ExceptionInVPackage(dj);
          Gauge gauge = (Gauge)s;
          gauge.setHighCriticalVP(dj);
          s.invalidate();
          s.repaint();
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          throw new ExceptionInVPackage(ExceptionPrintstacktrace.getLocalizedMessage());
        }  
    } 
  }
  
  public void l(int paramInt) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge) {
        Gauge gauge = (Gauge)s;
        gauge.setValueDigits(Integer.valueOf(paramInt));
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void q(String paramString) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Indicator) {
        Indicator indicator = (Indicator)s;
        indicator.setOnText(paramString);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void r(String paramString) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Indicator) {
        Indicator indicator = (Indicator)s;
        indicator.setOffText(paramString);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void s(String paramString) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof DashLabel) {
        DashLabel dashLabel = (DashLabel)s;
        dashLabel.setText(paramString);
        s.invalidatePainter();
        s.repaint();
      } 
    } 
  }
  
  public void ExceptionPrintstacktrace(Color paramColor) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof DashLabel) {
        DashLabel dashLabel = (DashLabel)s;
        dashLabel.setBackgroundColor(paramColor);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void h(Color paramColor) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof DashLabel) {
        DashLabel dashLabel = (DashLabel)s;
        dashLabel.setTextColor(paramColor);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void i(Color paramColor) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Indicator) {
        Indicator indicator = (Indicator)s;
        indicator.setOnTextColor(paramColor);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void j(Color paramColor) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Indicator) {
        Indicator indicator = (Indicator)s;
        indicator.setOffTextColor(paramColor);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void k(Color paramColor) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Indicator) {
        Indicator indicator = (Indicator)s;
        indicator.setOnBackgroundColor(paramColor);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void l(Color paramColor) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Indicator) {
        Indicator indicator = (Indicator)s;
        indicator.setOffBackgroundColor(paramColor);
        s.invalidate();
        s.repaint();
      } 
    } 
  }
  
  public void b(boolean paramBoolean) {
    int i = 0;
    if (paramBoolean) {
      String str = bV.ExceptionInVPackage("{Number of seconds to remember history. }", true, "Set Guage History Tell Tail Timeout.\nDefault value 15 seconds.", true, bV.c());
      if (str == null || str.equals(""))
        return; 
      i = Integer.parseInt(str + "000");
    } 
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge) {
        Gauge gauge = (Gauge)s;
        gauge.setShowHistory(paramBoolean);
        gauge.setHistoryDelay(i);
      } 
    } 
  }
  
  public void c(boolean paramBoolean) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge) {
        Gauge gauge = (Gauge)s;
        gauge.setCounterClockwise(paramBoolean);
        s.invalidate();
        gauge.repaint();
      } 
    } 
  }
  
  public void DComponentDelta(boolean paramBoolean) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge) {
        Gauge gauge = (Gauge)s;
        gauge.setDisplayValueAt180(paramBoolean);
        s.invalidate();
        gauge.repaint();
      } 
    } 
  }
  
  public void e(boolean paramBoolean) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge) {
        Gauge gauge = (Gauge)s;
        gauge.setPegLimits(paramBoolean);
        s.invalidate();
        gauge.repaint();
      } 
    } 
  }
  
  public void b(double paramDouble) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof Gauge) {
        Gauge gauge = (Gauge)s;
        gauge.setHistoricalPeakValue(paramDouble);
      } 
    } 
  }
  
  public SingleChannelDashComponent b() {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof SingleChannelDashComponent)
        return (SingleChannelDashComponent)s; 
    } 
    return null;
  }
  
  public boolean c() {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof SingleChannelDashComponent)
        return true; 
    } 
    return false;
  }
  
  public void t(String paramString) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof DComponentDelta) {
        DComponentDelta DComponentDelta = (DComponentDelta)s;
        DComponentDelta.setShortClickAction(paramString);
      } 
    } 
  }
  
  public void u(String paramString) {
    for (s s : this.ExceptionInVPackage) {
      if (s instanceof DComponentDelta) {
        DComponentDelta DComponentDelta = (DComponentDelta)s;
        DComponentDelta.setLongClickAction(paramString);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/ai.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */