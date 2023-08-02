package generics;

import java.util.ArrayList;
import java.util.List;

class Shape {
	void draw() {
	}
}

class Circle extends Shape {
	void draw() {
	}
}

class Square extends Shape {
	void draw() {
	}
}

class Rectangle extends Square {
	void draw() {
	}
}

class Artist {

}

public class PECS {
// ? WILDCARD
// ? EXTENDS (PRODUCER) get(index) read only 
// ? SUPER (CONSUMER) add(object) write only
// ArrayList<Actor> arrayList; get(index), add(object)
	// Summarizing the behavior of the ? extends and the ? super wildcards, we draw
	// the following conclusion:
//	PRODUCER EXTENDS (A FARMER PRODUCES CROPS, WE GET (READ) THE CROPS)
	// Use the ? extends wildcard if you need to GET object from a data
	// structure
//	CONSUMER SUPER ( WE SERVE ON THE GUESTS PLATE (CONSUME).
	// Use the ? super wildcard if you need to PUT (ADD) objects in a data structure

	// If you need to do both things, don�t use any wildcard.

	public static void main(String[] args) {
	ArrayList shapesList =	new ArrayList<Shape>();
	shapesList.add(new Shape());
//	PRODUCER
		List<? extends Shape> intList5 = shapesList;
//	       intList5.add(new Shape()); //ERROR
		System.out.println(intList5.get(0));
//	       List<? extends Shape> intList6 = new ArrayList<Artist>(); /ERROR
		List<? extends Shape> intList61 = new ArrayList<Square>();
		List<? extends Shape> intList7 = new ArrayList<Rectangle>();
//	 CONSUMER       
		List<? super Shape> inList5 = new ArrayList<Shape>();
		inList5.add(new Shape());
	}
}
