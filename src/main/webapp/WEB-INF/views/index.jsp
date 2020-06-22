<%--suppress JSUnresolvedLibraryURL --%>
<%--@elvariable id="user" type="org.springframework.remoting.jaxws.JaxWsPortClientInterceptor"--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<c:set var="URL" value="${pageContext.servletContext.contextPath}"/>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
          integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
          crossorigin="anonymous">
    <title>Accidents Page</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-9">
            <h2>Police Accidents</h2>
        </div>
        <div class="col-2">
            Login as : ${user.username}
        </div>
        <div class="col">
            <a href="${URL}/logout" class="btn btn-danger">Logout</a>
        </div>
    </div>
    <div class="row">
        <div class="col">
            <%--@elvariable id="accidents" type="java.util.List"--%>
            <c:set var="accidentsEmpty" value="${fn:length(accidents) == 0}"/>
            <c:if test="${!accidentsEmpty}">
                <c:set var="count" value="0"/>
                <table class="table table-hover">
                    <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Name</th>
                        <th scope="col">Text</th>
                        <th scope="col">Address</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${accidents}" var="accident">
                        <tr>
                            <th scope="row"><c:out value="${count = count + 1}"/></th>
                            <td>${accident.name}</td>
                            <td>${accident.text}</td>
                            <td>${accident.address}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
            <c:if test="${accidentsEmpty}">
                <h2>No accidents now.</h2>
            </c:if>
        </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
        integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
        crossorigin="anonymous"></script>
</body>
</html>
