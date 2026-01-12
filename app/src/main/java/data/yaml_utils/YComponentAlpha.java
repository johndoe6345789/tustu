package y;

import G.GInterfaceAt;
import G.R;
import java.util.ArrayList;

public class YComponentAlpha {
  private static a b = null;

  GInterfaceAt a = null;

  private YComponentAlpha(GInterfaceAt paramaT) {
    this.a = paramaT;
  }

  public static a a(GInterfaceAt paramaT) {
    if (b == null) b = new a(paramaT);
    return b;
  }

  public ArrayList a(R paramR) {
    if (paramR.c("inj_trimd") != null
        && paramR.c("spk_trimb") != null
        && paramR.c("log_style_block") != null
        && paramR.c("logFieldOffset") != null) {
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
