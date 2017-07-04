package HuaWei;

import java.util.Scanner;

public class MaxCommonStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String s1 = in.nextLine();
			String s2 = in.nextLine();
			if (s1.length()>s2.length()) {//s1存放短的字符串
				String s3 = s1;
				s1 = s2;
				s2 = s3;
			}
			String subs = getMaxSub(s1, s2);
			System.out.println(subs);
			
		}

	}
	
	public static String getMaxSub(String s1, String s2){
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		int[][] len =new int[arr1.length][arr2.length];
		int maxL =0;
		int index=0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i]==arr2[j]) {
					if (i==0||j==0) {
						len[i][j]=1;
					}else {
						len[i][j]=len[i-1][j-1]+1;
					}
				}else {
					len[i][j]=0;
				}
				if (len[i][j]>maxL) {
					maxL=len[i][j];
					index = i-maxL+1;
				}
			}			
		}
		if (maxL>0) {
			return s1.substring(index, index+maxL);
		}else {
			return "无公共字串";
		}
	}

}
