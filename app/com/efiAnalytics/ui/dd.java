package com.efiAnalytics.ui;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.filechooser.FileFilter;

public class dd extends FileFilter implements Serializable {
  String a = "";
  
  ArrayList b = new ArrayList();
  
  public dd(String paramString) {
    a(paramString);
  }
  
  public void a(String paramString) {
    this.a = paramString;
  }
  
  public void b(String paramString) {
    this.b.add(paramString.toLowerCase());
  }
  
  public boolean accept(File paramFile) {
    if (paramFile.isDirectory())
      return true; 
    Iterator<String> iterator = this.b.iterator();
    while (iterator.hasNext()) {
      if (paramFile.getName().toLowerCase().indexOf(("." + (String)iterator.next()).toLowerCase()) != -1)
        return true; 
    } 
    return false;
  }
  
  public String getDescription() {
    return this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/dd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */