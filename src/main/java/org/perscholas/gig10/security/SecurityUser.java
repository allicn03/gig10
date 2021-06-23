package org.perscholas.gig10.security;

import org.perscholas.gig10.models.Authority;
import org.perscholas.gig10.models.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import java.util.Set;

public class SecurityUser extends User implements UserDetails {
    private static final long serialVersionUID = -6953885846152904604L;
    public SecurityUser () {

    }
    public SecurityUser (User user) {
        this.setAuthorities(user.getAuthorities());
        this.setBudgets(user.getBudgets());
        this.setId(user.getId());
        this.setUsername(user.getUsername());
        this.setPassword(user.getPassword());
    }

    @Override
    public Set<Authority> getAuthorities() {
        return super.getAuthorities();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
