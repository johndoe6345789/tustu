package A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AInterfaceXray {
  private f c = null;

  HashMap a = new HashMap<>();

  List b = new ArrayList();

  public void a(String paramString) {
    this.b.add(paramString);
  }

  public List a() {
    return this.b;
  }

  public void a(String paramString, Object paramObject) {
    c(paramString).add(paramObject);
  }

  public List b() {
    return new ArrayList(this.a.keySet());
  }

  public List b(String paramString) {
    return (List) this.a.get(paramString);
  }

  public int c() {
    int i = -1;
    for (List list : this.a.values()) {
      if (i == -1) {
        i = list.size();
        continue;
      }
      i *= list.size();
    }
    return i;
  }

  private List c(String paramString) {
    List list = (List) this.a.get(paramString);
    if (list == null) {
      list = new ArrayList();
      this.a.put(paramString, list);
    }
    return list;
  }

  public f d() {
    return this.c;
  }

  public void a(f paramf) {
    this.c = paramf;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/A/x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
