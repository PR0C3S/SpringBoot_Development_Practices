package com.pucmm.practica5;


import com.pucmm.practica5.services.seguridad.SeguridadServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Locale;

@SpringBootApplication


public class Practica5Application implements CommandLineRunner {
    @Autowired
    private Environment environment;


    public static void main(String[] args) throws InterruptedException{
        ApplicationContext applicationContext = SpringApplication.run(Practica5Application.class, args);
        SeguridadServices seguridadServices = (SeguridadServices) applicationContext.getBean("seguridadServices");
        seguridadServices.createAdminUser();
    }

    @Override
    public void run(String... args) throws Exception {
        //leyendo la información de las variables.
        String db_nombre = environment.getProperty("NOMBRE_APP");
        String direccionDb = environment.getProperty("DB_HOST");
        System.out.println("Nombre de la Aplicación = "+db_nombre);
        System.out.println("Dirección de la Aplicación = "+direccionDb);

    }

    @Controller
    public class InicialController{
        @GetMapping(path ="/")
        public String getListaUsuarios(Model model, Locale locale, HttpSession sesion, HttpServletRequest request){
            return "redirect:/practica5/listarMock";
        }
    }
}
