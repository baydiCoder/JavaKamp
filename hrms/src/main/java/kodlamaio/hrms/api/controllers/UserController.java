package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

		@GetMapping("/getall")
		public List<User> getAll()
		{
			return this.userService.getAll();
		}
		
		@GetMapping("/adduser")
		public void addUser()
		{
			this.userService.insert(new User(3,"b@gmail.com","123","123",false));
		}
}
