package com.nacos.test.naocosconsumer.naocosconsumer.remote;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.stream.Collectors;

@FeignClient("nacos-provider")
public interface ProviderFeign {

    @GetMapping("/invoke")
    String invoke();


}
