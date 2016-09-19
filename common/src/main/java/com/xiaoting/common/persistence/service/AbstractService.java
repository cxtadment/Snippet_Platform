package com.xiaoting.common.persistence.service;

import com.xiaoting.common.persistence.model.INameableEntity;

public abstract class AbstractService<T extends INameableEntity> extends AbstractRawService<T>
        implements  IService<T> {

    public AbstractService() {
        super();
    }

}
