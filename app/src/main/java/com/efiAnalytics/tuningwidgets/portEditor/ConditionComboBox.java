package com.efiAnalytics.tuningwidgets.portEditor;

import G.R;
import G.Manager;
import G.GInterfaceAn;
import G.ManagerUsingConcurrentHashMap;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import V.ExceptionExtensionGetmessage;
import bH.D;
import com.efiAnalytics.ui.bc;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import s.ExceptionPrintstacktrace;

public class ConditionComboBox extends JComboBox implements bc {
  R ExceptionInVPackage = null;
  
  Manager b = null;
  
  GInterfaceAn c = null;
  
  String[] d = null;
  
  int e = 0;
  
  int f = 0;
  
  public ConditionComboBox(R paramR, String paramString, String[] paramArrayOfString) {
    this.ExceptionInVPackage = paramR;
    this.b = paramR.c(paramString);
    for (byte b = 0; b < paramArrayOfString.length; b++)
      addItem((E)b(paramArrayOfString[b])); 
    addActionListener(new w(this));
    this.c = new x(this);
    ManagerUsingConcurrentHashMap ManagerUsingConcurrentHashMap = ManagerUsingConcurrentHashMap.ExceptionInVPackage();
    try {
      ManagerUsingConcurrentHashMap.ExceptionInVPackage(this.ExceptionInVPackage.c(), this.b.aL(), this.c);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage("Failed to subscribe " + this.b.aL() + " for update notification.", (Exception)ExceptionInVPackage, this);
    } 
    b();
  }
  
  public boolean ExceptionInVPackage() {
    y y = (y)getSelectedItem();
    return !(y.ExceptionInVPackage().getBytes()[0] == 32);
  }
  
  private y b(String paramString) {
    y y = new y(this);
    y.ExceptionInVPackage(paramString);
    if (paramString.equals(" ")) {
      y.b(ExceptionPrintstacktrace.b("No additional Condition"));
    } else if (paramString.equals("&")) {
      y.b(ExceptionPrintstacktrace.b("And"));
    } else if (paramString.equals("|")) {
      y.b(ExceptionPrintstacktrace.b("Or"));
    } else if (paramString.equals("t")) {
      y.b(ExceptionPrintstacktrace.b("Time True"));
    } else {
      y.b(paramString);
    } 
    return y;
  }
  
  public void ExceptionInVPackage(int paramInt) {
    this.f = paramInt;
  }
  
  public void b(int paramInt) {
    this.e = paramInt;
    b();
  }
  
  private void c(String paramString) {
    ExceptionInVPackage(paramString);
    try {
      double[][] arrayOfDouble = this.b.i(this.ExceptionInVPackage.h());
      if ((arrayOfDouble[0]).length == 1) {
        arrayOfDouble[this.e][0] = paramString.charAt(0);
      } else {
        arrayOfDouble[this.f][this.e] = paramString.charAt(0);
      } 
      this.b.ExceptionInVPackage(this.ExceptionInVPackage.h(), arrayOfDouble);
    } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
      D.ExceptionInVPackage("Value Out of Bounds?? validating all values for " + this.b.aL());
      try {
        double[][] arrayOfDouble = this.b.i(this.ExceptionInVPackage.h());
        for (byte b = 0; b < arrayOfDouble.length; b++) {
          if (arrayOfDouble[b][0] > this.b.s()) {
            D.d(this.b.aL() + " value at " + b + " out of bounds, setting to max: " + this.b.s());
            arrayOfDouble[b][0] = this.b.s();
          } else if (arrayOfDouble[b][0] < this.b.r()) {
            D.d(this.b.aL() + " value at " + b + " out of bounds, setting to min: " + this.b.r());
            arrayOfDouble[b][0] = this.b.r();
          } 
        } 
        this.b.ExceptionInVPackage(this.ExceptionInVPackage.h(), arrayOfDouble);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        D.ExceptionInVPackage("Error updating: operator to " + paramString);
      } catch (ExceptionExtensionGetmessage j1) {
        D.ExceptionInVPackage("Value Out of Bounds?? vFailed to fix: " + this.b.aL());
        Logger.getLogger(v.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionExtensionGetmessage);
      } 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage("Error updating: operator to " + paramString);
    } 
  }
  
  public void ExceptionInVPackage(String paramString) {
    for (byte b = 0; b < getItemCount(); b++) {
      y y = (y)getItemAt(b);
      if (paramString.equals(y.ExceptionInVPackage())) {
        setSelectedItem(y);
        return;
      } 
    } 
  }
  
  public void b() {
    try {
      double[][] arrayOfDouble = this.b.i(this.ExceptionInVPackage.h());
      byte b = ExceptionInVPackage(arrayOfDouble, this.f, this.e);
      for (byte b1 = 0; b1 < getItemCount(); b1++) {
        if (((y)getItemAt(b1)).ExceptionInVPackage().getBytes()[0] == b) {
          setSelectedItem(getItemAt(b1));
          break;
        } 
      } 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
    } 
  }
  
  private byte ExceptionInVPackage(double[][] paramArrayOfdouble, int paramInt1, int paramInt2) {
    return ((paramArrayOfdouble[0]).length == 1) ? (byte)(int)paramArrayOfdouble[paramInt2][0] : (byte)(int)paramArrayOfdouble[paramInt1][paramInt2];
  }
  
  public void close() {
    ManagerUsingConcurrentHashMap ManagerUsingConcurrentHashMap = ManagerUsingConcurrentHashMap.ExceptionInVPackage();
    ManagerUsingConcurrentHashMap.ExceptionInVPackage(this.c);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/portEditor/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */