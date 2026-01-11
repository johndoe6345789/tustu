package com.efiAnalytics.ui;

import bH.D;
import java.awt.Toolkit;
import javax.swing.text.AttributeSet;
import javax.swing.text.DocumentFilter;

class NumericDocumentFilter extends DocumentFilter {
  private boolean b = true;
  
  NumericDocumentFilter(NumericTextField paramdo) {}
  
  public void insertString(DocumentFilter.FilterBypass paramFilterBypass, int paramInt, String paramString, AttributeSet paramAttributeSet) {
    if (paramString == null)
      return; 
    String str = this.a.getText();
    if (!this.b || a(paramString)) {
      super.insertString(paramFilterBypass, paramInt, paramString, paramAttributeSet);
    } else {
      Toolkit.getDefaultToolkit().beep();
    } 
    if (!this.b || !a(this.a.getText())) {
      this.a.setText(str);
      Toolkit.getDefaultToolkit().beep();
    } 
    this.a.c = Double.NaN;
  }
  
  public void replace(DocumentFilter.FilterBypass paramFilterBypass, int paramInt1, int paramInt2, String paramString, AttributeSet paramAttributeSet) {
    String str = this.a.getText();
    if (paramString == null || paramString.equals(""))
      return; 
    if (!this.b || a(paramString)) {
      try {
        super.replace(paramFilterBypass, paramInt1, paramInt2, paramString, paramAttributeSet);
      } catch (Exception exception) {}
    } else {
      Toolkit.getDefaultToolkit().beep();
    } 
    if (this.b && !a(this.a.getText()) && a(str)) {
      D.b("Invalid numeric value: " + this.a.getText() + ", setting back to: " + str);
      this.a.setText(str);
    } 
    this.a.c = Double.NaN;
  }
  
  private boolean a(String paramString) {
    if (this.a.f()) {
      try {
        String str = paramString;
        if (str.startsWith("0x")) {
          str = str.substring(2);
        } else if (str.startsWith("x")) {
          str = str.substring(1);
        } 
        Integer.parseInt(str, 16);
      } catch (Exception exception) {
        return false;
      } 
    } else {
      try {
        Double.parseDouble(paramString + '\001');
      } catch (Exception exception) {
        return false;
      } 
    } 
    return true;
  }
  
  public void a(boolean paramBoolean) {
    this.b = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/dp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */