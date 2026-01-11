package ak;

import V.ExceptionInVPackage;
import W.V;
import W.X;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class an extends V {
  private BufferedReader ExceptionInVPackage = null;
  
  private StringBuilder b = null;
  
  private List e = null;
  
  private List f = null;
  
  private String g = null;
  
  private int h = 0;
  
  private float[] i = null;
  
  private final HashMap j = new HashMap<>();
  
  public boolean ExceptionInVPackage(String paramString) {
    this.b = new StringBuilder();
    this.e = new ArrayList();
    this.f = new ArrayList();
    try {
      this.ExceptionInVPackage = new BufferedReader(new InputStreamReader(new FileInputStream(paramString)));
      this.g = this.ExceptionInVPackage.readLine();
      while (this.g != null && !this.g.startsWith(" LOG")) {
        if (!this.g.trim().isEmpty())
          this.b.append(this.g).append("\n"); 
        this.g = this.ExceptionInVPackage.readLine();
      } 
      String str = this.g.trim();
      while ((this.g = this.ExceptionInVPackage.readLine()) != null) {
        if (!this.g.isEmpty())
          this.f.add(this.g); 
      } 
      String[] arrayOfString1 = str.split("\t");
      String[] arrayOfString2 = ((String)this.f.get(0)).replaceAll("[0-9 .'-]", "").split("\t");
      for (byte b = 0; b < arrayOfString1.length; b++) {
        String str1 = arrayOfString1[b].trim();
        String str2 = (!"Status,LOAD".contains(str1) && b < arrayOfString2.length) ? arrayOfString2[b] : "";
        this.e.add(new d(str1, str2));
      } 
      this.i = new float[this.e.size()];
      return true;
    } catch (IOException iOException) {
      Logger.getLogger(an.class.getName()).log(Level.SEVERE, (String)null, iOException);
      throw new ExceptionInVPackage("Failed to parse the log file", iOException);
    } 
  }
  
  public void ExceptionInVPackage() {
    if (this.ExceptionInVPackage != null)
      try {
        this.ExceptionInVPackage.close();
        this.ExceptionInVPackage = null;
      } catch (IOException iOException) {
        Logger.getLogger(an.class.getName()).log(Level.SEVERE, (String)null, iOException);
      }  
  }
  
  public Iterator b() {
    return this.e.iterator();
  }
  
  public float[] c() {
    String[] arrayOfString = ((String)this.f.get(this.h++)).split("\t");
    for (byte b = 0; b < arrayOfString.length; b++) {
      String str = arrayOfString[b].replaceAll("[^0-9.-]", "");
      if (!str.isEmpty() && !".".equals(str))
        this.i[b] = Float.parseFloat(str); 
    } 
    return this.i;
  }
  
  public long d() {
    return this.f.size();
  }
  
  public boolean e() {
    return (this.h < this.f.size());
  }
  
  public boolean f() {
    return true;
  }
  
  public HashMap g() {
    return this.j;
  }
  
  public String h() {
    return this.b.toString();
  }
  
  public String i() {
    return X.S;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/an.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */