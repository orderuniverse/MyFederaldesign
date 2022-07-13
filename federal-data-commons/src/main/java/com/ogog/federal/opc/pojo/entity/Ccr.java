package com.ogog.federal.opc.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * <b>智慧医疗信息平台 - 门诊功能 - 门（急）诊病历检查报告详情实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/13
 */
@Data
@TableName("opc_ccr")
public class Ccr extends BaseEntity {
	private static final long serialVersionUID = 3461551734488054961L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "belongOpc")
	private String belongOpc;                       // 所属门（急）诊病历
	@TableField(value = "ccrMech")
	private String ccrMech;                         // 检查报告单—机构（科室）
	@TableField(value = "ccrCode")
	private String ccrCode;                         // 检查报告单—编号
	@TableField(value = "ccrOvp")
	private String ccrOvp;                          // 检查报告结果-客观所见
	@TableField(value = "ccrSubject")
	private String ccrSubject;                      // 检查报告结果-主观提示
	@TableField(value = "chkDate")
	private Date chkDate;                           // 检查日期
	@TableField(value = "ccrDate")
	private Date ccrDate;                           // 检查报告日期
	@TableField(value = "ccrRemar")
	private String ccrRemar;                        // 检查报告备注
}
