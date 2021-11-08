<%@ include file="common/header.jspf"%>

<div class="container">
    <H1>List:</H1>

    <!--
<p>${people}</p>
-->

    <table border="1">
        <thead>
        <tr>
            <th>Id</th><th>Name</th><th>Surname</th><th>Number</th><th>Email</th><th>Address</th><th>Password</th><th>Update</th><th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${people}" var="zm">
            <tr>
                <td>${zm.id}</td>
                <td>${zm.name}</td>
                <td>${zm.surname}</td>
                <td>${zm.number}</td>
                <td>${zm.email}</td>
                <td>${zm.address}</td>
                <td>${zm.password}</td>
                <td><a type="button" href="/update-person/${zm.id}">UPDATE</a></td>
                <td><a type="button" href="/delete-person/${zm.id}">DELETE</a></td>
            </tr>
        </c:forEach>

        </tbody>
    </table>

    <div>
        <a href="add-person">ADD person</a>
    </div>
</div>
<%@ include file="common/footer.jspf"%>