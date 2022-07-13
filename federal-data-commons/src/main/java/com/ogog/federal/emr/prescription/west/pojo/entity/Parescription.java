package com.ogog.federal.emr.prescription.west.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * <b>智慧医疗信息平台 - 西医功能 - 西医处方实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/13
 */
@Data
@TableName("wm_prescription")
public class Parescription extends BaseEntity {
	private static final long serialVersionUID = 804952379582504260L;
	@TableId
	private String id;                              // 主键
	@TableField(value = "clinic")
	private String clinic;                          // 门诊号
	@TableField(value = "medical")
	private String medical;                         // 病历号
	@TableField(value = "documentation")
	private String documentation;                   // 文档标识-名称
	@TableField(value = "category")
	private String category;                        // 文档标识-类别代码
	@TableField(value = "document")
	private String document;                        // 文档标识-管理机构名称
	@TableField(value = "code")
	private String code;                            // 文档标识-管理机构组织机构代码
	@TableField(value = "number")
	private String number;                          // 文档标识-号码
	@TableField(value = "effect")
	private Date effect;                            // 文档标识-生效日期
	@TableField(value = "lapse")
	private Date lapse;                             // 文档标识-失效日期
	@TableField(value = "idNumber")
	private String idNumber;                        // 标识号-类别代码
	@TableField(value = "catnumber")
	private String catnumber;                       // 标识号-号码
	@TableField(value = "cateffect")
	private String cateffect;                       // 标识号-生效日期
	@TableField(value = "catname")
	private String catname;                         // 标识号-提供标识的机构名称
	@TableField(value = "identifies")
	private String identifies;                      // 姓名-标识对象
	@TableField(value = "objects")
	private String objects;                         // 姓名-标识对象代码
	@TableField(value = "name")
	private String name;                            // 姓名
	@TableField(value = "type")
	private String type;                            // 病人类型代码
	@TableField(value = "gender")
	private String gender;                          // 性别代码
	@TableField(value = "age")
	private String age;                             // 年龄
	@TableField(value = "nationality")
	private String nationality;                     // 国籍代码
	@TableField(value = "group")
	private String group;                           // 民族代码
	@TableField(value = "marriage")
	private String marriage;                        // 婚姻状况类别代码
	@TableField(value = "occupation")
	private String occupation;                      // 职业编码系统名称
	@TableField(value = "opnCode")
	private String opnCode;                         // 职业代码
	@TableField(value = "education")
	private String education;                       // 文化程度代码
	@TableField(value = "born")
	private String born;                            // 出生日期
	@TableField(value = "place")
	private String place;                           // 出生地
	@TableField(value = "workplace")
	private String workplace;                       // 工作单位名称
	@TableField(value = "addressCode")
	private String addressCode;                     // 标识地址类别代码
	@TableField(value = "province")
	private String province;                        // 地址-省(自治区,直辖市)
	@TableField(value = "city")
	private String city;                            // 地址-市(地区)
	@TableField(value = "county")
	private String county;                          // 地址-县(区)
	@TableField(value = "town")
	private String town;                            // 地址-乡（镇、街道办事处
	@TableField(value = "village")
	private String village;                         // 地址-村（街、路、弄等）
	@TableField(value = "house")
	private String house;                           // 地址-门牌号码
	@TableField(value = "email")
	private String email;                           // 邮政编码
	@TableField(value = "divisionCode")
	private String divisionCode;                    // 行政区划代码
	@TableField(value = "treatment")
	private String treatment;                       // 医疗待遇名称
	@TableField(value = "treatmentCode")
	private String treatmentCode;                   // 医疗待遇代码
	@TableField(value = "institutionName")
	private String institutionName;                 // 机构名称
	@TableField(value = "corporate")
	private String corporate;                       // 机构负责人(法人)
	@TableField(value = "cpeAddress")
	private String cpeAddress;                      // 机构地址
	@TableField(value = "roles")
	private String roles;                           // 机构角色
	@TableField(value = "rolesCode")
	private String rolesCode;                       // 机构角色代码
	@TableField(value = "srvName")
	private String srvName;                         // 服务者姓名
	@TableField(value = "srvDuty")
	private String srvDuty;                         // 服务者职责(角色)
	@TableField(value = "dutyCode")
	private String dutyCode;                        // 服务者职责(角色)代码
	@TableField(value = "specialized")
	private String specialized;                     // 服务者专业技术职务
	@TableField(value = "degree")
	private String degree;                          // 服务者学历
	@TableField(value = "srvSpecialized")
	private String srvSpecialized;                  // 服务者所学专业
	@TableField(value = "rank")
	private String rank;                            // 服务者专业技术职务等级
	@TableField(value = "office")
	private String office;                          // 服务者职务
	@TableField(value = "hygiene")
	private String hygiene;                         // 卫生事件(动作) 名称
	@TableField(value = "eventCode")
	private String eventCode;                       // 事件分类代码
	@TableField(value = "eventBegin")
	private Date eventBegin;                        // 事件开始时间
	@TableField(value = "earth")
	private String earth;                           // 事件发生地点
	@TableField(value = "participants")
	private String participants;                    // 事件参与方
	@TableField(value = "cause")
	private String cause;                           // 事件发生原因
	@TableField(value = "finale")
	private String finale;                          // 事件结局
	@TableField(value = "observe")
	private String observe;                         // 观察类别
	@TableField(value = "observeCode")
	private String observeCode;                     // 观察-类别代码
	@TableField(value = "project")
	private String project;                         // 观察项目名称
	@TableField(value = "projectCode")
	private String projectCode;                     // 观察-项目代码
	@TableField(value = "outcome")
	private String outcome;                         // 观察-结果描述
	@TableField(value = "intsName")
	private String intsName;                        // 诊断机构名称
	@TableField(value = "date")
	private Date date;                              // 诊断日期
	@TableField(value = "dicCategory")
	private String dicCategory;                     // 诊断类别
	@TableField(value = "dicCode")
	private String dicCode;                         // 诊断顺位(从属关系) 代码
	@TableField(value = "disease")
	private String disease;                         // 疾病名称
	@TableField(value = "diseaseCode")
	private String diseaseCode;                     // 疾病代码
	@TableField(value = "basis")
	private String basis;                           // 诊断依据
	@TableField(value = "basisCode")
	private String basisCode;                       // 诊断依据代码
	@TableField(value = "desName")
	private String desName;                         // 诊疗过程名称
	@TableField(value = "description")
	private String description;                     // 诊疗过程描述
	@TableField(value = "mrstatus")
	private String mrstatus;                        // 病历状态
}
