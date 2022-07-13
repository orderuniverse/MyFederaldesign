package com.ogog.federal.system.admin.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 系统用户实体信息<b>
 *
 * @author orderuniverse
 * @date 2022/7/12
 */
@Data
@TableName("sys_admin")
public class Admin extends BaseEntity {
	private static final long serialVersionUID = -6663307106063399630L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "no")
	private String no;                              // 工号
	@TableField(value = "name")
	private String name;                            // 姓名
	@TableField(value = "cellphone")
	private String cellphone;                       // 手机号码
	@TableField(value = "password")
	private String password;                        // 登录密码
	@TableField(value = "position")
	private String position;                        // 职位
	@TableField(value = "identity")
	private String identity;                        // 身份信息
	@TableField(value = "department")
	private String department;                      // 所属科室部门
	@TableField(value = "idCard")
	private String idCard;                          // 身份证号码
	@TableField(value = "techTitle")
	private String techTitle;                       // 专业技术职称
	@TableField(value = "eduBackground")
	private String eduBackground;                   // 学历
}
