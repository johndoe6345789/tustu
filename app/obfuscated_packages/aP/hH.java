package aP;

import G.R;
import G.Y;
import G.aI;
import G.aM;
import G.bA;
import G.bv;
import G.cB;
import G.cu;
import G.RInterfaceIndia;
import G.z;
import V.ExceptionPrintstacktrace;
import W.aa;
import W.aj;
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
import u.UInterfaceFoxtrot;
import u.JDialogExtensionInUPackage;

public class hH implements cB {
  ArrayList IOPropertiesUsingFile = new ArrayList();
  
  private static final Map b = new HashMap<>();
  
  public boolean IOPropertiesUsingFile(Window paramWindow, R paramR, String paramString) {
    Y y = paramR.JDialogExtensionInUPackage().IOPropertiesUsingFile();
    R r = paramR.IOPropertiesUsingFile(y);
    z z = new z(ac.IOPropertiesUsingFile().b());
    try {
      aa aa = new aa();
      aa.IOPropertiesUsingFile(r, paramString);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.IOPropertiesUsingFile("Error opening Saved tune.", (Exception)ExceptionPrintstacktrace, paramWindow);
    } catch (aj aj) {
      D.IOPropertiesUsingFile("Password Protected Tune Files. Please configure File Passwords.\nSkipping Difference Report.", (Exception)aj, paramWindow);
      return false;
    } 
    ArrayList arrayList = z.IOPropertiesUsingFile(paramR, paramR.JDialogExtensionInUPackage(), y);
    if (arrayList.size() == 0)
      return false; 
    IOPropertiesUsingFile(arrayList, paramR, y, new File(paramString));
    this.IOPropertiesUsingFile.clear();
    return true;
  }
  
  public boolean IOPropertiesUsingFile(R paramR, String paramString) {
    Y y = paramR.JDialogExtensionInUPackage().IOPropertiesUsingFile();
    R r = paramR.IOPropertiesUsingFile(y);
    z z = new z(ac.IOPropertiesUsingFile().b());
    try {
      aa aa = new aa();
      aa.IOPropertiesUsingFile(r, paramString);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.IOPropertiesUsingFile("isDifferenceDetected:: Returning true IOPropertiesUsingFile file is different, Error opening Saved tune:\n" + paramString);
      D.IOPropertiesUsingFile("Saved tune file, it appears corrupt:\n" + paramString, (Exception)ExceptionPrintstacktrace, null);
      ExceptionPrintstacktrace.printStackTrace();
      return true;
    } catch (aj aj) {
      D.IOPropertiesUsingFile("Password Protected Tune Files. Please configure File Passwords.\nSkipping Difference Report.", (Exception)aj, null);
      return false;
    } 
    ArrayList arrayList = z.IOPropertiesUsingFile(paramR, paramR.JDialogExtensionInUPackage(), y);
    int RInterfaceIndia = paramR.JDialogExtensionInUPackage().k();
    int j = r.JDialogExtensionInUPackage().l();
    double d = j / RInterfaceIndia;
    return (!arrayList.isEmpty() || d >= 0.4D);
  }
  
  public boolean IOPropertiesUsingFile(ArrayList paramArrayList, R paramR, Y paramY, String paramString) {
    boolean bool2;
    boolean bool1 = IOPropertiesUsingFile.IOPropertiesUsingFile().c(IOPropertiesUsingFile.bu, IOPropertiesUsingFile.bv);
    if (!bool1) {
      IOPropertiesUsingFile(paramR, paramY, false);
      return false;
    } 
    z z = new z(ac.IOPropertiesUsingFile().b());
    ArrayList arrayList1 = z.IOPropertiesUsingFile(paramR, paramArrayList);
    ArrayList arrayList2 = z.b(paramR, arrayList1);
    Iterator<bv> iterator = arrayList2.iterator();
    while (iterator.hasNext()) {
      bv bv = iterator.next();
      boolean bool = (bv.T() || bv.S() || bv.L()) ? true : false;
      List list = bv.G();
      if (!list.isEmpty()) {
        for (bA bA : bv.G()) {
          if (bA.b() != null && IOPropertiesUsingFile(paramArrayList, bA.b())) {
            boolean bool3 = false;
            try {
              bool3 = (bA.aJ() == null || bA.aJ().isEmpty() || RInterfaceIndia.IOPropertiesUsingFile(bA.aJ(), (aI)paramR) != 0.0D) ? true : false;
            } catch (ExceptionInAxPackage u) {
              D.IOPropertiesUsingFile("Unable to evaluate enable condition: " + bA.aJ());
            } 
            if (!bool3) {
              aM aM = paramR.c(bA.b());
              paramArrayList.remove(aM);
            } 
          } 
        } 
        if (!bool)
          iterator.remove(); 
        continue;
      } 
      if (!bv.T() && !bv.S() && !bv.L())
        iterator.remove(); 
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
    for (aM aM : paramArrayList) {
      if (aM.aL().equals(paramString))
        return true; 
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
  
  private boolean IOPropertiesUsingFile(ArrayList paramArrayList1, R paramR, Y paramY, ArrayList paramArrayList2, File paramFile) {
    R r = paramR.IOPropertiesUsingFile(paramY);
    JFrame jFrame = dd.IOPropertiesUsingFile().c();
    JDialogExtensionInUPackage JDialogExtensionInUPackage = null;
    try {
      JDialogExtensionInUPackage = new JDialogExtensionInUPackage(jFrame, paramR, r, paramArrayList1, paramArrayList2, paramFile);
      for (UInterfaceFoxtrot UInterfaceFoxtrot : this.IOPropertiesUsingFile) {
        JDialogExtensionInUPackage.b(UInterfaceFoxtrot);
        JDialogExtensionInUPackage.IOPropertiesUsingFile(UInterfaceFoxtrot);
      } 
      if (JDialogExtensionInUPackage.IOPropertiesUsingFile())
        return false; 
      JDialogExtensionInUPackage h1 = (JDialogExtensionInUPackage)b.get(paramR.c());
      if (h1 != null)
        h1.dispose(); 
      b.put(paramR.c(), JDialogExtensionInUPackage);
      bV.IOPropertiesUsingFile(jFrame, (Component)JDialogExtensionInUPackage);
      JDialogExtensionInUPackage.setVisible(true);
      return JDialogExtensionInUPackage.b();
    } finally {
      if (JDialogExtensionInUPackage != null && JDialogExtensionInUPackage.isVisible())
        JDialogExtensionInUPackage.dispose(); 
      JDialogExtensionInUPackage = null;
      b.remove(paramR.c());
    } 
  }
  
  private boolean b(ArrayList<aM> paramArrayList, R paramR, Y paramY, String paramString) {
    long l = System.currentTimeMillis();
    String str = "There are differences between your offline tune and that\nwhich was last saved to the controller.\nFor advanced difference reports with side by side values, \nGo to EFIAnalytics.com and upgrade " + IOPropertiesUsingFile.b + " today!\n\nA basic comparison found " + paramArrayList.size() + " Settings with different values \non the Controller than in the currently loaded tune (" + IOPropertiesUsingFile.cw + ") \nfor " + paramR.c() + "\n\nWould you like to send your offline values to the Controller?\n\nDifferent Settings:\n";
    z z = new z(ac.IOPropertiesUsingFile().b());
    D.c("Time to get Panels = " + (System.currentTimeMillis() - l) + "ms.");
    byte b1 = 20;
    for (byte b2 = 0; b2 < paramArrayList.size(); b2++) {
      str = str + ((aM)paramArrayList.get(b2)).aL();
      if (b2 == b1 - 1 && paramArrayList.size() - 1 > b2) {
        str = str + "\n" + (paramArrayList.size() - b2 - 1) + " more...";
        break;
      } 
      if (b2 < paramArrayList.size() - 1 && b2 < b1)
        str = str + ", "; 
      if (b2 > 0 && (b2 + 1) % 5 == 0)
        str = str + "\n"; 
    } 
    String[] arrayOfString = { "Send Local Settings", "Use Controller Settings", "Get Graphic Difference Reports" };
    int RInterfaceIndia;
    for (RInterfaceIndia = 2; RInterfaceIndia == 2; RInterfaceIndia = bV.b(str, "Tune Differences Detected", dd.IOPropertiesUsingFile().c(), arrayOfString)) {
      RInterfaceIndia = bV.b(str, "Tune Differences Detected", dd.IOPropertiesUsingFile().c(), arrayOfString);
      if (RInterfaceIndia == 0)
        return IOPropertiesUsingFile(paramR, paramY); 
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
    } catch (Exception exception) {}
    paramR.b(thread);
    cu.IOPropertiesUsingFile().IOPropertiesUsingFile("controllerSettingsLoaded", 1.0D);
    return true;
  }
  
  private boolean IOPropertiesUsingFile(R paramR, Y paramY) {
    File file = UInterfaceFoxtrot.IOPropertiesUsingFile().IOPropertiesUsingFile(paramR, true);
    IOPropertiesUsingFile(paramR, paramY, true);
    paramR.JDialogExtensionInUPackage().ExceptionPrintstacktrace();
    boolean bool = UInterfaceFoxtrot.IOPropertiesUsingFile().c(paramR, file.getAbsolutePath());
    cu.IOPropertiesUsingFile().IOPropertiesUsingFile("controllerSettingsLoaded", 0.0D);
    return bool;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */