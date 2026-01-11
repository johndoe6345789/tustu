package ao;

import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.et;
import h.i;
import java.io.File;
import java.util.ArrayList;

public class fA {
  et a = (et)new dQ(i.f(), "recentlyOpenedLogs");
  
  int b = 7;
  
  public void a(String paramString) {
    ArrayList<String> arrayList = a();
    paramString = b(paramString);
    while (arrayList.contains(paramString))
      arrayList.remove(paramString); 
    arrayList.add(0, paramString);
    a(arrayList);
  }
  
  public ArrayList a() {
    ArrayList<String> arrayList = new ArrayList();
    for (byte b = 0; b < this.b; b++) {
      String str = this.a.a(b + "");
      if (str != null && str.trim().length() > 0 && (new File(str)).exists())
        arrayList.add(str); 
    } 
    return arrayList;
  }
  
  private String b(String paramString) {
    while (paramString.endsWith(File.separator) && paramString.length() > 0)
      paramString = paramString.substring(0, paramString.length() - 1); 
    return paramString;
  }
  
  private void a(ArrayList<String> paramArrayList) {
    for (byte b = 0; b < this.b; b++) {
      String str = (b < paramArrayList.size()) ? paramArrayList.get(b) : "";
      str = b(str);
      if (str != null && str.trim().length() > 0 && (new File(str)).exists()) {
        this.a.a(b + "", str);
      } else {
        this.a.a(b + "", "");
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */