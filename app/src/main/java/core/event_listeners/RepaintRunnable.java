package ao;

class G implements Runnable {
  G(F paramF) {}

  public void run() {
    this.a.d = true;
    this.a.a.invalidate();
    this.a.a.repaint();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/G.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
