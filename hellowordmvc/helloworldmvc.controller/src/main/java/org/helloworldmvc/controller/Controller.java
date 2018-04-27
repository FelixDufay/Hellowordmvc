package fr.exia.hellowordmvc;

public class Controller {

		private final IView view;
		private final IModel model;
		
	public Controller(final IView view, final IModel model) {
		this.view = view;
		this.model = model;
	}
	
	public void() {
		this.view.displayMessage(this.model.getHelloWorld());
	}
	
}
