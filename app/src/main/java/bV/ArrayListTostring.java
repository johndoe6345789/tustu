package bV;

import java.util.ArrayList;
import java.util.StringTokenizer;

public ArrayListTostringlass ArrayListTostring {
  private String a = "";
  
  private ArrayList b = new ArrayList();
  
  public String a() {
    return this.a;
  }
  
  public void a(String paramString) {
    this.a = paramString;
  }
  
  public String[] b() {
    String[] arrayOfString = new String[this.b.size()];
    Object[] arrayOfObject = this.b.toArray();
    for (byte b = 0; b < arrayOfString.length; b++)
      arrayOfString[b] = (String)arrayOfObject[b]; 
    return arrayOfString;
  }
  
  public void b(String paramString) {
    this.b.add(paramString);
  }
  
  public void c(String paramString) {
    c();
    StringTokenizer stringTokenizer = new StringTokenizer(paramString, "|");
    a(stringTokenizer.nextToken());
    while (stringTokenizer.hasMoreTokens())
      b(stringTokenizer.nextToken()); 
  }
  
  public void c() {
    this.a = "";
    this.b.clear();
  }
  
  public String toString() {
    return "commandType: " + this.a + "\ncommandData: " + this.b;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bV/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */