<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!-- Content Start -->
<div class="content_wrapper">

	<div class="content_page_heading_section">
		<div class="container-fluid">
			<h3 class="content_page_heading">Dashboard</h3>
		</div>
	</div>

	<div class="mid_content_section section_padding">
		<div class="container-fluid">
			<div class="row">
			           
			           <form:form method="POST" modelAttribute="homecmd">

				<form class="container-fluid" id="needs-validation" novalidate>
					<div class="row">
						<div class="col-12 col-sm-6">
							<div class="form-group">
								<label for="validationCustom01">First name</label> <input
									type="text" class="form-control" id="validationCustom01"
									placeholder="First name" required>
								<div class="invalid-feedback">Please Enter First Name.</div>
							</div>
						</div>
						<div class="col-12 col-sm-6">
							<div class="form-group">
								<label for="validationCustom02">Last name</label> <input
									type="text" class="form-control" id="validationCustom02"
									placeholder="Last name" required>
								<div class="invalid-feedback">Please Enter Last Name.</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-12 col-sm-6">
							<div class="form-group">
								<label for="validationCustom03">Username</label>
								<div class="input-group">
									<div class="input-group-addon">
										<i class="fa fa-user"></i>
									</div>
									<input type="text" class="form-control" id="validationCustom03"
										placeholder="Username" required>
								</div>
							</div>
						</div>
						<div class="col-12 col-sm-6">
							<div class="form-group">
								<label for="validationCustom04">Password</label>
								<div class="input-group">
									<div class="input-group-addon">
										<i class="fa fa-lock"></i>
									</div>
									<input type="text" class="form-control" id="validationCustom04"
										placeholder="Password" required>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-12 col-sm-6">
							<div class="form-group">
								<label for="validationCustom05">Select Options</label> <select
									id="validationCustom05" class="form-control" required>
									<option value="">Select Option</option>
									<option value="1">Option1</option>
									<option value="2">Option2</option>
									<option value="3">Option3</option>
								</select>
								<div class="invalid-feedback">Please Select an Option.</div>
							</div>
						</div>
						<div class="col-12 col-sm-6">
							<div class="form-group">
								<label for="validationCustom06">Select Options2</label> <select
									class="custom-select form-control" id="validationCustom06"
									required>
									<option Value="">Choose...</option>
									<option value="1">One</option>
									<option value="2">Two</option>
									<option value="3">Three</option>
								</select>
								<div class="invalid-feedback">Please Select an Option.</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-12 col-sm-6">
							<div class="form-group">
								<label class="custom-control custom-checkbox "> <input
									type="checkbox" id="validationCustom07"
									class="custom-control-input form-control" required> <span
									class="custom-control-indicator"></span> <span
									class="custom-control-description">Remember my
										preference</span>
								</label>
							</div>
						</div>
						<div class="col-12 col-sm-6">
							<div class="custom-controls-stacked d-block">
								<label class="custom-control custom-radio"> <input
									id="radioStacked1" name="radio-stacked" type="radio"
									class="custom-control-input" required> <span
									class="custom-control-indicator"></span> <span
									class="custom-control-description">Male</span>
								</label> <label class="custom-control custom-radio"> <input
									id="radioStacked2" name="radio-stacked" type="radio"
									class="custom-control-input" required> <span
									class="custom-control-indicator"></span> <span
									class="custom-control-description">Female</span>
								</label>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-12 col-sm-6">
							<div class="form-group">
								<label for="validationCustom08">Message</label>
								<textarea class="form-control" id="validationCustom08" rows="3"
									placeholder="Type Your Message Here..." required></textarea>
								<div class="invalid-feedback">Please Enter Your Message</div>
							</div>
						</div>

						<div class="col-12 col-sm-6">
							<div class="form-group">
								<label for="validationCustom09">Example file input</label> <input
									type="file" class="form-control-file" id="validationCustom09"
									required>
								<div class="invalid-feedback">Please Select File</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-12 col-sm-6">
							<div class="form-group">
								<label for="datepicker">DatePicker</label>
								<div class="form-group">
									<div class="input-group">
										<input type="text" class="form-control" id="datepicker"
											required /> <span class="input-group-addon"> <span
											class="fa fa-calendar"></span>
										</span>
									</div>
								</div>

							</div>
						</div>

						<div class="col-12 col-sm-6">
							<div class="form-group"></div>
						</div>
					</div>


					<div class="row">
						<div class="col-12 col-sm-6">
							<button class="btn btn-primary" type="submit">Submit
								form</button>
						</div>
					</div>
				</form>
                      </form:form>
			</div>

		</div>
	</div>