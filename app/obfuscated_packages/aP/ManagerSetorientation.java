package aP;

import G.T;
import bA.BaInterfaceBravo;
import bA.BaInterfaceDelta;
import bA.BaInterfaceFoxtrot;
import bq.BaInterfaceBravo;
import com.efiAnalytics.ui.cR;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import r.IOPropertiesUsingFile;
import r.RInterfaceIndia;

class ManagerSetorientation extends JToolBar implements BaInterfaceDelta {
  gG IOPropertiesUsingFile = new gG(this.g);
  
  JPanel BaInterfaceBravo = new JPanel();
  
  JPanel c = new JPanel();
  
  Map BaInterfaceDelta = new HashMap<>();
  
  boolean e = false;
  
  String BaInterfaceFoxtrot = null;
  
  gZ(dB paramdB) {
    this.e = RInterfaceIndia.IOPropertiesUsingFile().IOPropertiesUsingFile("HF;'[PG-05");
    this.BaInterfaceBravo.setLayout(new GridLayout(1, 1));
    setLayout(new BorderLayout(4, 4));
    add("Center", this.c);
    this.c.setLayout(new CardLayout());
    this.IOPropertiesUsingFile.IOPropertiesUsingFile(new ha(this, paramdB));
  }
  
  private JPanel c(String paramString) {
    if (!this.e)
      if (T.IOPropertiesUsingFile().c() != null) {
        paramString = T.IOPropertiesUsingFile().c().c();
        this.BaInterfaceFoxtrot = paramString;
      } else {
        paramString = this.BaInterfaceFoxtrot;
      }  
    JPanel jPanel = (JPanel)this.BaInterfaceDelta.get(paramString);
    if (jPanel == null) {
      jPanel = new JPanel();
      if (getOrientation() == 0) {
        jPanel.setLayout((LayoutManager)new cR(1, 0, 2, 2));
      } else {
        jPanel.setLayout((LayoutManager)new cR(0, 1, 2, 2));
      } 
      this.IOPropertiesUsingFile.IOPropertiesUsingFile(paramString);
      this.c.add(jPanel, paramString);
      this.BaInterfaceDelta.put(paramString, jPanel);
    } 
    if (this.e && this.BaInterfaceDelta.size() > 1) {
      IOPropertiesUsingFile(true);
    } else {
      IOPropertiesUsingFile(false);
    } 
    return jPanel;
  }
  
  public int IOPropertiesUsingFile(String paramString) {
    if (!this.e)
      if (T.IOPropertiesUsingFile().c() != null) {
        paramString = T.IOPropertiesUsingFile().c().c();
        this.BaInterfaceFoxtrot = paramString;
      } else {
        paramString = this.BaInterfaceFoxtrot;
      }  
    return this.BaInterfaceDelta.isEmpty() ? 0 : c(paramString).getComponentCount();
  }
  
  public Component IOPropertiesUsingFile(String paramString, Component paramComponent, int paramInt) {
    c(paramString).add(paramComponent);
    if (paramComponent instanceof BaInterfaceBravo)
      ((BaInterfaceBravo)paramComponent).BaInterfaceBravo(getOrientation()); 
    return paramComponent;
  }
  
  public void setOrientation(int paramInt) {
    if (this.c != null) {
      if (paramInt == 1) {
        add("North", this.BaInterfaceBravo);
      } else {
        add("West", this.BaInterfaceBravo);
      } 
      if (paramInt == 1) {
        IOPropertiesUsingFile.IOPropertiesUsingFile().BaInterfaceBravo("tuningToolbarLocation", "West");
        for (JPanel jPanel : this.BaInterfaceDelta.values()) {
          if (jPanel.getLayout() instanceof GridLayout) {
            GridLayout gridLayout = (GridLayout)jPanel.getLayout();
            gridLayout.setColumns(1);
            gridLayout.setRows(0);
            continue;
          } 
          if (jPanel.getLayout() instanceof cR) {
            cR cR = (cR)jPanel.getLayout();
            cR.BaInterfaceBravo(1);
            cR.IOPropertiesUsingFile(0);
          } 
        } 
      } else {
        IOPropertiesUsingFile.IOPropertiesUsingFile().BaInterfaceBravo("tuningToolbarLocation", "North");
        for (JPanel jPanel : this.BaInterfaceDelta.values()) {
          if (jPanel.getLayout() instanceof GridLayout) {
            GridLayout gridLayout = (GridLayout)jPanel.getLayout();
            gridLayout.setRows(1);
            gridLayout.setColumns(0);
            continue;
          } 
          if (jPanel.getLayout() instanceof cR) {
            cR cR = (cR)jPanel.getLayout();
            cR.IOPropertiesUsingFile(1);
            cR.BaInterfaceBravo(0);
          } 
        } 
      } 
      if (this.g.h != null && this.g.h.isVisible() && this.g.h instanceof aX)
        ((aX)this.g.h).IOPropertiesUsingFile(); 
      for (JPanel jPanel : this.BaInterfaceDelta.values()) {
        Component[] arrayOfComponent = jPanel.getComponents();
        for (Component component : arrayOfComponent) {
          if (component instanceof BaInterfaceBravo)
            ((BaInterfaceBravo)component).BaInterfaceBravo(paramInt); 
        } 
      } 
    } 
    super.setOrientation(paramInt);
  }
  
  public Component getComponent() {
    return this;
  }
  
  public BaInterfaceFoxtrot IOPropertiesUsingFile(String paramString, int paramInt) {
    if (!this.e)
      if (T.IOPropertiesUsingFile().c() != null) {
        paramString = T.IOPropertiesUsingFile().c().c();
        this.BaInterfaceFoxtrot = paramString;
      } else {
        paramString = this.BaInterfaceFoxtrot;
      }  
    return (BaInterfaceFoxtrot)c(paramString).getComponent(paramInt);
  }
  
  public void IOPropertiesUsingFile(Component paramComponent) {
    String[] arrayOfString = (String[])this.BaInterfaceDelta.keySet().toArray((Object[])new String[this.BaInterfaceDelta.keySet().size()]);
    for (String str : arrayOfString) {
      JPanel jPanel = (JPanel)this.BaInterfaceDelta.get(str);
      jPanel.remove(paramComponent);
      if (jPanel.getComponentCount() == 0) {
        this.c.remove(jPanel);
        this.BaInterfaceDelta.remove(str);
      } 
    } 
  }
  
  public void setEnabled(boolean paramBoolean) {
    for (JPanel jPanel : this.BaInterfaceDelta.values()) {
      for (byte BaInterfaceBravo = 0; BaInterfaceBravo < jPanel.getComponentCount(); BaInterfaceBravo++)
        jPanel.getComponent(BaInterfaceBravo).setEnabled(paramBoolean); 
    } 
    this.c.setEnabled(paramBoolean);
  }
  
  public BaInterfaceBravo IOPropertiesUsingFile() {
    return this.IOPropertiesUsingFile;
  }
  
  public int BaInterfaceBravo() {
    int RInterfaceIndia = 0;
    for (JPanel jPanel : this.BaInterfaceDelta.values())
      RInterfaceIndia += jPanel.getComponentCount(); 
    return RInterfaceIndia;
  }
  
  public void IOPropertiesUsingFile(boolean paramBoolean) {
    if (paramBoolean) {
      if (this.BaInterfaceBravo.getComponentCount() == 0)
        this.BaInterfaceBravo.add(this.IOPropertiesUsingFile); 
    } else if (this.BaInterfaceBravo.getComponentCount() > 0) {
      this.BaInterfaceBravo.remove(this.IOPropertiesUsingFile);
    } 
  }
  
  public void BaInterfaceBravo(String paramString) {
    if (!this.e)
      paramString = T.IOPropertiesUsingFile().c().c(); 
    JPanel jPanel = c(paramString);
    jPanel.removeAll();
    this.c.remove(jPanel);
    this.BaInterfaceDelta.remove(paramString);
    this.IOPropertiesUsingFile.c(paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */