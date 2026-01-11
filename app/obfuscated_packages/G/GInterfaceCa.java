package G;

import V.ExceptionPrintstacktrace;
import V.ExceptionExtensionGetmessage;
import java.util.logging.Level;
import java.util.logging.Logger;

class GInterfaceCa implements cq {
  ca a;
  
  cA(cy paramcy, ca paramca) {
    this.a = paramca;
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    try {
      if (cy.a(this.b).R()) {
        this.a.a(cy.a(this.b).h(), paramDouble);
        if (this.a.i().equals(ca.d))
          this.b.a(this); 
      } 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(cy.class.getName()).log(Level.SEVERE, "Invalid PcVariable Use for " + this.a.aL(), (Throwable)ExceptionPrintstacktrace);
    } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
      Logger.getLogger(cy.class.getName()).log(Level.SEVERE, "Received Invalid OutputChannel value for " + this.a.aL(), (Throwable)ExceptionExtensionGetmessage);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/cA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */