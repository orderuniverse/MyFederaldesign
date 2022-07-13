package com.ogog.federal.emr.prescription.west.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 西医功能 - 西医用药详情实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/13
 */
@Data
@TableName("wm_medication")
public class Medication extends BaseEntity {
	private static final long serialVersionUID = -1690610397070089088L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "preseription")
	private String preseription;                    // 所属西医处方
	@TableField(value = "frequency")
	private String frequency;                       // 药物使用-频率
	@TableField(value = "unit")
	private String unit;                            // 药物使用-剂量单位
	@TableField(value = "once")
	private String once;                            // 药物使用-一次剂量
	@TableField(value = "dosage")
	private String dosage;                          // 药物使用-总剂量
	@TableField(value = "wayCode")
	private String wayCode;                         // 药物使用-途径代码
	@TableField(value = "drugsName")
	private String drugsName;                       // 药物名称
	@TableField(value = "dosageCode")
	private String dosageCode;                      // 药物剂型代码
	@TableField(value = "drugsCode")
	private String drugsCode;                       // 药物类型药物名称代码
}
