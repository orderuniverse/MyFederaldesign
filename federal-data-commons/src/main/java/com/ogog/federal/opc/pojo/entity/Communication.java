package com.ogog.federal.opc.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 门诊功能 - 门（急）诊病历通信详情表实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/13
 */
@Data
@TableName("opc_communication")
public class Communication extends BaseEntity {
	private static final long serialVersionUID = 4491006196394332753L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "belongOpc")
	private String belongOpc;                       // 所属门（急）诊病历
	@TableField(value = "contType")
	private String contType;                        // 联系电话-类别
	@TableField(value = "contTCode")
	private String contTCode;                       // 联系电话-类别代码
	@TableField(value = "contNum")
	private String contNum;                         // 联系电话-号码
	@TableField(value = "email")
	private String email;                           // 电子邮件地址
}
