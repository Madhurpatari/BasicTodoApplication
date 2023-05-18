package com.Geekster.ToDo.Repository;

import com.Geekster.ToDo.Model.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {
    private List<Todo> todoList;//data source for all our todos

    public TodoRepository() {
        todoList = new ArrayList<>() ;
        //not needed ...done for testing
        todoList.add(new Todo("0","Dummy Todo for Testing",true));
    }

    public List<Todo> getTodosFromDataSource(){
        return todoList;
    }

    public boolean save(Todo todo) {
        todoList.add(todo);
        return true;
    }

    public boolean remove(Todo todo) {
        todoList.remove(todo);
        return true;
    }

    public boolean update(String id, boolean status) {
        boolean updateStatus = false;
        for(Todo todo : todoList) {
            if(todo.getId().equals(id)) {
                remove(todo);
                todo.setTodoStatus(status);
                save(todo);
                return true;
            }
        }
        return false;
    }
}
