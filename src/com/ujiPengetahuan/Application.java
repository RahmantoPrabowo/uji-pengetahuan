package com.ujiPengetahuan;

import java.util.Date;

import com.ujiPengetahuan.OptimalPath.Graph;
import com.ujiPengetahuan.OptimalPath.OptimalPath;
import com.ujiPengetahuan.StringProcessor.StringProcessor;
import com.ujiPengetahuan.retailSystem.RetailSystem;
import com.ujiPengetahuan.retailSystem.User;

public class Application {

	private static StringProcessor stringProcessor;
	public static void main(String[] args) {
		//store and load data
		String input = "key1=value1;key2=value2;/nkey1a=value1a;key2a=value2a;";
		String output = stringProcessor.storeData(stringProcessor.loadData(input));
		System.out.println(output);
		
		//Optimal Path
		OptimalPath t = new OptimalPath();
		Graph g = t.newGraph(6);
		g.addEdge(0, 1, 5);
		g.addEdge(0, 2, 3);
		g.addEdge(1, 3, 6);
		g.addEdge(1, 2, 2);
		g.addEdge(2, 4, 4);
		g.addEdge(2, 5, 2);
		g.addEdge(2, 3, 7);
		g.addEdge(3, 5, 1);
		g.addEdge(3, 4, -1);
		g.addEdge(4, 5, -2);
		int s = 1;
		System.out.println(g.longestPath(s).trim());
		
		//Retailsystem
		System.out.println();
		Date bowoJoinDate = new Date();
		User bowo = new User("Bowo", false, true, bowoJoinDate);
		
		RetailSystem indomaret = new RetailSystem();
		
		System.out.println(indomaret.CalculateDiscount(bowo, 2000, false));
	}

}
