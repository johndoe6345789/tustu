package W;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

class File {
  private File a = null;

  private long b = -1L;

  private ArrayList c = new ArrayList();

  private long d = -1L;

  private long e = -2L;

  private long f = 0L;

  public File(File paramFile) {
    this.a = paramFile;
  }

  public long a() {
    return this.b;
  }

  public void a(long paramLong) {
    this.b = paramLong;
  }

  public void a(B paramB) {
    this.c.add(paramB);
  }

  public void b() {
    this.b = this.d;
  }

  public void c() {
    this.b = this.e;
  }

  public void d() {
    a(this.a.lastModified());
  }

  public boolean e() {
    if (a() == this.e) return false;
    if (a() == this.d) a(this.a.lastModified());
    return (this.a.lastModified() != a());
  }

  void f() {
    Iterator<B> iterator = this.c.iterator();
    while (iterator.hasNext()) ((B) iterator.next()).a(g());
  }

  public File g() {
    return this.a;
  }

  public void h() {
    this.c.clear();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/ae.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
