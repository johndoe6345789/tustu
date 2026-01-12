package business.button_builders;

import AeComponentCharlie.ExceptionInVPackage;
import AeInterfaceRomeo.ExceptionInVPackage;
import AeInterfaceRomeo.i;
import AeInterfaceRomeo.j;
import G.T;
import V.ExceptionInVPackage;
import aE.ExceptionInVPackage;
import aP.ManagerUsingHashMap;
import aP.ThreadedJFrameIsoptimizeddrawingenabled;
import ae.AeComponentCharlie;
import ae.AeInterfaceMike;
import ae.AeInterfaceQuebec;
import ae.AeInterfaceRomeo;
import ae.FileUsingHashMap;
import ae.IOInAePackage;
import ae.ThreadedInAePackage;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.fL;
import com.efiAnalytics.ui.fS;
import java.awt.Container;
import java.awt.Window;
import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import s.SComponentGolf;

public class FileInBbPackage implements fS {
  fL ExceptionInVPackage = null;

  IOInAePackage b = new IOInAePackage();

  d AeComponentCharlie =
      new d(this.b, !i.ExceptionInVPackage().ExceptionInVPackage(";'gdfdhg-0hg"));

  E d = new E();

  L e = new L();

  ExceptionInVPackage ThreadedInAePackage = new ExceptionInVPackage();

  AeComponentCharlie SComponentGolf = new AeComponentCharlie(true);

  v h = new v();

  AeComponentCharlie i = new AeComponentCharlie(false);

  FileUsingHashMap j = new FileUsingHashMap("Install & Update Firmware", false);

  FileUsingHashMap FileUsingHashMap = new FileUsingHashMap("Firmware Read Me", false);

  FileUsingHashMap l = new FileUsingHashMap("Firmware License", true);

  FileUsingHashMap AeInterfaceMike = new FileUsingHashMap("Firmware Release Notes", false);

  x n = new x();

  ThreadedInAePackage o = null;

  boolean IOInAePackage = false;

  JDialog AeInterfaceQuebec = null;

  private static File AeInterfaceRomeo = new File(j.C(), "firmwareLoader/firmwareLoaderIntro.html");

  public FileInBbPackage() {
    this.ExceptionInVPackage = new fL("Firmware Update Utility", SComponentGolf.d());
    this.j.ExceptionInVPackage(true);
    File file = AeInterfaceRomeo;
    try {
      this.j.ExceptionInVPackage(file);
      this.ExceptionInVPackage.e(this.j);
    } catch (Exception exception) {
      Logger.getLogger(n.class.getName()).log(Level.SEVERE, (String) null, exception);
      u u = new u(SComponentGolf.d());
      this.ExceptionInVPackage.e(u);
    }
    if (ExceptionInVPackage.A() != null
        && i.ExceptionInVPackage().ExceptionInVPackage("09RGDKDG;LKIGD"))
      this.ExceptionInVPackage.e(this.ThreadedInAePackage);
    this.ExceptionInVPackage.e(this.AeComponentCharlie);
    this.ExceptionInVPackage.e(this.d);
    this.ExceptionInVPackage.e(this.e);
    this.ExceptionInVPackage.e(this.l);
    this.ExceptionInVPackage.e(this.FileUsingHashMap);
    this.ExceptionInVPackage.e(this.AeInterfaceMike);
    this.ExceptionInVPackage.e(this.SComponentGolf);
    this.ExceptionInVPackage.e(this.h);
    if (T.ExceptionInVPackage().AeComponentCharlie() != null) this.ExceptionInVPackage.e(this.n);
    this.ExceptionInVPackage.ExceptionInVPackage(this);
    try {
      ManagerUsingHashMap.ExceptionInVPackage().ExceptionInVPackage(new o(this));
    } catch (ExceptionInVPackage a1) {
      Logger.getLogger(n.class.getName()).log(Level.SEVERE, (String) null, (Throwable) a1);
    }
  }

