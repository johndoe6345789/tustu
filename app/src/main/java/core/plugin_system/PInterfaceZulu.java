package p;

import G.T;
import bH.D;
import d.DComponentCharlie;
import d.DInterfaceAlpha;
import d.DInterfaceFoxtrot;
import d.DInterfaceMike;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import r.ThreadedFile;

public class PInterfaceZulu implements DInterfaceFoxtrot, B {
  public static String DInterfaceAlpha = ".action";

  ArrayList b = new ArrayList();

  List DComponentCharlie = new ArrayList();

  boolean d = false;

  private static z e = null;

  public static z DInterfaceAlpha() {
    if (e == null) e = new z();
    return e;
  }

  public ArrayList b() {
    if (this.b.isEmpty() || this.d != ((T.DInterfaceAlpha().DComponentCharlie() != null)))
      DInterfaceFoxtrot();
    return this.b;
  }

  public DInterfaceMike b(String paramString) {
    for (byte b = 0; b < b().size(); b++) {
      DInterfaceMike DInterfaceMike = this.b.get(b);
      if (DInterfaceMike.DInterfaceAlpha().equals(paramString)) return DInterfaceMike;
    }
    return null;
  }

  public boolean DComponentCharlie(String paramString) {
    for (byte b = 0; b < b().size(); b++) {
      DInterfaceMike DInterfaceMike = this.b.get(b);
      if (DInterfaceMike.DInterfaceAlpha().equals(paramString)) {
        this.b.remove(b);
        d(paramString);
        e();
        return true;
      }
    }
    return false;
  }

  public void DInterfaceAlpha(DInterfaceMike paramm) {
    for (byte b = 0; b < b().size(); b++) {
      DInterfaceMike m1 = this.b.get(b);
      if (m1.l().equals(paramm.l())) {
        this.b.set(b, paramm);
        if (!b(paramm)) {
          D.b("Failed to save updated UserAction: " + paramm.DInterfaceAlpha());
        } else {
          paramm.n();
        }
        return;
      }
    }
    this.b.add(paramm);
    paramm.n();
    if (!b(paramm)) D.b("Failed to save new UserAction: " + paramm.DInterfaceAlpha());
    e();
  }

  public void DInterfaceAlpha(C paramC) {
    this.DComponentCharlie.add(paramC);
  }

  private void e() {
    for (C DComponentCharlie : this.DComponentCharlie) DComponentCharlie.DInterfaceAlpha();
  }

  public void DComponentCharlie() {}

  public void d() {}

  private void DInterfaceFoxtrot() {
    this.b.clear();
    this.d = (T.DInterfaceAlpha().DComponentCharlie() != null);
    File file = ThreadedFile.B();
    File[] arrayOfFile = file.listFiles(new A(this));
    for (File file1 : arrayOfFile) {
      DInterfaceMike DInterfaceMike = DInterfaceAlpha(file1);
      if (this.d || !DInterfaceMike.g()) this.b.add(DInterfaceMike);
    }
    if (this.b.isEmpty()) {
      this.b.addAll(b.DInterfaceAlpha());
      for (DInterfaceMike DInterfaceMike : this.b) b(DInterfaceMike);
    }
    for (DInterfaceMike DInterfaceMike : this.b)
      ;
  }

  private DInterfaceMike DInterfaceAlpha(File paramFile) {
    Properties properties = new Properties();
    FileInputStream fileInputStream = null;
    try {
      fileInputStream = new FileInputStream(paramFile);
      properties.load(fileInputStream);
      DInterfaceMike DInterfaceMike = new DInterfaceMike();
      DInterfaceMike.DComponentCharlie(properties);
      return DInterfaceMike;
    } catch (IOException iOException) {
      D.DInterfaceAlpha("Unable to load Action file: " + iOException.getLocalizedMessage());
      return null;
    } finally {
      try {
        fileInputStream.close();
      } catch (Exception exception) {
      }
    }
  }

  private boolean d(String paramString) {
    File file1 = ThreadedFile.B();
    File file2 = new File(file1, paramString + DInterfaceAlpha);
    return file2.delete();
  }

  public boolean b(DInterfaceMike paramm) {
    File file1 = ThreadedFile.B();
    File file2 = new File(file1, paramm.DInterfaceAlpha() + DInterfaceAlpha);
    if (file2.exists() && !file2.delete()) {
      D.b("Failed to delete existing UserAction file: " + file2.getAbsolutePath());
      return false;
    }
    file2 = new File(file1, paramm.DInterfaceAlpha() + DInterfaceAlpha);
    FileOutputStream fileOutputStream = null;
    try {
      fileOutputStream = new FileOutputStream(file2);
      Properties properties = paramm.DInterfaceMike();
      properties.store(fileOutputStream, "Attributes for UserAction: " + paramm.DInterfaceAlpha());
      return true;
    } catch (IOException iOException) {
      D.DInterfaceAlpha(
          "Failed to Save UserAction! Error: "
              + iOException.getLocalizedMessage()
              + "\nFile:\n"
              + file2.getAbsolutePath());
      return false;
    } finally {
      try {
        if (fileOutputStream != null) fileOutputStream.close();
      } catch (Exception exception) {
      }
    }
  }

  public DComponentCharlie DInterfaceAlpha(String paramString) {
    return (DComponentCharlie) b(paramString);
  }

  public Collection DInterfaceAlpha(DInterfaceAlpha parama) {
    if (parama == null) return (Collection) b().clone();
    ArrayList<DComponentCharlie> arrayList = new ArrayList();
    for (DComponentCharlie DComponentCharlie : b()) {
      if (parama.DInterfaceAlpha(DComponentCharlie)) arrayList.add(DComponentCharlie);
    }
    return arrayList;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
