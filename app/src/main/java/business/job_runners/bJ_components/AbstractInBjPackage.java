package business.job_runners.bJ_components;

import java.util.Arrays;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression;

public AbstractInBjPackagebstract class AbstractInBjPackage implements c {
  RealMatrix a = null;
  
  protected abstract double[] a(double paramDouble);
  
  protected abstract boolean a();
  
  public void a(double[] paramArrayOfdouble1, double[] paramArrayOfdouble2) {
    if (paramArrayOfdouble2.length != paramArrayOfdouble1.length)
      throw new IllegalArgumentException(String.format("The numbers of y and x values must be equal (%d != %d)", new Object[] { Integer.valueOf(paramArrayOfdouble1.length), Integer.valueOf(paramArrayOfdouble2.length) })); 
    double[][] arrayOfDouble = new double[paramArrayOfdouble2.length][];
    byte b;
    for (b = 0; b < paramArrayOfdouble2.length; b++)
      arrayOfDouble[b] = a(paramArrayOfdouble2[b]); 
    if (a()) {
      paramArrayOfdouble1 = Arrays.copyOf(paramArrayOfdouble1, paramArrayOfdouble1.length);
      for (b = 0; b < paramArrayOfdouble2.length; b++)
        paramArrayOfdouble1[b] = Math.log(paramArrayOfdouble1[b]); 
    } 
    OLSMultipleLinearRegression oLSMultipleLinearRegression = new OLSMultipleLinearRegression();
    oLSMultipleLinearRegression.setNoIntercept(true);
    oLSMultipleLinearRegression.newSampleData(paramArrayOfdouble1, arrayOfDouble);
    this.a = MatrixUtils.createColumnRealMatrix(oLSMultipleLinearRegression.estimateRegressionParameters());
  }
  
  public double b(double paramDouble) {
    double d = this.a.preMultiply(a(paramDouble))[0];
    if (a())
      d = Math.exp(d); 
    return d;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bJ/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */