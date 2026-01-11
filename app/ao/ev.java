package ao;

import java.util.Iterator;

class ev implements Runnable {
  ev(er paramer) {}
  
  public void run() {
    Iterator iterator = this.a.a.keySet().iterator();
    while (iterator.hasNext()) {
      fK fK = (fK)this.a.a.get(iterator.next());
      fK.a(this.a.e);
      fK.repaint();
    } 
    this.a.e();
    this.a.d.a(0.0D);
    if (this.a.e != null)
      this.a.d.b(this.a.e.d()); 
    this.a.d.c(0.0D);
    if (this.a.e != null)
      this.a.d.d(this.a.e.d()); 
    iterator = this.a.a.keySet().iterator();
    while (iterator.hasNext()) {
      fK fK = (fK)this.a.a.get(iterator.next());
      fK.c();
      fK.repaint();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/ev.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */