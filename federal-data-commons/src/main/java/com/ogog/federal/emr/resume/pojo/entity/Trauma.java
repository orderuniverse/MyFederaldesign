package com.ogog.federal.emr.resume.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * <b>智慧医疗信息平台 - 电子病历功能 - 病历概要数据疾病(外伤)史详情实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/14
 */
@Data
@TableName("ehr_trauma")
public class Trauma extends BaseEntity {
	private static final long serialVersionUID = -7248051327133600626L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "emrResume")
	private String emrResume;                       // 所属病历概要数据
	@TableField(value = "disease")
	private String disease;                         // 既往疾病史
	@TableField(value = "psychosis")
	private String psychosis;                       // 既往精神类疾病诊断名称
	@TableField(value = "disName")
	private String disName;                         // 既往疾病名称
	@TableField(value = "disCode")
	private String disCode;                         // 既往疾病代码
	@TableField(value = "imp")
	private String imp;                             // 既往疾病诊断机构
	@TableField(value = "impCode")
	private String impCode;                         // 既往疾病诊断机构级别代码
	@TableField(value = "impTime")
	private Date impTime;                           // 既往疾病诊断时间
	@TableField(value = "stateCode")
	private String stateCode;                       // 疾病当前状态代码
}
