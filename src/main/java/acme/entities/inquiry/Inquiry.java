
package acme.entities.inquiry;

import javax.persistence.Entity;

import acme.entities.debate.Debate;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Inquiry extends Debate {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

}
