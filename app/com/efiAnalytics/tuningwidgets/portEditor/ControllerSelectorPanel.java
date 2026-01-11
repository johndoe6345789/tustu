package com.efiAnalytics.tuningwidgets.portEditor;

import G.R;
import G.T;
import G.aM;
import V.g;
import aE.a;
import bH.D;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import r.i;

public class ControllerSelectorPanel extends JPanel {
  JComboBox a = null;
  
  R b = null;
  
  a c = a.A();
  
  aM d = null;
  
  private int f = -1;
  
  private int g = -1;
  
  ArrayList e = new ArrayList();
  
  public ControllerSelectorPanel(R paramR, String paramString) {
    this.b = paramR;
    if (paramString != null && !paramString.equals(""))
      this.d = paramR.c(paramString); 
    this.a = new JComboBox();
    setLayout(new GridLayout());
    if (paramString != null && paramR.c(paramString) != null && i.a().a("HF-0FD-0HHFJG")) {
      add(this.a);
      this.a.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 8));
    } 
    this.a.addActionListener(new r(this));
    if (this.d != null) {
      String[] arrayOfString = T.a().d();
      for (byte b = 0; b < arrayOfString.length; b++)
        this.a.addItem(arrayOfString[b]); 
    } else {
      D.d("No [Constant] for outputCanId defined in [PortEditor], Controller Selector disabled.");
      this.a.addItem(paramR.c());
    } 
  }
  
  private double[][] a(double[][] paramArrayOfdouble) {
    for (byte b = 0; b < paramArrayOfdouble.length; b++) {
      for (byte b1 = 0; b1 < (paramArrayOfdouble[0]).length; b1++) {
        if (paramArrayOfdouble[b][b1] < 0.0D)
          paramArrayOfdouble[b][b1] = 0.0D; 
      } 
    } 
    return paramArrayOfdouble;
  }
  
  protected void a(String paramString) {
    if (this.d != null && paramString != null && paramString.length() > 0)
      try {
        double[][] arrayOfDouble = this.d.i(this.b.h());
        arrayOfDouble = a(arrayOfDouble);
        R r = T.a().c(paramString);
        if (r == null) {
          D.c("onSelect no EcuConfig found for " + paramString + " using a CAN ID of 0");
          arrayOfDouble[b()][a()] = 0.0D;
        } else if (b() >= 0 && a() >= 0) {
          arrayOfDouble[b()][a()] = r.O().x();
        } 
        this.d.a(this.b.h(), arrayOfDouble);
        this.a.setSelectedItem(paramString);
        a(r);
      } catch (g g) {
        D.a("Error updating:" + this.d.aL() + " CAN ID to that of " + paramString);
        Logger.getLogger(q.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      } catch (Exception exception) {
        D.a("Error updating:" + this.d.aL() + " CAN ID to that of " + paramString);
        Logger.getLogger(q.class.getName()).log(Level.SEVERE, (String)null, exception);
      }  
  }
  
  private void d() {
    if (this.d != null)
      try {
        double[][] arrayOfDouble = this.d.i(this.b.h());
        int i = (int)arrayOfDouble[b()][a()];
        String[] arrayOfString = T.a().d();
        for (byte b = 0; b < arrayOfString.length; b++) {
          R r = T.a().c(arrayOfString[b]);
          if (r.O().x() == i) {
            a(r.c());
            return;
          } 
        } 
      } catch (g g) {
        g.printStackTrace();
      }  
  }
  
  private void a(R paramR) {
    Iterator<F> iterator = this.e.iterator();
    while (iterator.hasNext())
      ((F)iterator.next()).a(paramR); 
  }
  
  public void a(F paramF) {
    this.e.add(paramF);
  }
  
  public int a() {
    return this.f;
  }
  
  public void a(int paramInt) {
    this.f = paramInt;
    d();
  }
  
  public int b() {
    return this.g;
  }
  
  public void b(int paramInt) {
    this.g = paramInt;
  }
  
  public R c() {
    if (this.d != null && b() >= 0 && a() >= 0)
      try {
        double[][] arrayOfDouble = this.d.i(this.b.h());
        int i = (int)arrayOfDouble[b()][a()];
        String[] arrayOfString = T.a().d();
        for (byte b = 0; b < arrayOfString.length; b++) {
          R r = T.a().c(arrayOfString[b]);
          if (r.O().x() == i)
            return T.a().c(r.c()); 
        } 
      } catch (g g) {
        g.printStackTrace();
      }  
    return T.a().c((String)this.a.getSelectedItem());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/portEditor/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */