package com.efiAnalytics.ui;

import bH.D;
import java.awt.BorderLayout;
import java.awt.Window;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.icepdf.core.pobjects.Destination;
import org.icepdf.core.pobjects.Dictionary;
import org.icepdf.core.pobjects.Name;
import org.icepdf.ri.common.ComponentKeyBinding;
import org.icepdf.ri.common.MyAnnotationCallback;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;
import org.icepdf.ri.common.views.AnnotationCallback;
import org.icepdf.ri.util.PropertiesManager;

public class PdfViewerDialog {
  SwingController a = null;
  
  JDialog b = null;
  
  et c = null;
  
  public PdfViewerDialog(Window paramWindow) {
    this.a = new SwingController();
    Properties properties = new Properties();
    properties.setProperty("application.showLocalStorageDialogs", Boolean.FALSE.toString());
    PropertiesManager propertiesManager = new PropertiesManager(System.getProperties(), properties, ResourceBundle.getBundle("org.icepdf.ri.resources.MessageBundle"));
    SwingViewBuilder swingViewBuilder = new SwingViewBuilder(this.a, propertiesManager);
    propertiesManager.setBoolean("application.toolbar.show.annotation", Boolean.FALSE.booleanValue());
    propertiesManager.setBoolean("application.toolbar.show.utility.save", Boolean.FALSE.booleanValue());
    propertiesManager.setBoolean("application.toolbar.show.rotate", Boolean.FALSE.booleanValue());
    propertiesManager.setInt("document.pagefitMode", 4);
    JPanel jPanel = swingViewBuilder.buildViewerPanel();
    ComponentKeyBinding.install(this.a, jPanel);
    this.a.getDocumentViewController().setAnnotationCallback((AnnotationCallback)new MyAnnotationCallback(this.a.getDocumentViewController()));
    this.b = new JDialog(paramWindow);
    this.b.setDefaultCloseOperation(1);
    this.b.setLayout(new BorderLayout());
    this.b.add("Center", jPanel);
    this.b.setSize(900, 600);
    bV.a(paramWindow, this.b);
    this.b.setVisible(true);
  }
  
  public void a(URL paramURL) {
    if (paramURL.getProtocol().equals("file")) {
      String str = "";
      if (paramURL.getHost() != null && paramURL.getHost().length() > 0)
        str = str + paramURL.getHost() + ":"; 
      try {
        str = str + URLDecoder.decode(paramURL.getFile(), "UTF-8");
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        Logger.getLogger(dK.class.getName()).log(Level.SEVERE, (String)null, unsupportedEncodingException);
      } 
      if ((new File(str)).exists()) {
        this.a.openDocument(str);
      } else {
        JOptionPane.showMessageDialog(this.b, "File not found at:\n" + str, "PDF file not found!", 0);
      } 
    } else {
      this.a.openDocument(paramURL.getFile());
    } 
    if (paramURL.getRef() != null && paramURL.getRef().contains("page=")) {
      String str = paramURL.getRef().substring("page=".length());
      if (str.contains("&"))
        str = str.substring(0, str.indexOf("&")); 
      try {
        int i = Integer.parseInt(str) - 1;
        this.a.showPage(i);
        D.c("Set pdf to page: " + i);
      } catch (NumberFormatException numberFormatException) {
        D.c("Bad Page: " + str);
      } 
    } else if (paramURL.getRef() != null && paramURL.getRef().length() > 0) {
      String str = paramURL.getRef();
      if (str.contains("&"))
        str = str.substring(0, str.indexOf("&")); 
      Destination destination = a(str);
      if (destination != null)
        this.a.getDocumentViewController().setDestinationTarget(destination); 
    } 
    this.a.setPageViewMode(2, false);
  }
  
  private Destination a(String paramString) {
    Destination destination = null;
    if (this.a.getDocument() != null && this.a.getDocument().getCatalog() != null) {
      Dictionary dictionary = this.a.getDocument().getCatalog().getDestinations();
      if (dictionary != null) {
        HashMap hashMap = dictionary.getEntries();
        for (Name name : hashMap.keySet()) {
          if (name.equals(paramString)) {
            ArrayList arrayList = (ArrayList)hashMap.get(name);
            if (arrayList != null) {
              destination = new Destination(dictionary.getLibrary(), arrayList);
              break;
            } 
          } 
        } 
      } 
    } 
    return destination;
  }
  
  public void a(boolean paramBoolean) {
    this.b.setVisible(paramBoolean);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/dK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */