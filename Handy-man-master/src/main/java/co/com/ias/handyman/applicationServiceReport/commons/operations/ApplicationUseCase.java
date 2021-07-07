package co.com.ias.handyman.applicationServiceReport.commons.operations;

public interface ApplicationUseCase <IN extends ApplicationRequest, OUT extends ApplicationResponse >{
    OUT execute (IN request);
}
