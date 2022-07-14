package com.ogog.federal.emr.clinic.observation.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 电子病历功能 - 留观病历既往史详情实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/14
 */
@Data
@TableName("obs_ph")
public class ObsPh extends BaseEntity {
	private static final long serialVersionUID = 3421134418857542890L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "belongObs")
	private String belongObs;                       // 所属急诊留观病历
	@TableField(value = "obsName")
	private String obsName;                         // 既往观察-项目名称
	@TableField(value = "obsCode")
	private String obsCode;                         // 既往观察-项目分类代码
	@TableField(value = "pjtName")
	private String pjtName;                         // 既往观察-项目代码名称
	@TableField(value = "pjtCode")
	private String pjtCode;                         // 既往观察-项目代码
	@TableField(value = "result")
	private String result;                          // 既往观察-结果
	@TableField(value = "category")
	private String category;                        // 既往史观察项目类目名称
	@TableField(value = "obsResult")
	private String obsResult;                       // 既往史观察结果
}
