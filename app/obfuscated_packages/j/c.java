package j;

import W.j;
import bH.D;
import h.a;
import h.g;
import java.util.ArrayList;
import java.util.Iterator;

public class c implements a {
  public void a(ArrayList paramArrayList) {
    ArrayList<String> arrayList = new ArrayList();
    Iterator<j> iterator = paramArrayList.iterator();
    while (iterator.hasNext())
      arrayList.add(((j)iterator.next()).a()); 
    if (arrayList.contains("AFR 10Bit") || arrayList.contains("Batt. Volt.") || arrayList.contains("TPS 8Bit")) {
      D.c("Setting Field mapping to: FieldMaps/Buell.properties");
      g.a();
      g.b("FieldMaps/Buell.properties");
    } else if (arrayList.contains("PW In1")) {
      D.c("Setting Field mapping to: FieldMaps/PWMonster.properties");
      g.a();
      g.b("FieldMaps/PWMonster.properties");
    } else if (arrayList.contains("Fuel: TPS AE add fuel ms") && arrayList.contains("Fuel: Last inj pulse width")) {
      D.c("Setting Field mapping to: FieldMaps/rusEFI.properties");
      g.a();
      g.b("FieldMaps/rusEFI.properties");
    } else if (arrayList.contains("Fuel: Total cor") && arrayList.contains("SPK: Spark Advance")) {
      D.c("Setting Field mapping to: FieldMaps/MS3_1.3.properties");
      g.a();
      g.b("FieldMaps/MS3_1.3.properties");
    } else if (arrayList.contains("EGO cor1")) {
      D.c("Setting Field mapping to: FieldMaps/MS3_1.2.properties");
      g.a();
      g.b("FieldMaps/MS3_1.2.properties");
    } else if (arrayList.contains("egocor Gego1")) {
      D.c("Setting Field mapping to: FieldMaps/MS3Seq1.0.properties");
      g.a();
      g.b("FieldMaps/MS3Seq1.0.properties");
    } else if (arrayList.contains("egocor_Gego1") && arrayList.contains("Seq PW1")) {
      D.c("Setting Field mapping to: FieldMaps/MS3Seq.properties");
      g.a();
      g.b("FieldMaps/MS3Seq.properties");
    } else if (arrayList.contains("AFR1")) {
      D.c("Setting Field mapping to: FieldMaps/MS2BaseCode.properties");
      g.a();
      g.b("FieldMaps/MS2BaseCode.properties");
    } else if (arrayList.contains("egocor_Gego1")) {
      D.c("Setting Field mapping to: FieldMaps/MS3NonSeq.properties");
      g.a();
      g.b("FieldMaps/MS3NonSeq.properties");
    } else {
      D.c("Setting Field mapping to: FieldMaps/MegaSquirt.properties");
      g.a();
      g.b("FieldMaps/MegaSquirt.properties");
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/j/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */