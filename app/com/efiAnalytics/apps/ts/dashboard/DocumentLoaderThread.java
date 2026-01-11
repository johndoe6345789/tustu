package com.efiAnalytics.apps.ts.dashboard;

import V.ExceptionInVPackage;
import com.efiAnalytics.ui.bV;

class DocumentLoaderThread extends Thread {
  String ExceptionInVPackage;
  
  DocumentLoaderThread(HtmlDisplay paramHtmlDisplay, String paramString) {
    super("DocLoader");
    this.ExceptionInVPackage = paramString;
    setDaemon(true);
  }
  
  public void run() {
    try {
      this.b.setDocumentUrl(this.ExceptionInVPackage);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      bV.d(ExceptionInVPackage.getMessage(), this.b.ExceptionInVPackage);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/aJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */