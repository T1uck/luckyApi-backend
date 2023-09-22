package com.luckyone.luckyapiadmin.service.impl.inner;

import com.luckyone.luckyapiadmin.service.InterfaceInfoService;
import com.luckyone.luckyapicommon.model.entity.InterfaceInfo;
import com.luckyone.luckyapicommon.service.InnerInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
* @author csw
*/
@DubboService
public class InnerInterfaceInfoServiceImpl implements InnerInterfaceInfoService {

    @Resource
    private InterfaceInfoService interfaceInfoService;

    @Override
    public InterfaceInfo getInterfaceInfo(String path, String method) {
        return interfaceInfoService.query()
                .eq("url", path)
                .eq("method", method)
                .one();
    }
}




