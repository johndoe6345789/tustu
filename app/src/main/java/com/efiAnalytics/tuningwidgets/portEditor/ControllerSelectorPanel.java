package com.efiAnalytics.tuningwidgets.portEditor;

import G.Manager;
import G.R;
import G.T;
import V.ExceptionPrintstacktrace;
import aE.PropertiesExtension;
import bH.D;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import r.RInterfaceIndia;

public class ControllerSelectorPanel extends JPanel {
  JComboBox PropertiesExtension = null;

  R b = null;

  PropertiesExtension c = PropertiesExtension.A();

  Manager d = null;

  private int f = -1;

  private int ExceptionPrintstacktrace = -1;

  ArrayList e = new ArrayList();

  public ControllerSelectorPanel(R paramR, String paramString) {
    this.b = paramR;
    if (paramString != null && !paramString.equals("")) this.d = paramR.c(paramString);
    this.PropertiesExtension = new JComboBox();
    setLayout(new GridLayout());
    if (paramString != null
        && paramR.c(paramString) != null
        && RInterfaceIndia.PropertiesExtension().PropertiesExtension("HF-0FD-0HHFJG")) {
      add(this.PropertiesExtension);
      this.PropertiesExtension.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 8));
    }
    this.PropertiesExtension.addActionListener(new r(this));
    if (this.d != null) {
      String[] arrayOfString = T.PropertiesExtension().d();
      for (byte b = 0; b < arrayOfString.length; b++)
        this.PropertiesExtension.addItem(arrayOfString[b]);
    } else {
      D.d("No [Constant] for outputCanId defined in [PortEditor], Controller Selector disabled.");
      this.PropertiesExtension.addItem(paramR.c());
    }
  }

  private double[][] PropertiesExtension(double[][] paramArrayOfdouble) {
    for (byte b = 0; b < paramArrayOfdouble.length; b++) {
      for (byte b1 = 0; b1 < (paramArrayOfdouble[0]).length; b1++) {
        if (paramArrayOfdouble[b][b1] < 0.0D) paramArrayOfdouble[b][b1] = 0.0D;
      }
    }
    return paramArrayOfdouble;
  }

  protected void PropertiesExtension(String paramString) {
    if (this.d != null && paramString != null && paramString.length() > 0)
      try {
        double[][] arrayOfDouble = this.d.RInterfaceIndia(this.b.h());
        arrayOfDouble = PropertiesExtension(arrayOfDouble);
        R r = T.PropertiesExtension().c(paramString);
        if (r == null) {
          D.c(
              "onSelect no EcuConfig found for "
                  + paramString
                  + " using PropertiesExtension CAN ID of 0");
          arrayOfDouble[b()][PropertiesExtension()] = 0.0D;
        } else if (b() >= 0 && PropertiesExtension() >= 0) {
          arrayOfDouble[b()][PropertiesExtension()] = r.O().x();
        }
        this.d.PropertiesExtension(this.b.h(), arrayOfDouble);
        this.PropertiesExtension.setSelectedItem(paramString);
        PropertiesExtension(r);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        D.PropertiesExtension(
            "Error updating:" + this.d.aL() + " CAN ID to that of " + paramString);
        Logger.getLogger(q.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
      } catch (Exception exception) {
        D.PropertiesExtension(
            "Error updating:" + this.d.aL() + " CAN ID to that of " + paramString);
        Logger.getLogger(q.class.getName()).log(Level.SEVERE, (String) null, exception);
      }
  }

  private void d() {
    if (this.d != null)
      try {
        double[][] arrayOfDouble = this.d.RInterfaceIndia(this.b.h());
        int RInterfaceIndia = (int) arrayOfDouble[b()][PropertiesExtension()];
        String[] arrayOfString = T.PropertiesExtension().d();
        for (byte b = 0; b < arrayOfString.length; b++) {
          R r = T.PropertiesExtension().c(arrayOfString[b]);
          if (r.O().x() == RInterfaceIndia) {
            PropertiesExtension(r.c());
            return;
          }
        }
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        ExceptionPrintstacktrace.printStackTrace();
      }
  }

  private void PropertiesExtension(R paramR) {
    Iterator<F> iterator = this.e.iterator();
    while (iterator.hasNext()) ((F) iterator.next()).PropertiesExtension(paramR);
  }

  public void PropertiesExtension(F paramF) {
    this.e.add(paramF);
  }

  public int PropertiesExtension() {
    return this.f;
  }

  public void PropertiesExtension(int paramInt) {
    this.f = paramInt;
    d();
  }

  public int b() {
    return this.ExceptionPrintstacktrace;
  }

  public void b(int paramInt) {
    this.ExceptionPrintstacktrace = paramInt;
  }

  public R c() {
    if (this.d != null && b() >= 0 && PropertiesExtension() >= 0)
      try {
        double[][] arrayOfDouble = this.d.RInterfaceIndia(this.b.h());
        int RInterfaceIndia = (int) arrayOfDouble[b()][PropertiesExtension()];
        String[] arrayOfString = T.PropertiesExtension().d();
        for (byte b = 0; b < arrayOfString.length; b++) {
          R r = T.PropertiesExtension().c(arrayOfString[b]);
          if (r.O().x() == RInterfaceIndia) return T.PropertiesExtension().c(r.c());
        }
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        ExceptionPrintstacktrace.printStackTrace();
      }
    return T.PropertiesExtension().c((String) this.PropertiesExtension.getSelectedItem());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/portEditor/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
