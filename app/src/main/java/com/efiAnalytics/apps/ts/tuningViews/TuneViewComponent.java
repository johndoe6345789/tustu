package com.efiAnalytics.apps.ts.tuningViews;

import G.ManagerUsingArrayList;
import G.T;
import aE.PropertiesExtension;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.eJ;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.Border;

public abstract class TuneViewComponent extends JPanel implements bc {
  private double c = 0.0D;

  private double d = 0.0D;

  private double e = 0.25D;

  private double f = 0.3D;

  private String g = "";

  private boolean h = false;

  List PropertiesExtension = new ArrayList();

  private JButton i = null;

  protected String b = "";

  private boolean j = false;

  public TuneViewComponent() {
    if ((T.PropertiesExtension().d()).length > 1) {
      this.i = new JButton(T.PropertiesExtension().c().c());
      this.i.setPreferredSize(eJ.PropertiesExtension(170, 16));
      this.i.addActionListener(new i(this));
    }
  }

  public abstract void initializeComponents();

  private void showEcuConfigPopup() {
    JPopupMenu jPopupMenu = new JPopupMenu();
    j j = new j(this);
    for (String str : T.PropertiesExtension().d()) {
      JMenuItem jMenuItem = jPopupMenu.add(str);
      jMenuItem.setActionCommand(str);
      jMenuItem.addActionListener(j);
      jPopupMenu.add(jMenuItem);
    }
    this.i.add(jPopupMenu);
    jPopupMenu.show(this.i, 0, this.i.getHeight());
  }

  public double getRelativeX() {
    return this.c;
  }

  public void setRelativeX(double paramDouble) {
    this.c = paramDouble;
  }

  public double getRelativeY() {
    return this.d;
  }

  public void setRelativeY(double paramDouble) {
    this.d = paramDouble;
  }

  public double getRelativeWidth() {
    return this.e;
  }

  public void setRelativeWidth(double paramDouble) {
    this.e = paramDouble;
  }

  public double getRelativeHeight() {
    return this.f;
  }

  public void setRelativeHeight(double paramDouble) {
    this.f = paramDouble;
  }

  public String toString() {
    Field[] arrayOfField = getClass().getDeclaredFields();
    AccessibleObject.setAccessible((AccessibleObject[]) arrayOfField, true);
    null = getClass().getName();
    for (byte b = 0; b < arrayOfField.length; b++) {
      Field field = arrayOfField[b];
      try {
        null =
            null
                + "\n\t"
                + field.getName()
                + "="
                + field.get(this)
                + ", Generic String:"
                + field.toGenericString()
                + ", ";
      } catch (Exception exception) {
      }
    }
    return null + "\n";
  }

  public boolean isInvalidState() {
    return this.j;
  }

  protected void setInvalidState(boolean paramBoolean) {
    this.j = paramBoolean;
  }

  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void updateRelativeBoundsToCurrent() {
    if (getParent() != null && getParent().getWidth() > 0 && getParent().getHeight() > 0) {
      this.c = getX() / getParent().getWidth();
      this.d = getY() / getParent().getHeight();
      this.e = getWidth() / getParent().getWidth();
      this.f = getHeight() / getParent().getHeight();
    }
  }

  public String getEcuConfigurationName() {
    return (this.b != null && this.b.equals(ManagerUsingArrayList.PropertiesExtension))
        ? this.b
        : ((PropertiesExtension.A() != null && PropertiesExtension.A().u().equals(this.b))
            ? ""
            : ((this.b != null && !this.b.isEmpty()) ? this.b : this.b));
  }

  public void setEcuConfigurationName(String paramString) {
    if (paramString == null || paramString.equals("null")) {
      this.b = "";
    } else {
      this.b = paramString;
    }
    if (this.i != null)
      if (this.b.isEmpty()) {
        this.i.setText(T.PropertiesExtension().c().c());
      } else {
        this.i.setText(this.b);
      }
  }

  public abstract void close();

  public String getId() {
    return this.g;
  }

  public void setId(String paramString) {
    this.g = paramString;
  }

  public void enableEditMode(boolean paramBoolean) {
    if (paramBoolean) {
      setBorder(
          BorderFactory.createMatteBorder(
              eJ.PropertiesExtension(14),
              eJ.PropertiesExtension(7),
              eJ.PropertiesExtension(14),
              eJ.PropertiesExtension(7),
              Color.GRAY));
      if (this.i != null) add(this.i);
    } else {
      setBorder((Border) null);
      if (this.i != null) remove(this.i);
    }
    this.h = paramBoolean;
  }

  public boolean isShieldedDuringEdit() {
    return true;
  }

  public void addMouseListener(MouseListener paramMouseListener) {
    super.addMouseListener(paramMouseListener);
    for (byte b = 0; b < getComponentCount(); b++)
      getComponent(b).addMouseListener(paramMouseListener);
  }

  public void addMouseMotionListener(MouseMotionListener paramMouseMotionListener) {
    super.addMouseMotionListener(paramMouseMotionListener);
    for (byte b = 0; b < getComponentCount(); b++)
      getComponent(b).addMouseMotionListener(paramMouseMotionListener);
  }

  public void removeMouseListener(MouseListener paramMouseListener) {
    super.removeMouseListener(paramMouseListener);
    for (byte b = 0; b < getComponentCount(); b++)
      getComponent(b).removeMouseListener(paramMouseListener);
  }

  public void removeMouseMotionListener(MouseMotionListener paramMouseMotionListener) {
    super.removeMouseMotionListener(paramMouseMotionListener);
    for (byte b = 0; b < getComponentCount(); b++)
      getComponent(b).removeMouseMotionListener(paramMouseMotionListener);
  }

  public boolean isOptimizedDrawingEnabled() {
    return false;
  }

  public abstract boolean isDirty();

  public abstract void setClean(boolean paramBoolean);

  public boolean isEditMode() {
    return this.h;
  }

  public void addEditComponent(Component paramComponent) {
    this.PropertiesExtension.add(paramComponent);
  }

  public void removeEditComponent(Component paramComponent) {
    this.PropertiesExtension.remove(paramComponent);
  }

  public boolean isEditComponent(Component paramComponent) {
    return this.PropertiesExtension.contains(paramComponent);
  }

  protected JButton getBtnSelectEcuConfig() {
    return this.i;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/TuneViewComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
