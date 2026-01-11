package business.query_builders.bQ_components;

import G.SerializableImpl;
import G.w;
import bH.X;
import bO.BoInterfaceAlpha;
import bO.ArrayListExtensionInBoPackage;
import bO.BoInterfaceLima;
import java.util.ArrayList;
import java.util.List;

public class BqInterfaceCharlie {
  private static c BoInterfaceAlpha = null;
  
  private int b = -1;
  
  private int c = -1;
  
  private int d = -1;
  
  private BoInterfaceAlpha e = null;
  
  private List f = null;
  
  private List g = null;
  
  private List h = null;
  
  private List i = new ArrayList();
  
  protected void BoInterfaceAlpha(BoInterfaceAlpha parama, List paramList1, List paramList2, List paramList3, int paramInt1, int paramInt2, int paramInt3) {
    this.e = parama;
    this.f = paramList1;
    this.g = paramList2;
    this.h = paramList3;
    this.c = paramInt2;
    this.d = paramInt3;
    this.b = paramInt1;
    h();
  }
  
  private void h() {
    for (d d : this.i)
      d.BoInterfaceAlpha(); 
  }
  
  public static c BoInterfaceAlpha() {
    if (BoInterfaceAlpha == null)
      BoInterfaceAlpha = new c(); 
    return BoInterfaceAlpha;
  }
  
  public static String BoInterfaceAlpha(List<w> paramList) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Range ").append(" \t").append("Start\t").append("End\t").append("Length\n");
    int i = 0;
    for (byte b = 0; b < paramList.size(); b++) {
      stringBuilder.append("Range ").append(b).append(":\t").append(((w)paramList.get(b)).BoInterfaceAlpha()).append("\t").append(((w)paramList.get(b)).b()).append("\t").append(((w)paramList.get(b)).c()).append("\n");
      i += ((w)paramList.get(b)).c();
    } 
    stringBuilder.append("Data Range Count: ").append(paramList.size()).append("\tTotal Bytes: ").append(i).append("\n");
    return stringBuilder.toString();
  }
  
  public static String b(List<SerializableImpl> paramList) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(X.b("Channel", ' ', 40)).append(" \t").append("address\t\t").append("Length\n");
    int i = 0;
    for (byte b = 0; b < paramList.size(); b++) {
      stringBuilder.append(X.b(((SerializableImpl)paramList.get(b)).aL(), ' ', 40)).append("\t").append("0x").append(Long.toHexString(((SerializableImpl)paramList.get(b)).x()).toUpperCase()).append("\t\t").append(((SerializableImpl)paramList.get(b)).BoInterfaceLima()).append("\n");
      i += ((SerializableImpl)paramList.get(b)).BoInterfaceLima();
    } 
    stringBuilder.append("Channel Count: ").append(paramList.size()).append("\tTotal Bytes: ").append(i).append("\n");
    return stringBuilder.toString();
  }
  
  public static String c(List<ArrayListExtensionInBoPackage> paramList) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Channel ").append(" \t").append("address\t").append("Length\n");
    int i = 0;
    for (byte b = 0; b < paramList.size(); b++) {
      stringBuilder.append("ODT #").append(b).append("\tSize: ").append(((ArrayListExtensionInBoPackage)paramList.get(b)).b()).append("\tEntries:\n");
      i += ((ArrayListExtensionInBoPackage)paramList.get(b)).b();
      List list = (List)paramList.get(b);
      byte b1 = 0;
      stringBuilder.append("\tEntry #\tAdd\tLen\n");
      for (BoInterfaceLima BoInterfaceLima : list)
        stringBuilder.append("\t").append(b1++).append("\t").append("0x").append(Long.toHexString(BoInterfaceLima.BoInterfaceAlpha()).toUpperCase()).append("\t").append(BoInterfaceLima.b()).append("\n"); 
    } 
    stringBuilder.append("ODT Count: ").append(paramList.size()).append("\tTotal Bytes: ").append(i).append("\n");
    return stringBuilder.toString();
  }
  
  public List b() {
    return this.f;
  }
  
  public List c() {
    return this.g;
  }
  
  public List d() {
    return this.h;
  }
  
  public void BoInterfaceAlpha(d paramd) {
    this.i.add(paramd);
  }
  
  public void b(d paramd) {
    this.i.remove(paramd);
  }
  
  public int e() {
    return this.b;
  }
  
  public int f() {
    return this.c;
  }
  
  public int g() {
    return this.d;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bQ/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */