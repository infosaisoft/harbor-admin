<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
      
      
<form:form method="POST" modelAttribute="doctorAdd" enctype="multipart/form-data">


    <form:input path="id" disabled="true" value="${dto.id}"/><br>
    Namer::<form:input path="name"  value="${dto.name}"/><br>
   PassportPhoto::<input type="file" name="passport" value="${dto.passport}"><br>
    Address::<form:textarea path="address" value="${dto.address}"/><br>
    City::<form:input path="city" value="${dto.city }"/><br>
    State::<form:input path="state" value="${dto.state}"/><br>
    PinCode::<form:textarea path="pincode" value="${dto.pincode}"/><br>
    ContactNo::<form:input path="contact" value="${dto.contact}"/><br>
    Email::<form:input path="email" value="${dto.email }"/><br>
     Gender<form:radiobutton path="gendar" value="${dto.gendar}" />Male
     <form:radiobutton path="gendar" value="${dto.gendar}" />Female
     <br> 
    Qualification::<form:input path="qualification" value="${dto.qualification }"/><br>
    Speciality::<form:input path="speciality"  value="${dto.speciality }"/><br>
     Hospitals::<form:input  path="hospital" value="${dto.hospital }"/><br>
    
    <input type="submit" value="PatientAdd">
      ${result}
    </form:form> 
  
    
  