package HuaWei;

import java.util.Scanner;

public class NumOf1InB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int data = in.nextInt();
			int count =0;
			while(data!=0){
				count++;
				data=data&(data-1);
			}
			System.out.println(count);
		}

	}

}
