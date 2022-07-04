package com.ogog.federal.base.pojo.enums;

import com.ogog.federal.base.util.BaseConstants;

/**
 * <b>系统响应枚举信息</b>
 */
public enum ResponseEnum {
	RESPONSE_CODE_SUCCESS(BaseConstants.BASE_RESPONSE_SUCCESS,"系统业务处理完毕响应成功"),
	RESPONSE_CODE_UNAUTH(BaseConstants.BASE_RESPONSE_UNAUTH,"用户未进行系统认证"),
	RESPONSE_CODE_FAILURE(BaseConstants.BASE_RESPONSE_FAILURE,"系统业务处理错误"),
	BASE_RESPONSE_EXCEPTION(BaseConstants.BASE_RESPONSE_EXCEPTION,"系统业务处理异常");
	private Integer code;                       // 编码
	private String remark;                      // 说明

	ResponseEnum(Integer code, String remark) {
		this.code = code;
		this.remark = remark;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
