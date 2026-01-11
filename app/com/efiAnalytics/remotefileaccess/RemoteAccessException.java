package com.efiAnalytics.remotefileaccess;

public class RemoteAccessException extends Exception {
  private boolean terminalToBatch = false;
  
  public RemoteAccessException(String paramString) {
    super(paramString);
  }
  
  public boolean isTerminalToBatch() {
    return this.terminalToBatch;
  }
  
  public void setTerminalToBatch(boolean paramBoolean) {
    this.terminalToBatch = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/remotefileaccess/RemoteAccessException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */