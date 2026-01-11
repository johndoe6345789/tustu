package aa;

import G.Q;
import G.R;
import G.bf;
import W.N;
import W.O;
import W.r;
import java.io.BufferedWriter;
import java.util.List;

public class f implements O {
  static String a = "TuningViews";
  
  static String b = "\n;This section allows TuningViews to be embedded in the ini file.\n     ;A tuningView entry requires 4 parameters. These entries are typically\n     ;only made by the application\n     ;Format:\n     ;   tuningView = referenceName, \"User Title\", [md5 of .tuneView file], {optional enableCondition}, base64 data\n";
  
  public String a() {
    return a;
  }
  
  public String b() {
    return b;
  }
  
  public void a(R paramR, BufferedWriter paramBufferedWriter, N paramN, r paramr) {
    List list = paramR.af();
    for (bf bf : list) {
      if (paramr == null || paramr.a((Q)bf)) {
        paramBufferedWriter.append("tuningView = ");
        paramBufferedWriter.append(bf.aL()).append(", ");
        paramBufferedWriter.append("\"").append(bf.c()).append("\", ");
        paramBufferedWriter.append(bf.a()).append(", ");
        paramBufferedWriter.append("{ ").append((bf.aJ() != null) ? bf.aJ() : "").append(" }");
        paramBufferedWriter.newLine();
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aa/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */