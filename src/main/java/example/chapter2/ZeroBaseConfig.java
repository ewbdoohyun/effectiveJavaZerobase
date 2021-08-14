package example.chapter2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZeroBaseConfig {

    @Value("${zerobase.address")
    private String address;

}


