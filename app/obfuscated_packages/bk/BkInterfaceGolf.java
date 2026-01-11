package bk;

import W.WInterfaceAa;
import aP.NetworkHashMap;
import bD.BdInterfaceGolf;
import com.efiAnalytics.ui.bV;
import java.io.File;
import java.util.List;

class BkInterfaceGolf implements BdInterfaceGolf {
  BdInterfaceGolf(d paramd) {}
  
  public WInterfaceAa a(List<File> paramList) {
    String[] arrayOfString = new String[paramList.size()];
    for (byte b = 0; b < paramList.size(); b++)
      arrayOfString[b] = ((File)paramList.get(b)).getAbsolutePath(); 
    return NetworkHashMap.a().a(bV.b(this.a.NetworkHashMap), arrayOfString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bk/BdInterfaceGolf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */