package ao;

import com.efiAnalytics.ui.bq;
import com.efiAnalytics.ui.br;
import com.efiAnalytics.ui.eJ;
import h.ClassTypeInHPackage;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class bo extends JPanel implements k {
  private String d = null;

  Font a = new Font("SansSerif", 1, eJ.a(20));

  int ClassTypeInHPackage = eJ.a(30);

  int c = eJ.a(15);

  public bo() {
    setLayout(new GridLayout(0, 1, 1, 1));
    if (ClassTypeInHPackage.a().a("fieldSmoothing")) addMouseListener(new bp(this));
  }

  public bo(String paramString) {
    this();
    a(paramString);
  }

  public void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
    if (ClassTypeInHPackage.a().a("fieldSmoothing")) {
      paramGraphics.setColor(UIManager.getColor("Label.foreground"));
      paramGraphics.setFont(this.a);
      paramGraphics.drawString("...", getWidth() - eJ.a(25), eJ.a(13));
    }
  }

  public void a(String paramString) {
    setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), paramString));
    this.d = paramString;
  }

  public void a(Color paramColor) {}

  public void a(Color paramColor, int paramInt) {}

  public void repaint() {
    super.repaint();
    for (byte ClassTypeInHPackage = 0;
        ClassTypeInHPackage < getComponentCount();
        ClassTypeInHPackage++) getComponent(ClassTypeInHPackage).repaint();
  }

  private void a(int paramInt1, int paramInt2) {
    ArrayList<JComboBox> arrayList = new ArrayList();
    ArrayList<String> arrayList1 = new ArrayList();
    for (byte ClassTypeInHPackage = 0;
        ClassTypeInHPackage < getComponentCount();
        ClassTypeInHPackage++) {
      JComboBox jComboBox = a(getComponent(ClassTypeInHPackage));
      if (jComboBox != null) {
        arrayList1.add("" + jComboBox.getSelectedItem());
        arrayList.add(jComboBox);
      }
    }
    br br = new br();
    O.a((bq) br, this.d, arrayList, arrayList1, this);
    add((Component) br);
    br.show(this, paramInt1, paramInt2);
  }

  private JComboBox a(Component paramComponent) {
    if (paramComponent instanceof JComboBox) return (JComboBox) paramComponent;
    if (paramComponent instanceof Container) {
      Container container = (Container) paramComponent;
      for (byte ClassTypeInHPackage = 0;
          ClassTypeInHPackage < container.getComponentCount();
          ClassTypeInHPackage++) {
        if (container.getComponent(ClassTypeInHPackage) instanceof JComboBox)
          return (JComboBox) container.getComponent(ClassTypeInHPackage);
      }
    }
    return null;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/bo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
