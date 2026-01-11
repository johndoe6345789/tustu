package bk;

import G.R;
import I.n;
import I.o;
import aI.p;
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
import s.g;

public class a extends d implements n, bc {
  p a = null;
  
  JButton b = null;
  
  fj c = new fj();
  
  fj d = null;
  
  o e = null;
  
  R f;
  
  int g = 60000;
  
  c h = null;
  
  public a(R paramR) {
    this(paramR, false);
  }
  
  public a(R paramR, boolean paramBoolean) {
    this.f = paramR;
    this.a = new p(paramR);
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createTitledBorder(g.b("MS3 Real-time Clock")));
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
    if (this.g <= 1000)
      this.c.a(false); 
    add("Center", jPanel);
    this.b = new JButton("Set MS3 Time to Now");
    this.b.addActionListener(new b(this));
    add("South", this.b);
    b();
    this.e = new o(paramR);
    this.e.a(this);
    this.e.a("seconds", o.b);
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
      Date date = this.a.g();
      this.c.a(date);
    } catch (RemoteAccessException remoteAccessException) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, (Throwable)remoteAccessException);
      this.c.a();
    } 
    try {
      wait(this.g);
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