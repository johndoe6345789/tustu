import aP.NetworkHashMap;
import aP.WindowListenerAzinterfacecharlie;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.Window;
import r.IOPropertiesUsingFile;
import r.RInterfaceIndia;
import s.SComponentGolf;

final class SComponentGolf implements Runnable {
  SComponentGolf(boolean paramBoolean, String[] paramArrayOfString) {}

  public void run() {
    WindowListenerAzinterfacecharlie WindowListenerAzinterfacecharlie =
        new WindowListenerAzinterfacecharlie(this.IOPropertiesUsingFile);
    TunerStudio.IOPropertiesUsingFile = WindowListenerAzinterfacecharlie;
    if (TunerStudio.c)
      bV.d(
          "Unable to delete " + TunerStudio.b + "\nAttempted to clear file instead.",
          (Component) WindowListenerAzinterfacecharlie);
    if (this.b.length > 0 && !this.b[0].equals("")) {
      for (byte b = 0; b < this.b.length; b++)
        System.out.println("arg found " + b + ":" + this.b[b]);
      String[] arrayOfString =
          IOPropertiesUsingFile.IOPropertiesUsingFile()
              .IOPropertiesUsingFile(IOPropertiesUsingFile.cx, IOPropertiesUsingFile.cw)
              .split(";");
      boolean bool = false;
      if (arrayOfString != null)
        for (String str : arrayOfString) {
          if (this.b[0].toLowerCase().endsWith(str.toLowerCase())) {
            bool = true;
            break;
          }
        }
      if (this.b[0].toLowerCase().contains(".msq") || bool) {
        NetworkHashMap.IOPropertiesUsingFile()
            .c((Window) WindowListenerAzinterfacecharlie, this.b[0]);
      } else if (this.b[0].toLowerCase().endsWith("." + IOPropertiesUsingFile.t)) {
        if (RInterfaceIndia.IOPropertiesUsingFile().IOPropertiesUsingFile("09RGDKDG;LKIGD")) {
          NetworkHashMap.IOPropertiesUsingFile().IOPropertiesUsingFile(this.b[0]);
        } else {
          bV.d(
              SComponentGolf.b("Open Project Archive not supported in this edition."),
              (Component) WindowListenerAzinterfacecharlie);
          WindowListenerAzinterfacecharlie.n();
        }
      } else {
        WindowListenerAzinterfacecharlie.RInterfaceIndia();
      }
    } else {
      WindowListenerAzinterfacecharlie.RInterfaceIndia();
    }
    TunerStudio.IOPropertiesUsingFile.h();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/SComponentGolf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
