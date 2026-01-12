package L;

public class HaversineDistanceCalculator {
  public double a(
      double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    char c = 'ᣣ';
    Double double_1 = a(Double.valueOf(paramDouble3 - paramDouble1));
    Double double_2 = a(Double.valueOf(paramDouble4 - paramDouble2));
    Double double_3 =
        Double.valueOf(
            Math.sin(double_1.doubleValue() / 2.0D) * Math.sin(double_1.doubleValue() / 2.0D)
                + Math.cos(a(Double.valueOf(paramDouble1)).doubleValue())
                    * Math.cos(a(Double.valueOf(paramDouble3)).doubleValue())
                    * Math.sin(double_2.doubleValue() / 2.0D)
                    * Math.sin(double_2.doubleValue() / 2.0D));
    Double double_4 =
        Double.valueOf(
            2.0D
                * Math.atan2(
                    Math.sqrt(double_3.doubleValue()), Math.sqrt(1.0D - double_3.doubleValue())));
    Double double_5 = Double.valueOf(6371.0D * double_4.doubleValue());
    return double_5.doubleValue();
  }

  private static Double a(Double paramDouble) {
    return Double.valueOf(paramDouble.doubleValue() * Math.PI / 180.0D);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
