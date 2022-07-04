package com.ogog.federal.base.pojo.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PageVO<E extends BaseVO>implements Serializable {
	private Integer pageNum;                        // 当前页码
	private Integer pageSize;                       // 每页显示数量
	private List<E> list;                           // 分页列表
	private Long totalCount;                        // 总条数
	private Integer totalPage;                      // 总页数

	public PageVO(){}
	public PageVO(Integer pageNum,Integer pageSize){
		if(pageNum != null && pageNum > 0){

		}
	}
}
