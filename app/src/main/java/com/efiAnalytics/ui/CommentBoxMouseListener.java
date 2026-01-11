package com.efiAnalytics.ui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class CommentBoxMouseListener extends MouseAdapter {
  CommentBoxMouseListener(bi parambi) {}
  
  public void CommentBoxMouseListener(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getX() > this.a.getWidth() - eJ.a(37) && paramMouseEvent.getY() < eJ.a(304))
      this.a.b(); 
    if (!this.a.h && paramMouseEvent.getX() > eJ.a(169) && paramMouseEvent.getX() < eJ.a(184) && paramMouseEvent.getY() < eJ.a(304))
      if (!this.a.a.getText().equals("")) {
        if (bV.a("Are you sure you want to delete this comment?", this.a.a, true))
          this.a.c(); 
      } else {
        this.a.dispose();
      }  
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/bo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */