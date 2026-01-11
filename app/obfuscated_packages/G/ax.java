package G;

class ax extends Thread {
  o a = null;
  
  ax(an paraman, o paramo) {
    super("MSyncReadProcess");
    setDaemon(true);
    this.a = paramo;
  }
  
  public void run() {
    this.b.a(this.a);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/ax.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */