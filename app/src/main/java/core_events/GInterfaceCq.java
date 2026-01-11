package G;

import bH.D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class GInterfaceCq {
  private static cQ b = null;
  
  HashMap a = new HashMap<>();
  
  public static cQ a() {
    if (b == null)
      b = new cQ(); 
    return b;
  }
  
  public void a(String paramString, cN paramcN) {
    ArrayList<cN> arrayList = b(paramString);
    if (!arrayList.contains(paramcN))
      arrayList.add(paramcN); 
  }
  
  public void a(String paramString) {
    this.a.remove(paramString);
  }
  
  private ArrayList b(String paramString) {
    ArrayList arrayList = (ArrayList)this.a.get(paramString);
    if (arrayList == null) {
      arrayList = new ArrayList();
      this.a.put(paramString, arrayList);
    } 
    return arrayList;
  }
  
  public void a(boolean paramBoolean, String paramString1, int paramInt, String paramString2, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    ArrayList arrayList = b(paramString1);
    Iterator<cN> iterator = arrayList.iterator();
    while (iterator.hasNext()) {
      try {
        ((cN)iterator.next()).a(paramBoolean, paramInt, paramString2, paramArrayOfint1, paramArrayOfint2);
      } catch (Exception exception) {
        D.b("Exception caught while trying to notify a ProtocolErrorListener. Stack to folow:");
        exception.printStackTrace();
      } 
    } 
  }
  
  public void a(String paramString1, String paramString2) {
    ArrayList arrayList = b(paramString1);
    Iterator<cN> iterator = arrayList.iterator();
    while (iterator.hasNext()) {
      try {
        ((cN)iterator.next()).b(paramString2);
      } catch (Exception exception) {
        D.b("Exception caught while trying to notify a ProtocolErrorListener. Stack to folow:");
        exception.printStackTrace();
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/cQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */