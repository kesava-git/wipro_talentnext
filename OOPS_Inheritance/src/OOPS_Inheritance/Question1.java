package OOPS_Inheritance;

public class Question1 {
	public static void main(String[] args) {
		Box box=new Box(3,4,5);
		int volume=box.volume(box.height,box.width,box.depth);
		System.out.println(volume);
	}
}
class Box{
	int width;
	int height;
	int depth;
	public Box(int width,int height,int depth) {
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
	int volume(int height,int width,int depth) {
		return height*width*depth;
	}
}
