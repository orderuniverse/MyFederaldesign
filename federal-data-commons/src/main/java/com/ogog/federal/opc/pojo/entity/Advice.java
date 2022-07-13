package com.ogog.federal.opc.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * <b>智慧医疗信息平台 - 门诊功能 - 门（急）诊病历医嘱详情实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/13
 */
@Data
@TableName("opc_advice")
public class Advice extends BaseEntity {
	private static final long serialVersionUID = -7004825157770868982L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "belongOpc")
	private String belongOpc;                       // 所属门（急）诊病历
	@TableField(value = "startDate")
	private Date startDate;                         // 医嘱开嘱日期时间
	@TableField(value = "endDate")
	private Date endDate;                           // 长期医嘱停嘱日期时间
	@TableField(value = "execDate")
	private Date execDate;                          // 医嘱执行日期时间
	@TableField(value = "typeDate")
	private Date typeDate;                          // 医嘱执行时间类别代码
	@TableField(value = "cancelDate")
	private Date cancelDate;                        // 医嘱取消日期时间
	@TableField(value = "type")
	private String type;                            // 医嘱类别
	@TableField(value = "content")
	private String content;                         // 医嘱内容
}
