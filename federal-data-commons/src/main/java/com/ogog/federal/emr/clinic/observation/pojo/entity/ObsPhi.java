package com.ogog.federal.emr.clinic.observation.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * <b>智慧医疗信息平台 - 电子病历功能 - 急诊留观病历现病史详情实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/14
 */
@Data
@TableName("obs_phi")
public class ObsPhi extends BaseEntity {
	private static final long serialVersionUID = -3356238855451556629L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "belongObs")
	private String belongObs;                       // 所属急诊留观病历
	@TableField(value = "onset")
	private Date onset;                             // 起病时间
	@TableField(value = "situation")
	private String situation;                       // 起病情况描述
	@TableField(value = "cause")
	private String cause;                           // 症状开始原因/诱因
	@TableField(value = "characteristic")
	private String characteristic;                  // 症状特点
	@TableField(value = "accompany")
	private String accompany;                       // 伴随症状
	@TableField(value = "after")
	private String after;                           // 本疾病既往诊疗经过
	@TableField(value = "basics")
	private String basics;                          // 基础疾病诊疗情况
}
