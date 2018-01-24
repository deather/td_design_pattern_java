package listener.core;

import java.util.ArrayList;
import java.util.List;

public class Central {
	private List<Actor> actors = new ArrayList<>();

	public void register(Actor actor) {
		this.actors.add(actor);
	}

	public void unregister(Actor actor) {
		this.actors.remove(actor);
	}

	public void notifyActors(Alert alert) {
		for (Actor actor : this.actors) {
			if (actor.isConcerned(alert))
				actor.alert(alert);
		}
	}
}
