package com.xiaoting.snippet.persistence.dao;

import com.xiaoting.common.interfaces.IByNameApi;
import com.xiaoting.snippet.persistence.model.Principal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IPrincipalJpaDao extends JpaRepository<Principal, Long>,
        JpaSpecificationExecutor<Principal>, IByNameApi<Principal> {
    //
}
