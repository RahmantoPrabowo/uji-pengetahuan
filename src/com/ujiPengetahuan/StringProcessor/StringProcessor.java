package com.ujiPengetahuan.StringProcessor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringProcessor {

	private static List<Map<String, String>> listData;
	
	private final static String LINE_SEPARATOR = "\n";
	private final static String VALUE_SEPARATOR = "=";
	private final static String END_VALUE_SEPARATOR = ";";
	
	//text=store(a); 
	//store a in a string-type variable text
	public static String storeData(List<Map<String, String>> input) {
		String result = "";
		for (Map<String, String> map : input) {
			for (Map.Entry<String, String> map2 : map.entrySet()) {
				result += map2.getKey()+VALUE_SEPARATOR+map2.getValue()+END_VALUE_SEPARATOR;
			}
			result += LINE_SEPARATOR;
		}
		
		return result;
	}
	
	//a=load(text); //load array a from variable text
	public static List<Map<String, String>> loadData(String input) {
		
		listData = new ArrayList<>();
		Map<String, String> lineData = new HashMap<>();
		String perLine[] = input.split(LINE_SEPARATOR);
		for (String line : perLine) {
			String perValue[] = line.split(END_VALUE_SEPARATOR);
			for (String value : perValue) {
				String perValueItem[]= value.split(VALUE_SEPARATOR);
				lineData.put(perValueItem[0],perValueItem[1]);
 			}
			listData.add(lineData);
		}
		
		return listData;
	}
	
	
	
}
