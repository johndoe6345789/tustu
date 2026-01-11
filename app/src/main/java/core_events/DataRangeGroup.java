package G;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DataRangeGroup implements Serializable {
  private String a = "Default";
  
  private List b = new ArrayList();
  
  private int c = 0;
  
  public String a() {
    return this.a;
  }
  
  public void a(String paramString) {
    this.a = paramString;
  }
  
  public void a(y paramy) {
    this.b.add(paramy);
  }
  
  public List b() {
    return this.b;
  }
  
  public int c() {
    return this.c;
  }
  
  public void a(int paramInt) {
    this.c = paramInt;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */