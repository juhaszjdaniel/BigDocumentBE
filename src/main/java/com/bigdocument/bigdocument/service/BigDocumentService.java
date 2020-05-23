package com.bigdocument.bigdocument.service;

import com.bigdocument.bigdocument.domain.BigDocumentResponse;
import com.bigdocument.bigdocument.domain.PageRequest;

import java.util.List;

public interface BigDocumentService {

    BigDocumentResponse getBigDocument();

    List<BigDocumentResponse> getBigDocumentList();

    List<BigDocumentResponse> getPagedDocumentList(PageRequest request);

}
