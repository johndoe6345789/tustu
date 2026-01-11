package com.efiAnalytics.tuningwidgets.panels;

import G.R;
import G.aM;
import G.aN;
import G.aR;
import G.bb;
import G.bc;
import V.a;
import V.g;
import V.j;
import bH.D;
import bH.p;
import bt.bh;
import com.efiAnalytics.ui.bV;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import s.g;

public class ReplayFieldSelectorPanel extends bh implements aN {
  R a = null;
  
  aM b = null;
  
  DefaultListModel c = new DefaultListModel();
  
  JList d = new JList(this.c);
  
  DefaultListModel e = new DefaultListModel();
  
  JList f = new JList(this.e);
  
  String g = "52";
  
  JLabel h = new JLabel(" ");
  
  long i = 0L;
  
  int j = 0;
  
  public ae(R paramR, bc parambc) {
    this.a = paramR;
    this.b = this.a.c(parambc.d());
    this.g = parambc.a();
    this.j = parambc.c();
    setLayout(new BorderLayout(12, 12));
    setBorder(BorderFactory.createTitledBorder(g.b(parambc.M())));
    this.d.addListSelectionListener(new af(this));
    this.f.addListSelectionListener(new ag(this));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout(5, 5));
    JScrollPane jScrollPane1 = new JScrollPane(this.d);
    jScrollPane1.setBorder(BorderFactory.createLoweredBevelBorder());
    jScrollPane1.setPreferredSize(new Dimension(150, 150));
    jPanel1.add("North", new JLabel(g.b("Available Replay Fields"), 0));
    jPanel1.add("Center", jScrollPane1);
    jPanel1.add("West", new JLabel(""));
    add("West", jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout(5, 5));
    JScrollPane jScrollPane2 = new JScrollPane(this.f);
    jScrollPane2.setBorder(BorderFactory.createLoweredBevelBorder());
    jScrollPane2.setPreferredSize(new Dimension(150, 150));
    jPanel2.add("North", new JLabel(g.b("Active Replay Fields"), 0));
    jPanel2.add("Center", jScrollPane2);
    jPanel2.add("East", new JLabel(""));
    add("East", jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout());
    JPanel jPanel4 = new JPanel();
    Dimension dimension = new Dimension(60, 25);
    jPanel4.setLayout(new GridLayout(0, 1, 4, 4));
    jPanel4.add(new JLabel(" "));
    JButton jButton = new JButton(">>");
    jButton.setPreferredSize(dimension);
    jButton.setMnemonic(65);
    jButton.setToolTipText(g.b("Add All"));
    jButton.addActionListener(new ah(this));
    jPanel4.add(jButton);
    jButton = new JButton(">");
    jButton.setPreferredSize(dimension);
    jButton.setMnemonic(160);
    jButton.setToolTipText(g.b("Add selected fields"));
    jButton.addActionListener(new ai(this));
    jPanel4.add(jButton);
    jButton = new JButton("<");
    jButton.setPreferredSize(dimension);
    jButton.setMnemonic(153);
    jButton.setToolTipText(g.b("Remove selected fields"));
    jButton.addActionListener(new aj(this));
    jPanel4.add(jButton);
    jButton = new JButton("<<");
    jButton.setPreferredSize(dimension);
    jButton.setToolTipText(g.b("Remove All"));
    jButton.setMnemonic(82);
    jButton.addActionListener(new ak(this));
    jPanel4.add(jButton);
    add("Center", jPanel4);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new GridLayout(0, 1));
    add("South", jPanel5);
    try {
      aR.a().a(this.a.c(), this.b.aL(), this);
    } catch (a a) {
      Logger.getLogger(ReplayFieldSelectorPanel.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
    } 
    c();
  }
  
  public void c() {
    this.c.clear();
    this.e.clear();
    try {
      ArrayList arrayList = g();
      for (bb bb : this.a.t()) {
        if (b(bb.aJ())) {
          am am = new am(this, bb);
          if (am.a(arrayList)) {
            this.e.addElement(am);
            continue;
          } 
          this.c.addElement(am);
        } 
      } 
    } catch (g g) {
      D.a("Settings Error!", (Exception)g, this);
    } catch (Exception exception) {
      D.a("An error occured opening the DataLogField Selector.\nThis is most likely caused by a settings error.\nCheck the log file during project opening for errors.", exception, this);
    } 
  }
  
  private boolean b(String paramString) {
    if (paramString == null || paramString.equals(""))
      return true; 
    try {
      return p.a(paramString, this.a);
    } catch (Exception exception) {
      D.c(exception.getMessage());
      return true;
    } 
  }
  
  public void d() {
    try {
      this.i = System.currentTimeMillis();
      Object[] arrayOfObject = this.d.getSelectedValues();
      for (byte b = 0; b < arrayOfObject.length; b++) {
        if (a((am)arrayOfObject[b]))
          this.e.addElement(arrayOfObject[b]); 
      } 
    } finally {
      h();
      c();
    } 
  }
  
  public void e() {
    try {
      this.i = System.currentTimeMillis();
      Object[] arrayOfObject = this.c.toArray();
      for (byte b = 0; b < arrayOfObject.length; b++) {
        if (a((am)arrayOfObject[b]))
          this.e.addElement(arrayOfObject[b]); 
      } 
    } finally {
      h();
      c();
    } 
  }
  
  public void f() {
    int[] arrayOfInt = this.f.getSelectedIndices();
    this.i = System.currentTimeMillis();
    if (arrayOfInt == null)
      return; 
    for (int i = arrayOfInt.length - 1; i >= 0; i--)
      this.e.remove(arrayOfInt[i]); 
    h();
    c();
  }
  
  public void removeAll() {
    this.e.clear();
    this.i = System.currentTimeMillis();
    h();
    c();
  }
  
  public ArrayList g() {
    ArrayList<bb> arrayList = new ArrayList();
    String[] arrayOfString = this.a.v();
    double[][] arrayOfDouble = this.b.i(this.a.h());
    for (byte b = 0; b < arrayOfString.length; b++) {
      bb bb = this.a.h(arrayOfString[b]);
      for (byte b1 = 0; b1 < this.b.b(); b1++) {
        if (arrayOfDouble[b1][0] == bb.y() && !arrayList.contains(bb))
          arrayList.add(bb); 
      } 
    } 
    return arrayList;
  }
  
  private void b(am paramam) {
    if (paramam == null)
      return; 
    String str = paramam.toString() + " - ";
    bb bb = paramam.a();
    str = str + bb.aL();
    this.h.setText(str);
  }
  
  public boolean a(am paramam) {
    return true;
  }
  
  public void h() {
    try {
      ArrayList<bb> arrayList = i();
      if (arrayList.size() > this.b.b())
        bV.d("A maximum of " + this.b.b() + " Output Channels can be logged.\nYour current selection of fields requires " + arrayList.size() + " Output Channels\nOnly the fields based on the first " + this.b.b() + " OutputChannels will be added.", (Component)this); 
      int i = (int)p.b(this.g, this.a);
      int j = 0;
      Iterator<bb> iterator = arrayList.iterator();
      while (iterator.hasNext()) {
        j += ((bb)iterator.next()).l();
        if (j > i) {
          iterator.remove();
          if (!iterator.hasNext())
            bV.d("The selected Data Log fields require " + j + " bytes\nThe selected Log Data Block size only supports " + i + " bytes\nThe fields that do not fit have been removed.\nTo log the removed fields, others must be removed.", (Component)this); 
        } 
      } 
      double[][] arrayOfDouble = this.b.i(this.a.h());
      for (byte b = 0; b < arrayOfDouble.length; b++) {
        if (b < arrayList.size()) {
          bb bb = arrayList.get(b);
          arrayOfDouble[b][0] = bb.y();
        } else {
          arrayOfDouble[b][0] = this.j;
        } 
      } 
      this.b.a(this.a.h(), arrayOfDouble);
    } catch (j j) {
      D.a("Unable to save selected fields. Invalid offset and length values.", (Exception)j, this);
    } catch (g g) {
      D.a("Unable to save selected fields.", (Exception)g, this);
    } 
  }
  
  private boolean a(ArrayList paramArrayList, bb parambb) {
    for (bb bb1 : paramArrayList) {
      if (bb1.y() == parambb.y() && bb1.l() == parambb.l())
        return true; 
    } 
    return false;
  }
  
  private ArrayList i() {
    ArrayList<bb> arrayList = new ArrayList();
    for (byte b1 = 0; b1 < this.e.getSize(); b1++) {
      am am = this.e.get(b1);
      bb bb = am.a();
      if (!bb.aL().equals("time") && !a(arrayList, bb))
        arrayList.add(bb); 
    } 
    for (byte b2 = 0; b2 < arrayList.size(); b2++) {
      for (int i = b2 + 1; i < arrayList.size(); i++) {
        bb bb1 = arrayList.get(b2);
        bb bb2 = arrayList.get(i);
        if (bb1.y() > bb2.y()) {
          arrayList.set(b2, bb2);
          arrayList.set(i, bb1);
        } 
      } 
    } 
    return arrayList;
  }
  
  public void a(String paramString1, String paramString2) {
    long l = System.currentTimeMillis() - this.i;
    if (l > 500L) {
      this.i = System.currentTimeMillis();
      al al = new al(this);
      al.start();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/ae.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */