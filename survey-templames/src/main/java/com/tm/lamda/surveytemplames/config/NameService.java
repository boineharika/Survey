package com.tm.lamda.surveytemplames.config;

import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.tm.lamda.surveytemplames.model.Survey;
import com.tm.lamda.surveytemplames.repository.TMSurveyTemplateRepository;

@Service
public class NameService implements Consumer<String>{
	
	@Autowired 
	TMSurveyTemplateRepository surveyTemplateRepository;

	@Bean
	public void accept(String t) {
		System.out.println(t);
		surveyTemplateRepository.save(new Survey("name", "name 1", "name 3", null, "Tets 1", "Test 2"));
		
	}

}
