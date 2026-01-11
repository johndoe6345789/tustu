package aq;

import W.j;
import W.n;
import ao.bq;
import ao.hx;
import bH.S;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.et;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class a extends JPanel {
  et a;
  
  public static String b = "logViewerHiddenFieldList";
  
  DefaultListModel c = new DefaultListModel();
  
  JList d = new JList(this.c);
  
  DefaultListModel e = new DefaultListModel();
  
  JList f = new JList(this.e);
  
  List g = null;
  
  List h = null;
  
  JLabel i = new JLabel(" ");
  
  public a(et paramet) {
    this.a = paramet;
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout(eJ.a(10), eJ.a(10)));
    String str = paramet.a(b);
    if (str == null)
      str = ""; 
    this.h = a(str);
    this.g = f();
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout(eJ.a(5), eJ.a(5)));
    JScrollPane jScrollPane1 = new JScrollPane(this.d);
    jPanel2.setBorder(BorderFactory.createTitledBorder("Available Fields"));
    jScrollPane1.setPreferredSize(eJ.a(150, 180));
    jPanel2.add("Center", jScrollPane1);
    jPanel2.add("West", new JLabel(""));
    jPanel1.add("West", jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BorderLayout(eJ.a(5), eJ.a(5)));
    JScrollPane jScrollPane2 = new JScrollPane(this.f);
    jPanel3.setBorder(BorderFactory.createTitledBorder("Displayed Fields"));
    jScrollPane2.setPreferredSize(eJ.a(150, 180));
    jPanel3.add("Center", jScrollPane2);
    jPanel3.add("East", new JLabel(""));
    jPanel1.add("East", jPanel3);
    JPanel jPanel4 = new JPanel();
    Dimension dimension = eJ.a(60, 25);
    jPanel4.setLayout(new GridLayout(0, 1, eJ.a(4), eJ.a(4)));
    jPanel4.add(new JLabel(" "));
    JButton jButton = new JButton(">>");
    jButton.setPreferredSize(dimension);
    jButton.setMnemonic(65);
    jButton.setToolTipText("Add All");
    jButton.addActionListener(new b(this));
    jPanel4.add(jButton);
    jButton = new JButton(">");
    jButton.setPreferredSize(dimension);
    jButton.setMnemonic(160);
    jButton.setToolTipText("Add selected fields");
    jButton.addActionListener(new c(this));
    jPanel4.add(jButton);
    jButton = new JButton("<");
    jButton.setPreferredSize(dimension);
    jButton.setMnemonic(153);
    jButton.setToolTipText("Remove selected fields");
    jButton.addActionListener(new d(this));
    jPanel4.add(jButton);
    jButton = new JButton("<<");
    jButton.setPreferredSize(dimension);
    jButton.setToolTipText("Remove All");
    jButton.setMnemonic(82);
    jButton.addActionListener(new e(this));
    jPanel4.add(jButton);
    jPanel1.add("Center", jPanel4);
    add("Center", jPanel1);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new GridLayout(0, 1));
    add("South", jPanel5);
    a();
  }
  
  private void a() {
    S.b(this.g);
    for (String str : this.g) {
      if (this.h.contains(str)) {
        this.c.addElement(str);
        continue;
      } 
      this.e.addElement(str);
    } 
  }
  
  private void b() {
    List list1 = this.d.getSelectedValuesList();
    List list2 = this.f.getSelectedValuesList();
    for (String str : list1) {
      if (!list2.contains(str))
        this.e.addElement(str); 
      this.c.removeElement(str);
    } 
  }
  
  private void c() {
    List list1 = this.d.getSelectedValuesList();
    List list2 = this.f.getSelectedValuesList();
    for (String str : list2) {
      if (!list1.contains(str))
        this.c.addElement(str); 
      this.e.removeElement(str);
    } 
  }
  
  private void d() {
    List list = this.f.getSelectedValuesList();
    for (String str : this.g) {
      if (!list.contains(str))
        this.e.addElement(str); 
    } 
    this.c.removeAllElements();
  }
  
  private void e() {
    List list = this.d.getSelectedValuesList();
    for (String str : this.g) {
      if (!list.contains(str))
        this.c.addElement(str); 
    } 
    this.e.removeAllElements();
  }
  
  private List f() {
    ArrayList<String> arrayList = new ArrayList();
    n n = hx.a().r();
    if (n != null)
      for (j j : n)
        arrayList.add(j.a());  
    return arrayList;
  }
  
  public static List a(String paramString) {
    ArrayList<String> arrayList = new ArrayList();
    StringTokenizer stringTokenizer = new StringTokenizer(paramString, ",");
    while (stringTokenizer.hasMoreTokens())
      arrayList.add(stringTokenizer.nextToken().trim()); 
    return arrayList;
  }
  
  private String a(List<String> paramList) {
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b = 0; b < paramList.size(); b++) {
      String str = paramList.get(b);
      stringBuilder.append(str);
      if (b < paramList.size() - 1)
        stringBuilder.append(","); 
    } 
    return stringBuilder.toString();
  }
  
  private boolean g() {
    byte b;
    for (b = 0; b < this.c.getSize(); b++) {
      String str1 = this.c.get(b);
      if (!this.h.contains(str1))
        this.h.add(str1); 
    } 
    for (b = 0; b < this.e.getSize(); b++) {
      String str1 = this.e.get(b);
      if (this.h.contains(str1))
        this.h.remove(str1); 
    } 
    String str = a(this.h);
    this.a.a(b, str);
    bq.a().d().c(new n());
    bq.a().d().c(hx.a().r());
    bq.a().e().t();
    return true;
  }
  
  private boolean h() {
    return true;
  }
  
  public void a(Frame paramFrame) {
    JDialog jDialog = new JDialog(paramFrame, "Select Displayed Fields");
    jDialog.setLayout(new BorderLayout());
    jDialog.add("Center", this);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    JButton jButton1 = new JButton("Ok");
    jButton1.addActionListener(new f(this, jDialog));
    jPanel.add(jButton1);
    JButton jButton2 = new JButton("Cancel");
    jButton2.addActionListener(new g(this, jDialog));
    jPanel.add(jButton2);
    jDialog.add("South", jPanel);
    jDialog.pack();
    bV.a(paramFrame, jDialog);
    jDialog.setVisible(true);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aq/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */