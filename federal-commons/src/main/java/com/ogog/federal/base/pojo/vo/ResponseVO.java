package com.ogog.federal.base.pojo.vo;

import lombok.Data;

import java.io.Serializable;
@Data
public class ResponseVO<E>implements Serializable {
	private Integer  code;                        // 系统响应编码
	private String  message;                      // 系统响应信息
	private E data;                               // 系统响应数据

}
