package aP;

import G.R;
import G.Y;
import G.aI;
import G.aM;
import G.bA;
import G.bv;
import G.cB;
import G.cu;
import G.i;
import G.z;
import V.g;
import W.aa;
import W.aj;
import ax.U;
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
import r.a;
import r.i;
import u.f;
import u.h;

public class hH implements cB {
  ArrayList a = new ArrayList();
  
  private static final Map b = new HashMap<>();
  
  public boolean a(Window paramWindow, R paramR, String paramString) {
    Y y = paramR.h().a();
    R r = paramR.a(y);
    z z = new z(ac.a().b());
    try {
      aa aa = new aa();
      aa.a(r, paramString);
    } catch (g g) {
      D.a("Error opening Saved tune.", (Exception)g, paramWindow);
    } catch (aj aj) {
      D.a("Password Protected Tune Files. Please configure File Passwords.\nSkipping Difference Report.", (Exception)aj, paramWindow);
      return false;
    } 
    ArrayList arrayList = z.a(paramR, paramR.h(), y);
    if (arrayList.size() == 0)
      return false; 
    a(arrayList, paramR, y, new File(paramString));
    this.a.clear();
    return true;
  }
  
  public boolean a(R paramR, String paramString) {
    Y y = paramR.h().a();
    R r = paramR.a(y);
    z z = new z(ac.a().b());
    try {
      aa aa = new aa();
      aa.a(r, paramString);
    } catch (g g) {
      D.a("isDifferenceDetected:: Returning true a file is different, Error opening Saved tune:\n" + paramString);
      D.a("Saved tune file, it appears corrupt:\n" + paramString, (Exception)g, null);
      g.printStackTrace();
      return true;
    } catch (aj aj) {
      D.a("Password Protected Tune Files. Please configure File Passwords.\nSkipping Difference Report.", (Exception)aj, null);
      return false;
    } 
    ArrayList arrayList = z.a(paramR, paramR.h(), y);
    int i = paramR.h().k();
    int j = r.h().l();
    double d = j / i;
    return (!arrayList.isEmpty() || d >= 0.4D);
  }
  
  public boolean a(ArrayList paramArrayList, R paramR, Y paramY, String paramString) {
    boolean bool2;
    boolean bool1 = a.a().c(a.bu, a.bv);
    if (!bool1) {
      a(paramR, paramY, false);
      return false;
    } 
    z z = new z(ac.a().b());
    ArrayList arrayList1 = z.a(paramR, paramArrayList);
    ArrayList arrayList2 = z.b(paramR, arrayList1);
    Iterator<bv> iterator = arrayList2.iterator();
    while (iterator.hasNext()) {
      bv bv = iterator.next();
      boolean bool = (bv.T() || bv.S() || bv.L()) ? true : false;
      List list = bv.G();
      if (!list.isEmpty()) {
        for (bA bA : bv.G()) {
          if (bA.b() != null && a(paramArrayList, bA.b())) {
            boolean bool3 = false;
            try {
              bool3 = (bA.aJ() == null || bA.aJ().isEmpty() || i.a(bA.aJ(), (aI)paramR) != 0.0D) ? true : false;
            } catch (U u) {
              D.a("Unable to evaluate enable condition: " + bA.aJ());
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
      a(paramR, paramY, false);
      return false;
    } 
    if (!i.a().a("67r67r8yhdrtrbyuk")) {
      bool2 = b(paramArrayList, paramR, paramY, paramString);
    } else {
      ArrayList<hN> arrayList = new ArrayList();
      hN hN = new hN(this, paramR, paramY);
      arrayList.add(hN);
      hK hK = new hK(this, paramR);
      arrayList.add(hK);
      hJ hJ = new hJ(this, paramR, paramY);
      arrayList.add(hJ);
      bool2 = a(paramArrayList, paramR, paramY, arrayList, null);
    } 
    return bool2;
  }
  
  private boolean a(ArrayList paramArrayList, String paramString) {
    for (aM aM : paramArrayList) {
      if (aM.aL().equals(paramString))
        return true; 
    } 
    return false;
  }
  
  public void a(ArrayList paramArrayList, R paramR, Y paramY, File paramFile) {
    ArrayList<hI> arrayList = new ArrayList();
    hI hI = new hI(this);
    arrayList.add(hI);
    hM hM = new hM(this, paramR, paramArrayList);
    arrayList.add(hM);
    hL hL = new hL(this, paramR, paramY, paramFile);
    arrayList.add(hL);
    a(paramArrayList, paramR, paramY, arrayList, paramFile);
  }
  
  private boolean a(ArrayList paramArrayList1, R paramR, Y paramY, ArrayList paramArrayList2, File paramFile) {
    R r = paramR.a(paramY);
    JFrame jFrame = dd.a().c();
    h h = null;
    try {
      h = new h(jFrame, paramR, r, paramArrayList1, paramArrayList2, paramFile);
      for (f f : this.a) {
        h.b(f);
        h.a(f);
      } 
      if (h.a())
        return false; 
      h h1 = (h)b.get(paramR.c());
      if (h1 != null)
        h1.dispose(); 
      b.put(paramR.c(), h);
      bV.a(jFrame, (Component)h);
      h.setVisible(true);
      return h.b();
    } finally {
      if (h != null && h.isVisible())
        h.dispose(); 
      h = null;
      b.remove(paramR.c());
    } 
  }
  
  private boolean b(ArrayList<aM> paramArrayList, R paramR, Y paramY, String paramString) {
    long l = System.currentTimeMillis();
    String str = "There are differences between your offline tune and that\nwhich was last saved to the controller.\nFor advanced difference reports with side by side values, \nGo to EFIAnalytics.com and upgrade " + a.b + " today!\n\nA basic comparison found " + paramArrayList.size() + " Settings with different values \non the Controller than in the currently loaded tune (" + a.cw + ") \nfor " + paramR.c() + "\n\nWould you like to send your offline values to the Controller?\n\nDifferent Settings:\n";
    z z = new z(ac.a().b());
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
    int i;
    for (i = 2; i == 2; i = bV.b(str, "Tune Differences Detected", dd.a().c(), arrayOfString)) {
      i = bV.b(str, "Tune Differences Detected", dd.a().c(), arrayOfString);
      if (i == 0)
        return a(paramR, paramY); 
      if (i == 1) {
        a(paramR, paramY, false);
        return false;
      } 
      f.a().h("differenceReports");
    } 
    return false;
  }
  
  private boolean a(R paramR, Y paramY, boolean paramBoolean) {
    Thread thread = Thread.currentThread();
    try {
      paramR.a(thread);
      for (byte b = 0; b < paramY.e(); b++) {
        try {
          if (paramBoolean) {
            paramR.h().b(b, 0, paramY.b(b));
          } else {
            paramR.h().a(b, 0, paramY.b(b));
          } 
        } catch (g g) {
          g.printStackTrace();
          return false;
        } 
      } 
    } catch (Exception exception) {}
    paramR.b(thread);
    cu.a().a("controllerSettingsLoaded", 1.0D);
    return true;
  }
  
  private boolean a(R paramR, Y paramY) {
    File file = f.a().a(paramR, true);
    a(paramR, paramY, true);
    paramR.h().g();
    boolean bool = f.a().c(paramR, file.getAbsolutePath());
    cu.a().a("controllerSettingsLoaded", 0.0D);
    return bool;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */