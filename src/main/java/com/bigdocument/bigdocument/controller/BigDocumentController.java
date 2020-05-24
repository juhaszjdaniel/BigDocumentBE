package com.bigdocument.bigdocument.controller;

import com.bigdocument.bigdocument.domain.BigDocumentResponse;
import com.bigdocument.bigdocument.domain.PageRequest;
import com.bigdocument.bigdocument.service.BigDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api/big-document")
public class BigDocumentController {

    private BigDocumentService bigDocumentService;

    @Autowired
    public BigDocumentController(BigDocumentService bigDocumentService) {
        this.bigDocumentService = bigDocumentService;
    }

    @PostMapping()
    public List<BigDocumentResponse> getPagedDocumentList(@Valid @RequestBody PageRequest request) {
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
