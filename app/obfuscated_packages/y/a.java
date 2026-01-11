package y;

import G.R;
import G.aT;
import java.util.ArrayList;

public class a {
  private static a b = null;
  
  aT a = null;
  
  private a(aT paramaT) {
    this.a = paramaT;
  }
  
  public static a a(aT paramaT) {
    if (b == null)
      b = new a(paramaT); 
    return b;
  }
  
  public ArrayList a(R paramR) {
    if (paramR.c("inj_trimd") != null && paramR.c("spk_trimb") != null && paramR.c("log_style_block") != null && paramR.c("logFieldOffset") != null) {
      ArrayList<b> arrayList = new ArrayList();
      arrayList.add(new b(paramR, this.a));
      return arrayList;
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/y/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */