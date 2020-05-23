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

        return generateBigDcumentList(100);
    }

    @Override
    public List<BigDocumentResponse> getPagedDocumentList(PageRequest request) {
        return generateBigDcumentList(request.getPageSize());
    }

    private List<BigDocumentResponse> generateBigDcumentList(int number) {
        List<BigDocumentResponse> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            BigDocumentResponse response = new BigDocumentResponse();
            response.setDocument("Hello world");
            list.add(response);
        }
        return list;
    }
}
