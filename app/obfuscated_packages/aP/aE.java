package aP;

import bH.X;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import r.j;

class aE extends KeyAdapter {
  aE(au paramau) {}
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    File file = new File(this.a.b() + "12" + paramKeyEvent.getKeyChar() + "12");
    try {
      file.createNewFile();
      file.delete();
    } catch (Exception exception) {
      this.a.a.setText(X.b(this.a.a.getText(), "" + paramKeyEvent.getKeyChar(), ""));
    } 
    String str = j.u();
    str = str.substring(0, str.lastIndexOf(File.separator));
    this.a.f(str);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/aE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */