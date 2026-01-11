package j;

import W.j;
import bH.D;
import h.HComponentAlpha;
import h.PropertiesExtensionInHPackage;
import java.util.ArrayList;
import java.util.Iterator;

public class JInterfaceAlpha implements HComponentAlpha {
  public void HComponentAlpha(ArrayList paramArrayList) {
    ArrayList<String> arrayList = new ArrayList();
    Iterator<j> iterator = paramArrayList.iterator();
    while (iterator.hasNext())
      arrayList.add(((j)iterator.next()).HComponentAlpha()); 
    if (arrayList.contains("RPM_ENGINE")) {
      D.c("Setting Field mapping to: FieldMaps/BigStuffGen4.properties");
      PropertiesExtensionInHPackage.HComponentAlpha();
      PropertiesExtensionInHPackage.b("FieldMaps/BigStuffGen4.properties");
      return;
    } 
    boolean bool = true;
    if (bool) {
      D.c("Setting Field mapping to: FieldMaps/BigStuffGen3.properties");
      PropertiesExtensionInHPackage.HComponentAlpha();
      PropertiesExtensionInHPackage.b("FieldMaps/BigStuffGen3.properties");
      return;
    } 
    if (arrayList.contains("MAP")) {
      D.c("Setting Field mapping to: FieldMaps/BigStuffGen3.properties");
      PropertiesExtensionInHPackage.HComponentAlpha();
      PropertiesExtensionInHPackage.b("FieldMaps/BigStuffGen3.properties");
    } else if (arrayList.contains("Scaled Load")) {
      D.c("Setting Field mapping to: FieldMaps/BigStuffAlt.properties");
      PropertiesExtensionInHPackage.HComponentAlpha();
      PropertiesExtensionInHPackage.b("FieldMaps/BigStuffAlt.properties");
    } else if (arrayList.contains("Scaled_Load")) {
      D.c("Setting Field mapping to: FieldMaps/BigStuff.properties");
      PropertiesExtensionInHPackage.HComponentAlpha();
      PropertiesExtensionInHPackage.b("FieldMaps/BigStuff.properties");
    } else {
      D.c("Setting Field mapping to: FieldMaps/BigStuffReplay.properties");
      PropertiesExtensionInHPackage.HComponentAlpha();
      PropertiesExtensionInHPackage.b("FieldMaps/BigStuffReplay.properties");
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/j/HComponentAlpha.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */