<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>  
<html>  
<head>  
    <title>Registration Form</title>  
</head>  
<h3>Registration Form</h3>  
<body>  
    <form:form action="submitForm" modelAttribute="registration">  
        First name: <form:input path="firstName" />         
        <br><br>  
        Last name: <form:input path="lastName" />  
        <br><br>  
        <input type="submit" value="Submit" />      
    </form:form>  
</body>  
</html>  