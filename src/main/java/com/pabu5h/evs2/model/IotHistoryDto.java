package com.pabu5h.evs2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter@Setter
@Builder
@AllArgsConstructor
public class IotHistoryDto {
    List<Map<String, Object>> history;
    IotHistoryMetaDto meta;
}
