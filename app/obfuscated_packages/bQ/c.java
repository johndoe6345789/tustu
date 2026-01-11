package bQ;

import G.aH;
import G.w;
import bH.X;
import bO.a;
import bO.k;
import bO.l;
import java.util.ArrayList;
import java.util.List;

public class c {
  private static c a = null;
  
  private int b = -1;
  
  private int c = -1;
  
  private int d = -1;
  
  private a e = null;
  
  private List f = null;
  
  private List g = null;
  
  private List h = null;
  
  private List i = new ArrayList();
  
  protected void a(a parama, List paramList1, List paramList2, List paramList3, int paramInt1, int paramInt2, int paramInt3) {
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
      d.a(); 
  }
  
  public static c a() {
    if (a == null)
      a = new c(); 
    return a;
  }
  
  public static String a(List<w> paramList) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Range ").append(" \t").append("Start\t").append("End\t").append("Length\n");
    int i = 0;
    for (byte b = 0; b < paramList.size(); b++) {
      stringBuilder.append("Range ").append(b).append(":\t").append(((w)paramList.get(b)).a()).append("\t").append(((w)paramList.get(b)).b()).append("\t").append(((w)paramList.get(b)).c()).append("\n");
      i += ((w)paramList.get(b)).c();
    } 
    stringBuilder.append("Data Range Count: ").append(paramList.size()).append("\tTotal Bytes: ").append(i).append("\n");
    return stringBuilder.toString();
  }
  
  public static String b(List<aH> paramList) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(X.b("Channel", ' ', 40)).append(" \t").append("address\t\t").append("Length\n");
    int i = 0;
    for (byte b = 0; b < paramList.size(); b++) {
      stringBuilder.append(X.b(((aH)paramList.get(b)).aL(), ' ', 40)).append("\t").append("0x").append(Long.toHexString(((aH)paramList.get(b)).x()).toUpperCase()).append("\t\t").append(((aH)paramList.get(b)).l()).append("\n");
      i += ((aH)paramList.get(b)).l();
    } 
    stringBuilder.append("Channel Count: ").append(paramList.size()).append("\tTotal Bytes: ").append(i).append("\n");
    return stringBuilder.toString();
  }
  
  public static String c(List<k> paramList) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Channel ").append(" \t").append("address\t").append("Length\n");
    int i = 0;
    for (byte b = 0; b < paramList.size(); b++) {
      stringBuilder.append("ODT #").append(b).append("\tSize: ").append(((k)paramList.get(b)).b()).append("\tEntries:\n");
      i += ((k)paramList.get(b)).b();
      List list = (List)paramList.get(b);
      byte b1 = 0;
      stringBuilder.append("\tEntry #\tAdd\tLen\n");
      for (l l : list)
        stringBuilder.append("\t").append(b1++).append("\t").append("0x").append(Long.toHexString(l.a()).toUpperCase()).append("\t").append(l.b()).append("\n"); 
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
  
  public void a(d paramd) {
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