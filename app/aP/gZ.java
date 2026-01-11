package aP;

import G.T;
import bA.b;
import bA.d;
import bA.f;
import bq.b;
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
import r.a;
import r.i;

class gZ extends JToolBar implements d {
  gG a = new gG(this.g);
  
  JPanel b = new JPanel();
  
  JPanel c = new JPanel();
  
  Map d = new HashMap<>();
  
  boolean e = false;
  
  String f = null;
  
  gZ(dB paramdB) {
    this.e = i.a().a("HF;'[PG-05");
    this.b.setLayout(new GridLayout(1, 1));
    setLayout(new BorderLayout(4, 4));
    add("Center", this.c);
    this.c.setLayout(new CardLayout());
    this.a.a(new ha(this, paramdB));
  }
  
  private JPanel c(String paramString) {
    if (!this.e)
      if (T.a().c() != null) {
        paramString = T.a().c().c();
        this.f = paramString;
      } else {
        paramString = this.f;
      }  
    JPanel jPanel = (JPanel)this.d.get(paramString);
    if (jPanel == null) {
      jPanel = new JPanel();
      if (getOrientation() == 0) {
        jPanel.setLayout((LayoutManager)new cR(1, 0, 2, 2));
      } else {
        jPanel.setLayout((LayoutManager)new cR(0, 1, 2, 2));
      } 
      this.a.a(paramString);
      this.c.add(jPanel, paramString);
      this.d.put(paramString, jPanel);
    } 
    if (this.e && this.d.size() > 1) {
      a(true);
    } else {
      a(false);
    } 
    return jPanel;
  }
  
  public int a(String paramString) {
    if (!this.e)
      if (T.a().c() != null) {
        paramString = T.a().c().c();
        this.f = paramString;
      } else {
        paramString = this.f;
      }  
    return this.d.isEmpty() ? 0 : c(paramString).getComponentCount();
  }
  
  public Component a(String paramString, Component paramComponent, int paramInt) {
    c(paramString).add(paramComponent);
    if (paramComponent instanceof b)
      ((b)paramComponent).b(getOrientation()); 
    return paramComponent;
  }
  
  public void setOrientation(int paramInt) {
    if (this.c != null) {
      if (paramInt == 1) {
        add("North", this.b);
      } else {
        add("West", this.b);
      } 
      if (paramInt == 1) {
        a.a().b("tuningToolbarLocation", "West");
        for (JPanel jPanel : this.d.values()) {
          if (jPanel.getLayout() instanceof GridLayout) {
            GridLayout gridLayout = (GridLayout)jPanel.getLayout();
            gridLayout.setColumns(1);
            gridLayout.setRows(0);
            continue;
          } 
          if (jPanel.getLayout() instanceof cR) {
            cR cR = (cR)jPanel.getLayout();
            cR.b(1);
            cR.a(0);
          } 
        } 
      } else {
        a.a().b("tuningToolbarLocation", "North");
        for (JPanel jPanel : this.d.values()) {
          if (jPanel.getLayout() instanceof GridLayout) {
            GridLayout gridLayout = (GridLayout)jPanel.getLayout();
            gridLayout.setRows(1);
            gridLayout.setColumns(0);
            continue;
          } 
          if (jPanel.getLayout() instanceof cR) {
            cR cR = (cR)jPanel.getLayout();
            cR.a(1);
            cR.b(0);
          } 
        } 
      } 
      if (this.g.h != null && this.g.h.isVisible() && this.g.h instanceof aX)
        ((aX)this.g.h).a(); 
      for (JPanel jPanel : this.d.values()) {
        Component[] arrayOfComponent = jPanel.getComponents();
        for (Component component : arrayOfComponent) {
          if (component instanceof b)
            ((b)component).b(paramInt); 
        } 
      } 
    } 
    super.setOrientation(paramInt);
  }
  
  public Component getComponent() {
    return this;
  }
  
  public f a(String paramString, int paramInt) {
    if (!this.e)
      if (T.a().c() != null) {
        paramString = T.a().c().c();
        this.f = paramString;
      } else {
        paramString = this.f;
      }  
    return (f)c(paramString).getComponent(paramInt);
  }
  
  public void a(Component paramComponent) {
    String[] arrayOfString = (String[])this.d.keySet().toArray((Object[])new String[this.d.keySet().size()]);
    for (String str : arrayOfString) {
      JPanel jPanel = (JPanel)this.d.get(str);
      jPanel.remove(paramComponent);
      if (jPanel.getComponentCount() == 0) {
        this.c.remove(jPanel);
        this.d.remove(str);
      } 
    } 
  }
  
  public void setEnabled(boolean paramBoolean) {
    for (JPanel jPanel : this.d.values()) {
      for (byte b = 0; b < jPanel.getComponentCount(); b++)
        jPanel.getComponent(b).setEnabled(paramBoolean); 
    } 
    this.c.setEnabled(paramBoolean);
  }
  
  public b a() {
    return this.a;
  }
  
  public int b() {
    int i = 0;
    for (JPanel jPanel : this.d.values())
      i += jPanel.getComponentCount(); 
    return i;
  }
  
  public void a(boolean paramBoolean) {
    if (paramBoolean) {
      if (this.b.getComponentCount() == 0)
        this.b.add(this.a); 
    } else if (this.b.getComponentCount() > 0) {
      this.b.remove(this.a);
    } 
  }
  
  public void b(String paramString) {
    if (!this.e)
      paramString = T.a().c().c(); 
    JPanel jPanel = c(paramString);
    jPanel.removeAll();
    this.c.remove(jPanel);
    this.d.remove(paramString);
    this.a.c(paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */