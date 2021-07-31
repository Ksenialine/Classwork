package by.academy.lesson9;

import java.io.Serializable;

import by.academy.lesson6.Cat;

public class MinMax<T extends Comparable<String>, V extends Animal & Serializable, K extends Number> {
	private T variableT;
	private V variableV;
	private K variableK;

	public MinMax() {
		super();
	}

	public MinMax(T variableT, V variableV, K variableK) {
		this.variableT = variableT;
		this.variableV = variableV;
		this.variableK = variableK;
	}

	public T getVariableT() {
		return variableT;
	}

	public void setVariableT(T variableT) {
		this.variableT = variableT;
	}

	public V getVariableV() {
		return variableV;
	}

	public void setVariableV(V variableV) {
		this.variableV = variableV;
	}

	public K getVariableK() {
		return variableK;
	}

	public void setVariableK(K variableK) {
		this.variableK = variableK;
	}

	public String getTName() {
		return variableT.getClass().getName();
	}

	public String getKName() {
		return variableK.getClass().getName();
	}

	public String getVName() {
		return variableV.getClass().getName();
	}

	public static void main(String... args) {
		MinMax<String, Cat, Integer> demo = new MinMax<>("sdgsd", new Cat(), 45645);
		System.out.println(demo.getTName());
		System.out.println(demo.getKName());
		System.out.println(demo.getVName());
	}
}
