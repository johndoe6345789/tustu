package bt;

import G.R;
import G.SerializableImpl;
import G.Manager;
import G.SerializableImplExceptionprintstacktrace;
import G.GInterfaceAh;
import G.GComponentBk;
import G.GComponentBq;
import G.GComponentBz;
import V.ExceptionPrintstacktrace;
import V.ExceptionExtensionGetmessage;
import com.efiAnalytics.ui.bc;
import java.awt.BorderLayout;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
import s.ExceptionPrintstacktrace;

public class SettingCalibrationField extends aV implements bc {
  JButton a;
  
  GComponentBk b;
  
  D c;
  
  GInterfaceAh d = new GInterfaceAh();
  
  R e;
  
  public I(R paramR, GComponentBk parambk) {
    super(paramR, (GComponentBq)parambk);
    this.b = parambk;
    this.e = paramR;
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    this.a = new JButton(ExceptionPrintstacktrace.b("Set to Current"));
    this.a.addActionListener(new J(this));
    jPanel.add("West", this.a);
    GComponentBz GComponentBz = new GComponentBz();
    GInterfaceAh ah1 = a(paramR, parambk.a());
    this.d.f(ah1.l());
    this.d.a(ah1.i());
    this.d.c("");
    this.d.b("");
    GComponentBz.a(this.d);
    this.c = new D(paramR, GComponentBz);
    this.c.a(this.d);
    jPanel.add("East", this.c);
    a(jPanel);
  }
  
  private void o() {
    SerializableImpl SerializableImpl = this.e.ExceptionPrintstacktrace(this.d.i());
    if (SerializableImpl != null) {
      double d = SerializableImpl.o();
      Manager Manager = this.e.c(this.b.b());
      try {
        Manager.a(this.e.h(), d);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(I.class.getName()).log(Level.SEVERE, "SettingCalibrationField failed to set value.", (Throwable)ExceptionPrintstacktrace);
      } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
        Logger.getLogger(I.class.getName()).log(Level.SEVERE, "SettingCalibrationField failed to set value. 2", (Throwable)ExceptionExtensionGetmessage);
      } 
    } 
  }
  
  public void close() {
    super.close();
    this.c.close();
  }
  
  private GInterfaceAh a(R paramR, String paramString) {
    null = paramR.B();
    while (null.hasNext()) {
      GInterfaceAh ah2 = null.next();
      if (ah2.i().equals(paramString))
        return ah2; 
    } 
    for (SerializableImplExceptionprintstacktrace SerializableImplExceptionprintstacktrace : paramR.ExceptionPrintstacktrace()) {
      if (SerializableImplExceptionprintstacktrace.a() != null && SerializableImplExceptionprintstacktrace.a().equals(paramString)) {
        GInterfaceAh ah2 = new GInterfaceAh();
        ah2.a(paramString);
        ah2.f(SerializableImplExceptionprintstacktrace.d());
        return ah2;
      } 
    } 
    GInterfaceAh ah1 = new GInterfaceAh();
    ah1.a(paramString);
    SerializableImpl SerializableImpl = paramR.ExceptionPrintstacktrace(paramString);
    if (SerializableImpl != null)
      ah1.f(SerializableImpl.d()); 
    return ah1;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/I.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */