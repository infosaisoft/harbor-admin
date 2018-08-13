<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
   <div class="content_wrapper">

	<div class="content_page_heading_section">
		<div class="container-fluid">
			<h3 class="content_page_heading">Diseases</h3>
		</div>
	</div>

	<div class="mid_content_section section_padding">
		<div class="container-fluid">
			<div class="row">
			           
    
    
<form:form method="POST" modelAttribute="editdisease">
<div class="form-group">
    <label for="formGroupExampleInput">sno</label>
	<form:input class="form-control" path="sno" />
	</div>


  <div class="form-group">
    <label for="formGroupExampleInput">typeofdiseases</label>
	<form:input class="form-control" path="typeofdiseases" value= "${dto.typeofdiseases}"/>
	</div>
	
  <div class="form-group">
    <label for="formGroupExampleInput">symptoms</label>
<form:textarea class="form-control" path="symptoms"  value= "${dto.symptoms}"/>
</div>

  <div class="form-group">
    <label for="formGroupExampleInput">dietCharts</label>
<form:textarea class="form-control"  path="dietCharts" value="${dto.dietCharts}"/>
</div>

  <div class="form-group">
    <label for="formGroupExampleInput">exercises</label>
<form:textarea path="exercises" class="form-control" value="${dto.dietCharts}"/>
</div>


  <div class="form-group">
    <label for="formGroupExampleInput">doAndDonts</label>
<form:textarea path="doAndDonts" class="form-control" value="${dto.doAndDonts}"/>
</div>
<input type="submit" value="Add" class="btn btn-success">
</form:form>

${updatemsg}

</div>
</div>
</div>
</div>