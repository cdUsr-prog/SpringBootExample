<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<link rel="stylesheet" href="/resources/css/style.css">

<title>Book store</title>
</head>
<body>
  <h1>Borrow a book!</h1>
  <hr>

  <div class="form">
    <form action="bucketList" method="get" >
      <table>
      
        
        
 
  <fieldset>
  <p>Please choose a category</p>
    <input type="radio" id="mc" name="category" value="Science">
    <label for="mc"> Science</label> 
    <input type="radio" id="vi" name="category" value="Novel">
    <label for="vi"> Novel</label>

  </fieldset>

          <p>Please enter the authors name</p>
          <input id="authorName" name="authorName">
          <p>Please enter the books name</p>
            <input id="bookName" name="bookName">
           <p>Please enter the topic</p>
         <input id="topic" name="topic">
         <p>Please enter any additionally equipment</p>
         <input id="equipment" name="equipment">
         <br>
         <input type="submit" value="Submit">
       
      </table>
    </form>
  </div>

</body>
</html>