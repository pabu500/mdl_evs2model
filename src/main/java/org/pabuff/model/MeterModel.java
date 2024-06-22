package org.pabuff.model;

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
@Table(name = "meter")
public class MeterModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String meter_displayname;
	@Column
	private String meter_sn;
	@Column
	private Long concentrator_id;
	@Column
	private Float overused_kwh;
	@Column
	private LocalDateTime overused_timestamp;
	@Column
	private LocalDateTime kwh_timestamp;
	@Column
	private Long premise_id;
	@Column
	private Long meter_status_id;
	@Column
	private Long comm_module_id;
	@Column
	private Integer read_lp;
	@Column
	private Integer meter_faulty_flag;
	@Column
	private Integer estimated_overused_kwh;
	@Column
	private Integer pending_lp;
	@Column
	private Integer pending_rt;
	@Column
	private Integer min_purchase;
	@Column
	private Integer pending_route;
	@Column
	private Integer pending_lp_timestamp;
	@Column
	private Integer pending_zero;
	@Column
	private Integer can_cutoff;
	@Column
	private Integer evs_meter_type;
	@Column
	private Integer adjust_ment_no;
	@Column
	private Integer plc_can_cutoff;
	@Column
	private Integer esim_can_cutoff;

	public void nullAll(){
		this.id = null;
		this.meter_displayname = null;
		this.meter_sn = null;
		this.concentrator_id = null;
		this.overused_kwh = null;
		this.overused_timestamp = null;
		this.kwh_timestamp = null;
		this.premise_id = null;
		this.meter_status_id = null;
		this.comm_module_id = null;
		this.read_lp = null;
		this.meter_faulty_flag = null;
		this.estimated_overused_kwh = null;
		this.pending_lp = null;
		this.pending_rt = null;
		this.min_purchase = null;
		this.pending_route = null;
		this.pending_lp_timestamp = null;
		this.pending_zero = null;
		this.can_cutoff = null;
		this.evs_meter_type = null;
		this.adjust_ment_no = null;
		this.plc_can_cutoff = null;
		this.esim_can_cutoff = null;
	}

}
