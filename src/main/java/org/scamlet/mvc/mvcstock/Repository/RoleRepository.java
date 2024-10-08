package org.scamlet.mvc.mvcstock.Repository;

import org.scamlet.mvc.mvcstock.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(String role);
}
