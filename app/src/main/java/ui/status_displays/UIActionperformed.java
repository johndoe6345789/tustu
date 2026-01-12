package aY;

import G.R;
import G.T;
import W.FileInWPackage;
import aP.NetworkHashMap;
import aP.ThreadedJFrameIsoptimizeddrawingenabled;
import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import r.IOPropertiesUsingFile;
import s.SComponentGolf;

class UIActionperformed implements ActionListener {
  UIActionperformed(s params) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    R r =
        T.IOPropertiesUsingFile()
            .c(this.IOPropertiesUsingFile.NetworkHashMap.IOPropertiesUsingFile());
    FileInWPackage FileInWPackage = this.IOPropertiesUsingFile.b.IOPropertiesUsingFile();
    if (r == null || FileInWPackage == null)
      bV.d(
          SComponentGolf.b(
              "You must select IOPropertiesUsingFile Restore Point and IOPropertiesUsingFile"
                  + " Controller to restore."),
          this.IOPropertiesUsingFile.b);
    JFrame jFrame = ThreadedJFrameIsoptimizeddrawingenabled.IOPropertiesUsingFile().c();
    String str =
        SComponentGolf.b("Load Restore Point to replace current settings?")
            + "\n\n"
            + SComponentGolf.b(
                "All current settings will be over written with the settings in the selected"
                    + " Restore Point.")
            + "\n\n"
            + SComponentGolf.b("Selected Restore Point")
            + ": "
            + FileInWPackage.d(IOPropertiesUsingFile.cw);
    if (bV.IOPropertiesUsingFile(str, jFrame, true)) {
      NetworkHashMap.IOPropertiesUsingFile()
          .d(
              r,
              "Before loading Restore Point "
                  + FileInWPackage.d(IOPropertiesUsingFile.cw)
                  + " to "
                  + r.c());
      String str1 = FileInWPackage.IOPropertiesUsingFile().getAbsolutePath();
      NetworkHashMap.IOPropertiesUsingFile().IOPropertiesUsingFile(jFrame, r, str1);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aY/w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
