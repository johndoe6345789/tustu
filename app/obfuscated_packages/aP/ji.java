package aP;

import G.ab;
import java.util.Vector;

class ji implements ab {
  ji(jc paramjc) {}
  
  public void a(String paramString, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    if (paramInt1 == this.a.k) {
      int i = paramInt2;
      while (true) {
        int j = i / this.a.b;
        int k = i % this.a.b;
        Vector<String> vector = this.a.f.get(j);
        vector.setElementAt(jc.a(this.a, paramArrayOfint[i - paramInt2], this.a.a), k);
        if (++i >= paramInt2 + paramArrayOfint.length) {
          this.a.g.repaint();
          break;
        } 
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ji.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */