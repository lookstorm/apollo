package com.ctrip.framework.apollo.portal.spi.jd;

import com.alibaba.fastjson.JSONObject;
import com.ctrip.framework.apollo.portal.entity.bo.UserInfo;
import com.ctrip.framework.apollo.portal.spi.UserInfoHolder;
import com.jd.common.web.LoginContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ctrip内部实现的获取用户信息
 */
public class JDUserInfoHolder implements UserInfoHolder {

    private static final Logger logger = LoggerFactory.getLogger(JDUserInfoHolder.class);

    public JDUserInfoHolder() {
    }

    private String COMMON_ADMIN = "xn_bdp";

    @Override
    public UserInfo getUser() {
        try {

            LoginContext loginContext = LoginContext.getLoginContext();
            logger.info("loginContext==={}", JSONObject.toJSONString(loginContext));

            UserInfo userInfo = new UserInfo();

            if (null == loginContext) {
                userInfo.setUserId(COMMON_ADMIN);
            } else {
                userInfo.setUserId(loginContext.getPin());
            }

            return userInfo;
        } catch (Exception e) {
            throw new RuntimeException("get user info from assertion holder error", e);
        }
    }

}
