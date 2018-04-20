package com.prashant.SpringSecurityWithJpa.repository;

import com.prashant.SpringSecurityWithJpa.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {

}
