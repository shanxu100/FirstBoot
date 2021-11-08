package org.helloseries.springexercise.firstboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "custom.const")
public class OtherConfig {

    private int configSize = 20;

    private int configLength = 20;

    public int getConfigSize() {
        return configSize;
    }

    public void setConfigSize(int configSize) {
        this.configSize = configSize;
    }

    public int getConfigLength() {
        return configLength;
    }

    public void setConfigLength(int configLength) {
        this.configLength = configLength;
    }
}
