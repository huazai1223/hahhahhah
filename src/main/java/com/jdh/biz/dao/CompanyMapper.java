package com.jdh.biz.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jdh.biz.domain.Company;
import com.jdh.biz.vo.CompanyVO;

/**
 * 
 * @ClassName: CompanyMapper 
 * @Description: TODO
 * @author: 贾董华
 * @date: 2020年4月6日 下午2:06:46
 */
public interface CompanyMapper{
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
 * @return
 * @return: List<Company>
 */
	List<Company>selectList(CompanyVO vo);
}
