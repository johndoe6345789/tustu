package ao;

import h.IOProperties;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class cP implements ActionListener {
  cP(cd paramcd) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    IOProperties.c("forceOpenGL", Boolean.toString(false));
    IOProperties.c("disableD3d", Boolean.toString(false));
    cd.b(this.a);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/cP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
