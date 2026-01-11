package com.efiAnalytics.apps.ts.dashboard;

import V.a;
import bH.X;
import com.efiAnalytics.ui.bV;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import javax.swing.BorderFactory;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

public class HtmlDisplay extends s implements t, Serializable {
  JEditorPane a = new JEditorPane((new HTMLEditorKit()).getContentType(), "<html><body></body></html>");
  
  String b = "";
  
  String c = "body { font-size: 100% }";
  
  private boolean d = true;
  
  private boolean f = false;
  
  public HtmlDisplay() {
    setLayout(new BorderLayout());
    this.a.setBorder(BorderFactory.createLoweredBevelBorder());
    this.a.setEditable(false);
    this.a.setContentType("text/html; charset=UTF-8");
    this.a.putClientProperty("JEditorPane.honorDisplayProperties", Boolean.valueOf(true));
    this.a.setText("<html><body></body></html>");
    ((HTMLDocument)this.a.getDocument()).getStyleSheet().addRule(this.c);
    this.a.addHyperlinkListener(new aI(this));
    JScrollPane jScrollPane = new JScrollPane(this.a);
    add("Center", jScrollPane);
  }
  
  public void setDocumentUrl(String paramString) {
    try {
      String str = paramString;
      if (!str.startsWith("http") && !str.startsWith("file"))
        str = getFullLocalUrlFromRelative(str); 
      ((AbstractDocument)this.a.getDocument()).setAsynchronousLoadPriority(2);
      Document document = this.a.getDocument();
      document.putProperty("stream", null);
      if (str.toLowerCase().endsWith("html") || str.toLowerCase().endsWith("htm")) {
        this.a.setContentType("text/html; charset=utf-8");
      } else {
        this.a.setContentType("text/plain; charset=utf-8");
      } 
      this.a.setPage(str);
      this.b = paramString;
    } catch (FileNotFoundException fileNotFoundException) {
      bV.d("File Not Found:\n" + fileNotFoundException.getMessage(), this);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Unable to read file:\n" + paramString);
    } 
  }
  
  public void setDocumentUrlLazy(String paramString) {
    aJ aJ = new aJ(this, paramString);
    aJ.start();
  }
  
  public String getDocumentUrl() {
    return this.b;
  }
  
  public void setText(String paramString) {
    this.a.setText(paramString);
    ((HTMLDocument)this.a.getDocument()).getStyleSheet().addRule(this.c);
  }
  
  private String getFullLocalUrlFromRelative(String paramString) {
    try {
      String str = null;
      if (paramString.startsWith("/") || paramString.startsWith("\\") || paramString.contains(":")) {
        str = paramString;
      } else {
        str = (new File((new File(".")).getCanonicalPath(), paramString)).getAbsolutePath();
      } 
      str = X.b(str, "\\", "/");
      return "file:///" + str;
    } catch (IOException iOException) {
      iOException.printStackTrace();
      return "file:///." + paramString;
    } 
  }
  
  public void setRunDemo(boolean paramBoolean) {}
  
  public boolean isRunDemo() {
    return false;
  }
  
  public void goDead() {}
  
  public void invalidatePainter() {}
  
  public boolean isMustPaint() {
    return false;
  }
  
  public boolean isComponentPaintedAt(int paramInt1, int paramInt2) {
    return (paramInt1 >= 0 && paramInt1 < getWidth() && paramInt2 >= 0 && paramInt2 < getHeight());
  }
  
  public void subscribeToOutput() {}
  
  public void unsubscribeToOutput() {}
  
  public void paintBackground(Graphics paramGraphics) {}
  
  public boolean requiresBackgroundRepaint() {
    return true;
  }
  
  public void updateGauge(Graphics paramGraphics) {}
  
  public Area areaPainted() {
    Rectangle2D.Double double_ = new Rectangle2D.Double(0.0D, 0.0D, getWidth(), getHeight());
    return new Area(double_);
  }
  
  public boolean isUseExternalBrowser() {
    return this.d;
  }
  
  public void setUseExternalBrowser(boolean paramBoolean) {
    this.d = paramBoolean;
  }
  
  public boolean isUseExternalBrowserOnlyForHttp() {
    return this.f;
  }
  
  public void setUseExternalBrowserOnlyForHttp(boolean paramBoolean) {
    this.f = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/HtmlDisplay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */