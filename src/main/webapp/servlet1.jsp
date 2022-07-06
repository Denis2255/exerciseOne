<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Servlet1</title>

</head>
<body>


<p><b>Генерация таблиц по переданным параметрам: заголовок, количество строк и столбцов, цвет фона.</b></p>
<form method="post" action="">
    <p>Введите заголовок:</p>
    <label><input type="text" name="word"></label>
    <p>Введите количество строк:</p>
    <label><input type="text" name="row"></label>
    <p>Введите количество столбцов</p>
    <label><input type="text" name="column"></label>
    <p>Введите цвет фона (например #6082b6):</p>
    <label><input type="text" name="bgcolor"></label>
    <input type="submit" value="Result" name="Result"><br>
</form>

<c:forEach var="value" items="${requestScope.values }">
    <ul>
        <li>Word: <c:out value="${value.word}"/></li>
        <li>Row: <c:out value="${value.row}"/></li>
        <li>Column: <c:out value="${value.column}"/></li>
        <li>Bgcolor: <c:out value="${value.bgcolor}"/></li>
    </ul>
    <hr/>

</c:forEach>
</body>
</html>