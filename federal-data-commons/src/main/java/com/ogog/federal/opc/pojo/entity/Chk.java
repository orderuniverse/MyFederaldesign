package com.ogog.federal.opc.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * <b>智慧医疗信息平台 - 门诊功能 - 门（急）诊病历检查申请详情实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/13
 */
@Data
@TableName("opc_chk")
public class Chk extends BaseEntity {
	private static final long serialVersionUID = 4089631592592759936L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "belongOpc")
	private String belongOpc;                       // 所属门（急）诊病历
	@TableField(value = "chkMech")
	private String chkMech;                         // 检查申请单—机构（科室）
	@TableField(value = "chkCode")
	private String chkCode;                         // 检查申请单—编号
	@TableField(value = "chkReason")
	private String chkReason;                       // 检查申请检查原因
	@TableField(value = "chkDate")
	private Date chkDate;                           // 检查申请日期
	@TableField(value = "chkNote")
	private String chkNote;                         // 检查申请注意事项
}
