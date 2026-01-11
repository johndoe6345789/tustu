package com.efiAnalytics.xcp.master.responseProcessors;

import G.F;
import G.R;
import G.T;
import bQ.IOHashMap;

public class PageChangeHandler {
  public void a(F paramF) {
    R r = T.a().c(paramF.u());
    if (r.C() instanceof IOHashMap) {
      IOHashMap IOHashMap = (IOHashMap)r.C();
      IOHashMap.p(paramF.u());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/xcp/master/responseProcessors/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */