package com.pabu5h.evs2.model;

import lombok.*;

@Data
@Builder
@Getter@Setter
@AllArgsConstructor
public class SvcTokenDto {
    private String username;
    private String svcName;
    private String endpoint;
    private String scope;
    private String target;
    private String operation;
}
