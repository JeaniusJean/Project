

<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<body>
	<div class="container text - center">
		<div>
		<H1>Sign Up! It's quick and easy.</H1>
		</div>
		
		<form th:action="@{/process_register}" method ="post"
		 th:object="${user}"
		 >
		 <div class="m-3">
		 <div class = "form-group row">
		 <label class ="col-form-label col-4">Email</label>
		 <div class = "col-8">
		 <input type = "email" class="form-control" th:field ="*{email}" required />
		 </div>
		  </div>
		 
		  <div class = "form-group row">
		 <label class ="col-form-label col-4">Password</label>
		 <div class = "col-8">
		 <input type = "password" class="form-control" th:field ="*{password}" required
		 minlength="6" maxlength="20"  />
		 </div>
		  </div>
		 
		 <div class = "form-group row">
		 <label class ="col-form-label col-4">First name</label>
		 <div class = "col-8">
		 <input type = "text" class="form-control" th:field ="*{firstName}" required
		 minlength="2" maxlength="25" />
		 </div>
		  </div>
		 
		 <div class = "form-group row">
		 <label class ="col-form-label col-4">Last name</label>
		 <div class = "col-8">
		 <input type = "text" class="form-control" th:field ="*{lastName}" required 
		 minlength="2" maxlength="30"/>
		 </div>
		  </div>
		 
		 </div>
		 </div>
		 
		 
		 
		 </form>