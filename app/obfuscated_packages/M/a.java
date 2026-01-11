package M;

import linear_algebra.Matrix;

public class KalmanFilter {
  protected Matrix a;
  
  protected Matrix b;
  
  protected Matrix c;
  
  protected Matrix d;
  
  protected Matrix e;
  
  protected Matrix f;
  
  protected Matrix g;
  
  protected Matrix h;
  
  protected Matrix i;
  
  protected Matrix j;
  
  public static KalmanFilter create(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5) {
    KalmanFilter filter = new KalmanFilter();
    filter.i((new Matrix(new double[][] { { 0.0D, 0.0D, 0.0D, 0.0D } })).f());
    filter.e(Matrix.b(4, 4).a(0.0D));
    filter.c(new Matrix(new double[][] { { 1.0D, 0.0D, paramDouble3, 0.0D }, { 0.0D, 1.0D, 0.0D, paramDouble3 }, { 0.0D, 0.0D, 1.0D, 0.0D }, { 0.0D, 0.0D, 0.0D, 1.0D } }));
    filter.b((new Matrix(new double[][] { { 0.0D, 0.0D, 0.0D, 0.0D } })).f());
    filter.h(new Matrix(new double[][] { { 0.0D } }));
    filter.f((new Matrix(new double[][] { { 0.0D, 0.0D, 0.0D, 0.0D }, { 0.0D, 0.0D, 0.0D, 0.0D }, { 0.0D, 0.0D, 1.0D, 0.0D }, { 0.0D, 0.0D, 0.0D, 1.0D } })).a(Math.pow(paramDouble4, 2.0D)));
    filter.d(new Matrix(new double[][] { { 1.0D, 0.0D, 0.0D, 0.0D }, { 0.0D, 1.0D, 0.0D, 0.0D } }));
    filter.g(Matrix.b(2, 2).a(paramDouble5));
    return filter;
  }
  
  public void a() {
    this.b = this.c.c(this.a).a(this.d.c(this.e));
    this.j = this.c.c(this.i).c(this.c.f()).a(this.f);
  }
  
  public void a(Matrix paramb) {
    Matrix b1 = this.g.c(this.j).c(this.g.f()).a(this.h);
    Matrix b2 = this.j.c(this.g.f()).c(b1.g());
    this.a = this.b.a(b2.c(paramb.b(this.g.c(this.b))));
    Matrix b3 = Matrix.b(this.j.d(), this.j.e());
    this.i = b3.b(b2.c(this.g)).c(this.j);
  }
  
  public void b(Matrix paramb) {
    this.d = paramb;
  }
  
  public void c(Matrix paramb) {
    this.c = paramb;
  }
  
  public void d(Matrix paramb) {
    this.g = paramb;
  }
  
  public void e(Matrix paramb) {
    this.i = paramb;
  }
  
  public void f(Matrix paramb) {
    this.f = paramb;
  }
  
  public void g(Matrix paramb) {
    this.h = paramb;
  }
  
  public void h(Matrix paramb) {
    this.e = paramb;
  }
  
  public Matrix b() {
    return this.a;
  }
  
  public void i(Matrix paramb) {
    this.a = paramb;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/M/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */