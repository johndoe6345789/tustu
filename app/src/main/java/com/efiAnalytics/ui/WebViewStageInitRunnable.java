package com.efiAnalytics.ui;

import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

class WebViewStageInitRunnable implements Runnable {
  WebViewStageInitRunnable(eD parameD) {}

  public void run() {
    eD.a(this.a, new Stage());
    eD.c(this.a).setTitle("Hello Java FX");
    eD.c(this.a).setResizable(true);
    Group group = new Group();
    Scene scene = new Scene((Parent) group, 80.0D, 20.0D);
    eD.c(this.a).setScene(scene);
    eD.a(this.a, new WebView());
    eD.a(this.a, eD.d(this.a).getEngine());
    eD.a(this.a).load("https://www.efianalytics.com/register/browseProducts.jsp");
    ObservableList observableList = group.getChildren();
    observableList.add(eD.d(this.a));
    eD.e(this.a).setScene(scene);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/eI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
