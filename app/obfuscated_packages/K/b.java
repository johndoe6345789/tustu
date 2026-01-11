package K;

import G.T;
import G.aM;
import G.ab;
import G.bM;

public class b implements ab {
  int a = 0;
  
  long b = 0L;
  
  public void a(String paramString, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    aM aM = bM.a(T.a().c(paramString), paramInt1, paramInt2, paramInt1);
    if (aM != null && aM.C())
      this.a += paramArrayOfint.length; 
    this.b |= (long)Math.pow(2.0D, paramInt1);
  }
  
  public int a() {
    return this.a;
  }
  
  public int b() {
    return Long.bitCount(this.b);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/K/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */