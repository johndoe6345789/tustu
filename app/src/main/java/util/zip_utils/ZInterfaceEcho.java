package Z;

import java.util.ArrayList;
import java.util.List;

public class ZInterfaceEcho {
  private String a = "";

  private List b = new ArrayList();

  public ZInterfaceEcho(String paramString) {
    this.a = paramString;
  }

  public String a() {
    return this.a;
  }

  public List b() {
    return this.b;
  }

  public void a(String paramString) {
    this.b.add(paramString);
  }

  public boolean b(String paramString) {
    return this.b.contains(paramString);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/Z/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
