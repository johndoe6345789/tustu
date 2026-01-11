package com.efiAnalytics.ui.calculators.calculator;

import java.util.function.BiConsumer;

enum Key {
  a("0", Calculator::a),
  b("1", Calculator::a),
  c("2", Calculator::a),
  d("3", Calculator::a),
  e("4", Calculator::a),
  f("5", Calculator::a),
  g("6", Calculator::a),
  h("7", Calculator::a),
  i("8", Calculator::a),
  j("9", Calculator::a),
  k("/", Calculator::c),
  l("x", Calculator::c),
  m("-", Calculator::c),
  n("=", Calculator::c),
  o("+", Calculator::c),
  p("M+", Calculator::e),
  q("M-", Calculator::e),
  r("%", Calculator::e),
  s(".", Calculator::d),
  t("C", Calculator::b);
  
  private String u;
  
  private BiConsumer v;
  
  Key(String paramString1, BiConsumer paramBiConsumer) {
    this.u = paramString1;
    this.v = paramBiConsumer;
  }
  
  public String toString() {
    return this.u;
  }
  
  public BiConsumer a() {
    return this.v;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/calculators/calculator/Key.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */