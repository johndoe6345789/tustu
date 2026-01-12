package com.efiAnalytics.apps.ts.tuningViews.tuneComps;

import G.R;
import G.T;
import com.efiAnalytics.apps.ts.dashboard.t;
import com.efiAnalytics.apps.ts.tuningViews.TuneViewComponent;
import com.efiAnalytics.apps.ts.tuningViews.h;
import com.efiAnalytics.tuningwidgets.panels.SelectableTablePanel;
import com.efiAnalytics.tuningwidgets.panels.ay;
import java.awt.Component;
import java.awt.LayoutManager;
import java.util.Properties;
import javax.swing.BorderFactory;

public class SelectableTable extends TuneViewComponent implements t, ay {
  SelectableTablePanel c = null;

  R d = null;

  private String f = null;

  f e = new f(this);

  private boolean g = false;

  public SelectableTable() {
    setLayout((LayoutManager) new h(this));
    setDoubleBuffered(true);
  }

  private void addTableSelector() {
    if (this.c == null) {
      if (this.d == null) setEcuConfigurationName(getEcuConfigurationName());
      this.c = new SelectableTablePanel(this.d);
      this.c.a(this.e);
      this.c.a(false);
      this.c.a(3);
      this.c.a(this);
      if (this.f != null) this.c.a(this.f);
      if (this.f != null) setSelectedTableName(this.f);
      this.c.setBorder(BorderFactory.createEtchedBorder());
      add("Center", (Component) this.c);
      addEditComponent(this.c.a());
    } else {
      removeEditComponent(this.c.a());
      remove((Component) this.c);
      this.c = new SelectableTablePanel(this.d);
      this.c.a(this.e);
      this.c.a(false);
      this.c.a(3);
      this.c.a(this);
      if (this.f != null) this.c.a(this.f);
      if (this.f != null) setSelectedTableName(this.f);
      this.c.setBorder(BorderFactory.createEtchedBorder());
      add("Center", (Component) this.c);
      addEditComponent(this.c.a());
    }
  }

  public void setEcuConfigurationName(String paramString) {
    super.setEcuConfigurationName(paramString);
    if (paramString == null || paramString.isEmpty()) {
      this.d = T.a().c();
    } else {
      this.d = T.a().c(paramString);
    }
    if (this.c != null) addTableSelector();
  }

  public String getSelectedTableName() {
    return this.f;
  }

  public void setSelectedTableName(String paramString) {
    this.f = paramString;
  }

  public void setSavedProperties(Properties paramProperties) {
    this.e.a(paramProperties);
  }

  public Properties getSavedProperties() {
    return this.e.a();
  }

  public void panelSelectionChanged(String paramString1, String paramString2) {
    this.f = paramString2;
    this.g = true;
    super.setEcuConfigurationName(this.b);
  }

  public void initializeComponents() {
    addTableSelector();
    setClean(true);
  }

  public void close() {
    if (this.c != null) this.c.close();
  }

  public boolean isDirty() {
    return this.g;
  }

  public void setClean(boolean paramBoolean) {
    this.g = !paramBoolean;
  }

  public void enableEditMode(boolean paramBoolean) {
    this.c.b(paramBoolean);
    super.enableEditMode(paramBoolean);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/tuneComps/SelectableTable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
