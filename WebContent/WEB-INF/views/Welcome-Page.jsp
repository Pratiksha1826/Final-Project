<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="placeorder">
		<h1 align="center">MOM's Cafe</h1>
		<hr>
																<%-- My Name is : ${valuename}
																 --%>
		 <div align="center">
		 	<label for="item_name"> Item Type</label>
		 	<input type="text" name="name" placeholder="food?" id="item_name">
			<input type="submit" name="Close" value="Order now">
		 </div>
	 </form>
 </body>
</html>