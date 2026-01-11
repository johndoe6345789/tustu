package business.batch_importers.bI_components;

import java.io.InputStream;

public class BiInterfaceHotel {
  private static h a = null;
  
  private f b = null;
  
  public static h a() {
    if (a == null)
      a = new h(); 
    return a;
  }
  
  public void a(f paramf) {
    this.b = paramf;
  }
  
  public InputStream b() {
    return (this.b == null) ? null : this.b.a();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bI/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */