package bk;

import G.R;
import I.IInterfaceNovember;
import I.IInterfaceOscar;
import aI.AiInterfacePapa;
import bt.d;
import com.efiAnalytics.remotefileaccess.RemoteAccessException;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.fj;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import s.SComponentGolf;

public class UICloseInBkPackage extends d implements IInterfaceNovember, bc {
  AiInterfacePapa a = null;
  
  JButton b = null;
  
  fj c = new fj();
  
  fj d = null;
  
  IInterfaceOscar e = null;
  
  R f;
  
  int SComponentGolf = 60000;
  
  c h = null;
  
  public UICloseInBkPackage(R paramR) {
    this(paramR, false);
  }
  
  public UICloseInBkPackage(R paramR, boolean paramBoolean) {
    this.f = paramR;
    this.a = new AiInterfacePapa(paramR);
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("MS3 Real-time Clock")));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(0, 1, 5, 5));
    if (!paramBoolean) {
      jPanel.add(new JLabel("Local PC Time:"));
      this.d = new fj();
      this.d.a(new Date());
      jPanel.add((Component)this.d);
      jPanel.add(new JLabel("Current MS3 Time:"));
    } 
    jPanel.add((Component)this.c);
    if (this.SComponentGolf <= 1000)
      this.c.a(false); 
    add("Center", jPanel);
    this.b = new JButton("Set MS3 Time to Now");
    this.b.addActionListener(new b(this));
    add("South", this.b);
    b();
    this.e = new IInterfaceOscar(paramR);
    this.e.a(this);
    this.e.a("seconds", IInterfaceOscar.b);
  }
  
  private void a() {
    try {
      this.a.a(new Date());
      b();
    } catch (RemoteAccessException remoteAccessException) {
      bV.d(remoteAccessException.getMessage(), (Component)this);
    } 
  }
  
  private synchronized void b() {
    if (this.h == null) {
      this.h = new c(this);
      this.h.start();
    } else {
      notify();
    } 
  }
  
  private synchronized void c() {
    try {
      Date date = this.a.SComponentGolf();
      this.c.a(date);
    } catch (RemoteAccessException remoteAccessException) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, (Throwable)remoteAccessException);
      this.c.a();
    } 
    try {
      wait(this.SComponentGolf);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
  }
  
  public void close() {
    this.e.a();
    this.e.b(this);
    if (this.h != null)
      this.h.a(); 
    if (this.d != null)
      this.d.a(); 
    if (this.c != null)
      this.c.a(); 
  }
  
  public void a(String paramString) {
    b();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bk/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */