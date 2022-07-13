package com.ogog.federal.patient.patient.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 病人功能 - 病人联系人详情实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/12
 */
@Data
@TableName("pa_liaison")
public class Liaison extends BaseEntity {
	private static final long serialVersionUID = 5970181190001261696L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "belongPa")
	private String belongPa;                        // 所属病人信息
	@TableField(value = "credType")
	private String credType;                        // 联系人证件类型
	@TableField(value = "credNum")
	private String credNum;                         // 联系人证件号码
	@TableField(value = "contType")
	private String contType;                        // 联系人类型
	@TableField(value = "name")
	private String name;                            // 姓名
	@TableField(value = "cellphone")
	private String cellphone;                       // 联系电话
}
