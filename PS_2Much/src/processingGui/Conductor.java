package processingGui;

import java.util.ArrayList;

import processing.core.PApplet;

public class Conductor {
	PApplet parent;
	ArrayList<Shapes> shapes = new ArrayList<Shapes>();

	
	
	Conductor(PApplet p){
		parent = p;
		shapes.add(new BackDrop(parent));
		shapes.add(new Circle(parent));
		shapes.add(new Triangle(parent));
		shapes.add(new XShape(parent));
	}
	
	//delegates each char to a note in shapes to do something
	public void key(char key) {
		switch (key){
		case 'a': shapes.get(0).pulse(); break;
		case 's': shapes.get(1).pulse(); break;
		case 'd': shapes.get(2).pulse(); break;
		}
	}
	
	//making shapes physical 
	
	
	
	
	//updates all the shapes on the screen
	public void update() {
		for(int i=0; i<shapes.size(); i++){
			shapes.get(i).setShapes(shapes);
			shapes.get(i).collide();
			shapes.get(i).move();
			shapes.get(i).display();
			
		}
		
	}
}
