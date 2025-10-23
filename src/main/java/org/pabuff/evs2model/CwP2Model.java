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
@Table(schema="cw_p2", name = "meter_reading_cw_p2")
public class CwP2Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "meter_number")
    private String meterNumber;

    @Column(name = "val")
    private Double val;

    @Column(name = "dt")
    private LocalDateTime dt;

    @Column(name = "power")
    private Double power;

    @Column(name = "import_total")
    private Double importTotal;

    @Column(name = "export_total")
    private Double exportTotal;
}
