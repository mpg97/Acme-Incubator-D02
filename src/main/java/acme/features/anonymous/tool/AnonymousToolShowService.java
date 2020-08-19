
package acme.features.anonymous.tool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.tool.Tool;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractShowService;

@Service
public class AnonymousToolShowService implements AbstractShowService<Anonymous, Tool> {

	@Autowired
	private AnonymousToolRepository repository;


	@Override
	public boolean authorise(final Request<Tool> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<Tool> request, final Tool entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "sector", "inventor", "description", "web", "email", "openSource");

	}

	@Override
	public Tool findOne(final Request<Tool> request) {
		assert request != null;

		Tool result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findToolById(id);

		return result;
	}

}
