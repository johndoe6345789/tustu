package com.efiAnalytics.tuningwidgets.portEditor;

import G.R;
import G.SerializableImpl;
import G.Manager;
import G.GInterfaceAn;
import G.ManagerUsingConcurrentHashMap;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import V.ExceptionExtensionGetmessage;
import bH.D;
import bH.X;
import bH.ExceptionPrintstacktrace;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

public class OutputChannelComboBox extends JComboBox implements F, bc {
  R ExceptionInVPackage = null;
  
  private R l = null;
  
  Manager b = null;
  
  GInterfaceAn c = null;
  
  private Manager m = null;
  
  private Manager n = null;
  
  ArrayList d = new ArrayList();
  
  ExceptionPrintstacktrace e = new ExceptionPrintstacktrace();
  
  int f = -1;
  
  int ExceptionPrintstacktrace = -1;
  
  boolean h = false;
  
  boolean i = false;
  
  boolean ExceptionExtensionGetmessage = false;
  
  boolean k = false;
  
  public C(R paramR, String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2) {
    this.ExceptionInVPackage = paramR;
    this.i = paramBoolean1;
    this.ExceptionExtensionGetmessage = paramBoolean2;
    this.b = this.ExceptionInVPackage.c(paramString1);
    this.m = this.ExceptionInVPackage.c(paramString2);
    if (paramString3 != null && !paramString3.isEmpty())
      this.n = this.ExceptionInVPackage.c(paramString3); 
    ExceptionInVPackage(this.ExceptionInVPackage);
    addActionListener(new D(this));
    this.c = new E(this);
    ManagerUsingConcurrentHashMap ManagerUsingConcurrentHashMap = ManagerUsingConcurrentHashMap.ExceptionInVPackage();
    try {
      ManagerUsingConcurrentHashMap.ExceptionInVPackage(this.ExceptionInVPackage.c(), this.b.aL(), this.c);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage("Failed to subscribe " + this.b.aL() + " for update notification.", (Exception)ExceptionInVPackage, this);
    } 
  }
  
  protected void ExceptionInVPackage(String paramString) {
    if (paramString != null && this.l != null && paramString.length() > 0 && !this.h) {
      SerializableImpl SerializableImpl = this.l.ExceptionPrintstacktrace(paramString);
      try {
        double[][] arrayOfDouble1 = this.b.i(this.ExceptionInVPackage.h());
        if (this.k) {
          if (this.b.e() >= 4) {
            arrayOfDouble1[this.ExceptionPrintstacktrace][this.f] = SerializableImpl.x();
          } else {
            arrayOfDouble1[this.ExceptionPrintstacktrace][this.f] = (SerializableImpl.x() - this.l.O().af());
          } 
        } else {
          arrayOfDouble1[this.ExceptionPrintstacktrace][this.f] = SerializableImpl.ExceptionInVPackage();
        } 
        this.b.ExceptionInVPackage(this.ExceptionInVPackage.h(), arrayOfDouble1);
        if (this.n != null) {
          this.e.ExceptionInVPackage();
          this.e.ExceptionInVPackage(SerializableImpl.aL().getBytes());
          double[][] arrayOfDouble = this.n.i(this.ExceptionInVPackage.h());
          arrayOfDouble[this.ExceptionPrintstacktrace][this.f] = this.e.b();
          this.n.ExceptionInVPackage(this.ExceptionInVPackage.h(), arrayOfDouble);
        } 
        double[][] arrayOfDouble2 = this.m.i(this.ExceptionInVPackage.h());
        arrayOfDouble2[this.ExceptionPrintstacktrace][this.f] = SerializableImpl.l();
        if (this.i) {
          if (SerializableImpl.t())
            arrayOfDouble2[this.ExceptionPrintstacktrace][this.f] = ((int)arrayOfDouble2[this.ExceptionPrintstacktrace][this.f] | 0x40); 
          if (!SerializableImpl.p())
            arrayOfDouble2[this.ExceptionPrintstacktrace][this.f] = ((int)arrayOfDouble2[this.ExceptionPrintstacktrace][this.f] | 0x80); 
        } 
        try {
          this.m.ExceptionInVPackage(this.ExceptionInVPackage.h(), arrayOfDouble2);
        } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
          bV.d("There is an error in your ini not allowing size to be set properly.", this);
        } 
        ExceptionInVPackage(SerializableImpl);
      } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
        D.ExceptionInVPackage("Value Out of Bounds updating:" + SerializableImpl.aL() + " offset to " + this.b.aL());
        Logger.getLogger(C.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionExtensionGetmessage);
      } catch (ExceptionPrintstacktrace g1) {
        D.ExceptionInVPackage("Error updating:" + SerializableImpl.aL() + " offset to " + this.b.aL());
      } catch (Exception exception) {
        String str1 = (SerializableImpl == null) ? "null" : SerializableImpl.aL();
        String str2 = (this.b == null) ? "null" : this.b.aL();
        D.ExceptionInVPackage("Unkown Error updating:" + str1 + " offset to " + str2);
        exception.printStackTrace();
      } 
    } 
  }
  
  public String ExceptionInVPackage() {
    return (String)getSelectedItem();
  }
  
  public void ExceptionInVPackage(int paramInt) {
    this.ExceptionPrintstacktrace = paramInt;
  }
  
  public void b(int paramInt) {
    this.f = paramInt;
    b();
  }
  
  public void b() {
    if (this.ExceptionPrintstacktrace >= 0 && this.f >= 0)
      try {
        double d = this.b.i(this.ExceptionInVPackage.h())[this.ExceptionPrintstacktrace][this.f];
        boolean bool = false;
        for (byte b = 0; b < getItemCount(); b++) {
          SerializableImpl SerializableImpl = this.l.ExceptionPrintstacktrace((String)getItemAt(b));
          if (this.k) {
            if (SerializableImpl != null) {
              long l;
              if (this.b.e() >= 4) {
                l = SerializableImpl.x();
              } else {
                l = SerializableImpl.x() - this.l.O().af();
              } 
              if (l == d) {
                setSelectedItem(getItemAt(b));
                bool = true;
                break;
              } 
            } 
          } else if (SerializableImpl != null && SerializableImpl.ExceptionInVPackage() == d) {
            setSelectedItem(getItemAt(b));
            bool = true;
            break;
          } 
        } 
        if (!bool && getItemCount() > 0)
          setSelectedItem(getItemAt(0)); 
      } catch (ExceptionPrintstacktrace g1) {
        g1.printStackTrace();
      }  
  }
  
  public void close() {
    ManagerUsingConcurrentHashMap ManagerUsingConcurrentHashMap = ManagerUsingConcurrentHashMap.ExceptionInVPackage();
    ManagerUsingConcurrentHashMap.ExceptionInVPackage(this.c);
  }
  
  public void ExceptionInVPackage(p paramp) {
    this.d.add(paramp);
  }
  
  private void ExceptionInVPackage(SerializableImpl paramaH) {
    Iterator<p> iterator = this.d.iterator();
    while (iterator.hasNext())
      ((p)iterator.next()).ExceptionInVPackage(paramaH); 
  }
  
  public void ExceptionInVPackage(R paramR) {
    this.l = paramR;
    this.h = true;
    removeAllItems();
    if (paramR.O().al().equals("XCP"))
      this.k = true; 
    String[] arrayOfString = paramR.s();
    ArrayList<String> arrayList = new ArrayList();
    byte b;
    for (b = 0; b < arrayOfString.length; b++) {
      SerializableImpl SerializableImpl = paramR.ExceptionPrintstacktrace(arrayOfString[b]);
      if (SerializableImpl.b() != null && !SerializableImpl.b().equals("formula") && !SerializableImpl.b().equals("bits") && (!this.ExceptionExtensionGetmessage || SerializableImpl.l() != 4))
        arrayList.add(arrayOfString[b]); 
    } 
    arrayOfString = arrayList.<String>toArray(new String[arrayList.size()]);
    arrayOfString = X.ExceptionInVPackage(arrayOfString);
    for (b = 0; b < arrayOfString.length; b++)
      addItem((E)arrayOfString[b]); 
    this.h = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/portEditor/C.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */