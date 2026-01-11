package bF;

import bH.X;
import com.efiAnalytics.ui.do;
import java.util.EventObject;
import javax.swing.DefaultCellEditor;
import javax.swing.JTextField;

class L extends DefaultCellEditor {
  private int b = 0;
  
  L(D paramD) {
    super((JTextField)new do());
    do do = (do)getComponent();
    do.setFont(paramD.getFont());
    do.setHorizontalAlignment(0);
    do.addKeyListener(new M(this, paramD));
  }
  
  public boolean shouldSelectCell(EventObject paramEventObject) {
    boolean bool = super.shouldSelectCell(paramEventObject);
    if (bool)
      a(); 
    return bool;
  }
  
  public void a() {
    do do = (do)getComponent();
    y y = (y)this.a.getModel();
    int i = y.a(this.b, this.b).c();
    do.setText(X.b(do.getText(), i));
    do.selectAll();
  }
  
  public void a(int paramInt) {
    this.b = paramInt;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bF/L.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */