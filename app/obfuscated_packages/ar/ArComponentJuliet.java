package ar;

class ArComponentJuliet implements e {
  j(g paramg) {}
  
  public boolean a(String paramString1, String paramString2) {
    return true;
  }
  
  public void a(c paramc) {
    int i = this.a.a(paramc.b());
    if (i >= 0)
      this.a.setSelectedIndex(i); 
  }
  
  public void b(c paramc) {
    int i = this.a.a(paramc.b());
    if (i > 0)
      this.a.setIconAt(i, this.a.b); 
    this.a.setToolTipTextAt(i, paramc.a());
  }
  
  public void c(c paramc) {
    int i = this.a.a(paramc.b());
    if (i >= 0)
      this.a.setIconAt(i, null); 
    this.a.setToolTipTextAt(i, paramc.a());
  }
  
  public void a(String paramString) {
    int i = this.a.d ? (this.a.getTabCount() - 1) : (this.a.getTabCount() - 2);
    c c = f.a().c(paramString);
    this.a.insertTab(paramString, null, g.b(this.a), c.a(), i);
    this.a.setSelectedIndex(i);
  }
  
  public void b(String paramString) {
    int i = this.a.a(paramString);
    if (i > 0)
      this.a.remove(i); 
  }
  
  public void c(String paramString) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ar/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */