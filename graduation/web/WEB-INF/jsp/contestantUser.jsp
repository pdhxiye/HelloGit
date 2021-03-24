<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/2/17
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>报名情况</title>
</head>
<body>
<div>
    <table>
        <thead>
        <tr>
            <th>姓名</th>
            <th>学号</th>
            <th>年级</th>
        </tr>
        </thead>
       <tbody>
       <c:forEach var="contestantUser" items="${contestantUsers}">
           <tr>
               <td>${contestantUser.contestantName}</td>
               <td>${contestantUser.studentId}</td>
               <td>${contestantUser.contestantGrade}</td>
           </tr>
       </c:forEach>
       </tbody>

    </table>
</div>
</body>
</html>
