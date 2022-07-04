package com.ogog.federal.base.util;

import cn.hutool.core.util.StrUtil;
import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <b>Token 工具类<b>
 * @author orderuniverse
 * @date 2022/7/4
 */
public class TokenUtil {
	private static final String PAYLOAD_KEY = "payload";

	/**
	 * <b>根据所给定的信息生成 Token</b>
	 * @param value
	 * @param expireSec
	 * @return
	 * @throws Exception
	 */
	public static String  createToken(Object value,Integer expireSec)throws Exception{
		// 通过 Hutool 生成 Token
		Map<String ,Object> payloadMap = new HashMap<String,Object>();
		// 设置所给定的对象为有效载荷信息
		payloadMap.put(PAYLOAD_KEY,value);
		// 设置生成 Token 的有效时长
		// 根据所存储的时长，获得对应时期的 Date 类型
		Long expireMillis = System.currentTimeMillis() + expireSec * 1000;
		// 根据最终毫秒数获得 Date 类型
		Date exporeDate = new Date(expireMillis);
		payloadMap.put(JWT.EXPIRES_AT,exporeDate);
		// 生成对应的 Token
		return JWTUtil.createToken(payloadMap,BaseConstants.BASE_TOKEN_KEY.getBytes());
	}

	/**
	 * <b>校验 Token 并获得对应有效载荷信息</b>
	 * @param token
	 * @return
	 */
	public static Object validateToken(String token){
		if(StrUtil.isNotBlank(token) && JWTUtil.verify(token,BaseConstants.BASE_TOKEN_KEY.getBytes())){
			// 此时 Token 存在，并且校验有效，解析 Token 获得对应信息
			return JWTUtil.parseToken(token).getPayload(PAYLOAD_KEY);
		}
		return null;
	}
}
