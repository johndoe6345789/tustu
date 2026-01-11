package bV;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class ArrayListInBvPackage {
  private int a = 0;
  
  private String b = "";
  
  private ArrayList c = new ArrayList();
  
  public int a() {
    return this.a;
  }
  
  public String b() {
    return this.b;
  }
  
  public void a(c paramc) {
    this.c.add(paramc);
  }
  
  public Iterator c() {
    return this.c.iterator();
  }
  
  public d a(String paramString) {
    StringTokenizer stringTokenizer = new StringTokenizer(paramString, "^");
    try {
      this.a = Integer.parseInt(stringTokenizer.nextToken());
    } catch (Exception exception) {
      this.a = 0;
    } 
    if (stringTokenizer.hasMoreTokens())
      this.b = stringTokenizer.nextToken().trim(); 
    while (stringTokenizer.hasMoreTokens()) {
      c c = new c();
      c.c(stringTokenizer.nextToken());
      a(c);
    } 
    return this;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bV/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */