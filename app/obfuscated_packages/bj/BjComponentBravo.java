package bj;

import W.WInterfaceAa;
import aP.NetworkHashMap;
import bD.BdInterfaceGolf;
import com.efiAnalytics.ui.bV;
import java.io.File;
import java.util.List;

class BjComponentBravo implements BdInterfaceGolf {
  b(a parama) {}
  
  public WInterfaceAa a(List<File> paramList) {
    String[] arrayOfString = new String[paramList.size()];
    for (byte b1 = 0; b1 < paramList.size(); b1++)
      arrayOfString[b1] = ((File)paramList.get(b1)).getAbsolutePath(); 
    return NetworkHashMap.a().a(bV.b(this.a.NetworkHashMap), arrayOfString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bj/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */