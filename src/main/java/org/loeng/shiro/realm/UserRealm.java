package org.loeng.shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.realm.Realm;

public class UserRealm implements Realm {
    @Override
    public String getName() {
        return "a"; //realm name 为 “a”
    }

    @Override
    public boolean supports(AuthenticationToken authenticationToken) {
        return false;
    }

    //省略supports方法，具体请见源码
    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        return new SimpleAuthenticationInfo(
                "zhang", //身份 字符串类型
                "123",   //凭据
                getName() //Realm Name
        );
    }

    public void setUserService(String userService) {

    }
}