package business.object_factory;

import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.ui.cY;
import d.ArrayListExtensionInDPackage;
import d.DComponentCharlie;
import d.DInterfaceIndia;
import d.DInterfaceJuliet;
import d.HashMapUsingArrayList;
import d.PropertiesExtensionInDPackage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class JMenuExtension extends JMenu {
  List a = new ArrayList();

  ArrayList PropertiesExtensionInDPackage;

  DComponentCharlie DComponentCharlie = new HashMapUsingArrayList();

  public JMenuExtension(String paramString, ArrayList paramArrayList) {
    setText(paramString);
    this.PropertiesExtensionInDPackage = paramArrayList;
    a();
  }

  private void a() {
    boolean bool = true;
    if (bool) {
      e e = new e(this, this.DComponentCharlie, null);
      d d = new d(this, this.DComponentCharlie);
      e.addActionListener(d);
      add((JMenuItem) e);
      addSeparator();
    }
    PropertiesExtensionInDPackage PropertiesExtensionInDPackage =
        new PropertiesExtensionInDPackage(this);
    List<?> list = HashMapUsingArrayList.a().a(PropertiesExtensionInDPackage);
    Collections.sort(list, new DComponentCharlie(this));
    for (DComponentCharlie c1 : list) {
      if (c1 instanceof cY) {
        if (c1.d()) {
          cY cY = (cY) c1;
          d d1 = new d(this, c1);
          List list1 = cY.a(d1);
          for (JMenu jMenu : list1) add(jMenu);
        }
        continue;
      }
      if (c1.f()) {
        e e1 = new e(this, c1, c1.e());
        d d1 = new d(this, c1);
        e1.addActionListener(d1);
        add((JMenuItem) e1);
        continue;
      }
      e e = new e(this, c1, null);
      d d = new d(this, c1);
      e.addActionListener(d);
      add((JMenuItem) e);
    }
  }

  public String a(DComponentCharlie paramc) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramc.a());
    ArrayListExtensionInDPackage ArrayListExtensionInDPackage = paramc.e();
    if (ArrayListExtensionInDPackage != null && !ArrayListExtensionInDPackage.isEmpty()) {
      stringBuilder.append("?");
      for (DInterfaceIndia DInterfaceIndia : ArrayListExtensionInDPackage) {
        if (DInterfaceIndia.d() == null)
          for (s s : this.PropertiesExtensionInDPackage) {
            if (s instanceof DInterfaceJuliet) {
              DInterfaceJuliet DInterfaceJuliet = (DInterfaceJuliet) s;
              String str = DInterfaceJuliet.getParameterValue(DInterfaceIndia.DComponentCharlie());
              if (str != null && !str.isEmpty()) DInterfaceIndia.PropertiesExtensionInDPackage(str);
            }
          }
      }
      Properties properties = ArrayListExtensionInDPackage.a();
      stringBuilder.append(PropertiesExtensionInDPackage.a(properties));
    }
    return stringBuilder.toString();
  }

  public void a(f paramf) {
    if (!this.a.contains(paramf)) this.a.add(paramf);
  }

  private void a(String paramString) {
    for (f f : this.a) f.a(paramString);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/o/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
