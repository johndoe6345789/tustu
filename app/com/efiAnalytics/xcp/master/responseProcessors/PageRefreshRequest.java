package com.efiAnalytics.xcp.master.responseProcessors;

import G.R;

class PageRefreshRequest {
  private R b;
  
  private int c;
  
  private int d = 0;
  
  private int e = Integer.MAX_VALUE;
  
  l(j paramj, R paramR, int paramInt) {
    this.b = paramR;
    this.c = paramInt;
  }
  
  l(j paramj, R paramR, int paramInt1, int paramInt2, int paramInt3) {
    this.b = paramR;
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
  }
  
  public R a() {
    return this.b;
  }
  
  public int b() {
    return this.c;
  }
  
  public int c() {
    return this.d;
  }
  
  public int d() {
    return this.e;
  }
  
  private boolean e() {
    return (this.d == 0 && this.e == Integer.MAX_VALUE);
  }
  
  public boolean a(R paramR, int paramInt1, int paramInt2, int paramInt3) {
    return paramR.equals(this.b) ? ((paramInt1 == this.c && (e() || (this.d <= paramInt2 && this.d + this.e >= paramInt2 + paramInt3)))) : false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/xcp/master/responseProcessors/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */