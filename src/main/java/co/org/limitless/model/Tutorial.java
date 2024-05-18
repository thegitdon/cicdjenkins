package co.org.limitless.model;

import javax.persistence.*;

@Entity
@Table(name = "tutorial")
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String title;

	@Column
	private boolean published;

	public Tutorial() {
	}

	public Tutorial(String title, boolean published) {
		this.title = title;
		this.published = published;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public boolean isPublished() {
		return published;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", published=" + published + "]";
	}

}
