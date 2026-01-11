package com.efiAnalytics.xcp.master.responseProcessors;

import G.R;

class PcVariableRefreshRequest {
  private R b;
  
  private String c = null;
  
  public i(g paramg, R paramR) {
    this.b = paramR;
  }
  
  public i(g paramg, R paramR, String paramString) {
    this.b = paramR;
    this.c = paramString;
  }
  
  public R a() {
    return this.b;
  }
  
  public String b() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/xcp/master/responseProcessors/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */