package co.com.ias.handyman.applicationServiceReport.domain;

import co.com.ias.handyman.applicationServiceReport.commons.NonEmptyFinishDate;
import co.com.ias.handyman.applicationServiceReport.commons.NonEmptyStartDate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class ServiceReportTest {
    @Test
    void isNotValidId(){
        //Arrange
        TechnicalIdentification nullTechId =null;
        ServiceIdentification nullServiceId =null;
        NonEmptyStartDate nulStartDate =null;
        NonEmptyFinishDate nullFinishDate =null;

        //Act
        Executable operation =()->
                new ServiceReport(nullTechId,nullServiceId,nulStartDate,nullFinishDate);
        //Assert
        assertThrows(NullPointerException.class,operation);

    }

}