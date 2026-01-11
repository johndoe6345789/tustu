package ao;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

final class hS extends AbstractAction {
  hS(Object[] paramArrayOfObject) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JTextComponent jTextComponent = (JTextComponent)paramActionEvent.getSource();
    String str1 = (String)JOptionPane.showInputDialog(jTextComponent, null, "Insert Field Name", -1, null, this.a, this.a[0]);
    if (str1 == null)
      return; 
    String str2 = jTextComponent.getText();
    StringBuilder stringBuilder = new StringBuilder();
    if (jTextComponent.getSelectionEnd() > jTextComponent.getSelectionStart()) {
      String str3 = str2.substring(0, jTextComponent.getSelectionStart());
      String str4 = str2.substring(jTextComponent.getSelectionEnd(), str2.length());
      if (!str3.endsWith("[") && !str4.startsWith("]"))
        str1 = "[" + str1 + "]"; 
      int i = jTextComponent.getSelectionStart();
      stringBuilder.append(str3);
      stringBuilder.append(str1);
      stringBuilder.append(str4);
      jTextComponent.setText(stringBuilder.toString());
      jTextComponent.setCaretPosition(i);
      jTextComponent.select(i + str1.length(), i + str1.length());
    } else {
      str1 = "[" + str1 + "]";
      int i = jTextComponent.getCaretPosition();
      stringBuilder.append(str2);
      stringBuilder.insert(i, str1);
      jTextComponent.setText(stringBuilder.toString());
      jTextComponent.setCaretPosition(i + str1.length());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */