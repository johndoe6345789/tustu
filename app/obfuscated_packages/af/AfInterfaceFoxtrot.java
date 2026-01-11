package af;

import G.AeInterfaceMikeTostring;
import G.GInterfaceCr;
import G.GInterfaceCv;
import J.SerializableImplInJPackage;
import ad.AdInterfaceAlpha;
import ad.ExceptionInAdPackage;
import ad.AdInterfaceDelta;
import ae.AdInterfaceDelta;
import ae.FileUsingHashMap;
import ae.AeInterfaceMike;
import ae.AeInterfaceOscar;
import ae.IOInAePackage;
import ae.AeInterfaceUniform;
import ae.ExceptionExtensionInAePackage;
import bH.D;
import bH.ExceptionInAdPackage;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AfInterfaceFoxtrot implements n {
  GInterfaceCv AdInterfaceAlpha = null;
  
  GInterfaceCr b = null;
  
  GInterfaceCv ExceptionInAdPackage = (GInterfaceCv)new SerializableImplInJPackage();
  
  GInterfaceCr AdInterfaceDelta = (GInterfaceCr)new J.f();
  
  List e = new ArrayList();
  
  AeInterfaceMike f = new AeInterfaceMike(this);
  
  e SerializableImplInJPackage = new e();
  
  String h = null;
  
  public String AdInterfaceAlpha() {
    return "MS3 Firmware Loader";
  }
  
  public String b() {
    return "Firmware loader for loading MS3 and MS3-Pro with version 1.1 and up Firmware.";
  }
  
  public List ExceptionInAdPackage() {
    ArrayList<AeInterfaceMike> arrayList = new ArrayList();
    arrayList.add(this.f);
    arrayList.add(this.SerializableImplInJPackage);
    return arrayList;
  }
  
  public List AdInterfaceDelta() {
    ArrayList<e> arrayList = new ArrayList();
    arrayList.add(this.SerializableImplInJPackage);
    arrayList.add(this.f);
    return arrayList;
  }
  
  public boolean AdInterfaceAlpha(AeInterfaceMike paramm) {
    return ((paramm.b() | AeInterfaceOscar.x) == paramm.b());
  }
  
  public boolean AdInterfaceAlpha(FileUsingHashMap paramk) {
    List<File> list = paramk.AdInterfaceDelta();
    for (byte b = 0; b < list.size(); b++) {
      try {
        AdInterfaceAlpha AdInterfaceAlpha = paramk.ExceptionInAdPackage(list.get(b));
        int i = Integer.MAX_VALUE;
        if (AdInterfaceAlpha.AdInterfaceAlpha().size() > 0) {
          int[] arrayOfInt = ((AdInterfaceDelta)AdInterfaceAlpha.AdInterfaceAlpha().get(0)).e();
          byte[] arrayOfByte = ExceptionInAdPackage.AdInterfaceAlpha(arrayOfInt);
          String str = new String(arrayOfByte);
          if (str.contains("ms3.s19") || str.contains("ms3pro-ult.s19") || str.contains("ms3pro-evo.s19") || str.contains("ms3pro-mini.s19") || str.contains("ms3pro-mini.s19") || str.contains("ms3pro-mini-plus.s19") || str.contains("ms3pro-competition.s19") || str.contains("ms3pro-comp.s19") || str.contains("ms3pro-plus.s19") || str.contains("ms3pro.s19"))
            return true; 
          D.b("s19 header does not resolve to AdInterfaceAlpha valid MS3 firmware file: " + str);
        } 
      } catch (ExceptionInAdPackage ExceptionInAdPackage) {
        Logger.getLogger(ExceptionInAdPackage.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInAdPackage);
      } 
    } 
    D.b("Selected Firmware Package not suitable for MS3 Firmware Loader.");
    return false;
  }
  
  public boolean AdInterfaceAlpha(AeInterfaceMike paramm, File paramFile) {
    return paramFile.getName().equals("ms3pro.s19") ? (((paramm.b() & AeInterfaceOscar.B) > 0)) : (paramFile.getName().equals("ms3pro-evo.s19") ? (((paramm.b() & AeInterfaceOscar.J) > 0)) : (paramFile.getName().equals("ms3pro-ult.s19") ? (((paramm.b() & AeInterfaceOscar.K) > 0)) : (paramFile.getName().equals("ms3pro-mini.s19") ? (((paramm.b() & AeInterfaceOscar.L) > 0)) : ((paramFile.getName().equals("ms3pro-mini-plus.s19") || paramFile.getName().equals("ms3pro-competition.s19") || paramFile.getName().equals("ms3pro-comp.s19")) ? (((paramm.b() & AeInterfaceOscar.N) > 0)) : ((paramFile.getName().equals("ms3pro-mod2.s19") || paramFile.getName().equals("ms3pro-plus.s19")) ? (((paramm.b() & AeInterfaceOscar.M) > 0)) : (paramFile.getName().equals("ms3.s19") ? (((paramm.b() & AeInterfaceOscar.B) == 0 && (paramm.b() & AeInterfaceOscar.J) == 0 && (paramm.b() & AeInterfaceOscar.K) == 0 && (paramm.b() & AeInterfaceOscar.L) == 0 && (paramm.b() & AeInterfaceOscar.M) == 0 && (paramm.b() & AeInterfaceOscar.x) > 0)) : false))))));
  }
  
  public boolean b(AeInterfaceMike paramm, File paramFile) {
    return paramFile.getName().equals("ms3pro.s19") ? (((paramm.b() & AeInterfaceOscar.B) > 0)) : (paramFile.getName().equals("ms3pro-evo.s19") ? (((paramm.b() & AeInterfaceOscar.J) > 0)) : (paramFile.getName().equals("ms3pro-ult.s19") ? (((paramm.b() & AeInterfaceOscar.K) > 0)) : (paramFile.getName().equals("ms3pro-mini.s19") ? (((paramm.b() & AeInterfaceOscar.L) > 0)) : ((paramFile.getName().equals("ms3pro-mini-plus.s19") || paramFile.getName().equals("ms3pro-competition.s19") || paramFile.getName().equals("ms3pro-comp.s19")) ? (((paramm.b() & AeInterfaceOscar.N) > 0)) : ((paramFile.getName().equals("ms3pro-mod2.s19") || paramFile.getName().equals("ms3pro-plus.s19")) ? (((paramm.b() & AeInterfaceOscar.M) > 0)) : (paramFile.getName().equals("ms3.s19") ? (((paramm.b() & AeInterfaceOscar.B) == 0 && (paramm.b() & AeInterfaceOscar.J) == 0 && (paramm.b() & AeInterfaceOscar.K) == 0 && (paramm.b() & AeInterfaceOscar.L) == 0 && (paramm.b() & AeInterfaceOscar.N) == 0 && (paramm.b() & AeInterfaceOscar.M) == 0 && (paramm.b() & AeInterfaceOscar.x) > 0)) : false))))));
  }
  
  public AdInterfaceDelta AdInterfaceAlpha(FileUsingHashMap paramk, IOInAePackage paramp, AeInterfaceUniform paramu) {
    AdInterfaceDelta AdInterfaceDelta = null;
    AdInterfaceDelta = j.AdInterfaceAlpha(paramp);
    if (AdInterfaceDelta.AdInterfaceAlpha() == AdInterfaceDelta.b)
      return AdInterfaceDelta; 
    File file = paramk.SerializableImplInJPackage();
    if (file == null) {
      AdInterfaceDelta.AdInterfaceAlpha(AdInterfaceDelta.b);
      AdInterfaceDelta.AdInterfaceAlpha("No Firmware File Selected!");
      return AdInterfaceDelta;
    } 
    D.AdInterfaceDelta("Loading Firmware File: " + file.getAbsolutePath());
    try {
      AdInterfaceAlpha AdInterfaceAlpha = paramk.ExceptionInAdPackage(file);
      h h = h.AdInterfaceAlpha(AdInterfaceAlpha.ExceptionInAdPackage(), this.h);
      paramu.AdInterfaceAlpha(0.0D);
      paramu.AdInterfaceAlpha("Erasing main flash");
      List list = AdInterfaceAlpha(AdInterfaceAlpha);
      AdInterfaceDelta = j.AdInterfaceAlpha(paramp, list, paramu, this.SerializableImplInJPackage);
      if (AdInterfaceDelta.AdInterfaceAlpha() == AdInterfaceDelta.b)
        return AdInterfaceDelta; 
      boolean bool = this.SerializableImplInJPackage.ExceptionInAdPackage();
      SerializableImplInJPackage SerializableImplInJPackage = new SerializableImplInJPackage(this, bool, h);
      paramu.AdInterfaceAlpha("Loading firmware");
      AdInterfaceDelta = j.b(AdInterfaceAlpha, paramp, paramu, SerializableImplInJPackage);
      paramu.AdInterfaceAlpha("");
    } catch (ExceptionInAdPackage ExceptionInAdPackage) {
      AdInterfaceDelta.AdInterfaceAlpha(AdInterfaceDelta.b);
      AdInterfaceDelta.AdInterfaceAlpha("Unable to read S19 File.");
      D.AdInterfaceAlpha("Unable to parse S19 File: " + file.getAbsolutePath());
      ExceptionInAdPackage.printStackTrace();
      return AdInterfaceDelta;
    } catch (ExceptionExtensionInAePackage ExceptionExtensionInAePackage) {
      Logger.getLogger(ExceptionInAdPackage.class.getName()).log(Level.SEVERE, "Unexpected Protocol Error", (Throwable)ExceptionExtensionInAePackage);
      AdInterfaceDelta.AdInterfaceAlpha(AdInterfaceDelta.b);
      AdInterfaceDelta.AdInterfaceAlpha("Unexpected Protocol Error");
      return AdInterfaceDelta;
    } 
    return AdInterfaceDelta;
  }
  
  private List AdInterfaceAlpha(AdInterfaceAlpha parama) {
    ArrayList<l> arrayList = new ArrayList();
    HashMap<Object, Object> hashMap = new HashMap<>();
    for (AdInterfaceDelta AdInterfaceDelta : parama.b()) {
      if (AdInterfaceDelta.AdInterfaceDelta() > 2097152 && AdInterfaceDelta.AdInterfaceDelta() < 8126464) {
        int i = AdInterfaceDelta.AdInterfaceDelta() >>> 16;
        l l = null;
        if (hashMap.get(Integer.valueOf(i)) == null) {
          l = new l(i);
          hashMap.put(Integer.valueOf(i), l);
          l.AdInterfaceAlpha(AdInterfaceDelta.AdInterfaceDelta());
          arrayList.add(l);
          continue;
        } 
        if (l == null)
          l = (l)hashMap.get(Integer.valueOf(i)); 
        l.AdInterfaceAlpha(AdInterfaceDelta.AdInterfaceDelta());
      } 
    } 
    return arrayList;
  }
  
  public String e() {
    return "https://www.msextra.com/forums/viewforum.php?f=101";
  }
  
  public AeInterfaceMikeTostring AdInterfaceAlpha(IOInAePackage paramp) {
    return j.f(paramp);
  }
  
  public void f() {
    j.AdInterfaceAlpha();
  }
  
  public String AdInterfaceAlpha(File paramFile) {
    return paramFile.getName().equalsIgnoreCase("ms3pro.s19") ? AeInterfaceOscar.l : (paramFile.getName().equalsIgnoreCase("ms3pro-ult.s19") ? AeInterfaceOscar.n : (paramFile.getName().equalsIgnoreCase("ms3pro-evo.s19") ? AeInterfaceOscar.AeInterfaceMike : (paramFile.getName().equalsIgnoreCase("ms3pro-mini.s19") ? AeInterfaceOscar.AeInterfaceOscar : ((paramFile.getName().equals("ms3pro-mini-plus.s19") || paramFile.getName().equals("ms3pro-competition.s19") || paramFile.getName().equals("ms3pro-comp.s19")) ? AeInterfaceOscar.IOInAePackage : ((paramFile.getName().equalsIgnoreCase("ms3pro-mod2.s19") || paramFile.getName().equals("ms3pro-plus.s19")) ? AeInterfaceOscar.q : (paramFile.getName().equalsIgnoreCase("ms3.s19") ? AeInterfaceOscar.FileUsingHashMap : ""))))));
  }
  
  public void AdInterfaceAlpha(String paramString) {
    this.h = paramString;
    this.SerializableImplInJPackage.AdInterfaceAlpha(this.h);
  }
  
  public GInterfaceCr AdInterfaceAlpha(AeInterfaceMikeTostring parambT) {
    return this.b;
  }
  
  public GInterfaceCv b(AeInterfaceMikeTostring parambT) {
    return this.AdInterfaceAlpha;
  }
  
  public void h() {
    this.AdInterfaceAlpha = this.ExceptionInAdPackage;
    this.b = this.AdInterfaceDelta;
  }
  
  public void i() {
    this.AdInterfaceAlpha = null;
    this.b = null;
  }
  
  public boolean j() {
    return (this.AdInterfaceAlpha == null && this.b == null);
  }
  
  public boolean SerializableImplInJPackage() {
    return this.SerializableImplInJPackage.AdInterfaceDelta();
  }
  
  public List b(AeInterfaceMike paramm) {
    ArrayList<String> arrayList = new ArrayList();
    if ((paramm.b() & AeInterfaceOscar.B) > 0) {
      arrayList.add("ms3pro.s19");
    } else if ((paramm.b() & AeInterfaceOscar.J) > 0) {
      arrayList.add("ms3pro-evo.s19");
    } else if ((paramm.b() & AeInterfaceOscar.K) > 0) {
      arrayList.add("ms3pro-ult.s19");
    } else if ((paramm.b() & AeInterfaceOscar.L) > 0) {
      arrayList.add("ms3pro-mini.s19");
    } else if ((paramm.b() & AeInterfaceOscar.N) > 0) {
      arrayList.add("ms3pro-comp.s19");
      arrayList.add("ms3pro-competition.s19");
      arrayList.add("ms3pro-mini-plus.s19");
    } else if ((paramm.b() & AeInterfaceOscar.M) > 0) {
      arrayList.add("ms3pro-plus.s19");
    } else if ((paramm.b() & AeInterfaceOscar.B) == 0 && (paramm.b() & AeInterfaceOscar.J) == 0 && (paramm.b() & AeInterfaceOscar.K) == 0 && (paramm.b() & AeInterfaceOscar.L) == 0 && (paramm.b() & AeInterfaceOscar.M) == 0 && (paramm.b() & AeInterfaceOscar.x) > 0) {
      arrayList.add("ms3.s19");
    } 
    return arrayList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/af/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */