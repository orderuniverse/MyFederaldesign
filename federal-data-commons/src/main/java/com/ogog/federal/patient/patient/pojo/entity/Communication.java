package com.ogog.federal.patient.patient.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;

/**
 * <b>智慧医疗信息平台 - 病人功能 - 病人通信详情实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/12
 */
@TableName("pa_communication")
public class Communication extends BaseEntity {
	private static final long serialVersionUID = 385843210678794416L;
	@TableField("id")
	private String id;                              // 主键
	@TableField(value = "paMessage")
	private String paMessage;                       // 所属病人信息
	@TableField(value = "category")
	private String category;                        // 联系电话-类别
	@TableField(value = "cellphone")
	private String cellphone;                       // 联系电话-号码
	@TableField(value = "email")
	private String email;                           // 电子邮件地址
}
