package br.com.viniciuslima.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.viniciuslima.todolist.entity.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
