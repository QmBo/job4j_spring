<%--suppress ELValidationInJSP --%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<%--@elvariable id="errorMessage" type="java.lang.String"--%>
<c:if test="${not empty errorMessage}">
    <div style="color:red; font-weight: bold; margin: 30px 0;">
        ${errorMessage}
    </div>
</c:if>
<form name='login' action="<c:url value='/login'/>" method='POST'>
    <table>
        <tr>
            <td>UserName:</td>
            <td><input type='text' name='username' title="UserName"></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type='password' name='password' title="Password"/></td>
        </tr>
        <tr>
            <td colspan='2'><input name="submit" type="submit" value="submit" /></td>
        </tr>
    </table>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form>
</body>
</html>
