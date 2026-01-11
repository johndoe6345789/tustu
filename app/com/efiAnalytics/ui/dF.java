package com.efiAnalytics.ui;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.KeyboardFocusManager;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JDialog;

public class dF extends JDialog implements bc {
  aO o = null;
  
  private et a = null;
  
  public dF(Window paramWindow, String paramString) {
    this(paramWindow, paramString, (aO)null);
  }
  
  public dF(Window paramWindow, String paramString, aO paramaO) {
    this(paramWindow, paramString, paramaO, false);
  }
  
  public dF(Window paramWindow, String paramString, aO paramaO, boolean paramBoolean) {
    super(paramWindow, paramString, JDialog.DEFAULT_MODALITY_TYPE);
    setModal(paramBoolean);
    this.o = paramaO;
    addWindowListener(new dG(this));
    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new dH(this, this));
  }
  
  public void k() {
    if (this.o != null)
      this.o.i(); 
  }
  
  public void close() {
    l();
    dispose();
  }
  
  public void setVisible(boolean paramBoolean) {
    if (paramBoolean) {
      m();
    } else {
      l();
    } 
    super.setVisible(paramBoolean);
  }
  
  protected void l() {
    if (this.a != null) {
      Point point = getLocation();
      this.a.a("x", point.x + "");
      this.a.a("y", point.y + "");
      Dimension dimension = getSize();
      this.a.a("w", dimension.width + "");
      this.a.a("h", dimension.height + "");
    } 
  }
  
  protected void m() {
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    byte b1 = -1;
    byte b2 = -1;
    boolean bool = (dimension.width > 1150) ? true : dimension.width;
    char c = '̠';
    if (this.a != null) {
      String str1 = this.a.a("x");
      b1 = (str1 != null && !str1.equals("")) ? Integer.parseInt(str1) : b1;
      String str2 = this.a.a("y");
      b2 = (str2 != null && !str2.equals("")) ? Integer.parseInt(str2) : b2;
      String str3 = this.a.a("w");
      bool = (str3 != null && !str3.equals("")) ? Integer.parseInt(str3) : bool;
      String str4 = this.a.a("h");
      c = (str4 != null && !str4.equals("")) ? Integer.parseInt(str4) : c;
      setSize(bool, c);
      if ((((b1 < 0) ? 1 : 0) & ((b2 < 0) ? 1 : 0)) != 0) {
        bV.a((Frame)getParent(), this);
      } else {
        setLocation(b1, b2);
      } 
    } 
  }
  
  public void a(et paramet) {
    this.a = paramet;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/dF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */