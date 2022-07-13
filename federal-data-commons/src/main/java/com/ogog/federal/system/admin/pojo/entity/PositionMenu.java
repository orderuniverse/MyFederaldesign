package com.ogog.federal.system.admin.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.ogog.federal.base.pojo.entity.BaseEntity;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 职务功能实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/12
 */
public class PositionMenu extends BaseEntity {
	private static final long serialVersionUID = 9041733301867958331L;
	@TableField(value = "position")
	private String position;                            // 职位信息
	@TableField(value = "menu")
	private String menu;                                // 功能菜单
}
