package aI;

public class c {
  private int a = 0;
  
  private int b = -1;
  
  private int c = -1;
  
  private int d = -1;
  
  private int e = -1;
  
  private int f = -1;
  
  private int g = -1;
  
  private long h = -1L;
  
  public int a() {
    return this.d;
  }
  
  public int b() {
    return a() + e() * f();
  }
  
  public int c() {
    return this.a;
  }
  
  public void a(int paramInt) {
    this.a = paramInt;
  }
  
  public int d() {
    return this.b;
  }
  
  public void b(int paramInt) {
    this.b = paramInt;
  }
  
  public void c(int paramInt) {
    this.c = paramInt;
  }
  
  public void d(int paramInt) {
    this.d = paramInt;
  }
  
  public int e() {
    return this.e;
  }
  
  public void e(int paramInt) {
    this.e = paramInt;
  }
  
  public int f() {
    return this.f;
  }
  
  public void f(int paramInt) {
    this.f = paramInt;
  }
  
  public void g(int paramInt) {
    this.g = paramInt;
  }
  
  public String toString() {
    return "SD Format Info: FAT" + this.a + ", bytesPerSector = 0x" + Integer.toHexString(this.b).toUpperCase() + ", numberReservedSectors = 0x" + Integer.toHexString(this.d).toUpperCase() + ", numberOfFileAllocTables = 0x" + Integer.toHexString(this.e).toUpperCase() + ", sectorsPerFileAllocTable = 0x" + Integer.toHexString(this.f).toUpperCase() + ", totalLogicalSectors = 0x" + Integer.toHexString(this.g).toUpperCase() + ", getFatStartSector() = 0x" + Integer.toHexString(a()).toUpperCase() + ", getFatSectorEnd() = 0x" + Integer.toHexString(b()).toUpperCase() + ", partitionStartCluster = 0x" + Long.toHexString(this.h).toUpperCase();
  }
  
  public long g() {
    return this.h;
  }
  
  public void a(long paramLong) {
    this.h = paramLong;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aI/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */