package com.easybrand.service;

import com.easybrand.common.pojo.EasyUIDataGridResult;

public interface ItemService {
	/**
	 * 通过当前页码和展示数，进行分页查询
	 * @param page
	 * @param rows
	 * @return
	 */
	public EasyUIDataGridResult getItemList(Integer page, Integer rows);

}
