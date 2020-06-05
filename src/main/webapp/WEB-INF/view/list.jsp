<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 视图 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
<!-- 引入样式 --> 
<link href="/resource/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
</head>
<body>
<center><h2>公司列表</h2></center>
<form action="/list" method="post">
	<div>
	按规模:
	<input type="hidden" name="capitalStart" value="${vo.capitalStart}" id="k">
	<input type="hidden" name="capitalEnd" value="${vo.capitalEnd}" id="j">
	<button class="btn btn-link" onclick="query1(1,2000000)">小型企业</button>
	<button class="btn btn-link" onclick="query1(2000001,10000000)">中型企业</button>
	<button class="btn btn-link" onclick="query1(10000001,'')">大型企业</button>
	<button class="btn btn-link" onclick="query1('','')">全部</button>
	<br>
	按类型:
	<input type="hidden" name="mtype" value="${vo.mtype}" id="m">
	<input type="hidden" name="pageNum">
	<button class="btn btn-link" onclick="query2(1)">有限公司</button>
	<button class="btn btn-link" onclick="query2(2)">股份公司</button>
	<button class="btn btn-link" onclick="query2(3)">国企</button>
	<button class="btn btn-link" onclick="query2('qt')">其他</button>
	<button class="btn btn-link" onclick="query2('')">全部</button>
	</div>
</form>
<table class="table">
	<tr>
		<td>公司名称</td>
		<td>营业执照号</td>
		<td>法人代表</td>
		<td>注册资金</td>
		<td>公司类型</td>
		<td>成立日期</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${info.list}" var="i">
		<tr>
			<td>${i.name}</td>
			<td>${i.regist_no}</td>
			<td>${i.corporation}</td>
			<td>${i.capital}</td>
			<td>${i.type.tname}</td>
			<td>
			<fmt:formatDate value="${i.created}" pattern="yyyy-MM-dd"/>${i.created}
			</td>
			<td><a>详情</a></td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan="100">
			<jsp:include page="/WEB-INF/view/pages.jsp"></jsp:include>
		</td>
	</tr>
</table>
</body>
<script type="text/javascript">
	function query1(capitalStart,capitalEnd){
		$("#k").val(capitalStart);
		$("#j").val(capitalEnd);
		$("form").submit();
	}
	
	function query2(mtype){
		$("#m").val(mtype);
		$("form").submit();
	}
	
	function goPage(pageNum){
		$("[name='pageNum']").val(pageNum);
		$("form").submit();
	}
</script>
</html>