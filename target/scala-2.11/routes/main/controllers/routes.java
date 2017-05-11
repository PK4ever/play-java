
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paulk4ever/Desktop/play-java/conf/routes
// @DATE:Fri Apr 28 01:42:17 EDT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseEventFullController EventFullController = new controllers.ReverseEventFullController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseRestfullController RestfullController = new controllers.ReverseRestfullController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseEventFullController EventFullController = new controllers.javascript.ReverseEventFullController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseRestfullController RestfullController = new controllers.javascript.ReverseRestfullController(RoutesPrefix.byNamePrefix());
  }

}
