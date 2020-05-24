package com.bigdocument.bigdocument.domain;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
public class PageRequest {

    @Min(value = 0, message = "Offset must be positive!")
    private Integer offset;

    @Min(value = 10, message = "Value has to be between 10 and 200!")
    @Max(value = 200, message = "Value has to be between 10 and 200!")
    private int pageSize = 25;
}
