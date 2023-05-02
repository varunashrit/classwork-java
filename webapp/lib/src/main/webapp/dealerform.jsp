<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dealer Form</title>
</head>
<body>
<h2>Enter dealer data: </h2>
<form name="dealerForm" method="post" action="/webapp/dealer">
    Dealer Name: <input type="text" name="dealername"/> <br/>
    Dealer City: <input type="text" name="city"/> <br/>
    <input type="submit" value="Dealer" />
</form>

</body>
</html>
