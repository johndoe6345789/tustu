package j;

import W.j;
import bH.D;
import h.HComponentAlpha;
import h.PropertiesExtensionInHPackage;
import java.util.ArrayList;
import java.util.Iterator;

public class JInterfaceCharlie implements HComponentAlpha {
  public void HComponentAlpha(ArrayList paramArrayList) {
    ArrayList<String> arrayList = new ArrayList();
    Iterator<j> iterator = paramArrayList.iterator();
    while (iterator.hasNext()) arrayList.add(((j) iterator.next()).HComponentAlpha());
    if (arrayList.contains("AFR 10Bit")
        || arrayList.contains("Batt. Volt.")
        || arrayList.contains("TPS 8Bit")) {
      D.c("Setting Field mapping to: FieldMaps/Buell.properties");
      PropertiesExtensionInHPackage.HComponentAlpha();
      PropertiesExtensionInHPackage.b("FieldMaps/Buell.properties");
    } else if (arrayList.contains("PW In1")) {
      D.c("Setting Field mapping to: FieldMaps/PWMonster.properties");
      PropertiesExtensionInHPackage.HComponentAlpha();
      PropertiesExtensionInHPackage.b("FieldMaps/PWMonster.properties");
    } else if (arrayList.contains("Fuel: TPS AE add fuel ms")
        && arrayList.contains("Fuel: Last inj pulse width")) {
      D.c("Setting Field mapping to: FieldMaps/rusEFI.properties");
      PropertiesExtensionInHPackage.HComponentAlpha();
      PropertiesExtensionInHPackage.b("FieldMaps/rusEFI.properties");
    } else if (arrayList.contains("Fuel: Total cor") && arrayList.contains("SPK: Spark Advance")) {
      D.c("Setting Field mapping to: FieldMaps/MS3_1.3.properties");
      PropertiesExtensionInHPackage.HComponentAlpha();
      PropertiesExtensionInHPackage.b("FieldMaps/MS3_1.3.properties");
    } else if (arrayList.contains("EGO cor1")) {
      D.c("Setting Field mapping to: FieldMaps/MS3_1.2.properties");
      PropertiesExtensionInHPackage.HComponentAlpha();
      PropertiesExtensionInHPackage.b("FieldMaps/MS3_1.2.properties");
    } else if (arrayList.contains("egocor Gego1")) {
      D.c("Setting Field mapping to: FieldMaps/MS3Seq1.0.properties");
      PropertiesExtensionInHPackage.HComponentAlpha();
      PropertiesExtensionInHPackage.b("FieldMaps/MS3Seq1.0.properties");
    } else if (arrayList.contains("egocor_Gego1") && arrayList.contains("Seq PW1")) {
      D.c("Setting Field mapping to: FieldMaps/MS3Seq.properties");
      PropertiesExtensionInHPackage.HComponentAlpha();
      PropertiesExtensionInHPackage.b("FieldMaps/MS3Seq.properties");
    } else if (arrayList.contains("AFR1")) {
      D.c("Setting Field mapping to: FieldMaps/MS2BaseCode.properties");
      PropertiesExtensionInHPackage.HComponentAlpha();
      PropertiesExtensionInHPackage.b("FieldMaps/MS2BaseCode.properties");
    } else if (arrayList.contains("egocor_Gego1")) {
      D.c("Setting Field mapping to: FieldMaps/MS3NonSeq.properties");
      PropertiesExtensionInHPackage.HComponentAlpha();
      PropertiesExtensionInHPackage.b("FieldMaps/MS3NonSeq.properties");
    } else {
      D.c("Setting Field mapping to: FieldMaps/MegaSquirt.properties");
      PropertiesExtensionInHPackage.HComponentAlpha();
      PropertiesExtensionInHPackage.b("FieldMaps/MegaSquirt.properties");
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/j/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
