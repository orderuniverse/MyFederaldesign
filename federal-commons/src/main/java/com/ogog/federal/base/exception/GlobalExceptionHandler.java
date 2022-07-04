package com.ogog.federal.base.exception;

import com.ogog.federal.base.pojo.vo.ResponseVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

/**
 * <b>系统处理异常</b>
 * @author orderuniverse
 * @date 2022/7/4
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
	// 创建 Logback 日志对象
	private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	/**
	 * <b>处理控制层所抛出的异常信息</b>
	 * @param e
	 * @return
	 */
	@ExceptionHandler
	public ResponseVO globalExceptionHandle(Exception e){
		// 记录日志信息
		logger.error(e.getMessage() + ":" + new Date(),e);
		// 返回系统业务响应异常视图信息
		return ResponseVO.exceptionResponseVO(e);
	}
}
