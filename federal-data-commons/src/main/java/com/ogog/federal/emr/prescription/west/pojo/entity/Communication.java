package com.ogog.federal.emr.prescription.west.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 西医功能 - 西医处方通信详情实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/13
 */
@Data
@TableName("wm_communication")
public class Communication extends BaseEntity {
	private static final long serialVersionUID = 6567621394104470357L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "preseription")
	private String preseription;                    // 所属西医处方
	@TableField(value = "category")
	private String category;                        // 联系电话-类别
	@TableField(value = "catCode")
	private String catCode;                         // 联系电话-类别代码
	@TableField(value = "cellphone")
	private String cellphone;                       // 联系电话-号码
	@TableField(value = "email")
	private String email;                           // 电子邮件地址
}
