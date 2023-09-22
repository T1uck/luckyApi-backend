package com.luckyone.luckyclientsdk;

import com.luckyone.luckyclientsdk.client.LuckyApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * lucky API 客户端配置类
 * @author csw
 */
@Data
@Configuration
@ConfigurationProperties("lucky.client")
@ComponentScan
public class LuckyApiClientConfig {

    private String accessKey;

    private String secretKey;

    /**
     * 此处方法取名无所谓的，不影响任何地方
     *
     * @return
     */
    @Bean
    public LuckyApiClient getApiClient() {
        return new LuckyApiClient(accessKey, secretKey);
    }
}
