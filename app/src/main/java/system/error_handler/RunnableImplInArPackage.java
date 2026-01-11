package ar;

class RunnableImplInArPackage implements Runnable {
  RunnableImplInArPackage(g paramg) {}
  
  public void run() {
    if (this.a.d && this.a.getSelectedIndex() == this.a.getTabCount() - 1) {
      g.a(this.a);
    } else if (f.a().g() == null || !f.a().g().equals(this.a.getTitleAt(this.a.getSelectedIndex()))) {
      if (f.a().a(this.a.getTitleAt(this.a.getSelectedIndex()))) {
        this.a.a = this.a.getSelectedIndex();
      } else if (this.a.a >= 0) {
        this.a.setSelectedIndex(this.a.a);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ar/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */