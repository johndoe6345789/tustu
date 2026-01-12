package business.binary_transformers;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class FocusAdapterExtensionFocuslost extends FocusAdapter {
  FocusAdapterExtensionFocuslost(aV paramaV) {}

  public void focusGained(FocusEvent paramFocusEvent) {
    this.a.j();
    aV.a(this.a, this.a.f.b());
  }

  public void focusLost(FocusEvent paramFocusEvent) {
    aV.b(this.a, this.a.f.b());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/aW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
