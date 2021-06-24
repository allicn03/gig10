package org.perscholas.gig10.services;

import org.perscholas.gig10.Repositories.BudgetRepository;
import org.perscholas.gig10.models.Budget;
import org.perscholas.gig10.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@Service
public class BudgetService
{
    @Autowired
    private BudgetRepository budgetRepository;

    public TreeSet<Budget> getBudgets (@AuthenticationPrincipal User user)
    {
        Set<User> users = new HashSet<>();
        users.add(user);

        return budgetRepository.findAllByUsersIn(users);
    }
}