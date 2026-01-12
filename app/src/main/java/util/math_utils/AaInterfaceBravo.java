package aa;

import G.GInterfaceDj;
import G.Q;
import G.R;
import G.SerializableImplExceptionprintstacktrace;
import W.N;
import W.O;
import W.P;
import W.r;
import bH.X;
import java.io.BufferedWriter;

public class AaInterfaceBravo implements O {
  public String a() {
    return "Datalog";
  }

  public String b() {
    return "    ;  The entries are saved in the datalog file in the order in which they \n"
               + "    ;  appear in the list below. \n"
               + "    ;  \n"
               + "    ;   Channel - Case sensitive name of output channel to be logged.\n"
               + "    ;   Label   - String written to header line of log. \n"
               + "    ;   Type    - normally float or int, no longer used.\n"
               + "    ;   Format  - C-style output format of data or tag: \n"
               + "    ;             Boolean tags: yesNo, onOff, highLow, activeInactive\n"
               + "    ;             For Hex output: hex\n"
               + "    ;   Enabled Cond - This field will only be logged if the enable \n"
               + "    ;                 condition is blank or resolves to true. \n"
               + "    ;   Lag      - If for any reason you need to have a field lag \n"
               + "    ;                  n records behind realtime. Use a number or expression\n"
               + "   ;       Channel          Label          Type    Format  Enabled Cond  Lag\n"
               + "   ;       --------------   ----------     -----   ------  ------------  ---\n\n";
  }

  public void a(R paramR, BufferedWriter paramBufferedWriter, N paramN, r paramr) {
    for (SerializableImplExceptionprintstacktrace SerializableImplExceptionprintstacktrace :
        paramR.g()) {
      if (paramr == null || paramr.a((Q) SerializableImplExceptionprintstacktrace))
        a(SerializableImplExceptionprintstacktrace, paramBufferedWriter);
    }
    paramBufferedWriter.write("\n");
    paramBufferedWriter.write("\n");
  }

  private void a(
      SerializableImplExceptionprintstacktrace paramac, BufferedWriter paramBufferedWriter) {
    paramBufferedWriter.append("     ");
    paramBufferedWriter.append("entry = ");
    paramBufferedWriter.append(paramac.a());
    paramBufferedWriter.append(", ");
    int i;
    for (i = paramac.a().length(); i < P.a; i++) paramBufferedWriter.append(' ');
    paramBufferedWriter.append("\"").append(paramac.b()).append("\",");
    for (i = paramac.b().length(); i < P.a; i++) paramBufferedWriter.append(' ');
    if (paramac.d() > 0) {
      paramBufferedWriter.write("float,   ");
    } else {
      paramBufferedWriter.write("int,     ");
    }
    paramBufferedWriter.write("\"");
    if (paramac.e() == 0) {
      if (paramac.d() > 0) {
        paramBufferedWriter.append("%.").append(paramac.d() + "f");
      } else {
        paramBufferedWriter.append("%d");
      }
    } else {
      paramBufferedWriter.append(paramac.k());
    }
    paramBufferedWriter.write("\"");
    i = 0;
    if (paramac.aJ() != null && !paramac.aJ().trim().isEmpty()) {
      paramBufferedWriter.append(", {");
      paramBufferedWriter.append(paramac.aJ().trim());
      paramBufferedWriter.append(" }");
      i = 1;
    }
    if (paramac.g() != null && paramac.g().a() > 0.0D) {
      if (i != 0) {
        paramBufferedWriter.write(", ");
      } else {
        paramBufferedWriter.write(", {  }, ");
      }
      a(paramac.g(), paramBufferedWriter);
    }
    if (paramac.aK() != null && !paramac.aK().trim().isEmpty()) {
      paramBufferedWriter.write("; ");
      paramBufferedWriter.write(paramac.aK());
    }
    paramBufferedWriter.append("\n");
  }

  private void a(GInterfaceDj paramdj, BufferedWriter paramBufferedWriter) {
    if (paramdj instanceof G.B) {
      paramBufferedWriter.append(X.a(Double.toString(paramdj.a()), ' ', P.b));
    } else {
      paramBufferedWriter.append("{ ");
      paramBufferedWriter.append(paramdj.toString());
      paramBufferedWriter.append(" }");
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aa/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
