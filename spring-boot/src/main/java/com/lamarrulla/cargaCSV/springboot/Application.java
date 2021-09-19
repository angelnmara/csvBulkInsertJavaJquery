package com.lamarrulla.cargaCSV.springboot;

import com.lamarrulla.cargaCSV.springboot.entity.Detalle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@EnableJpaRepositories(considerNestedRepositories = true)
@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "SELECT * FROM detalle";
		List<Detalle> customers = jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(Detalle.class));

		customers.forEach(System.out :: println);
	}

}
