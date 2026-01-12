package X;

import bH.D;
import bH.aa;
import bH.g;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FileInXPackage {
  private static c e = null;

  private File f = null;

  g a = new g();

  String b;

  public static String c = ".cached";

  private boolean g = false;

  private b h = new d();

  Map d = new HashMap<>();

  private FileInXPackage() {
    a("JavaSerialization", this.h);
    a("EFIA_Filtered_JSON", new a());
    this.a.a(this.h.a().getBytes());
    this.b = Integer.toHexString(this.a.b()).toUpperCase();
  }

  public static c a() {
    if (e == null) e = new c();
    return e;
  }

  public void a(boolean paramBoolean) {
    this.g = paramBoolean;
    for (b b1 : this.d.values()) b1.a(this.g);
  }

  public void a(String paramString, b paramb) {
    this.d.put(paramString, paramb);
  }

  public void a(Object paramObject, String paramString, File paramFile) {
    aa aa = new aa();
    aa.a();
    File file = a(paramFile, paramString);
    this.h.a(paramObject, file);
    D.d("Time to write cache Object: " + aa.d());
  }

  public Object a(String paramString, File paramFile) {
    Object object;
    aa aa = new aa();
    aa.a();
    File file = a(paramFile, paramString);
    if (file.exists()) {
      object = this.h.a(file);
      D.d("Time to read cache Object: " + aa.d());
    } else {
      object = null;
    }
    return object;
  }

  public void a(File paramFile) {
    for (File file : paramFile.listFiles()) {
      if (file.getName().endsWith(c)) file.delete();
    }
  }

  private File a(File paramFile, String paramString) {
    return new File(paramFile, paramString + this.b + c);
  }

  public void b(File paramFile) {
    this.f = paramFile;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/X/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
