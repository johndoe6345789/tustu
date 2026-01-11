package bb;

import ae.k;
import java.io.File;

class K {
  private File c;
  
  private k d;
  
  boolean a = false;
  
  K(E paramE, k paramk, File paramFile, boolean paramBoolean) {
    this.c = paramFile;
    this.d = paramk;
    this.a = paramBoolean;
  }
  
  public File a() {
    return this.c;
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof K && this.c != null) ? ((K)paramObject).a().equals(this.c) : ((paramObject instanceof File && this.c != null) ? ((File)paramObject).equals(this.c) : super.equals(paramObject));
  }
  
  public String toString() {
    String str = null;
    if (this.b.j != null)
      str = this.b.j.a(this.c); 
    if (str == null)
      str = this.d.h().a(this.c); 
    return (str == null || str.isEmpty()) ? this.c.getName() : (this.a ? (str + " (" + this.c.getName() + ") - Recommended") : (str + " (" + this.c.getName() + ")"));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/K.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */