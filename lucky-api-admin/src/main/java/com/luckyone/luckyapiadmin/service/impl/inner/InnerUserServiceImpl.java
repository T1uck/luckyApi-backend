package com.luckyone.luckyapiadmin.service.impl.inner;

import com.luckyone.luckyapiadmin.service.UserService;
import com.luckyone.luckyapicommon.model.entity.User;
import com.luckyone.luckyapicommon.service.InnerUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * 用户服务实现
 *
 */
@DubboService
@Slf4j
public class InnerUserServiceImpl implements InnerUserService {

    @Resource
    private UserService userService;

    @Override
    public User getInvokeUser(String accessKey) {
        return userService.query()
                .eq("accessKey", accessKey)
                .one();
    }
}
