package j;

import W.j;
import bH.D;
import h.a;
import h.g;
import java.util.ArrayList;
import java.util.Iterator;

public class a implements a {
  public void a(ArrayList paramArrayList) {
    ArrayList<String> arrayList = new ArrayList();
    Iterator<j> iterator = paramArrayList.iterator();
    while (iterator.hasNext())
      arrayList.add(((j)iterator.next()).a()); 
    if (arrayList.contains("RPM_ENGINE")) {
      D.c("Setting Field mapping to: FieldMaps/BigStuffGen4.properties");
      g.a();
      g.b("FieldMaps/BigStuffGen4.properties");
      return;
    } 
    boolean bool = true;
    if (bool) {
      D.c("Setting Field mapping to: FieldMaps/BigStuffGen3.properties");
      g.a();
      g.b("FieldMaps/BigStuffGen3.properties");
      return;
    } 
    if (arrayList.contains("MAP")) {
      D.c("Setting Field mapping to: FieldMaps/BigStuffGen3.properties");
      g.a();
      g.b("FieldMaps/BigStuffGen3.properties");
    } else if (arrayList.contains("Scaled Load")) {
      D.c("Setting Field mapping to: FieldMaps/BigStuffAlt.properties");
      g.a();
      g.b("FieldMaps/BigStuffAlt.properties");
    } else if (arrayList.contains("Scaled_Load")) {
      D.c("Setting Field mapping to: FieldMaps/BigStuff.properties");
      g.a();
      g.b("FieldMaps/BigStuff.properties");
    } else {
      D.c("Setting Field mapping to: FieldMaps/BigStuffReplay.properties");
      g.a();
      g.b("FieldMaps/BigStuffReplay.properties");
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/j/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */