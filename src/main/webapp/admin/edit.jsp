<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="com.DataInp.BookDataImpl"%>
<%@ page import="com.DB.DBconnect"%>
<%@ page import="com.Entity.BookDetails"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>
<%@ include file="allCSS.jsp"%>

</head>
<body style="background-color: #f0f2f2">
	<%@ include file="navbar.jsp"%>
	<div class="container">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body ">
						<h4 class="text-center">Edit Book</h4>

						<%
						int id = Integer.parseInt(request.getParameter("id"));
						BookDataImpl bdi = new BookDataImpl(DBconnect.getConn());
						BookDetails b = bdi.getBook(id);
						%>


						<form action="../edit" method="post">
							<div class="form-group">
								<input type="hidden" class="form-control" name="id"
									value="<%=b.getBookID()%>"> <label
									for="exampleInputEmail1">Book Name*</label> <input type="text"
									class="form-control" id="exampleInputEmail1"
									required="required" name="bname" value="<%=b.getName()%>">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Author Name*</label> <input
									type="text" class="form-control" id="exampleInputEmail1"
									required="required" name="author" value="<%=b.getAuthor()%>">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Price</label> <input
									type="number" class="form-control" id="exampleInputEmail1"
									required="required" name="price" value="<%=b.getPrice()%>">
							</div>
							<div class="form-group">
								<label for="inputState">Book Categories</label> <select
									class="form-control" id="inputState" name="btype">
									<option selected value="new">New Book</option>
									<option value="old">Old Book</option>
								</select>
							</div>
							<div class="form-group">
								<label for="inputState">Book Status</label> <select
									class="form-control" id="inputState" name="bstatus">
									<%
									if ("Active".equalsIgnoreCase(b.getStatus())) {
									%>
									<option value="Inactive">Inactive</option>
									<%
									} else {
									%>
									<option value="Active">Active</option>
									<%
									}
									%>

								</select>
							</div>
							<button type="submit" class="btn btn-primary">Apply</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>