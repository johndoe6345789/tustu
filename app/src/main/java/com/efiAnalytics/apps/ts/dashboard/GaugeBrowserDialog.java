package com.efiAnalytics.apps.ts.dashboard;

import bH.D;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.ck;
import com.efiAnalytics.ui.cl;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import r.ThreadedFile;
import t.a;

public class GaugeBrowserDialog extends a {
  List a = new ArrayList();

  JPanel b = new JPanel();

  n c;

  HashMap d = new HashMap<>();

  JPanel e = new JPanel();

  public GaugeBrowserDialog(Window paramWindow, String paramString) {
    super(paramWindow, s.g.b(paramString));
    setLayout(new BorderLayout());
    this.e.setLayout(new BorderLayout());
    this.e.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    add("Center", this.e);
    JScrollPane jScrollPane = new JScrollPane(this.b);
    this.b.setLayout(new GridLayout(0, 3, 5, 5));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.setBorder(BorderFactory.createTitledBorder(s.g.b("Current Gauges")));
    this.e.add("Center", jPanel1);
    jPanel1.add("Center", jScrollPane);
    jScrollPane.setSize(eJ.a(340), eJ.a(240));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(1));
    jPanel2.setBorder(BorderFactory.createTitledBorder(s.g.b("Selected Gauge Preview")));
    this.c = new n(this, eJ.a(185));
    jPanel2.add(this.c);
    jPanel1.add("East", jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout(2));
    JButton jButton1 = new JButton(s.g.b("Other Gauges"));
    jButton1.addActionListener(new h(this));
    jPanel3.add(jButton1);
    JLabel jLabel = new JLabel();
    jLabel.setPreferredSize(eJ.a(50, 20));
    jPanel3.add(jLabel);
    JButton jButton2 = new JButton(s.g.b("Add Gauge"));
    jButton2.addActionListener(new i(this));
    jPanel3.add(jButton2);
    JButton jButton3 = new JButton(s.g.b("Done"));
    jButton3.addActionListener(new ThreadedFile(this));
    jPanel3.add(jButton3);
    this.e.add("South", jPanel3);
    setSize(eJ.a(900), eJ.a(550));
  }

  public GaugeBrowserDialog(Window paramWindow, List paramList, String paramString) {
    this(paramWindow, paramString);
    for (File file : paramList) a(file);
  }

  public void a(File paramFile) {
    File[] arrayOfFile = paramFile.listFiles(new k(this));
    for (byte b = 0; b < arrayOfFile.length; b++) {
      try {
        if (this.d.get(arrayOfFile[b].getName()) == null) {
          n n1 = new n(this, arrayOfFile[b]);
          n1.addMouseListener(new l(this));
          this.b.add(n1);
          this.d.put(arrayOfFile[b].getName(), n1);
        }
      } catch (Exception exception) {
        D.c("Exception adding a gauge to the selection for file: " + arrayOfFile[b]);
      }
    }
  }

  public void a() {
    String[] arrayOfString = {"gauge"};
    String str =
        bV.a(
            (Component) this, getTitle(), arrayOfString, "", ThreadedFile.w(), true, (ck) new cl());
    if (str != null && !str.equals("")) {
      n n1 = new n(this, new File(str));
      n1.addMouseListener(new m(this));
      this.b.add(n1);
      this.b.validate();
      this.c.a(n1.a);
    }
  }

  public void a(a parama) {
    this.a.add(parama);
  }

  private void b(File paramFile) {
    for (a a1 : this.a) a1.a(paramFile);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
