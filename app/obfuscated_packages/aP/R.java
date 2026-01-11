package aP;

import A.w;
import V.a;
import bH.D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.a;

public class R implements w {
  private static R a = null;
  
  public static R a() {
    if (a == null)
      a = new R(); 
    return a;
  }
  
  public void a(String paramString) {
    ArrayList<String> arrayList = b();
    arrayList.add(paramString);
    a(arrayList);
  }
  
  public ArrayList b() {
    String str = a.a().c("badComPorts", "");
    ArrayList<String> arrayList = new ArrayList();
    StringTokenizer stringTokenizer = new StringTokenizer(str, ":");
    while (stringTokenizer.hasMoreTokens())
      arrayList.add(stringTokenizer.nextToken()); 
    return arrayList;
  }
  
  protected void a(ArrayList paramArrayList) {
    String str = "";
    Iterator<String> iterator = paramArrayList.iterator();
    while (iterator.hasNext())
      str = str + (String)iterator.next() + ":"; 
    a.a().b("badComPorts", str);
    try {
      a.a().e();
    } catch (a a) {
      D.c("error saving user properties, trying again.");
      try {
        a.a().e();
        D.c("succeeded on 2nd attempt; saving user properties.");
      } catch (a a1) {
        Logger.getLogger(R.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
      } 
    } 
  }
  
  public void b(String paramString) {
    ArrayList arrayList = b();
    Iterator<String> iterator = arrayList.iterator();
    while (iterator.hasNext()) {
      String str = iterator.next();
      if (str.equals(paramString))
        iterator.remove(); 
    } 
    a(arrayList);
  }
  
  public boolean c(String paramString) {
    return b().contains(paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/R.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */