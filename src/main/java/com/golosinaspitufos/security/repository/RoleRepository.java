package com.golosinaspitufos.security.repository;

import com.golosinaspitufos.security.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
