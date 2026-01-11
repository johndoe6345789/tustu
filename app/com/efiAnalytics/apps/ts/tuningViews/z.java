package com.efiAnalytics.apps.ts.tuningViews;

import G.R;
import G.T;
import V.a;
import aE.a;
import aE.e;
import bH.D;
import bH.X;
import bH.aa;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.ct;
import com.efiAnalytics.ui.eJ;
import java.awt.Component;
import java.awt.Window;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.a;
import r.j;
import s.g;
import v.g;

public class z implements e, a {
  n a;
  
  a b = null;
  
  public z(n paramn) {
    this.a = paramn;
  }
  
  public void a(a parama, R paramR) {
    this.b = parama;
    String[] arrayOfString = T.a().d();
    G.c();
    ArrayList<R> arrayList = new ArrayList();
    for (String str : arrayOfString) {
      R r = T.a().c(str);
      if (r != null)
        arrayList.add(r); 
    } 
    try {
      aa aa = new aa();
      aa.a();
      List list = G.b(arrayList);
      this.a.a(list);
      D.c("Tuning View Files loaded in " + aa.d() + "ms.");
    } catch (a a1) {
      bV.d("Unable to load Tuning View Tabs for this Project.\nError:\n" + a1.getMessage(), (Component)this.a);
      Logger.getLogger(z.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
    } 
  }
  
  public void e_() {}
  
  public void a(a parama) {
    byte b = 0;
    Iterator<J> iterator = this.a.e();
    while (iterator.hasNext()) {
      J j = iterator.next();
      if (j == null)
        D.b("null TuningViewPanel!!"); 
      j.b(true);
      j.repaint();
      F f = j.g();
      if (j != null && !j.O() && bV.a(g.b("A Tuning View Tab has been changed.") + "\n" + g.b("Do you want to save the changes?") + "\n" + f.b(), j, true)) {
        File file = new File(j.a(parama), G.a(b));
        g g = new g();
        try {
          g.a(f, file);
        } catch (a a1) {
          bV.d(a1.getMessage(), j);
        } 
      } 
      b++;
    } 
    this.a.c();
  }
  
  public void a() {
    c();
  }
  
  private void c() {
    b b = new b();
    String[] arrayOfString1 = T.a().d();
    String[] arrayOfString2 = new String[arrayOfString1.length];
    ArrayList<R> arrayList = new ArrayList();
    for (byte b1 = 0; b1 < arrayOfString1.length; b1++) {
      R r = T.a().c(arrayOfString1[b1]);
      arrayList.add(r);
      arrayOfString2[b1] = r.i();
    } 
    C c = new C(this, b, arrayOfString2);
    A a1 = new A(this, arrayList, b);
    a1.start();
    Window window1 = bV.b((Component)this.a);
    Window window2 = window1;
    if (!(window2 instanceof java.awt.Dialog) && !(window2 instanceof java.awt.Frame))
      window2 = null; 
    ct ct = new ct(window2, b, "Select Tuning View", c, 7);
    if (c != null)
      ct.a(c); 
    ct.setSize(eJ.a(640), eJ.a(480));
    bV.a(window1, (Component)ct);
    ct.setVisible(true);
  }
  
  public boolean a(String paramString, n paramn) {
    int i = this.a.f(paramString);
    if (i >= 0) {
      File file = new File(j.a(this.b), G.a(i));
      file.delete();
      for (int j = i + 1; j < this.a.getTabCount() - 1; j++) {
        file = new File(j.a(this.b), G.a(j));
        File file1 = new File(j.a(this.b), G.a(j - 1));
        file.renameTo(file1);
        this.a.b(j).c(file1.getAbsolutePath());
      } 
    } 
    return true;
  }
  
  public void a(J paramJ) {
    paramJ.a(new B(this, paramJ, paramJ.getName()));
  }
  
  public void a(J paramJ, int paramInt) {
    int i = this.a.f(paramJ.getName());
    boolean bool = this.a.isEnabledAt(i);
    J j = this.a.b(paramInt);
    this.a.a(paramInt);
    this.a.a(i);
    File file1 = new File(paramJ.w());
    File file2 = G.b(paramInt);
    File file3 = G.b(i);
    while (true) {
      file3 = new File(file3.getParentFile(), X.b(file3.getName(), "." + a.cp, "a." + a.cp));
      if (!file3.exists()) {
        D.c("renaming: " + file2.getName() + " to " + file3.getName());
        if (file2.exists() && !file2.renameTo(file3)) {
          D.a("Failed to rename TuningViewFile in movingTuningView.");
          bV.d("Unable to rename tmp TuningView File.", (Component)this.a);
          return;
        } 
        j.c(file3.getAbsolutePath());
        file2 = G.b(paramInt);
        D.c("renaming: " + file1.getName() + " to " + file2.getName());
        if (!file1.renameTo(file2)) {
          D.a("Failed to rename TuningViewFile in movingTuningView.");
          bV.d("Unable to rename TuningView File.\nFrom:" + file1.getAbsolutePath() + "\n  To:" + file2.getAbsolutePath(), (Component)this.a);
          return;
        } 
        paramJ.c(file2.getAbsolutePath());
        file1 = G.b(i);
        if (!file1.equals(file3)) {
          D.c("renaming: " + file3.getName() + " to " + file1.getName());
          if (file3.renameTo(file1)) {
            j.c(file1.getAbsolutePath());
          } else {
            D.a("Failed to rename TuningViewFile in movingTuningView. " + file3.getName() + " --> " + file1.getName());
            bV.d("Unable to rename TuningView File.\nFrom:" + file3.getAbsolutePath() + "\n  To:" + file1.getAbsolutePath(), (Component)this.a);
          } 
        } 
        D.c("Finished moving TV files.");
        this.a.remove(i);
        this.a.a(paramJ, paramJ.getName(), paramInt);
        if (bool)
          this.a.setSelectedIndex(paramInt); 
        return;
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */