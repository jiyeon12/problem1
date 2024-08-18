package com.example.security

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.ldap.core.support.LdapContextSource

@Configuration
class LdapConfig {

    @Bean
    fun contextSource(): LdapContextSource {
        val contextSource = LdapContextSource()
        contextSource.url = "ldap://localhost:389"
        contextSource.userDn = "cn=admin,dc=example,dc=com"
        contextSource.password = "SuperSecretPassword123!"
        contextSource.afterPropertiesSet()
        return contextSource
    }
}
