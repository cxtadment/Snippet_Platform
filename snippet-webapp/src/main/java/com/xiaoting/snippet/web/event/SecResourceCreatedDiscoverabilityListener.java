package com.xiaoting.snippet.web.event;

import com.xiaoting.common.web.listeners.ResourceCreatedDiscoverabilityListener;
import org.springframework.stereotype.Component;

@Component
class SecResourceCreatedDiscoverabilityListener extends ResourceCreatedDiscoverabilityListener {

    public SecResourceCreatedDiscoverabilityListener() {
        super();
    }

    //

    @Override
    protected final String getBase() {
        return "/";
    }

}
