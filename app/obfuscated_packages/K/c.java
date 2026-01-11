package K;

import G.cq;

public class c implements cq {
  private double a = 0.0D;
  
  private static c b = null;
  
  public static c a() {
    if (b == null)
      b = new c(); 
    return b;
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    this.a = paramDouble;
  }
  
  public double b() {
    return this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/K/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */