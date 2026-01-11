package com.efiAnalytics.apps.ts.tuningViews.tuneComps;

import G.R;
import G.T;
import G.bD;
import G.bM;
import G.bv;
import bt.Q;
import bt.bh;
import bt.e;
import com.efiAnalytics.apps.ts.tuningViews.TuneViewComponent;
import com.efiAnalytics.apps.ts.tuningViews.h;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import s.SComponentGolf;

public class TuneSettingsPanel extends TuneViewComponent implements bc {
  JPanel c = new JPanel();
  
  JLabel d = new JLabel();
  
  bh e = null;
  
  JScrollPane f = new JScrollPane();
  
  private String SComponentGolf = null;
  
  private boolean h = false;
  
  public TuneSettingsPanel() {
    setLayout((LayoutManager)new h(this));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    add(jPanel);
    this.c.setLayout(new BorderLayout());
    this.c.add("Center", this.d);
    JButton jButton = new JButton("#");
    jButton.setPreferredSize(new Dimension(eJ.a(15), eJ.a(15)));
    addEditComponent(jButton);
    jButton.setToolTipText(SComponentGolf.b("Click to select Settings"));
    jButton.addActionListener(new j(this));
    jButton.setFocusable(false);
    this.c.add("East", jButton);
    jPanel.add("North", this.c);
    jPanel.add("Center", this.f);
  }
  
  private void showSelectPopup(int paramInt1, int paramInt2) {
    R r = getEcuConfiguration();
    Q q = new Q(r, -1);
    k k = new k(this);
    q.a(k);
    this.c.add((Component)q);
    q.show((Component)this, paramInt1, paramInt2);
  }
  
  public void setEcuConfigurationName(String paramString) {
    String str = getEcuConfigurationName();
    super.setEcuConfigurationName(paramString);
    if (!str.equals(paramString))
      updateSelectedPanel(); 
  }
  
  private R getEcuConfiguration() {
    String str = getEcuConfigurationName();
    if (str == null || str.isEmpty())
      str = T.a().c().c(); 
    return T.a().c(str);
  }
  
  private void updateSelectedPanel() {
    if (getSettingPanelName() != null) {
      bD bD;
      R r = getEcuConfiguration();
      bv bv = r.e().c(getSettingPanelName());
      closeSettingsPanel();
      if (bv == null && getSettingPanelName().startsWith("std_")) {
        bD = new bD();
        bD.v(getSettingPanelName());
        int i = bM.k(r, getSettingPanelName());
        bD.a(i);
        r.e().a((bv)bD);
      } 
      if (bD != null) {
        this.e = new bh(r, (bv)bD);
        this.f.setViewportView((Component)this.e);
        e.a().a(r.c(), this.e);
      } 
    } else {
      closeSettingsPanel();
    } 
  }
  
  private void closeSettingsPanel() {
    if (this.e != null) {
      e.a().b(getEcuConfiguration().c(), this.e);
      this.e.close();
      this.f.setViewportView(new JPanel());
    } 
  }
  
  public void close() {
    closeSettingsPanel();
  }
  
  public void initializeComponents() {
    updateSelectedPanel();
  }
  
  public String getSettingPanelName() {
    return this.SComponentGolf;
  }
  
  public void setSettingPanelName(String paramString) {
    this.SComponentGolf = paramString;
  }
  
  public boolean isDirty() {
    return this.h;
  }
  
  public void setClean(boolean paramBoolean) {
    this.h = !paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/tuneComps/TuneSettingsPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */