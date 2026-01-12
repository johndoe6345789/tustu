package business.bit_array_utils;

public class aa {
  private long a = 0L;

  private float b = -1.0F;

  private long c = -1L;

  private int d = 0;

  public void a() {
    this.d++;
    this.a = System.nanoTime();
  }

  public long b() {
    this.c = System.nanoTime() - this.a;
    return this.c;
  }

  public float a(long paramLong) {
    return (float) paramLong / 1000000.0F;
  }

  public float c() {
    return a(this.c);
  }

  public float d() {
    b();
    return a(this.c);
  }

  public void e() {
    this.a = 0L;
    this.b = -1.0F;
    this.c = -1L;
    this.d = 0;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/aa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
