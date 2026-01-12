package r;

import bH.X;
import java.io.File;

class TostringInRPackage {
  File a = null;

  public TostringInRPackage(b paramb, File paramFile) {
    this.a = paramFile;
  }

  public File a() {
    return this.a;
  }

  public String toString() {
    return X.b(this.a.getName(), ".dash", "");
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/r/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
