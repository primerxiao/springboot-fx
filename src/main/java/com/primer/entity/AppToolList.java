package com.primer.entity;

import lombok.Data;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Data
@Entity
@Table(name = "app_tool_list")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class AppToolList implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	@Column(name = "tool_name")
	private String toolName;

	@Column(name = "tool_view_class")
	private String toolViewClass;

	@Column(name = "tool_open_modality")
	private Integer toolOpenModality;

	@Column(name = "order_id")
	private Integer orderId;

}
