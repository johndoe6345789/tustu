package aP;

import java.util.EventObject;
import javax.swing.DefaultCellEditor;
import javax.swing.JTextField;

class jq extends DefaultCellEditor {
  jq(jc paramjc) {
    super(new JTextField());
    JTextField jTextField = (JTextField)getComponent();
    jTextField.setFont(paramjc.getFont());
    jTextField.setHorizontalAlignment(0);
    jTextField.addKeyListener(new jr(this, paramjc));
  }
  
  public boolean shouldSelectCell(EventObject paramEventObject) {
    boolean bool = super.shouldSelectCell(paramEventObject);
    if (bool)
      a(); 
    return bool;
  }
  
  public void a() {
    JTextField jTextField = (JTextField)getComponent();
    jTextField.selectAll();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/jq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */