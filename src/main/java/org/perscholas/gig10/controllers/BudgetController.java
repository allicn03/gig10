package org.perscholas.gig10.controllers;

import org.perscholas.gig10.models.Budget;
import org.perscholas.gig10.models.User;
import org.perscholas.gig10.services.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.TreeSet;

@Controller
public class BudgetController {
    @Autowired
    private BudgetService budgetService;
    @RequestMapping(value="/budgets", method= RequestMethod.GET)
    public String getBudget(@AuthenticationPrincipal User user, ModelMap model) {
        TreeSet<Budget> budgets = budgetService.getBudgets(user);
        model.put("budgets", budgets);
        return "budgets";

    }
}
