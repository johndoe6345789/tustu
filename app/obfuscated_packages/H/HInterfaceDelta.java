package H;

import G.R;
import G.SerializableImpl;
import G.GComponentBb;

public class HInterfaceDelta extends e {
  public HInterfaceDelta(R paramR) {
    super(paramR);
    a(paramR.c() + "_ExtendedReplay");
  }
  
  public SerializableImpl g(String paramString) {
    GComponentBb GComponentBb = ((R)a()).i(paramString);
    return (SerializableImpl)((GComponentBb != null) ? GComponentBb : ((R)a()).g(paramString));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/H/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */