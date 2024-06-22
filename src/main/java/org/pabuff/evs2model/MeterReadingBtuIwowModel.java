//package com.pabu5h.evs2.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//
//@Data
//@Entity
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name = "meter_reading_iwow")
//public class MeterReadingBtuIwowModel {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "type")
//    private String type;
//
//    @Column(name = "item_name")
//    private String itemName;
//
//    @Column(name = "item_sn")
//    private String itemSn;
//
//    @Column(name = "dt")
//    private LocalDateTime dt;
//
//    @Column(name = "val")
//    private Double val;
//
//    @Column(name = "ref")
//    private String ref;
//
//
//    @Column(name = "flow")
//    private Double flow;
//
//    @Column(name = "power")
//    private Double power;
//
//    @Column(name = "volume")
//    private Double volume;
//
//    @Column(name = "forward_temp")
//    private Double forwardTemp;
//    @Column(name = "return_temp")
//    private Double returnTemp;
//    @Column(name = "temp_diff")
//    private Double tempDiff;
//
//}
