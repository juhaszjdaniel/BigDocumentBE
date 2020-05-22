package com.bigdocument.bigdocument.service;

import com.bigdocument.bigdocument.domain.BigDocumentResponse;

public class BigDocumentServiceImpl implements BigDocumentService {

    public BigDocumentServiceImpl() {

    }

    @Override
    public BigDocumentResponse getBigDocument() {
        BigDocumentResponse response = new BigDocumentResponse();
        response.setDocument("Hello world");
        return response;
    }
}
