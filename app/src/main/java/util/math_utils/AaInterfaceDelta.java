package aa;

import G.GInterfaceAh;
import G.GInterfaceDb;
import G.GInterfaceDj;
import G.Q;
import G.R;
import V.ExceptionPrintstacktrace;
import W.N;
import W.O;
import W.P;
import W.r;
import bH.X;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AaInterfaceDelta implements O {
  public String a() {
    return "GaugeConfigurations";
  }

  public String b() {
    return "    ;-------------------------------------------------------------------------------\n"
               + "    ; Define a gauge's characteristics here, then go to a specific layout\n"
               + "    ; block (Tuning or FrontPage) and use the name you've defined here to\n"
               + "    ; display that gauge in a particular position.\n"
               + "    ;\n"
               + "    ; Name  = Case-sensitive, user-defined name for this gauge configuration.\n"
               + "    ; Var   = Case-sensitive name of variable to be displayed, see the\n"
               + "    ;         OutputChannels block in this file for possible values.\n"
               + "    ; Title = Title displayed at the top of the gauge.\n"
               + "    ; Units = Units displayed below value on gauge.\n"
               + "    ; Lo    = Lower scale limit of gauge.\n"
               + "    ; Hi    = Upper scale limit of gauge.\n"
               + "    ; LoD   = Lower limit at which danger color is used for gauge background.\n"
               + "    ; LoW   = Lower limit at which warning color is used.\n"
               + "    ; HiW   = Upper limit at which warning color is used.\n"
               + "    ; HiD   = Upper limit at which danger color is used.\n"
               + "    ; vd    = Decimal places in displayed value\n"
               + "    ; ld    = Label decimal places for display of Lo and Hi, above.\n\n"
               + "    ; The following can be either numeric values or an expression:\n"
               + "    ; Lo, Hi, LoD, LoW, HiW, HiD, ld\n"
               + "    ; For title and Units TunerStudio String functions can be used.\n\n"
               + "    ;Name               Var            Title                 Units     Lo     Hi "
               + "    LoD    LoW   HiW   HiD vd ld";
  }

  public void a(R paramR, BufferedWriter paramBufferedWriter, N paramN, r paramr) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    ArrayList<String> arrayList = new ArrayList();
    null = paramR.B();
    while (null.hasNext()) {
      GInterfaceAh GInterfaceAh = null.next();
      if (paramr == null || paramr.a((Q) GInterfaceAh)) {
        ArrayList<GInterfaceAh> arrayList1 = (ArrayList) hashMap.get(GInterfaceAh.p());
        if (arrayList1 == null) {
          arrayList1 = new ArrayList();
          if (GInterfaceAh.p() == null) {
            hashMap.put("", arrayList1);
          } else {
            hashMap.put(GInterfaceAh.p().trim(), arrayList1);
          }
        }
        arrayList1.add(GInterfaceAh);
        if (GInterfaceAh.p() != null) {
          arrayList.add(GInterfaceAh.p().trim());
          continue;
        }
        arrayList.add("");
      }
    }
    if (hashMap.get("") != null) {
      ArrayList arrayList1 = (ArrayList) hashMap.get("");
      for (GInterfaceAh GInterfaceAh : arrayList1) a(GInterfaceAh, paramBufferedWriter);
    }
    for (String str : hashMap.keySet()) {
      if (!str.equals("")) {
        paramBufferedWriter.write("    ");
        paramBufferedWriter.write("gaugeCategory = \"");
        paramBufferedWriter.write(str);
        paramBufferedWriter.write("\"\n");
        ArrayList arrayList1 = (ArrayList) hashMap.get(str);
        for (GInterfaceAh GInterfaceAh : arrayList1) a(GInterfaceAh, paramBufferedWriter);
      }
    }
    paramBufferedWriter.write("\n");
    paramBufferedWriter.write("\n");
  }

  private void a(GInterfaceAh paramah, BufferedWriter paramBufferedWriter) {
    paramBufferedWriter.append("     ");
    paramBufferedWriter.append(paramah.aL());
    int i;
    for (i = paramah.aL().length(); i < P.a; i++) paramBufferedWriter.append(' ');
    paramBufferedWriter.append("= ");
    paramBufferedWriter.append(paramah.i());
    for (i = paramah.i().length(); i < P.a; i++) paramBufferedWriter.append(' ');
    paramBufferedWriter.append(", ");
    GInterfaceDb GInterfaceDb = paramah.k();
    int j;
    for (j = GInterfaceDb.toString().length(); j < P.b; j++) paramBufferedWriter.append(' ');
    if (GInterfaceDb instanceof G.c) {
      try {
        paramBufferedWriter.append("\"");
        paramBufferedWriter.append(GInterfaceDb.a());
        paramBufferedWriter.append("\"");
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(P.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
        paramBufferedWriter.append("\"Error\"");
      }
    } else {
      paramBufferedWriter.append("{ ");
      paramBufferedWriter.append(GInterfaceDb.toString());
      paramBufferedWriter.append(" }");
    }
    paramBufferedWriter.append(", ");
    GInterfaceDb = paramah.j();
    for (j = GInterfaceDb.toString().length(); j < P.b; j++) paramBufferedWriter.append(' ');
    if (GInterfaceDb instanceof G.c) {
      try {
        paramBufferedWriter.append("\"");
        paramBufferedWriter.append(GInterfaceDb.a());
        paramBufferedWriter.append("\"");
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(P.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
        paramBufferedWriter.append("\"Error\"");
      }
    } else {
      paramBufferedWriter.append("{ ");
      paramBufferedWriter.append(GInterfaceDb.toString());
      paramBufferedWriter.append(" }");
    }
    paramBufferedWriter.append(", ");
    GInterfaceDj GInterfaceDj = paramah.b();
    a(GInterfaceDj, paramBufferedWriter);
    paramBufferedWriter.append(", ");
    GInterfaceDj = paramah.e();
    a(GInterfaceDj, paramBufferedWriter);
    paramBufferedWriter.append(", ");
    GInterfaceDj = paramah.o();
    a(GInterfaceDj, paramBufferedWriter);
    paramBufferedWriter.append(", ");
    GInterfaceDj = paramah.f();
    a(GInterfaceDj, paramBufferedWriter);
    paramBufferedWriter.append(", ");
    GInterfaceDj = paramah.ExceptionPrintstacktrace();
    a(GInterfaceDj, paramBufferedWriter);
    paramBufferedWriter.append(", ");
    GInterfaceDj = paramah.h();
    a(GInterfaceDj, paramBufferedWriter);
    paramBufferedWriter.append(", ");
    GInterfaceDj = paramah.m();
    a(GInterfaceDj, paramBufferedWriter);
    paramBufferedWriter.append(", ");
    GInterfaceDj = paramah.m();
    a(GInterfaceDj, paramBufferedWriter);
    if (paramah.aJ() != null && !paramah.aJ().trim().isEmpty()) {
      paramBufferedWriter.append(", {");
      paramBufferedWriter.append(paramah.aJ().trim());
      paramBufferedWriter.append(" }");
    }
    if (paramah.aK() != null && !paramah.aK().trim().isEmpty()) {
      paramBufferedWriter.write("; ");
      paramBufferedWriter.write(paramah.aK());
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

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aa/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
