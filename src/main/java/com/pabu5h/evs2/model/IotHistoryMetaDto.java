package com.pabu5h.evs2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Builder
@AllArgsConstructor
public class IotHistoryMetaDto {
    int dominantIntervalMin;
    int durationMin;
    double maxVal;
}
