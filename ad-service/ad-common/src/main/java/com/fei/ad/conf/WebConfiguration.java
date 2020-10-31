package com.fei.ad.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    /**
     * Spring Boot底层通过HttpMessageConverters依靠Jackson库将Java实体类输出为JSON格式
     * @param converters
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>>
                                                       converters) {

        converters.clear();
        converters.add(new MappingJackson2HttpMessageConverter());
    }
}
