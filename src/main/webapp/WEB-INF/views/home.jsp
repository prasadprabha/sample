<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="resources/css/style.css">
<link rel="stylesheet" type="text/css"
	href="resources/css/dataTables.jqueryui.min.css">
<link rel="stylesheet" type="text/css"
	href="resources/css/jquery.dataTables.min.css">
<script type="text/javascript" src="resources/js/jquery.js"></script>
<script type="text/javascript"
	src="resources/js/dataTables.jqueryui.min.js"></script>
<script type="text/javascript"
	src="resources/js/jquery.dataTables.min.js"></script>
<script type="text/javascript"
	src="resources/js/app.js"></script>	
	
<title>Insert title here</title>
</head>
<body>
	<form>
		<div class="container">
			<div class="left">
				<ul class="form-style-1">
					<!--   <li><label>Full Name <span class="required">*</span></label><input type="text" name="field1" class="field-divided" placeholder="First" />&nbsp;<input type="text" name="field2" class="field-divided" placeholder="Last" /></li>
    <li>
        <label>Email <span class="required">*</span></label>
        <input type="email" name="field3" class="field-long" />
    </li> 
     <li>
        <label>Your Message <span class="required">*</span></label>
        <textarea name="field5" id="field5" class="field-long field-textarea"></textarea>
    </li>
    
    -->
					<li>
						<label>Circuit Type</label>
						<select name="circuitType" id="circuitType">
						  <c:forEach var="circuitType" items="${circuitTypes}">
						    <option value="${circuitType.value}">${circuitType.key}</option>
						 <!-- <option value="${item.key}" ${item.key == selectedDept ? 'selected="selected"' : ''}>${item.value}</option>  -->
						  </c:forEach>
						</select>
					</li>
					<li><label>RSI DataSource</label>
					<select name="rsiDataSource" id="rsiDataSource">
						  <c:forEach var="rsiDataSource" items="${rsiDataSources}">
						    <option value="${rsiDataSource.value}">${rsiDataSource.key}</option>
						 <!-- <option value="${item.key}" ${item.key == selectedDept ? 'selected="selected"' : ''}>${item.value}</option>  -->
						  </c:forEach>
						</select>
					
					</li>

					<li><label>ASRI DataSource</label> 
					<select name="asriDataSource" id="asriDataSource">
						  <c:forEach var="asriDataSource" items="${asriDataSources}">
						    <option value="${asriDataSource.value}">${asriDataSource.key}</option>
						 <!-- <option value="${item.key}" ${item.key == selectedDept ? 'selected="selected"' : ''}>${item.value}</option>  -->
						  </c:forEach>
					</select>
					</li>
				</ul>
			</div>
			<div class="center">
			
			</div>
			<div class="right">
			<ul class="form-style-1">
				<li><input type="submit" value="Generate Report" /><br>
					<br>
					<input type="submit" value="Download" /></li>
				</ul>
			</div>
		</div>
		<div class='bottom'>
			<table cellpadding='0' cellspacing='0' border='0'
				class='display jqueryDataTable'>
				<thead>
					<tr>
						<th>Name</th>
						<th>Country</th>
					</tr>
				</thead>
				<tbody>
				</tbody>
			</table>
		</div>
	</form>
</body>
</html>