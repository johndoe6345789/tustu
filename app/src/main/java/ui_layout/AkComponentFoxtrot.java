package ak;

import W.X;

public class AkComponentFoxtrot extends g {
  public AkComponentFoxtrot() {
    super(",", false);
    j("ISO-8859-1");
  }
  
  public String i() {
    return X.J;
  }
  
  protected d a(d paramd) {
    paramd = super.a(paramd);
    String str = paramd.a();
    if (str.startsWith("AP Info:")) {
      this.w = str;
      paramd.a("AP Info");
    } 
    return paramd;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */