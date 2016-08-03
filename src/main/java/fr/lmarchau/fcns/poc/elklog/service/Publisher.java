package fr.lmarchau.fcns.poc.elklog.service;

import org.apache.log4j.Logger;

/**
 * Created by lmarchau on 03/08/2016.
 */
public class Publisher {

    private static final Logger LOG = Logger.getLogger(Publisher.class);

    public void publish(String message) {
        LOG.info("Message: " + message);
    }

    public void publish(int nb) {
        for (int i = 0; i < nb; ++i) {
            publish("loop " + i);
        }
    }
}
