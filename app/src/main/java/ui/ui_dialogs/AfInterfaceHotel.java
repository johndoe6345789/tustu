package af;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AfInterfaceHotel {
  Map a = new HashMap<>();

  List b = new ArrayList();

  String c = "";

  public static h a(List paramList, String paramString) {
    h h1 = new h();
    return h1.b(paramList, paramString);
  }

  private h b(List paramList, String paramString) {
    this.c = paramString;
    for (String str : paramList) {
      if (str.startsWith("Q")) {
        if (str.contains(".")) {
          this.b.add(str.substring(1, str.lastIndexOf(".")));
          continue;
        }
        this.b.add(str);
        continue;
      }
      if (str.startsWith("P")) {
        try {
          int i = Integer.parseInt(str.substring(1), 16);
          i i1 = new i(this, i, false);
          this.a.put(Integer.valueOf(i), i1);
        } catch (NumberFormatException numberFormatException) {
          numberFormatException.printStackTrace();
        }
        continue;
      }
      if (str.startsWith("M"))
        try {
          int i = Integer.parseInt(str.substring(1), 16);
          i i1 = new i(this, i, true);
          this.a.put(Integer.valueOf(i), i1);
        } catch (NumberFormatException numberFormatException) {
          numberFormatException.printStackTrace();
        }
    }
    return this;
  }

  public boolean a(int paramInt) {
    i i = (i) this.a.get(Integer.valueOf(paramInt));
    return (i == null) ? false : i.a();
  }

  public int a() {
    byte b = 0;
    for (i i : this.a.values()) {
      if (i.a()) b++;
    }
    return b;
  }

  public boolean b() {
    for (String str : this.b) {
      if (this.c.startsWith(str)) return true;
    }
    return false;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/af/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
