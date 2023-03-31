package com.pabu5h.evs2.model;


import lombok.*;

@Builder
@Getter@Setter
@AllArgsConstructor
public class QueryDto {
    private final QueryCredDto cred;
    private final QueryReqDto req;
}
