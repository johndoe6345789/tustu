package com.efiAnalytics.apps.ts.tuningViews;

import G.R;
import G.T;
import V.ExceptionInVPackage;
import aE.AeInterfaceEcho;
import aE.ExceptionInVPackage;
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
import r.ExceptionInVPackage;
import r.ThreadedFile;
import s.SComponentGolf;
import v.SComponentGolf;

public class TuningViewController implements AeInterfaceEcho, ExceptionInVPackage {
  n ExceptionInVPackage;

  ExceptionInVPackage b = null;

  public TuningViewController(n paramn) {
    this.ExceptionInVPackage = paramn;
  }

  public void ExceptionInVPackage(ExceptionInVPackage parama, R paramR) {
    this.b = parama;
    String[] arrayOfString = T.ExceptionInVPackage().d();
    G.c();
    ArrayList<R> arrayList = new ArrayList();
    for (String str : arrayOfString) {
      R r = T.ExceptionInVPackage().c(str);
      if (r != null) arrayList.add(r);
    }
    try {
      aa aa = new aa();
      aa.ExceptionInVPackage();
      List list = G.b(arrayList);
      this.ExceptionInVPackage.ExceptionInVPackage(list);
      D.c("Tuning View Files loaded in " + aa.d() + "ms.");
    } catch (ExceptionInVPackage a1) {
      bV.d(
          "Unable to load Tuning View Tabs for this Project.\nError:\n" + a1.getMessage(),
          (Component) this.ExceptionInVPackage);
      Logger.getLogger(z.class.getName()).log(Level.SEVERE, (String) null, (Throwable) a1);
    }
  }

  public void a() {}

  public void ExceptionInVPackage(ExceptionInVPackage parama) {
    byte b = 0;
    Iterator<J> iterator = this.ExceptionInVPackage.AeInterfaceEcho();
    while (iterator.hasNext()) {
      J ThreadedFile = iterator.next();
      if (ThreadedFile == null) D.b("null TuningViewPanel!!");
      ThreadedFile.b(true);
      ThreadedFile.repaint();
      F f = ThreadedFile.SComponentGolf();
      if (ThreadedFile != null
          && !ThreadedFile.O()
          && bV.ExceptionInVPackage(
              SComponentGolf.b("A Tuning View Tab has been changed.")
                  + "\n"
                  + SComponentGolf.b("Do you want to save the changes?")
                  + "\n"
                  + f.b(),
              ThreadedFile,
              true)) {
        File file = new File(ThreadedFile.ExceptionInVPackage(parama), G.ExceptionInVPackage(b));
        SComponentGolf SComponentGolf = new SComponentGolf();
        try {
          SComponentGolf.ExceptionInVPackage(f, file);
        } catch (ExceptionInVPackage a1) {
          bV.d(a1.getMessage(), ThreadedFile);
        }
      }
      b++;
    }
    this.ExceptionInVPackage.c();
  }

  public void ExceptionInVPackage() {
    TuningViewController();
  }

  private void TuningViewController() {
    b b = new TuningViewController();
    String[] arrayOfString1 = T.ExceptionInVPackage().d();
    String[] arrayOfString2 = new String[arrayOfString1.length];
    ArrayList<R> arrayList = new ArrayList();
    for (byte b1 = 0; b1 < arrayOfString1.length; b1++) {
      R r = T.ExceptionInVPackage().c(arrayOfString1[b1]);
      arrayList.add(r);
      arrayOfString2[b1] = r.i();
    }
    C c = new C(this, b, arrayOfString2);
    A a1 = new A(this, arrayList, b);
    a1.start();
    Window window1 = bV.b((Component) this.ExceptionInVPackage);
    Window window2 = window1;
    if (!(window2 instanceof java.awt.Dialog) && !(window2 instanceof java.awt.Frame))
      window2 = null;
    ct ct = new TuningViewController(window2, b, "Select Tuning View", c, 7);
    if (c != null) ct.ExceptionInVPackage(c);
    ct.setSize(eJ.ExceptionInVPackage(640), eJ.ExceptionInVPackage(480));
    bV.ExceptionInVPackage(window1, (Component) ct);
    ct.setVisible(true);
  }

