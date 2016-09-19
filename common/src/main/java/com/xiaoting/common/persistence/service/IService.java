package com.xiaoting.common.persistence.service;

import com.xiaoting.common.interfaces.IByNameApi;
import com.xiaoting.common.persistence.model.INameableEntity;

public interface IService<T extends INameableEntity> extends IRawService<T>, IByNameApi<T> {

    //

}
