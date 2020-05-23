package com.bigdocument.bigdocument.controller;

import com.bigdocument.bigdocument.domain.BigDocumentResponse;
import com.bigdocument.bigdocument.domain.PageRequest;
import com.bigdocument.bigdocument.service.BigDocumentService;
import org.junit.jupiter.api.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @PostMapping()
    public List<BigDocumentResponse> getPagedDocumentList(@RequestBody PageRequest request) {
        return bigDocumentService.getPagedDocumentList(request);
    }

    @GetMapping()
    public BigDocumentResponse getBigDocument() {
        return bigDocumentService.getBigDocument();
    }

    @GetMapping("/list")
    public List<BigDocumentResponse> getBigDocumentList() {
        return bigDocumentService.getBigDocumentList();
    }
}
