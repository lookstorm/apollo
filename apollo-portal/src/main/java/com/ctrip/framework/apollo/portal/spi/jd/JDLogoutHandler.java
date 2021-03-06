package com.ctrip.framework.apollo.portal.spi.jd;

import com.ctrip.framework.apollo.portal.component.config.PortalConfig;
import com.ctrip.framework.apollo.portal.spi.LogoutHandler;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class JDLogoutHandler implements LogoutHandler {

  @Autowired
  private PortalConfig portalConfig;

  @Override
  public void logout(HttpServletRequest request, HttpServletResponse response) {
    //将session销毁
    HttpSession session = request.getSession(false);
    if (session != null) {
      session.invalidate();
    }

    try {
      response.sendRedirect("http://ssa.jd.com/sso/logout?ReturnUrl=http://jdapollo.jd.com");
    } catch (IOException e) {
      e.printStackTrace();
    }

//    Cookie cookie = new Cookie("memCacheAssertionID", null);
//    //将cookie的有效期设置为0，命令浏览器删除该cookie
//    cookie.setMaxAge(0);
//    cookie.setPath(request.getContextPath() + "/");
//    response.addCookie(cookie);
//
//    //重定向到SSO的logout地址
//    String casServerUrl = portalConfig.casServerUrlPrefix();
//    String serverName = portalConfig.portalServerName();
//
//    try {
//      response.sendRedirect(casServerUrl + "/logout?service=" + serverName);
//    } catch (IOException e) {
//      throw new RuntimeException(e);
//    }
  }
}
