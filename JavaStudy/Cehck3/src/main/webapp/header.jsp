<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,java.text.SimpleDateFormat"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<body>
<header>
	<div>
 		<label>login</label>
 		<label>
 		<%
 		Date date = new Date();
 		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
 		String formatDate = sdf.format(date);
 		out.print(formatDate);
 		%>
 		</label>
	</div>
</header>
