# spring-boot入门学习

#pom.xml引用配置

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
    </dependencies>
        
#application.properties配置
   指定服务访问端口
     
    server.port=8080

#服务启动入口

运行main方法即可启动

    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.ResponseBody;
    
    @SpringBootApplication
    @Controller
    public class SpringBootSimpleApplication {
    
        @RequestMapping(value = {"/", "index"})
        @ResponseBody
        public String welcome() {
            return "Welcome to spring boot simple!";
        }
    
        public static void main(String[] args) {
            SpringApplication.run(SpringBootSimpleApplication.class, args);
        }
    }
