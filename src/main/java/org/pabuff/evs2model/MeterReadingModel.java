package org.pabuff.evs2model;

import jakarta.persistence.*;

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
    @Column(name = "current")
    private float current;

    //TIMESTAMP in shortened ISO8601 format
    //ISO8061: 2019-12-31T23:59:59.999Z
    //Use shortened
    //Example: 2019-12-31T23:59:59
    @Column(name = "kwh_timestamp")
    private LocalDateTime dt;

    public void nullAll(){
        this.id = null;
        this.uid = null;
        this.msn = null;
        this.kwh = 0;
        this.current = 0;
        this.dt = null;
    }

}
