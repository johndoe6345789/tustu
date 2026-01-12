package business.abstract_views;

class ThreadedInAvPackage extends Thread {
  boolean a = true;

  boolean b = false;

  boolean c = false;

  boolean d = false;

  long e = 250L;

  ThreadedInAvPackage(j paramj) {}

  public void run() {
    try {
      while (this.a) {
        this.a = false;
        Thread.sleep(this.e);
      }
      this.f.a = null;
      if (this.b) {
        this.b = false;
        j.a(this.f);
      }
      if (this.c) {
        this.c = false;
        j.b(this.f);
      }
      if (this.d) {
        this.d = false;
        j.c(this.f);
      }
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }

  public void a() {
    this.b = true;
    d();
  }

  public void b() {
    this.c = true;
    d();
  }

  public void c() {
    this.d = true;
    d();
  }

  private void d() {
    this.a = true;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/av/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
