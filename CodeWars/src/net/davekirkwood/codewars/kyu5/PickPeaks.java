package net.davekirkwood.codewars.kyu5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickPeaks {

   public static Map<String,List<Integer>> getPeaks(int[] arr) {
      List<Integer> pos = new ArrayList<>();
      List<Integer> peaks = new ArrayList<>();
      
      int currentPos = -1;
      int currentPeak = -1;
      
      for(int i=1; i<arr.length; i++) {
      	
      	if(arr[i-1] < arr[i]) {
      		currentPos = i;
      		currentPeak = arr[i];
      	} else if(arr[i-1] > arr[i] && currentPos != -1) {
      		pos.add(currentPos);
      		peaks.add(currentPeak);
      		currentPos = -1;
      	}
      }
      Map<String, List<Integer>> result = new HashMap<>();
      result.put("pos", pos);
      result.put("peaks", peaks);
      
      return result;
  }
	
   public static void main(String[] args) {
   	Map<String,List<Integer>> a1 = PickPeaks.getPeaks(new int[] { 3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3 }); //pos: [3, 7], peaks: [6, 3]
   	Map<String,List<Integer>> a2 = PickPeaks.getPeaks(new int[] { 1, 2, 2, 2, 2 });
   	Map<String,List<Integer>> a3 = PickPeaks.getPeaks(new int[] { 1, 2, 2, 2, 1 });
   	a1.toString();
   }
   
}
