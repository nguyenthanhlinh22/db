package com.dailycodework.project.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000") // Cho phép truy cập từ React
@RestController // Đánh dấu class này là một Rest Controller
@RequestMapping("/api") // Định nghĩa endpoint gốc cho controller
public class HelloController {

    @GetMapping("/hello") // Định nghĩa endpoint GET /api/hello
    public String sayHello() {
        return "Hello, World!";
    }
}
