package com.ogog.federal.emr.prescription.west.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 西医功能 - 西医医保实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/13
 */
@Data
@TableName("wm_medicare")
public class Medicare extends BaseEntity {
	private static final long serialVersionUID = 8165656172204944251L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "preseription")
	private String preseription;                    // 所属西医处方
	@TableField(value = "category")
	private String category;                        // 医疗保险-类别
	@TableField(value = "catCode")
	private String catCode;                         // 医疗保险-类别代码
	@TableField(value = "state")
	private String state;                           // 系统状态
}
