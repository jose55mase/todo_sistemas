package com.development.todo1;

import com.development.todo1.entity.ProductEntity;
import com.development.todo1.entity.RolEntity;
import com.development.todo1.entity.UserEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Todo1Application {
	private static EntityManager manager;
	private static EntityManagerFactory emf;

	public static void main(String[] args) {
		SpringApplication.run(Todo1Application.class, args);

			emf = Persistence.createEntityManagerFactory("aplicacion");
			manager = emf.createEntityManager();

			RolEntity rol = new RolEntity("Administrador",true);
			manager.getTransaction().begin();
			manager.persist(rol);
			manager.getTransaction().commit();
			System.out.println("----> Rol 'Administrador' Creado");

			UserEntity user = new UserEntity("Master","15888","301633",1L,"Manager",true,0L,"jj","jj");
			manager.getTransaction().begin();
			manager.persist(user);
			manager.getTransaction().commit();
			System.out.println("----> Usuario 'Administrador' Creado");



	}


}
