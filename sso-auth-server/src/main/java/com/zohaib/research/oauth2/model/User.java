package com.zohaib.research.oauth2.model;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of="id")
public class User implements UserDetails, Serializable{
	
    private Long id;
    
    private String username;
   
    private String password;
    
    private boolean accountExpired;
    
    private boolean accountLocked;
   
    private boolean credentialsExpired;
  
    private boolean enabled;
    
    private Collection<Authority> authorities;

	@Override
	public boolean isAccountNonExpired() {
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
