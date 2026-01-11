package bF;

import bH.X;
import com.efiAnalytics.ui.NumericTextField;
import java.util.EventObject;
import javax.swing.DefaultCellEditor;
import javax.swing.JTextField;

class DefaultCellEditorExtension extends DefaultCellEditor {
  private int b = 0;
  
  DefaultCellEditorExtension(D paramD) {
    super((JTextField)new NumericTextField());
    NumericTextField numericTextField = (NumericTextField)getComponent();
    numericTextField.setFont(paramD.getFont());
    numericTextField.setHorizontalAlignment(0);
    numericTextField.addKeyListener(new M(this, paramD));
  }
  
  public boolean shouldSelectCell(EventObject paramEventObject) {
    boolean bool = super.shouldSelectCell(paramEventObject);
    if (bool)
      a(); 
    return bool;
  }
  
  public void a() {
    NumericTextField numericTextField = (NumericTextField)getComponent();
    y y = (y)this.a.getModel();
    int i = y.a(this.b, this.b).c();
    numericTextField.setText(X.b(numericTextField.getText(), i));
    numericTextField.selectAll();
  }
  
  public void a(int paramInt) {
    this.b = paramInt;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bF/L.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */