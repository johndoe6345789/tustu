package A;

import bH.D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class AbstractConnectionManager implements ControllerInterface {
  private final Collection b = new CopyOnWriteArrayList();

  ArrayList a = new ArrayList();

  public void a(DataReceivedListener paramy) {
    if (!this.a.contains(paramy))
      this.a.add(paramy); 
  }
  
  public void b(DataReceivedListener paramy) {
    this.a.remove(paramy);
  }
  
  public void a(ConnectionEventListener parame) {
    if (!this.b.contains(parame))
      this.b.add(parame);
  }

  public void b(ConnectionEventListener parame) {
    this.b.remove(parame);
  }

  protected void a() {
    for (ConnectionEventListener e : this.b) {
      try {
        e.c();
      } catch (Exception exception) {
        D.a("Exception in notifyConnected()");
        D.a(exception);
      } 
    } 
  }
  
  protected void b() {
    for (ConnectionEventListener e : this.b) {
      try {
        e.d();
      } catch (Exception exception) {
        D.a("Exception in notifyConnectionAttemptFailed()");
        D.a(exception);
      } 
    } 
  }
  
  protected void c() {
    for (e e : this.b) {
      try {
        e.b();
      } catch (Exception exception) {
        D.a("Exception in notifyConnectionAttemptStarting()");
        D.a(exception);
      } 
    } 
  }
  
  protected void d() {
    for (e e : this.b) {
      try {
        e.a();
      } catch (Exception exception) {
        D.a("Exception in notifyConnectionLost()");
        D.a(exception);
      } 
    } 
  }
  
  protected void e() {
    for (e e : this.b) {
      try {
        e.e();
      } catch (Exception exception) {
        D.a("Exception in notifyConnectionClosing()");
        D.a(exception);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/A/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */