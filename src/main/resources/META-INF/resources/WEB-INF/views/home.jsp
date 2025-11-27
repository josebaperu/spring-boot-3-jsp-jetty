<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<c:set var="home" scope="request">
    <div class="a">
        <span>home content</span>
    </div>
</c:set>

<div>
    <jsp:include page="template.jsp">
        <jsp:param name="bodyContent" value="${home}"/>
    </jsp:include>
</div>