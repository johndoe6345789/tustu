package bD;

class n extends Thread {
  n(i parami) {
    super("Delete");
    setDaemon(true);
  }
  
  public void run() {
    try {
      i.d(this.a);
    } finally {
      this.a.setEnabled(true);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bD/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */