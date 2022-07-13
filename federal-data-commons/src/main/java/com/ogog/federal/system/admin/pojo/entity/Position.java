package com.ogog.federal.system.admin.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 人员职位实体信息<b>
 *
 * @author orderuniverse
 * @date 2022/7/12
 */
@Data
@TableName("sys_position")
public class Position extends BaseEntity {
	private static final long serialVersionUID = -7297340164175226708L;
	@TableId(type = IdType.AUTO)
	private Long id;                                // 主键
	@TableField(value = "department")
	private String department;                      // 所属科室部门
	@TableField(value = "name")
	private String name;                            // 科室部门名称
	@TableField(value = "code")
	private String code;                            // 科室部门编号
}
