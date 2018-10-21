package com.easybrand.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easybrand.common.pojo.EasyUIDataGridResult;
import com.easybrand.mapper.TbItemMapper;
import com.easybrand.pojo.TbItem;
import com.easybrand.pojo.TbItemExample;
import com.easybrand.service.ItemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private TbItemMapper mapper;

	@Override
	public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
		//1.设置分页信息,使用PageHelper
		if(page == null) page=1;
		if(rows == null) page=30;
		PageHelper.startPage(page, rows);
		//2.注入mapper
		//3.创建example对象
		TbItemExample example = new TbItemExample();
		//4.根据mapper调用查询所有数据方法
		List<TbItem> list = mapper.selectByExample(example);
		//5.获取分页信息
		PageInfo<TbItem> info = new PageInfo<>(list);
		//6.封装到EasyUIDataGridResult并返回
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal((int) info.getTotal());
		result.setRows(info.getList());
		return result;
	}

}
