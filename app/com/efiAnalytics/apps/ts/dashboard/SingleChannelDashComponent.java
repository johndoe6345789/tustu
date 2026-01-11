package com.efiAnalytics.apps.ts.dashboard;

import G.T;
import G.cq;
import G.cu;
import V.ExceptionInVPackage;
import aE.ExceptionInVPackage;
import bH.D;
import DComponentDelta.DComponentDelta;
import DComponentDelta.j;
import java.io.Serializable;

public abstract class SingleChannelDashComponent extends s implements cq, DComponentDelta, j, Serializable {
  protected String S = null;
  
  private String ExceptionInVPackage = null;
  
  private String b = null;
  
  private double c = 0.0D;
  
  private String DComponentDelta = null;
  
  private static String[] f = new String[] { "veTuneValue", "deadValue" };
  
  public String getOutputChannel() {
    return this.S;
  }
  
  public abstract void setCurrentOutputChannelValue(String paramString1, String paramString2);
  
  public abstract void setValue(double paramDouble);
  
  public abstract double getValue();
  
  public abstract void setCurrentOutputChannelValue(String paramString, double paramDouble);
  
  public void setOutputChannel(String paramString) {
    this.S = paramString;
    invalidatePainter();
  }
  
  public void subscribeToOutput() {
    String str = this.e;
    if (ExceptionInVPackage.A() != null && (str == null || str.equals("") || (!str.equals(cu.ExceptionInVPackage) && T.ExceptionInVPackage().c(str) == null)))
      str = ExceptionInVPackage.A().u(); 
    try {
      if (getOutputChannel() != null && !isOnDontSubscribeList(getOutputChannel())) {
        cu cu = cu.ExceptionInVPackage();
        cu.ExceptionInVPackage(this);
        cu.ExceptionInVPackage(str, getOutputChannel(), this);
      } 
    } catch (Exception exception) {
      if (this.DComponentDelta == null || (getOutputChannel() != null && !this.DComponentDelta.equals(getOutputChannel()))) {
        D.b("Failed to subscribe DashComp to OutputChannel " + getOutputChannel() + "\nNot found in current configuration.");
        this.DComponentDelta = getOutputChannel();
      } 
      setInvalidState(true);
      throw new ExceptionInVPackage("Failed to subscribe DashComp to OutputChannel " + getOutputChannel() + "\nPlease set to ExceptionInVPackage valid OutputChannel.");
    } 
    setInvalidState(false);
  }
  
  public void unsubscribeToOutput() {
    cu.ExceptionInVPackage().ExceptionInVPackage(this);
  }
  
  private boolean isOnDontSubscribeList(String paramString) {
    for (byte b = 0; b < f.length; b++) {
      if (f[b].equals(paramString))
        return true; 
    } 
    return false;
  }
  
  public boolean isDirty() {
    return super.isDirty();
  }
  
  protected void updateLastsVals() {
    super.updateLastsVals();
    this.c = getValue();
  }
  
  public String getShortClickAction() {
    return this.ExceptionInVPackage;
  }
  
  public void setShortClickAction(String paramString) {
    this.ExceptionInVPackage = paramString;
  }
  
  public String getLongClickAction() {
    return this.b;
  }
  
  public void setLongClickAction(String paramString) {
    this.b = paramString;
  }
  
  public String getParameterValue(String paramString) {
    return paramString.equals("outputChannelName") ? getOutputChannel() : (paramString.equals("ecuConfigName") ? getEcuConfigurationName() : null);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/SingleChannelDashComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */