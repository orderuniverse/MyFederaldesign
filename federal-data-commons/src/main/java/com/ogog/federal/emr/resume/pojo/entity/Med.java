package com.ogog.federal.emr.resume.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 电子病历功能 - 病历概要数据用药详情信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/14
 */
@Data
@TableName("ehr_med")
public class Med extends BaseEntity {
	private static final long serialVersionUID = -6253139790406330810L;
	@TableId
	private Long id;                                // 主键
	@TableField(value = "emrResume")
	private String emrResume;                       // 所属病历概要信息
	@TableField(value = "medUsage")
	private String medUsage;                        // 药物用法
	@TableField(value = "usageRate")
	private String usageRate;                       // 药物使用-频率
	@TableField(value = "medUnit")
	private String medUnit;                         // 药物使用-剂量单位
	@TableField(value = "perDosage")
	private String perDosage;                       // 药物使用-次剂量
	@TableField(value = "totalDosage")
	private String totalDosage;                     // 药物使用-总剂量
	@TableField(value = "wayCode")
	private String wayCode;                         // 药物使用-途径代码
	@TableField(value = "medName")
	private String medName;                         // 药物名称
	@TableField(value = "dosageForm")
	private String dosageForm;                      // 药物剂型代码
	@TableField(value = "medCat")
	private String medCat;                          // 药物类型
	@TableField(value = "medNameCode")
	private String medNameCode;                     // 药物名称代码
}
