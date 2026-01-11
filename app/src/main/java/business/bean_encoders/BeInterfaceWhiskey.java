package business.bean_encoders;

import G.R;
import V.ExceptionInVPackage;
import W.IOInWPackage;
import aE.ExceptionInVPackage;
import bt.ByInterfaceJuliet;
import by.JPanelExtensionInByPackage;
import by.ByInterfaceIndia;
import by.ByInterfaceJuliet;
import by.ByInterfaceMike;
import by.ByInterfaceNovember;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import s.SComponentGolf;

public class BeInterfaceWhiskey extends JPanel implements o {
  private R f = null;
  
  JTextField ExceptionInVPackage = new JTextField("", 15);
  
  JTextField b = new JTextField("", 3);
  
  JPanelExtensionInByPackage c;
  
  private S SComponentGolf = null;
  
  private S h = null;
  
  String JPanelExtensionInByPackage = "";
  
  ByInterfaceNovember e = new ByInterfaceNovember();
  
  public BeInterfaceWhiskey(R paramR) {
    setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("OutputChannel Expression Editor")));
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout(10, 10));
    add(jPanel1, "North");
    this.ExceptionInVPackage.setBorder(BorderFactory.createBevelBorder(1));
    this.ExceptionInVPackage.addKeyListener(this.e);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(0));
    JPanel jPanel3 = ExceptionInVPackage("Channel Name", this.ExceptionInVPackage, SComponentGolf.b("A unique name to reference this channel.") + " " + SComponentGolf.b("This name will be added to the available Channel List and can be used by gauges, data log fields or other expressions."));
    jPanel2.add(jPanel3);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout());
    jPanel4.add(this.b, "West");
    this.b.addKeyListener(this.e);
    this.b.setBorder(BorderFactory.createBevelBorder(1));
    JPanel jPanel5 = ExceptionInVPackage("Units", jPanel4, (String)null);
    jPanel2.add(jPanel5);
    jPanel2.add(new JLabel(" "));
    jPanel1.add(jPanel2, "Center");
    Image image = null;
    try {
      image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.M, this);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(w.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
    } 
    ImageIcon imageIcon = new ImageIcon(image);
    JButton jButton = new JButton(imageIcon);
    jButton.setPreferredSize(new Dimension(eJ.ExceptionInVPackage(28), eJ.ExceptionInVPackage(28)));
    jPanel1.add(jButton, "East");
    jButton.addActionListener(new x(this));
    JPanel jPanel6 = new JPanel();
    jPanel6.setLayout(new BorderLayout());
    jPanel6.add(ExceptionInVPackage("Expression", new JLabel(), "<html>" + SComponentGolf.b("Enter ExceptionInVPackage mathematical expression based on other Channels or Setting Parameters")), "North");
    ArrayList<ByInterfaceIndia> arrayList = new ArrayList();
    arrayList.add(ByInterfaceJuliet.ExceptionInVPackage(paramR));
    if (!IOInWPackage.b(ExceptionInVPackage.A().ByInterfaceJuliet()))
      arrayList.add(ByInterfaceJuliet.b(paramR)); 
    ByInterfaceMike ByInterfaceMike = ByInterfaceNovember.ExceptionInVPackage();
    this.c = new JPanelExtensionInByPackage(arrayList, ByInterfaceMike, SComponentGolf.JPanelExtensionInByPackage());
    jPanel6.add((Component)this.c, "Center");
    add(jPanel6, "Center");
  }
  
  private void SComponentGolf() {
    R r = null;
    try {
      r = this.h.ExceptionInVPackage(this.c.b());
    } catch (StackOverflowError stackOverflowError) {
      r = new R();
      r.c();
      r.ExceptionInVPackage("Circular Dependency!");
    } 
    if (r.ExceptionInVPackage()) {
      bV.JPanelExtensionInByPackage(SComponentGolf.b("Valid Expression!"), this);
    } else {
      bV.JPanelExtensionInByPackage(SComponentGolf.b(r.JPanelExtensionInByPackage()), this);
    } 
  }
  
  private JPanel ExceptionInVPackage(String paramString1, Component paramComponent, String paramString2) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout(5, 5));
    Dimension dimension = new Dimension(eJ.ExceptionInVPackage(100), eJ.ExceptionInVPackage(20));
    JLabel jLabel = new JLabel(SComponentGolf.b(paramString1) + ": ");
    jLabel.setMinimumSize(dimension);
    jPanel.add(jLabel, "West");
    jPanel.add(paramComponent, "Center");
    if (paramString2 != null) {
      ByInterfaceJuliet ByInterfaceJuliet = new ByInterfaceJuliet(SComponentGolf.b(paramString2));
      jPanel.add((Component)ByInterfaceJuliet, "East");
    } 
    return jPanel;
  }
  
  public boolean ExceptionInVPackage() {
    if (this.SComponentGolf != null) {
      R r = this.SComponentGolf.ExceptionInVPackage(this.ExceptionInVPackage.getText());
      if (!r.ExceptionInVPackage()) {
        String str = (r.JPanelExtensionInByPackage() != null) ? r.JPanelExtensionInByPackage() : "Invalid Channel Name";
        str = SComponentGolf.b(str);
        bV.JPanelExtensionInByPackage(str, this);
        return false;
      } 
    } 
    if (this.h != null) {
      R r = this.h.ExceptionInVPackage(this.c.b());
      if (!r.ExceptionInVPackage()) {
        String str = (r.JPanelExtensionInByPackage() != null) ? r.JPanelExtensionInByPackage() : "Invalid Expression";
        str = SComponentGolf.b(str);
        bV.JPanelExtensionInByPackage(str, this);
        return false;
      } 
    } 
    return true;
  }
  
  public void ExceptionInVPackage(R paramR) {
    this.f = paramR;
  }
  
  public String b() {
    return this.ExceptionInVPackage.getText();
  }
  
  public void ExceptionInVPackage(String paramString, boolean paramBoolean) {
    this.ExceptionInVPackage.setText(paramString);
    this.ExceptionInVPackage.setEditable(paramBoolean);
  }
  
  public String JPanelExtensionInByPackage() {
    return this.c.b();
  }
  
  public void ExceptionInVPackage(String paramString) {
    this.c.JPanelExtensionInByPackage(paramString);
  }
  
  public void ExceptionInVPackage(S paramS) {
    this.SComponentGolf = paramS;
  }
  
  public void b(S paramS) {
    this.h = paramS;
  }
  
  public void b(String paramString) {
    this.b.setText(paramString);
  }
  
  public String e() {
    return this.b.getText();
  }
  
  public boolean c() {
    return (this.e.ExceptionInVPackage() || !this.JPanelExtensionInByPackage.equals(this.c.b()));
  }
  
  public void f() {
    this.e.b();
    this.JPanelExtensionInByPackage = this.c.b();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */