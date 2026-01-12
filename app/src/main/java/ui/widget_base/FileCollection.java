package W;

import bH.b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileCollection implements b {
  List a = new ArrayList();

  private static FileCollection b = null;

  public static FileCollection a() {
    if (b == null) b = new FileCollection();
    return b;
  }

  public void a(File paramFile) {
    this.a.add(paramFile);
  }

  public boolean b() {
    return true;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
