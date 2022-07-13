package com.ogog.federal.system.dictionary.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 数据元值域实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/12
 */
@TableName("sys_data_code")
public class DataCode extends BaseEntity {
	private static final long serialVersionUID = 2688202337823980672L;
	@TableId
	private Long id;                                // 主键
	@TableField(value = "parent")
	private String parent;                          // 上级数据元
	@TableField(value = "code")
	private String code;                            // 数据元值
	@TableField(value = "remark")
	private String remark;                          // 数据元值说明
}
