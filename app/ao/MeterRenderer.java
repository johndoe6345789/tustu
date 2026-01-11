package ao;

import java.awt.BorderLayout;
import java.io.File;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

class bI extends JPanel {
  private File d;
  
  JCheckBox a;
  
  JToggleButton b;
  
  bI(bE parambE, File paramFile) {
    Icon icon;
    this.d = paramFile;
    this.a = new JCheckBox();
    boolean bool = false;
    if (!parambE.c.isEmpty() && ((File)parambE.c.get(0)).equals(paramFile)) {
      icon = parambE.e;
      bool = true;
    } else if (parambE.c.size() > 1 && ((File)parambE.c.get(1)).equals(paramFile)) {
      icon = parambE.f;
      bool = true;
    } else {
      icon = parambE.d;
    } 
    this.b = new JToggleButton(paramFile.getName(), icon);
    this.b.setSelected(bool);
    this.b.addActionListener(new bJ(this, parambE));
    setLayout(new BorderLayout());
    add("West", this.a);
    add("Center", this.b);
  }
  
  public boolean a() {
    return this.a.isSelected();
  }
  
  public File b() {
    return this.d;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/bI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */