package fr.jetoile.sample;

import fr.jetoile.sample.service.SimpleService;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/services")
public class SimpleApplication extends Application {
   private Set<Object> singletons = new HashSet<Object>();

   public SimpleApplication() {
      singletons.add(new SimpleService());
   }

   public Set<Object> getSingletons() {
      return singletons;
   }
}
