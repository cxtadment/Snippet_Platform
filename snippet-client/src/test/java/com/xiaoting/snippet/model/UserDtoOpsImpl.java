package com.xiaoting.snippet.model;

import com.google.common.collect.Sets;
import com.xiaoting.client.IDtoOperations;
import com.xiaoting.snippet.persistence.model.Role;
import com.xiaoting.snippet.web.dto.UserDto;
import org.springframework.stereotype.Component;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

@Component
public final class UserDtoOpsImpl implements IDtoOperations<UserDto> {

    public UserDtoOpsImpl() {
        super();
    }

    // API

    public final UserDto createNewEntity(final String name) {
        return new UserDto(name, randomAlphabetic(8), Sets.<Role> newHashSet());
    }

    // template method

    @Override
    public final UserDto createNewResource() {
        return new UserDto(randomAlphabetic(8), randomAlphabetic(8), Sets.<Role> newHashSet());
    }

    @Override
    public final void invalidate(final UserDto entity) {
        entity.setName(null);
    }

    @Override
    public final void change(final UserDto resource) {
        resource.setName(randomAlphabetic(8));
    }

}
