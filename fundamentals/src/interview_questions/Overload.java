package interview_questions;

public class Overload {

	int x;
	double y;

	void add(int a, int b) {
		x = a + b;
	}

	void add(double c, double d) {
		y = c + d;
	}

	public Overload() {
		this.x = 0;
		this.y = 0;
	}
	
	int height;
	int length;
	int width;

}
