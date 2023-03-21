package com.pabu5h.evs2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.type.descriptor.sql.LongVarcharTypeDescriptor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

}
