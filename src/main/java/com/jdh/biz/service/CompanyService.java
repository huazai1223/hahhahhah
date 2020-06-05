package com.jdh.biz.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.jdh.biz.domain.Company;
import com.jdh.biz.vo.CompanyVO;

/**
 * 
 * @ClassName: CompanyService 
 * @Description: TODO
 * @author: 贾董华
 * @date: 2020年4月6日 下午2:08:09
 */
public interface CompanyService {
	/**
	 * 
	 * @Title: inserts 
	 * @Description: 批量添加
	 * @return
	 * @return: int
	 */
	int inserts(Company company);
	/**
	 * 
	 * @Title: selectList 
	 * @Description: 查询模糊分页
	 * @param vo
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @return: List<Company>
	 */
		PageInfo<Company>selectList(CompanyVO vo,Integer pageNum,Integer pageSize);
}
