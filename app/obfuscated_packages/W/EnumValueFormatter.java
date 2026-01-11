package W;

import java.util.List;

public class EnumValueFormatter implements ValueFormatter {
  private String[] a;
  
  public l(List paramList) {
    this.a = (String[])paramList.toArray((Object[])new String[0]);
  }
  
  public String a(float paramFloat) {
    try {
      return this.a[(int)paramFloat];
    } catch (Exception exception) {
      return Float.toString(paramFloat);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */