package com.ujiPengetahuan.OptimalPath;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
	private int v;
	private LinkedList<Node>[] nodes;

	public Graph(int v) {
		this.v = v;
		nodes = new LinkedList[this.v];
		for (int i = 0; i < v; ++i) {
			nodes[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int u, int v, int weight) {
		Node node = new Node(v, weight);
		nodes[u].add(node);// Add v to u's list
	}
	
	public void topologicalLongestUtil(int v, Boolean visited[],Stack<Integer> stack) {
		visited[v] = true;

		Iterator<Node> it = nodes[v].iterator();
		while (it.hasNext()) {
			Node node = it.next();
			if (!visited[node.getV()]) {
				topologicalLongestUtil(node.getV(), visited, stack);
			}
		}

		stack.push(v);
	}

	public String longestPath(int s) {
		Stack<Integer> stack = new Stack<>();
		int[] dist = new int[v];

		Boolean[] visited = new Boolean[v];
		for (int i = 0; i < v; i++) {
			visited[i] = false;
		}

		for (int i = 0; i < v; i++) {
			if (!visited[i]) {
				topologicalLongestUtil(i, visited, stack);
			}
		}

		for (int i = 0; i < v; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		
		dist[s] = 0;

		while (!stack.empty()) {
			int u = (int) stack.pop();
			if (dist[u] != Integer.MAX_VALUE) {
				Iterator<Node> it;
				it = nodes[u].iterator();
				while (it.hasNext()) {
					Node i = it.next();
					if (dist[i.getV()] > dist[u] + i.getWeight() * -1) {
						dist[i.getV()] = dist[u] + i.getWeight() * -1;
					}
				}
			}
		}

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < v; i++) {
			builder.append(dist[i] == Integer.MAX_VALUE ? "RUTE TERPENDEK ADALAH " : (dist[i] * -1) + " ");
		}

		return builder.toString();
	}	
}
