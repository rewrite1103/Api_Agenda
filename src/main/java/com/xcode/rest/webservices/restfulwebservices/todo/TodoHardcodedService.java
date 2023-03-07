package com.xcode.rest.webservices.restfulwebservices.todo;

import java.util.Date;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class TodoHardcodedService {

	private static List<Todo> todos = new ArrayList<Todo>();
	private static int CounterId = 0;
	
	static {

		todos.add(new Todo(++CounterId,"Elton","Super Description", new Date(),true )); 
		todos.add(new Todo(++CounterId,"Jorge","Programador Junior", new Date(),true ));
		todos.add(new Todo(++CounterId,"SlenderMan","Vendedor de enchiladas", new Date(),false ));
	}
	public List<Todo> findAll(){
		return todos;
	}
	
	public Todo save(Todo todo) {
		if(todo.getId()==-1 || todo.getId()==0) {
			todo.setId(++CounterId);
			todos.add(todo);
		}else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
	public Todo deleteById(long id) {
		Todo todo = findById(id);
		if(todo==null) return null;
		if(todos.remove(todo)) {
			return todo;
		}
		else {
			return null;
		}
		
	}

	public Todo findById(long id) {
		// TODO Auto-generated method stub
		for(Todo todo:todos) {
			if(todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}
	
	

}
