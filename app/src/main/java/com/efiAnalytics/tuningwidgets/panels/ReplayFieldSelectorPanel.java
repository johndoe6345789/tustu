package com.efiAnalytics.tuningwidgets.panels;

import G.GComponentBb;
import G.GComponentBc;
import G.GInterfaceAn;
import G.Manager;
import G.ManagerUsingConcurrentHashMap;
import G.R;
import V.ExceptionExtensionGetmessage;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import bH.D;
import bH.p;
import bt.ExceptionEqualsinaipackage;
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
import s.ExceptionPrintstacktrace;

public class ReplayFieldSelectorPanel extends ExceptionEqualsinaipackage implements GInterfaceAn {
  R ExceptionInVPackage = null;

  Manager b = null;

  DefaultListModel c = new DefaultListModel();

  JList d = new JList(this.c);

  DefaultListModel e = new DefaultListModel();

  JList f = new JList(this.e);

  String ExceptionPrintstacktrace = "52";

  JLabel h = new JLabel(" ");

  long i = 0L;

  int ExceptionExtensionGetmessage = 0;

  public ReplayFieldSelectorPanel(R paramR, GComponentBc parambc) {
    this.ExceptionInVPackage = paramR;
    this.b = this.ExceptionInVPackage.c(parambc.d());
    this.ExceptionPrintstacktrace = parambc.ExceptionInVPackage();
    this.ExceptionExtensionGetmessage = parambc.c();
    setLayout(new BorderLayout(12, 12));
    setBorder(BorderFactory.createTitledBorder(ExceptionPrintstacktrace.b(parambc.M())));
    this.d.addListSelectionListener(new af(this));
    this.f.addListSelectionListener(new ag(this));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout(5, 5));
    JScrollPane jScrollPane1 = new JScrollPane(this.d);
    jScrollPane1.setBorder(BorderFactory.createLoweredBevelBorder());
    jScrollPane1.setPreferredSize(new Dimension(150, 150));
    jPanel1.add("North", new JLabel(ExceptionPrintstacktrace.b("Available Replay Fields"), 0));
    jPanel1.add("Center", jScrollPane1);
    jPanel1.add("West", new JLabel(""));
    add("West", jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout(5, 5));
    JScrollPane jScrollPane2 = new JScrollPane(this.f);
    jScrollPane2.setBorder(BorderFactory.createLoweredBevelBorder());
    jScrollPane2.setPreferredSize(new Dimension(150, 150));
    jPanel2.add("North", new JLabel(ExceptionPrintstacktrace.b("Active Replay Fields"), 0));
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
    jButton.setToolTipText(ExceptionPrintstacktrace.b("Add All"));
    jButton.addActionListener(new ah(this));
    jPanel4.add(jButton);
    jButton = new JButton(">");
    jButton.setPreferredSize(dimension);
    jButton.setMnemonic(160);
    jButton.setToolTipText(ExceptionPrintstacktrace.b("Add selected fields"));
    jButton.addActionListener(new ai(this));
    jPanel4.add(jButton);
    jButton = new JButton("<");
    jButton.setPreferredSize(dimension);
    jButton.setMnemonic(153);
    jButton.setToolTipText(ExceptionPrintstacktrace.b("Remove selected fields"));
    jButton.addActionListener(new aj(this));
    jPanel4.add(jButton);
    jButton = new JButton("<<");
    jButton.setPreferredSize(dimension);
    jButton.setToolTipText(ExceptionPrintstacktrace.b("Remove All"));
    jButton.setMnemonic(82);
    jButton.addActionListener(new ak(this));
    jPanel4.add(jButton);
    add("Center", jPanel4);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new GridLayout(0, 1));
    add("South", jPanel5);
    try {
      ManagerUsingConcurrentHashMap.ExceptionInVPackage()
          .ExceptionInVPackage(this.ExceptionInVPackage.c(), this.b.aL(), this);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(ReplayFieldSelectorPanel.class.getName())
          .log(Level.SEVERE, (String) null, (Throwable) ExceptionInVPackage);
    }
    c();
  }

  public void c() {
    this.c.clear();
    this.e.clear();
    try {
      ArrayList arrayList = ExceptionPrintstacktrace();
      for (GComponentBb GComponentBb : this.ExceptionInVPackage.t()) {
        if (b(GComponentBb.aJ())) {
          am am = new am(this, GComponentBb);
          if (am.ExceptionInVPackage(arrayList)) {
            this.e.addElement(am);
            continue;
          }
          this.c.addElement(am);
        }
      }
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage("Settings Error!", (Exception) ExceptionPrintstacktrace, this);
    } catch (Exception exception) {
      D.ExceptionInVPackage(
          "An error occured opening the DataLogField Selector.\n"
              + "This is most likely caused by ExceptionInVPackage settings error.\n"
              + "Check the log file during project opening for errors.",
          exception,
          this);
    }
  }

  private boolean b(String paramString) {
    if (paramString == null || paramString.equals("")) return true;
    try {
      return p.ExceptionInVPackage(paramString, this.ExceptionInVPackage);
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
        if (ExceptionInVPackage((am) arrayOfObject[b])) this.e.addElement(arrayOfObject[b]);
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
        if (ExceptionInVPackage((am) arrayOfObject[b])) this.e.addElement(arrayOfObject[b]);
      }
    } finally {
      h();
      c();
    }
  }

  public void f() {
    int[] arrayOfInt = this.f.getSelectedIndices();
    this.i = System.currentTimeMillis();
    if (arrayOfInt == null) return;
    for (int i = arrayOfInt.length - 1; i >= 0; i--) this.e.remove(arrayOfInt[i]);
    h();
    c();
  }

  public void removeAll() {
    this.e.clear();
    this.i = System.currentTimeMillis();
    h();
    c();
  }

  public ArrayList ExceptionPrintstacktrace() {
    ArrayList<GComponentBb> arrayList = new ArrayList();
    String[] arrayOfString = this.ExceptionInVPackage.v();
    double[][] arrayOfDouble = this.b.i(this.ExceptionInVPackage.h());
    for (byte b = 0; b < arrayOfString.length; b++) {
      GComponentBb GComponentBb = this.ExceptionInVPackage.h(arrayOfString[b]);
      for (byte b1 = 0; b1 < this.b.b(); b1++) {
        if (arrayOfDouble[b1][0] == GComponentBb.y() && !arrayList.contains(GComponentBb))
          arrayList.add(GComponentBb);
      }
    }
    return arrayList;
  }

  private void b(am paramam) {
    if (paramam == null) return;
    String str = paramam.toString() + " - ";
    GComponentBb GComponentBb = paramam.ExceptionInVPackage();
    str = str + GComponentBb.aL();
    this.h.setText(str);
  }

  public boolean ExceptionInVPackage(am paramam) {
    return true;
  }

  public void h() {
    try {
      ArrayList<GComponentBb> arrayList = i();
      if (arrayList.size() > this.b.b())
        bV.d(
            "A maximum of "
                + this.b.b()
                + " Output Channels can be logged.\nYour current selection of fields requires "
                + arrayList.size()
                + " Output Channels\nOnly the fields based on the first "
                + this.b.b()
                + " OutputChannels will be added.",
            (Component) this);
      int i = (int) p.b(this.ExceptionPrintstacktrace, this.ExceptionInVPackage);
      int ExceptionExtensionGetmessage = 0;
      Iterator<GComponentBb> iterator = arrayList.iterator();
      while (iterator.hasNext()) {
        ExceptionExtensionGetmessage += ((GComponentBb) iterator.next()).l();
        if (ExceptionExtensionGetmessage > i) {
          iterator.remove();
          if (!iterator.hasNext())
            bV.d(
                "The selected Data Log fields require "
                    + ExceptionExtensionGetmessage
                    + " bytes\nThe selected Log Data Block size only supports "
                    + i
                    + " bytes\n"
                    + "The fields that do not fit have been removed.\n"
                    + "To log the removed fields, others must be removed.",
                (Component) this);
        }
      }
      double[][] arrayOfDouble = this.b.i(this.ExceptionInVPackage.h());
      for (byte b = 0; b < arrayOfDouble.length; b++) {
        if (b < arrayList.size()) {
          GComponentBb GComponentBb = arrayList.get(b);
          arrayOfDouble[b][0] = GComponentBb.y();
        } else {
          arrayOfDouble[b][0] = this.ExceptionExtensionGetmessage;
        }
      }
      this.b.ExceptionInVPackage(this.ExceptionInVPackage.h(), arrayOfDouble);
    } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
      D.ExceptionInVPackage(
          "Unable to save selected fields. Invalid offset and length values.",
          (Exception) ExceptionExtensionGetmessage,
          this);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage(
          "Unable to save selected fields.", (Exception) ExceptionPrintstacktrace, this);
    }
  }

  private boolean ExceptionInVPackage(ArrayList paramArrayList, GComponentBb parambb) {
    for (GComponentBb bb1 : paramArrayList) {
      if (bb1.y() == parambb.y() && bb1.l() == parambb.l()) return true;
    }
    return false;
  }

  private ArrayList i() {
    ArrayList<GComponentBb> arrayList = new ArrayList();
    for (byte b1 = 0; b1 < this.e.getSize(); b1++) {
      am am = this.e.get(b1);
      GComponentBb GComponentBb = am.ExceptionInVPackage();
      if (!GComponentBb.aL().equals("time") && !ExceptionInVPackage(arrayList, GComponentBb))
        arrayList.add(GComponentBb);
    }
    for (byte b2 = 0; b2 < arrayList.size(); b2++) {
      for (int i = b2 + 1; i < arrayList.size(); i++) {
        GComponentBb bb1 = arrayList.get(b2);
        GComponentBb bb2 = arrayList.get(i);
        if (bb1.y() > bb2.y()) {
          arrayList.set(b2, bb2);
          arrayList.set(i, bb1);
        }
      }
    }
    return arrayList;
  }

  public void ExceptionInVPackage(String paramString1, String paramString2) {
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
