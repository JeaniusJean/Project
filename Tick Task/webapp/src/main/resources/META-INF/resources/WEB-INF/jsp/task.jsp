
<body>
	<%@ include file="common/header.jspf"%>
	<%@ include file="common/navigation.jspf"%>


	<div class="container">
		<h1>Welcome ${name}! Enter your new tasks</h1>
		<form:form method="post" modelAttribute="task">

			<fieldset class="mb-3">
				<form:label path="projectName"> Project Name</form:label>
				<form:input type="text" path="projectName" />
				<form:errors path="projectName" cssClass="text-warning" />
			</fieldset>

			<fieldset class="mb-3">
				<form:label path="description"> Description</form:label>
				<form:input type="text" path="description" required="required" />
				<form:errors path="description" cssClass="text-warning" />
			</fieldset>

			<fieldset class="mb-3">
				<form:label path="deadline"> Deadline </form:label>
				<form:input type="text" path="deadline" required="required" />
				<form:errors path="deadline" cssClass="text-warning" />
			</fieldset>

			<fieldset class="mb-3">
				<form:label path="completed"> Completed </form:label>
				<form:checkbox value="false" path="completed" />
				<form:errors path="completed" cssClass="text-warning" />
			</fieldset>

			<form:input type="hidden" path="id" />

			<input type="submit" class="btn btn-success" />

		</form:form>

	</div>
	<div><%@ include file="common/footer.jspf" %></div>
	<script type="text/javascript">
		$('#deadline').datepicker({
			format : 'dd-mm-yyyy'
		});
		
	</script>
	
	

</body>
</html>