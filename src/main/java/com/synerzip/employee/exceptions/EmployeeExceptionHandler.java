package com.synerzip.employee.exceptions;


import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import com.synerzip.employee.exceptions.ErrorMessage;;

public final class  EmployeeExceptionHandler implements ExceptionMapper<EmployeeException> {

	@Override
	public Response toResponse(final EmployeeException exception) {
		return Response.status(Status.BAD_REQUEST).entity(new ErrorMessage(exception.getMessage())).type(MediaType.APPLICATION_JSON).build();
	}

}
