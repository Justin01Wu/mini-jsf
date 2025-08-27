<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8" />
<title>Testing JSF page</title>
<meta name="viewport" content="width=device-width, initial-scale=1" />
</head>
<body>
	<f:view>
		<h:form id="mainForm" styleClass="no-space">
			<p class="page-title">Edit Deal - Region/Peril/Model Matrix</p>
			<c:forEach items="${boardMatrixEditAction.matrixList}" var="aaa"
				varStatus="stat">
				<c:out value="${aaa}" />
				<br />
			</c:forEach>

			<h1>Risk Group</h1>
			<c:forEach items="${boardMatrixEditAction.catProviderList}"
				var="model" varStatus="stat">

				<c:out value="${model.id}" />  - <c:out value="${model.name}" />
				<br />
			</c:forEach>

		</h:form>
	</f:view>
</body>
</html>