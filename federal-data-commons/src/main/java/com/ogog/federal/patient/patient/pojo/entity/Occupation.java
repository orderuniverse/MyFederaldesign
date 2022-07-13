package com.ogog.federal.patient.patient.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 病人功能 - 病人职业详情实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/12
 */
@Data
@TableName("pa_occupation")
public class Occupation extends BaseEntity {
	private static final long serialVersionUID = 2274241212565928058L;
	@TableId(type = IdType.AUTO)
	private Long id;                                //  主键
	@TableField(value = "belongPa")
	private String belongPa;                        //  所属病人信息
	@TableField(value = "occupation")
	private String occupation;                      //  职业信息
}
