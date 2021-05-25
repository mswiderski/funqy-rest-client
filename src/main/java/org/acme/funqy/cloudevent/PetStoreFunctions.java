package org.acme.funqy.cloudevent;

import javax.inject.Inject;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.quarkus.funqy.Funq;
import io.quarkus.funqy.knative.events.CloudEventMapping;

public class PetStoreFunctions {

    @Inject
    @RestClient
    UsersRemoteService usersRemoteService;

    @Funq
    @CloudEventMapping(trigger = "petstore.users")
    public User getUser(String username) {
        try {
            return usersRemoteService.get(username);
        } catch (Exception e) {

            return null;
        }
    }
}
