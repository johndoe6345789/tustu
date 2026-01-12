package aP;

import G.R;
import G.Y;
import r.IOPropertiesUsingFile;
import r.RInterfaceIndia;
import s.SComponentGolf;
import u.SComponentGolf;

class SComponentGolfImplIopropertiesusingfile implements SComponentGolf {
  R IOPropertiesUsingFile;

  Y b;

  boolean c = false;

  hJ(hH paramhH, R paramR, Y paramY) {
    this.IOPropertiesUsingFile = paramR;
    this.b = paramY;
  }

  public String IOPropertiesUsingFile() {
    return "Use Controller Settings";
  }

  public String b() {
    String str;
    if (RInterfaceIndia.IOPropertiesUsingFile().IOPropertiesUsingFile("-=fds[pfds[pgd-0")) {
      str =
          SComponentGolf.b(
              "Save IOPropertiesUsingFile Restore Point and Update the "
                  + IOPropertiesUsingFile.b
                  + " settings with the current Controller settings.");
    } else {
      str =
          SComponentGolf.b(
              "Update the "
                  + IOPropertiesUsingFile.b
                  + " settings with the current Controller settings.");
    }
    return str;
  }

  public boolean d() {
    if (RInterfaceIndia.IOPropertiesUsingFile().IOPropertiesUsingFile("-=fds[pfds[pgd-0"))
      f.IOPropertiesUsingFile()
          .d(
              this.IOPropertiesUsingFile,
              SComponentGolf.b(
                  IOPropertiesUsingFile.b
                      + " settings before accepting Controller values in IOPropertiesUsingFile"
                      + " Difference Report."));
    if (hH.IOPropertiesUsingFile(this.d, this.IOPropertiesUsingFile, this.b, false)) {
      String str;
      if (RInterfaceIndia.IOPropertiesUsingFile().IOPropertiesUsingFile("-=fds[pfds[pgd-0")) {
        str =
            SComponentGolf.b("The Controller settings have been loaded successfully.")
                + "\n"
                + SComponentGolf.b(
                    "A Restore point has been saved containing the previous "
                        + IOPropertiesUsingFile.b
                        + " settings.");
      } else {
        str = SComponentGolf.b("The Controller settings have been loaded successfully.");
      }
      hq.IOPropertiesUsingFile().b(str);
      f.IOPropertiesUsingFile().e(this.IOPropertiesUsingFile);
      return true;
    }
    hq.IOPropertiesUsingFile().b("Failed to load the Controller settings. Check logs for details.");
    return false;
  }

  public boolean c() {
    return this.c;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
