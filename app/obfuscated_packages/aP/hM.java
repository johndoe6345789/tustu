package aP;

import G.R;
import G.aM;
import java.util.ArrayList;
import s.g;
import u.g;

class hM implements g {
  R a;
  
  ArrayList b;
  
  hM(hH paramhH, R paramR, ArrayList paramArrayList) {
    this.a = paramR;
    this.b = paramArrayList;
  }
  
  public String a() {
    return g.b("Save Delta Changes");
  }
  
  public String b() {
    return "<html>" + g.b("Saves a partial tune containing only the parameters that have changed.") + "<br>" + g.b("The values on the left will be saved.");
  }
  
  public boolean c() {
    return false;
  }
  
  public boolean d() {
    ArrayList<String> arrayList = new ArrayList();
    for (aM aM : this.b)
      arrayList.add(aM.aL()); 
    f.a().a(this.a, "diff", arrayList);
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */