package t;

import G.R;
import G.T;
import G.cu;
import aE.a;
import bH.X;
import com.efiAnalytics.apps.ts.dashboard.SingleChannelDashComponent;
import com.efiAnalytics.apps.ts.dashboard.f;
import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.ui.fp;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.UIManager;
import s.g;

public class bi extends a implements f {
  JComboBox a = new JComboBox();
  
  JComboBox b = new JComboBox();
  
  boolean c = false;
  
  private JPanel d = new JPanel();
  
  public bi(Window paramWindow, ai paramai) {
    super(paramWindow, g.b("Select Output Channel"));
    a(paramai);
    this.d.setLayout(new BorderLayout());
    add(this.d, "Center");
    String str = "";
    if (c().c())
      str = c().b().getEcuConfigurationName(); 
    T t = T.a();
    R r = a(str);
    if (r == null)
      r = t.c(); 
    String[] arrayOfString = t.d();
    this.a.setEditable(false);
    this.a.addItem(new bm(this, g.b("Default"), ""));
    for (byte b = 0; b < arrayOfString.length; b++)
      this.a.addItem(arrayOfString[b]); 
    this.a.addItem(new bm(this, cu.a, cu.a));
    s s = c().a().get(0);
    this.a.setSelectedItem(s.getEcuConfigurationName());
    this.a.addActionListener(new bj(this));
    this.b.setEditable(false);
    if (str.equals(cu.a)) {
      d();
    } else {
      a(r);
    } 
    this.b.addActionListener(new bk(this));
    JButton jButton = new JButton(g.b("Close"));
    jButton.addActionListener(new bl(this));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(0, 1));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(1, 1));
    jPanel2.setBorder(BorderFactory.createTitledBorder(g.b("Controller")));
    jPanel2.add(this.a);
    jPanel1.add(jPanel2);
    jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(1, 1));
    jPanel2.setBorder(BorderFactory.createTitledBorder(g.b("Output Channel")));
    jPanel2.add(this.b);
    jPanel1.add(jPanel2);
    this.d.add("Center", jPanel1);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout(2));
    jPanel3.add(jButton);
    add("South", jPanel3);
    pack();
  }
  
  public void a(String paramString1, String paramString2) {
    String str1;
    Object object = this.a.getSelectedItem();
    if (object instanceof bm) {
      bm bm = (bm)object;
      str1 = bm.a();
    } else {
      str1 = object.toString();
    } 
    String str2 = (this.a.getSelectedItem() != null) ? str1 : null;
    for (byte b = 0; b < this.a.getItemCount(); b++) {
      if (this.a.getItemAt(b) instanceof bm) {
        bm bm = this.a.getItemAt(b);
        String str = bm.a();
        if (str != null && str.equals(paramString1))
          this.a.setSelectedIndex(b); 
      } 
    } 
    this.a.setSelectedItem(paramString1);
    if (paramString1.equals(cu.a)) {
      d();
    } else {
      R r = a(paramString1);
      a(r);
    } 
    if (paramString2 != null && (this.b.getSelectedItem() == null || !this.b.getSelectedItem().equals(paramString2)))
      this.b.setSelectedItem(paramString2); 
  }
  
  public void e(ArrayList<SingleChannelDashComponent> paramArrayList) {
    if (!paramArrayList.isEmpty() && paramArrayList.get(0) instanceof SingleChannelDashComponent) {
      fp.a(this.d, true);
      SingleChannelDashComponent singleChannelDashComponent = paramArrayList.get(0);
      try {
        a(singleChannelDashComponent.getEcuConfigurationName(), singleChannelDashComponent.getOutputChannel());
      } catch (Exception exception) {
        a("", "");
      } 
      String str1 = singleChannelDashComponent.getEcuConfigurationName();
      String str2 = singleChannelDashComponent.getOutputChannel();
      Color color = UIManager.getColor("Label.foreground");
      this.a.setForeground(color);
      this.b.setForeground(color);
      for (s s : paramArrayList) {
        if (s instanceof SingleChannelDashComponent) {
          singleChannelDashComponent = (SingleChannelDashComponent)s;
          if (!singleChannelDashComponent.getEcuConfigurationName().equals(str1)) {
            this.a.setForeground(Color.GRAY);
            break;
          } 
        } 
      } 
      for (s s : paramArrayList) {
        if (s instanceof SingleChannelDashComponent) {
          singleChannelDashComponent = (SingleChannelDashComponent)s;
          if (singleChannelDashComponent.getOutputChannel() != null && !singleChannelDashComponent.getOutputChannel().equals(str2)) {
            this.b.setForeground(Color.GRAY);
            break;
          } 
        } 
      } 
    } else {
      fp.a(this.d, false);
    } 
  }
  
  private void d() {
    String[] arrayOfString = cu.a().b();
    arrayOfString = X.a(arrayOfString);
    a(arrayOfString);
  }
  
  private void a(R paramR) {
    String[] arrayOfString = paramR.s();
    arrayOfString = X.a(arrayOfString);
    a(arrayOfString);
  }
  
  private void a(String[] paramArrayOfString) {
    ActionListener[] arrayOfActionListener = this.b.getActionListeners();
    byte b;
    for (b = 0; b < arrayOfActionListener.length; b++)
      this.b.removeActionListener(arrayOfActionListener[b]); 
    this.b.removeAllItems();
    this.b.addItem("");
    for (b = 0; b < paramArrayOfString.length; b++)
      this.b.addItem(paramArrayOfString[b]); 
    this.b.setSelectedItem("");
    for (b = 0; b < arrayOfActionListener.length; b++)
      this.b.addActionListener(arrayOfActionListener[b]); 
    if (c().c()) {
      SingleChannelDashComponent singleChannelDashComponent = c().b();
      this.b.setSelectedItem(singleChannelDashComponent.getOutputChannel());
    } 
  }
  
  private R a(String paramString) {
    return (paramString == null || paramString.equals("")) ? a.A().E() : T.a().c(paramString);
  }
  
  public JPanel a() {
    return this.d;
  }
  
  public void a(ArrayList paramArrayList) {
    this.c = true;
    e(paramArrayList);
    this.c = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/bi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */