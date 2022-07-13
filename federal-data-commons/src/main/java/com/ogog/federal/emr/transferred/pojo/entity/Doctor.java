package com.ogog.federal.emr.transferred.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 门诊功能 - 转诊(院) 记录医院医生详情实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/13
 */
@Data
@TableName("tran_doctor")
public class Doctor extends BaseEntity {
	private static final long serialVersionUID = -2925319593880573177L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "referral")
	private String referral;                        // 所属转诊(院)记录信息
	@TableField(value = "institution")
	private String institution;                     // 机构名称
	@TableField(value = "insCode")
	private String insCode;                         // 机构组织机构代码
	@TableField(value = "responsible")
	private String responsible;                     // 机构负责人(法人)
	@TableField(value = "address")
	private String address;                         // 机构地址
	@TableField(value = "department")
	private String department;                      // 科室名称
	@TableField(value = "role")
	private String role;                            // 机构角色
	@TableField(value = "roleCode")
	private String roleCode;                        // 机构角色代码
	@TableField(value = "name")
	private String name;                            // 服务者姓名
	@TableField(value = "Duty")
	private String Duty;                            // 服务者职责(角色)
	@TableField(value = "dutyCode")
	private String dutyCode;                        // 服务者职责(角色)代码
	@TableField(value = "duties")
	private String duties;                          // 服务者专业技术职务
	@TableField(value = "degree")
	private String degree;                          // 服务者学历
	@TableField(value = "specialized")
	private String specialized;                     // 服务者所学专业
	@TableField(value = "jobRank")
	private String jobRank;                         // 服务者专业技术职务等级
	@TableField(value = "office")
	private String office;                          // 服务者职务
	@TableField(value = "mark")
	private String mark;                            // 转入转出标记
}
