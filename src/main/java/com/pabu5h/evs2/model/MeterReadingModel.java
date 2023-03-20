package com.pabu5h.evs2.model;

//Spring Boot 3.0+
//import jakarta.persistence.*;
//Spring Boot 2.5+
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "meter_reading")
public class MeterReadingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /* Example JSON:

    {
     "uid":"BIE2IEYAAMACIADIAA",
     "msn":"202006000534",
     "kwh":"37.309",
     "dt":"2023-03-03T05:24:03"
    },

    */
    //ID of the submission batch
    @Column(name = "uid")
    private String uid;

    //Meter Serial Number
    @Column(name = "meter_sn")
    private String msn;

    //Latest reading
    @Column(name = "kwh_total")
    private float kwh;

    //TIMESTAMP in shortened ISO8601 format
    //ISO8061: 2019-12-31T23:59:59.999Z
    //Use shortened
    //Example: 2019-12-31T23:59:59
    @Column(name = "kwh_timestamp")
    private LocalDateTime dt;
}
