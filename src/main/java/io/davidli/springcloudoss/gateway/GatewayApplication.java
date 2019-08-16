package io.davidli.springcloudoss.gateway;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@RestController
public class GatewayApplication {

	@RequestMapping(value = "/echo/{name}")
    public String echoStudentName(@PathVariable(name = "name") String name)
    {
        return "<strong style=\"color: red;\">" + name + " </strong> Responsed on : " + new Date();
    }
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
}
