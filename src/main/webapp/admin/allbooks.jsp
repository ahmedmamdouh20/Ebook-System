<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.DataInp.BookDataImpl"%>
<%@ page import="com.DB.DBconnect"%>
<%@ page import="com.Entity.BookDetails"%>
<%@ page import=" java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin: All Books</title>
<%@ include file="allCSS.jsp"%>
</head>
<body>
	<%@ include file="navbar.jsp"%>
	<c:if test="${not empty succMsg }">
		<p class="text-center text-success">${succMsg}</p>
		<c:remove var="succMsg" scope="session" />
	</c:if>

	<c:if test="${not empty failMsg }">
		<p class="text-center text-danger">${failMsg}</p>
		<c:remove var="failMsg" scope="session" />
	</c:if>
	<table class="table table-striped">
		<thead class="bg-primary text-white">

			<tr>
				<th scope="col">ID</th>
				<th scope="col">Book Name</th>
				<th scope="col">Author</th>
				<th scope="col">Price</th>
				<th scope="col">Category</th>
				<th scope="col">Status</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<tbody>
			<%
			BookDataImpl bdi = new BookDataImpl(DBconnect.getConn());
			List<BookDetails> list = bdi.getAllBooks();
			for (BookDetails b : list) {
			%>
			<tr>
				<td><%=b.getBookID()%></td>
				<td><%=b.getName()%></td>
				<td><%=b.getAuthor()%></td>
				<td><%=b.getPrice()%></td>
				<td><%=b.getCategory()%></td>
				<td><%=b.getStatus()%></td>
				<td><a href="edit.jsp?id=<%=b.getBookID()%>"
					class="btn btn-sm btn-primary">Edit</a> 
					<a href="../delete?id=<%=b.getBookID()%>" class="btn btn-sm btn-danger">Delete</a></td>

			</tr>
			<%
			}
			%>
		</tbody>
	</table>

</body>
</html>