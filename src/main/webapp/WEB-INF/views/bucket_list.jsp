<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book store</title>
</head>
<body>
  <h1>Bucket list</h1>
  <hr>
<h1>Newest ordered Book</h1>
  <h2>The authors name is ${authorName}</h2>
    <h2>The books name is ${bookName}</h2>
    <h2>The topic is ${topic}</h2>
    <h2>Your equipment is ${equipment}</h2>
   
    <h2>Your last ordered book was on ${orderDate}</h2>
    
    
 
  
  <h2>You have ordered ${orderedNumber} book(s) so far</h2>
  
<form action="/" method="get">

  <button type="submit" >Borrow more books!</button>
</form>

</body>
</html>