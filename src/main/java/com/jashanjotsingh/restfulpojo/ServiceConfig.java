package com.jashanjotsingh.restfulpojo;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.media.multipart.MultiPart;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author jashanjotsingh
 * Application vs ResourceConfig
 * https://stackoverflow.com/questions/45625925/what-exactly-is-the-resourceconfig-class-in-jersey-2
 */
// domain/context/root
@ApplicationPath("api/v1/SOEN487")
public class ServiceConfig extends ResourceConfig {

    public ServiceConfig() {
        packages("com.jashanjotsingh.restfulpojo.resources");
        register(MultiPart.class);
    }
}