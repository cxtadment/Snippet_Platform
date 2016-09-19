package com.xiaoting.snippet.persistence.dao;

import com.xiaoting.common.interfaces.IByNameApi;
import com.xiaoting.snippet.persistence.model.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IPrivilegeJpaDao extends JpaRepository<Privilege, Long>,
        JpaSpecificationExecutor<Privilege>, IByNameApi<Privilege> {
    //
}
