package com.ogog.federal.opc.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * <b>智慧医疗信息平台 - 门诊功能 - 门（急）诊病历诊断详情实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/13
 */
@Data
@TableName("opc_imp")
public class Imp extends BaseEntity {
	private static final long serialVersionUID = 6511438983502985927L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "belongOpc")
	private String belongOpc;                       // 所属门（急）诊病历
	@TableField(value = "impName")
	private String impName;                         // 诊断机构名称
	@TableField(value = "impDate")
	private Date impDate;                           // 诊断日期
	@TableField(value = "impType")
	private String impType;                         // 诊断类别
	@TableField(value = "impTypeCode")
	private String impTypeCode;                     // 诊断类别代码
	@TableField(value = "impBelCode")
	private String impBelCode;                      // 诊断顺位（从属关系）代码
	@TableField(value = "diseName")
	private String diseName;                        // 疾病名称
	@TableField(value = "diseCode")
	private String diseCode;                        // 疾病代码
	@TableField(value = "impBasis")
	private String impBasis;                        // 诊断依据
	@TableField(value = "impBasisCode")
	private String impBasisCode;                    // 诊断依据代码
}
