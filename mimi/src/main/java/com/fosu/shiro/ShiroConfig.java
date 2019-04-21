package com.fosu.shiro;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShiroConfig {

	/*
	 *  Create ShiroFilterFactoryBean
	 */
	@Bean
	public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager) {
		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
		
		//设置安全管理器
		shiroFilterFactoryBean.setSecurityManager(securityManager);
		
		//添加Shiro内置过滤器
		/*
		 * 添加Shiro内置过滤器,可以实现权限相关拦截器
		 * 常用过滤器:
		 *    anon:无需认证（登录）可以访问
		 *    authc：必须认证才可以访问
		 *    user：如果使用rememberMe功能可以直接访问
		 *    perms：该资源必须得到资源权限才可以访问
		 *    role:该资源必须得到角色权限才可以访问
		 */
		
		Map<String,String> filterMap = new LinkedHashMap<String,String>();
		
		//filterMap.put("/add", "authc");
		//filterMap.put("/update", "authc");
		
		/*filterMap.put("/testThymeleaf", "anon");
		filterMap.put("/me/*", "authc");*/
		
		//授权拦截
		filterMap.put("/add", "perms[user:add]");
		//filterMap.put("/*", "authc");
		
		//修改调整登录页面
		//shiroFilterFactoryBean.setLoginUrl("loginme");
		
		//设置未授权提示页面
		shiroFilterFactoryBean.setUnauthorizedUrl("/fosu/Auth/unAuth");
		shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
		
		return shiroFilterFactoryBean;
	}
	
	/*
	 * Create DefaultWebSercurityManager
	 */
	@Bean(name="securityManager")
	public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm) {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		
		//关联realm
		securityManager.setRealm(userRealm);
		return securityManager;
	}
	
	/*
	 *  Create Realm
	 * 
	 */
	@Bean(name="userRealm")
	public UserRealm getRealm(HashedCredentialsMatcher matcher) {
		UserRealm userRealm = new UserRealm();
		userRealm.setCredentialsMatcher(matcher);
		return  userRealm;
	}
	

	/*
	 * 密码
	 * default websecurityManager
	 * 
	 * 设置SecurityManager时 注意包
	 * java.lang.SecurityManager 不对
	 *   是 org.apache.shiro.mgt.SecurityManager
	 *   
	 *  securityManager(HashedCredentialsMatcher matcher)将加密规则属性设置到自定义的userRealm中，
	 *    并将这个Realm加载到SecurityManager中。
	 */
	@Bean
    public SecurityManager securityManager(@Qualifier("hashedCredentialsMatcher") HashedCredentialsMatcher matcher){
        DefaultWebSecurityManager securityManager =  new DefaultWebSecurityManager();
        securityManager.setRealm(getRealm(matcher));
        return securityManager;
    }

	/**
     * 密码匹配凭证管理器
     *
     * @return
     * 
     */
    @Bean(name = "hashedCredentialsMatcher")
    public HashedCredentialsMatcher hashedCredentialsMatcher() {
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        // 采用MD5方式加密
        hashedCredentialsMatcher.setHashAlgorithmName("MD5");
        // 设置加密次数
        hashedCredentialsMatcher.setHashIterations(5);
        return hashedCredentialsMatcher;
    }

}
