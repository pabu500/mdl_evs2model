package com.pabu5h.evs2.model;


import lombok.*;

@Builder
@Getter@Setter
@AllArgsConstructor
public class QueryDto {
    private final QueryCredDto credential;
    private final Object request;
}
