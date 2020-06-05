package com.jdh.biz.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jdh.biz.dao.CompanyMapper;
import com.jdh.biz.domain.Company;
import com.jdh.biz.service.CompanyService;
import com.jdh.biz.vo.CompanyVO;

/**
 * 
 * @ClassName: CompanyServiceImpl 
 * @Description: TODO
 * @author: 贾董华
 * @date: 2020年4月6日 下午2:07:58
 */
@Service
public class CompanyServiceImpl implements CompanyService{

	@Resource
	private CompanyMapper CompanyMapper;

	@Override
	public int inserts(Company company) {

		return CompanyMapper.inserts(company);
	}

	@Override
	public PageInfo<Company> selectList(CompanyVO vo, Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<Company> list = CompanyMapper.selectList(vo);
		
		return new PageInfo<Company>(list);
	}
	
	
}
