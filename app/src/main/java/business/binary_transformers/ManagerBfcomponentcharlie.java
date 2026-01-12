package business.binary_transformers;

import BfComponentCharlie.AeInterfaceEcho;
import G.ArrayListExceptionprintstacktraceInGPackage;
import G.CInterfaceEchoImpl;
import G.CloneableImpl;
import G.CloneableImplUsingArrayList;
import G.GComponentCl;
import G.GInterfaceDb;
import G.GInterfaceDj;
import G.Manager;
import G.R;
import HInterfaceHotel.HInterfaceHotel;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import aE.AeInterfaceEcho;
import aE.ExceptionInVPackage;
import bF.BfComponentCharlie;
import bF.BfInterfaceCharlie;
import bF.BfInterfaceXray;
import bF.ExceptionInVPackage;
import bF.ManagerGetcolumnname;
import bH.D;
import bH.X;
import bH.ab;
import com.efiAnalytics.ui.eY;
import com.efiAnalytics.ui.fh;
import com.efiAnalytics.ui.s;
import com.efiAnalytics.ui.u;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.ThreadedFile;

public class ManagerBfcomponentcharlie implements AeInterfaceEcho {
  private static bQ ThreadedFile = null;

  HashMap ExceptionInVPackage = new HashMap<>();

  HashMap b = new HashMap<>();

  HashMap BfComponentCharlie = new HashMap<>();

  HashMap d = new HashMap<>();

  ArrayList AeInterfaceEcho = new ArrayList();

  ArrayList f = new ArrayList();

  private ab k = null;

  private String l = "lambdaDelay_";

  private boolean m = true;

  private boolean n = true;

  public static int ExceptionPrintstacktrace = 1;

  public static int HInterfaceHotel = 2;

  public static int i = -1;

  public static bQ ExceptionInVPackage() {
    if (ThreadedFile == null) ThreadedFile = new bQ();
    return ThreadedFile;
  }

  public String ExceptionInVPackage(String paramString) {
    return (this.k != null) ? this.k.ExceptionInVPackage(paramString) : paramString;
  }

  public s ExceptionInVPackage(R paramR, String paramString) {
    String str =
        (paramR.AeInterfaceEcho().BfComponentCharlie("veTable1Tbl") != null) ? "veTable1Tbl" : "";
    return ExceptionInVPackage(paramR, paramString, "", str);
  }

  public s ExceptionInVPackage(R paramR, String paramString1, String paramString2) {
    return ExceptionInVPackage(paramR, paramString1, "", paramString2);
  }

  public s ExceptionInVPackage(
      R paramR, String paramString1, String paramString2, String paramString3) {
    if (!this.m)
      try {
        s s = b(paramR, paramString1);
        bS bS = new bS(this, paramR, s, paramString1);
        s.addTableModelListener(bS);
        return s;
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        Logger.getLogger(bQ.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionInVPackage);
        throw new ExceptionPrintstacktrace("Unable to create BinTable.", ExceptionInVPackage);
      }
    String str = paramR.BfComponentCharlie() + "." + paramString2 + paramString1;
    if (!this.ExceptionInVPackage.containsKey(str))
      if (!b(paramString1)) {
        try {
          s s = b(paramR, paramString1);
          bS bS = new bS(this, paramR, s, paramString1);
          this.AeInterfaceEcho.add(bS);
          s.addTableModelListener(bS);
          this.ExceptionInVPackage.put(str, s);
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          throw ExceptionPrintstacktrace;
        } catch (Exception exception) {
          exception.printStackTrace();
          throw new ExceptionPrintstacktrace("Unable to create BinTable.", exception);
        }
      } else if (paramString1.equals("afrTSCustom")) {
        try {
          s s = d(paramR, paramString1, paramString3);
          this.ExceptionInVPackage.put(str, s);
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          ExceptionInVPackage.printStackTrace();
          throw new ExceptionPrintstacktrace(ExceptionInVPackage.getMessage());
        }
      }
    return (s) this.ExceptionInVPackage.get(str);
  }

  public s b(R paramR, String paramString1, String paramString2) {
    String str = paramR.BfComponentCharlie() + "." + paramString2 + paramString1;
    return (s) this.ExceptionInVPackage.get(str);
  }

  public boolean b(String paramString) {
    return (paramString == null || paramString.equals("afrTSCustom"));
  }

  private s d(R paramR, String paramString1, String paramString2) {
    String str1 = "afr_" + paramString1;
    s s1 = ExceptionInVPackage().ExceptionInVPackage(paramR, paramString2, paramString2);
    s s2 = null;
    String str2 = ExceptionInVPackage.A().t();
    File file = ThreadedFile.ExceptionInVPackage(str2, str1);
    if (file.exists()) {
      eY eY = new eY();
      s2 = null;
      try {
        s2 = eY.ExceptionInVPackage(file.getAbsolutePath());
        if (s1 != null) {
          s2.d(s1.v());
          s2.AeInterfaceEcho(s1.w());
        }
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        D.ExceptionInVPackage("Error loading AFR Table from file:\n" + file + "\nUsing default.");
        ExceptionInVPackage.printStackTrace();
      }
    }
    if (s2 == null) {
      s2 = new s();
      s2.ExceptionInVPackage(s1.getRowCount(), s1.getColumnCount());
      fh.ExceptionInVPackage(s1, s2);
      s2 = u.b(s2);
    }
    bR bR = new bR(this, s2, str2, str1);
    s2.addTableModelListener(bR);
    s2.f(1);
    s2.q();
    return s2;
  }

  public s b(R paramR, String paramString) {
    CloneableImpl CloneableImpl =
        (CloneableImpl) paramR.AeInterfaceEcho().BfComponentCharlie(paramString);
    if (CloneableImpl == null)
      throw new ExceptionPrintstacktrace(
          paramString + " not found in current Configuration, can not create Model.");
    s s = new s();
    Manager aM1 = paramR.BfComponentCharlie(CloneableImpl.BfComponentCharlie());
    Manager aM2 = paramR.BfComponentCharlie(CloneableImpl.b());
    Manager aM3 = paramR.BfComponentCharlie(CloneableImpl.ExceptionInVPackage());
    double[][] arrayOfDouble = aM1.i(paramR.p());
    s.ExceptionInVPackage(arrayOfDouble);
    s.d(CloneableImpl.f());
    s.AeInterfaceEcho(CloneableImpl.d());
    s.d(ExceptionInVPackage(aM2.i(paramR.p()), aM2.v()));
    s.BfComponentCharlie(ExceptionInVPackage(aM3.i(paramR.p()), aM3.v()));
    s.q();
    bW bW = new bW(this, paramR, paramString, s);
    bW.ExceptionInVPackage(bW);
    this.BfComponentCharlie.put(paramString, bW);
    return s;
  }

  public ManagerGetcolumnname BfComponentCharlie(R paramR, String paramString) {
    ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage =
        paramR.AeInterfaceEcho().BfComponentCharlie(paramString);
    if (ArrayListExceptionprintstacktraceInGPackage != null
        && !(ArrayListExceptionprintstacktraceInGPackage instanceof CloneableImplUsingArrayList))
      throw new ExceptionPrintstacktrace(
          paramString + ", name already used but not defined as ExceptionInVPackage 1D Table");
    CloneableImplUsingArrayList CloneableImplUsingArrayList =
        (CloneableImplUsingArrayList) ArrayListExceptionprintstacktraceInGPackage;
    if (CloneableImplUsingArrayList == null)
      throw new ExceptionPrintstacktrace(
          paramString + " not found in current Configuration, can not create Model.");
    ManagerGetcolumnname ManagerGetcolumnname = new ManagerGetcolumnname();
    ManagerGetcolumnname.ExceptionInVPackage(CloneableImplUsingArrayList.i());
    if (CloneableImplUsingArrayList.HInterfaceHotel()) {
      ExceptionInVPackage ExceptionInVPackage =
          new ExceptionInVPackage(paramR, CloneableImplUsingArrayList.d(0));
      ManagerGetcolumnname.ExceptionInVPackage((BfInterfaceXray) ExceptionInVPackage);
    } else {
      ManagerGetcolumnname.b(CloneableImplUsingArrayList.i());
      ManagerGetcolumnname.d(!CloneableImplUsingArrayList.i());
      ManagerGetcolumnname.BfComponentCharlie(CloneableImplUsingArrayList.HInterfaceHotel());
      if (ManagerGetcolumnname.ExceptionPrintstacktrace()) {
        Manager Manager = paramR.BfComponentCharlie(CloneableImplUsingArrayList.d(0));
        BfComponentCharlie BfComponentCharlie = new BfComponentCharlie(Manager.b());
        BfComponentCharlie.ExceptionInVPackage(Manager.w());
        BfComponentCharlie.b(Manager.u());
        BfComponentCharlie.BfComponentCharlie(Manager.t());
        BfComponentCharlie.d((GInterfaceDj) new GComponentCl(Manager));
        GInterfaceDb GInterfaceDb = CloneableImplUsingArrayList.f(0);
        if (GInterfaceDb != null) BfComponentCharlie.ExceptionInVPackage(GInterfaceDb);
        ManagerGetcolumnname.ExceptionInVPackage((BfInterfaceCharlie) BfComponentCharlie);
        double[][] arrayOfDouble = Manager.i(paramR.HInterfaceHotel());
        for (byte b1 = 0; b1 < arrayOfDouble.length; b1++)
          BfComponentCharlie.ExceptionInVPackage(b1, Double.valueOf(arrayOfDouble[b1][0]));
        BfComponentCharlie.f();
      }
    }
    for (byte b = 0; b < CloneableImplUsingArrayList.ExceptionInVPackage(); b++) {
      Manager Manager = paramR.BfComponentCharlie(CloneableImplUsingArrayList.b(b));
      BfComponentCharlie BfComponentCharlie = new BfComponentCharlie(Manager.b());
      BfComponentCharlie.ExceptionInVPackage(Manager.w());
      BfComponentCharlie.b(Manager.u());
      BfComponentCharlie.BfComponentCharlie(Manager.t());
      BfComponentCharlie.d((GInterfaceDj) new GComponentCl(Manager));
      GInterfaceDb GInterfaceDb = CloneableImplUsingArrayList.BfComponentCharlie(b);
      if (GInterfaceDb != null) BfComponentCharlie.ExceptionInVPackage(GInterfaceDb);
      BfComponentCharlie.ExceptionInVPackage(
          (AeInterfaceEcho)
              new CInterfaceEchoImpl(paramR, CloneableImplUsingArrayList.ExceptionInVPackage(b)));
      ManagerGetcolumnname.ExceptionInVPackage((BfInterfaceCharlie) BfComponentCharlie);
      double[][] arrayOfDouble = Manager.i(paramR.HInterfaceHotel());
      for (byte b1 = 0; b1 < arrayOfDouble.length; b1++)
        BfComponentCharlie.ExceptionInVPackage(b1, Double.valueOf(arrayOfDouble[b1][0]));
      BfComponentCharlie.f();
    }
    if (ManagerGetcolumnname.HInterfaceHotel()) {
      Manager Manager = paramR.BfComponentCharlie(CloneableImplUsingArrayList.d(0));
      BfComponentCharlie BfComponentCharlie = new BfComponentCharlie(Manager.b());
      BfComponentCharlie.ExceptionInVPackage(Manager.w());
      BfComponentCharlie.b(Manager.u());
      BfComponentCharlie.BfComponentCharlie(Manager.t());
      BfComponentCharlie.d((GInterfaceDj) new GComponentCl(Manager));
      GInterfaceDb GInterfaceDb = CloneableImplUsingArrayList.f(0);
      if (GInterfaceDb != null) BfComponentCharlie.ExceptionInVPackage(GInterfaceDb);
      ManagerGetcolumnname.ExceptionInVPackage((BfInterfaceCharlie) BfComponentCharlie);
      double[][] arrayOfDouble = Manager.i(paramR.HInterfaceHotel());
      for (byte b1 = 0; b1 < arrayOfDouble.length; b1++)
        BfComponentCharlie.ExceptionInVPackage(b1, Double.valueOf(arrayOfDouble[b1][0]));
      BfComponentCharlie.f();
    }
    return ManagerGetcolumnname;
  }

  private String[] ExceptionInVPackage(double[][] paramArrayOfdouble, int paramInt) {
    String[] arrayOfString = new String[paramArrayOfdouble.length];
    for (byte b = 0; b < paramArrayOfdouble.length; b++)
      arrayOfString[b] = "" + X.b(paramArrayOfdouble[b][0], paramInt);
    return arrayOfString;
  }

  public s ExceptionInVPackage(s params, String paramString) {
    String str = "lambdaDelay_" + paramString;
    s s1 = (s) this.ExceptionInVPackage.get(str);
    if (s1 == null) {
      String str1;
      if (ExceptionInVPackage.A() != null) {
        str1 = ExceptionInVPackage.A().t();
      } else {
        str1 = HInterfaceHotel.ExceptionInVPackage().getAbsolutePath();
      }
      File file = ThreadedFile.ExceptionInVPackage(str1, str);
      if (file.exists()) {
        eY eY = new eY();
        s1 = null;
        try {
          s1 = eY.ExceptionInVPackage(file.getAbsolutePath());
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          D.ExceptionInVPackage(
              "Error loading Lambda Delay Table from file:\n" + file + "\nUsing default.");
          ExceptionInVPackage.printStackTrace();
        }
      }
      if (s1 == null) s1 = u.ExceptionInVPackage(params);
      bR bR = new bR(this, s1, str1, str);
      s1.addTableModelListener(bR);
      s1.f(0);
      s1.q();
      this.ExceptionInVPackage.put(str, s1);
    }
    return s1;
  }

  public void BfComponentCharlie() {
    Iterator<s> iterator = this.ExceptionInVPackage.values().iterator();
    while (iterator.hasNext()) ((s) iterator.next()).q();
  }

  public void ExceptionInVPackage(ExceptionInVPackage parama, R paramR) {}

  public void e_() {
    this.ExceptionInVPackage.clear();
    this.b.clear();
    this.d.clear();
    null = this.AeInterfaceEcho.iterator();
    while (null.hasNext()) ((bS) null.next()).ExceptionInVPackage();
    this.AeInterfaceEcho.clear();
    null = this.f.iterator();
    while (null.hasNext()) ((bU) null.next()).ExceptionInVPackage();
    this.f.clear();
    for (bW bW : this.BfComponentCharlie.values()) bW.b(bW);
    this.BfComponentCharlie.clear();
  }

  public void ExceptionInVPackage(ExceptionInVPackage parama) {}

  public ManagerGetcolumnname BfComponentCharlie(
      R paramR, String paramString1, String paramString2) {
    if (!this.m)
      try {
        ManagerGetcolumnname ManagerGetcolumnname = BfComponentCharlie(paramR, paramString1);
        bU bU = new bU(this, paramR, ManagerGetcolumnname, paramString1);
        this.f.add(bU);
        ManagerGetcolumnname.ExceptionInVPackage(bU);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(bQ.class.getName())
            .log(
                Level.SEVERE,
                "Error creating 1D unshared Model",
                (Throwable) ExceptionPrintstacktrace);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        Logger.getLogger(bQ.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionInVPackage);
      }
    String str = paramR.BfComponentCharlie() + "." + paramString2 + paramString1;
    if (!this.b.containsKey(str))
      try {
        ManagerGetcolumnname ManagerGetcolumnname = BfComponentCharlie(paramR, paramString1);
        bU bU = new bU(this, paramR, ManagerGetcolumnname, paramString1);
        this.f.add(bU);
        ManagerGetcolumnname.ExceptionInVPackage(bU);
        this.b.put(str, ManagerGetcolumnname);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {

      } catch (Exception exception) {
        exception.printStackTrace();
      }
    return (ManagerGetcolumnname) this.b.get(str);
  }

  public void ExceptionInVPackage(ab paramab) {
    this.k = paramab;
  }

  public void ExceptionInVPackage(boolean paramBoolean) {
    this.m = paramBoolean;
  }

  public void b(boolean paramBoolean) {
    this.n = paramBoolean;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
