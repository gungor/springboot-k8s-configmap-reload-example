package io.gungor.kubernetesliveconfigexample.controller;

import io.gungor.kubernetesliveconfigexample.config.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LiveConfigTestController {

    private static Logger log = LoggerFactory.getLogger(LiveConfigTestController.class);

    private Config config;

    public LiveConfigTestController(Config config) {
        this.config = config;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/liveconfigtest")
    public String getPropertyValue(){
        log.info("bean.testvalue:" + config.getTestvalue());
        return config.getTestvalue();
    }

}
