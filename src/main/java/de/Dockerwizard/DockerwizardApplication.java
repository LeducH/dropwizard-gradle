package de.Dockerwizard;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.name.Names;
import de.Dockerwizard.core.HelloWorldParameter;
import de.Dockerwizard.health.TemplateHealthCheck;
import de.Dockerwizard.resources.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DockerwizardApplication extends Application<DockerwizardConfiguration> {

  public static void main(final String[] args) throws Exception {
    new DockerwizardApplication().run(args);
  }

  @Override
  public String getName() {
    return "Dockerwizard";
  }

  @Override
  public void initialize(final Bootstrap<DockerwizardConfiguration> bootstrap) {
    // TODO: application initialization
  }

  @Override
  public void run(final DockerwizardConfiguration configuration,
      final Environment environment) {
    // TODO: implement application
    Injector injector = Guice.createInjector(new AbstractModule() {
      @Override
      protected void configure() {
        bind(HelloWorldParameter.class)
            .annotatedWith(Names.named("helloWorldParameter"))
            .toInstance(configuration.getHelloWorldParameter());
      }
    });
    environment.jersey().register(injector.getInstance(HelloWorldResource.class));
    environment.healthChecks().register("template",
        injector.getInstance(TemplateHealthCheck.class));
  }

}
