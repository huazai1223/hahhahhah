package com.jdh.biz.vo;
/**
 * 
 * @ClassName: CompanyVO 
 * @Description: 视图对象
 * @author: 贾董华
 * @date: 2020年4月6日 下午3:22:09
 */

import java.util.Date;

import com.jdh.biz.domain.Company;

public class CompanyVO extends Company{
	/* 资金开始的范围 */
private Integer capitalStart;
	/* 资金结束的范围 */
private Integer capitalEnd;
private String mtype;

public String getMtype() {
	return mtype;
}
public void setMtype(String mtype) {
	this.mtype = mtype;
}
public Integer getCapitalStart() {
	return capitalStart;
}
public void setCapitalStart(Integer capitalStart) {
	this.capitalStart = capitalStart;
}
public Integer getCapitalEnd() {
	return capitalEnd;
}
public void setCapitalEnd(Integer capitalEnd) {
	this.capitalEnd = capitalEnd;
}
public CompanyVO(Integer id, String name, String corporation, String address, Integer capital, String regist_no,
		Integer tid, Date period, Date created, Integer capitalStart, Integer capitalEnd) {
	super(id, name, corporation, address, capital, regist_no, tid, period, created);
	this.capitalStart = capitalStart;
	this.capitalEnd = capitalEnd;
}
public CompanyVO() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "CompanyVO [capitalStart=" + capitalStart + ", capitalEnd=" + capitalEnd + "]";
}

}
