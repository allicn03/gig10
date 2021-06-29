package org.perscholas.gig10.Repositories;

import java.util.Set;
import java.util.TreeSet;

import org.perscholas.gig10.models.Budget;
import org.perscholas.gig10.models.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;



public interface BudgetRepository extends JpaRepository<Budget, Long>
{
    @EntityGraph(value = "Budget.users", type = EntityGraphType.LOAD)
    TreeSet<Budget> findByUsersIn(Set<User> users);
}
