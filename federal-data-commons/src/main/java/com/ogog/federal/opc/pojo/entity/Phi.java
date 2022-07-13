package com.ogog.federal.opc.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * <b>智慧医疗信息平台 - 门诊功能 - 门（急）诊病历现病史详情实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/13
 */
@Data
@TableName("opc_phi")
public class Phi extends BaseEntity {
	private static final long serialVersionUID = 6015806389037411363L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "belongOpc")
	private String belongOpc;                       // 所属门（急）诊病历
	@TableField(value = "onsetDate")
	private Date onsetDate;                         // 起病时间
	@TableField(value = "onsetDescr")
	private String onsetDescr;                      // 起病情况描述
	@TableField(value = "symCause")
	private String symCause;                        // 症状开始原因/诱因
	@TableField(value = "symTrait")
	private String symTrait;                        // 症状特点
	@TableField(value = "assSym")
	private String assSym;                          // 伴随症状
	@TableField(value = "pmi")
	private String pmi;                             // 本疾病既往诊疗经过
	@TableField(value = "treatment")
	private String treatment;                       // 基础疾病诊疗情况
}
