<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

	
	<div class="content_wrapper">

	<div class="content_page_heading_section">
		<div class="container-fluid">
			<h3 class="content_page_heading">hospitals</h3>
		</div>
	</div>

	<div class="mid_content_section section_padding">
		<div style="width:60%;margin-left:0px;" class="container-fluid">
			<div class="row">
			           


				<form class="container-fluid form" id="needs-validation" novalidate>
				
				    <div class="row">
	                    <img src="images/download.jpg" alt="..." class="img-thumbnail">
	                </div>
					<div class="row">
					    <div class="col-12 col-sm-6">
		                    <div class="form-group">
			                    <label for="validationCustom09"></label> <input
				                    type="file" class="form-control-file" id="validationCustom09"
				                    required>
			                        <div class="invalid-feedback">Please Select File</div>
		                    </div>
						</div>
						<div class="col-12 col-sm-6">
							<div class="form-group">
								<label for="validationCustom01">Hospital ID</label> <input
									type="text" class="form-control" id="validationCustom01"
									placeholder="Hospital ID" required>
								<div class="invalid-feedback">Please Enter Hospital ID.</div>
							</div>
						</div>
	                </div>
					
		
					<div class="row">
						<div class="col-12 col-sm-12">
							<div class="form-group">
								<label for="validationCustom02">Hospital name</label> <input
									type="text" class="form-control" id="validationCustom02"
									placeholder="Last name" required>
								<div class="invalid-feedback">Please Enter Hospital Name.</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-12 col-sm-12">
							<div class="form-group">
								<label for="validationCustom02">Email Address</label> <input
									type="email" class="form-control" id="validationCustom02"
									placeholder="Last name" required>
								<div class="invalid-feedback">Please Enter Email Address.</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-12 col-sm-12">
							<div class="form-group">
								<label for="validationCustom08">Address</label>
								<textarea class="form-control" id="validationCustom08" rows="3"
									placeholder="Type Your Address Here..." required></textarea>
								<div class="invalid-feedback">Please Enter Your Address</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-12 col-sm-6">
							<div class="form-group">
								<label for="validationCustom02">Pin no</label> <input
									type="text" class="form-control" id="validationCustom02"
									placeholder="Pin no" required>
								<div class="invalid-feedback">Please Enter pin no.</div>
							</div>
						</div>
						<div class="col-12 col-sm-6">
							<div class="form-group">
								<label for="validationCustom02">Contact no</label> <input
									type="text" class="form-control" id="validationCustom02"
									placeholder="Contact no" required>
								<div class="invalid-feedback">Please Enter Contact no.</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-12 col-sm-6">
							<div class="form-group">
								<label for="validationCustom05">City</label> <select
									id="validationCustom05" class="form-control" required>
									<option value="">City</option>
									<option value="1">City1</option>
									<option value="2">City2</option>
									<option value="3">City3</option>
								</select>
								<div class="invalid-feedback">Please Select an City.</div>
							</div>
						</div>
					
						<div class="col-12 col-sm-6">
							<div class="form-group">
								<label for="validationCustom05">State</label> <select
									id="validationCustom05" class="form-control" required>
									<option value="">State</option>
									<option value="1">State1</option>
									<option value="2">State2</option>
									<option value="3">State3</option>
								</select>
								<div class="invalid-feedback">Please Select an State.</div>
							</div>
						</div>
					</div>
					
					<div class="row">
						<div class="col-12 col-sm-12">
							<div class="form-group">
								<label for="validationCustom05">Disease specialities</label> <select
									id="validationCustom05" class="form-control" required>
									<option value="">Disease specialities</option>
									<option value="1">Disease specialities1</option>
									<option value="2">Disease specialities2</option>
									<option value="3">Disease specialities3</option>
								</select>
								<div class="invalid-feedback">Please Select an Disease specialities.</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-12 col-sm-12">
							<div class="form-group">
								<label for="validationCustom05">Departments</label> <select
									id="validationCustom05" class="form-control" required>
									<option value="">Departments</option>
									<option value="1">Departments1</option>
									<option value="2">Departments2</option>
									<option value="3">Departments3</option>
								</select>
								<div class="invalid-feedback">Please Select an Departments.</div>
							</div>
						</div>
					</div>

					
					<div class="row">
						<div class="col-12 col-sm-12">
							<div class="form-group">
								<label for="validationCustom08">Message</label>
								<textarea class="form-control" id="validationCustom08" rows="3"
									placeholder="Type Your Message Here..." required></textarea>
								<div class="invalid-feedback">Please Enter Your Message</div>
							</div>
						</div>

						
					</div>



					<div class="row">
						<div class="col-12 col-sm-6">
							<button class="btn btn-primary" type="submit">Submit
								form</button>
						</div>
					</div>
				</form>
             
			</div>

		</div>
	</div>
	
</div>