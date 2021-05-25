package org.acme.funqy.cloudevent;

import java.util.Collections;
import java.util.Map;

import org.eclipse.microprofile.config.spi.ConfigSource;

public class CustomConfigSource implements ConfigSource {

    @Override
    public Map<String, String> getProperties() {
        return Collections.emptyMap();
    }

    @Override
    public String getValue(String propertyName) {
        return null;
    }

    @Override
    public String getName() {
        return "Custom";
    }

}
