package com.rakuten.internship;

import java.util.List;

import com.rakuten.internship.entity.Todo;
import com.rakuten.internship.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * このクラスは、ウェブアプリケーションの挙動を制御するためのコントローラークラスです。。
 * コントローラーとして使えるように、コードを記入してください。
 */
@Controller
public class TodoController {

    // TODO 必要なメンバーを宣言してください。
    @Autowired
    private TodoService serv;

    @GetMapping("/")
    public String home(Model model) {
        // TODO 必要なコードを作成してください。
        List<Todo> todo = serv.findTodos();
        model.addAttribute("todos",todo);
        return "home";
    }

    @GetMapping("/create")
    public String create() {
        // TODO 必要なコードを作成してください。
        return "create";
    }

    @PostMapping("/create")
    public String createTodo(@ModelAttribute Todo todo) {
        // TODO 必要なコードを作成してください。
        serv.save(todo);
        return "complete";
    }
}