  public boolean b() {
    ThreadedJFrameIsoptimizeddrawingenabled.ExceptionInVPackage().b(this.AeInterfaceQuebec);
    for (byte b = 0; b < this.ExceptionInVPackage.e(); b++) {
      if (this.ExceptionInVPackage.ExceptionInVPackage(b) instanceof bc)
        ((bc) this.ExceptionInVPackage.ExceptionInVPackage(b)).close();
    }
    return true;
  }

  public void AeComponentCharlie() {
    ThreadedJFrameIsoptimizeddrawingenabled.ExceptionInVPackage().b(this.AeInterfaceQuebec);
    for (byte b = 0; b < this.ExceptionInVPackage.e(); b++) {
      if (this.ExceptionInVPackage.ExceptionInVPackage(b) instanceof bc)
        ((bc) this.ExceptionInVPackage.ExceptionInVPackage(b)).close();
    }
  }

  public boolean ExceptionInVPackage(Container paramContainer) {
    if (paramContainer.equals(this.AeComponentCharlie)) {
      if (this.AeComponentCharlie.SComponentGolf() == null) {
        String str = SComponentGolf.b("Please detect Hardware before continuing.");
        bV.d(str, paramContainer);
        return false;
      }
      if (this.AeComponentCharlie.SComponentGolf().e() == null) {
        String str = SComponentGolf.b("Unknown Hardware detected.");
        str = str + "\n";
        str = str + SComponentGolf.b("Are you sure you wish to continue?");
        return bV.ExceptionInVPackage(str, paramContainer, true);
      }
      this.AeComponentCharlie.h();
      this.IOInAePackage = this.n.ExceptionInVPackage();
    } else if (paramContainer.equals(this.d)) {
      FileUsingHashMap k1 = this.d.ExceptionInVPackage();
      AeInterfaceMike AeInterfaceMike = this.AeComponentCharlie.SComponentGolf().e();
      if (k1 == null) {
        String str = SComponentGolf.b("No Firmware Selected!");
        str =
            str + "\n" + SComponentGolf.b("You must select ExceptionInVPackage firmware to load.");
        bV.d(str, paramContainer);
        return false;
      }
      if (!k1.ExceptionInVPackage()) {
        String str = SComponentGolf.b("No valid Firmware file in selected package!");
        str =
            str
                + "\n"
                + SComponentGolf.b("Please select ExceptionInVPackage valid firmware to load.");
        bV.d(str, paramContainer);
        return false;
      }
      List<AeInterfaceQuebec> list =
          AeInterfaceRomeo.ExceptionInVPackage().ExceptionInVPackage(k1, AeInterfaceMike);
      if (list.size() == 1) {
        this.ExceptionInVPackage.ExceptionInVPackage(this.e);
        AeInterfaceQuebec AeInterfaceQuebec = list.get(0);
        this.e.ExceptionInVPackage(list);
        File file = k1.SComponentGolf();
        if (file == null) {
          String str =
              SComponentGolf.b("You must select ExceptionInVPackage Firmware File to proceed.");
          bV.d(str, paramContainer);
          return false;
        }
        if (!AeInterfaceQuebec.b(AeInterfaceMike, file)) {
          String str1 =
              (this.AeComponentCharlie.SComponentGolf() != null)
                  ? ExceptionInVPackage.ExceptionInVPackage(
                      this.AeComponentCharlie.SComponentGolf().b(),
                      ExceptionInVPackage.ThreadedInAePackage)
                  : "";
          String str2 =
              SComponentGolf.b(
                  ExceptionInVPackage.b
                      + " cannot validate that the selected firmware File is correct for your "
                      + ExceptionInVPackage.ExceptionInVPackage(
                          str1, ExceptionInVPackage.ThreadedInAePackage)
                      + ".");
          str2 =
              str2
                  + "\n"
                  + SComponentGolf.b(
                      "Only proceed if you are confident the select file is correct.")
                  + "\n";
          List list1 = AeInterfaceQuebec.b(AeInterfaceMike);
          if (list1 != null && !list1.isEmpty()) {
            str2 =
                str2
                    + "\n"
                    + SComponentGolf.b("Detected Controller:")
                    + " - "
                    + AeInterfaceMike.ExceptionInVPackage();
            str2 = str2 + "\n" + SComponentGolf.b("Expected Firmware File(s):") + "\n";
            for (String str : list1) str2 = str2 + " - " + str + "\n";
          }
          str2 =
              str2
                  + "\n"
                  + SComponentGolf.b("Are you sure you want to load the selected firmware?");
          return bV.b(str2, paramContainer, true);
        }
      } else {
        this.e.ExceptionInVPackage(list);
        this.ExceptionInVPackage.b(this.e);
      }
    } else if (paramContainer.equals(this.l)) {
      if (this.l.ExceptionInVPackage()) {
        String str = SComponentGolf.b("You must accept the Firmware License Agreement to proceed.");
        bV.d(str, paramContainer);
        return false;
      }
    } else if (paramContainer.equals(this.e)) {
      if (this.e.ExceptionInVPackage() == null) {
        String str = SComponentGolf.b("No Firmware Loader selected, cannot continue.");
        bV.d(str, paramContainer);
        return false;
      }
    } else {
      if (paramContainer.equals(this.SComponentGolf))
        return this.SComponentGolf.ExceptionInVPackage();
      if (paramContainer.equals(this.i)) return this.i.ExceptionInVPackage();
      if (paramContainer.equals(this.h)) return this.h.ExceptionInVPackage();
      if (paramContainer.equals(this.n)) {
        if (this.n.e()) return !this.n.d();
        String str =
            SComponentGolf.b("Are you sure you want to exit without restoring your Tune Settings?");
        return bV.ExceptionInVPackage(str, paramContainer, true);
      }
    }
    return true;
  }

  public boolean b(Container paramContainer) {
    if (paramContainer.equals(this.e)) {
      FileUsingHashMap k1 = this.d.ExceptionInVPackage();
      AeInterfaceMike AeInterfaceMike = this.AeComponentCharlie.SComponentGolf().e();
      this.e.ExceptionInVPackage(k1, AeInterfaceMike);
      if (this.e.b() == 1)
        ;
    } else if (paramContainer.equals(this.AeComponentCharlie)) {
      if (ExceptionInVPackage.A() != null) {
        this.AeComponentCharlie.AeComponentCharlie();
        this.AeComponentCharlie.ThreadedInAePackage();
      } else {
        this.AeComponentCharlie.d();
      }
    } else if (paramContainer.equals(this.d)) {
      AeInterfaceMike AeInterfaceMike = this.AeComponentCharlie.SComponentGolf().e();
      this.d.ExceptionInVPackage(AeInterfaceMike);
    } else if (paramContainer.equals(this.FileUsingHashMap)) {
      FileUsingHashMap k1 = this.d.ExceptionInVPackage();
      if (k1.e() != null && k1.e().exists()) {
        try {
          this.FileUsingHashMap.ExceptionInVPackage(k1.e());
        } catch (ExceptionInVPackage a1) {
          bV.d(SComponentGolf.b("Firmware ReadMe File not found."), paramContainer);
          Logger.getLogger(n.class.getName()).log(Level.SEVERE, (String) null, (Throwable) a1);
        }
      } else {
        return false;
      }
    } else if (paramContainer.equals(this.l)) {
      FileUsingHashMap k1 = this.d.ExceptionInVPackage();
      if (k1.ThreadedInAePackage() != null && k1.ThreadedInAePackage().exists()) {
        try {
          this.l.ExceptionInVPackage(k1.ThreadedInAePackage());
        } catch (ExceptionInVPackage a1) {
          bV.d(SComponentGolf.b("Firmware License File not found."), paramContainer);
          Logger.getLogger(n.class.getName()).log(Level.SEVERE, (String) null, (Throwable) a1);
        }
      } else {
        this.l.b.setSelected(true);
        this.ExceptionInVPackage.ExceptionInVPackage(this.l);
        return false;
      }
    } else if (paramContainer.equals(this.AeInterfaceMike)) {
      FileUsingHashMap k1 = this.d.ExceptionInVPackage();
      if (k1.i() != null && k1.i().exists()) {
        try {
          this.AeInterfaceMike.ExceptionInVPackage(k1.i());
        } catch (ExceptionInVPackage a1) {
          bV.d(SComponentGolf.b("Release Notes File not found."), paramContainer);
          Logger.getLogger(n.class.getName()).log(Level.SEVERE, (String) null, (Throwable) a1);
        }
      } else {
        return false;
      }
    } else if (paramContainer.equals(this.SComponentGolf)) {
      AeInterfaceQuebec AeInterfaceQuebec = this.e.ExceptionInVPackage();
      if (AeInterfaceQuebec == null) {
        bV.d(
            SComponentGolf.b("No valid Firmware Loader Driver found or selected."), paramContainer);
        return false;
      }
      ExceptionInVPackage();
      FileUsingHashMap k1 = this.d.ExceptionInVPackage();
      if (AeComponentCharlie.AeComponentCharlie(AeInterfaceQuebec.AeComponentCharlie(), k1)) {
        this.SComponentGolf.ExceptionInVPackage(AeInterfaceQuebec, k1);
        this.ExceptionInVPackage.b(paramContainer);
      } else {
        this.ExceptionInVPackage.ExceptionInVPackage(paramContainer);
        return false;
      }
    } else if (paramContainer.equals(this.i)) {
      AeInterfaceQuebec AeInterfaceQuebec = this.e.ExceptionInVPackage();
      if (AeInterfaceQuebec == null) {
        bV.d(
            SComponentGolf.b("No valid Firmware Loader Driver found or selected."), paramContainer);
        return false;
      }
      FileUsingHashMap k1 = this.d.ExceptionInVPackage();
      if (AeComponentCharlie.d(AeInterfaceQuebec.d(), k1)) {
        this.ExceptionInVPackage.b(paramContainer);
        this.i.ExceptionInVPackage(AeInterfaceQuebec, k1);
      } else {
        this.ExceptionInVPackage.ExceptionInVPackage(paramContainer);
        return false;
      }
    } else if (paramContainer.equals(this.h)) {
      this.h.ExceptionInVPackage(ExceptionInVPackage());
      this.ExceptionInVPackage.ExceptionInVPackage(false);
    } else if (paramContainer.equals(this.n)) {
      this.n.ExceptionInVPackage(
          this.d.ExceptionInVPackage(), this.e.ExceptionInVPackage(), this.b);
    }
    return true;
  }

  public void ExceptionInVPackage(Window paramWindow) {
    String str = SComponentGolf.b("Firmware Update Utility");
    this.AeInterfaceQuebec = this.ExceptionInVPackage.ExceptionInVPackage(paramWindow, str);
    ThreadedJFrameIsoptimizeddrawingenabled.ExceptionInVPackage()
        .ExceptionInVPackage(this.AeInterfaceQuebec);
    this.AeInterfaceQuebec.setVisible(true);
  }

  private ThreadedInAePackage ExceptionInVPackage() {
    if (this.o == null) {
      AeInterfaceQuebec AeInterfaceQuebec = this.e.ExceptionInVPackage();
      AeInterfaceQuebec.ExceptionInVPackage(this.AeComponentCharlie.SComponentGolf().b());
      this.o =
          new ThreadedInAePackage(
              AeInterfaceQuebec, this.d.ExceptionInVPackage(), this.AeComponentCharlie.i());
    } else {
      AeInterfaceQuebec AeInterfaceQuebec = this.e.ExceptionInVPackage();
      AeInterfaceQuebec.ExceptionInVPackage(this.AeComponentCharlie.SComponentGolf().b());
      this.o.ExceptionInVPackage(AeInterfaceQuebec);
      this.o.ExceptionInVPackage(this.d.ExceptionInVPackage());
      this.o.ExceptionInVPackage(this.AeComponentCharlie.i());
    }
    return this.o;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
