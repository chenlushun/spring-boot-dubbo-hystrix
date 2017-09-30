package com.alex.spring.boot.dubbo.starter;

import com.alex.spring.boot.dubbo.provider.UserManger;
import com.alibaba.dubbo.config.spring.ReferenceBean;
import org.mvnsearch.spring.boot.dubbo.DubboBasedAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ProviderProperties.class)
public class ProviderAutoconfiguration extends DubboBasedAutoConfiguration {

    private final ProviderProperties properties;

    @Autowired
    public ProviderAutoconfiguration(ProviderProperties properties) {
        this.properties = properties;
    }

    @Bean
    public ReferenceBean ytxUserManger() {
        ReferenceBean referenceBean = getConsumerBean(UserManger.class, properties.getVersion(), properties.getTimeout());

        referenceBean.setFilter("hystrix");
        // referenceBean.setProxy("hystrix");
        return referenceBean;
    }
}