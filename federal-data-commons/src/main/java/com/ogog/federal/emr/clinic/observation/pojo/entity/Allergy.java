package com.ogog.federal.emr.clinic.observation.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 电子病历功能 - 急诊留观病历过敏史详情实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/14
 */
@Data
@TableName("obs_allergy")
public class Allergy extends BaseEntity {
	private static final long serialVersionUID = 1381956038523086239L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "belongOpc")
	private String belongOpc;                       // 所属急诊留观病历
	@TableField(value = "hoa")
	private String hoa;                             // 过敏史
	@TableField(value = "allergen")
	private String allergen;                        // 过敏原
	@TableField(value = "alSym")
	private String alSym;                           // 过敏症状
	@TableField(value = "alSymCode")
	private String alSymCode;                       // 过敏症状代码
	@TableField(value = "allergenCode")
	private String allergenCode;                    // 过敏原代码
	@TableField(value = "alName")
	private String alName;                          // 过敏药物名称
	@TableField(value = "alStatName")
	private String alStatName;                      // 过敏病情状态代码
	@TableField(value = "hoaCode")
	private String hoaCode;                     // 过敏史标识代码
}
