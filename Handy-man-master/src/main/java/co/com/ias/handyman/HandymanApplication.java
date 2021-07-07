package co.com.ias.handyman;

import co.com.ias.handyman.calculateApplication.model.Calculate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HandymanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HandymanApplication.class, args);

		Calculate calculate = new Calculate();

	/*	Object[] list = new Object[3];
		list[0]="2021-W27";
		list[1]="2021-07-06T21:00";
		list[2]="2021-07-09T22:30";

		for (int i=0;i<list.length;i++){
			System.out.println(list[i]);
		}
		calculate.calcularHoras(list);
*/
	}



}


