package org.posiedon.wh;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/7/14 23:41
 */
@EnableWebSecurity
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        super.configure(http);
        http.csrf().disable();
        //关闭csrf
//        http.csrf().disable();
        //开启认证，URL格式登陆必须时httpBasic
        http.authorizeRequests().anyRequest().authenticated().and().httpBasic();

    }
}
