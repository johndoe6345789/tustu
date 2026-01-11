package aa;

import G.Q;
import G.R;
import G.bP;
import G.bf;
import W.N;
import W.O;
import W.r;
import java.io.BufferedWriter;
import java.util.Collection;

public class c implements O {
  static String a = "EncodedData";
  
  static String b = ";This section allows for objects to be stored in the ini.\n     ;This section is typically managed only by the application.\n     ;Each record contains a reference name and the encoded data\n     ;Format:\n     ;   referenceName = base64Data";
  
  public String a() {
    return a;
  }
  
  public String b() {
    return b;
  }
  
  public void a(R paramR, BufferedWriter paramBufferedWriter, N paramN, r paramr) {
    Collection collection = paramR.ag();
    for (bP bP : collection) {
      if (a(paramR, bP) && (paramr == null || paramr.a((Q)bP))) {
        paramBufferedWriter.append(bP.aL()).append(" = ");
        paramBufferedWriter.append(bP.b());
        paramBufferedWriter.newLine();
      } 
    } 
  }
  
  private boolean a(R paramR, bP parambP) {
    for (bf bf : paramR.af()) {
      if (bf.aL().equals(parambP.aL()))
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aa/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */