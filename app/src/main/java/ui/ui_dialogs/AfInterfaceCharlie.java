package af;

import G.AeInterfaceMikeTostring;
import G.GInterfaceCr;
import G.GInterfaceCv;
import J.SerializableImpl;
import J.SerializableImplInJPackage;
import ad.AdInterfaceAlpha;
import ad.AdInterfaceDelta;
import ae.AdInterfaceDelta;
import ae.AeInterfaceMike;
import ae.AeInterfaceOscar;
import ae.AeInterfaceUniform;
import ae.ExceptionExtensionInAePackage;
import ae.FileUsingHashMap;
import ae.IOInAePackage;
import bH.D;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AfInterfaceCharlie implements n {
  GInterfaceCv AdInterfaceAlpha = null;

  GInterfaceCr b = null;

  GInterfaceCv c = (GInterfaceCv) new SerializableImplInJPackage();

  GInterfaceCr AdInterfaceDelta = (GInterfaceCr) new SerializableImpl();

  List e = new ArrayList();

  FileUsingHashMap SerializableImpl = new FileUsingHashMap(this);

  b SerializableImplInJPackage = new b();

  public static String h = "https://www.msextra.com/forums/viewforum.php?SerializableImpl=101";

  public static String i = "https://www.msextra.com/forums/viewforum.php?SerializableImpl=138";

  private String FileUsingHashMap = h;

  boolean j = true;

  public String AdInterfaceAlpha() {
    return "MS2 Extra Firmware Loader";
  }

  public String b() {
    return "Firmware loader for loading MS2 Extra version 3.3 and up Firmware.";
  }

  public List c() {
    ArrayList<FileUsingHashMap> arrayList = new ArrayList();
    arrayList.add(this.SerializableImpl);
    if (this.j) arrayList.add(this.SerializableImplInJPackage);
    return arrayList;
  }

  public List AdInterfaceDelta() {
    ArrayList<b> arrayList = new ArrayList();
    if (this.j) arrayList.add(this.SerializableImplInJPackage);
    arrayList.add(this.SerializableImpl);
    return arrayList;
  }

  public GInterfaceCr AdInterfaceAlpha(AeInterfaceMikeTostring parambT) {
    return this.b;
  }

  public GInterfaceCv b(AeInterfaceMikeTostring parambT) {
    return this.AdInterfaceAlpha;
  }

  public void h() {
    this.AdInterfaceAlpha = this.c;
    this.b = this.AdInterfaceDelta;
  }

  public void i() {
    this.AdInterfaceAlpha = null;
    this.b = null;
  }

  public boolean j() {
    return (this.AdInterfaceAlpha == null && this.b == null);
  }

  public boolean AdInterfaceAlpha(AeInterfaceMike paramm) {
    return ((paramm.b() | 0x1) == paramm.b());
  }

  public boolean AdInterfaceAlpha(FileUsingHashMap paramk) {
    List<File> list = paramk.AdInterfaceDelta();
    for (byte b1 = 0; b1 < list.size(); b1++) {
      try {
        AdInterfaceAlpha AdInterfaceAlpha = paramk.c(list.get(b1));
        if (AdInterfaceAlpha.AdInterfaceAlpha().size() > 0) {
          int[] arrayOfInt = ((AdInterfaceDelta) AdInterfaceAlpha.AdInterfaceAlpha().get(0)).e();
          byte[] arrayOfByte = bH.c.AdInterfaceAlpha(arrayOfInt);
          String str = new String(arrayOfByte);
          if (str.contains("megasquirt2.s19")
              || str.contains("microsquirt.s19")
              || str.contains("microsquirt-module.s19")
              || str.contains("ms2_extra.s19")
              || str.contains("ms2_extra_us.s19")
              || str.contains("mspnp2.s19")) {
            this.j = true;
            this.SerializableImpl.AdInterfaceAlpha(false);
            return true;
          }
          if (str.contains("trans.s19")) this.j = false;
        }
        File file = list.get(b1);
        if ((file.getName().startsWith("iobox") && file.getName().endsWith(".s19"))
            || (file.getName().startsWith("trans") && file.getName().endsWith(".s19"))) return true;
      } catch (ad.c c1) {
        Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String) null, (Throwable) c1);
      }
    }
    D.b("Selected Firmware Package not suitable for MS2e Firmware Loader.");
    return false;
  }

  public boolean AdInterfaceAlpha(AeInterfaceMike paramm, File paramFile) {
    if (paramFile.getName().startsWith("trans")) {
      this.FileUsingHashMap = i;
    } else {
      this.FileUsingHashMap = h;
    }
    return (paramFile.getName().equals("microsquirt.s19")
            || (paramFile.getName().startsWith("iobox") && paramFile.getName().endsWith(".s19"))
            || (paramFile.getName().startsWith("trans") && paramFile.getName().endsWith(".s19")))
        ? (((paramm.b() & AeInterfaceOscar.D) > 0))
        : (paramFile.getName().equals("microsquirt-module.s19")
            ? (((paramm.b() & AeInterfaceOscar.G) > 0))
            : (paramFile.getName().equals("mspnp2.s19")
                ? (((paramm.b() & AeInterfaceOscar.E) > 0))
                : (paramFile.getName().equals("megasquirt2.s19")
                    ? (((paramm.b() & AeInterfaceOscar.w) > 0))
                    : false)));
  }

  public boolean b(AeInterfaceMike paramm, File paramFile) {
    return paramFile.getName().equals("microsquirt.s19")
        ? (((paramm.b() & AeInterfaceOscar.D) > 0))
        : (paramFile.getName().equals("microsquirt-module.s19")
            ? (((paramm.b() & AeInterfaceOscar.G) > 0))
            : (paramFile.getName().equals("mspnp2.s19")
                ? (((paramm.b() & AeInterfaceOscar.E) > 0))
                : (paramFile.getName().equals("megasquirt2.s19")
                    ? (((paramm.b() & AeInterfaceOscar.C) > 0))
                    : (paramFile.getName().equals("trans.s19")
                        ? (((paramm.b() & AeInterfaceOscar.w) > 0))
                        : (paramFile.getName().equals("iobox.s19")
                            ? (((paramm.b() & AeInterfaceOscar.w) > 0))
                            : false)))));
  }

  public AdInterfaceDelta AdInterfaceAlpha(
      FileUsingHashMap paramk, IOInAePackage paramp, AeInterfaceUniform paramu) {
    AdInterfaceDelta AdInterfaceDelta = null;
    AdInterfaceDelta = j.AdInterfaceAlpha(paramp);
    if (AdInterfaceDelta.AdInterfaceAlpha() == AdInterfaceDelta.b) return AdInterfaceDelta;
    AdInterfaceDelta = j.c(paramp);
    if (AdInterfaceDelta.AdInterfaceAlpha() == AdInterfaceDelta.b) return AdInterfaceDelta;
    File file = paramk.SerializableImplInJPackage();
    if (file == null) {
      AdInterfaceDelta.AdInterfaceAlpha(AdInterfaceDelta.b);
      AdInterfaceDelta.AdInterfaceAlpha("No Firmware File Selected!");
      return AdInterfaceDelta;
    }
    D.AdInterfaceDelta("Loading Firmware File: " + file.getAbsolutePath());
    try {
      AdInterfaceAlpha AdInterfaceAlpha = paramk.c(file);
      AdInterfaceDelta d1 = new AdInterfaceDelta(this);
      AdInterfaceDelta = j.AdInterfaceAlpha(AdInterfaceAlpha, paramp, paramu, d1);
    } catch (ad.c c1) {
      AdInterfaceDelta.AdInterfaceAlpha(AdInterfaceDelta.b);
      AdInterfaceDelta.AdInterfaceAlpha("Unable to read S19 File.");
      D.AdInterfaceAlpha("Unable to parse S19 File: " + file.getAbsolutePath());
      c1.printStackTrace();
      return AdInterfaceDelta;
    } catch (ExceptionExtensionInAePackage ExceptionExtensionInAePackage) {
      Logger.getLogger(c.class.getName())
          .log(
              Level.SEVERE, "Unexpected Protocol Error", (Throwable) ExceptionExtensionInAePackage);
      AdInterfaceDelta.AdInterfaceAlpha(AdInterfaceDelta.b);
      AdInterfaceDelta.AdInterfaceAlpha("Unexpected Protocol Error");
      return AdInterfaceDelta;
    }
    return AdInterfaceDelta;
  }

  public String e() {
    return this.FileUsingHashMap;
  }

  public AeInterfaceMikeTostring AdInterfaceAlpha(IOInAePackage paramp) {
    return j.SerializableImpl(paramp);
  }

  public void SerializableImpl() {
    j.AdInterfaceAlpha();
  }

  public String AdInterfaceAlpha(File paramFile) {
    return paramFile.getName().equalsIgnoreCase("megasquirt2.s19")
        ? AeInterfaceOscar.SerializableImpl
        : ((paramFile.getName().equalsIgnoreCase("microsquirt.s19")
                || paramFile.getName().equalsIgnoreCase("ms2_extra_us.s19"))
            ? AeInterfaceOscar.e
            : (paramFile.getName().equalsIgnoreCase("microsquirt-module.s19")
                ? AeInterfaceOscar.SerializableImplInJPackage
                : (paramFile.getName().equalsIgnoreCase("ms2_extra.s19")
                    ? AeInterfaceOscar.c
                    : (paramFile.getName().equalsIgnoreCase("ms2_extra_us.s19")
                        ? AeInterfaceOscar.SerializableImplInJPackage
                        : (paramFile.getName().equalsIgnoreCase("mspnp2.s19")
                            ? AeInterfaceOscar.i
                            : (paramFile.getName().equalsIgnoreCase("trans.s19")
                                ? AeInterfaceOscar.c
                                : ""))))));
  }

  public void AdInterfaceAlpha(String paramString) {}

  public boolean SerializableImplInJPackage() {
    return false;
  }

  public List b(AeInterfaceMike paramm) {
    return new ArrayList();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/af/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
