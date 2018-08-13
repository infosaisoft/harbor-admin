<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	

		<!-- Top Fixed Header -->
		<div class="content_header">
			<div class="container-fluid">
				<div class="row">
					<div class="col-12 col-sm-6">
						<div class="logo_section">
							<span>Harbor Admin</span>
						</div>
					</div>
					<div class="col-12 col-sm-6">
						<ul class="head_right_section">
							<li>Welcome! <span id="shopName"></span></li>
							<li><a id="logoutSession" href="#"><i
									class="fa fa-sign-out"></i> Logout</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>

		<!-- Fixed Left Menu start -->
		<div class="left_header_section">

			<div class="head_left_section" id="menu_tgl_btn">
				<i class="fa fa-indent"></i>
			</div>
			<div class="menu_blank_sect"></div>
			<ul class="left_nav_menu">
				<li><a href="index.html"><i class="fa fa-tachometer"></i>
						Dashboard</a></li>
				<li class="active_li"><a class="left_main_menu"
					href="javascript:void();"><i class="fa fa-tachometer"></i>
						Admin Management <i class="fa fa-angle-right float-right m-top5"></i></a>
					<ul class="left_sub_menu">
						<li><a href="AddAdmin"><i class="fa fa-caret-right"></i>Add
								  Admin</a></li>
						<li><a href=""><i class="fa fa-caret-right"></i>
								 view Admin</a></li>
					</ul></li>
				<li><a class="left_main_menu" href=""><i
						class="fa fa-tachometer"></i> Disease <i
						class="fa fa-angle-right float-right m-top5"></i></a>
					<ul class="left_sub_menu">
						<li><a href="adddisease"><i class="fa fa-caret-right"></i>adddisease
								Cases</a></li>
						<li><a href="getall"><i class="fa fa-caret-right"></i>View Disease
								</a></li>
					</ul></li>
				<li><a class="left_main_menu" href="hospitalAdmin"><i
						class="fa fa-tachometer"></i> Hospital Admin <i
						class="fa fa-angle-right float-right m-top5"></i></a>
					<ul class="left_sub_menu">
						<li><a href="viewhospital"><i class="fa fa-caret-right"></i>View
								Hospital Admin</li>
						<li><a href="#"><i class="fa fa-caret-right"></i>Manage
								Cases</a></li>
					</ul></li>
				<li><a class="left_main_menu" href="#"><i
						class="fa fa-tachometer"></i> Case Study <i
						class="fa fa-angle-right float-right m-top5"></i></a>
					<ul class="left_sub_menu">
						<li><a href="#"><i class="fa fa-caret-right"></i>View
								Cases</a></li>
						<li><a href="#"><i class="fa fa-caret-right"></i>Manage
								Cases</a></li>
					</ul></li>
				<li></li>

			</ul>

		</div>
