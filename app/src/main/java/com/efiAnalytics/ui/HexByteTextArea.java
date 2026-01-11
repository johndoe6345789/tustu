package com.efiAnalytics.ui;

import bH.D;
import bH.X;
import bH.c;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JTextArea;

public class HexByteTextArea extends JTextArea {
  private int b = 16;
  
  private int[] c = null;
  
  Dimension a = new Dimension(10, 10);
  
  private Insets d = new Insets(5, 5, 5, 5);
  
  private ArrayList e = new ArrayList();
  
  public HexByteTextArea() {
    setAutoscrolls(true);
    setFont(new Font("Monospaced", 0, 12));
    setColumns(77);
  }
  
  public String getToolTipText() {
    return a();
  }
  
  public String a() {
    int[] arrayOfInt = b();
    String str = "";
    if (arrayOfInt.length <= 4) {
      str = str + "Big endianess: " + c.b(arrayOfInt, 0, arrayOfInt.length, true, false);
      str = str + ", Little endianess: " + c.b(arrayOfInt, 0, arrayOfInt.length, false, false);
    } else if (arrayOfInt.length > 4) {
      str = str + "Select 4 or less bytes for endianess values";
    } 
    return str;
  }
  
  protected int[] b() {
    String str = getSelectedText();
    if (str == null || str.equals(""))
      return null; 
    ArrayList<String> arrayList = new ArrayList();
    StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
    while (stringTokenizer.hasMoreTokens())
      arrayList.add(stringTokenizer.nextToken()); 
    int[] arrayOfInt = new int[arrayList.size()];
    for (byte b = 0; b < arrayOfInt.length; b++) {
      String str1 = arrayList.get(b);
      str1 = X.b(str1, "0x", "");
      arrayOfInt[b] = Integer.parseInt(str1, this.b);
    } 
    return arrayOfInt;
  }
  
  public String c() {
    int[] arrayOfInt = b();
    byte[] arrayOfByte = c.a(arrayOfInt);
    return new String(arrayOfByte);
  }
  
  private String f() {
    byte b = 0;
    long l = System.nanoTime();
    StringBuffer stringBuffer = new StringBuffer();
    this.e.clear();
    while (this.c != null && this.c.length > b) {
      StringBuffer stringBuffer1 = new StringBuffer();
      for (byte b1 = 0; b1 < e() && b < this.c.length; b1++) {
        int i = c.a((byte)this.c[b]);
        stringBuffer1.append(c(i));
        stringBuffer1.append(' ');
        b++;
      } 
      this.e.add(stringBuffer1.toString());
      stringBuffer1.append('\n');
      stringBuffer.append(stringBuffer1.toString());
    } 
    D.c("Time to format:" + ((System.nanoTime() - l) / 1000000L) + "ms.");
    return stringBuffer.toString();
  }
  
  public int d() {
    return this.b;
  }
  
  public void a(int paramInt) {
    int i = e();
    this.b = paramInt;
    b(i);
    setText(f());
  }
  
  public int e() {
    return getColumns() / g();
  }
  
  public void b(int paramInt) {
    setColumns(paramInt * g());
    setText(f());
    h();
  }
  
  public void setText(String paramString) {
    int i = getCaretPosition();
    super.setText(paramString);
    if (i > paramString.length())
      i = paramString.length(); 
    setCaretPosition(i);
  }
  
  public void a(int[] paramArrayOfint) {
    this.c = paramArrayOfint;
    setText(f());
    h();
  }
  
  private int g() {
    switch (this.b) {
      case 2:
        return 9;
      case 10:
        return 4;
      case 16:
        return 3;
    } 
    return 4;
  }
  
  private void h() {
    if (this.c != null) {
      FontMetrics fontMetrics = getFontMetrics(getFont());
      int i = fontMetrics.getHeight() * (1 + this.c.length / e()) + this.d.top + this.d.bottom;
      int j = fontMetrics.charWidth('0') * e() * g() + this.d.left + this.d.right;
      this.a = new Dimension(j, i);
    } else {
      this.a = new Dimension(10, 10);
    } 
  }
  
  private String c(int paramInt) {
    switch (this.b) {
      case 16:
        return X.a(Integer.toHexString(paramInt), '0', 2);
      case 10:
        return X.a(Integer.toString(paramInt), '0', 3);
      case 2:
        return X.a(Integer.toBinaryString(paramInt), '0', 8);
    } 
    return X.a(Integer.toHexString(paramInt), '0', 2);
  }
  
  public Dimension getMinimumSize() {
    return this.a;
  }
  
  public Dimension getPreferredSize() {
    return getMinimumSize();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/aP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */