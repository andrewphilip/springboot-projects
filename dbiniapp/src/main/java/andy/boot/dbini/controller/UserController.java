package andy.boot.dbini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import andy.boot.dbini.repo.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/names")
	public List<String> getAllUserNames(){
		return userRepository.getAllUserNames();
	}
	
}
