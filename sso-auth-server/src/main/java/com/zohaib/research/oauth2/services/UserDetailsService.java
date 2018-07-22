package com.zohaib.research.oauth2.services;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		
		
		return null;
	}
	
}
