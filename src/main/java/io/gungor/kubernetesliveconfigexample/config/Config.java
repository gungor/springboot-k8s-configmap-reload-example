package io.gungor.kubernetesliveconfigexample.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "bean" )
@Data
public class Config {

    private String testvalue;

}
