package ao;

class aq implements Runnable {
  aq(ap paramap) {}
  
  public void run() {
    this.a.getParent().invalidate();
    this.a.getParent().doLayout();
    try {
      this.a.getParent().getParent().doLayout();
    } catch (Exception exception) {}
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/aq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */