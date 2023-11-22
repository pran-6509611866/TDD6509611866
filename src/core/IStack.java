package core;

public interface IStack {
	boolean isEmpty();
	int getSize();
	void push(Integer elm);
	Integer pop();
	Integer peek();
	Integer top();
}