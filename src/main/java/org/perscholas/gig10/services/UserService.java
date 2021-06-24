package org.perscholas.gig10.services;

import org.perscholas.gig10.Repositories.UserRepository;
import org.perscholas.gig10.models.Authority;
import org.perscholas.gig10.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user)
    {
        Authority authority = new Authority();
        authority.setAuthority("ROLE_USER");
        authority.setUser(user);

        Set<Authority> authorities = new HashSet<>();
        authorities.add(authority);

        user.setAuthorities(authorities);
        user = userRepository.save(user);

        return user;
    }
}
