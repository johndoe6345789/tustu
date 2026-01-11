package aP;

import G.R;
import aE.a;
import com.efiAnalytics.ui.bV;
import java.awt.Cursor;
import javax.swing.JComboBox;
import z.i;

public class ab extends JComboBox {
  private String c = "Loading..";
  
  R a = null;
  
  i b = new i();
  
  public ab(R paramR) {
    this.a = paramR;
    setEditable(true);
    addItem((E)this.c);
    (new ac(this)).start();
  }
  
  public void a() {
    setCursor(Cursor.getPredefinedCursor(3));
    String[] arrayOfString = this.b.a();
    removeAllItems();
    for (byte b = 0; b < arrayOfString.length; b++)
      addItem((E)arrayOfString[b]); 
    if (this.a != null && a.A() != null) {
      setSelectedItem(a.A().n(this.a.c()));
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