package co.com.ias.handyman.infraestructureServiceReport.adapters.in;

import co.com.ias.handyman.applicationServiceReport.model.CreateServiceReportRequest;
import co.com.ias.handyman.applicationServiceReport.ports.in.CreateServiceReportUseCase;
import co.com.ias.handyman.infraestructureServiceReport.commons.UseCaseHttpExecutor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping (path = "/Report")
public class ServiceReportController {
 private final UseCaseHttpExecutor httpExecutor;
    private final CreateServiceReportUseCase createServiceReportUseCase;


    public ServiceReportController(UseCaseHttpExecutor httpExecutor, CreateServiceReportUseCase createServiceReportUseCase) {
        this.httpExecutor = httpExecutor;
        this.createServiceReportUseCase = createServiceReportUseCase;
    }
@PostMapping
    public ResponseEntity createReportHandler(@RequestBody CreateServiceReportRequest request){
    System.out.println(request);
        return httpExecutor.executeUseCase(createServiceReportUseCase,request);
    }
}
