package com.company.security;

import com.company.entity.Login;
import com.company.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthencationProvider implements AuthenticationProvider {
    @Autowired
    private LoginRepository dao;

    @Override
    public Authentication authenticate(Authentication authentication)
            throws AuthenticationException {
        String userlogin = authentication.getName();
        String password = authentication.getCredentials().toString();
        //получаем пользователя
        Login login =  dao.findByLogin(userlogin);
        //смотрим, найден ли пользователь в базе

        if (login == null) {
            throw new BadCredentialsException("Unknown user "+userlogin);
        }
        if (!password.equals(login.getPassword())) {
            throw new BadCredentialsException("Bad password");
        }
        UserDetails principal = org.springframework.security.core.userdetails.User.builder()
                .username(login.getLogin())
                .password(login.getPassword())
                .roles(login.getRole().getNameRole())
                .build();
        return new UsernamePasswordAuthenticationToken(
                principal, password, principal.getAuthorities());

    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}