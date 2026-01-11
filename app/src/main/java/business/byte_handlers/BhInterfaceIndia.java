package business.byte_handlers;

class BhInterfaceIndia implements Runnable {
  BhInterfaceIndia(b paramb) {}
  
  public void run() {
    synchronized (this.a.getTreeLock()) {
      this.a.n.a().doLayout();
      this.a.n.a().validate();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bh/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */