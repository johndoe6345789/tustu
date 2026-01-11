package com.efiAnalytics.tuningwidgets.panels;

import G.B;
import G.R;
import G.aH;
import G.aI;
import G.aM;
import G.aN;
import G.aR;
import G.ac;
import G.ag;
import G.al;
import G.bR;
import G.dj;
import G.i;
import V.a;
import V.g;
import V.j;
import bH.D;
import bH.p;
import bt.bh;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
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

public class n extends bh implements aN, bc {
  R a = null;
  
  aM b = null;
  
  aM c = null;
  
  DefaultListModel d = new DefaultListModel();
  
  JList e = new JList(this.d);
  
  DefaultListModel f = new DefaultListModel();
  
  JList g = new JList(this.f);
  
  dj h = (dj)new B(55.0D);
  
  JLabel i = new JLabel(" ");
  
  JLabel j = new JLabel(" ");
  
  JLabel k = new JLabel(" ");
  
  long l = 0L;
  
  int m = 0;
  
  public n(R paramR, ag paramag) {
    this.a = paramR;
    this.b = this.a.c(paramag.a());
    this.c = this.a.c(paramag.b());
    this.h = paramag.c();
    if (this.h instanceof bR) {
      String[] arrayOfString = i.h(((bR)this.h).c(), (aI)paramR);
      try {
        i.a(paramR, ((bR)this.h).c(), new o(this));
      } catch (a a) {
        Logger.getLogger(n.class.getName()).log(Level.WARNING, "Failed to subscribe listener to log record size limit expression", (Throwable)a);
      } 
    } 
    this.m = paramag.d();
    setLayout(new BorderLayout(12, 12));
    setBorder(BorderFactory.createTitledBorder(g.b(paramag.M())));
    this.e.addListSelectionListener(new r(this));
    this.g.addListSelectionListener(new s(this));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout(5, 5));
    JScrollPane jScrollPane1 = new JScrollPane(this.e);
    jScrollPane1.setBorder(BorderFactory.createLoweredBevelBorder());
    jScrollPane1.setPreferredSize(new Dimension(150, 150));
    jPanel1.add("North", new JLabel(g.b("Available Datalog Fields"), 0));
    jPanel1.add("Center", jScrollPane1);
    jPanel1.add("West", new JLabel(""));
    add("West", jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout(5, 5));
    JScrollPane jScrollPane2 = new JScrollPane(this.g);
    jScrollPane2.setBorder(BorderFactory.createLoweredBevelBorder());
    jScrollPane2.setPreferredSize(new Dimension(150, 150));
    jPanel2.add("North", new JLabel(g.b("Selected Datalog Fields"), 0));
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
    jButton.addActionListener(new t(this));
    jPanel4.add(jButton);
    jButton = new JButton(">");
    jButton.setPreferredSize(dimension);
    jButton.setMnemonic(160);
    jButton.setToolTipText(g.b("Add selected fields"));
    jButton.addActionListener(new u(this));
    jPanel4.add(jButton);
    jButton = new JButton("<");
    jButton.setPreferredSize(dimension);
    jButton.setMnemonic(153);
    jButton.setToolTipText(g.b("Remove selected fields"));
    jButton.addActionListener(new v(this));
    jPanel4.add(jButton);
    jButton = new JButton("<<");
    jButton.setPreferredSize(dimension);
    jButton.setToolTipText(g.b("Remove All"));
    jButton.setMnemonic(82);
    jButton.addActionListener(new w(this));
    jPanel4.add(jButton);
    add("Center", jPanel4);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new GridLayout(0, 1));
    jPanel5.add(new JLabel(g.b("Required Output Channels") + ":"));
    jPanel5.add(this.i);
    JPanel jPanel6 = new JPanel();
    jPanel6.setLayout(new GridLayout(1, 0));
    jPanel5.add(jPanel6);
    jPanel6.add(this.j);
    jPanel6.add(this.k);
    add("South", jPanel5);
    try {
      aR.a().a(this.a.c(), this.b.aL(), this);
    } catch (a a) {
      Logger.getLogger(n.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
    } 
    c();
  }
  
  public void c() {
    long l = System.currentTimeMillis();
    ArrayList<z> arrayList1 = new ArrayList();
    ArrayList<z> arrayList2 = new ArrayList();
    try {
      ArrayList arrayList = g();
      for (ac ac : this.a.g()) {
        if (b(ac.aJ())) {
          aH aH = this.a.g(ac.a());
          if (aH.b().equals("bits"))
            aH = i.a(this.a, aH.a()); 
          ArrayList arrayList3 = i.a((aI)this.a, aH);
          z z = new z(this, ac, arrayList3);
          z.a((aH != null && aH.b().equals("formula")));
          if (!ac.a().equals("dataLogTime") && (arrayList3.isEmpty() || aH.w())) {
            D.c("skipping: " + ac.b());
            continue;
          } 
          if (z.a(arrayList) || ac.a().equals("dataLogTime") || ac.a().equals("engine")) {
            arrayList2.add(z);
            continue;
          } 
          arrayList1.add(z);
        } 
      } 
      for (al al : this.a.f()) {
        ArrayList<al> arrayList3 = new ArrayList();
        arrayList3.add(al);
        z z = new z(this, al, arrayList3);
        if (z.a(arrayList)) {
          arrayList2.add(z);
          continue;
        } 
        arrayList1.add(z);
      } 
    } catch (g g) {
      D.a("Settings Error!", (Exception)g, this);
    } catch (Exception exception) {
      D.a("An error occured opening the DataLogField Selector.\nThis is most likely caused by a settings error.\nCheck the log file during project opening for errors.", exception, this);
    } 
    x x = new x(this);
    Collections.sort(arrayList1, x);
    Collections.sort(arrayList2, x);
    this.d.clear();
    this.f.clear();
    for (z z : arrayList1)
      this.d.addElement(z); 
    for (z z : arrayList2)
      this.f.addElement(z); 
    D.c("Time in updateSelections():" + (System.currentTimeMillis() - l) + "ms.");
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
      this.l = System.currentTimeMillis();
      List list = this.e.getSelectedValuesList();
      for (z z : list) {
        if (a(z))
          this.f.addElement(z); 
      } 
    } finally {
      i();
      c();
    } 
  }
  
  public void e() {
    try {
      this.l = System.currentTimeMillis();
      Object[] arrayOfObject = this.d.toArray();
      for (byte b = 0; b < arrayOfObject.length; b++) {
        if (a((z)arrayOfObject[b]))
          this.f.addElement((z)arrayOfObject[b]); 
      } 
    } finally {
      i();
      c();
    } 
  }
  
  public void f() {
    int[] arrayOfInt = this.g.getSelectedIndices();
    this.l = System.currentTimeMillis();
    if (arrayOfInt == null)
      return; 
    if (arrayOfInt.length == 1 && ((z)this.g.getModel().getElementAt(arrayOfInt[0])).b == null) {
      z z = this.g.getModel().getElementAt(arrayOfInt[0]);
      aH aH = this.a.g(z.a.a());
      ArrayList arrayList = z.a();
      List list = a(arrayList);
      if (aH != null && aH.b().equals("formula")) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(g.b("This field requires no SD record space because it is generated from fields that are already logged")).append(".\n").append(g.b("This field will be removed if any of the following are removed")).append(":\n");
        for (z z1 : list) {
          if (!z1.equals(z) && !z1.b())
            stringBuilder.append("\t").append(z1.toString()).append("\n"); 
        } 
        stringBuilder.append("\n");
        stringBuilder.append(g.b("Do you want to remove all the listed Fields?"));
        if (!bV.a(stringBuilder.toString(), (Component)this, true))
          return; 
      } else if (list.size() > 1) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(g.b("Other selected fields are dependent on this field")).append(".\n").append(g.b("If this is removed, those fields will also be removed")).append(".\n").append(g.b("Removing")).append(": \n\t").append(z.toString()).append("\n").append(g.b("Also to be removed")).append(": \n");
        for (z z1 : list) {
          if (!z1.equals(z))
            stringBuilder.append("\t").append(z1.toString()).append("\n"); 
        } 
        stringBuilder.append("\n");
        stringBuilder.append(g.b("Are you sure you want to remove all the listed Fields?"));
        if (!bV.a(stringBuilder.toString(), (Component)this, true))
          return; 
      } 
      for (z z1 : list)
        b(z1); 
    } else {
      this.g.clearSelection();
      for (int i = arrayOfInt.length - 1; i >= 0; i--)
        this.f.remove(arrayOfInt[i]); 
    } 
    i();
    c();
  }
  
  private void b(z paramz) {
    for (byte b = 0; b < this.f.getSize(); b++) {
      if (((z)this.f.getElementAt(b)).equals(paramz)) {
        this.f.remove(b);
        return;
      } 
    } 
  }
  
  private List a(List paramList) {
    ArrayList<z> arrayList = new ArrayList();
    for (byte b = 0; b < this.g.getModel().getSize(); b++) {
      z z = this.g.getModel().getElementAt(b);
      if (z.b(paramList))
        arrayList.add(z); 
    } 
    return arrayList;
  }
  
  public void removeAll() {
    this.f.clear();
    this.l = System.currentTimeMillis();
    i();
    c();
  }
  
  public ArrayList g() {
    ArrayList<aH> arrayList = new ArrayList();
    String[] arrayOfString = this.a.s();
    double[][] arrayOfDouble = this.b.i(this.a.h());
    for (byte b = 0; b < arrayOfString.length; b++) {
      aH aH = this.a.g(arrayOfString[b]);
      for (byte b1 = 0; b1 < this.b.b(); b1++) {
        if (!aH.b().equals("formula") && arrayOfDouble[b1][0] == aH.a() && !arrayList.contains(aH))
          arrayList.add(aH); 
      } 
    } 
    for (al al : this.a.f()) {
      for (byte b1 = 0; b1 < this.b.b(); b1++) {
        if (arrayOfDouble[b1][0] == al.a() && !arrayList.contains(al))
          arrayList.add(al); 
      } 
    } 
    return arrayList;
  }
  
  private void a(z paramz, boolean paramBoolean) {
    if (paramz == null)
      return; 
    try {
      aH aH;
      String str = paramz.toString() + " - ";
      ArrayList<aH> arrayList = paramz.a();
      if (paramz.b != null) {
        al al = paramz.b;
      } else {
        aH = this.a.g(paramz.a.a());
      } 
      ArrayList arrayList1 = g();
      int i = 0;
      int j = 0;
      int k;
      for (k = 0; k < arrayList.size(); k++) {
        str = str + ((aH)arrayList.get(k)).aL();
        if (k < arrayList.size() - 1)
          str = str + ", "; 
        if (!arrayList1.contains(arrayList.get(k)))
          i += ((aH)arrayList.get(k)).l(); 
        j += ((aH)arrayList.get(k)).l();
      } 
      if (i == 0 || (aH != null && aH.b().equals("formula"))) {
        this.i.setText(str);
      } else {
        this.i.setText(str);
      } 
      if (!paramBoolean) {
        this.j.setText(g.b("Record Bytes Required") + ": " + i);
      } else if (aH != null && aH.b().equals("formula")) {
        this.j.setText(g.b("0 Bytes.") + " " + g.b("Underlying Channels") + ": " + j);
      } else {
        this.j.setText(g.b("Record Bytes Used") + ": " + aH.l());
      } 
      k = j();
      int m = (int)this.h.a();
      this.k.setText(g.b("Available Bytes") + ": " + (m - k) + " " + g.b("of") + " " + m);
    } catch (g g) {
      g.printStackTrace();
    } 
  }
  
  protected boolean h() {
    ArrayList arrayList = q();
    ArrayList<aH> arrayList1 = new ArrayList();
    int i = (int)this.h.a();
    int j = 0;
    for (aH aH : arrayList) {
      j += aH.l();
      if (j > i)
        arrayList1.add(aH); 
    } 
    if (arrayList1.isEmpty())
      return true; 
    List list = a(arrayList1);
    String str = g.b("This change will not allow all of your selected fields to be logged.") + "\n" + g.b("The following fields will be removed") + ":\n";
    for (z z : list)
      str = str + z.toString() + "\n"; 
    str = str + "\n" + g.b("Are you sure you wish to continue?");
    if (bV.a(str, (Component)this, true)) {
      for (z z : list)
        b(z); 
      i();
      c();
      return false;
    } 
    try {
      this.a.h().c();
    } catch (g g) {
      Logger.getLogger(n.class.getName()).log(Level.WARNING, "Failed to undo log size constraint.", (Throwable)g);
    } 
    return true;
  }
  
  protected boolean a(z paramz) {
    if (paramz.b != null)
      return true; 
    ArrayList arrayList1 = q();
    ArrayList arrayList2 = new ArrayList(paramz.a());
    arrayList2.addAll(arrayList1);
    if (arrayList2.size() > this.b.b())
      throw new a("A maximum of " + this.b.b() + " Output Channels can be logged.\nYour current selection of fields requires more \nOutput Channels than supported by the firmware."); 
    int i = (int)this.h.a();
    int j = 0;
    Iterator<aH> iterator = arrayList2.iterator();
    while (iterator.hasNext()) {
      j += ((aH)iterator.next()).l();
      if (j > i) {
        iterator.remove();
        if (!iterator.hasNext())
          throw new a("The selected Data Log fields require " + j + " bytes\nThe selected Log Data Block size only supports " + i + " bytes\nField(s) not added."); 
      } 
    } 
    return true;
  }
  
  private int j() {
    int i = 0;
    ArrayList arrayList = q();
    Iterator<aH> iterator = arrayList.iterator();
    while (iterator.hasNext())
      i += ((aH)iterator.next()).l(); 
    return i;
  }
  
  public void i() {
    try {
      ArrayList<aH> arrayList = q();
      if (arrayList.size() > this.b.b())
        bV.d("A maximum of " + this.b.b() + " Output Channels can be logged.\nYour current selection of fields requires " + arrayList.size() + " Output Channels\nOnly the fields based on the first " + this.b.b() + " OutputChannels will be added.", (Component)this); 
      int i = (int)this.h.a();
      int j = 0;
      Iterator<aH> iterator = arrayList.iterator();
      while (iterator.hasNext()) {
        j += ((aH)iterator.next()).l();
        if (j > i) {
          iterator.remove();
          if (!iterator.hasNext())
            bV.d("The selected Data Log fields require " + j + " bytes\nThe selected Log Data Block size only supports " + i + " bytes\nThe fields that do not fit have been removed.\nTo log the removed fields, others must be removed.", (Component)this); 
        } 
      } 
      double[][] arrayOfDouble1 = this.b.i(this.a.h());
      double[][] arrayOfDouble2 = this.c.i(this.a.h());
      String str = "Writing Offsets:\n";
      for (byte b = 0; b < arrayOfDouble1.length; b++) {
        if (b < arrayList.size()) {
          aH aH = arrayList.get(b);
          arrayOfDouble1[b][0] = aH.a();
          arrayOfDouble2[b][0] = aH.l();
          str = str + aH.a() + ", len=" + aH.l() + "\n";
        } else {
          arrayOfDouble1[b][0] = this.m;
          arrayOfDouble2[b][0] = 0.0D;
        } 
      } 
      D.c(str);
      this.b.a(this.a.h(), arrayOfDouble1);
      this.c.a(this.a.h(), arrayOfDouble2);
    } catch (j j) {
      D.a("Unable to save selected fields. Invalid offset and length values.", (Exception)j, this);
    } catch (g g) {
      D.a("Unable to save selected fields.", (Exception)g, this);
    } 
  }
  
  private boolean a(ArrayList paramArrayList, aH paramaH) {
    for (aH aH1 : paramArrayList) {
      if (aH1.a() >= paramaH.a() && aH1.a() + aH1.l() <= paramaH.a() + paramaH.l())
        return true; 
    } 
    return false;
  }
  
  public void close() {
    aR.a().a(this);
    super.close();
  }
  
  private ArrayList q() {
    ArrayList<aH> arrayList = new ArrayList();
    for (byte b1 = 0; b1 < this.f.getSize(); b1++) {
      z z = this.f.get(b1);
      ArrayList arrayList1 = z.a();
      for (aH aH : arrayList1) {
        if (!aH.aL().equals("dataLogTime") && !a(arrayList, aH))
          arrayList.add(aH); 
      } 
    } 
    arrayList = i.a(this.a, arrayList);
    for (byte b2 = 0; b2 < arrayList.size(); b2++) {
      for (int i = b2 + 1; i < arrayList.size(); i++) {
        aH aH1 = arrayList.get(b2);
        aH aH2 = arrayList.get(i);
        if (aH1.a() > aH2.a()) {
          arrayList.set(b2, aH2);
          arrayList.set(i, aH1);
        } 
      } 
    } 
    return arrayList;
  }
  
  public void a(String paramString1, String paramString2) {
    long l = System.currentTimeMillis() - this.l;
    if (l > 500L) {
      this.l = System.currentTimeMillis();
      y y = new y(this);
      q q = new q(this, y);
      q.start();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */