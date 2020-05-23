package com.bigdocument.bigdocument.domain;

import lombok.Data;

@Data
public class PageRequest {

    private int offset;

    private int pageSize;
}
