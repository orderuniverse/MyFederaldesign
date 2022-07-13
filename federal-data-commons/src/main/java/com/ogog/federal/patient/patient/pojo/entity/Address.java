package com.ogog.federal.patient.patient.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 病人功能 - 病人联系地址详情实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/12
 */
@Data
@TableName("pa_address")
public class Address extends BaseEntity {
	private static final long serialVersionUID = -3069906193732200026L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "addressType")
	private String paMessage;                       // 所属病人信息
	@TableField(value = "addressType")
	private String addressType;                     // 地址类型
	@TableField(value = "province")
	private String province;                        // 所在省
	@TableField(value = "city")
	private String city;                            // 所在市
	@TableField(value = "county")
	private String county;                          // 所在区县
	@TableField(value = "town")
	private String town;                            // 所在乡镇
	@TableField(value = "village")
	private String village;                         // 所在村街道
	@TableField(value = "house")
	private String house;                           // 门牌号码
	@TableField(value = "zipCode")
	private String zipCode;                         // 邮政编码
}
