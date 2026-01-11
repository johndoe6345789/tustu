package aP;

import bt.K;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import s.SComponentGolf;

class JTextPaneExtension extends JTextPane implements K {
  public void hl(hg paramhg) {
    setEditable(false);
    setBackground(UIManager.getColor("Label.background"));
    setForeground(UIManager.getColor("Label.foreground"));
  }
  
  public void a(String paramString) {
    String str = this.a.a.w(paramString);
    if (str == null) {
      setText("");
    } else {
      setText(SComponentGolf.b(str));
      setCaretPosition(0);
    } 
  }
  
  public void b(String paramString) {
    setText("");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */