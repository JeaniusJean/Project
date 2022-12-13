
<body>
	<%@ include file="common/header.jspf" %>
	<%@ include file="common/navigation.jspf" %>
	
	<div class = "container">
	<div>Welcome ${name}</div>
	<div class ="mb-3" id="current_date" ></p>
	<script> document.getElementById("current_date").innerHTML = Date();
	</script></div> 
	<div> <h1>Your tasks for today</h1></div> 
	
	<a href="add-task" class="mb-3 btn btn-success">Create new task</a>
		<table class = "table">
			<thead>
				<tr>
				
				<th>ProjectName</th>
				<th>Description</th>
				<th>Deadline</th>
				<th>Completed</th>
				<th></th>
				<th></th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${tasks}" var="task">
	
			<tr>
				<td>${task.projectName}</td>
				<td>${task.description}</td>
				<td>${task.deadline}</td>
				<td>${task.completed}</td>
				<td><a href = "delete-task?id=${task.id}" class="btn btn-warning">Delete</a></td>
				<td><a href = "edit-task?id=${task.id}" class="btn btn-warning">Edit</a></td>
			</c:forEach>
		</tbody>
	</table>
		
	</div>
	<%@ include file="common/footer.jspf" %>
	</body>
