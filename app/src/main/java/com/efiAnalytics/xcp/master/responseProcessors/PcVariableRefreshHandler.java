package com.efiAnalytics.xcp.master.responseProcessors;

import G.F;
import G.R;
import G.T;
import G.m;
import bH.c;
import bN.BnInterfaceKilo;
import bN.BnInterfaceTango;
import bS.ExceptionInBsPackage;
import java.util.ArrayList;
import java.util.List;

public class PcVariableRefreshHandler {
  ExceptionInBsPackage a = null;
  
  final List b = new ArrayList();
  
  boolean c = true;
  
  public void a(F paramF, BnInterfaceKilo paramk, BnInterfaceTango paramt) {
    R r = T.a().c(paramF.u());
    if (r == null)
      throw new ExceptionInBsPackage("Invalid EcuConfiguration: " + paramF.u()); 
    if (paramt.a() != 252)
      throw new ExceptionInBsPackage("Invalid Service Request Packet: " + paramt.toString()); 
    byte[] arrayOfByte = paramt.c();
    if (c.a(arrayOfByte[0]) != 227)
      throw new ExceptionInBsPackage("Invalid packet for Refresh PC Var: " + paramt.toString()); 
    if (arrayOfByte.length < 2)
      throw new ExceptionInBsPackage("COMMAND Required: " + paramt.toString()); 
    int i = c.a(arrayOfByte[1]);
    if (i == bU.g.b) {
      a(r);
    } else if (i == bU.g.a) {
      byte[] arrayOfByte1 = new byte[arrayOfByte.length - 2];
      String str = new String(arrayOfByte1);
      if (str.trim().isEmpty())
        throw new ExceptionInBsPackage("PcVariableName Required when not read all: " + paramt.toString()); 
      a(r, str);
    } else {
      throw new ExceptionInBsPackage("Invalid COMMAND: " + paramt.toString());
    } 
  }
  
  private void a(R paramR) {
    for (i i1 : this.b) {
      if (i.a(i1) == null) {
        a().a();
        return;
      } 
    } 
    synchronized (this.b) {
      this.b.clear();
    } 
    i i = new i(this, paramR);
    a().a(i);
  }
  
  private void a(R paramR, String paramString) {
    for (i i1 : this.b) {
      if (i1.a().equals(paramR) && (i1.b() == null || i1.b().equals(paramString))) {
        a().a();
        return;
      } 
    } 
    i i = new i(this, paramR, paramString);
    a().a(i);
  }
  
  private ExceptionInBsPackage a() {
    if (this.a == null) {
      this.a = new ExceptionInBsPackage(this);
      this.a.start();
    } 
    return this.a;
  }
  
  private void b(R paramR) {
    m m = m.a(paramR.O());
    paramR.C().b(m);
  }
  
  private void b(R paramR, String paramString) {
    m m = m.a(paramR.O(), paramString);
    paramR.C().b(m);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/xcp/master/responseProcessors/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */