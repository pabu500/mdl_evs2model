package org.pabuff.model;

import lombok.*;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Getter@Setter
@Builder
@AllArgsConstructor
@Table(name = "transaction_log")
public class Evs2ConsumerTransactionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "transaction_id")
    String transactionId;
    @Column(name = "transaction_timestamp")
    LocalDateTime transactionTimestamp;
    @Column(name = "topup_amt")
    double topupAmt;
    @Column(name = "gst")
    double gst;
    @Column(name = "net_amt")
    double netAmt;
    @Column(name = "payment_mode")
    int paymentMode;
    @Column(name = "payment_status")
    int transactionStatus;
    @Column(name = "currency")
    String currency;
    @Column(name = "meter_displayname")
    String meterDisplayname;
    @Column(name = "offer_id")
    int offerId;
    @Column(name = "response_timestamp")
    LocalDateTime responseTimestamp;
    @Column(name = "complete_send_to_backend")
    boolean completeSendToBackend;
    @Column(name = "transaction_code")
    String transactionCode;
    @Column(name = "payment_channel")
    int paymentChannel;
    @Column(name = "transaction_status_rcved")
    int transactionStatusRcved;
    @Column(name = "conversion_ratio")
    double conversionRatio;
    @Column(name = "audit_number")
    String auditNumber;
    @Column(name = "is_dedicated")
    boolean isDedicated;
}
