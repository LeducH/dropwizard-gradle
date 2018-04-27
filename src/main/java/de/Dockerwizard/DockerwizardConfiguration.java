package de.Dockerwizard;

import de.Dockerwizard.core.HelloWorldParameter;
import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;

public class DockerwizardConfiguration extends Configuration {

  @Valid
  @NotNull
  @JsonProperty
  private HelloWorldParameter helloWorldParameter;

  @JsonProperty
  public HelloWorldParameter getHelloWorldParameter() {
    return helloWorldParameter;
  }
}
