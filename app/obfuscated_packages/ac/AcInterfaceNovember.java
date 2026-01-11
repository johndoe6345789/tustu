package ac;

import G.R;
import java.util.Date;

public class AcInterfaceNovember implements d {
  public static String a = null;
  
  public String a(R[] paramArrayOfR) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append('"');
    for (byte b = 0; b < paramArrayOfR.length; b++) {
      String str = paramArrayOfR[b].i();
      if (paramArrayOfR[b].P() != null)
        str = str + ": " + paramArrayOfR[b].P(); 
      stringBuilder.append(str);
      if (b + 1 < paramArrayOfR.length)
        stringBuilder.append(", "); 
    } 
    stringBuilder.append("\"\n");
    stringBuilder.append("\"Capture Date: ").append((new Date()).toString());
    if (a != null)
      stringBuilder.append(", File author: ").append(a); 
    stringBuilder.append("\"\n");
    return stringBuilder.toString();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ac/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */