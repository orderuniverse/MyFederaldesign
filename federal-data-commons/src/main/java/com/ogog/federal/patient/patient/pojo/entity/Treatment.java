package com.ogog.federal.patient.patient.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;

/**
 * <b>智慧医疗信息平台 - 病人功能 - 病人就诊详情实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/12
 */
@TableName("pa_treatment")
public class Treatment extends BaseEntity {
	private static final long serialVersionUID = -8896044584331194799L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "paMessage")
	private String paMessage;                       // 所属病人信息
	@TableField(value = "paNumber")
	private String paNumber;                        // 门诊号
}
