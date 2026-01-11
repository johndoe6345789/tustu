package bl;

import G.cq;
import com.efiAnalytics.plugin.ecu.OutputChannelClient;

class b implements cq {
  private OutputChannelClient b = null;
  
  b(a parama, OutputChannelClient paramOutputChannelClient) {
    this.b = paramOutputChannelClient;
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    a().setCurrentOutputChannelValue(paramString, paramDouble);
  }
  
  public OutputChannelClient a() {
    return this.b;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bl/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */