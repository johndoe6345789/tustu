package bH;

import java.nio.charset.Charset;

public class T {
  public static String a() {
    Charset charset = Charset.defaultCharset();
    return charset.displayName().equals("UTF-8") ? "°" : "°";
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/T.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */