package aP;

import G.Abstract;
import G.ArrayListExceptionprintstacktraceInGPackage;
import G.GInterfaceAi;
import G.GInterfaceCb;
import G.Manager;
import G.ManagerUsingArrayList;
import G.R;
import G.RInterfaceIndia;
import G.Y;
import G.z;
import V.ExceptionPrintstacktrace;
import W.ExceptionExtension;
import W.NetworkExceptionprintstacktrace;
import ax.ExceptionInAxPackage;
import bH.D;
import bH.ac;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.Window;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import r.IOPropertiesUsingFile;
import r.RInterfaceIndia;
import u.JDialogExtensionInUPackage;
import u.UInterfaceFoxtrot;

public class ManagerInApPackage implements GInterfaceCb {
  ArrayList IOPropertiesUsingFile = new ArrayList();

  private static final Map b = new HashMap<>();

  public boolean IOPropertiesUsingFile(Window paramWindow, R paramR, String paramString) {
    Y y = paramR.JDialogExtensionInUPackage().IOPropertiesUsingFile();
    R r = paramR.IOPropertiesUsingFile(y);
    z z = new z(ac.IOPropertiesUsingFile().b());
    try {
      NetworkExceptionprintstacktrace NetworkExceptionprintstacktrace =
          new NetworkExceptionprintstacktrace();
      NetworkExceptionprintstacktrace.IOPropertiesUsingFile(r, paramString);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.IOPropertiesUsingFile(
          "Error opening Saved tune.", (Exception) ExceptionPrintstacktrace, paramWindow);
    } catch (ExceptionExtension ExceptionExtension) {
      D.IOPropertiesUsingFile(
          "Password Protected Tune Files. Please configure File Passwords.\n"
              + "Skipping Difference Report.",
          (Exception) ExceptionExtension,
          paramWindow);
      return false;
    }
    ArrayList arrayList = z.IOPropertiesUsingFile(paramR, paramR.JDialogExtensionInUPackage(), y);
    if (arrayList.size() == 0) return false;
    IOPropertiesUsingFile(arrayList, paramR, y, new File(paramString));
    this.IOPropertiesUsingFile.clear();
    return true;
  }

  public boolean IOPropertiesUsingFile(R paramR, String paramString) {
    Y y = paramR.JDialogExtensionInUPackage().IOPropertiesUsingFile();
    R r = paramR.IOPropertiesUsingFile(y);
    z z = new z(ac.IOPropertiesUsingFile().b());
    try {
      NetworkExceptionprintstacktrace NetworkExceptionprintstacktrace =
          new NetworkExceptionprintstacktrace();
      NetworkExceptionprintstacktrace.IOPropertiesUsingFile(r, paramString);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.IOPropertiesUsingFile(
          "isDifferenceDetected:: Returning true IOPropertiesUsingFile file is different, Error"
              + " opening Saved tune:\n"
              + paramString);
      D.IOPropertiesUsingFile(
          "Saved tune file, it appears corrupt:\n" + paramString,
          (Exception) ExceptionPrintstacktrace,
          null);
      ExceptionPrintstacktrace.printStackTrace();
      return true;
    } catch (ExceptionExtension ExceptionExtension) {
      D.IOPropertiesUsingFile(
          "Password Protected Tune Files. Please configure File Passwords.\n"
              + "Skipping Difference Report.",
          (Exception) ExceptionExtension,
          null);
      return false;
    }
    ArrayList arrayList = z.IOPropertiesUsingFile(paramR, paramR.JDialogExtensionInUPackage(), y);
    int RInterfaceIndia = paramR.JDialogExtensionInUPackage().k();
    int j = r.JDialogExtensionInUPackage().l();
    double d = j / RInterfaceIndia;
    return (!arrayList.isEmpty() || d >= 0.4D);
  }

  public boolean IOPropertiesUsingFile(
      ArrayList paramArrayList, R paramR, Y paramY, String paramString) {
    boolean bool2;
    boolean bool1 =
        IOPropertiesUsingFile.IOPropertiesUsingFile()
            .c(
                IOPropertiesUsingFile.bu,
                IOPropertiesUsingFile.ArrayListExceptionprintstacktraceInGPackage);
    if (!bool1) {
      IOPropertiesUsingFile(paramR, paramY, false);
      return false;
    }
    z z = new z(ac.IOPropertiesUsingFile().b());
    ArrayList arrayList1 = z.IOPropertiesUsingFile(paramR, paramArrayList);
    ArrayList arrayList2 = z.b(paramR, arrayList1);
    Iterator<ArrayListExceptionprintstacktraceInGPackage> iterator = arrayList2.iterator();
    while (iterator.hasNext()) {
      ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage =
          iterator.next();
      boolean bool =
          (ArrayListExceptionprintstacktraceInGPackage.T()
                  || ArrayListExceptionprintstacktraceInGPackage.S()
                  || ArrayListExceptionprintstacktraceInGPackage.L())
              ? true
              : false;
      List list = ArrayListExceptionprintstacktraceInGPackage.G();
      if (!list.isEmpty()) {
        for (Abstract Abstract : ArrayListExceptionprintstacktraceInGPackage.G()) {
          if (Abstract.b() != null && IOPropertiesUsingFile(paramArrayList, Abstract.b())) {
            boolean bool3 = false;
            try {
              bool3 =
                  (Abstract.aJ() == null
                          || Abstract.aJ().isEmpty()
                          || RInterfaceIndia.IOPropertiesUsingFile(
                                  Abstract.aJ(), (GInterfaceAi) paramR)
                              != 0.0D)
                      ? true
                      : false;
            } catch (ExceptionInAxPackage u) {
              D.IOPropertiesUsingFile("Unable to evaluate enable condition: " + Abstract.aJ());
            }
            if (!bool3) {
              Manager Manager = paramR.c(Abstract.b());
              paramArrayList.remove(Manager);
            }
          }
        }
        if (!bool) iterator.remove();
        continue;
      }
      if (!ArrayListExceptionprintstacktraceInGPackage.T()
          && !ArrayListExceptionprintstacktraceInGPackage.S()
          && !ArrayListExceptionprintstacktraceInGPackage.L()) iterator.remove();
    }
    if (arrayList2.isEmpty() || paramArrayList.isEmpty()) {
      IOPropertiesUsingFile(paramR, paramY, false);
      return false;
    }
    if (!RInterfaceIndia.IOPropertiesUsingFile().IOPropertiesUsingFile("67r67r8yhdrtrbyuk")) {
      bool2 = b(paramArrayList, paramR, paramY, paramString);
    } else {
      ArrayList<hN> arrayList = new ArrayList();
      hN hN = new hN(this, paramR, paramY);
      arrayList.add(hN);
      hK hK = new hK(this, paramR);
      arrayList.add(hK);
      hJ hJ = new hJ(this, paramR, paramY);
      arrayList.add(hJ);
      bool2 = IOPropertiesUsingFile(paramArrayList, paramR, paramY, arrayList, null);
    }
    return bool2;
  }

  private boolean IOPropertiesUsingFile(ArrayList paramArrayList, String paramString) {
    for (Manager Manager : paramArrayList) {
      if (Manager.aL().equals(paramString)) return true;
    }
    return false;
  }

  public void IOPropertiesUsingFile(ArrayList paramArrayList, R paramR, Y paramY, File paramFile) {
    ArrayList<hI> arrayList = new ArrayList();
    hI hI = new hI(this);
    arrayList.add(hI);
    hM hM = new hM(this, paramR, paramArrayList);
    arrayList.add(hM);
    hL hL = new hL(this, paramR, paramY, paramFile);
    arrayList.add(hL);
    IOPropertiesUsingFile(paramArrayList, paramR, paramY, arrayList, paramFile);
  }

  private boolean IOPropertiesUsingFile(
      ArrayList paramArrayList1, R paramR, Y paramY, ArrayList paramArrayList2, File paramFile) {
    R r = paramR.IOPropertiesUsingFile(paramY);
    JFrame jFrame = dd.IOPropertiesUsingFile().c();
    JDialogExtensionInUPackage JDialogExtensionInUPackage = null;
    try {
      JDialogExtensionInUPackage =
          new JDialogExtensionInUPackage(
              jFrame, paramR, r, paramArrayList1, paramArrayList2, paramFile);
      for (UInterfaceFoxtrot UInterfaceFoxtrot : this.IOPropertiesUsingFile) {
        JDialogExtensionInUPackage.b(UInterfaceFoxtrot);
        JDialogExtensionInUPackage.IOPropertiesUsingFile(UInterfaceFoxtrot);
      }
      if (JDialogExtensionInUPackage.IOPropertiesUsingFile()) return false;
      JDialogExtensionInUPackage h1 = (JDialogExtensionInUPackage) b.get(paramR.c());
      if (h1 != null) h1.dispose();
      b.put(paramR.c(), JDialogExtensionInUPackage);
      bV.IOPropertiesUsingFile(jFrame, (Component) JDialogExtensionInUPackage);
      JDialogExtensionInUPackage.setVisible(true);
      return JDialogExtensionInUPackage.b();
    } finally {
      if (JDialogExtensionInUPackage != null && JDialogExtensionInUPackage.isVisible())
        JDialogExtensionInUPackage.dispose();
      JDialogExtensionInUPackage = null;
      b.remove(paramR.c());
    }
  }

  private boolean b(ArrayList<Manager> paramArrayList, R paramR, Y paramY, String paramString) {
    long l = System.currentTimeMillis();
    String str =
        "There are differences between your offline tune and that\n"
            + "which was last saved to the controller.\n"
            + "For advanced difference reports with side by side values, \n"
            + "Go to EFIAnalytics.com and upgrade "
            + IOPropertiesUsingFile.b
            + " today!\n\nA basic comparison found "
            + paramArrayList.size()
            + " Settings with different values \n"
            + "on the Controller than in the currently loaded tune ("
            + IOPropertiesUsingFile.cw
            + ") \nfor "
            + paramR.c()
            + "\n\n"
            + "Would you like to send your offline values to the Controller?\n\n"
            + "Different Settings:\n";
    z z = new z(ac.IOPropertiesUsingFile().b());
    D.c("Time to get Panels = " + (System.currentTimeMillis() - l) + "ms.");
    byte b1 = 20;
    for (byte b2 = 0; b2 < paramArrayList.size(); b2++) {
      str = str + ((Manager) paramArrayList.get(b2)).aL();
      if (b2 == b1 - 1 && paramArrayList.size() - 1 > b2) {
        str = str + "\n" + (paramArrayList.size() - b2 - 1) + " more...";
        break;
      }
      if (b2 < paramArrayList.size() - 1 && b2 < b1) str = str + ", ";
      if (b2 > 0 && (b2 + 1) % 5 == 0) str = str + "\n";
    }
    String[] arrayOfString = {
      "Send Local Settings", "Use Controller Settings", "Get Graphic Difference Reports"
    };
    int RInterfaceIndia;
    for (RInterfaceIndia = 2;
        RInterfaceIndia == 2;
        RInterfaceIndia =
            bV.b(str, "Tune Differences Detected", dd.IOPropertiesUsingFile().c(), arrayOfString)) {
      RInterfaceIndia =
          bV.b(str, "Tune Differences Detected", dd.IOPropertiesUsingFile().c(), arrayOfString);
      if (RInterfaceIndia == 0) return IOPropertiesUsingFile(paramR, paramY);
      if (RInterfaceIndia == 1) {
        IOPropertiesUsingFile(paramR, paramY, false);
        return false;
      }
      UInterfaceFoxtrot.IOPropertiesUsingFile().JDialogExtensionInUPackage("differenceReports");
    }
    return false;
  }

  private boolean IOPropertiesUsingFile(R paramR, Y paramY, boolean paramBoolean) {
    Thread thread = Thread.currentThread();
    try {
      paramR.IOPropertiesUsingFile(thread);
      for (byte b = 0; b < paramY.e(); b++) {
        try {
          if (paramBoolean) {
            paramR.JDialogExtensionInUPackage().b(b, 0, paramY.b(b));
          } else {
            paramR.JDialogExtensionInUPackage().IOPropertiesUsingFile(b, 0, paramY.b(b));
          }
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          ExceptionPrintstacktrace.printStackTrace();
          return false;
        }
      }
    } catch (Exception exception) {
    }
    paramR.b(thread);
    ManagerUsingArrayList.IOPropertiesUsingFile()
        .IOPropertiesUsingFile("controllerSettingsLoaded", 1.0D);
    return true;
  }

  private boolean IOPropertiesUsingFile(R paramR, Y paramY) {
    File file = UInterfaceFoxtrot.IOPropertiesUsingFile().IOPropertiesUsingFile(paramR, true);
    IOPropertiesUsingFile(paramR, paramY, true);
    paramR.JDialogExtensionInUPackage().ExceptionPrintstacktrace();
    boolean bool = UInterfaceFoxtrot.IOPropertiesUsingFile().c(paramR, file.getAbsolutePath());
    ManagerUsingArrayList.IOPropertiesUsingFile()
        .IOPropertiesUsingFile("controllerSettingsLoaded", 0.0D);
    return bool;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
