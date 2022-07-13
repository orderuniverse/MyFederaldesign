package com.ogog.federal.emr.transferred.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 门诊功能 - 转诊(院)记录实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/13
 */
@Data
@TableName("tran_communication")
public class Communication extends BaseEntity {
	private static final long serialVersionUID = 7414171210191504474L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "referral")
	private String referral;                        // 所属转诊(院)记录信息
	@TableField(value = "category")
	private String category;                        // 联系电话-类别
	@TableField(value = "catCode")
	private String catCode;                         // 联系电话-类别代码
	@TableField(value = "cellphone")
	private String cellphone;                       // 联系电话-号码
	@TableField(value = "email")
	private String email;                           // 电子邮件地址
}
