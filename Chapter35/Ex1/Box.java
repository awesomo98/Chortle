class Box {
	double width, height, length;

	public Box(double inwidth, double inheight, double inlength) {
		width = inwidth;
		height = inheight;
		length = inlength;
	}

	public Box(double side) {
		width = side;
		height = side;
		length = side;
	}

	public double area() {
		return ((2 * (width * height)) + (2 * (height * length)) + (2 * (width * length)));
	}

	public double volume() {
		return (width*height*length);
	}
}