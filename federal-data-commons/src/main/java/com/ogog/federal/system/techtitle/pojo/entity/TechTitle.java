package com.ogog.federal.system.techtitle.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 专业技术职务实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/12
 */
@TableName("sys_tech_title")
public class TechTitle extends BaseEntity {
	private static final long serialVersionUID = -2425675628931309336L;
	@TableId
	private Long id;                            // 主键
	@TableField(value = "techTitleCategory")
	private String techTitleCategory;           // 所属技术职位类别
	@TableField(value = "techTitleRank")
	private String techTitleRank;               // 所属技术职务等级
	@TableField(value = "code")
	private String code;                        // 技术职务编码
	@TableField(value = "name")
	private String name;                        // 技术职务名称
}
