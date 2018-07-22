package com.zohaib.research.oauth2.model;

import javax.persistence.Entity;

import org.springframework.security.core.GrantedAuthority;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@EqualsAndHashCode(of="id")
public class Authority implements GrantedAuthority{

	private Long id;
	private String name;
	
	
	@Override
	public String getAuthority() {
		return getName();
	}

	
}
