package ak;

import V.a;
import java.util.HashMap;
import java.util.Map;

class x {
  boolean a;
  
  int b = 0;
  
  int c = 0;
  
  float d = 1.0F;
  
  private static final Map e = new HashMap<>();
  
  public x(D paramD, int paramInt) {
    this.a = "sbyte,sword".contains(paramD.d);
    Integer integer = (Integer)e.get(paramD.d);
    if (integer == null)
      throw new a("Unknown storage mapping " + paramD.d); 
    this.c = integer.intValue();
    this.d = "percent7".equals(paramD.d) ? 0.78125F : (1.0F / Float.parseFloat(paramD.f));
    this.b = paramInt;
  }
  
  static {
    e.put("ubyte", Integer.valueOf(1));
    e.put("ubyte:1", Integer.valueOf(1));
    e.put("ubyte:2", Integer.valueOf(1));
    e.put("ubyte:3", Integer.valueOf(1));
    e.put("sbyte", Integer.valueOf(1));
    e.put("percent7", Integer.valueOf(1));
    e.put("word", Integer.valueOf(2));
    e.put("sword", Integer.valueOf(2));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */