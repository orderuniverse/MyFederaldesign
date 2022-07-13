package com.ogog.federal.system.hospital.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 科室病历实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/12
 */
@TableName("sys_dept_emr")
public class DeptEmr extends BaseEntity {
	private static final long serialVersionUID = -5453176700093352204L;
	@TableId
	private Long id;                                // 主键
	@TableField(value = "department")
	private String department;                      // 所属医院
	@TableField(value = "emr")
	private String emr;                             // 病历信息
	@TableField(value = "emrUrl")
	private String emrUrl;                          // 病历连接地址
	@TableField(value = "sort")
	private Long sort;                              // 顺序
}
