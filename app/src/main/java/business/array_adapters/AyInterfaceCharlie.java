package business.array_adapters;

import G.GInterfaceCz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AyInterfaceCharlie {
  private String b;

  private String c;

  Map a = new HashMap<>();

  public AyInterfaceCharlie(String paramString1, String paramString2) {
    this.b = paramString1;
    this.c = paramString2;
  }

  public String a() {
    return this.b;
  }

  public void a(String paramString1, String paramString2) {
    this.a.put(paramString1, new d(this, paramString2));
  }

  public String a(String paramString) {
    GInterfaceCz GInterfaceCz = (GInterfaceCz) this.a.get(paramString);
    return (GInterfaceCz == null) ? null : GInterfaceCz.a();
  }

  public Set b() {
    return this.a.keySet();
  }

  public String c() {
    return this.c;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ay/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
