package aa;

import G.Q;
import G.R;
import G.ah;
import G.db;
import G.dj;
import V.g;
import W.N;
import W.O;
import W.P;
import W.r;
import bH.X;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class d implements O {
  public String a() {
    return "GaugeConfigurations";
  }
  
  public String b() {
    return "    ;-------------------------------------------------------------------------------\n    ; Define a gauge's characteristics here, then go to a specific layout\n    ; block (Tuning or FrontPage) and use the name you've defined here to\n    ; display that gauge in a particular position.\n    ;\n    ; Name  = Case-sensitive, user-defined name for this gauge configuration.\n    ; Var   = Case-sensitive name of variable to be displayed, see the\n    ;         OutputChannels block in this file for possible values.\n    ; Title = Title displayed at the top of the gauge.\n    ; Units = Units displayed below value on gauge.\n    ; Lo    = Lower scale limit of gauge.\n    ; Hi    = Upper scale limit of gauge.\n    ; LoD   = Lower limit at which danger color is used for gauge background.\n    ; LoW   = Lower limit at which warning color is used.\n    ; HiW   = Upper limit at which warning color is used.\n    ; HiD   = Upper limit at which danger color is used.\n    ; vd    = Decimal places in displayed value\n    ; ld    = Label decimal places for display of Lo and Hi, above.\n\n    ; The following can be either numeric values or an expression:\n    ; Lo, Hi, LoD, LoW, HiW, HiD, ld\n    ; For title and Units TunerStudio String functions can be used.\n\n    ;Name               Var            Title                 Units     Lo     Hi     LoD    LoW   HiW   HiD vd ld";
  }
  
  public void a(R paramR, BufferedWriter paramBufferedWriter, N paramN, r paramr) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    ArrayList<String> arrayList = new ArrayList();
    null = paramR.B();
    while (null.hasNext()) {
      ah ah = null.next();
      if (paramr == null || paramr.a((Q)ah)) {
        ArrayList<ah> arrayList1 = (ArrayList)hashMap.get(ah.p());
        if (arrayList1 == null) {
          arrayList1 = new ArrayList();
          if (ah.p() == null) {
            hashMap.put("", arrayList1);
          } else {
            hashMap.put(ah.p().trim(), arrayList1);
          } 
        } 
        arrayList1.add(ah);
        if (ah.p() != null) {
          arrayList.add(ah.p().trim());
          continue;
        } 
        arrayList.add("");
      } 
    } 
    if (hashMap.get("") != null) {
      ArrayList arrayList1 = (ArrayList)hashMap.get("");
      for (ah ah : arrayList1)
        a(ah, paramBufferedWriter); 
    } 
    for (String str : hashMap.keySet()) {
      if (!str.equals("")) {
        paramBufferedWriter.write("    ");
        paramBufferedWriter.write("gaugeCategory = \"");
        paramBufferedWriter.write(str);
        paramBufferedWriter.write("\"\n");
        ArrayList arrayList1 = (ArrayList)hashMap.get(str);
        for (ah ah : arrayList1)
          a(ah, paramBufferedWriter); 
      } 
    } 
    paramBufferedWriter.write("\n");
    paramBufferedWriter.write("\n");
  }
  
  private void a(ah paramah, BufferedWriter paramBufferedWriter) {
    paramBufferedWriter.append("     ");
    paramBufferedWriter.append(paramah.aL());
    int i;
    for (i = paramah.aL().length(); i < P.a; i++)
      paramBufferedWriter.append(' '); 
    paramBufferedWriter.append("= ");
    paramBufferedWriter.append(paramah.i());
    for (i = paramah.i().length(); i < P.a; i++)
      paramBufferedWriter.append(' '); 
    paramBufferedWriter.append(", ");
    db db = paramah.k();
    int j;
    for (j = db.toString().length(); j < P.b; j++)
      paramBufferedWriter.append(' '); 
    if (db instanceof G.c) {
      try {
        paramBufferedWriter.append("\"");
        paramBufferedWriter.append(db.a());
        paramBufferedWriter.append("\"");
      } catch (g g) {
        Logger.getLogger(P.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
        paramBufferedWriter.append("\"Error\"");
      } 
    } else {
      paramBufferedWriter.append("{ ");
      paramBufferedWriter.append(db.toString());
      paramBufferedWriter.append(" }");
    } 
    paramBufferedWriter.append(", ");
    db = paramah.j();
    for (j = db.toString().length(); j < P.b; j++)
      paramBufferedWriter.append(' '); 
    if (db instanceof G.c) {
      try {
        paramBufferedWriter.append("\"");
        paramBufferedWriter.append(db.a());
        paramBufferedWriter.append("\"");
      } catch (g g) {
        Logger.getLogger(P.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
        paramBufferedWriter.append("\"Error\"");
      } 
    } else {
      paramBufferedWriter.append("{ ");
      paramBufferedWriter.append(db.toString());
      paramBufferedWriter.append(" }");
    } 
    paramBufferedWriter.append(", ");
    dj dj = paramah.b();
    a(dj, paramBufferedWriter);
    paramBufferedWriter.append(", ");
    dj = paramah.e();
    a(dj, paramBufferedWriter);
    paramBufferedWriter.append(", ");
    dj = paramah.o();
    a(dj, paramBufferedWriter);
    paramBufferedWriter.append(", ");
    dj = paramah.f();
    a(dj, paramBufferedWriter);
    paramBufferedWriter.append(", ");
    dj = paramah.g();
    a(dj, paramBufferedWriter);
    paramBufferedWriter.append(", ");
    dj = paramah.h();
    a(dj, paramBufferedWriter);
    paramBufferedWriter.append(", ");
    dj = paramah.m();
    a(dj, paramBufferedWriter);
    paramBufferedWriter.append(", ");
    dj = paramah.m();
    a(dj, paramBufferedWriter);
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
  
  private void a(dj paramdj, BufferedWriter paramBufferedWriter) {
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