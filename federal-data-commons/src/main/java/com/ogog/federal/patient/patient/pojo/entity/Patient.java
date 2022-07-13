package com.ogog.federal.patient.patient.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;

import java.util.Date;

/**
 * <b>智慧医疗信息平台 - 病人功能 - 病人实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/12
 */
@TableName("pa_patient")
public class Patient extends BaseEntity {
	private static final long serialVersionUID = -3446631870931601183L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "mrn")
	private String mrn;                             // 病历号
	@TableField(value = "name")
	private String name;                            // 姓名
	@TableField(value = "cellphone")
	private String cellphone;                       // 手机号码
	@TableField(value = "type")
	private String type;                            // 证件类型
	@TableField(value = "num")
	private String num;                             // 证件号码
	@TableField(value = "ed")
	private Date ed;                                // 证件生效日期
	@TableField(value = "exp")
	private Date exp;                               // 证件失效日期
	@TableField(value = "provider")
	private String provider;                        // 证件提供机构
	@TableField(value = "abo")
	private String abo;                             // ABO血型
	@TableField(value = "rh")
	private String rh;                              // RH血型
	@TableField(value = "gender")
	private String gender;                          // 性别
	@TableField(value = "nationality")
	private String nationality;                     // 国籍
	@TableField(value = "nation")
	private String nation;                          // 民族
	@TableField(value = "marital")
	private String marital;                         // 婚姻状况
	@TableField(value = "culture")
	private String culture;                         // 文化程度
	@TableField(value = "birthday")
	private Date birthday;                          // 出生日期
	@TableField(value = "birthplace")
	private String birthplace;                      // 出生地
}
