package bD;

import bH.X;
import com.efiAnalytics.ui.eJ;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

class DefaultTableCellRendererExtension extends DefaultTableCellRenderer {
  Date a = null;
  
  public DefaultTableCellRendererExtension(c paramc) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(2005, 1, 1);
    this.a = calendar.getTime();
    setFont(new Font(getFont().getName(), 0, eJ.a(12)));
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    if (paramObject instanceof Icon) {
      setIcon((Icon)paramObject);
      setText("");
    } else if (paramObject instanceof Date) {
      setIcon((Icon)null);
      Date date = (Date)paramObject;
      setText(date.toString());
    } else if (paramObject != null && paramInt2 == F.e) {
      setIcon((Icon)null);
      Long long_ = (Long)paramObject;
      setText(X.a(long_.longValue()));
    } else if (paramObject != null) {
      setText(paramObject.toString());
      setIcon((Icon)null);
    } 
    if (paramBoolean1) {
      setBackground(this.b.getSelectionBackground());
      setForeground(this.b.getSelectionForeground());
    } else {
      setBackground(Color.white);
      setForeground(Color.BLACK);
    } 
    return this;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bD/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */