<%@page import="spms.vo.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="member"
        scope="session"
        class="spms.vo.Member"
        type="spms.vo.Member" />
    
<!--head start-->
<div style="background-color:#00008b;color:#ffffff;height:20px;padding:5px;">
	<a style="color:white;" href="<%=request.getContextPath()%>">
		SPMS (Simple Project Management System)
	</a>
<span style="float: right;">

<%
if (member != null && member.getEmail() != null) {
%>
<%=member.getEmail() %>
<a style="color:white;"
    href="<%=request.getContextPath()%>/auth/logout">로그아웃</a>

<%
} else {
%>
<a style="color:white;"
    href="<%=request.getContextPath()%>/auth/login">로그인</a>
<a style="color:white;"
    href="<%=request.getContextPath()%>/auth/join">회원가입</a>
<%
}
%>
</span>

</div>
<!--head end-->
