package com.ogog.federal.system.admin.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 系统功能菜单实体信息<b>
 *
 * @author orderuniverse
 * @date 2022/7/12
 */
@Data
@TableName("sys_menu")
public class Menu extends BaseEntity {
	private static final long serialVersionUID = 4453694848184612675L;
	@TableId(type = IdType.AUTO)
	private Long id;                                // 主键
	@TableField(value = "parent")
	private String parent;                          // 上级功能菜单
	@TableField(value = "text")
	private String text;                            // 功能菜单文本
	@TableField(value = "code")
	private String code;                            // 功能菜单编码
	@TableField(value = "url")
	private String url;                             // 功能菜单连接地址
	@TableField(value = "icon")
	private String icon;                            // 功能菜单图标
	@TableField(value = "sort")
	private Long sort;                              // 顺序
}
