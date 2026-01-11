package ao;

import HInterfaceHotel.HInterfaceHotel;
import HInterfaceHotel.i;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class cR implements ActionListener {
  cR(cd paramcd) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    if ((paramActionEvent.getModifiers() & 0x1) != 0 && (paramActionEvent.getModifiers() & 0x2) != 0) {
      try {
        Desktop.getDesktop().edit(new File(HInterfaceHotel.a() + File.separator + i.k() + "LogFile.txt"));
      } catch (IOException iOException) {
        Logger.getLogger(cd.class.getName()).log(Level.SEVERE, (String)null, iOException);
      } 
    } else {
      this.a.d();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/cR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */