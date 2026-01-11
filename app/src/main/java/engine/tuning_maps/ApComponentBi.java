package aP;

import G.AeInterfaceMikeTostring;
import java.util.List;
import s.SComponentGolf;

class ApComponentBi {
  private String b;
  
  private List c;
  
  private AeInterfaceMikeTostring d = null;
  
  private String e;
  
  ApComponentBi(aY paramaY, String paramString1, List paramList, String paramString2, AeInterfaceMikeTostring parambT) {
    this.b = paramString1;
    this.c = paramList;
    this.d = parambT;
    this.e = paramString2;
  }
  
  public String toString() {
    return this.e + ", " + SComponentGolf.b("Found") + ": " + a().c();
  }
  
  public AeInterfaceMikeTostring a() {
    return this.d;
  }
  
  public String b() {
    return this.b;
  }
  
  public List c() {
    return this.c;
  }
  
  public String d() {
    return this.e;
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof bi) ? toString().equals(paramObject.toString()) : super.equals(paramObject);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */