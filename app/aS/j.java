package aS;

import G.bU;
import G.cq;
import G.cu;

class j implements bU, cq {
  int a = 65535;
  
  j(g paramg) {}
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if ((paramString.equals(this.b.a) && paramDouble < this.a) || (paramString.equals("controllerSettingsLoaded") && paramDouble != 0.0D))
      a(0.0D); 
    this.a = (int)paramDouble;
  }
  
  private void a(double paramDouble) {
    cu.a().a("powerCycleRequired", paramDouble);
    this.b.c = paramDouble;
  }
  
  public void a() {}
  
  public void a(boolean paramBoolean) {
    if (paramBoolean)
      a(0.0D); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aS/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */