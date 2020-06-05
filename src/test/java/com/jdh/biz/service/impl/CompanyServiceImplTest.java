package com.jdh.biz.service.impl;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jdh.biz.domain.Company;
import com.jdh.biz.service.CompanyService;
import com.jdh.common.utils.DateUtil;
import com.jdh.common.utils.RandomUtil;
import com.jdh.common.utils.StringUtil;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class CompanyServiceImplTest {

	@Resource
	private CompanyService service;
	
	@Test
	public void test() {
		for (int i = 0; i < 10000; i++) {
			Company company=new Company();
			String[]coms= {"有限公司","股份有限公司","集团有限公司"};
			//公司名称
			company.setName("北京"+StringUtil.randomChineseString(RandomUtil.random(2, 4))+coms[RandomUtil.random(0, coms.length-1)]);
			//法人代表姓名
			company.setCorporation(StringUtil.generateChineseName());
			//注册地址
			company.setAddress("北京市"+StringUtil.randomChineseString(RandomUtil.random(20, 40)));
			//注册资本
			company.setCapital(RandomUtil.random(100000, 1000000000));
			//营业执照号
			company.setRegist_no("1101"+RandomUtil.randomNumber(11));
			//公司经济类型
			company.setTid(RandomUtil.random(1, 11));
			//成立时间
			Calendar calendar = Calendar.getInstance();
			calendar.set(1980, 0, 1);
			company.setCreated(DateUtil.randomDate(calendar.getTime(), new Date()));
			//营业期限
			Calendar calendar2 = Calendar.getInstance();
			calendar2.setTime(company.getCreated());
			calendar2.add(Calendar.YEAR, 50);
			company.setPeriod(calendar2.getTime());
			service.inserts(company);
		}
	}

}
