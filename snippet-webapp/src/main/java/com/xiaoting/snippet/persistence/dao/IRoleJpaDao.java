package com.xiaoting.snippet.persistence.dao;

import com.xiaoting.common.interfaces.IByNameApi;
import com.xiaoting.snippet.persistence.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IRoleJpaDao extends JpaRepository<Role, Long>,
        JpaSpecificationExecutor<Role>, IByNameApi<Role> {
    //
}
