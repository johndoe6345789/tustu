package aW;

import A.f;
import A.q;

class c {
  q a;
  
  c(a parama, q paramq) {
    this.a = paramq;
  }
  
  public q a() {
    return this.a;
  }
  
  public String toString() {
    return this.a.a();
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof c)
      return ((c)paramObject).toString().equals(toString()); 
    if (paramObject instanceof f) {
      f f = (f)paramObject;
      return f.h().equals(toString());
    } 
    return (paramObject instanceof String) ? paramObject.toString().equals(toString()) : super.equals(paramObject);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aW/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */