package co.com.ias.handyman.calculateInfraestructure.adapters.in;

import co.com.ias.handyman.applicationServiceReport.domain.ServiceReport;
import co.com.ias.handyman.applicationServiceReport.domain.TechnicalIdentification;
import co.com.ias.handyman.calculateApplication.domain.CalculateDates;
import co.com.ias.handyman.calculateApplication.model.Calculate;
import co.com.ias.handyman.calculateApplication.model.CreateCalculationRequest;
import co.com.ias.handyman.calculateApplication.ports.in.CreateCalculationUseCase;
import co.com.ias.handyman.calculateInfraestructure.adapters.out.SqlRepositoryCalculate;
import co.com.ias.handyman.infraestructureServiceReport.commons.UseCaseHttpExecutor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@Controller
@RequestMapping (path = "/Calculate")
public class CalculationController {
    private final UseCaseHttpExecutor useCaseHttpExecutor;
    private final CreateCalculationUseCase createCalculationUseCase;
    private final SqlRepositoryCalculate repositoryCalculate;

    public CalculationController(UseCaseHttpExecutor useCaseHttpExecutor, CreateCalculationUseCase createCalculationUseCase, SqlRepositoryCalculate repositoryCalculate) {
        this.useCaseHttpExecutor = useCaseHttpExecutor;
        this.createCalculationUseCase = createCalculationUseCase;
        this.repositoryCalculate = repositoryCalculate;
    }


    @PostMapping
    public ResponseEntity getServiceReportById (@RequestBody  CreateCalculationRequest technicalIdentification){
        return useCaseHttpExecutor.executeUseCase(createCalculationUseCase,technicalIdentification);
    }

    @PostMapping ("/fechas/{fechas}")
    @ResponseBody
    public Object[] recibirFechas(@PathVariable Object[] fechas){
        Calculate calculate = new Calculate();
        return calculate.calcularHoras(fechas);
    }


}
