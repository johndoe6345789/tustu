package com.efiAnalytics.ui;

import java.awt.Component;
import java.awt.Container;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;

public class ComponentUtils {
  public static void a(Component paramComponent, boolean paramBoolean) {
    if (paramComponent instanceof Container) {
      Container container = (Container) paramComponent;
      Component[] arrayOfComponent = container.getComponents();
      for (byte b = 0; b < arrayOfComponent.length; b++) a(arrayOfComponent[b], paramBoolean);
    }
    paramComponent.setEnabled(paramBoolean);
  }

  public static void a(Container paramContainer, boolean paramBoolean) {
    if (paramContainer instanceof Container) {
      Container container = paramContainer;
      Component[] arrayOfComponent = container.getComponents();
      for (byte b = 0; b < arrayOfComponent.length; b++) a(arrayOfComponent[b], paramBoolean);
    }
  }

  public static boolean a() {
    String str = System.getProperty("os.name", "");
    return str.startsWith("Mac");
  }

  public static boolean b() {
    String str = System.getProperty("os.name", "");
    return str.startsWith("Linux");
  }

  public static boolean c() {
    GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
    return (graphicsDevice.isWindowTranslucencySupported(
            GraphicsDevice.WindowTranslucency.PERPIXEL_TRANSLUCENT)
        && graphicsDevice.isWindowTranslucencySupported(
            GraphicsDevice.WindowTranslucency.TRANSLUCENT));
  }

  public static boolean a(Component[] paramArrayOfComponent, Component paramComponent) {
    for (Component component : paramArrayOfComponent) {
      if (component.equals(paramComponent)) return true;
    }
    return false;
  }

  public static JPopupMenu a(JPopupMenu paramJPopupMenu) {
    for (Component component : paramJPopupMenu.getComponents()) {
      if (component instanceof bs) {
        bs bs = (bs) component;
        if (bs.i() != null) bs.setVisible(bs.i().a());
        if (bs.e() != null) bs.setEnabled(bs.e().a());
      }
      if (component instanceof JMenu) a((JMenu) component);
    }
    return paramJPopupMenu;
  }

  public static JMenu a(JMenu paramJMenu) {
    for (Component component : paramJMenu.getMenuComponents()) {
      if (component instanceof bs) {
        bs bs = (bs) component;
        if (bs.i() != null) bs.setVisible(bs.i().a());
        if (bs.e() != null) bs.setEnabled(bs.e().a());
      }
      if (component instanceof JMenu) a((JMenu) component);
    }
    return paramJMenu;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
