package com.jdh.biz.domain;
/**
 * 
 * @ClassName: Type 
 * @Description: TODO
 * @author: 贾董华
 * @date: 2020年4月6日 下午1:57:00
 */

import java.util.List;

public class Type {
private Integer tid;
private String tname;

List<Company> companies;

public Integer getTid() {
	return tid;
}

public void setTid(Integer tid) {
	this.tid = tid;
}

public String getTname() {
	return tname;
}

public void setTname(String tname) {
	this.tname = tname;
}

public List<Company> getCompanies() {
	return companies;
}

public void setCompanies(List<Company> companies) {
	this.companies = companies;
}

public Type(Integer tid, String tname, List<Company> companies) {
	super();
	this.tid = tid;
	this.tname = tname;
	this.companies = companies;
}

public Type() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Type [tid=" + tid + ", tname=" + tname + ", companies=" + companies + "]";
}

}
