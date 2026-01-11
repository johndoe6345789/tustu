package com.efiAnalytics.apps.ts.tuningViews;

import V.a;
import bH.D;
import com.efiAnalytics.ui.a;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.Cursor;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import r.j;
import s.g;
import v.g;

class TuningViewLoadAction implements a {
  private b c = null;
  
  private String[] d = null;
  
  J a = null;
  
  C(z paramz, b paramb, String[] paramArrayOfString) {
    this.c = paramb;
    this.d = paramArrayOfString;
  }
  
  public boolean a() {
    c();
    return true;
  }
  
  public void b() {}
  
  public void c() {
    D d = new D(this);
    SwingUtilities.invokeLater(d);
  }
  
  private void d() {
    try {
      this.a.setCursor(Cursor.getPredefinedCursor(3));
      g g = new g();
      F f = g.a(this.c.a());
      if (this.c.b() && !a(f.a())) {
        String str = this.d[0];
        for (byte b1 = 1; b1 < this.d.length; b1++)
          str = str + " & " + this.d[b1]; 
        boolean bool = bV.a("Warning: Gauge Cluster firmware signature (" + f.a() + ")\ndoes not match current firmware (" + str + ").\nYou may need to edit some components of the layout.\n \nContinue Loading?", this.a.getParent(), true);
        if (!bool)
          return; 
      } 
      f.a(this.d[0]);
      this.a.a(f);
    } catch (a a1) {
      D.a("Unable to load dash file:\n" + this.c.a(), (Exception)a1, this.a.getParent());
    } finally {
      this.a.setCursor(Cursor.getPredefinedCursor(0));
    } 
  }
  
  private J e() {
    k k = new k(this.c.a());
    String str = k.b();
    boolean bool = false;
    while (true) {
      if (str.trim().length() == 0) {
        str = JOptionPane.showInputDialog((Component)this.b.a, g.b("New Tuning View Name"), g.b("Add New Tuning View Tab"), 3);
      } else {
        str = JOptionPane.showInputDialog((Component)this.b.a, g.b("New Tuning View Tab Name"), str);
      } 
      if (str == null || str.trim().equals(""))
        return null; 
      if (this.b.a.d(str)) {
        bV.d(g.b("Name Already In Use."), (Component)this.b.a);
        bool = true;
      } else {
        bool = false;
      } 
      if (!bool) {
        J j = new J();
        j.setName(str);
        this.b.a.a(j, str);
        this.b.a.g(str);
        File file = new File(j.a(this.b.b), G.a(this.b.a.f(str)));
        j.c(file.getAbsolutePath());
        return j;
      } 
    } 
  }
  
  private boolean a(String paramString) {
    for (byte b1 = 0; b1 < this.d.length; b1++) {
      if (this.d[b1].equals(paramString))
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/C.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */