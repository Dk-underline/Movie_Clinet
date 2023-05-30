package com.fullstack.mioveApi.entity;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Movie {
	@Id
	private ObjectId id;

	private String imdbId;

	private String title;

	private String releaseDate;

	private String trailerLink;

	private String poster;

	private List<String> geners;

	private List<String> backdrops;
	@DocumentReference
	private List<Reviwe> reviweIds;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getImdbId() {
		return imdbId;
	}

	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getTrailerLink() {
		return trailerLink;
	}

	public void setTrailerLink(String trailerLink) {
		this.trailerLink = trailerLink;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public List<String> getGeners() {
		return geners;
	}

	public void setGeners(List<String> geners) {
		this.geners = geners;
	}

	public List<String> getBackdrops() {
		return backdrops;
	}

	public void setBackdrops(List<String> backdrops) {
		this.backdrops = backdrops;
	}

	public List<Reviwe> getReviweIds() {
		return reviweIds;
	}

	public void setReviweIds(List<Reviwe> reviweIds) {
		this.reviweIds = reviweIds;
	}

}
