package com.pabu5h.evs2.model;

//Spring Boot 3.0+
//import jakarta.persistence.*;
//Spring Boot 2.5+

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "meter_reading_iwow")
public class MeterReadingIwowModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_sn")
    private String itemSn;

    @Column(name = "val")
    private Double val;

    @Column(name = "dt")
    private LocalDateTime dt;

    @Column(name = "ref")
    private String ref;
}
