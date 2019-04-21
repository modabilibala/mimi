package com.fosu.shiro;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.fosu.serviceInf.student.StudentInf;
import com.fosu.vo.student.StudentLogin;


public class UserRealm  extends AuthorizingRealm{

	@Autowired
	private StudentInf studentService;
	
	
	
	private SimpleAuthenticationInfo info = null;
	/*
	 * 执行授权逻辑
	 * @see org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		System.out.println("执行授权逻辑");
		return null;
	}

	/*
	 * 执行认证逻辑
	 * @see org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		System.out.println("执行认证逻辑");
		
		//假设数据库用户名 & 密码
		/*String name = "miki";
		String password = "666";*/
		
		//编写shiro判断逻辑，判断用户名和密码
		
		//1.判断用户名
		// 将token装换成UsernamePasswordToken
		UsernamePasswordToken upToken  = (UsernamePasswordToken) token;;
		
		//获取用户名
		String username = upToken.getUsername();
		
		//查询数据库能否查询
		Map<String,String> student = new HashMap();
		//System.out.println(username);
		student.put("student_username", username);
		StudentLogin user = studentService.findStudentLogin(student);
		
		//System.out.println(user);
		if(user != null) {
			//查询成功
			Object principal = user.getStudent_username();
			Object credentials = user.getStudent_password();
			
			//取盐值 用户名
			ByteSource salt = ByteSource.Util.bytes(username);
			String realmName = this.getName();
			
			//将账户名，密码，盐值，realmName实例化到SimpleAuthenticationInfo
			//交给Shiro管理
			info = new SimpleAuthenticationInfo(principal,credentials,salt,realmName);
		}
		else{
			//用户名不存在
			//return null;//shrio底层抛出UnknownAccountException
			throw new AuthenticationException();
		}
		return info;
		
	}

}
/*
 * 1.这里我只做了身份认证。新建一个ShiroRealm类继承AuthorizingRealm类，实现doGetAuthenticationInfo(AuthenticationToken authenticationToken)方法。

2.这个方法主要就是用于获取数据库中的账户信息，以便用于和用户登录时从前台传过来的账户密码进行对比。

3.根据用户名到用户表中查询账户名密码，并设置好盐值。这里的盐值要和ShiroConfig中的盐值规则一样。将账户名，密码，盐值，realmName实例化到SimpleAuthenticationInfo中交给Shiro来管理。

4.如果账户不存在，则抛出AuthenticationException异常。

5.这样，每次用户进行login操作时，就会调用doGetAuthenticationInfo方法。Shiro就自动帮我们校验了账户密码是否匹配。
*/