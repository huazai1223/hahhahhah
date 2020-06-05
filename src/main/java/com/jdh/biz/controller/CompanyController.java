package com.jdh.biz.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.jdh.biz.domain.Company;
import com.jdh.biz.service.CompanyService;
import com.jdh.biz.vo.CompanyVO;

/**
 * 
 * @ClassName: CompanyController 
 * @Description: TODO
 * @author: 贾董华
 * @date: 2020年4月6日 下午2:05:58
 */
@Controller
public class CompanyController {

	@Resource
	private CompanyService service;
	@RequestMapping("list")
	public String list(Model model,@RequestParam(defaultValue = "1")Integer pageNum,@RequestParam(defaultValue = "8")Integer pageSize,CompanyVO vo) {
		PageInfo<Company> info = service.selectList(vo, pageNum, pageSize);
		model.addAttribute("info", info);
		model.addAttribute("vo", vo);
		return "list";
		
	}
	
	
}
