package bk;

import W.aA;
import aP.f;
import bD.g;
import com.efiAnalytics.ui.bV;
import java.io.File;
import java.util.List;

class g implements g {
  g(d paramd) {}
  
  public aA a(List<File> paramList) {
    String[] arrayOfString = new String[paramList.size()];
    for (byte b = 0; b < paramList.size(); b++)
      arrayOfString[b] = ((File)paramList.get(b)).getAbsolutePath(); 
    return f.a().a(bV.b(this.a.f), arrayOfString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bk/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */