package com.ogog.federal.emr.clinic.observation.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 电子病历功能 - 急诊留观病历治疗详情实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/14
 */
@Data
@TableName("obs_treat")
public class ObsTreat extends BaseEntity {
	private static final long serialVersionUID = 8679685467490342264L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "belEmrObs")
	private String belEmrObs;                       // 所属急诊留观病历
	@TableField(value = "planCheck")
	private String planCheck;                       // 拟做的检查
	@TableField(value = "trtSchPlan")
	private String trtSchPlan;                      // 今后治疗方案
	@TableField(value = "followMark")
	private String followMark;                      // 随访标志
	@TableField(value = "followInr")
	private String followInr;                       // 随访间隔（随诊期限）
	@TableField(value = "advice")
	private String advice;                          // 医嘱
	@TableField(value = "spRemark")
	private String spRemark;                        // 特别注意事项
}
