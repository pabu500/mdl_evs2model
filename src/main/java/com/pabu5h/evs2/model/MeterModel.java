package com.pabu5h.evs2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
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
@Table(name = "meter")
public class MeterModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	public String meter_displayname;
	@Column
	public String meter_sn;
	@Column
	public Long concentrator_id;
	@Column
	public Float overused_kwh;
	@Column
	public LocalDateTime overused_timestamp;
	@Column
	public LocalDateTime kwh_timestamp;
	@Column
	public Long premise_id;
	@Column
	public Long meter_status_id;
	@Column
	public Long comm_module_id;
	@Column
	public Integer read_lp;
	@Column
	public Integer meter_faulty_flag;
	@Column
	public Integer estimated_overused_kwh;
	@Column
	public Integer pending_lp;
	@Column
	public Integer pending_rt;
	@Column
	public Integer min_purchase;
	@Column
	public Integer pending_route;
	@Column
	public Integer pending_lp_timestamp;
	@Column
	public Integer pending_zero;
	@Column
	public Integer can_cutoff;
	@Column
	public Integer evs_meter_type;
	@Column
	public Integer adjust_ment_no;
	@Column
	public Integer plc_can_cutoff;
	@Column
	public Integer esim_can_cutoff;

}
