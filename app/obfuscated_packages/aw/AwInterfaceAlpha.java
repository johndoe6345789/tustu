package aw;

import ao.M;
import bH.ab;
import bx.BxInterfaceJuliet;
import bx.BxInterfaceLima;
import bx.BxInterfaceSierra;
import bx.JTableExtensionGetcolumnclass;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class AwInterfaceAlpha extends JPanel implements BxInterfaceLima {
  ab a = null;
  
  JTableExtensionGetcolumnclass b;
  
  public AwInterfaceAlpha(ab paramab) {
    this.a = paramab;
    setLayout(new BorderLayout());
    this.b = new JTableExtensionGetcolumnclass(paramab);
    ArrayList arrayList = M.a().d();
    for (BxInterfaceJuliet BxInterfaceJuliet : arrayList)
      this.b.a(BxInterfaceJuliet); 
    JScrollPane jScrollPane = new JScrollPane((Component)this.b);
    this.b.setFillsViewportHeight(true);
    jScrollPane.setBorder(BorderFactory.createLoweredBevelBorder());
    jScrollPane.setPreferredSize(new Dimension(eJ.a(150), eJ.a(150)));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.setBorder(BorderFactory.createTitledBorder(b("Data Filters")));
    jPanel.add("Center", jScrollPane);
    add("Center", jPanel);
  }
  
  private String b(String paramString) {
    return (this.a != null) ? this.a.a(paramString) : paramString;
  }
  
  public Collection a() {
    return this.b.b();
  }
  
  public void a(BxInterfaceSierra params) {
    this.b.a(params);
  }
  
  public void a(String paramString, boolean paramBoolean) {
    if (paramBoolean) {
      this.b.a(paramString);
    } else {
      this.b.b(paramString);
    } 
  }
  
  public void a(BxInterfaceJuliet paramj) {
    this.b.a(paramj);
  }
  
  public void a(String paramString) {
    this.b.d(paramString);
  }
  
  public void b(BxInterfaceJuliet paramj) {
    BxInterfaceJuliet j1 = this.b.e(paramj.a());
    j1.b(paramj.b());
    j1.c(paramj.c());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aw/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */