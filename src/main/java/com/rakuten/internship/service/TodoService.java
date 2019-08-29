package com.rakuten.internship.service;

import java.util.List;

import com.rakuten.internship.entity.Todo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import com.rakuten.internship.repository.TodoRepository;

/**
 * このクラスは、データベースとのトランザクションをサポートするサービスクラスです。。
 */
@Service
@Transactional
public class TodoService {

    // TODO 必要なメンバーを宣言してください。
    @Autowired
    private TodoRepository repo;

    public List<Todo> findTodos(){
        // TODO 必要なコードを作成してください。
        return repo.findAll();
    }

    public Todo save(Todo todo) {
        // TODO 必要なコードを作成してください。
        return repo.save(todo);
    }
}