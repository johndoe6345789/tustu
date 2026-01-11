package aa;

import G.R;
import G.aM;
import W.M;
import W.N;
import W.O;
import W.r;
import Y.d;
import bH.X;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a implements O {
  private final Map a = new HashMap<>();
  
  public a(List paramList) {
    a(paramList);
  }
  
  public void a(List paramList) {
    for (d d : paramList)
      this.a.put(d.b(), d); 
  }
  
  public String a() {
    return "Constants";
  }
  
  public String b() {
    return "";
  }
  
  public void a(R paramR, BufferedWriter paramBufferedWriter, N paramN, r paramr) {
    if (paramN != null && paramN.a().equals(a())) {
      byte b = 0;
      for (M m : paramN) {
        String str = m.a();
        aM aM = (!m.d() && m.f() != null) ? paramR.c(m.f()) : null;
        if (aM != null && m.f() != null && this.a.containsKey(m.f())) {
          d d = (d)this.a.get(m.f());
          String[] arrayOfString = str.split(",");
          if (arrayOfString.length > 2 && d != null) {
            int i = d.a() - paramR.O().y(aM.d());
            arrayOfString[2] = "  0x" + X.a(Integer.toHexString(i).toUpperCase(), '0', 4);
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b1 = 0; b1 < arrayOfString.length; b1++) {
              stringBuilder.append(arrayOfString[b1]);
              if (b1 < arrayOfString.length - 1)
                stringBuilder.append(","); 
            } 
            str = stringBuilder.toString();
          } 
        } else if (aM == null) {
        
        } 
        if (str.trim().isEmpty()) {
          b++;
        } else {
          b = 0;
        } 
        if (b < 5)
          paramBufferedWriter.append(str).append("\n"); 
      } 
      paramBufferedWriter.flush();
    } else {
      throw new IOException("Invalid section. This INI Section writer only supports " + a());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aa/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */