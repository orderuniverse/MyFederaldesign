package com.ogog.federal.emr.clinic.observation.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * <b>智慧医疗信息平台 - 电子病历功能 - 急诊留观病历医嘱详情实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/14
 */
@Data
@TableName("obs_advice")
public class Advice extends BaseEntity {
	private static final long serialVersionUID = 7414816586823170484L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "obsAdvice")
	private String obsAdvice;                     // 所属急诊留观病历
	@TableField(value = "category")
	private String category;                        // 医嘱类别
	@TableField(value = "content")
	private String content;                         // 医嘱内容
	@TableField(value = "advice")
	private Date adviceDate;                            // 医嘱开嘱时间
	@TableField(value = "longDate")
	private Date longDate;                          // 长期医嘱停嘱时间
	@TableField(value = "implement")
	private Date implement;                         // 医嘱执行时间
	@TableField(value = "impCode")
	private String impCode;                         // 医嘱执行时间类别代码
	@TableField(value = "cancelDate")
	private Date cancelDate;                        // 医嘱取消时间
}
