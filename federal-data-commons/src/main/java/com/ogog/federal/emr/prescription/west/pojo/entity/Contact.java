package com.ogog.federal.emr.prescription.west.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 西医功能 - 西医处方联系人实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/13
 */
@Data
@TableName("wm_contact")
public class Contact extends BaseEntity {
	private static final long serialVersionUID = 7702282619550770605L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "preseription")
	private String preseription;                    // 所属西医处方
	@TableField(value = "idNumber")
	private String idNumber;                        // 标识号-类别代码
	@TableField(value = "catnumber")
	private String catnumber;                       // 标识号-号码
	@TableField(value = "cateffect")
	private String cateffect;                       // 标识号-生效日期
	@TableField(value = "identifies")
	private String identifies;                      // 姓名-标识对象
	@TableField(value = "objects")
	private String objects;                         // 姓名-标识对象代码
	@TableField(value = "name")
	private String name;                            // 姓名
}
