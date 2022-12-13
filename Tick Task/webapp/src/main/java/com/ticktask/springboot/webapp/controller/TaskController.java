//package com.ticktask.springboot.webapp.controller;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.SessionAttributes;
//
//import com.ticktask.springboot.webapp.entity.Task;
//import com.ticktask.springboot.webapp.service.TaskService;
//
//import jakarta.validation.Valid;
//
////@Controller
//@SessionAttributes("name")
//public class TaskController {
//	
//	private TaskService taskService;
//	
//	public TaskController(TaskService taskService) {
//		super();
//		this.taskService = taskService;
//	}
//
//	@RequestMapping("task-list")
//	public String listAllTasks(ModelMap model) {
//		String username =getLoggedinUsername(model);
//		List<Task> tasks = taskService.findByUsername(username);
//		model.addAttribute("tasks", tasks);
//		
//		return "taskList";
//	}
//
//	
//	@RequestMapping(value = "add-task", method =RequestMethod.GET)
//	public String showNewTaskPage(ModelMap model) {
//		String username =getLoggedinUsername(model);
//		Task task = new Task(1, username, "", "", LocalDate.now().plusMonths(4), false);
//		model.put("task", task);
//		return "task";
//	}
//	
//	
//	@RequestMapping(value = "add-task", method =RequestMethod.POST)
//	public String addNewTask(ModelMap model,@Valid Task task, BindingResult result) {
//		
//		if(result.hasErrors()) {
//			return "task";
//		}
//		String username =getLoggedinUsername(model);
//		taskService.addTask(username, task.getProjectName(),task.getDescription(), LocalDate.now().plusMonths(1), false);
//		return "redirect:task-list";
//	}
//
//	
//	@RequestMapping("delete-task")
//	public String deleteTask(@RequestParam int id) {
//		
//		taskService.deleteById(id);
//		return "redirect:task-list";
//	}
//	
//	@RequestMapping(value ="edit-task", method = RequestMethod.GET)
//	public String showUpdateTaskPage(@RequestParam int id, ModelMap model) {
//		Task task = taskService.findById(id);
//		model.addAttribute("task", task);
//		return "task";
//	}
//	
//	@RequestMapping(value = "edit-task", method =RequestMethod.POST)
//	public String updateTask(ModelMap model,@Valid Task task, BindingResult result) {
//		if(result.hasErrors()) {
//			return "task";
//		}
//		String username =getLoggedinUsername(model);
//		task.setUsername(username);
//		taskService.updateTask(task);
//		return "redirect:task-list";
//	}
//	
//	private String getLoggedinUsername(ModelMap model) {
//		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		return authentication.getName();
//		
//	}
//	
//
//}
