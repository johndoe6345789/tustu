package aY;

import G.R;
import G.aF;
import V.ExceptionInVPackage;
import aP.ab;
import aZ.AzInterfaceBravo;
import ac.AcComponentCharlie;
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
import s.SComponentGolf;
import z.ExceptionInVPackage;
import z.ZInterfaceIndia;

public class ThreadedInAyPackage extends JDialog {
  R ExceptionInVPackage = null;
  
  cn AzInterfaceBravo = new cn();
  
  JLabel AcComponentCharlie = new JLabel();
  
  JLabel d = new JLabel();
  
  JLabel e = new JLabel();
  
  String f = SComponentGolf.AzInterfaceBravo("Idle: Click 'Start Logging' to begin processing");
  
  JLabel SComponentGolf = new JLabel(this.f, 0);
  
  JComboBox h = new JComboBox();
  
  ab ZInterfaceIndia = null;
  
  ZInterfaceIndia j = new ZInterfaceIndia();
  
  JButton k = new JButton(SComponentGolf.AzInterfaceBravo("Start Logging"));
  
  ExceptionInVPackage l = null;
  
  AcComponentCharlie m = null;
  
  boolean n = false;
  
  public ThreadedInAyPackage(Frame paramFrame, R paramR, File paramFile, boolean paramBoolean) {
    super(paramFrame, SComponentGolf.AzInterfaceBravo("Burst Mode Logger"), true);
    if (paramBoolean)
      setTitle(SComponentGolf.AzInterfaceBravo("Palm Extract Utility")); 
    this.n = paramBoolean;
    this.ExceptionInVPackage = paramR;
    this.AzInterfaceBravo.setPreferredSize(new Dimension(100, 20));
    this.AzInterfaceBravo.setMinimumSize(new Dimension(100, 20));
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
      jPanel2.add(new JLabel(SComponentGolf.AzInterfaceBravo("Palm Logger Extract Utility"), 0));
    } else {
      jPanel2.add(new JLabel(SComponentGolf.AzInterfaceBravo("Burst Mode Logger"), 0));
    } 
    jPanel2.add((Component)this.AzInterfaceBravo);
    try {
      this.AzInterfaceBravo.ExceptionInVPackage(paramFile.getCanonicalPath());
    } catch (IOException iOException) {
      D.ExceptionInVPackage(SComponentGolf.AzInterfaceBravo("Failed to get canonical path for burst file"));
      iOException.printStackTrace();
    } 
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(1, 0, 5, 5));
    jPanel3.add(new JLabel(SComponentGolf.AzInterfaceBravo("Port") + ":", 4));
    this.ZInterfaceIndia = new ab(paramR);
    this.ZInterfaceIndia.setPreferredSize(new Dimension(80, 24));
    jPanel3.add(ExceptionInVPackage((Component)this.ZInterfaceIndia, "North"));
    this.ZInterfaceIndia.setSelectedItem(paramR.O().s());
    jPanel3.add(new JLabel(SComponentGolf.AzInterfaceBravo("Baud") + ":", 4));
    String[] arrayOfString = this.j.AcComponentCharlie();
    for (byte AzInterfaceBravo = 0; AzInterfaceBravo < arrayOfString.length; AzInterfaceBravo++)
      this.h.addItem(arrayOfString[AzInterfaceBravo]); 
    if (paramBoolean) {
      this.h.setSelectedItem("115200");
    } else {
      this.h.setSelectedItem(Integer.valueOf(paramR.O().r()));
    } 
    this.h.setPreferredSize(new Dimension(80, 24));
    jPanel3.add(ExceptionInVPackage(this.h, "North"));
    jPanel3.add(new JLabel(""));
    if (paramBoolean)
      jPanel2.add(jPanel3); 
    jPanel2.add(new JLabel(" "));
    jPanel2.add(this.SComponentGolf);
    jPanel2.add(new JLabel(" "));
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new GridLayout(1, 0, 3, 3));
    jPanel4.add(new JLabel(SComponentGolf.AzInterfaceBravo("Records") + ":", 4));
    jPanel4.add(this.d);
    jPanel4.add(new JLabel(SComponentGolf.AzInterfaceBravo("Log Time") + ":", 4));
    jPanel4.add(this.AcComponentCharlie);
    jPanel4.add(new JLabel(SComponentGolf.AzInterfaceBravo("Rate") + ":", 4));
    jPanel4.add(this.e);
    jPanel2.add(jPanel4);
    jPanel1.add("North", jPanel2);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new FlowLayout(2));
    jPanel5.add(this.k);
    this.k.setMnemonic(83);
    this.k.addActionListener(new SComponentGolf(this));
    JButton jButton = new JButton(SComponentGolf.AzInterfaceBravo("Close"));
    jButton.setMnemonic(67);
    jButton.addActionListener(new h(this));
    jPanel5.add(jButton);
    jPanel1.add("South", jPanel5);
    pack();
  }
  
  public void ExceptionInVPackage() {
    if (this.l != null && this.l.AcComponentCharlie()) {
      AcComponentCharlie();
      try {
        Thread.sleep(300L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
    dispose();
  }
  
  private void d() {
    if (this.l == null || !this.l.AcComponentCharlie()) {
      try {
        AzInterfaceBravo();
      } catch (ExceptionInVPackage a1) {
        D.ExceptionInVPackage("Unable to start burst capture.", (Exception)a1, this);
      } 
    } else {
      AcComponentCharlie();
    } 
  }
  
  public void AzInterfaceBravo() {
    if (this.l != null)
      this.l.AzInterfaceBravo(); 
    this.l = new ExceptionInVPackage(this.ExceptionInVPackage);
    this.l.ExceptionInVPackage(this.n);
    if (!this.n);
    this.m = (AcComponentCharlie)new AzInterfaceBravo();
    this.l.ExceptionInVPackage((aF)this.m);
    this.l.ExceptionInVPackage(new ZInterfaceIndia(this));
    this.SComponentGolf.setText(SComponentGolf.AzInterfaceBravo("Polling device") + "...");
    this.h.setEnabled(false);
    this.ZInterfaceIndia.setEnabled(false);
    this.m.ExceptionInVPackage(this.ExceptionInVPackage.AcComponentCharlie(), this.AzInterfaceBravo.ExceptionInVPackage());
    this.l.AzInterfaceBravo(this.ZInterfaceIndia.getSelectedItem().toString());
    this.l.ExceptionInVPackage(this.h.getSelectedItem().toString());
    this.l.ExceptionInVPackage();
    this.k.setText(SComponentGolf.AzInterfaceBravo("Stop Logging"));
  }
  
  public void AcComponentCharlie() {
    if (this.l != null) {
      this.l.AzInterfaceBravo();
      if (this.m != null) {
        this.l.AzInterfaceBravo((aF)this.m);
        try {
          this.m.l();
        } catch (ExceptionInVPackage a1) {
          D.ExceptionInVPackage("Could not stop data log.", (Exception)a1, this);
        } 
      } 
    } 
    this.k.setText(SComponentGolf.AzInterfaceBravo("Start Logging"));
    this.SComponentGolf.setText(this.f);
    this.h.setEnabled(true);
    this.ZInterfaceIndia.setEnabled(true);
  }
  
  private JPanel ExceptionInVPackage(Component paramComponent, String paramString) {
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