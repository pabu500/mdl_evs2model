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
@Table(
        name = "device_reading2_farm",
        schema = "farm"
)
public class SensorReadingMultiModel2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "timestamp")
    private LocalDateTime timestamp;

    @Column(name = "co2_val")
    private Double co2Val;

    @Column(name = "temperature_val")
    private Double temperatureVal;

    @Column(name = "humidity_val")
    private Double humidityVal;

    @Column(name = "ir_val")
    private Double irVal;

    @Column(name = "reading_timestamp")
    private LocalDateTime readingTimestamp;

    @Column(name = "item_sn")
    private String itemSn;

}
