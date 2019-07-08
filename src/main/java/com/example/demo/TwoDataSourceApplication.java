package com.example.demo;

import com.example.demo.banco1.model.TableOne;
import com.example.demo.banco1.repository.Table1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class TwoDataSourceApplication implements CommandLineRunner {
	@Autowired
	private Table1Repository rep1;

	@Override
	public void run(String... args) throws Exception {
		System.out.println( "CommandLineRunner" );

		List<TableOne> dataDb1 = rep1.findAll();
		System.out.println( "Db1" );
		dataDb1.forEach( data -> {
			System.out.println("    " + data.getName());
		});

		List<TableOne> dataDb2 = rep1.findAll();
		System.out.println( "Db2" );
		dataDb2.forEach( data -> {
			System.out.println("    " + data.getName());
		});

	}

	public static void main(String[] args) {
		SpringApplication.run(TwoDataSourceApplication.class, args);
	}

}
