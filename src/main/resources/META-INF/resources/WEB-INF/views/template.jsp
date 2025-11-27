<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="header">
    <jsp:include page="header.jsp"/>
</div>


<c:if test="${param.bodyContent ne null and not empty param.bodyContent}">
    <div id="bodyContent">
        <c:out escapeXml="false"  value="${bodyContent}">${param.bodyContent}</c:out>
    </div>
</c:if>

<div id="footer">
    <jsp:include page="footer.jsp"/>
</div>

