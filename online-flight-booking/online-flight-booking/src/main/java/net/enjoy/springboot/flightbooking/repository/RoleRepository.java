package net.enjoy.springboot.flightbooking.repository;

import net.enjoy.springboot.flightbooking.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}