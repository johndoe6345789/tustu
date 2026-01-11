package G;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class de extends dm implements Serializable {
  List a = new ArrayList();
  
  public void a(df paramdf) {
    this.a.add(paramdf);
  }
  
  public int a() {
    return this.a.size();
  }
  
  public String a(int paramInt) {
    return ((df)this.a.get(paramInt)).b();
  }
  
  public df a(String paramString) {
    for (df df : this.a) {
      if (df.b().equals(paramString))
        return df; 
    } 
    return null;
  }
  
  public String b() {
    return this.a.isEmpty() ? super.b() : a(0);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/de.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */