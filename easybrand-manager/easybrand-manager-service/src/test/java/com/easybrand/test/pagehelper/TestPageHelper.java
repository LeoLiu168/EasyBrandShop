package com.easybrand.test.pagehelper;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easybrand.mapper.TbItemMapper;
import com.easybrand.pojo.TbItem;
import com.easybrand.pojo.TbItemExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
/**
 * Test PageHelper
 * @author leoliu
 *
 */
public class TestPageHelper {
	
	@Test
	public void testhelper() {
		
		//1.初始化Spring容器
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		//2.获取mapper代理对象
		TbItemMapper itemMapper = context.getBean(TbItemMapper.class);
		//3.设置分页信息
		PageHelper.startPage(1, 3);
		//4.调用mapper方法
		TbItemExample example = new TbItemExample();
		List<TbItem> list = itemMapper.selectByExample(example);
		List<TbItem> list2 = itemMapper.selectByExample(example);
		//取分页信息
		PageInfo<TbItem> info = new PageInfo<>(list);
		System.out.println("第一个分页的集合长度:" + list.size());
		System.out.println("第二个分页的集合长度:" + list2.size());
		//5.循环遍历结果集
		System.out.println("查询的总记录数:" + info.getTotal());
		for(TbItem tbItem : list) {
			System.out.println(tbItem.getId()+">>>>名称>>>>"+tbItem.getTitle());
		}
		
	}

}
