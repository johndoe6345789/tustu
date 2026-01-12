package com.efiAnalytics.ui.calculators.calculator;

import java.util.Map;
import java.util.Optional;
import java.util.function.DoubleBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

enum Operator {
  a(
      "=",
      (paramDouble1, paramDouble2) -> {
        throw new UnsupportedOperationException();
      }),
  b(
      "=",
      (paramDouble1, paramDouble2) -> {
        throw new UnsupportedOperationException();
      }),
  c(
      "=",
      (paramDouble1, paramDouble2) -> {
        throw new UnsupportedOperationException();
      }),
  d(
      "=",
      (paramDouble1, paramDouble2) -> {
        throw new UnsupportedOperationException();
      }),
  e(
      "=",
      (paramDouble1, paramDouble2) -> {
        throw new UnsupportedOperationException();
      });

  private final String f;

  private final DoubleBinaryOperator g;

  private static final Map h;

  Operator(String paramString1, DoubleBinaryOperator paramDoubleBinaryOperator) {
    this.f = paramString1;
    this.g = paramDoubleBinaryOperator;
  }

  public String toString() {
    return this.f;
  }

  public double a(double paramDouble1, double paramDouble2) {
    return this.g.applyAsDouble(paramDouble1, paramDouble2);
  }

  public static Optional a(String paramString) {
    return Optional.ofNullable((Operator) h.get(paramString));
  }

  static {
    h =
        (Map)
            Stream.<Operator>of(values())
                .collect(Collectors.toMap(Object::toString, paramOperator -> paramOperator));
  }

  static {
    b = new Operator("PLUS", 1, "+", (paramDouble1, paramDouble2) -> paramDouble1 + paramDouble2);
    c = new Operator("MINUS", 2, "-", (paramDouble1, paramDouble2) -> paramDouble1 - paramDouble2);
    d =
        new Operator(
            "MULTIPLY", 3, "x", (paramDouble1, paramDouble2) -> paramDouble1 * paramDouble2);
    e = new Operator("DIVIDE", 4, "/", (paramDouble1, paramDouble2) -> paramDouble1 / paramDouble2);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/calculators/calculator/Operator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
