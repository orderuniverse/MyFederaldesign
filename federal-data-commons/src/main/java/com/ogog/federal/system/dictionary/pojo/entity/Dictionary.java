package com.ogog.federal.system.dictionary.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 系统字典实体信息<b>
 *
 * @author orderuniverse
 * @date 2022/7/12
 */
@TableName("sys_dictionary")
public class Dictionary extends BaseEntity {
	private static final long serialVersionUID = 7636639457981004495L;
	@TableId
	private Long id;                                // 主键
	@TableField(value = "superDictionary")
	private String superDictionary;                 // 上级字典
	@TableField(value = "name")
	private String name;                            // 字典名称
	@TableField(value = "code")
	private String code;                            // 字典编码
}
