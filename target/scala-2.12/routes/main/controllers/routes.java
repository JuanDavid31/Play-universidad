
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/JuanDavid/Desktop/Play Java/play-java-starter-example/conf/routes
// @DATE:Thu Sep 28 21:58:52 COT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseSuperController SuperController = new controllers.ReverseSuperController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseSuperController SuperController = new controllers.javascript.ReverseSuperController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}