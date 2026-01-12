package business.binary_transformers;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;

public class JTextFieldExtension extends JTextField {
  ArrayList a = new ArrayList();

  private int b = 1000000;

  public JTextFieldExtension() {
    this("", 20);
  }

  public JTextFieldExtension(String paramString, int paramInt) {
    super(paramString, paramInt);
    addFocusListener(new bM(this));
    addKeyListener(new bN(this));
    setBorder(BorderFactory.createLoweredBevelBorder());
    a();
  }

  public Dimension getPreferredSize() {
    Dimension dimension = super.getPreferredSize();
    if (dimension.width < 60) dimension.setSize(60, dimension.height);
    return dimension;
  }

  public void a(bZ parambZ) {
    this.a.add(parambZ);
  }

  public void b(bZ parambZ) {
    this.a.remove(parambZ);
  }

  private void a() {
    ((AbstractDocument) getDocument()).setDocumentFilter(new bL(this));
  }

  private void b() {
    for (bZ bZ : this.a) bZ.b(getText());
  }

  public void a(int paramInt) {
    this.b = paramInt;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
