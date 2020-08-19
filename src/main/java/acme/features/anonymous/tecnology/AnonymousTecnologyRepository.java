
package acme.features.anonymous.tecnology;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;

import acme.entities.tecnology.Tecnology;
import acme.framework.repositories.AbstractRepository;

public interface AnonymousTecnologyRepository extends AbstractRepository {

	@Query("select t from Tecnology t")
	Collection<Tecnology> findAllTecnologies();

	@Query("select t from Tecnology t where t.id = ?1")
	Tecnology findTecnologyById(int id);
}
