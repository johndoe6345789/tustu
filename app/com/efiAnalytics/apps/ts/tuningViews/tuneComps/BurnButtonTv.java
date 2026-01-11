package com.efiAnalytics.apps.ts.tuningViews.tuneComps;

import G.R;
import G.T;
import V.a;
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
import n.b;
import s.g;

public class BurnButtonTv extends TuneViewComponent {
  private final List k = new ArrayList();
  
  JButton c = new JButton();
  
  d d = new d(this);
  
  e e = null;
  
  ImageIcon f = null;
  
  ImageIcon g = null;
  
  boolean h = false;
  
  boolean i = false;
  
  Runnable j = new c(this);
  
  public BurnButtonTv() {
    setLayout((LayoutManager)new h(this));
    try {
      Image image = cO.a().a(cO.W, (Component)this, 24);
      this.f = new ImageIcon(image);
      image = cO.a().a(cO.Z, (Component)this, 24);
      this.g = new ImageIcon(image);
    } catch (a a) {
      Logger.getLogger(b.class.getName()).log(Level.INFO, "Unable to load burn button image.", (Throwable)a);
    } 
    this.c.setText(g.b("Burn"));
    add(this.c);
    this.c.addActionListener(new a(this));
    b b = new b(this);
    addMouseListener(b);
  }
  
  private void burn() {
    for (String str : T.a().d()) {
      R r = T.a().c(str);
      r.I();
    } 
  }
  
  public void initializeComponents() {
    enableBurn(false);
    for (String str : T.a().d()) {
      R r = T.a().c(str);
      this.k.add(r);
      r.C().a(this.d);
      if (r.C().C())
        enableBurn(true); 
    } 
  }
  
  public void close() {
    for (R r : this.k)
      r.C().b(this.d); 
  }
  
  public boolean isDirty() {
    return false;
  }
  
  public void setClean(boolean paramBoolean) {}
  
  public void enableBurn(boolean paramBoolean) {
    if (paramBoolean && this.f != null) {
      this.c.setIcon(this.f);
    } else if (!paramBoolean && this.g != null) {
      this.c.setIcon(this.g);
    } else {
      this.c.setEnabled(paramBoolean);
    } 
    this.h = paramBoolean;
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (getWidth() != paramInt3 || getHeight() != paramInt4)
      if (this.e == null || !this.e.a) {
        this.e = new e(this);
        this.e.start();
      } else {
        this.e.a();
      }  
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/tuneComps/BurnButtonTv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */