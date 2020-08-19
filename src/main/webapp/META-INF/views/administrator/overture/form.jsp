<%--
- form.jsp
-
- Copyright (c) 2019 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="administrator.overture.form.label.title" path="title" />
	<acme:form-textbox code="administrator.overture.form.label.paragraph" path="paragraph" />
	<acme:form-textbox code="administrator.overture.form.label.deadline" path="deadline"/>
	<acme:form-textbox code="administrator.overture.form.label.email" path="email"/>
	<acme:form-textbox code="administrator.overture.form.label.lowMoney" path="lowMoney"/>
	<acme:form-textbox code="administrator.overture.form.label.highMoney" path="highMoney"/>
	<acme:form-submit code="administrator.overture.form.button.create" action="/administrator/inquiry/create"/>
</acme:form>
