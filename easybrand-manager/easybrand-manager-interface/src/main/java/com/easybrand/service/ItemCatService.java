package com.easybrand.service;

import java.util.List;

import com.easybrand.common.pojo.EasyUITreeNode;

public interface ItemCatService {
	/**
	 * 根据父节点id查询该节点的子类目列表
	 * @param parentId
	 * @return
	 */
	public List<EasyUITreeNode> getItemCastList(Long parentId); 

}
