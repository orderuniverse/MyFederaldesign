package com.ogog.federal.base.pojo.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>基础视图信息</b>
 * @author orideruniverse
 * @date 2022/7/4
 */
@Data
public class BaseVO implements Serializable {
	private static final long serialVersionUID = -9921625521921767L;
	private String  status;                     // 系统状态：Y-启用，N-禁用
	private String  createdBy;                  // 创建人
	private Date createTime;                    // 创建时间
	private String modifiedBy;                  // 修改人
	private Date modifiedTime;                  // 修改时间
}
