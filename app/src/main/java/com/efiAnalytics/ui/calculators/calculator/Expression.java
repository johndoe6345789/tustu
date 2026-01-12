package com.efiAnalytics.ui.calculators.calculator;

import java.util.OptionalDouble;

class Expression {
  private double a;

  private int b;

  private Operator c = null;

  private double a(Operator paramOperator, double paramDouble) {
    if (paramOperator == Operator.a) {
      this.a = this.c.a(this.a, paramDouble);
      this.b = 0;
    } else {
      this.b++;
      this.a = (this.b > 1) ? this.c.a(this.a, paramDouble) : paramDouble;
      this.c = paramOperator;
    }
    return this.a;
  }

  double a(Operator paramOperator, OptionalDouble paramOptionalDouble) {
    return a(paramOperator, paramOptionalDouble.orElse(this.a));
  }

  void a() {
    this.a = 0.0D;
    this.b = 0;
    this.c = null;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/calculators/calculator/Expression.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
