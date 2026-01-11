package J;

import G.cr;
import G.cu;
import java.io.Serializable;

public class j extends h implements cr, Serializable {
  public static String b = "ReSyncedCommsCount";
  
  public static String c = "wrongCounterCount";
  
  protected String[] d = new String[] { 
      "CTO_PacketsSentCount", "CTO_PacketsReceivedCount", "CTO_PacketTimeout", "CTO_RetryFailedCount", "CTO_RetrySuccessCount", "DTO_PacketsReceivedCount", "wrongCounterCount", "lostPacketCount", "failedPacketCrcCount", "syncCount", 
      "resyncDataStreamCount", "uploadPacketCount", "downloadPacketCount", "burnPageOkCount", "burnPageFailedCount", "controllerBusyCount", "CRC_Cal_Block_Match", "CRC_Cal_Block_No_Match" };
  
  int e = 0;
  
  int f = 0;
  
  int g = 0;
  
  int h = 0;
  
  int i = 0;
  
  int j = 0;
  
  int k = 0;
  
  int l = 0;
  
  int m = 0;
  
  int n = 0;
  
  int o = 0;
  
  int p = 0;
  
  int q = 0;
  
  int r = 0;
  
  int s = 0;
  
  int t = 0;
  
  int u = 0;
  
  int v = 0;
  
  int w = 0;
  
  int x = 0;
  
  int y = 0;
  
  public String[] s() {
    return this.d;
  }
  
  public void e() {
    this.e++;
    cu.a().a("CTO_PacketsSentCount", this.e);
  }
  
  public void f() {
    this.f++;
    x();
  }
  
  public void g() {
    this.g++;
    x();
  }
  
  public void h() {
    this.h++;
    x();
  }
  
  public void i() {
    this.i++;
    x();
  }
  
  public void j() {
    this.j++;
    cu.a().a("DTO_PacketsSentCount", this.j);
  }
  
  public void k() {
    this.k++;
    cu.a().a("DTO_PacketsReceivedCount", this.k);
  }
  
  public void l() {
    this.l++;
    cu.a().a("wrongCounterCount", this.l);
  }
  
  public void a(int paramInt) {
    this.n += paramInt;
    x();
  }
  
  public void m() {
    this.o++;
    x();
  }
  
  public void n() {
    this.p++;
    x();
  }
  
  public void o() {
    this.q++;
    x();
  }
  
  public void p() {
    this.r++;
    cu.a().a("uploadPacketCount", this.r);
  }
  
  public void q() {
    this.s++;
    cu.a().a("downloadPacketCount", this.s);
  }
  
  public void r() {
    this.t++;
    x();
  }
  
  public void t() {
    this.u++;
    x();
  }
  
  public void u() {
    this.v++;
    x();
  }
  
  public void v() {
    this.x++;
    x();
  }
  
  public void w() {
    this.y++;
    x();
  }
  
  public void a() {
    this.e = 0;
    this.f = 0;
    this.g = 0;
    this.h = 0;
    this.i = 0;
    this.j = 0;
    this.k = 0;
    this.l = 0;
    this.m = 0;
    this.n = 0;
    this.o = 0;
    this.p = 0;
    this.q = 0;
    this.r = 0;
    this.s = 0;
    this.t = 0;
    this.u = 0;
    this.v = 0;
    this.w = 0;
    this.x = 0;
    this.y = 0;
  }
  
  public String c() {
    return cu.a;
  }
  
  public void x() {
    cu.a().a("CTO_PacketsSentCount", this.e);
    cu.a().a("CTO_PacketsReceivedCount", this.f);
    cu.a().a("CTO_PacketTimeout", this.g);
    cu.a().a("CTO_RetryFailedCount", this.h);
    cu.a().a("CTO_RetrySuccessCount", this.i);
    cu.a().a("DTO_PacketsSentCount", this.j);
    cu.a().a("DTO_PacketsReceivedCount", this.k);
    cu.a().a("wrongCounterCount", this.l);
    cu.a().a("missingFrameCount", this.m);
    cu.a().a("lostPacketCount", this.n);
    cu.a().a("failedPacketCrcCount", this.o);
    cu.a().a("syncCount", this.p);
    cu.a().a("resyncDataStreamCount", this.q);
    cu.a().a(b, this.w);
    cu.a().a("uploadPacketCount", this.r);
    cu.a().a("downloadPacketCount", this.s);
    cu.a().a("burnPageOkCount", this.t);
    cu.a().a("burnPageFailedCount", this.u);
    cu.a().a("controllerBusyCount", this.v);
    cu.a().a("CRC_Cal_Block_Match", this.x);
    cu.a().a("CRC_Cal_Block_No_Match", this.y);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/J/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */