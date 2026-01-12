package ak;

import bH.X;
import java.util.ArrayList;

public class AkInterfaceAe {
  String a;

  String b;

  ArrayList c = new ArrayList();

  boolean d = false;

  int e = 0;

  int f = -1;

  private boolean g = false;

  private boolean h = false;

  public AkInterfaceAe(String paramString1, String paramString2) {
    this.b = paramString2;
    this.a = paramString1;
  }

  public boolean a() {
    if (!this.d) a(this.a, this.b);
    return (d() > this.e);
  }

  public String b() {
    return a() ? this.c.get(this.e++) : null;
  }

  public String a(int paramInt) {
    if (!this.d) a(this.a, this.b);
    String str = this.c.get(paramInt);
    this.e = paramInt + 1;
    return str;
  }

  public int c() {
    if (!this.d) a(this.a, this.b);
    return this.c.size();
  }

  private void a(String paramString1, String paramString2) {
    int i = paramString2.length();
    int j = paramString1.length();
    if (i == 1) {
      char c = paramString2.charAt(0);
      boolean bool = false;
      int k = 0;
      for (byte b = 0; b <= j; b++) {
        if (b == j) {
          String str = paramString1.substring(k);
          str = X.i(str);
          this.c.add(str);
          break;
        }
        if (this.h && paramString1.charAt(b) == '"') bool = !bool ? true : false;
        if (!bool && paramString1.charAt(b) == c) {
          String str = paramString1.substring(k, b);
          str = X.i(str);
          this.c.add(str);
          k = b + i;
        }
      }
    } else {
      int k = 0;
      int m;
      for (m = paramString1.indexOf(paramString2, k);
          m != -1;
          m = paramString1.indexOf(paramString2, k)) {
        String str = paramString1.substring(k, m);
        if (!this.g || !str.trim().isEmpty()) this.c.add(str);
        k = m + i;
      }
      if (m < paramString1.length()) this.c.add(paramString1.substring(k, j));
    }
    this.d = true;
  }

  private int d() {
    if (this.f == -1) this.f = this.c.size();
    return this.f;
  }

  public void a(boolean paramBoolean) {
    this.g = paramBoolean;
  }

  public void b(boolean paramBoolean) {
    this.h = paramBoolean;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/aE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
