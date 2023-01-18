package com.StudentManagmentSystem.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.StudentManagmentSystem.sms.entity.Student;
import com.StudentManagmentSystem.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagmentSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*Student student1 = new Student("Amruta","Patil", "amruta@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("Mahendra","Nikam","mahendra@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("Isha","Rathode","isha@gmail.com");
		studentRepository.save(student3);
		
		Student student4 = new Student("Ashwini","Pawar","ashwini@gmail.com");
		studentRepository.save(student4);*/
		
		
	}

}
