package com.efiAnalytics.apps.ts.tuningViews;

import V.ExceptionInVPackage;
import bH.D;
import com.efiAnalytics.ui.ExceptionInVPackage;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.Cursor;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import r.ThreadedFile;
import s.SComponentGolf;
import v.SComponentGolf;

class TuningViewLoadAction implements ExceptionInVPackage {
  private b c = null;
  
  private String[] d = null;
  
  J ExceptionInVPackage = null;
  
  TuningViewLoadAction(z paramz, b paramb, String[] paramArrayOfString) {
    this.c = paramb;
    this.d = paramArrayOfString;
  }
  
  public boolean ExceptionInVPackage() {
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
      this.ExceptionInVPackage.setCursor(Cursor.getPredefinedCursor(3));
      SComponentGolf SComponentGolf = new SComponentGolf();
      F f = SComponentGolf.ExceptionInVPackage(this.c.ExceptionInVPackage());
      if (this.c.b() && !ExceptionInVPackage(f.ExceptionInVPackage())) {
        String str = this.d[0];
        for (byte b1 = 1; b1 < this.d.length; b1++)
          str = str + " & " + this.d[b1]; 
        boolean bool = bV.ExceptionInVPackage("Warning: Gauge Cluster firmware signature (" + f.ExceptionInVPackage() + ")\ndoes not match current firmware (" + str + ").\nYou may need to edit some components of the layout.\n \nContinue Loading?", this.ExceptionInVPackage.getParent(), true);
        if (!bool)
          return; 
      } 
      f.ExceptionInVPackage(this.d[0]);
      this.ExceptionInVPackage.ExceptionInVPackage(f);
    } catch (ExceptionInVPackage a1) {
      D.ExceptionInVPackage("Unable to load dash file:\n" + this.c.ExceptionInVPackage(), (Exception)a1, this.ExceptionInVPackage.getParent());
    } finally {
      this.ExceptionInVPackage.setCursor(Cursor.getPredefinedCursor(0));
    } 
  }
  
  private J e() {
    k k = new k(this.c.ExceptionInVPackage());
    String str = k.b();
    boolean bool = false;
    while (true) {
      if (str.trim().length() == 0) {
        str = JOptionPane.showInputDialog((Component)this.b.ExceptionInVPackage, SComponentGolf.b("New Tuning View Name"), SComponentGolf.b("Add New Tuning View Tab"), 3);
      } else {
        str = JOptionPane.showInputDialog((Component)this.b.ExceptionInVPackage, SComponentGolf.b("New Tuning View Tab Name"), str);
      } 
      if (str == null || str.trim().equals(""))
        return null; 
      if (this.b.ExceptionInVPackage.d(str)) {
        bV.d(SComponentGolf.b("Name Already In Use."), (Component)this.b.ExceptionInVPackage);
        bool = true;
      } else {
        bool = false;
      } 
      if (!bool) {
        J ThreadedFile = new J();
        ThreadedFile.setName(str);
        this.b.ExceptionInVPackage.ExceptionInVPackage(ThreadedFile, str);
        this.b.ExceptionInVPackage.SComponentGolf(str);
        File file = new File(ThreadedFile.ExceptionInVPackage(this.b.b), G.ExceptionInVPackage(this.b.ExceptionInVPackage.f(str)));
        ThreadedFile.c(file.getAbsolutePath());
        return ThreadedFile;
      } 
    } 
  }
  
  private boolean ExceptionInVPackage(String paramString) {
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