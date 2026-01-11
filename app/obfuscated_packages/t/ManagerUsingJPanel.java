package t;

import G.R;
import G.T;
import G.ManagerUsingArrayList;
import aE.PropertiesExtension;
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
import s.SComponentGolf;

public class ManagerUsingJPanel extends PropertiesExtension implements f {
  JComboBox PropertiesExtension = new JComboBox();
  
  JComboBox b = new JComboBox();
  
  boolean c = false;
  
  private JPanel d = new JPanel();
  
  public ManagerUsingJPanel(Window paramWindow, ai paramai) {
    super(paramWindow, SComponentGolf.b("Select Output Channel"));
    PropertiesExtension(paramai);
    this.d.setLayout(new BorderLayout());
    add(this.d, "Center");
    String str = "";
    if (c().c())
      str = c().b().getEcuConfigurationName(); 
    T t = T.PropertiesExtension();
    R r = PropertiesExtension(str);
    if (r == null)
      r = t.c(); 
    String[] arrayOfString = t.d();
    this.PropertiesExtension.setEditable(false);
    this.PropertiesExtension.addItem(new bm(this, SComponentGolf.b("Default"), ""));
    for (byte b = 0; b < arrayOfString.length; b++)
      this.PropertiesExtension.addItem(arrayOfString[b]); 
    this.PropertiesExtension.addItem(new bm(this, ManagerUsingArrayList.PropertiesExtension, ManagerUsingArrayList.PropertiesExtension));
    s s = c().PropertiesExtension().get(0);
    this.PropertiesExtension.setSelectedItem(s.getEcuConfigurationName());
    this.PropertiesExtension.addActionListener(new bj(this));
    this.b.setEditable(false);
    if (str.equals(ManagerUsingArrayList.PropertiesExtension)) {
      d();
    } else {
      PropertiesExtension(r);
    } 
    this.b.addActionListener(new bk(this));
    JButton jButton = new JButton(SComponentGolf.b("Close"));
    jButton.addActionListener(new bl(this));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(0, 1));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(1, 1));
    jPanel2.setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Controller")));
    jPanel2.add(this.PropertiesExtension);
    jPanel1.add(jPanel2);
    jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(1, 1));
    jPanel2.setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Output Channel")));
    jPanel2.add(this.b);
    jPanel1.add(jPanel2);
    this.d.add("Center", jPanel1);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout(2));
    jPanel3.add(jButton);
    add("South", jPanel3);
    pack();
  }
  
  public void PropertiesExtension(String paramString1, String paramString2) {
    String str1;
    Object object = this.PropertiesExtension.getSelectedItem();
    if (object instanceof bm) {
      bm bm = (bm)object;
      str1 = bm.PropertiesExtension();
    } else {
      str1 = object.toString();
    } 
    String str2 = (this.PropertiesExtension.getSelectedItem() != null) ? str1 : null;
    for (byte b = 0; b < this.PropertiesExtension.getItemCount(); b++) {
      if (this.PropertiesExtension.getItemAt(b) instanceof bm) {
        bm bm = this.PropertiesExtension.getItemAt(b);
        String str = bm.PropertiesExtension();
        if (str != null && str.equals(paramString1))
          this.PropertiesExtension.setSelectedIndex(b); 
      } 
    } 
    this.PropertiesExtension.setSelectedItem(paramString1);
    if (paramString1.equals(ManagerUsingArrayList.PropertiesExtension)) {
      d();
    } else {
      R r = PropertiesExtension(paramString1);
      PropertiesExtension(r);
    } 
    if (paramString2 != null && (this.b.getSelectedItem() == null || !this.b.getSelectedItem().equals(paramString2)))
      this.b.setSelectedItem(paramString2); 
  }
  
  public void e(ArrayList<SingleChannelDashComponent> paramArrayList) {
    if (!paramArrayList.isEmpty() && paramArrayList.get(0) instanceof SingleChannelDashComponent) {
      fp.PropertiesExtension(this.d, true);
      SingleChannelDashComponent singleChannelDashComponent = paramArrayList.get(0);
      try {
        PropertiesExtension(singleChannelDashComponent.getEcuConfigurationName(), singleChannelDashComponent.getOutputChannel());
      } catch (Exception exception) {
        PropertiesExtension("", "");
      } 
      String str1 = singleChannelDashComponent.getEcuConfigurationName();
      String str2 = singleChannelDashComponent.getOutputChannel();
      Color color = UIManager.getColor("Label.foreground");
      this.PropertiesExtension.setForeground(color);
      this.b.setForeground(color);
      for (s s : paramArrayList) {
        if (s instanceof SingleChannelDashComponent) {
          singleChannelDashComponent = (SingleChannelDashComponent)s;
          if (!singleChannelDashComponent.getEcuConfigurationName().equals(str1)) {
            this.PropertiesExtension.setForeground(Color.GRAY);
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
      fp.PropertiesExtension(this.d, false);
    } 
  }
  
  private void d() {
    String[] arrayOfString = ManagerUsingArrayList.PropertiesExtension().b();
    arrayOfString = X.PropertiesExtension(arrayOfString);
    PropertiesExtension(arrayOfString);
  }
  
  private void PropertiesExtension(R paramR) {
    String[] arrayOfString = paramR.s();
    arrayOfString = X.PropertiesExtension(arrayOfString);
    PropertiesExtension(arrayOfString);
  }
  
  private void PropertiesExtension(String[] paramArrayOfString) {
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
  
  private R PropertiesExtension(String paramString) {
    return (paramString == null || paramString.equals("")) ? PropertiesExtension.A().E() : T.PropertiesExtension().c(paramString);
  }
  
  public JPanel PropertiesExtension() {
    return this.d;
  }
  
  public void PropertiesExtension(ArrayList paramArrayList) {
    this.c = true;
    e(paramArrayList);
    this.c = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/bi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */