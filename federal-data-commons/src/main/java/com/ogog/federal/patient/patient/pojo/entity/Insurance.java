package com.ogog.federal.patient.patient.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;

/**
 * <b>智慧医疗信息平台 - 病人功能 - 病人医疗保险实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/12
 */
@TableName("pa_insurance")
public class Insurance extends BaseEntity {
	private static final long serialVersionUID = -2900817344457015686L;
	@TableField("id")
	private String id;                              // 主键
	@TableField(value = "paMessage")
	private String paMessage;                       // 所属病人信息
	@TableField(value = "medical")
	private String medical;                         // 医保信息
}
