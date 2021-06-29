package org.perscholas.gig10.services;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.perscholas.gig10.Repositories.BudgetRepository;
import org.perscholas.gig10.models.Budget;
import org.perscholas.gig10.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Service;


@Service
public class BudgetService
{
    @Autowired
    private BudgetRepository budgetRepo;

    public TreeSet<Budget> getBudgets (@AuthenticationPrincipal User user)
    {
        Set<User> users = new HashSet<>();
        users.add(user);

        return budgetRepo.findByUsersIn(users);
    }

    public Budget saveBudget (Budget budget)
    {
        return budgetRepo.save(budget);
    }
}
