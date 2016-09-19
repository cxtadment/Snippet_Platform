package com.xiaoting.snippet.client.marshall;

import com.xiaoting.client.marshall.IMarshaller;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import static com.xiaoting.common.spring.util.Profiles.DEPLOYED;

@Component
@Profile(DEPLOYED)
public class MarshallerFactory implements FactoryBean<IMarshaller> {

    public MarshallerFactory() {
        super();
    }

    // API

    @Override
    public IMarshaller getObject() {
        return new ProdJacksonMarshaller();
    }

    @Override
    public Class<IMarshaller> getObjectType() {
        return IMarshaller.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

}

