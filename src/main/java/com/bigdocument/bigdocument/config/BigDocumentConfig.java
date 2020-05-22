package com.bigdocument.bigdocument.config;

import com.bigdocument.bigdocument.service.BigDocumentService;
import com.bigdocument.bigdocument.service.BigDocumentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BigDocumentConfig {

    @Bean
    public BigDocumentService bigDocumentService(){
        return new BigDocumentServiceImpl();
    }
}
