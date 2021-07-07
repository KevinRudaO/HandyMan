package co.com.ias.handyman.applicationServiceReport.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class ServiceIdentificationTest {

    @Test
    void isNotValidId(){
        //Arrange
        String nullId =null;

        //Act
        Executable operation =()->
                new TechnicalIdentification(nullId);
        //Assert
        assertThrows(NullPointerException.class,operation);

    }
    @Test
    void emptyStringIsNotValidIdentification(){
        //Arrange
        String emptyString ="";


        //Act
        Executable operation =()->
                new TechnicalIdentification(emptyString);
        //Assert
        assertThrows(IllegalArgumentException.class,operation);

    }
    @Test
    void whiteSpaceStringIsNotValidIdentification(){
        //Arrange
        String emptyStringSpace =" ";


        //Act
        Executable operation =()->
                new TechnicalIdentification(emptyStringSpace);
        //Assert
        assertThrows(IllegalArgumentException.class,operation);

    }

}