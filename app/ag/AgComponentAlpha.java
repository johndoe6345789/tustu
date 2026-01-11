package ag;

import G.AeInterfaceMikeTostring;
import G.GInterfaceCr;
import G.GInterfaceCv;
import ad.ExceptionInAdPackage;
import ad.AdInterfaceDelta;
import ae.AdInterfaceDelta;
import ae.FileUsingHashMap;
import ae.AeInterfaceMike;
import ae.AeInterfaceOscar;
import ae.IOInAePackage;
import ae.AeInterfaceQuebec;
import ae.AeInterfaceUniform;
import ae.ExceptionExtensionInAePackage;
import af.ExceptionInAdPackage;
import af.IOInAfPackage;
import bH.D;
import bH.ExceptionInAdPackage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AgComponentAlpha implements AeInterfaceQuebec {
  List a = new ArrayList();
  
  ExceptionInAdPackage b = new ExceptionInAdPackage();
  
  public String a() {
    return "MS2 B&G Firmware Loader";
  }
  
  public String b() {
    return "Firmware Loader for B&G Firmwares including MegaSquirt-II B&G, MShift and GPIO";
  }
  
  public List ExceptionInAdPackage() {
    ArrayList<ExceptionInAdPackage> arrayList = new ArrayList();
    arrayList.add(this.b);
    return arrayList;
  }
  
  public List AdInterfaceDelta() {
    ArrayList<ExceptionInAdPackage> arrayList = new ArrayList();
    arrayList.add(this.b);
    return arrayList;
  }
  
  public GInterfaceCr a(AeInterfaceMikeTostring parambT) {
    return null;
  }
  
  public GInterfaceCv b(AeInterfaceMikeTostring parambT) {
    return null;
  }
  
  public boolean a(AeInterfaceMike paramm) {
    return ((paramm.b() | 0x1) == paramm.b());
  }
  
  public boolean a(FileUsingHashMap paramk) {
    List<File> list = paramk.AdInterfaceDelta();
    for (byte b = 0; b < list.size(); b++) {
      try {
        ad.a a1 = paramk.ExceptionInAdPackage(list.get(b));
        if (a1.a().size() > 0) {
          int[] arrayOfInt = ((AdInterfaceDelta)a1.a().get(0)).e();
          byte[] arrayOfByte = ExceptionInAdPackage.a(arrayOfInt);
          String str = new String(arrayOfByte);
          if (!str.contains("megasquirt2.s19") && !str.contains("microsquirt.s19") && !str.contains("microsquirt-module.s19") && !str.contains("ms2_extra.s19") && !str.contains("ms2_extra_us.s19") && !str.contains("trans.s19") && !str.contains("mspnp2.s19")) {
            File file = list.get(b);
            if ((file.getName().toLowerCase().startsWith("monitor") && file.getName().endsWith(".s19")) || (file.getName().toLowerCase().startsWith("lct") && file.getName().endsWith(".s19")) || (file.getName().toLowerCase().startsWith("pico") && file.getName().endsWith(".s19")))
              return true; 
          } 
        } 
      } catch (ExceptionInAdPackage c1) {
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, (Throwable)c1);
      } 
    } 
    D.b("Selected Firmware Package not suitable for MS2 B&G Firmware Loader Firmware Loader.");
    return false;
  }
  
  public AdInterfaceDelta a(FileUsingHashMap paramk, IOInAePackage paramp, AeInterfaceUniform paramu) {
    AdInterfaceDelta AdInterfaceDelta = null;
    AdInterfaceDelta = IOInAfPackage.a(paramp);
    if (AdInterfaceDelta.a() == AdInterfaceDelta.b)
      return AdInterfaceDelta; 
    AdInterfaceDelta = IOInAfPackage.ExceptionInAdPackage(paramp);
    if (AdInterfaceDelta.a() == AdInterfaceDelta.b)
      return AdInterfaceDelta; 
    File file = paramk.g();
    if (file == null) {
      AdInterfaceDelta.a(AdInterfaceDelta.b);
      AdInterfaceDelta.a("No Firmware File Selected!");
      return AdInterfaceDelta;
    } 
    D.AdInterfaceDelta("Loading Firmware File: " + file.getAbsolutePath());
    try {
      ad.a a1 = paramk.ExceptionInAdPackage(file);
      b b = new b(this);
      AdInterfaceDelta = IOInAfPackage.a(a1, paramp, paramu, b);
    } catch (ExceptionInAdPackage c1) {
      AdInterfaceDelta.a(AdInterfaceDelta.b);
      AdInterfaceDelta.a("Unable to read S19 File.");
      D.a("Unable to parse S19 File: " + file.getAbsolutePath());
      c1.printStackTrace();
      return AdInterfaceDelta;
    } catch (ExceptionExtensionInAePackage ExceptionExtensionInAePackage) {
      Logger.getLogger(ExceptionInAdPackage.class.getName()).log(Level.SEVERE, "Unexpected Protocol Error", (Throwable)ExceptionExtensionInAePackage);
      AdInterfaceDelta.a(AdInterfaceDelta.b);
      AdInterfaceDelta.a("Unexpected Protocol Error");
      return AdInterfaceDelta;
    } 
    return AdInterfaceDelta;
  }
  
  public boolean a(AeInterfaceMike paramm, File paramFile) {
    return ((paramm.b() & AeInterfaceOscar.w) > 0 && (paramm.b() & AeInterfaceOscar.E) <= 0);
  }
  
  public boolean b(AeInterfaceMike paramm, File paramFile) {
    return ((paramm.b() & AeInterfaceOscar.w) > 0 && (paramm.b() & AeInterfaceOscar.E) <= 0);
  }
  
  public String a(File paramFile) {
    return paramFile.getName().toLowerCase().startsWith("monitor") ? AeInterfaceOscar.ExceptionInAdPackage : "";
  }
  
  public String e() {
    return "https://www.msefi.com/";
  }
  
  public AeInterfaceMikeTostring a(IOInAePackage paramp) {
    return IOInAfPackage.f(paramp);
  }
  
  public void f() {
    IOInAfPackage.a();
  }
  
  public void a(String paramString) {}
  
  public boolean g() {
    return false;
  }
  
  public List b(AeInterfaceMike paramm) {
    return new ArrayList();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ag/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */