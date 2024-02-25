
public class BitCounting {

	public static int countBits(int n) {

//		String binString = Integer.toBinaryString(n);
//		
//		int oneCounter = 0;
//		for(int i=0; i<binString.length(); i++) {
//			if(binString.subSequence(i,  i+1).equals("1")) {
//				oneCounter++;
//			}
//		}
//		return oneCounter;

		return Integer.bitCount(n);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(BitCounting.countBits(0));		//0
		System.out.println(BitCounting.countBits(1));		//1
		System.out.println(BitCounting.countBits(2));		//10=1
		System.out.println(BitCounting.countBits(3));		//11=2
		System.out.println(BitCounting.countBits(4));		//100=1
		System.out.println(BitCounting.countBits(5));		//101=2
		System.out.println(BitCounting.countBits(1234));	//5
		
		
	}
	
}