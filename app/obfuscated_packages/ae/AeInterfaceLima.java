package ae;

import W.D;
import bH.ae;
import java.io.File;
import java.util.ArrayList;

public class AeInterfaceLima {
  public static k a(File paramFile) {
    String str = paramFile.getName().toLowerCase();
    if (str.endsWith("zip"))
      return b(paramFile); 
    if (str.endsWith("s19") || str.endsWith("mot") || str.endsWith("bsf")) {
      k k = new k();
      File file = paramFile.getParentFile();
      a(file, k);
      return k;
    } 
    throw new x("Unknown file type.");
  }
  
  private static k a(File paramFile, k paramk) {
    for (File file : paramFile.listFiles()) {
      if (file.isFile() && (file.getName().toLowerCase().endsWith("ini") || file.getName().toLowerCase().endsWith("ecu"))) {
        paramk.a(file);
      } else if (file.isFile() && (file.getName().toLowerCase().endsWith("s19") || file.getName().toLowerCase().endsWith("mot") || file.getName().toLowerCase().endsWith("bsf"))) {
        paramk.b(file);
      } else if (file.isFile() && file.getName().toLowerCase().startsWith("license")) {
        paramk.e(file);
      } else if (file.isFile() && file.getName().toLowerCase().startsWith("readme")) {
        paramk.d(file);
      } else if (file.isFile() && file.getName().toLowerCase().startsWith("release") && file.getName().toLowerCase().contains("notes")) {
        paramk.g(file);
      } 
    } 
    return paramk;
  }
  
  private static k b(File paramFile) {
    File file1 = File.createTempFile("tmp", Long.toString(System.nanoTime()));
    File file2 = file1.getParentFile();
    file2 = new File(file2, "firmware" + Long.toString(System.currentTimeMillis()));
    file2.mkdir();
    file1.delete();
    ArrayList arrayList = ae.a(paramFile, file2, null);
    D.a().a(file2);
    while ((file2.list()).length == 1 && file2.listFiles()[0].isDirectory()) {
      File file = file2.listFiles()[0];
      file2 = file;
    } 
    k k = new k();
    a(file2, k);
    return k;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ae/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */