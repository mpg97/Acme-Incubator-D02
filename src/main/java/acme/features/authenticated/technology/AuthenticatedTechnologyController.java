
package acme.features.authenticated.technology;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.components.CustomCommand;
import acme.entities.technology.Technology;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Authenticated;

@Controller
@RequestMapping("/authenticated/technology/")
public class AuthenticatedTechnologyController extends AbstractController<Authenticated, Technology> {

	@Autowired(required = true)
	private AuthenticatedTechnologyShowService			showService;

	@Autowired(required = true)
	private AuthenticatedTechnologyListService			listService;

	@Autowired(required = true)
	private AuthenticatedTechnologyListByStarsService	listByStarsService;


	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addCustomCommand(CustomCommand.LIST_BY_STARS, BasicCommand.LIST, this.listByStarsService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
	}
}
