package ao;

import g.k;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

final class P implements ActionListener {
  P(List paramList, String paramString, Component paramComponent) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String str1 = "";
    for (String str : this.a)
      str1 = str1 + str + ", "; 
    if (str1.endsWith(", "))
      str1 = str1.substring(0, str1.length() - 2); 
    String str2 = k.a("{Save the fields in '" + this.b + "' As}", false, "Selected Fields: " + str1, true, this.c);
    if (str2 != null && !str2.isEmpty())
      O.a(str2, this.a); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/P.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */