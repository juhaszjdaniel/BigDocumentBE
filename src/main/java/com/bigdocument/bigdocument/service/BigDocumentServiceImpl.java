package com.bigdocument.bigdocument.service;

import com.bigdocument.bigdocument.domain.BigDocumentResponse;
import com.bigdocument.bigdocument.domain.PageRequest;

import java.util.ArrayList;
import java.util.List;

public class BigDocumentServiceImpl implements BigDocumentService {

    public BigDocumentServiceImpl() {

    }

    @Override
    public BigDocumentResponse getBigDocument() {
        BigDocumentResponse response = new BigDocumentResponse();
        response.setDocument("Hello world");
        return response;
    }

    @Override
    public List<BigDocumentResponse> getBigDocumentList() {

        return null;
    }

    @Override
    public List<BigDocumentResponse> getPagedDocumentList(PageRequest request) {
        return generateBigDcumentList(request);
    }

    private List<BigDocumentResponse> generateBigDcumentList(PageRequest request) {
        List<BigDocumentResponse> list = new ArrayList<>();
        for (int i = 0; i < request.getPageSize(); i++) {
            BigDocumentResponse response = new BigDocumentResponse();
            response.setDocument("Hello word " + request.getOffset() + i);
            list.add(response);
        }
        return list;
    }
}
