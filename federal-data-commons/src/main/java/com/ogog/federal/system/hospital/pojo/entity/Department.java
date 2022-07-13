package com.ogog.federal.system.hospital.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 科室部门实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/12
 */
@TableName("sys_department")
public class Department extends BaseEntity {
	private static final long serialVersionUID = -8342139173965195883L;
	@TableId
	private Long id;                                // 主键
	@TableField(value = "hospital")
	private String hospital;                        // 所属医院
	@TableField(value = "parent")
	private String parent;                          // 上级科室部门
	@TableField(value = "name")
	private String name;                            // 科室名称
	@TableField(value = "code")
	private String code;                            // 科室编号
	@TableField(value = "sort")
	private Long sort;                              // 顺序
}
