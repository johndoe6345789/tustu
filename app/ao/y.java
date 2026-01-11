package ao;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class y extends JPanel {
  int a = -1;
  
  y(u paramu) {}
  
  public void setSize(int paramInt1, int paramInt2) {
    a(paramInt1);
    super.setSize(paramInt1, paramInt2);
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a(paramInt3);
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void a(int paramInt) {
    if (this.b.b != null) {
      byte b = 2;
      int i = paramInt / this.b.l;
      if (i < b)
        i = b; 
      this.b.o.b(i);
      this.b.o.a(0);
      if (i != this.a && getParent() != null) {
        z z = new z(this);
        SwingUtilities.invokeLater(z);
      } 
      this.a = i;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */