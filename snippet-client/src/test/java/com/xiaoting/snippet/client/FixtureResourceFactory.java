package com.xiaoting.snippet.client;

import com.google.common.collect.Sets;
import com.xiaoting.snippet.persistence.model.Principal;
import com.xiaoting.snippet.persistence.model.Privilege;
import com.xiaoting.snippet.persistence.model.Role;
import com.xiaoting.snippet.web.dto.UserDto;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

public class FixtureResourceFactory {

    private FixtureResourceFactory() {
        throw new AssertionError();
    }

    // user DTO

    public static UserDto createNewUser() {
        return createNewUser(randomAlphabetic(8), randomAlphabetic(8));
    }

    public static UserDto createNewUser(final String name, final String pass) {
        return new UserDto(name, pass, Sets.<Role> newHashSet());
    }

    // principal

    public static Principal createNewPrincipal() {
        return createNewPrincipal(randomAlphabetic(8), randomAlphabetic(8));
    }

    public static Principal createNewPrincipal(final String name, final String pass) {
        return new Principal(name, pass, Sets.<Role> newHashSet());
    }

    // role

    public static Role createNewRole() {
        return createNewRole(randomAlphabetic(8));
    }

    public static Role createNewRole(final String name) {
        return new Role(name, Sets.<Privilege> newHashSet());
    }

    // privilege

    public static Privilege createNewPrivilege() {
        return createNewPrivilege(randomAlphabetic(8));
    }

    public static Privilege createNewPrivilege(final String name) {
        return new Privilege(name);
    }

}

