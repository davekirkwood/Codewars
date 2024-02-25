package net.davekirkwood.codewars.kyu6;

import java.util.Arrays;

public class SupermarketQueue {

	public static int solveSuperMarketQueue(int[] customers, int n) {
		
      int[] result = new int[n];
      for(int i = 0; i < customers.length; i++){
        result[0] += customers[i];
        Arrays.sort(result);
      }
      return result[n-1];
		
//
//		int[] tills = new int[n];
//		int nextCustomer = 0;
//
//		int totalTime = 0;
//
//		while (nextCustomer < customers.length) {
//
//			int minTillTime = Integer.MAX_VALUE;
//			for (int i = 0; i < tills.length; i++) {
//				if (tills[i] == 0 && nextCustomer < customers.length) {
//					tills[i] = customers[nextCustomer++];
//				}
//				minTillTime = Math.min(minTillTime, tills[i]);
//			}
//
//			for (int i = 0; i < tills.length; i++) {
//				tills[i] -= minTillTime;
//			}
//			totalTime += minTillTime;
//
//		}
//
//		int maxTillTime = Integer.MIN_VALUE;
//		for (int i = 0; i < tills.length; i++) {
//			maxTillTime = Math.max(maxTillTime, tills[i]);
//		}
//
//		totalTime += maxTillTime;
//
//		return totalTime;
	}

	public static void main(String[] args) {
//		System.out.println(SupermarketQueue.solveSuperMarketQueue(new int[] { 5,3,4 }, 1));	//12
//		System.out.println(SupermarketQueue.solveSuperMarketQueue(new int[] { 10,2,3,3 }, 2));	//10
		System.out.println(SupermarketQueue.solveSuperMarketQueue(new int[] { 2,3,10 }, 2));	//12
//		System.out.println(SupermarketQueue.solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2)); //9
//		System.out.println(SupermarketQueue.solveSuperMarketQueue(new int[] {}, 1));	//0
//		System.out.println(SupermarketQueue.solveSuperMarketQueue(new int[] { 1, 2, 3, 4, 5 }, 1)); //15
	}

}
