package ao;

import W.j;
import java.util.ArrayList;
import java.util.List;

public class bm {
  private static bm a = null;
  
  private List b = new ArrayList();
  
  public static bm a() {
    if (a == null)
      a = new bm(); 
    return a;
  }
  
  public void a(boolean paramBoolean) {
    for (bl bl : this.b)
      bl.d(paramBoolean); 
  }
  
  public void a(String paramString, j paramj) {
    if (paramString.indexOf('.') == -1)
      a(paramString, paramj, 0); 
    String str = paramString.substring(0, paramString.lastIndexOf('.'));
    int i = Integer.parseInt(paramString.substring(paramString.lastIndexOf('.') + 1, paramString.length()));
    a(str, paramj, i);
  }
  
  public void a(String paramString, j paramj, int paramInt) {
    b(paramString, paramj, paramInt);
  }
  
  private void b(String paramString, j paramj, int paramInt) {
    for (bl bl : this.b)
      bl.a(paramString, paramj, paramInt); 
  }
  
  public void a(bl parambl) {
    this.b.add(parambl);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/bm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */