package com.bigdocument.bigdocument.service;

import com.bigdocument.bigdocument.domain.BigDocumentResponse;
import com.bigdocument.bigdocument.domain.PageRequest;
import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;

import java.util.ArrayList;
import java.util.List;

public class BigDocumentServiceImpl implements BigDocumentService {

    private Lorem lorem = LoremIpsum.getInstance();

    public BigDocumentServiceImpl() {

    }

    @Override
    public List<BigDocumentResponse> getPagedDocumentList(PageRequest request) {
        return generateBigDcumentList(request);
    }

    private List<BigDocumentResponse> generateBigDcumentList(PageRequest request) {
        List<BigDocumentResponse> list = new ArrayList<>();

        for (int i = 1; i < request.getPageSize() + 1; i++) {
            BigDocumentResponse response = new BigDocumentResponse();
            response.setDocument(lorem.getHtmlParagraphs(i, i));
            list.add(response);
        }
        return list;
    }
}
