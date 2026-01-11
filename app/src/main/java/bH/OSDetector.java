package bH;

public class J {
  public static boolean a() {
    String str = System.getProperty("os.name", "Windows");
    return str.startsWith("Win");
  }
  
  public static boolean b() {
    String str = System.getProperty("os.name", "");
    return str.startsWith("Mac");
  }
  
  public static boolean c() {
    String str = System.getProperty("os.version", "");
    if (!str.contains("."))
      return false; 
    try {
      while ((str.split(".")).length > 2)
        str = str.substring(0, str.lastIndexOf(".")); 
      double d1 = Double.parseDouble(str.substring(0, str.indexOf(".")));
      double d2 = Double.parseDouble(str.substring(str.indexOf(".") + 1));
      return (b() && (d1 >= 11.0D || (d1 >= 10.0D && d2 >= 7.0D)));
    } catch (Exception exception) {
      return false;
    } 
  }
  
  public static boolean d() {
    String str = System.getProperty("os.name", "");
    return str.startsWith("Linux");
  }
  
  public static boolean e() {
    String str = System.getProperty("os.arch", "");
    return (d() && (str.contains("arm") || str.contains("aarch64")));
  }
  
  public static boolean f() {
    String str1 = System.getProperty("os.name", "Windows");
    String str2 = System.getProperty("os.version", "10");
    return (str1.startsWith("Win") && str2.startsWith("5.1"));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/J.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */