package com.xiaoting.snippet.model;

import com.xiaoting.client.IDtoOperations;
import com.xiaoting.snippet.client.FixtureResourceFactory;
import com.xiaoting.snippet.persistence.model.Principal;
import org.springframework.stereotype.Component;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

@Component
public final class PrincipalDtoOpsImpl implements IDtoOperations<Principal> {

    public PrincipalDtoOpsImpl() {
        super();
    }

    // API

    // template method

    @Override
    public final Principal createNewResource() {
        return FixtureResourceFactory.createNewPrincipal();
    }

    @Override
    public final void invalidate(final Principal entity) {
        entity.setName(null);
    }

    @Override
    public final void change(final Principal resource) {
        resource.setName(randomAlphabetic(8));
    }

}
