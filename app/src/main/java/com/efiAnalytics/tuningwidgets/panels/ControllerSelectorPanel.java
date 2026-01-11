package com.efiAnalytics.tuningwidgets.panels;

import G.R;
import G.T;
import G.AeInterfaceMikeTostring;
import W.NetworkExceptionprintstacktrace;
import W.z;
import bH.D;
import com.efiAnalytics.ui.ck;
import com.efiAnalytics.ui.fp;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;
import java.net.URLDecoder;
import java.text.DateFormat;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import r.IOPropertiesUsingFile;
import s.SComponentGolf;

public class ControllerSelectorPanel extends ck {
  ButtonGroup IOPropertiesUsingFile = new ButtonGroup();
  
  JTextPane b = new JTextPane();
  
  private String d = "";
  
  JPanel c = null;
  
  private boolean e = false;
  
  public ac(String[] paramArrayOfString, String paramString) {
    setBorder(BorderFactory.createTitledBorder("Controller"));
    this.c = new JPanel();
    this.c.setLayout(new GridLayout(0, 1));
    if (paramArrayOfString != null)
      for (byte b = 0; b < paramArrayOfString.length; b++) {
        JRadioButton jRadioButton = new JRadioButton(paramArrayOfString[b]);
        jRadioButton.setActionCommand(paramArrayOfString[b]);
        this.IOPropertiesUsingFile.add(jRadioButton);
        this.c.add(jRadioButton);
        if (paramString != null && paramArrayOfString[b].equals(paramString))
          this.IOPropertiesUsingFile.setSelected(jRadioButton.getModel(), true); 
      }  
    setLayout(new BorderLayout());
    add("North", this.c);
    add("Center", this.b);
    this.b.setBackground(getBackground());
    this.b.setForeground(UIManager.getColor("Label.foreground"));
    this.b.setBorder(BorderFactory.createEtchedBorder());
  }
  
  public String IOPropertiesUsingFile() {
    return this.IOPropertiesUsingFile.getSelection().getActionCommand();
  }
  
  public void IOPropertiesUsingFile(String paramString) {
    Enumeration<AbstractButton> enumeration = this.IOPropertiesUsingFile.getElements();
    while (enumeration.hasMoreElements()) {
      AbstractButton abstractButton = enumeration.nextElement();
      this.IOPropertiesUsingFile.setSelected(abstractButton.getModel(), abstractButton.getText().equals(paramString));
    } 
    fp.IOPropertiesUsingFile(this.c, false);
  }
  
  public void b(String paramString) {
    Enumeration<AbstractButton> enumeration = this.IOPropertiesUsingFile.getElements();
    while (enumeration.hasMoreElements()) {
      AbstractButton abstractButton = enumeration.nextElement();
      if (abstractButton.getActionCommand().equals(paramString))
        this.IOPropertiesUsingFile.setSelected(abstractButton.getModel(), true); 
    } 
  }
  
  public void IOPropertiesUsingFile(File paramFile) {
    if (paramFile != null) {
      if (this.d.length() > 0) {
        this.b.setText(b() + "\n\n" + c(paramFile));
      } else {
        this.b.setText(c(paramFile));
      } 
      String str = z.IOPropertiesUsingFile(paramFile);
      String[] arrayOfString = T.IOPropertiesUsingFile().d();
      if (arrayOfString != null)
        for (byte b = 0; b < arrayOfString.length; b++) {
          R r = T.IOPropertiesUsingFile().c(arrayOfString[b]);
          if (r.i().equals(str))
            b(arrayOfString[b]); 
        }  
    } else {
      this.b.setText(b());
    } 
  }
  
  protected String c(File paramFile) {
    try {
      String str = SComponentGolf.b("Unrecognized file type");
      if (paramFile.getName().toLowerCase().endsWith("." + IOPropertiesUsingFile.cw.toLowerCase()) || paramFile.getName().toLowerCase().endsWith("." + IOPropertiesUsingFile.cz.toLowerCase()) || paramFile.getName().toLowerCase().indexOf(".ini") != -1 || paramFile.getName().toLowerCase().indexOf(".ecu") != -1) {
        str = "Selected File Info:\n\n";
        try {
          AeInterfaceMikeTostring AeInterfaceMikeTostring = (new NetworkExceptionprintstacktrace()).IOPropertiesUsingFile(paramFile);
          if (AeInterfaceMikeTostring.c() != null && AeInterfaceMikeTostring.c().length() > 0) {
            String str1 = URLDecoder.decode(AeInterfaceMikeTostring.c(), "UTF-8");
            str = str + "Firmware:\n" + str1 + "\n\n";
          } 
          str = str + "Signature:\n" + AeInterfaceMikeTostring.b() + "\n\nLast Modified : " + DateFormat.getDateInstance(2).format(Long.valueOf(paramFile.lastModified()));
        } catch (Exception exception) {}
      } else if (paramFile.getName().toLowerCase().endsWith("." + IOPropertiesUsingFile.C)) {
        str = "Selected File Info:\n\nOld style BigComm tune file.\nLast Modified : " + DateFormat.getDateInstance(2).format(Long.valueOf(paramFile.lastModified()));
      } 
      return str;
    } catch (Exception exception) {
      Logger.getLogger(ControllerSelectorPanel.class.getName()).log(Level.SEVERE, (String)null, exception);
      return SComponentGolf.b("Unrecognized file type");
    } 
  }
  
  public void b(File paramFile) {
    D.c("Directory Selected: " + paramFile.getAbsolutePath());
  }
  
  public String b() {
    return this.d;
  }
  
  public void c(String paramString) {
    this.d = paramString;
    this.b.setText(paramString);
  }
  
  public void IOPropertiesUsingFile(boolean paramBoolean) {
    this.e = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/ac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */