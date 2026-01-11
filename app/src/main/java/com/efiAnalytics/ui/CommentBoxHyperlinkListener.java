package com.efiAnalytics.ui;

import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

class CommentBoxHyperlinkListener implements HyperlinkListener {
  long a = 0L;
  
  CommentBoxHyperlinkListener(bi parambi) {}
  
  public void CommentBoxHyperlinkListener(HyperlinkEvent paramHyperlinkEvent) {
    char c = 'ߐ';
    if (paramHyperlinkEvent.getEventType().equals(HyperlinkEvent.EventType.ACTIVATED) && System.currentTimeMillis() - this.a > c) {
      this.a = System.currentTimeMillis();
      if (paramHyperlinkEvent.getURL().getProtocol().startsWith("http") || paramHyperlinkEvent.getDescription().startsWith("http:") || paramHyperlinkEvent.getDescription().startsWith("https:"))
        aN.a(paramHyperlinkEvent.getURL().toString()); 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/bj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */