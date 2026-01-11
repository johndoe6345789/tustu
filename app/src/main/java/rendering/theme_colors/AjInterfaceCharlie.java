package aJ;

public class AjInterfaceCharlie {
  private int a = 0;
  
  private a b = null;
  
  private int c = -1;
  
  private a d = null;
  
  private long e = -1L;
  
  private long f = -1L;
  
  public void a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length != 16)
      throw new IndexOutOfBoundsException("Partition Entry expected to be 16 in length"); 
    this.a = bH.c.a(paramArrayOfbyte[0]);
    this.b = new a();
    this.b.a(bH.c.a(paramArrayOfbyte, 1, 3, false, false));
    this.c = bH.c.a(paramArrayOfbyte[4]);
    this.d = new a();
    this.d.a(bH.c.a(paramArrayOfbyte, 5, 3, false, false));
    this.e = bH.c.b(paramArrayOfbyte, 8, 4, false, false);
    this.f = bH.c.b(paramArrayOfbyte, 12, 4, false, false);
  }
  
  public long a() {
    return this.e;
  }
  
  public String toString() {
    return "status= " + this.a + "\n\t firstSector=(" + this.b + ")\n\t partitionType=" + this.c + "\n\t lastSector=(" + this.d + ")\n\t lbaFirstSectorInPartition=" + this.e + "\n\t numSectorsInPartition=" + this.f;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aJ/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */