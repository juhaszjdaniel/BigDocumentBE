package com.bigdocument.bigdocument.service;

import com.bigdocument.bigdocument.domain.BigDocumentResponse;
import com.bigdocument.bigdocument.domain.PageRequest;

import java.util.List;

public interface BigDocumentService {

    List<BigDocumentResponse> getPagedDocumentList(PageRequest request);

}
