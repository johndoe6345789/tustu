package ao;

class z implements Runnable {
  z(y paramy) {}
  
  public void run() {
    this.a.getParent().invalidate();
    this.a.getParent().validate();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */