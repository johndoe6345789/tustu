package business.business_objects.bO_components;

import java.util.ArrayList;

public class ArrayListExtensionInBoPackage extends ArrayList {
  private boolean b = false;

  int a = -1;

  public boolean a() {
    return this.b;
  }

  public void a(boolean paramBoolean) {
    this.b = paramBoolean;
  }

  public int b() {
    if (this.a < 0) {
      this.a = 0;
      for (l l : this) this.a += l.b();
    }
    return this.a;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bO/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
