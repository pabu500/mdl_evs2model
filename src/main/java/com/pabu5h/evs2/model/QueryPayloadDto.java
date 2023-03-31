package com.pabu5h.evs2.model;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class QueryPayloadDto<T> {
    private final T data;
}
