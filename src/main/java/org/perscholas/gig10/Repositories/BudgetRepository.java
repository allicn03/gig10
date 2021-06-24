package org.perscholas.gig10.Repositories;

import org.perscholas.gig10.models.Budget;
import org.perscholas.gig10.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;
import java.util.TreeSet;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
    TreeSet<Budget> findAllByUsersIn(Set<User> users);
}
