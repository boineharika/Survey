package com.tm.lamda.surveytemplames.model;

import java.io.Serializable;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "tm-survey-template-test")
public class Survey implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@DynamoDBHashKey
    //private String pk;
	private String pk;

      @DynamoDBAttribute
    //@DynamoDBRangeKey
    private String sk;
      @DynamoDBAttribute
    private String surveyTemplateTitle;
   

    @DynamoDBAttribute
    private Map<String, String> data;
    
	/*
	 * @DynamoDBAttribute private String createdDate = Instant.now().toString();
	 * 
	 * @DynamoDBAttribute private String updatedDate = Instant.now().toString();
	 */

	@DynamoDBAttribute
	private String updatedBy;
	
	@DynamoDBAttribute
	private String createdBy;
}