package aY;

import G.R;
import G.aF;
import V.a;
import aP.ab;
import aZ.b;
import ac.c;
import bH.D;
import com.efiAnalytics.ui.cn;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import s.g;
import z.a;
import z.i;

public class f extends JDialog {
  R a = null;
  
  cn b = new cn();
  
  JLabel c = new JLabel();
  
  JLabel d = new JLabel();
  
  JLabel e = new JLabel();
  
  String f = g.b("Idle: Click 'Start Logging' to begin processing");
  
  JLabel g = new JLabel(this.f, 0);
  
  JComboBox h = new JComboBox();
  
  ab i = null;
  
  i j = new i();
  
  JButton k = new JButton(g.b("Start Logging"));
  
  a l = null;
  
  c m = null;
  
  boolean n = false;
  
  public f(Frame paramFrame, R paramR, File paramFile, boolean paramBoolean) {
    super(paramFrame, g.b("Burst Mode Logger"), true);
    if (paramBoolean)
      setTitle(g.b("Palm Extract Utility")); 
    this.n = paramBoolean;
    this.a = paramR;
    this.b.setPreferredSize(new Dimension(100, 20));
    this.b.setMinimumSize(new Dimension(100, 20));
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setBorder(BorderFactory.createTitledBorder(getTitle()));
    jPanel1.setLayout(new BorderLayout());
    add("North", new JLabel(" "));
    add("South", new JLabel(" "));
    add("East", new JLabel("  "));
    add("West", new JLabel("  "));
    add("Center", jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(0, 1, 3, 3));
    if (paramBoolean) {
      jPanel2.add(new JLabel(g.b("Palm Logger Extract Utility"), 0));
    } else {
      jPanel2.add(new JLabel(g.b("Burst Mode Logger"), 0));
    } 
    jPanel2.add((Component)this.b);
    try {
      this.b.a(paramFile.getCanonicalPath());
    } catch (IOException iOException) {
      D.a(g.b("Failed to get canonical path for burst file"));
      iOException.printStackTrace();
    } 
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(1, 0, 5, 5));
    jPanel3.add(new JLabel(g.b("Port") + ":", 4));
    this.i = new ab(paramR);
    this.i.setPreferredSize(new Dimension(80, 24));
    jPanel3.add(a((Component)this.i, "North"));
    this.i.setSelectedItem(paramR.O().s());
    jPanel3.add(new JLabel(g.b("Baud") + ":", 4));
    String[] arrayOfString = this.j.c();
    for (byte b = 0; b < arrayOfString.length; b++)
      this.h.addItem(arrayOfString[b]); 
    if (paramBoolean) {
      this.h.setSelectedItem("115200");
    } else {
      this.h.setSelectedItem(Integer.valueOf(paramR.O().r()));
    } 
    this.h.setPreferredSize(new Dimension(80, 24));
    jPanel3.add(a(this.h, "North"));
    jPanel3.add(new JLabel(""));
    if (paramBoolean)
      jPanel2.add(jPanel3); 
    jPanel2.add(new JLabel(" "));
    jPanel2.add(this.g);
    jPanel2.add(new JLabel(" "));
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new GridLayout(1, 0, 3, 3));
    jPanel4.add(new JLabel(g.b("Records") + ":", 4));
    jPanel4.add(this.d);
    jPanel4.add(new JLabel(g.b("Log Time") + ":", 4));
    jPanel4.add(this.c);
    jPanel4.add(new JLabel(g.b("Rate") + ":", 4));
    jPanel4.add(this.e);
    jPanel2.add(jPanel4);
    jPanel1.add("North", jPanel2);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new FlowLayout(2));
    jPanel5.add(this.k);
    this.k.setMnemonic(83);
    this.k.addActionListener(new g(this));
    JButton jButton = new JButton(g.b("Close"));
    jButton.setMnemonic(67);
    jButton.addActionListener(new h(this));
    jPanel5.add(jButton);
    jPanel1.add("South", jPanel5);
    pack();
  }
  
  public void a() {
    if (this.l != null && this.l.c()) {
      c();
      try {
        Thread.sleep(300L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
    dispose();
  }
  
  private void d() {
    if (this.l == null || !this.l.c()) {
      try {
        b();
      } catch (a a1) {
        D.a("Unable to start burst capture.", (Exception)a1, this);
      } 
    } else {
      c();
    } 
  }
  
  public void b() {
    if (this.l != null)
      this.l.b(); 
    this.l = new a(this.a);
    this.l.a(this.n);
    if (!this.n);
    this.m = (c)new b();
    this.l.a((aF)this.m);
    this.l.a(new i(this));
    this.g.setText(g.b("Polling device") + "...");
    this.h.setEnabled(false);
    this.i.setEnabled(false);
    this.m.a(this.a.c(), this.b.a());
    this.l.b(this.i.getSelectedItem().toString());
    this.l.a(this.h.getSelectedItem().toString());
    this.l.a();
    this.k.setText(g.b("Stop Logging"));
  }
  
  public void c() {
    if (this.l != null) {
      this.l.b();
      if (this.m != null) {
        this.l.b((aF)this.m);
        try {
          this.m.l();
        } catch (a a1) {
          D.a("Could not stop data log.", (Exception)a1, this);
        } 
      } 
    } 
    this.k.setText(g.b("Start Logging"));
    this.g.setText(this.f);
    this.h.setEnabled(true);
    this.i.setEnabled(true);
  }
  
  private JPanel a(Component paramComponent, String paramString) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.add(paramString, paramComponent);
    return jPanel;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aY/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */