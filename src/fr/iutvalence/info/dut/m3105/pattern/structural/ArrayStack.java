package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayStack<E> implements Stack<E> {
	
	private E[] tab;
	private int index;
	
	public ArrayStack ()
	{
		this.tab=(E[]) new Object[10];
		this.index=0;
	}

	@Override
	public void push(E element) {
		// TODO Auto-generated method stub
		tab[index]=element;
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		
		return this.index;
	}

}
