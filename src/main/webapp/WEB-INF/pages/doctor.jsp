<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
   <form:form method="POST" modelAttribute="doctorAdd" enctype="multipart/form-data">
    
    Namer::<form:input path="name"/><br>
   PassportPhoto::<input type="file" name="passport" value="passport"><br>
    Address::<form:textarea path="address"/><br>
    City::<form:input path="city"/><br>
    State::<form:input path="state" /><br>
    PinCode::<form:textarea path="pincode"/><br>
    ContactNo::<form:input path="contact"/><br>
    Email::<form:input path="email"/><br>
     Gender<form:radiobutton path="gendar" value="male"/>Male
     <form:radiobutton path="gendar" value="female"/>Female
     <br> 
    Qualification::<form:input path="qualification"/><br>
    Speciality::<form:input path="speciality"/><br>
     Hospitals::<form:input  path="hospital"/><br>
    
    <input type="submit" value="PatientAdd">
      ${result}
    </form:form> 
  
    
    