package aP;

import aE.a;
import java.io.File;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileView;
import r.a;

public class id extends FileView {
  ImageIcon a = null;
  
  public id() {
    this.a = a("resources/TSicon.gif");
  }
  
  public String getName(File paramFile) {
    return null;
  }
  
  public String getDescription(File paramFile) {
    return null;
  }
  
  public Boolean isTraversable(File paramFile) {
    return a(paramFile) ? new Boolean(false) : null;
  }
  
  public String getTypeDescription(File paramFile) {
    return a(paramFile) ? (a.b + " Project") : null;
  }
  
  public Icon getIcon(File paramFile) {
    return a(paramFile) ? this.a : null;
  }
  
  protected boolean a(File paramFile) {
    return a.a(paramFile);
  }
  
  protected ImageIcon a(String paramString) {
    URL uRL = getClass().getResource(paramString);
    if (uRL != null)
      return new ImageIcon(uRL); 
    System.err.println("Couldn't find file: " + paramString);
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/id.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */