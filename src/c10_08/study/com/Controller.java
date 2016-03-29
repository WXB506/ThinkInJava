package c10_08.study.com;

import java.util.ArrayList;
import java.util.List;

public class Controller {
	private List<Event> eventList = new ArrayList<Event>();
	public void addEvent(Event c) {
		eventList.add(c);
	}
	public void run() {
		while(eventList.size() > 0) {
			for(Event event : new ArrayList<Event>(eventList))
				if(event.ready()) {
					System.out.println(event);
					event.action();
					eventList.remove(event);
				}
		}
	}
}
