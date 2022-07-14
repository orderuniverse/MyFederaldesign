package com.ogog.federal.emr.resume.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 电子病历功能 - 病历概要数据医保详情实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/14
 */
@Data
@TableName("ehr_insurance")
public class Insurance extends BaseEntity {
	private static final long serialVersionUID = -9146360076024159460L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "emrResume")
	private String emrResume;                       // 所属病历概要数据
	@TableField(value = "category")
	private String category;                        // 医疗保险-类别
	@TableField(value = "catCode")
	private String catCode;                         // 医疗保险-类别代码
}
