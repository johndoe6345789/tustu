package bb;

import ae.FileUsingHashMap;
import ae.AeInterfaceMike;
import ae.AeInterfaceQuebec;
import ae.AeInterfaceRomeo;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import s.SComponentGolf;

public class BbInterfaceLima extends JPanel {
  l a;
  
  public BbInterfaceLima() {
    setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout());
    add("Center", jPanel);
    this.a = new l(SComponentGolf.d());
    Dimension dimension = new Dimension(eJ.a(500), eJ.a(380));
    jPanel.setPreferredSize(dimension);
    JScrollPane jScrollPane = new JScrollPane(this.a);
    jPanel.add(jScrollPane);
    AeInterfaceRomeo.a().b();
  }
  
  public void a(FileUsingHashMap paramk, AeInterfaceMike paramm) {
    List list = AeInterfaceRomeo.a().a(paramk, paramm);
    a(list);
  }
  
  public void a(List paramList) {
    this.a.a(paramList);
    if (paramList.size() > 0)
      this.a.a(0); 
  }
  
  public AeInterfaceQuebec a() {
    return this.a.c();
  }
  
  public int b() {
    return this.a.d();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/L.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */