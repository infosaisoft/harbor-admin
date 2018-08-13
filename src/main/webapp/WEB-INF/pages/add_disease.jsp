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
			           
    
    
<form:form method="POST" modelAttribute="disease">

  <div class="form-group">
    <label for="formGroupExampleInput">typeofdiseases</label>
	<form:input class="form-control" path="typeofdiseases"/>
	</div>
	
  <div class="form-group">
    <label for="formGroupExampleInput">symptoms</label>
<form:textarea path="symptoms" class="form-control"/>
</div>

  <div class="form-group">
    <label for="formGroupExampleInput">dietCharts</label>
<form:textarea path="dietCharts" class="form-control"/>
</div>

  <div class="form-group">
    <label for="formGroupExampleInput">exercises</label>
<form:textarea path="exercises" class="form-control"/>
</div>


  <div class="form-group">
    <label for="formGroupExampleInput">doAndDonts</label>
<form:textarea path="doAndDonts" class="form-control"/>
</div>
<input type="submit" value="Add" class="btn btn-success">
</form:form>

${result}

</div>
</div>
</div>