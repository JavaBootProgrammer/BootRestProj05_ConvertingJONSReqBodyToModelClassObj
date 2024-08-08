package com.nt.controller;

import com.nt.model.Actor;
import com.nt.model.JobDetails;
import com.nt.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/Actor")
public class ActorController {

	@PostMapping("/report")
	public ResponseEntity<String> getActor(@RequestBody Actor actor) {
		System.out.println("json data coverted"+actor.toString());
		return new ResponseEntity<String>(actor.toString(), HttpStatus.OK);

	}

}
