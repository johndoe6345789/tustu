package t;

import com.efiAnalytics.apps.ts.dashboard.DashLabel;
import com.efiAnalytics.apps.ts.dashboard.f;
import com.efiAnalytics.ui.eJ;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import s.SComponentGolf;

public class TInterfaceAs extends a implements f {
  JTextField a;
  
  JPanel b = new JPanel();
  
  public TInterfaceAs(Window paramWindow, ai paramai) {
    super(paramWindow, SComponentGolf.b("Label Text"));
    a(paramai);
    au au = new au(this);
    this.b.setLayout(new GridLayout(0, 2, eJ.a(1), eJ.a(3)));
    String str = SComponentGolf.b("Label Text");
    this.b.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), str));
    JLabel jLabel = new JLabel(SComponentGolf.b("Text"));
    jLabel.setHorizontalAlignment(4);
    this.b.add(jLabel);
    this.a = new JTextField("", 10);
    this.a.addFocusListener(au);
    this.a.addKeyListener(new at(this));
    this.b.add(this.a);
    add("Center", this.b);
  }
  
  public void e(ArrayList<DashLabel> paramArrayList) {
    if (paramArrayList.isEmpty()) {
      this.a.setText("");
      setEnabled(false);
    } else if (paramArrayList.get(0) != null && paramArrayList.get(0) instanceof DashLabel) {
      setEnabled(true);
      DashLabel dashLabel = paramArrayList.get(0);
      this.a.setText(dashLabel.getText().toString());
    } else if (paramArrayList.size() == 1 && paramArrayList.get(0) instanceof DashLabel) {
      setEnabled(false);
    } 
  }
  
  public void a(ArrayList paramArrayList) {
    ArrayList<DashLabel> arrayList = new ArrayList();
    for (DashLabel dashLabel : paramArrayList) {
      if (dashLabel instanceof DashLabel)
        arrayList.add(dashLabel); 
    } 
    e(arrayList);
  }
  
  public void setEnabled(boolean paramBoolean) {
    Component[] arrayOfComponent = this.b.getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++)
      arrayOfComponent[b].setEnabled(paramBoolean); 
    this.b.setEnabled(paramBoolean);
  }
  
  public JPanel a() {
    return this.b;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/as.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */