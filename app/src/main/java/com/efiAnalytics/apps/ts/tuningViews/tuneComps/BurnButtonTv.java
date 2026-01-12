package com.efiAnalytics.apps.ts.tuningViews.tuneComps;

import G.R;
import G.T;
import V.ExceptionInVPackage;
import com.efiAnalytics.apps.ts.tuningViews.TuneViewComponent;
import com.efiAnalytics.apps.ts.tuningViews.h;
import com.efiAnalytics.ui.cO;
import java.awt.Component;
import java.awt.Image;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import n.JPanelExtensionInNPackage;
import s.SComponentGolf;

public class BurnButtonTv extends TuneViewComponent {
  private final List k = new ArrayList();

  JButton c = new JButton();

  d d = new d(this);

  e e = null;

  ImageIcon f = null;

  ImageIcon SComponentGolf = null;

  boolean h = false;

  boolean i = false;

  Runnable j = new c(this);

  public BurnButtonTv() {
    setLayout((LayoutManager) new h(this));
    try {
      Image image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.W, (Component) this, 24);
      this.f = new ImageIcon(image);
      image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.Z, (Component) this, 24);
      this.SComponentGolf = new ImageIcon(image);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(JPanelExtensionInNPackage.class.getName())
          .log(Level.INFO, "Unable to load burn button image.", (Throwable) ExceptionInVPackage);
    }
    this.c.setText(SComponentGolf.JPanelExtensionInNPackage("Burn"));
    add(this.c);
    this.c.addActionListener(new ExceptionInVPackage(this));
    JPanelExtensionInNPackage JPanelExtensionInNPackage = new JPanelExtensionInNPackage(this);
    addMouseListener(JPanelExtensionInNPackage);
  }

  private void burn() {
    for (String str : T.ExceptionInVPackage().d()) {
      R r = T.ExceptionInVPackage().c(str);
      r.I();
    }
  }

  public void initializeComponents() {
    enableBurn(false);
    for (String str : T.ExceptionInVPackage().d()) {
      R r = T.ExceptionInVPackage().c(str);
      this.k.add(r);
      r.C().ExceptionInVPackage(this.d);
      if (r.C().C()) enableBurn(true);
    }
  }

  public void close() {
    for (R r : this.k) r.C().JPanelExtensionInNPackage(this.d);
  }

  public boolean isDirty() {
    return false;
  }

  public void setClean(boolean paramBoolean) {}

  public void enableBurn(boolean paramBoolean) {
    if (paramBoolean && this.f != null) {
      this.c.setIcon(this.f);
    } else if (!paramBoolean && this.SComponentGolf != null) {
      this.c.setIcon(this.SComponentGolf);
    } else {
      this.c.setEnabled(paramBoolean);
    }
    this.h = paramBoolean;
  }

  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (getWidth() != paramInt3 || getHeight() != paramInt4)
      if (this.e == null || !this.e.ExceptionInVPackage) {
        this.e = new e(this);
        this.e.start();
      } else {
        this.e.ExceptionInVPackage();
      }
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/tuneComps/BurnButtonTv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
