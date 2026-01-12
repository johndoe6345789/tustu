package com.efiAnalytics.apps.ts.tuningViews.tuneComps;

import G.g;

class BurnButtonStateListener implements g {
  BurnButtonStateListener(BurnButtonTv paramBurnButtonTv) {}

  public void a(String paramString, int paramInt) {
    this.a.enableBurn(true);
  }

  public void b(String paramString, int paramInt) {}

  public void a(String paramString, boolean paramBoolean) {
    this.a.enableBurn(!paramBoolean);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/tuneComps/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
