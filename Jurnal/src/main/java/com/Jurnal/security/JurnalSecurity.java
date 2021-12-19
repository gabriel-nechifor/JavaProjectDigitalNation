package com.Jurnal.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.thymeleaf.extras.springsecurity5.dialect.SpringSecurityDialect;

@Configuration

@EnableWebSecurity
public class JurnalSecurity extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(final HttpSecurity http) throws Exception {

//		fix for spring security blocks h2 console
		http.headers().frameOptions().sameOrigin();
		http.csrf().disable();
		http.headers().frameOptions().disable();

		http.formLogin().loginPage("/login.html").defaultSuccessUrl("/new", true).failureUrl("/login-error.html")
				.permitAll().and().logout().logoutSuccessUrl("/").and().authorizeRequests().antMatchers("/admin/**")
				.authenticated().anyRequest().permitAll().and().exceptionHandling().accessDeniedPage("/403.html").and()
				.rememberMe();

	}

	@Override
	protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("gabriel").password("{noop}digitalnation").roles("ADMIN").and();
	}

	@Bean
	public SpringSecurityDialect springSecurityDialect() {
		return new SpringSecurityDialect();
	}

}