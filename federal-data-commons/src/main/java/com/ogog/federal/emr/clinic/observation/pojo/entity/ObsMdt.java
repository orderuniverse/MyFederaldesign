package com.ogog.federal.emr.clinic.observation.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 门诊功能 - 急诊留观病历诊疗过程记录详情实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/14
 */
@Data
@TableName("obs_mdt")
public class ObsMdt extends BaseEntity {
	private static final long serialVersionUID = -4702433788762880890L;
	@TableId
	private String id;                      // 主键
	@TableField(value = "emrClinicObs")
	private String emrClinicObs;            // 所属急诊留观病历
	@TableField(value = "cont")
	private String mdtName;               // 诊疗过程名称
	@TableField(value = "mdtCont")
	private String mdtCont;               // 诊疗过程描述
}
