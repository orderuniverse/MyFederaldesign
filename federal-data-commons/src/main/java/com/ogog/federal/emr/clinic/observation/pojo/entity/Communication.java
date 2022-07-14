package com.ogog.federal.emr.clinic.observation.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 电子病历功能 - 急诊留观病历通讯详情实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/14
 */
@Data
@TableName("obs_communication")
public class Communication extends BaseEntity {
	private static final long serialVersionUID = -1279790707358286305L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "observation")
	private String observation;                     // 所属急诊留观病历
	@TableField(value = "category")
	private String category;                        // 联系电话-类别
	@TableField(value = "catCode")
	private String catCode;                         // 联系电话-类别代码
	@TableField(value = "number")
	private String number;                          // 联系电话-号码
	@TableField(value = "email")
	private String email;                           // 电子邮件地址
}
