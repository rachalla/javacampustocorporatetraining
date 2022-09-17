class TextField implements Widget { // 3. "Core" class with "isa" rel
	private int width, height;

	public TextField(int w, int h) {
		width = w;
		height = h;
	}

	public void draw() {
		System.out.println("TextField: " + width + ", " + height);
	}
}