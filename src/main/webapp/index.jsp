<%@ page import="java.sql.*"%>
<%@ page import="com.DB.DBconnect"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ebook</title>
<%@ include file="all-component/allCSS.jsp"%>
<style type="text/css">
.back-img {
	background: url("images/book2.png");
	height: 70vh;
	width: 100%;
	background-repeat: no-repeat;
	background-size: cover;
}

body {
	background-color: #f7f7f7;
}

.crd-ho:hover {
	background-color: #fcf7f7;
}
</style>
</head>
<body>
	<%@ include file="all-component/navbar.jsp"%>
	<div class="container-fluid back-img">
		<h2 class="text-center text-danger">EBook Management System</h2>
	</div>
    <!-- ----------------------------- Recent Books -------------------------------- -->
	<div class="container">
		<h3 class="text-center">Recent Books</h3>
		<div class="row">
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="images/java.jpg"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p>Java Programming</p>
						<p>Book for java</p>
						<p>Categories:New</p>
						<div class="row text-center">
							<a href="" class="btn btn-danger btn-sm ml-2">Add Cart</a> <a
								href="" class="btn btn-success btn-sm ml-1">View Details</a> <a
								href="" class="btn btn-danger btn-sm ml-1">250</a>
						</div>
					</div>
				</div>
			</div>

			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="images/c++.jpg"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p>C++ Programming</p>
						<p>Book for C++</p>
						<p>Categories:New</p>
						<div class="row text-center">
							<a href="" class="btn btn-danger btn-sm ml-2">Add Cart</a> <a
								href="" class="btn btn-success btn-sm ml-1">View Details</a> <a
								href="" class="btn btn-danger btn-sm ml-1">300</a>
						</div>
					</div>
				</div>
			</div>

			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="images/C.jpg" style="width: 150px; height: 200px"
							class="img-thumblin">
						<p>C Programming</p>
						<p>Book for C</p>
						<p>Categories:New</p>
						<div class="row text-center">
							<a href="" class="btn btn-danger btn-sm ml-2">Add Cart</a> <a
								href="" class="btn btn-success btn-sm ml-1">View Details</a> <a
								href="" class="btn btn-danger btn-sm ml-1">280</a>
						</div>
					</div>
				</div>
			</div>


			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="images/db.jpg"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p>Database Fundamentals</p>
						<p>Book for Database</p>
						<p>Categories:New</p>
						<div class="row text-center">
							<a href="" class="btn btn-danger btn-sm ml-2">Add Cart</a> <a
								href="" class="btn btn-success btn-sm ml-1">View Details</a> <a
								href="" class="btn btn-danger btn-sm ml-1">400</a>
						</div>
					</div>
				</div>
			</div>

		</div>
	</div>

<!-- ----------------------------- Old Books -------------------------------- -->
	<div class="container">
		<h3 class="text-center">Old Books</h3>
		<div class="row">
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="images/java_old.jpg"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p>Java Programming</p>
						<p>Book for java</p>
						<p>Categories:Old</p>
						<div class="row text-center">
							<a href="" class="btn btn-danger btn-sm ml-2">Add Cart</a> <a
								href="" class="btn btn-success btn-sm ml-1">View Details</a> <a
								href="" class="btn btn-danger btn-sm ml-1">450</a>
						</div>
					</div>
				</div>
			</div>

			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="images/c++_old.jpg"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p>C++ Programming</p>
						<p>Book for C++</p>
						<p>Categories:Old</p>
						<div class="row text-center">
							<a href="" class="btn btn-danger btn-sm ml-2">Add Cart</a> <a
								href="" class="btn btn-success btn-sm ml-1">View Details</a> <a
								href="" class="btn btn-danger btn-sm ml-1">500</a>
						</div>
					</div>
				</div>
			</div>

			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="images/C_old.png"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p>C Programming</p>
						<p>Book for C</p>
						<p>Categories:Old</p>
						<div class="row text-center">
							<a href="" class="btn btn-danger btn-sm ml-2">Add Cart</a> <a
								href="" class="btn btn-success btn-sm ml-1">View Details</a> <a
								href="" class="btn btn-danger btn-sm ml-1">550</a>
						</div>
					</div>
				</div>
			</div>


			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="images/db_old.jpg"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p>Database Fundamentals</p>
						<p>Book for Database</p>
						<p>Categories:Old</p>
						<div class="row text-center">
							<a href="" class="btn btn-danger btn-sm ml-2">Add Cart</a> <a
								href="" class="btn btn-success btn-sm ml-1">View Details</a> <a
								href="" class="btn btn-danger btn-sm ml-1">600</a>
						</div>
					</div>
				</div>
			</div>

		</div>
	</div>


</body>
</html>