package F;

public class a extends b {
  public a(String paramString) {
    f(paramString);
  }
  
  public void f(String paramString) {
    System.out.println("Local IP: " + paramString);
    int i = Integer.parseInt(paramString.substring(paramString.lastIndexOf(".") + 1));
    String str = paramString.substring(0, paramString.lastIndexOf(".") + 1);
    if (i > 127) {
      g(str + "30");
      h(str + "120");
    } else {
      g(str + "128");
      h(str + "200");
    } 
    k(paramString);
    j(paramString);
    i("0.0.0.0");
    a(3600);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/F/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */