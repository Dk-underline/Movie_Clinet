package com.fullstack.mioveApi.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "reviweIds")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reviwe {
	@Id
	private ObjectId id;
	private String reviweBody;

	public Reviwe(String body) {
		this.setReviweBody(body);
	}

	public String getReviweBody() {
		return reviweBody;
	}

	public void setReviweBody(String reviweBody) {
		this.reviweBody = reviweBody;
	}

}
