package bt;

import com.efiAnalytics.ui.do;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.BorderFactory;

public class NumericTextField extends do {
  ArrayList a = new ArrayList();
  
  private int b = 60;
  
  public A() {
    this("");
  }
  
  public A(String paramString) {
    super(paramString);
    addFocusListener(new B(this));
    addKeyListener(new C(this));
    setBorder(BorderFactory.createLoweredBevelBorder());
  }
  
  public Dimension getPreferredSize() {
    Dimension dimension = super.getPreferredSize();
    if (dimension.width < this.b)
      dimension.setSize(this.b, dimension.height); 
    return dimension;
  }
  
  public Dimension getMinimumSize() {
    Dimension dimension = super.getMinimumSize();
    if (dimension.width < this.b)
      dimension.setSize(this.b, dimension.height); 
    return dimension;
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    if (paramBoolean) {
      setBorder(BorderFactory.createLoweredBevelBorder());
    } else {
      setBorder(BorderFactory.createEmptyBorder());
    } 
  }
  
  public double a() {
    return f() ? Integer.parseInt(getText(), 16) : Double.parseDouble(getText());
  }
  
  public void a(bZ parambZ) {
    this.a.add(parambZ);
  }
  
  public void b(bZ parambZ) {
    this.a.remove(parambZ);
  }
  
  private void b() {
    for (bZ bZ : this.a)
      bZ.b(getText()); 
  }
  
  public void a(int paramInt) {
    this.b = paramInt;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/A.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */