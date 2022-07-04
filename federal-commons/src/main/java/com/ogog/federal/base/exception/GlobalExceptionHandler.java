package com.ogog.federal.base.exception;

import com.ogog.federal.base.pojo.vo.ResponseVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * <b>系统处理异常</b>
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
	// 创建 Logback 日志对象
	private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	public ResponseVO globalExceptionHandle(Exception e){
		// 记录日志信息
		logger.error(e.getMessage() + ":" + new Date(),e);
	}
}