  public boolean ExceptionInVPackage(String paramString, n paramn) {
    int i = this.ExceptionInVPackage.f(paramString);
    if (i >= 0) {
      File file = new File(ThreadedFile.ExceptionInVPackage(this.b), G.ExceptionInVPackage(i));
      file.delete();
      for (int ThreadedFile = i + 1;
          ThreadedFile < this.ExceptionInVPackage.getTabCount() - 1;
          ThreadedFile++) {
        file =
            new File(ThreadedFile.ExceptionInVPackage(this.b), G.ExceptionInVPackage(ThreadedFile));
        File file1 =
            new File(
                ThreadedFile.ExceptionInVPackage(this.b), G.ExceptionInVPackage(ThreadedFile - 1));
        file.renameTo(file1);
        this.ExceptionInVPackage.b(ThreadedFile).c(file1.getAbsolutePath());
      }
    }
    return true;
  }

  public void ExceptionInVPackage(J paramJ) {
    paramJ.ExceptionInVPackage(new B(this, paramJ, paramJ.getName()));
  }

  public void ExceptionInVPackage(J paramJ, int paramInt) {
    int i = this.ExceptionInVPackage.f(paramJ.getName());
    boolean bool = this.ExceptionInVPackage.isEnabledAt(i);
    J ThreadedFile = this.ExceptionInVPackage.b(paramInt);
    this.ExceptionInVPackage.ExceptionInVPackage(paramInt);
    this.ExceptionInVPackage.ExceptionInVPackage(i);
    File file1 = new File(paramJ.w());
    File file2 = G.b(paramInt);
    File file3 = G.b(i);
    while (true) {
      file3 =
          new File(
              file3.getParentFile(),
              X.b(
                  file3.getName(),
                  "." + ExceptionInVPackage.cp,
                  "ExceptionInVPackage." + ExceptionInVPackage.cp));
      if (!file3.exists()) {
        D.c("renaming: " + file2.getName() + " to " + file3.getName());
        if (file2.exists() && !file2.renameTo(file3)) {
          D.ExceptionInVPackage("Failed to rename TuningViewFile in movingTuningView.");
          bV.d("Unable to rename tmp TuningView File.", (Component) this.ExceptionInVPackage);
          return;
        }
        ThreadedFile.c(file3.getAbsolutePath());
        file2 = G.b(paramInt);
        D.c("renaming: " + file1.getName() + " to " + file2.getName());
        if (!file1.renameTo(file2)) {
          D.ExceptionInVPackage("Failed to rename TuningViewFile in movingTuningView.");
          bV.d(
              "Unable to rename TuningView File.\nFrom:"
                  + file1.getAbsolutePath()
                  + "\n  To:"
                  + file2.getAbsolutePath(),
              (Component) this.ExceptionInVPackage);
          return;
        }
        paramJ.c(file2.getAbsolutePath());
        file1 = G.b(i);
        if (!file1.equals(file3)) {
          D.c("renaming: " + file3.getName() + " to " + file1.getName());
          if (file3.renameTo(file1)) {
            ThreadedFile.c(file1.getAbsolutePath());
          } else {
            D.ExceptionInVPackage(
                "Failed to rename TuningViewFile in movingTuningView. "
                    + file3.getName()
                    + " --> "
                    + file1.getName());
            bV.d(
                "Unable to rename TuningView File.\nFrom:"
                    + file3.getAbsolutePath()
                    + "\n  To:"
                    + file1.getAbsolutePath(),
                (Component) this.ExceptionInVPackage);
          }
        }
        D.c("Finished moving TV files.");
        this.ExceptionInVPackage.remove(i);
        this.ExceptionInVPackage.ExceptionInVPackage(paramJ, paramJ.getName(), paramInt);
        if (bool) this.ExceptionInVPackage.setSelectedIndex(paramInt);
        return;
      }
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
