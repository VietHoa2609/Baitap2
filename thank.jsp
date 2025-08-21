<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cảm Ơn</title>
    <link rel="stylesheet" href="main.css">
</head>
<body>
    <h1>Cảm Ơn</h1>
    <p>Cảm ơn bạn, ${user.firstName} ${user.lastName}, đã tham gia danh sách email của chúng tôi.</p>
    <p>Email của bạn là ${user.email}</p>
    <a href="index.html">Quay lại trang tham gia</a>
</body>
</html>