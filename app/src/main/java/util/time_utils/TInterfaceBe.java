package t;

import com.efiAnalytics.apps.ts.dashboard.Indicator;
import com.efiAnalytics.apps.ts.dashboard.f;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import s.SComponentGolf;

public class TInterfaceBe extends a implements f {
  JTextField a;
  
  JTextField b;
  
  JPanel c = new JPanel();
  
  public TInterfaceBe(Window paramWindow, ai paramai) {
    super(paramWindow, SComponentGolf.b("Indicator Text"));
    a(paramai);
    bh bh = new bh(this);
    this.c.setLayout(new GridLayout(0, 2, 1, 3));
    String str = SComponentGolf.b("Indicator Text");
    this.c.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), str));
    JLabel jLabel = new JLabel(SComponentGolf.b("On Text"));
    jLabel.setHorizontalAlignment(4);
    this.c.add(jLabel);
    this.a = new JTextField("", 10);
    this.a.addFocusListener(bh);
    this.a.addKeyListener(new bf(this));
    this.c.add(this.a);
    jLabel = new JLabel(SComponentGolf.b("Off Text"));
    jLabel.setHorizontalAlignment(4);
    this.c.add(jLabel);
    this.b = new JTextField("", 10);
    this.b.addFocusListener(bh);
    this.b.addKeyListener(new bg(this));
    this.c.add(this.b);
    add("Center", this.c);
  }
  
  public void e(ArrayList<Indicator> paramArrayList) {
    if (paramArrayList.isEmpty()) {
      this.a.setText("");
      this.b.setText("");
      setEnabled(false);
    } else if (paramArrayList.get(0) != null && paramArrayList.get(0) instanceof Indicator) {
      setEnabled(true);
      Indicator indicator = paramArrayList.get(0);
      this.a.setText(indicator.getOnText().toString());
      this.b.setText(indicator.getOffText().toString());
    } else if (paramArrayList.size() == 1 && paramArrayList.get(0) instanceof Indicator) {
      setEnabled(false);
    } 
  }
  
  public void a(ArrayList paramArrayList) {
    ArrayList arrayList = new ArrayList();
    for (Object object : paramArrayList) {
      if (object instanceof Indicator)
        arrayList.add(object); 
    } 
    e(arrayList);
  }
  
  public void setEnabled(boolean paramBoolean) {
    Component[] arrayOfComponent = this.c.getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++)
      arrayOfComponent[b].setEnabled(paramBoolean); 
    this.c.setEnabled(paramBoolean);
  }
  
  public JPanel a() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/be.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */