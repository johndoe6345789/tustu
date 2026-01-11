package aP;

import aE.PropertiesExtension;
import java.io.File;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileView;
import r.PropertiesExtension;

public class id extends FileView {
  ImageIcon PropertiesExtension = null;
  
  public id() {
    this.PropertiesExtension = PropertiesExtension("resources/TSicon.gif");
  }
  
  public String getName(File paramFile) {
    return null;
  }
  
  public String getDescription(File paramFile) {
    return null;
  }
  
  public Boolean isTraversable(File paramFile) {
    return PropertiesExtension(paramFile) ? new Boolean(false) : null;
  }
  
  public String getTypeDescription(File paramFile) {
    return PropertiesExtension(paramFile) ? (PropertiesExtension.b + " Project") : null;
  }
  
  public Icon getIcon(File paramFile) {
    return PropertiesExtension(paramFile) ? this.PropertiesExtension : null;
  }
  
  protected boolean PropertiesExtension(File paramFile) {
    return PropertiesExtension.PropertiesExtension(paramFile);
  }
  
  protected ImageIcon PropertiesExtension(String paramString) {
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