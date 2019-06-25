package com.ctrip.framework.apollo.portal.spi.jd;

import com.ctrip.framework.apollo.portal.entity.bo.UserInfo;
import com.ctrip.framework.apollo.portal.spi.UserService;
import com.google.common.collect.Lists;
import com.jd.bdp.urm2.api.dto.JSFResultDTO;
import com.jd.bdp.urm2.api.user.UrmUserInterface;
import com.jd.bdp.urm2.domain.user.TblBaseUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author lepdou 2017-03-10
 */
public class JDUserService implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(JDUserService.class);

    @Autowired
    private UrmUserInterface urmUserInterface;

    @Override
    public List<UserInfo> searchUsers(String keyword, int offset, int limit) {
        List<UserInfo> result = Lists.newArrayList();
        logger.info("===searchUsers===");

        TblBaseUser tblBaseUser = new TblBaseUser();
        tblBaseUser.setSearchValue(keyword);
        tblBaseUser.setLimit(limit);
        tblBaseUser.setStart(offset);
        tblBaseUser.setOperator("xn_bdp");

        JSFResultDTO<TblBaseUser> jsfResultDTO = urmUserInterface.listByKeywords("bdp.jd.com", "RQLMPXULF3EG23CPZL3U257B7Y", System.currentTimeMillis(), tblBaseUser);
        List<TblBaseUser> dataList = jsfResultDTO.getList();
        if (null != dataList) {
            for (TblBaseUser tmp : dataList) {
                UserInfo userInfo = new UserInfo();
                userInfo.setName(tmp.getName());
                userInfo.setUserId(tmp.getErp());
                userInfo.setEmail(tmp.getEmail());

                result.add(userInfo);
            }
        }


        return result;
    }

    @Override
    public UserInfo findByUserId(String userId) {
        logger.info("===findByUserId===");
        TblBaseUser tblBaseUser = new TblBaseUser();
        tblBaseUser.setOperator("xn_bdp");
        tblBaseUser.setLoginName(userId);
        JSFResultDTO<TblBaseUser> resultDTO = urmUserInterface.get("bdp.jd.com", "RQLMPXULF3EG23CPZL3U257B7Y", System.currentTimeMillis(), tblBaseUser);

        TblBaseUser tmp = resultDTO.getObj();

        UserInfo userInfo = new UserInfo();

        if (null != tmp) {
            userInfo.setName(tmp.getName());
            userInfo.setUserId(tmp.getErp());
            userInfo.setEmail(tmp.getEmail());
        }

        return userInfo;
    }

    @Override
    public List<UserInfo> findByUserIds(List<String> userIds) {
        logger.info("===findByUserIds===");
        List<UserInfo> result = Lists.newArrayList();
        for (String id : userIds) {
            TblBaseUser tblBaseUser = new TblBaseUser();
            tblBaseUser.setOperator("xn_bdp");
            tblBaseUser.setLoginName(id);
            JSFResultDTO<TblBaseUser> resultDTO = urmUserInterface.get("bdp.jd.com", "RQLMPXULF3EG23CPZL3U257B7Y", System.currentTimeMillis(), tblBaseUser);

            TblBaseUser tmp = resultDTO.getObj();

            UserInfo userInfo = new UserInfo();

            if (null != tmp) {
                userInfo.setName(tmp.getName());
                userInfo.setUserId(tmp.getErp());
                userInfo.setEmail(tmp.getEmail());

                result.add(userInfo);
            }
        }
        return result;
    }


}
