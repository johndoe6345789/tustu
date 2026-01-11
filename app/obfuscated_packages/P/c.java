package P;

import G.bL;
import java.util.ArrayList;
import java.util.List;

public class c extends bL {
  private double b = 0.0D;
  
  private double[] c = null;
  
  private double[] d = null;
  
  private String e = "rising";
  
  private String f = null;
  
  public void b(String paramString) {
    this.f = paramString;
  }
  
  public List a() {
    ArrayList<String> arrayList = new ArrayList();
    if (this.f != null && !this.f.isEmpty())
      arrayList.add(this.f); 
    return arrayList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/P/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */