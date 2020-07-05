package com.pritam.rest.webservices.restfulwebservices.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoHardcodedService {
    public static List<Todo> todos = new ArrayList();
    public static int idCounter = 0;

    static {
        todos.add(new Todo(++idCounter,"Rakesh","try running", new Date(),false));
        todos.add(new Todo(++idCounter, "Pritam", "Learn Spring", new Date(), false));
        todos.add(new Todo(++idCounter, "Rahul", "Learn React", new Date(), false));
        todos.add(new Todo(++idCounter, "Manish", "Learn MicroServices", new Date(), false));
    }

    public List<Todo> findAll() {
        return todos;
    }
}
