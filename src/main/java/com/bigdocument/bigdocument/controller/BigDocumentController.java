package com.bigdocument.bigdocument.controller;

import org.junit.jupiter.api.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/big-document")
@Tag("big-document-controller")
public class BigDocumentController {

    @Autowired
    public BigDocumentController() {
    }

    @GetMapping
    public String getBigDocument(){
        return "Hello world";
    }
}
