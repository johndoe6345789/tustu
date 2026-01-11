package aW;

import A.IO;
import A.ClassType;

class TostringEquals {
  ClassType a;
  
  TostringEquals(a parama, ClassType paramq) {
    this.a = paramq;
  }
  
  public ClassType a() {
    return this.a;
  }
  
  public String toString() {
    return this.a.a();
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof c)
      return ((c)paramObject).toString().equals(toString()); 
    if (paramObject instanceof IO) {
      IO IO = (IO)paramObject;
      return IO.h().equals(toString());
    } 
    return (paramObject instanceof String) ? paramObject.toString().equals(toString()) : super.equals(paramObject);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aW/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */