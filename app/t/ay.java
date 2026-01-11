package t;

import com.efiAnalytics.apps.ts.dashboard.f;
import com.efiAnalytics.apps.ts.dashboard.s;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import s.g;

public class ay extends a implements f {
  JPanel a = new JPanel();
  
  JCheckBox b = new JCheckBox(g.b("Use Italic Font"));
  
  public ay(Window paramWindow, ai paramai) {
    super(paramWindow, "Select Italic Font");
    a(paramai);
    this.a.setBorder(BorderFactory.createTitledBorder(g.b("Italic Font")));
    this.a.setLayout(new GridLayout(1, 1));
    this.a.add(this.b);
    this.b.addActionListener(new az(this));
    add("Center", this.a);
    pack();
  }
  
  public JPanel a() {
    return this.a;
  }
  
  public void a(ArrayList<s> paramArrayList) {
    if (paramArrayList.size() > 0)
      this.b.setSelected(((s)paramArrayList.get(0)).isItalicFont()); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/ay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */