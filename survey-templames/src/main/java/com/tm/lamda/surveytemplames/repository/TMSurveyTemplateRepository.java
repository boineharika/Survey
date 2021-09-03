package com.tm.lamda.surveytemplames.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tm.lamda.surveytemplames.model.Survey;

@Repository
public interface TMSurveyTemplateRepository extends CrudRepository<Survey, String> {

	void findByPk(Survey input);

}
