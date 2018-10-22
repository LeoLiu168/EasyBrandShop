package com.easybrand.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easybrand.common.pojo.EasyUITreeNode;
import com.easybrand.mapper.TbItemCatMapper;
import com.easybrand.pojo.TbItemCat;
import com.easybrand.pojo.TbItemCatExample;
import com.easybrand.pojo.TbItemCatExample.Criteria;
import com.easybrand.service.ItemCatService;

@Service
public class ItemCatServiceImpl implements ItemCatService {
	
	@Autowired
	private TbItemCatMapper tbItemCatMapper;

	@Override
	public List<EasyUITreeNode> getItemCastList(Long parentId) {

		//1.根据parentId查询节点列表
		TbItemCatExample example = new TbItemCatExample();
		//设置查询条件
		Criteria criteria = example.createCriteria();
		//2.转化为EasyUITreeNode列表
		criteria.andParentIdEqualTo(parentId);
		List<TbItemCat> list = tbItemCatMapper.selectByExample(example);
		//3.添加到列表
		List<EasyUITreeNode> resultlist = new ArrayList<>();
		for(TbItemCat item:list) {
			EasyUITreeNode node = new EasyUITreeNode();
			node.setId(item.getId());
			node.setText(item.getName());
			node.setState(item.getIsParent()?"closed":"open");
			resultlist.add(node);
		}
		//4.返回
		return resultlist;
	}

}
