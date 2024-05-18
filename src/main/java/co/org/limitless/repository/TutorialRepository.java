package co.org.limitless.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.org.limitless.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
	// Custom finder methods:
	// The implementation is plugged in by Spring Data JPA automatically.
	List<Tutorial> findByPublished(boolean published);

	List<Tutorial> findByTitleContaining(String title);

}
