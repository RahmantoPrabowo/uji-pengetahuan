package com.ujiPengetahuan.OptimalPath;

public class Node {
	private int v;
	private int weight;

	Node(int v, int w) {
		this.v = v;
		this.weight = w;
	}

	int getV() {
		return v;
	}

	int getWeight() {
		return weight;
	}
}
