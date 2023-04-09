package com.pabu5h.evs2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter@Setter
@Builder
@AllArgsConstructor
public class IotHistoryRowDto {
    LocalDateTime timestamp;
    double reading_total;
    double reading_diff;
    @JsonProperty("is_estimated")
    boolean isEstimated;
}
