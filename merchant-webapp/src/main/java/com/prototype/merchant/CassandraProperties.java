package com.prototype.merchant;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by david.hong on 25/11/2015.
 */
@Component
@ConfigurationProperties(prefix="spring.data.cassandra")
public class CassandraProperties {

    public String getKeyspacename() {
        return keyspacename;
    }

    public void setKeyspacename(String keyspacename) {
        this.keyspacename = keyspacename;
    }

    public String getContactpoints() {
        return contactpoints;
    }

    public void setContactpoints(String contactpoints) {
        this.contactpoints = contactpoints;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    private String keyspacename;
    private String contactpoints;
    private String port;
}
