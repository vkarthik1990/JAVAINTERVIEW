/*
Roy’s Lucky Numbers

Roy loves to play with numbers and digits. His lucky numbers are 3 and 5 for that

he believes that the numbers containing 3 and 5 are also lucky numbers for him.

For example 335, 355, 533 are lucky but 435, 137 etc. aren’t lucky. Now Roy is

interested in some extra­lucky numbers.

Extra lucky numbers are those which contains 3 and 5 and removing some but not

all digits you can covert that into a lucky number. Like 37455 is extra lucky as you

can convert that to a lucky number by removing 7 and 4.

Now Roy wants to develop an algorithm which will help him to calculate the

number of positive dividers of a given number (n) which are extra lucky. Help him

to develop that algorithm.

Input

The first line of the input contains an integer T denoting the number of test

cases. The description of T test cases follows.

Single line of each test case contains an integer n.

Output

For each test case on different lines print the answer to the problem.

Constraints

1 ≤ T ≤ 10

1 ≤ n ≤ 10^9

Time Limit : 1 second.

Sample Input :

10

1

2

3
4

5

6

7

8

9

10

Sample Output :

0

0

1

0

1

1

0

0

2

1
*/

import java.util.Scanner;

public class LuckyNumber{
	public static void main( String args[]){
		Scanner scan =new Scanner(System.in);
		int no_query=Integer.parseInt(scan.next());	
		int[] a=new int[no_query]; 
		for(int i=0;i<no_query;i++){
			//Scanner scan1 =new Scanner(System.in);
			a[i]=Integer.parseInt(scan.next());
		}
		
		for(int j=0;j<a.length;j++){
			if(a[j]%3==0||a[j]%5==0){
				System.out.println(Findprime(a[j]));
			}
			else System.out.println(0);
		}
	}

	private static int Findprime(int i) {
		// TODO Auto-generated method stub
		int count=0;
		while(i>=3){
		if(i%3==0){
			count++;
			i=i/3;
		}
		else if(i%5==0){
			count++;
			i=i/5;
		}
		else{
			return count;
		}
		}
		return count;
	}
}

