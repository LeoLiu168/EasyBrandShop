package com.easybrand.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * 用于分页显示数据的POJO
 * @author leoliu
 *
 */
public class EasyUIDataGridResult implements Serializable {

	private static final long serialVersionUID = 1293127192831233L;
	
	private Integer total;
	
	private List<?> rows;

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	

}
