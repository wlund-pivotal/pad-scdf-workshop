package io.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.cloud.task.listener.annotation.AfterTask;
import org.springframework.cloud.task.listener.annotation.BeforeTask;
import org.springframework.cloud.task.repository.TaskExecution;
//import org.springframework.cloud.task.configuration.EnableTask;
//import org.springframework.cloud.task.listener.annotation.AfterTask;
//import org.springframework.cloud.task.listener.annotation.BeforeTask;
//import org.springframework.cloud.task.repository.TaskExecution;
import org.springframework.context.annotation.Bean;

@EnableTask
@SpringBootApplication
public class TasklabApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasklabApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {
//				throw new IllegalStateException("No Task For You!!");
				System.out.println("Hello World");

			}
		};
	}

	@BeforeTask
	public void beforeTask(TaskExecution taskExecution) {
		System.out.println("Before TASK");
	}

	@AfterTask
	public void afterTask(TaskExecution taskExecution) {
		System.out.println("After TASK");
	}

}
