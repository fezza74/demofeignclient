package aesys.tech.demofeignclient.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoFeignClientConfig {
    @Bean
    public ModelMapper modelMapperBean(){
        return new ModelMapper();
    }
}
