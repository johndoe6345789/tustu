package business.binary_decoders.bD_components;

import com.efiAnalytics.remotefileaccess.RemoteFileDescriptor;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JPanelExtensionPaint extends JPanel {
  c a = null;
  
  F b = null;
  
  H c = null;
  
  Image d = null;
  
  Image e = null;
  
  Image f = null;
  
  Font g = new Font("Ariel", 1, eJ.a(13));
  
  private String h = null;
  
  public JPanelExtensionPaint() {
    this.b = new F();
    setLayout(new BorderLayout());
    this.a = new c(this.b);
    JScrollPane jScrollPane = new JScrollPane(this.a);
    add("Center", jScrollPane);
    jScrollPane.getViewport().setBackground(Color.white);
    setPreferredSize(eJ.a(600, 300));
    setMinimumSize(eJ.a(450, 200));
  }
  
  public void a(boolean paramBoolean) {
    this.a.a(paramBoolean);
  }
  
  public List a() {
    ArrayList<RemoteFileDescriptor> arrayList = new ArrayList();
    int[] arrayOfInt = this.a.getSelectedRows();
    if (arrayOfInt != null && arrayOfInt.length > 0) {
      byte b;
      for (b = 0; b < arrayOfInt.length; b++)
        arrayOfInt[b] = this.a.convertRowIndexToModel(arrayOfInt[b]); 
      for (b = 0; b < arrayOfInt.length; b++)
        arrayList.add(this.b.a(arrayOfInt[b])); 
    } 
    return arrayList;
  }
  
  protected c b() {
    return this.a;
  }
  
  public void paint(Graphics paramGraphics) {
    try {
      super.paint(paramGraphics);
      if (this.c != null) {
        Image image1 = g();
        Image image2 = f();
        int i = (getWidth() - image2.getWidth(null)) / 2;
        int j = (getHeight() - image2.getHeight(null)) / 2;
        Graphics graphics = image2.getGraphics();
        graphics.setColor(Color.white);
        graphics.fill3DRect(0, 0, image2.getWidth(null) - 1, image2.getHeight(null) - 1, true);
        graphics.drawImage(image1, eJ.a(10), eJ.a(10), null);
        paramGraphics.drawImage(image2, i, j, null);
        if (e() != null && e().length() > 0) {
          Image image = b(e());
          i = (getWidth() - image.getWidth(null)) / 2;
          paramGraphics.drawImage(image, i, j + image2.getHeight(null) + eJ.a(5), null);
        } 
      } 
    } catch (Exception exception) {}
  }
  
  private Image f() {
    Image image = g();
    if (this.e == null || this.e.getHeight(null) < image.getHeight(null))
      this.e = createImage(image.getWidth(null) + eJ.a(20), image.getHeight(null) + eJ.a(20)); 
    return this.e;
  }
  
  private Image b(String paramString) {
    String[] arrayOfString = paramString.split("\n");
    FontMetrics fontMetrics = getFontMetrics(this.g);
    int i = eJ.a(16);
    int j = arrayOfString.length * fontMetrics.getHeight() + i;
    int k = a(arrayOfString, fontMetrics) + 2 * i;
    if (this.f == null || this.f.getHeight(null) != j || this.f.getWidth(null) != k) {
      this.f = createImage(k, j);
      Graphics graphics = this.f.getGraphics();
      graphics.setColor(Color.white);
      graphics.fill3DRect(0, 0, this.f.getWidth(null) - 1, this.f.getHeight(null) - 1, true);
      graphics.setColor(Color.BLACK);
      graphics.setFont(this.g);
      for (byte b = 0; b < arrayOfString.length; b++)
        graphics.drawString(arrayOfString[b], i, fontMetrics.getHeight() * (b + 1) + i / 2); 
    } 
    return this.f;
  }
  
  private int a(String[] paramArrayOfString, FontMetrics paramFontMetrics) {
    int i = 0;
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      int j = paramFontMetrics.stringWidth(paramArrayOfString[b]);
      if (j > i)
        i = j; 
    } 
    return i;
  }
  
  private Image g() {
    if (this.d == null)
      this.d = Toolkit.getDefaultToolkit().getImage(getClass().getResource("wait-large.gif")); 
    return this.d;
  }
  
  public void c() {
    d();
    this.c = new H(this);
    this.c.start();
  }
  
  public void d() {
    if (this.c != null) {
      this.c.a = false;
      this.c = null;
    } 
    a((String)null);
  }
  
  public void a(List paramList) {
    this.b.a();
    this.b.a(paramList);
  }
  
  public String e() {
    return this.h;
  }
  
  public void a(String paramString) {
    this.h = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bD/G.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */