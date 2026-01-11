package G;

import V.g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ch implements cg, Serializable {
  private String a = null;
  
  private R b = null;
  
  public void a(String paramString) {
    this.a = paramString;
  }
  
  public cf a(cf paramcf) {
    return b(paramcf);
  }
  
  private cf b(cf paramcf) {
    aM aM = this.b.c(this.a);
    double[][] arrayOfDouble = aM.i(this.b.h());
    paramcf.k();
    ArrayList<aH> arrayList = new ArrayList();
    int i;
    for (i = 0; i < arrayOfDouble.length; i++) {
      int n = (int)arrayOfDouble[i][0];
      if (n < 0)
        break; 
      List list = a(n);
      if (list.isEmpty())
        throw new g("Invalid OutputChannel Offset: " + n); 
      arrayList.addAll(list);
    } 
    i = -1;
    int j = 0;
    int k = 0;
    for (int m = arrayList.size() - 1; m >= 0; m--) {
      aH aH = arrayList.get(m);
      ce ce = new ce();
      ce.b(aH.aL());
      ce.d(b(aH.aL()));
      if (i != aH.a()) {
        i = aH.a();
        j = k;
        k = j + aH.l();
      } 
      ce.a(aH.h());
      ce.b(aH.i());
      ce.c(aH.e());
      if (aH.b().equals("bits")) {
        int n = aH.r() - aH.q() + 1;
        int i1 = j * 8 + aH.q();
        ce.a(n, i1);
      } else {
        int n = aH.l() * 8;
        int i1 = j * 8;
        ce.a(n, i1);
      } 
      paramcf.a(ce, 0);
    } 
    paramcf.d(k);
    return paramcf;
  }
  
  private String b(String paramString) {
    for (ac ac : this.b.g()) {
      if (ac.a().equals(paramString))
        return ac.b(); 
    } 
    return paramString;
  }
  
  private List a(int paramInt) {
    ArrayList<aH> arrayList = new ArrayList();
    Iterator<aH> iterator = this.b.q();
    while (iterator.hasNext()) {
      aH aH = iterator.next();
      if (!aH.b().equals("formula") && aH.a() == paramInt)
        arrayList.add(aH); 
    } 
    return arrayList;
  }
  
  public void a(R paramR) {
    this.b = paramR;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/ch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */