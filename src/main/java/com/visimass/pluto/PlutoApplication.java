package com.visimass.pluto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlutoApplication {

	public static void main(String[] args) {
		startUp();
		// SpringApplication.run(PlutoApplication.class, args);
	}

	private static void startUp() {
		System.out.println("\n" +
						"# ------------------------------------- #\n" +
						"#   _____  __     __ __  _____  _____   #\n" +
						"#  |  _  ||  |   |  |  ||_   _||     |  #\n" +
						"#  |   __||  |__ |  |  |  | |  |  |  |  #\n" +
						"#  |__|   |_____||_____|  |_|  |_____|  #\n" +
						"#                                       #\n" +
						"# ------------------------------------- #");
	}

}
