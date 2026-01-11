package W;

import java.util.HashMap;

public class ChannelIndexMap {
  private Float a = Float.valueOf(1.0E7F);
  
  private HashMap b = new HashMap<>();
  
  private HashMap c = new HashMap<>();
  
  private Float d = Float.valueOf(Float.NaN);
  
  public HashMap a() {
    return this.b;
  }
  
  public Float a(String paramString) {
    Float float_ = (Float)this.c.get(paramString);
    if (float_ == null) {
      if (Float.isNaN(this.d.floatValue())) {
        float_ = this.a;
      } else {
        float_ = Float.valueOf(this.d.floatValue() + 1.0F);
      } 
      this.c.put(paramString, float_);
      this.b.put(float_, paramString);
      this.d = float_;
    } 
    return float_;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/Z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */