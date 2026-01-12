package ae;

import G.AeInterfaceMikeTostring;
import W.z;
import ad.AdInterfaceAlpha;
import ad.AdInterfaceBravo;
import bH.D;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FileUsingHashMap {
  private final List AdInterfaceBravo = new ArrayList();

  private final List c = new ArrayList();

  private File d = null;

  private File e = null;

  private File f = null;

  private File g = null;

  private HashMap h = new HashMap<>();

  List AdInterfaceAlpha = new ArrayList();

  private e i = new AdInterfaceBravo();

  public boolean AdInterfaceAlpha() {
    return !this.c.isEmpty();
  }

  public boolean AdInterfaceBravo() {
    return !this.AdInterfaceBravo.isEmpty();
  }

  public void AdInterfaceAlpha(File paramFile) {
    this.AdInterfaceBravo.add(paramFile);
  }

  public void AdInterfaceBravo(File paramFile) {
    this.c.add(paramFile);
  }

  public List c() {
    return this.AdInterfaceBravo;
  }

  public List d() {
    return this.c;
  }

  public AdInterfaceAlpha c(File paramFile) {
    AdInterfaceAlpha AdInterfaceAlpha = (AdInterfaceAlpha) this.h.get(paramFile);
    if (AdInterfaceAlpha == null) {
      AdInterfaceBravo AdInterfaceBravo = new AdInterfaceBravo();
      AdInterfaceAlpha = AdInterfaceBravo.AdInterfaceAlpha(paramFile);
      this.h.put(paramFile, AdInterfaceAlpha);
    }
    return AdInterfaceAlpha;
  }

  public File e() {
    return this.d;
  }

  public void d(File paramFile) {
    this.d = paramFile;
  }

  public File f() {
    return this.e;
  }

  public void e(File paramFile) {
    this.e = paramFile;
  }

  public File g() {
    return this.g;
  }

  public void f(File paramFile) {
    this.g = paramFile;
  }

  public e h() {
    return this.i;
  }

  public File i() {
    return this.f;
  }

  public void g(File paramFile) {
    this.f = paramFile;
  }

  public File AdInterfaceAlpha(AeInterfaceMikeTostring parambT) {
    List<File> list = c();
    if (!AdInterfaceBravo()) return null;
    for (File file : list) {
      String str = z.AdInterfaceAlpha(file);
      if (str != null && str.equals(parambT.AdInterfaceBravo())) return file;
    }
    D.AdInterfaceBravo(
        "Did not find an exact match for firmware signature: "
            + parambT.AdInterfaceBravo()
            + "\nReturning:"
            + ((File) list.get(0)).getAbsolutePath());
    return list.get(0);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ae/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
