package com.ogog.federal.emr.transferred.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ogog.federal.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * <b>智慧医疗信息平台 - 门诊功能 - 转诊(院)记录实体信息</b>
 *
 * @author orderuniverse
 * @date 2022/7/13
 */
@Data
@TableName("tran_dign")
public class Dign extends BaseEntity {
	private static final long serialVersionUID = 3737969234275715424L;
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
	@TableField(value = "uinCode")
	private String uinCode;                         // 标识号-类别代码
	@TableField(value = "uinNum")
	private String uinNum;                          // 标识号-号码
	@TableField(value = "uinEdate")
	private Date uinEdate;                          // 标识号-生效日期
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
	@TableField(value = "fiName")
	private String fiName;                          // 机构名称
	@TableField(value = "fiCode")
	private String fiCode;                          // 机构组织机构代码
	@TableField(value = "fiPr")
	private String fiPr;                            // 机构负责人(法人)
	@TableField(value = "depName")
	private String depName;                         // 科室名称
	@TableField(value = "fiRole")
	private String fiRole;                          // 机构角色
	@TableField(value = "fiRoleCode")
	private String fiRoleCode;                      // 机构角色代码
	@TableField(value = "svrName")
	private String svrName;                         // 服务者姓名
	@TableField(value = "svrRole")
	private String svrRole;                         // 服务者职责（角色）
	@TableField(value = "svrRoleCode")
	private String svrRoleCode;                     // 服务者职责（角色）代码
	@TableField(value = "svrRat")
	private String svrRat;                          // 服务者专业技术职务
	@TableField(value = "svrEduc")
	private String svrEduc;                         // 服务者学历
	@TableField(value = "svrMajor")
	private String svrMajor;                        // 服务者所学专业
	@TableField(value = "svrPtg")
	private String svrPtg;                          // 服务者专业技术职务等级
	@TableField(value = "svrPost")
	private String svrPost;                         // 服务者职务
	@TableField(value = "relate")
	private String relate;                          // 主诉
	@TableField(value = "sxCsn")
	private String sxCsn;                           // 症状代码编码体系名称
	@TableField(value = "sxCode")
	private String sxCode;                          // 症状代码
	@TableField(value = "sxEDate")
	private Date sxEDate;                           // 症状开始日期时间
	@TableField(value = "sxExpDate")
	private Date sxExpDate;                         // 症状停止日期时间
	@TableField(value = "sxDesc")
	private String sxDesc;                          // 症状描述
	@TableField(value = "sxAsc")
	private String sxAsc;                           // 症状急性程度代码
	@TableField(value = "initSign")
	private String initSign;                        // 初诊标志
	@TableField(value = "obsType")
	private String obsType;                         // 观察-类别
	@TableField(value = "obsTCode")
	private String obsTCode;                        // 观察-类别代码
	@TableField(value = "obsName")
	private String obsName;                         // 观察项目名称
	@TableField(value = "obsCode")
	private String obsCode;                         // 观察-项目代码
	@TableField(value = "obsRoad")
	private String obsRoad;                         // 观察-结果描述
	@TableField(value = "obsResult")
	private String obsResult;                       // 观察-结果(数值)
	@TableField(value = "obsUom")
	private String obsUom;                          // 观察-计量单位
	@TableField(value = "obsResultC")
	private String obsResultC;                      // 观察-结果代码
	@TableField(value = "phrfCode")
	private String phrfCode;                        // 个人史危险因素代码
	@TableField(value = "phObsName")
	private String phObsName;                       // 个人史观察项目类目名称
	@TableField(value = "phObsResult")
	private String phObsResult;                     // 个人史观察结果
	@TableField(value = "impName")
	private String impName;                         // 诊断机构名称
	@TableField(value = "impDate")
	private Date impDate;                           // 诊断日期
	@TableField(value = "impType")
	private String impType;                         // 诊断类别
	@TableField(value = "impTypeCode")
	private String impTypeCode;                     // 诊断类别代码
	@TableField(value = "impBelCode")
	private String impBelCode;                      // 诊断顺位（从属关系）代码
	@TableField(value = "diseName")
	private String diseName;                        // 疾病名称
	@TableField(value = "diseCode")
	private String diseCode;                        // 疾病代码
	@TableField(value = "impBasis")
	private String impBasis;                        // 诊断依据
	@TableField(value = "impBasisCode")
	private String impBasisCode;                    // 诊断依据代码
	@TableField(value = "daptName")
	private String daptName;                        // 诊疗过程名称
	@TableField(value = "daptCont")
	private String daptCont;                        // 诊疗过程描述
	@TableField(value = "mrState")
	private String mrState;                         // 病历状态
}
