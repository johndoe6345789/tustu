package ao;

class cb {
  String a = "";
  
  String b = "";
  
  String c = "";
  
  int d = 0;
  
  Object e = null;
  
  public void cb(ca paramca, String paramString1, String paramString2, String paramString3, Object paramObject, int paramInt) {
    this.b = paramString1;
    this.a = paramString2;
    this.e = paramObject;
    this.c = paramString3;
    this.d = paramInt;
  }
  
  public Object a() {
    return this.e;
  }
  
  public String b() {
    return this.b;
  }
  
  public String c() {
    return this.c;
  }
  
  public String toString() {
    return "[name=" + this.b + ", page=" + this.a + ", units=" + this.c + ", data=" + this.e + "] ";
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/cb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */