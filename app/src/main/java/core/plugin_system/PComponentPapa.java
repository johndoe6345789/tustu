package p;

import G.T;
import G.q;
import S.SInterfaceAlpha;
import S.SInterfaceEcho;
import S.SInterfaceLima;
import S.SInterfaceNovember;
import bH.ab;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import d.SInterfaceEcho;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;

public class PComponentPapa extends JPanel implements bc, C {
  ab SInterfaceAlpha = null;
  
  SInterfaceLima b;
  
  v c;
  
  g d;
  
  int SInterfaceEcho = -1;
  
  JButton f;
  
  JButton g;
  
  public PComponentPapa(SInterfaceLima paraml, ab paramab) {
    this.SInterfaceAlpha = paramab;
    this.c = new v(paramab);
    this.b = paraml;
    setBorder(BorderFactory.createEmptyBorder(eJ.SInterfaceAlpha(10), eJ.SInterfaceAlpha(10), eJ.SInterfaceAlpha(10), eJ.SInterfaceAlpha(10)));
    setLayout(new BorderLayout());
    for (SInterfaceNovember SInterfaceNovember : paraml.b())
      this.c.SInterfaceAlpha(SInterfaceNovember); 
    this.c.getSelectionModel().addListSelectionListener(new u(this, null));
    JScrollPane jScrollPane = new JScrollPane(this.c);
    this.c.setFillsViewportHeight(true);
    jScrollPane.setBorder(BorderFactory.createLoweredBevelBorder());
    jScrollPane.setPreferredSize(eJ.SInterfaceAlpha(320, 180));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.setBorder(BorderFactory.createTitledBorder(SInterfaceAlpha("Action Triggers")));
    jPanel.add("Center", jScrollPane);
    add("Center", jPanel);
    JToolBar jToolBar = new JToolBar();
    jToolBar.setFloatable(false);
    Image image = cO.SInterfaceAlpha().SInterfaceAlpha(cO.d, this, 24);
    image = eJ.SInterfaceAlpha(image);
    ImageIcon imageIcon = new ImageIcon(image);
    JButton jButton = new JButton(SInterfaceAlpha("New Action Trigger"), imageIcon);
    jButton.addActionListener(new q(this));
    jToolBar.add(jButton);
    image = cO.SInterfaceAlpha().SInterfaceAlpha(cO.SInterfaceEcho, this, 24);
    image = eJ.SInterfaceAlpha(image);
    imageIcon = new ImageIcon(image);
    this.f = new JButton(SInterfaceAlpha("Delete Trigger"), imageIcon);
    this.f.addActionListener(new r(this));
    jToolBar.add(this.f);
    this.f.setEnabled(false);
    image = cO.SInterfaceAlpha().SInterfaceAlpha(cO.A, this, 24);
    image = eJ.SInterfaceAlpha(image);
    imageIcon = new ImageIcon(image);
    this.g = new JButton(SInterfaceAlpha("Test User Action"), imageIcon);
    this.g.addActionListener(new s(this));
    this.g.setEnabled(false);
    jPanel.add("North", jToolBar);
    this.d = new g(paramab);
    this.d.SInterfaceAlpha(T.SInterfaceAlpha().c());
    this.d.setBorder(BorderFactory.createTitledBorder(SInterfaceAlpha("Action Trigger Editor")));
    this.d.SInterfaceAlpha(new t(this));
    add("South", (Component)this.d);
  }
  
  public void SInterfaceAlpha() {
    this.d.j();
  }
  
  private void b() {
    SInterfaceNovember SInterfaceNovember = new SInterfaceNovember();
    this.c.getSelectionModel().clearSelection();
    this.d.SInterfaceAlpha(SInterfaceNovember);
    this.d.SInterfaceAlpha(true);
  }
  
  private void c() {
    if (this.c.getSelectedRow() >= 0)
      SInterfaceNovember SInterfaceNovember = this.c.SInterfaceAlpha(this.c.getSelectedRow()); 
  }
  
  private boolean d() {
    try {
      SInterfaceNovember SInterfaceNovember = this.d.f();
      if (SInterfaceNovember == null) {
        bV.d(SInterfaceAlpha("Editor returned no Action Trigger."), this);
        return false;
      } 
      if (this.d.g() && this.b.SInterfaceAlpha(SInterfaceNovember.SInterfaceAlpha()) != null) {
        String str = SInterfaceAlpha("An Action Trigger with the name already exists.") + "\\SInterfaceNovember" + SInterfaceAlpha("If you save this Action Trigger with this name it will replace the existing Action Trigger.") + "\\SInterfaceNovember\\SInterfaceNovember" + SInterfaceAlpha("Are you sure you wish to replace the existing Action Trigger?");
        if (!bV.SInterfaceAlpha(str, this, true))
          return false; 
      } 
      this.b.SInterfaceAlpha(SInterfaceNovember);
      this.d.h();
      this.c.SInterfaceAlpha(SInterfaceNovember);
      this.c.SInterfaceAlpha();
      if (SInterfaceNovember.c()) {
        try {
          String str = T.SInterfaceAlpha().c().c();
          SInterfaceNovember.b(false);
          SInterfaceEcho.SInterfaceAlpha().SInterfaceAlpha(str, (SInterfaceAlpha)SInterfaceNovember);
        } catch (q q) {
          Logger.getLogger(p.class.getName()).log(Level.WARNING, "Failed to restart monitoring of Action Trigger", (Throwable)q);
        } 
      } else {
        String str = T.SInterfaceAlpha().c().c();
        SInterfaceNovember.b(false);
        SInterfaceEcho.SInterfaceAlpha().SInterfaceAlpha(str, SInterfaceNovember.SInterfaceAlpha());
      } 
      return true;
    } catch (SInterfaceEcho SInterfaceEcho) {
      bV.d(SInterfaceEcho.getLocalizedMessage(), this);
      return false;
    } 
  }
  
  private void SInterfaceEcho() {
    SInterfaceNovember SInterfaceNovember = this.c.b();
    if (SInterfaceNovember != null) {
      this.c.SInterfaceAlpha(SInterfaceNovember.SInterfaceAlpha());
      this.b.b(SInterfaceNovember.SInterfaceAlpha());
      this.c.SInterfaceAlpha();
    } 
  }
  
  private String SInterfaceAlpha(String paramString) {
    return (this.SInterfaceAlpha != null) ? this.SInterfaceAlpha.SInterfaceAlpha(paramString) : paramString;
  }
  
  private void SInterfaceAlpha(int paramInt) {
    if (this.d.i()) {
      String str = SInterfaceAlpha("The Action Trigger currently being edited has not been saved.") + "\\SInterfaceNovember" + SInterfaceAlpha("Would you like to save it now?");
      if (bV.SInterfaceAlpha(str, (Component)this.d, true))
        if (d()) {
          this.d.h();
        } else {
          if (this.SInterfaceEcho >= 0)
            this.c.getSelectionModel().setSelectionInterval(paramInt, paramInt); 
          return;
        }  
    } 
    this.f.setEnabled(true);
    this.g.setEnabled((this.c.getSelectedRowCount() > 0));
    this.SInterfaceEcho = paramInt;
    SInterfaceNovember SInterfaceNovember = this.c.SInterfaceAlpha(paramInt);
    this.d.b(SInterfaceNovember);
  }
  
  public void close() {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */