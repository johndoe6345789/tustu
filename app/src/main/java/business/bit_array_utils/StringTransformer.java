package business.bit_array_utils;

public class q {
  public static boolean a() {
    String str = System.getProperty("os.name", "Windows");
    return str.startsWith("Win");
  }
  
  public static boolean b() {
    String str = System.getProperty("os.name", "");
    return str.startsWith("Android");
  }
  
  public static float c() {
    String str = System.getProperty("java.specification.version");
    try {
      return Float.parseFloat(str);
    } catch (Exception exception) {
      D.a("Failed to get Java Spec from: " + str);
      return Float.NaN;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */