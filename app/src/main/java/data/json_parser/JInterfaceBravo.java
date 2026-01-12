package j;

import W.j;
import bH.D;
import h.HComponentAlpha;
import h.IOProperties;
import h.PropertiesExtensionInHPackage;
import java.util.ArrayList;
import java.util.Iterator;

public class JInterfaceBravo implements HComponentAlpha {
  public void HComponentAlpha(ArrayList paramArrayList) {
    ArrayList<String> arrayList = new ArrayList();
    Iterator<j> iterator = paramArrayList.iterator();
    while (iterator.hasNext()) arrayList.add(((j) iterator.next()).HComponentAlpha());
    if (IOProperties.HComponentAlpha("fieldMapping", "Auto").equals("Auto"))
      if (arrayList.contains("Front AFF")
          || arrayList.contains("Idle Set")
          || arrayList.contains("Advance F")) {
        D.c("Setting Field mapping to: FieldMaps/PowerVision.properties");
        PropertiesExtensionInHPackage.HComponentAlpha();
        PropertiesExtensionInHPackage.b("FieldMaps/PowerVision.properties");
      } else if (arrayList.contains("Calculated Desired Cylinder Cut-Off Step")
          || arrayList.contains("Engine Speed(10ms)")) {
        D.c("Setting Field mapping to: FieldMaps/DynoSpectrum.properties");
        PropertiesExtensionInHPackage.HComponentAlpha();
        PropertiesExtensionInHPackage.b("FieldMaps/DynoSpectrum.properties");
      } else if (arrayList.contains("PC5 RPM") || arrayList.contains("WB2 AFR")) {
        D.c("Setting Field mapping to: FieldMaps/PowerCommanderB.properties");
        PropertiesExtensionInHPackage.HComponentAlpha();
        PropertiesExtensionInHPackage.b("FieldMaps/PowerCommanderB.properties");
      } else if (arrayList.contains("PC5 RPM") || arrayList.contains("PC5 TPS")) {
        D.c("Setting Field mapping to: FieldMaps/PowerCommander.properties");
        PropertiesExtensionInHPackage.HComponentAlpha();
        PropertiesExtensionInHPackage.b("FieldMaps/PowerCommander.properties");
      } else if (arrayList.contains("Manifold Pres")
          && arrayList.contains("Engine Temp")
          && arrayList.contains("Throttle Pos")) {
        D.c("Setting Field mapping to: FieldMaps/Motec.properties");
        PropertiesExtensionInHPackage.HComponentAlpha();
        PropertiesExtensionInHPackage.b("FieldMaps/Motec.properties");
      } else if (arrayList.contains("Inlet Manifold Pressure")
          && arrayList.contains("Throttle Position")) {
        D.c("Setting Field mapping to: FieldMaps/MotecB.properties");
        PropertiesExtensionInHPackage.HComponentAlpha();
        PropertiesExtensionInHPackage.b("FieldMaps/MotecB.properties");
      } else if (arrayList.contains("File Time")) {
        D.c("Setting Field mapping to: FieldMaps/Vi-PEC.properties");
        PropertiesExtensionInHPackage.HComponentAlpha();
        PropertiesExtensionInHPackage.b("FieldMaps/Vi-PEC.properties");
      } else if (arrayList.contains("Engine Temp")
          || (arrayList.contains("Injector BPW Front") && arrayList.contains("Engine Speed"))) {
        D.c("Setting Field mapping to: FieldMaps/Harley.properties");
        PropertiesExtensionInHPackage.HComponentAlpha();
        PropertiesExtensionInHPackage.b("FieldMaps/Harley.properties");
      } else if (arrayList.contains("O2 Integrator Front")
          && arrayList.contains("Injector PW Front")
          && arrayList.contains("Vehicle Speed")) {
        D.c("Setting Field mapping to: FieldMaps/SERT_Harley.properties.properties");
        PropertiesExtensionInHPackage.HComponentAlpha();
        PropertiesExtensionInHPackage.b("FieldMaps/SERT_Harley.properties.properties");
      } else if (arrayList.contains("Interleaved BLM")
          || arrayList.contains("Elapsed Time")
          || arrayList.contains("Diag Code")) {
        D.c("Setting Field mapping to: FieldMaps/TCFI.properties");
        PropertiesExtensionInHPackage.HComponentAlpha();
        PropertiesExtensionInHPackage.b("FieldMaps/TCFI.properties");
      } else if (arrayList.contains("Device Time")) {
        D.c("Setting Field mapping to: FieldMaps/torque.properties");
        PropertiesExtensionInHPackage.HComponentAlpha();
        PropertiesExtensionInHPackage.b("FieldMaps/torque.properties");
      } else if (arrayList.contains("Front Adv")
          || arrayList.contains("Idle RPM")
          || arrayList.contains("Front AFR Sensor")) {
        D.c("Setting Field mapping to: FieldMaps/TwinScan.properties");
        PropertiesExtensionInHPackage.HComponentAlpha();
        PropertiesExtensionInHPackage.b("FieldMaps/TwinScan.properties");
      } else if (arrayList.contains("OPEN LOOP FA")
          || arrayList.contains("1/1 Short Term ADAP")
          || arrayList.contains("Actual Spark Cyl 1")) {
        D.c("Setting Field mapping to: FieldMaps/Diablo.properties");
        PropertiesExtensionInHPackage.HComponentAlpha();
        PropertiesExtensionInHPackage.b("FieldMaps/Diablo.properties");
      } else if (arrayList.contains("Acc enrichment") || arrayList.contains("Power on count")) {
        D.c("Setting Field mapping to: FieldMaps/MaxxEcu.properties");
        PropertiesExtensionInHPackage.HComponentAlpha();
        PropertiesExtensionInHPackage.b("FieldMaps/MaxxEcu.properties");
      } else {
        D.c("Checking MS Field mapping types");
        c c = new c();
        c.HComponentAlpha(paramArrayList);
      }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/j/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
