package com.bigdocument.bigdocument.controller;

import com.bigdocument.bigdocument.domain.BigDocumentResponse;
import com.bigdocument.bigdocument.service.BigDocumentService;
import org.junit.jupiter.api.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api/big-document")
@Tag("big-document-controller")
public class BigDocumentController {

    private BigDocumentService bigDocumentService;

    @Autowired
    public BigDocumentController(BigDocumentService bigDocumentService) {
        this.bigDocumentService = bigDocumentService;
    }

    @GetMapping
    public BigDocumentResponse getBigDocument(){
        return bigDocumentService.getBigDocument();
    }
}
