package H;

import G.R;
import G.T;
import G.Manager;
import G.GInterfaceBu;
import G.GComponentBb;
import bH.D;
import java.util.ArrayList;
import java.util.List;

public HInterfaceCharlielass HInterfaceCharlie implements GInterfaceBu {
  int a = 255;
  
  public void a() {}
  
  public void a(boolean paramBoolean) {
    if (paramBoolean) {
      R r = T.a().c();
      ArrayList arrayList = null;
      if (aG.c.a(r)) {
        arrayList = r.u();
      } else if (aG.c.b(r)) {
        arrayList = r.t();
      } else {
        return;
      } 
      try {
        boolean bool = true;
        Manager Manager = r.c(r.O().ag());
        double[][] arrayOfDouble = Manager.i(r.h());
        if (arrayList != null) {
          List<Integer> list = b(arrayList);
          for (byte b = 0; b < arrayOfDouble.length; b++) {
            int i;
            if (b < list.size()) {
              i = ((Integer)list.get(b)).intValue();
            } else {
              i = this.a;
            } 
            if (arrayOfDouble[b][0] != i) {
              bool = false;
              arrayOfDouble[b][0] = i;
            } 
          } 
        } 
        if (!bool) {
          D.d("Replay Pad does not match current configuration, Updating Replay Pad.");
          Manager.b(true);
          Manager.a(r.h(), arrayOfDouble);
          Manager.b(false);
          try {
            if (aG.c.b(r)) {
              Manager aM1 = r.c("Log_Time");
              if (aM1 != null && aM1.j(r.h()) > aM1.s())
                aM1.a(r.h(), aM1.s()); 
            } 
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
        } 
      } catch (Exception exception) {
        D.a(exception);
      } 
    } 
  }
  
  private List b(List paramList) {
    ArrayList<Integer> arrayList = new ArrayList();
    for (GComponentBb GComponentBb : paramList) {
      if (!arrayList.contains(Integer.valueOf(GComponentBb.y())))
        arrayList.add(Integer.valueOf(GComponentBb.y())); 
    } 
    return a(arrayList);
  }
  
  public List a(List<Integer> paramList) {
    for (byte b = 0; b < paramList.size(); b++) {
      for (int i = b + 1; i < paramList.size(); i++) {
        Integer integer1 = paramList.get(b);
        Integer integer2 = paramList.get(i);
        if (integer1.intValue() > integer2.intValue()) {
          paramList.set(b, integer2);
          paramList.set(i, integer1);
        } 
      } 
    } 
    return paramList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/H/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */