package com.efiAnalytics.apps.ts.dashboard;

import V.a;
import com.efiAnalytics.ui.bV;

class DocumentLoaderThread extends Thread {
  String a;
  
  DocumentLoaderThread(HtmlDisplay paramHtmlDisplay, String paramString) {
    super("DocLoader");
    this.a = paramString;
    setDaemon(true);
  }
  
  public void run() {
    try {
      this.b.setDocumentUrl(this.a);
    } catch (a a) {
      bV.d(a.getMessage(), this.b.a);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/aJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */