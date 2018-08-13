<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
	<c:choose>
    <c:when test="${!empty  listdto}">
       <table class="table table-bordered bg-white" >
	
<tr> <th>SNO</th><th>name</th><th>passportPhoto</th><th>address</th><th>city</th><th>state</th><th>pincode</<th><th>email</th><th>gendar</<th><th>qulification</th><th>speciality</<th><th>hospital</th><th>Contact</<th><th>operations </th></tr>
		
			<c:forEach var="dto" items="${listdto}">
			<tr>
				<th>${dto.id}</th>
				<th>${dto.name }</th>
				<th>${dto.passport}</th>
				<th>${dto.address }</th>
				<th>${dto.city }</th>
				<th>${dto.state }</th>
				<th>${dto.pincode }</th>
				<th>${dto.contact }</th>
				<th>${dto.email }</th>
				<th>${dto.gendar }</th>
				<th>${ dto.qualification}</th>
				<th>${dto.speciality }</th>
				<th>${dto.hospital }</th>
				
				<th>
				
				 <a  class="btn btn-info btn-sm" href="edit_doctor?id=${dto.id}">edit</a>
                     <a  class="btn btn-danger btn-sm" href="delete?id=${dto.id}">delete</a>
				</th>
				</tr>
			</c:forEach>
			</table>
		</c:when>
		
 <c:otherwise>
        <h1 style="color:red;text-align:center"> No Records found </h1>
    </c:otherwise>
</c:choose>



<h1> Click on downlod hyperlink to download the files..</h1>
<c:choose>
   <c:when test="${!empty filesList }">
      <table border="1">
       <c:forEach  var="file"  items="${filesList}">
           <tr>
             <td>${file} </td>
             <td><a href="download.htm?fname=${file}">download</a></td>
           </tr>
       </c:forEach>
       </table>
   </c:when>
   <c:otherwise>
        <h1>No files found</h1>
   </c:otherwise>
</c:choose>

	
</body>
</html>
