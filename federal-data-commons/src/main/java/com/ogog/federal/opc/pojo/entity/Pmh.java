package com.ogog.federal.opc.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b></b>
 *
 * @author orderuniverse
 * @date 2022/7/13
 */
@Data
@TableName("opc_pmh")
public class Pmh extends BaseEntity {
	private static final long serialVersionUID = 3119768646411408007L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "belongOpc")
	private String belongOpc;                       // 所属门（急）诊病历
	@TableField(value = "obsName")
	private String obsName;                         // 既往观察-项目名称
	@TableField(value = "obsTCode")
	private String obsTCode;                        // 既往观察-项目分类代码
	@TableField(value = "obsCodeN")
	private String obsCodeN;                        // 既往观察-项目代码名称
	@TableField(value = "obsCode")
	private String obsCode;                         // 既往观察-项目代码
	@TableField(value = "obsWayCode")
	private String obsWayCode;                      // 既往观察-方法代码
	@TableField(value = "obsRoad")
	private String obsRoad;                         // 既往观察-结果
	@TableField(value = "pmhName")
	private String pmhName;                         // 既往史观察项目类目名称
	@TableField(value = "pmhResult")
	private String pmhResult;                       // 既往史观察结果
}
