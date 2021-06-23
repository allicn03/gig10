package org.perscholas.gig10.Repositories;

import org.perscholas.gig10.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
