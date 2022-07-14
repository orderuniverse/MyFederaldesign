package com.ogog.federal.emr.resume.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * <b>智慧医疗信息平台 - 电子病历功能 - 病历概要数据实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/14
 */
@Data
@TableName("ehr_outline")
public class Outline extends BaseEntity {
	private static final long serialVersionUID = 2712338630686703794L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "opc")
	private String opc;                             // 门诊号
	@TableField(value = "mrn")
	private String mrn;                             // 病历号
	@TableField(value = "fidName")
	private String fidName;                         // 文档标识-名称
	@TableField(value = "fidType")
	private String fidType;                         // 文档标识-类别代码
	@TableField(value = "fidMon")
	private String fidMon;                          // 文档标识-管理机构名称
	@TableField(value = "fidMoc")
	private String fidMoc;                          // 文档标识-管理机构组织机构代码（法人代码）
	@TableField(value = "fidNum")
	private String fidNum;                          // 文档标识-号码
	@TableField(value = "fidEdate")
	private Date fidEdate;                          // 文档标识-生效日期
	@TableField(value = "fidExpdate")
	private Date fidExpdate;                        // 文档标识-失效日期
	@TableField(value = "noid")
	private String noid;                            // 姓名-标识对象
	@TableField(value = "noidCode")
	private String noidCode;                        // 姓名-表示对象代码
	@TableField(value = "name")
	private String name;                            // 姓名
	@TableField(value = "emrType")
	private String emrType;                         // 病人类型代码
	@TableField(value = "abo")
	private String abo;                             // ABO血型
	@TableField(value = "rh")
	private String rh;                              // RH血型
	@TableField(value = "uinCode")
	private String uinCode;                         // 标识号-类别代码
	@TableField(value = "uinNum")
	private String uinNum;                          // 标识号-号码
	@TableField(value = "uinMon")
	private String uinMon;                          // 标识号-提供表示的机构名称
	@TableField(value = "birthday")
	private Date birthday;                          // 出生日期
	@TableField(value = "birthplace")
	private String birthplace;                      // 出生地
	@TableField(value = "gender")
	private String gender;                          // 性别代码
	@TableField(value = "ageYear")
	private String ageYear;                         // 年龄（岁）
	@TableField(value = "nationality")
	private String nationality;                     // 国籍代码
	@TableField(value = "nation")
	private String nation;                          // 民族代码
	@TableField(value = "marital")
	private String marital;                         // 婚姻状况类别代码
	@TableField(value = "vocationCsn")
	private String vocationCsn;                     // 职业编码系统名称
	@TableField(value = "vocationCode")
	private String vocationCode;                    // 职业代码
	@TableField(value = "education")
	private String education;                       // 文化程度代码
	@TableField(value = "uowName")
	private String uowName;                         // 工作单位名称
	@TableField(value = "addType")
	private String addType;                         // 标识地址类别的代码
	@TableField(value = "province")
	private String province;                        // 地址-省（自治区、直辖市）
	@TableField(value = "city")
	private String city;                            // 地址-市（地区）
	@TableField(value = "county")
	private String county;                          // 地址-县（区）
	@TableField(value = "town")
	private String town;                            // 地址-乡（镇、街道办事处）
	@TableField(value = "village")
	private String village;                         // 地址-村（街、路、弄等）
	@TableField(value = "house")
	private String house;                           // 地址-门牌号码
	@TableField(value = "zipCode")
	private String zipCode;                         // 邮政编码
	@TableField(value = "division")
	private String division;                        // 行政区划代码
	@TableField(value = "treatName")
	private String treatName;                       // 医疗待遇名称
	@TableField(value = "treatCode")
	private String treatCode;                       // 医疗待遇代码
	@TableField(value = "hygieneName")
	private String hygieneName;                     // 卫生事件（动作）名称
	@TableField(value = "eventType")
	private String eventType;                       // 事件分类代码
	@TableField(value = "eventDate")
	private Date eventDate;                         // 事件开始时间
	@TableField(value = "eventAddress")
	private String eventAddress;                    // 事件发生地点
	@TableField(value = "eventPart")
	private String eventPart;                       // 事件参与方
	@TableField(value = "eventSeason")
	private String eventSeason;                     // 事件发生原因
	@TableField(value = "eventEnding")
	private String eventEnding;                     // 事件结局
	@TableField(value = "mrState")
	private String mrState;                         // 病历状态
}
