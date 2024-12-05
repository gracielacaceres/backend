package pe.edu.vallegrande.barberia_macha.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
//                .allowedOrigins("http://localhost:4200", "https://9000-idx-barbershopmacha-1729820839509.cluster-m7tpz3bmgjgoqrktlvd4ykrc2m.cloudworkstations.dev") // Agrega el puerto de Flutter
                .allowedOrigins("*") // Permitir cualquier origen
                .allowedMethods("GET", "POST", "PUT", "DELETE","OPTIONS")
                .allowedHeaders("*")
                .maxAge(3600);
    }
}
