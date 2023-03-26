package com.pabu5h.evs2.model;

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
@Table(name = "pending_purchase_record")
public class PendingPurchaseRecordModel {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    @Column
    private String transaction_id;
    @Column
    private String offer_reg_id;
    @Column
    private LocalDateTime transaction_log_timestamp;
    @Column
    private String peak_period_from;
    @Column
    private Float peak_period_price;
    @Column
    private String off_peak_period_from;
    @Column
    private Float off_peak_period_price;
    @Column
    private Float amount;
    @Column
    private Integer pending_status;
    @Column
    private Long offer_id;
    @Column
    private Long transaction_log_id;
    @Column
    private String meter_displayname;

    public void nullAll(){
        this.transaction_id = null;
        this.offer_reg_id = null;
        this.transaction_log_timestamp = null;
        this.peak_period_from = null;
        this.peak_period_price = null;
        this.off_peak_period_from = null;
        this.off_peak_period_price = null;
        this.amount = null;
        this.pending_status = null;
        this.offer_id = null;
        this.transaction_log_id = null;
        this.meter_displayname = null;
    }
}

