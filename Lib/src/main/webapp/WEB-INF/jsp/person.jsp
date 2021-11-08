<%@ include file="common/header.jspf"%>

<div class="container">
	<p>Add new Zmogus:</p>
	<p>Valid fields for quick checkup- email: lukas@gmail.com phone- +37068612345 password- P@assword12345</p>
	<form:form method="post" modelAttribute="person">

		<form:input path="id" type="hidden" required="required" />
		<form:errors path="id" />

		<form:label path="name">Name:</form:label>
		<form:input path="name" type="text" required="required" />
		<form:errors path="name" />

		<form:label path="surname">Surname:</form:label>
		<form:input path="surname" type="text" required="required" />
		<form:errors path="surname" />

		<form:label path="number">Number:</form:label>
		<form:input path="number" type="text" required="required" />
		<form:errors path="number" />

		<form:label path="email">Email:</form:label>
		<form:input path="email" type="text" required="required" />
		<form:errors path="email" />

		<form:label path="address">Address:</form:label>
		<form:input path="address" type="text" required="required" />
		<form:errors path="address" />

		<form:label path="password">Password</form:label>
		<form:input path="password" type="text" required="required" />
		<form:errors path="password" />

		<button type="submit">OK</button>
	</form:form>
</div>
