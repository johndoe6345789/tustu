package aa;

import G.GInterfaceBf;
import G.Q;
import G.R;
import W.N;
import W.O;
import W.r;
import java.io.BufferedWriter;
import java.util.List;

public class AaInterfaceFoxtrot implements O {
  static String a = "TuningViews";

  static String b =
      "\n"
          + ";This section allows TuningViews to be embedded in the ini file.\n"
          + "     ;A tuningView entry requires 4 parameters. These entries are typically\n"
          + "     ;only made by the application\n"
          + "     ;Format:\n"
          + "     ;   tuningView = referenceName, \"User Title\", [md5 of .tuneView file],"
          + " {optional enableCondition}, base64 data\n";

  public String a() {
    return a;
  }

  public String b() {
    return b;
  }

  public void a(R paramR, BufferedWriter paramBufferedWriter, N paramN, r paramr) {
    List list = paramR.af();
    for (GInterfaceBf GInterfaceBf : list) {
      if (paramr == null || paramr.a((Q) GInterfaceBf)) {
        paramBufferedWriter.append("tuningView = ");
        paramBufferedWriter.append(GInterfaceBf.aL()).append(", ");
        paramBufferedWriter.append("\"").append(GInterfaceBf.c()).append("\", ");
        paramBufferedWriter.append(GInterfaceBf.a()).append(", ");
        paramBufferedWriter
            .append("{ ")
            .append((GInterfaceBf.aJ() != null) ? GInterfaceBf.aJ() : "")
            .append(" }");
        paramBufferedWriter.newLine();
      }
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aa/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
