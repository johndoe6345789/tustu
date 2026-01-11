package aP;

import G.R;
import aE.PropertiesExtension;
import com.efiAnalytics.ui.bV;
import java.awt.Cursor;
import javax.swing.JComboBox;
import z.ZInterfaceIndia;

public class ab extends JComboBox {
  private String c = "Loading..";
  
  R PropertiesExtension = null;
  
  ZInterfaceIndia b = new ZInterfaceIndia();
  
  public ab(R paramR) {
    this.PropertiesExtension = paramR;
    setEditable(true);
    addItem((E)this.c);
    (new ac(this)).start();
  }
  
  public void PropertiesExtension() {
    setCursor(Cursor.getPredefinedCursor(3));
    String[] arrayOfString = this.b.PropertiesExtension();
    removeAllItems();
    for (byte b = 0; b < arrayOfString.length; b++)
      addItem((E)arrayOfString[b]); 
    if (this.PropertiesExtension != null && PropertiesExtension.A() != null) {
      setSelectedItem(PropertiesExtension.A().n(this.PropertiesExtension.c()));
    } else if (bV.d()) {
      setSelectedItem("COM1");
    } else {
      setSelectedItem("/dev/ttyS0");
    } 
    setCursor(Cursor.getDefaultCursor());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */