package business.binary_transformers;

import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

class JPanelExtensionInBtPackage extends JPanel {
  ArrayList a = new ArrayList();

  JPanelExtensionInBtPackage(an paraman) {}

  public void setEnabled(boolean paramBoolean) {
    bV.a(this, paramBoolean);
  }

  public Component add(Component paramComponent) {
    if (paramComponent instanceof bc) this.a.add((bc) paramComponent);
    return super.add(paramComponent);
  }

  public void paint(Graphics paramGraphics) {
    paramGraphics.setColor(Color.BLACK);
    paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    paintChildren(paramGraphics);
  }

  public void a() {
    for (bc bc : this.a) bc.close();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/aI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
