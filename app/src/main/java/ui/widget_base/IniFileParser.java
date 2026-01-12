package W;

import bH.X;
import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class IniFileParser {
  private ArrayList a = null;

  private ArrayList b = null;

  private HashMap c = null;

  private ArrayList d = null;

  private K e = new L(this);

  private File f = null;

  private String g = null;

  private void e() {
    this.a = new ArrayList();
    this.b = new ArrayList();
    this.c = new HashMap<>();
    this.d = new ArrayList();
  }

  public void a(File paramFile) {
    a(paramFile, false);
  }

  public void a(File paramFile, boolean paramBoolean) {
    e();
    if (!paramFile.exists()) System.out.println("Can not find File:" + paramFile.getAbsolutePath());
    this.f = paramFile;
    BufferedReader bufferedReader = this.e.a(paramFile);
    String str = "";
    byte b = 0;
    try {
      this.b.add("FILE_HEADER");
      while ((str = bufferedReader.readLine()) != null) {
        b++;
        M m = new M(paramFile.getName());
        m.a(str, b);
        if (str.startsWith("[") && str.indexOf("]") > 0) {
          String str1 = X.b(X.b(str, "[", ""), "]", "").trim();
          if (this.g != null && str1.equals(this.g)) break;
          this.b.add(str1);
        } else if (str.startsWith("#include")) {
          String str1 = X.b(str, "#include", "");
          str1 = X.b(str1, "\"", "").trim();
          this.d.add(str1);
        }
        if (paramBoolean || !m.d()) this.a.add(m);
      }
    } finally {
      try {
        bufferedReader.close();
      } catch (Exception exception) {
      }
    }
  }

  public boolean a(String paramString) {
    return this.b.contains(paramString);
  }

  public N b(String paramString) {
    N n1 = (N) this.c.get(paramString);
    if (n1 != null && n1.size() > 0) return n1;
    String str = null;
    if (this.c.isEmpty()) {
      str = "FILE_HEADER";
      if (this.c.get(str) == null) {
        n1 = new N();
        this.c.put(str, n1);
        n1.a(str);
      }
      for (M m : a()) {
        if (m.b().startsWith("[") && m.b().indexOf("]") > 0) {
          str = X.b(m.b(), "[", "");
          str = X.b(str, "]", "");
          if (this.c.get(str) == null) {
            n1 = new N();
            this.c.put(str, n1);
            n1.a(str);
          }
          continue;
        }
        if (n1 != null) n1.add((E) m);
      }
    }
    N n2 = (N) this.c.get(paramString);
    if (n2 == null) {
      n2 = new N();
      n2.a(paramString);
      this.c.put(paramString, n2);
    }
    return n2;
  }

  public M a(String paramString1, String paramString2) {
    N n = b(paramString1);
    return (n == null) ? null : n.b(paramString2);
  }

  public ArrayList a() {
    return this.a;
  }

  public void a(ArrayList paramArrayList) {
    this.a = paramArrayList;
    this.c.clear();
  }

  public Iterator b() {
    return this.b.iterator();
  }

  public Iterator c() {
    return this.d.iterator();
  }

  protected void a(String paramString, M paramM) {
    boolean bool = false;
    for (byte b = 0; b < this.a.size(); b++) {
      M m = this.a.get(b);
      if (m.b().equals("[" + paramString + "]")) {
        bool = true;
      } else if (bool && (m.b().startsWith("[") || b == this.a.size() - 1)) {
        this.a.add(b, paramM);
        break;
      }
    }
  }

  public void a(K paramK) {
    this.e = paramK;
  }

  public void c(String paramString) {
    this.g = paramString;
  }

  public File d() {
    return this.f;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/J.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
