package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * bus需要kafka的配置信息，config server的链接git的地址和账号
 * 确保kafka是打开状态
 * management.security.enabled: false 关闭安全认证
 * curl -X POST http://localhost:9901/bus/refresh 向bus总线发送git上更新数据的刷新请求（post）
 */
@EnableConfigServer
@SpringBootApplication
public class TestConfigServerBusKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestConfigServerBusKafkaApplication.class, args);
	}
}
