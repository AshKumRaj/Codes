/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.io.File;
import java.math.BigInteger;
import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.text.Document;
import javax.swing.text.html.parser.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Node;

/**
 *
 * @author Ashish
 */
public class Example {
//    Example e2 = new Example();
    
    public void fizzBuzz(){
        
        
		for(int i = 1; i <= 50; i++){
			if(i%3==0 && i%5==0)
				System.out.println("FizzBuzz");
			else{
				if(i%5==0)
					System.out.println("Buzz");
				if(i%3==0)
					System.out.println("Fizz");
				if(!(i%3==0 || i%5==0))
					System.out.println(i);
			}
		}
	}
    public void replace(String str, char ch, char ch1){
        Scanner s = new Scanner(System.in);
        str.trim();
                char charArr[] = str.toCharArray();
		for(int i = 0; i< str.length(); i++){
			if(charArr[i] == ch)
                            charArr[i] = ch1;
		}
		System.out.println(String.valueOf(charArr));
	}
    public void reverseSentence(String str){
		String strArr[] = str.split(" ");
		for(int i = 0; i < strArr.length/2; i++){
			String temp = strArr[i];
			strArr[i] = strArr[strArr.length-i-1];
			strArr[strArr.length-i-1] = temp;
		}
		System.out.println(Arrays.toString(strArr));
	}
    int nums[] = {5,4,3,1,2};
    int temp;    
    List missingNum(){
        List resList = new ArrayList();
        int i;
        boolean val = false;
        for(i=0; i<nums.length; i++){
            if(nums[i] != i+1) {
                temp = nums[i];
                while(!val){
                    val = advanceSwap();                    
                }
                val = false;
            }
        }
        for(i=0; i<nums.length; i++)
            System.out.print(nums[i]);
        for( i=1;i<=nums.length;i++){
            if(nums[i-1]!=i)
                resList.add(i);
        }
        return resList;
    }
    
    public void checkPalindrome(String str){
		char strArr[] = str.toCharArray();
		boolean equalAll = false;
		for(int i = 0; i < strArr.length/2; i++){
			if(strArr[i] == strArr[strArr.length-i-1])
				equalAll = true;
			else{
				equalAll = false;
				break;
			}
                }		
		System.out.println(equalAll);
		
	}
    public void findSmallestNumber(int sum, int digits){
		int a[] = new int[digits];
		int firstDigit = 1;
		if(sum>9*digits){
                    System.out.println("Not Possible");
                    return;
                }
		sum = sum -1;
		for(int i =0;i<digits;i++){
			if(sum>9){
				a[digits-i-1] = 9;
				sum = sum -9;
				
			}
			else{
				a[digits-i-1] = sum;
                                sum = 0;
			}
		}
                a[0] = a[0] + firstDigit;
		for(int i =0;i<digits;i++)
			System.out.print(a[i]);
	
	}
    
    public void longestSumArray(int nums[]){
		int sum = 0, start = 0, end = 0, tempSum =0;
		for(int i =0; i < nums.length; i++){
			tempSum = tempSum + nums[i];
			if(sum < tempSum){
				sum = tempSum;
				end = i;
			}
                         if(sum < nums[i]){
				
                            sum = nums[i];
                            start =i;
                            end = i;
                            tempSum = sum;
			}
			
		}
		System.out.println(start+":"+end+":"+sum);
	}
    public void intervleaveString(String a, String b, String c){
		int resArr[][] = new int[a.length()+1][b.length()+1];
		resArr[0][0] = 1;
		for(int i = 1; i<=b.length();i++){
			if(b.charAt(i-1) == c.charAt(i-1))
				resArr[0][i] = resArr[0][i-1];
			else
				resArr[0][i] = 0;
						
		}
		for(int i = 1; i<=a.length();i++){
			if(a.charAt(i-1) == c.charAt(i-1))
				resArr[i][0] = resArr[i-1][0];
			else
				resArr[i][0] = 0;
						
		}
		for(int j = 1;j<=a.length();j++){
			for(int i =1; i<=b.length();i++){
				if(c.charAt(i+j-1) == b.charAt(i-1))
					resArr[i][j] = resArr[i-1][j];
				else if (c.charAt(i+j-1) == a.charAt(j-1))
					resArr[i][j] = resArr[i][j-1];
				else
					resArr[i][j] = 0;
			}
		}
		System.out.println(resArr[a.length()][b.length()]);
	}
    private boolean advanceSwap() {
        int swap = nums[temp-1];
        nums[temp-1]=temp;
        temp = swap;
        return nums[temp-1] == temp;
    }
    public void URLify(String a){
		String str[] = a.split(" ");
		StringBuilder sb = new StringBuilder(str[0]);
		for(int i = 1;i<str.length;i++){
			str[i] = "%20"+str[i];
			sb.append(str[i]);
		}
		System.out.println(sb.toString());
		
	}
    public void zeroMatrix(){
		int[][] mat1 = {{3,0,9},{1,2,6},{9,8,3},{7,1,5}};
		ArrayList row = new ArrayList();
		ArrayList col = new ArrayList();
		int count = 0;
		for(int i = 0; i<4;i++){
			for(int j=0;j<3;j++){
				if(mat1[i][j] == 0){
					row.add(i);
                                        col.add(j);
				}
			}
		}
        for (Iterator it = row.iterator(); it.hasNext();) {
            int c = (int) it.next();
            for(int j = 0;j<3;j++)
                mat1[c][j] = 0;
        }
        for (Iterator it = col.iterator(); it.hasNext();) {
            int d = (int) it.next();
            for(int i = 0;i<4;i++)
                mat1[i][d] = 0;
        }
		for(int i = 0; i<4;i++){
			for(int j=0;j<3;j++){
				System.out.print(mat1[i][j]);
			}
			System.out.println();
		}
		
	}

    private void checkList() {
        HashSet s = new HashSet();
        s.add("1");
        s.add("2");
        s.add("3");
        Iterator it = s.iterator();
        it.hasNext();
        it.remove();
        ListIterator lt = (ListIterator) s.iterator();
        while(lt.hasNext()){
            lt.remove();
        }
        
    }

    
    class Node {
        Node next = null;
        int data;
        public Node(int d){
            data = d;
        }
        void appendToTail(int d){
            Node end = new Node(d);
            Node n = this;
            while(n.next != null){
                n = n.next;
            }
            n.next = end;
        }
    }
    public void partitionSumSubset(int a[]){
		int start = 0, end = a.length - 1, mid, firstSum = 0, endSum = 0;
		mid = (start + end) / 2;
		for(int i = 0; i<mid;i++){
			firstSum+=a[i];
			
		}
                for(int i = mid; i<a.length;i++){
			endSum+=a[i];
		}
		if(firstSum > endSum){
			int  i =0;
			while((firstSum!=endSum) && (firstSum>endSum)){
				firstSum = firstSum - a[mid-i];
				endSum = endSum + a[mid-i];
				i++;
			}
			if(firstSum == endSum)
				System.out.println("True");
			else
				System.out.println("False");
		}
		else if (firstSum < endSum){
			int  i =0;
			while((firstSum!=endSum) && (firstSum<endSum)){
				firstSum = firstSum + a[mid+i];
				endSum = endSum - a[mid+i];
				i++;
			}
			if(firstSum == endSum)
				System.out.println("True");
			else
				System.out.println("False");			
		}
		else
			System.out.println("True");		
		
	}
    public void stringRotation(String a, String b){
		StringBuilder sb1 = new StringBuilder(a);
		sb1 = sb1.append(a);
		a = sb1.toString();
		if(a.contains(b))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
    public int minInsertionsForPalindrome(String str){
			int inserCount = 0;
			char ch[] = new char[str.length()];
			int dynamicArr[][] = new int[str.length()][str.length()];
			for(int i = 0; i < str.length(); i++){
				dynamicArr[i][i] = 0;
			}
			for(int i = 1; i < str.length(); i++){
				for(int j=i;j<str.length()-i;j++){
					int min1=0, min2=0, min3=0;
					if(ch[i] == ch[j+i])
						min1 = dynamicArr[j+1][j+i-1];
					else{
						min2 = 1+dynamicArr[j-1][j+i];
						min3 = 1+dynamicArr[j][j+i+1];
					}
					dynamicArr[j][j+i] = Math.min(min1,Math.min(min2,min3));
				}
			}
			inserCount = dynamicArr[str.length()-1][str.length()-1];
			return inserCount;
	}
    static int[][] longestPalindromicSubsequence(String seq)
{
       int n = seq.length();
       int i, j, cl;
       int L[][] = new int[n][n];  
      
       
       for (i = 0; i < n; i++)
           L[i][i] = 1;           
        
        for (cl=2; cl<=n; cl++)
        {
            for (i=0; i<n-cl+1; i++)
            {
                j = i+cl-1;
                if (seq.charAt(i) == seq.charAt(j) && cl == 2)
                   L[i][j] = 2;
                else if (seq.charAt(i) == seq.charAt(j))
                   L[i][j] = L[i+1][j-1] + 2;
                else
                   L[i][j] = Math.max(L[i][j-1], L[i+1][j]);
            }
        }
        //System.out.println(L[0][n-1]);
        return L;
}
    public void printZigZagArr(int[] inputArr){
			boolean revSign = true, secRev = false;
			for(int i=0; i< inputArr.length-1; i++){
				if(revSign){
					if(inputArr[i] > inputArr[i+1]){
						int temp = inputArr[i];
						inputArr[i] = inputArr[i+1];
						inputArr[i+1] = temp;
					}
					revSign = false;
				}
				if(secRev){
					if(inputArr[i] < inputArr[i+1]){
						int temp = inputArr[i];
						inputArr[i] = inputArr[i+1];
						inputArr[i+1] = temp;
					}
					secRev = false;
                                        revSign = true;
				}
				if(!revSign)
					secRev = true;
				
				
			}
			for(int i=0; i< inputArr.length; i++)
				System.out.print(inputArr[i]+" ");
	}
    public void minEditDistance(String a, String b){
			char[] charA = a.toCharArray();
			char[] charB = b.toCharArray();
			int[][] dArr = new int[b.length()+1][a.length()+1];
			for(int j=0; j <= a.length(); j++){
				dArr[0][j] = j;
			}
			for(int j=0; j <= b.length(); j++){
				dArr[j][0] = j;
			}
			for(int j=1; j <= b.length(); j++){
				for(int i=1; i <= a.length(); i++){
					if(charB[j-1] == charA[i-1])
						dArr[j][i] = dArr[j-1][i-1];
					else
						dArr[j][i] = 1 + Math.min(Math.min(dArr[j-1][i],dArr[j][i-1]), dArr[j-1][i-1]);
				}
			}
			System.out.println("Minimum edit needed = " + dArr[b.length()][a.length()]);
	}
    static int funPal(String s) 
    {
    int prodMax = -1;
    int resArr[][] = longestPalindromicSubsequence(s);
    for(int i=0; i<s.length()-1;i++)
    {
        int tempProd = resArr[0][i] * resArr[i+1][s.length()-1];
        if(prodMax <= tempProd)
            prodMax = tempProd;
    }
    return prodMax;
}
    public void kthNonRepeating(String a, int count){
		HashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		for(int i=0;i<a.length();i++){
			char temp = a.charAt(i);
			if(hm.containsKey(temp)){
				hm.put(temp, hm.get(temp) +1);
			}
			else
				hm.put(temp,1);
		}
                int tempCount = 0;
                
		for(Map.Entry<Character, Integer> m : hm.entrySet()){
			if(m.getValue() == 1){
			
                            tempCount++;
                            if(tempCount == count){
                                System.out.println(m.getKey());
				break;
                            }
			}
				
		}
			
	}
     String findKthPermutation(String s){
        char ch[] = s.toCharArray();       
        int i = 0, j=0;
        for(int k=0;k<s.length()-2;k++){
            if(ch[s.length()-2-k]<ch[s.length()-1-k]){
                i = s.length()-2-k;
                break;
            }
            
        }
        //System.out.println(i);
        for(int k=s.length()-1;k>i;k--){
            if(ch[k]>ch[i]){
                j = k;
                break;
            }
            
        }
        //System.out.println(j);
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        StringBuilder swapped = new StringBuilder(new String(ch));
        //System.out.println(swapped);
        String sb1 = swapped.substring(0, i+1);
        String sb2 = (new StringBuilder(swapped.substring(i+1, s.length())).reverse()).toString();
        s = sb1+sb2;
        return s;
    }
     
     void removeAlphanum(String inputStr){
        //Pattern p = Pattern.compile("[[:alnum:]]*");
        String replaceAll = inputStr.replaceAll("^[A-Za-z0-9]", "f");
         System.out.println(replaceAll);
         
     }
     void checkChange(int a){
         a = 5;
     }
     public int countWaysSteps(int n){
//                Queue queue = new AbstractQueue();
		int[] dp = new int[n];
		dp[0] = 1;
		dp[1] = 2;
		dp[2] = 4;
		for(int i = 3; i < n; i++)
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		return dp[n-1];
	}
     void countOccurencesOfSubsequences(int[] arr, int sum, int start, int end){
         Map hm = new HashMap<>();
         int sum1 = 0;
         for(int i=start; i<=end;i++){
             sum1+=arr[i];
             if(!hm.containsKey(sum1)){
                 hm.put(sum1, 1);
             }
             else
                 hm.replace(sum1, Integer.parseInt((hm.get(sum1).toString()))+1);
             arr[i] = sum1;
         }
         int sumCount = 0;
         if(hm.containsKey(sum))
                 sumCount+=1;
         for(int i = start; i<= end;i++){
             
             if(hm.containsKey((arr[i] - sum)))
                 sumCount+=Integer.parseInt((hm.get(arr[i]).toString()));
         }
         System.out.println("The sum = "+sum+" is present "+sumCount+" time(s).");
     }
     public int multiplyUsingAdd(int a, int b){
		int small = a>b?b:a;
		int big = a>b?a:b;
		return multHelper(small,big);
	}
	public int multHelper(int small, int big){
		if(small == 0)
			return 0;
		if(small == 1)
			return big;
		int smaller = small >> 1;
                
		if(small%2 == 0)
			return multHelper(smaller, big) + multHelper(smaller,big);
		return multHelper(smaller, big) + multHelper(smaller,big) + big;
	}
     int magicIndex(int[] arr){
//         if(arr.length<0)
//             return -1;
         //return magicFast(arr, 0, arr.length -1);
         for(int k = 6; k>0;k >>= 1)
             System.out.println(k&1);
         return 3 << 5;
     }
     int magicFast(int[] arr, int start, int end){
         if(start > end)
			return -1;	// element not found!
		int mid = (start+end)/2;
		if(arr[mid] == mid)
			return mid;
		else if(arr[mid] > mid)
			return magicFast(arr, start, mid-1);
		else
                    return magicFast(arr, mid+1, end);
     }
     public int binarySearch(int[] a, int b){
		int start = 0, end = a.length - 1;
		int mid = (start + end)/2;
		while(start<end){
			mid = (start + end)/2;
			if(a[mid]>b){
				end = mid - 1;
			}
			else{
				start = mid + 1;
			}
		}
		if(start > end)
			return -1;
		return mid;
	}
     public int binarySearchRec(int[] a, int b, int start, int end){
		if(start>end)
			return -1;
                
		int mid = (start + end)/2;
                if(a[mid]>b)
			return binarySearchRec(a, b, 0, mid - 1);
                else if(a[mid]<b)
                    return binarySearchRec(a, b, mid + 1, end);
                else
                    return mid;
	}
     public void sortedMerge(int[] a, int[] b){
		//int helperArr[] = new int[a.length + b.length];
	int n = a.length+b.length;	
         int[] helperArr = Arrays.copyOf(a, n);
                for(int i=0;i<b.length;i++)
                    helperArr[a.length+i] = b[i];
		int start = 0, aInd = 0, bInd = 0;
		while(aInd < a.length && bInd < b.length){
			if(a[aInd]<b[bInd]){
				helperArr[start] = a[aInd];
				aInd++;
			}
			else{
				helperArr[start] = b[bInd];
				bInd++;
			}
			start++;
		}
		for(int i=0;i<helperArr.length;i++)       
                    System.out.print(helperArr[i]+" ");
                
	}
     public void groupAnaGrams(String[] str){
		LinkedHashSet<ArrayList<String>> anagramSet = new LinkedHashSet<ArrayList<String>>();
		ArrayList<String> stringList = new ArrayList<String>(Arrays.asList((String[]) str));
                ArrayList<String> sl = new ArrayList<String>();
		//Iterator it = stringList.listIterator();
		for(Iterator<String> it = stringList.iterator();it.hasNext();){
			String s = (String)it.next();
//                        if(s.equals("this"))
                        if(sl.contains(s))
                            continue;
                        it.remove();
			for(String lk : findAnagramsAndPut(s,stringList,anagramSet)){
                            sl.add(lk);
                        }
		}
        
         System.out.println("Anagram groupings:"+anagramSet.size());        
        for (ArrayList<String> al : anagramSet) {
            for(String s : al)
                System.out.print(s+" ");
            System.out.println();	
        }
		}
	ArrayList<String> findAnagramsAndPut
        (String s, ArrayList<String> sList, LinkedHashSet<ArrayList<String>> resultSet){
		//sList.remove(s);
		ArrayList<String> resList = new ArrayList<String>();
                //ArrayList<String> removeList = new ArrayList<String>();
		resList.add(s);
                
		for(Iterator i = sList.iterator();i.hasNext();){
			String temp = (String) i.next();
                        char[] sChar = s.toCharArray();
			Arrays.sort(sChar);
                        char[] tempChar = temp.toCharArray();
			Arrays.sort(tempChar);
                        String s1 = String.valueOf(sChar);
                        String temp1 = String.valueOf(tempChar);
			if(s1.equals(temp1)){
				resList.add(temp);
				//i.remove();
                                //removeList.add(temp);
                                
			}
		}
		resultSet.add(resList);
                return resList;
	}
        public int searchRec(int[] a, int b, int start, int end){
		int mid = (start+end)/2;
		if(a[mid] == b)
			return mid;
		if((a[mid] > b && a[end] > b)||(a[mid]<b && a[end] < b))
			return searchRec(a,b,mid+1,end);
		else
			return searchRec(a,b,start,mid-1);
	}
        public int searchIndex(int[] arr, int b){
		int start =0, end=1;
		for(int i=start;;i++){
			end = start == 0 ? end:(start*2);
			if(arr[end]<b && arr[end]<b){
				start = end;
				
				end = end * 2;
                                //this is actually
                                //if(arr.elementAt(end) == -1)
                                    //break;
				if(end > arr.length)
					break;
			}
			else{
				return binarySearchRec(arr, b, start, end);
				}
			}
		for(int i = start;i<arr.length;i++)
                    //i<arr.length should be 
                    //i = start;
                    //while(arr.elementAt(i)!=-1)
                    if(arr[i] == b)
                        return i;
                return -1;
	}
        public int returnIndexOfString(String b, String[] str){
		HashMap<String,ArrayList> hm = new HashMap<String,ArrayList>();
		for(int i = 0; i< str.length; i++){
			if(!hm.containsKey(str[i]))
			{
				ArrayList tempList = new ArrayList();
				tempList.add(i);
				hm.put(str[i],tempList);
			}
			else{
				ArrayList tempList = hm.get(str[i]);
				tempList.add(i);
				hm.put(str[i],tempList);
			}
		}
		return (int) hm.get(b).get(0);
	}
        public void peaksAndValleys(int[] arr){
		boolean peak = true, valley = false;
		if(arr[0]<arr[1]){
			int temp = arr[0];
			arr[0]=arr[1];
			arr[1] = temp;
		}
		for(int i =0;i<arr.length-2;i++){
			if(peak){
				if((arr[i]>arr[i+1]) && (arr[i+1]>arr[i+2])){
					int temp = arr[i+1];
					arr[i+1] = arr[i+2];
					arr[i+2] = temp;
				
				}
				peak = false;
			}
			if(valley){
				if((arr[i]<arr[i+1]) && (arr[i+1]<arr[i+2])){
					int temp = arr[i+1];
					arr[i+1] = arr[i+2];
					arr[i+2] = temp;
				}
				valley = false;
				peak = true;
			}
			if(!peak)
				valley = true;
		}
		for(int i:arr)
			System.out.print(i+" ");
	}
        public void rotateMat(int[][] mat){
            for(int i =0;i<mat.length;i++){
                for(int j=i;j<mat[0].length;j++){
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
            for(int i =0;i<mat.length;i++){
                for(int j=0;j<mat[0].length;j++){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println("");
                }
            
        }
        public void returnZeroes(int n){
            int countFive = 0;
            if(n<5)
                return;
            for(int j=5;j<=n;j++){
                int i = j;
                while(((i%5)==0) && i>=5){
                    countFive++;
                    i=i/5;
                }
                //System.out.println("zeroes = "+countFive);
            }
            System.out.println("zeroes = "+countFive);
        }
        void quickSort(int[] arr, int left, int right){
            int index = partition(arr, left, right);
            if(left < index - 1)
                quickSort(arr, left, index-1);
            if(index < right)
                quickSort(arr, index, right);
            
        }
        int partition(int[] arr, int left, int right){
            int pivot = arr[(left + right)/2];
            while(left <= right){
                while(arr[left] < pivot)
                    left++;
                while(arr[right] > pivot)
                    right --;
                if(left <= right){
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }
            return left;
        }
        
        void heapify(int arr[], int parent){
            int left = 2*parent + 1;
            int right = 2*(parent + 1);
            int smallest = parent;
            if(left < arr.length && arr[parent] > arr[left])
                smallest = left;
            if(right < arr.length  && arr[smallest] > arr[right])
                smallest = right;
            if(smallest != parent){
                int temp = arr[parent];
                arr[parent] = arr[smallest];
                arr[smallest] = temp;
                heapify(arr, smallest);
            }
        }
        public void subSort(int[] arr){
		int j = -1, k = arr.length;
		for(int i =1;i<arr.length -1;i++){
			if(arr[i] < arr[i-1]){
				
			
				j = findFirstIndex(arr, i);
				break;
			}
		}
		for(int i = arr.length-2;i>=0;i--){
			if(arr[i]>arr[i+1]){
				
			
				k = findLastIndex(arr,i);
				break;
			}
		}
		System.out.println("("+j+", "+k+")");
	}
	public int findFirstIndex(int[] arr, int i){
		for(int j = 0;j<=i;j++){
			if(arr[j]>=arr[i])
				return j;
		}
		return i;
	}
	public int findLastIndex(int[] arr, int i){
		for(int j=arr.length-1;j>=i;j--){
			if(arr[j]<=arr[i])
				return j;
		}
		return i;
	}
        public int addWithoutADD(int a, int b){
		int sum = 0, carry = 0;
		while(b!=0){
			sum = a^b;
			carry = (a & b) << 1;
			a = sum;
			b = carry;
		}
		return a;
	}
	
	public void shuffle (int[] cards){
		for(int i=0;i<cards.length;i++){
			int k=(0+(int)(Math.random() * (i-0+1)));
			int temp = cards[k];
			cards[k]=cards[i];
			cards[i]=temp;
		}
                for(int i:cards)
                    System.out.print(i+" ");
	}
	
	public void getRandomIntegers(int a[], int m){
		int[] resultArr = new int[m];
		for(int i=0;i<m;i++){
			resultArr[i]=a[i];
		}
		for(int i=m;i<a.length;i++){
			int k=(0+(int)(Math.random() * (i-0+1)));
			if(k<m){
				resultArr[k] = a[i];
			}
		}
		for(int i:resultArr)
                    System.out.print(i+" ");
	}
        public int countNumberOfTwos(int n){
		int totalCt = 0;
		for(int i=2;i<=n;i++){
			totalCt += numberTwos(i);
		}
		return totalCt;
	}
	
	private int numberTwos(int n){
		int count = 0;
		while(n!=0){
			if(n%10 == 2)
				count++;
			n = n/10;
		}
		return count;
	}
        int findPow(int a, int b){
            if(b==1)
                return a;
            return a*findPow(a,b-1);
        }
        BigInteger findLArgeExponent(BigInteger n, int pow){
            return n.pow(pow);
        }
        public int LIS(int[] arr){
		int[] longArr = new int[arr.length];
		for(int j=0;j<arr.length;j++){
                    longArr[j]=1;
			for(int i=0;i<j;i++){
				if(arr[j]>arr[i]){
					longArr[j] = Math.max(longArr[j],1+longArr[i]);
				}
			}
		}
		int maxVal = 0;
		for(int i=0;i<arr.length;i++){
			if(maxVal<longArr[i])
				maxVal = longArr[i];
		}
		return maxVal;
	}
        public int mostFrequent(int[] arr){
		int count = 0, majority = 0;
		for(int n: arr){
			if(count == 0)
				majority = n;
			if(n == majority)
				count++;
			else
				count--;
		}
		int validCt = 0;
		for(int n: arr){
			if(n == majority)
				validCt++;
		}
		return validCt > arr.length/2 ? majority:-1;
		
	}
         String[] ver = {"000","002","004","006","008","012","014","016","023","024","025","027","028","029","034","036","044","045","046","047","048","049","056","067","068","069","088","112","123","125","126","127","128","129","136","144","146","148","166","167","168","223","224","227","234","235","236","238","239","244","246","247","248","255","256","257","258","259","267","269","278","279","288","289","299","336","344","348","356","367","368","369","445","446","447","448","449","456","458","466","468","469","478","488","489","566","567","568","669","677","678","679","688","689","888"};  
    public  boolean verify(String str){
        
        for(int i=0;i<ver.length;i++){
            int count = 0;
            //HashSet<Character> hs = new HashSet<Character>();
            char[] chArr1 = ver[i].toCharArray();
            //for(char ch : chArr1)
              //  hs.add(ch);
            char[] strChar = str.toCharArray();
            for(int k=0;k<strChar.length;k++){
                for(int j=0;j<3;j++){
                    if(strChar[k] == chArr1[j]){
                        count++;
                        chArr1[j] = 'a';
                        strChar[k] = 'b';
                    }
                }
                
            }
            if(count == 3)
                return true;
            
        }
        
        return false;
    }
    static boolean ValidateString(String input) {
//        Stack s = new Stack();
        //Queue<Character> q = new Queue<Character>();
        Stack<Character> stack = new Stack<Character>();
	for (char c : input.toCharArray()) {
		if (c == '<')
			stack.push('>');
		else if (c == '{')
			stack.push('}');
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
	}
	return stack.isEmpty();
    }


    public boolean checkParenthesis(String seq){
		LinkedList<Character> stack = new LinkedList<Character>();
		for(int i=0;i<seq.length();i++){
			if(seq.charAt(i) == '(' || seq.charAt(i) == '{' || seq.charAt(i) == '[')
				stack.push(seq.charAt(i));
			if(seq.charAt(i) == ')' || seq.charAt(i) == '}' || seq.charAt(i) == ']'){
				char ch1 = seq.charAt(i);
				char ch2 = stack.pop();
			if(ch1 == ')') {
                                if (ch2 != '(')
                                    return false;
                        }
                        else if(ch1 == '}') {
                                if (ch2 != '{')
                                    return false;
                        }
                        else if(ch1 == ']') {
                                if (ch2 != '[')
                                    return false;
                        }
                        
			}
		}
		return true;
	}
    public void printWordBreak(String a){
		if(a.length()<=0)
			return;
		String result = "";
		wordBreakUtil(a, result, 0);
	}
	
    //does same work as wordUtil
    public void wordBreakUtil(String a, String result, int startInd){
		if(startInd >= a.length() - 1){
			System.out.println(result+a.charAt(startInd));
                        return;
                }
                //either put a space after the current character
                //or put that chracter and print space after it
		wordBreakUtil(a, result+a.charAt(startInd), startInd+1);
		wordBreakUtil(a, result+a.charAt(startInd)+" ", startInd+1);
		
	}
        public void possibleWordBreak(String a){
            HashSet<String> dictionary = new HashSet<String>();
            dictionary.add("my");
            dictionary.add("name");
            dictionary.add("is");
            dictionary.add("ash");
            dictionary.add("ashish");
            dictionary.add("ish");
//            {"my","name","is","ash","ashish","ish"};	
            wordUtil(a,"",dictionary);
		
	}
	
	public void wordUtil(String a, String result, HashSet<String> dictionary){
            for(int i=1;i<=a.length();i++){
                String prefix = a.substring(0,i);
                //uncomment below if loop condition to get valid dictionary words only
                //if(dictionary.contains(prefix)){
                    if(i == a.length()){
                        result = result + prefix;
                        System.out.println(result);
                        return;
                    }
                wordUtil(a.substring(i,a.length()),result+prefix+" ",dictionary);
                //}
            }
	}
        static String CountLetters(String input) {
            input = input.toLowerCase();
        char strChar[] = input.toCharArray();
        HashMap<String,Integer> strMap = new HashMap<String,Integer>();
        for(int i=0;i<strChar.length;i++){
            String temp = "'"+strChar[i]+"'";
            if(!strMap.containsKey(temp)){
                strMap.put(temp,1);
            }
            else{
                Integer val = strMap.get(temp);
                val++;
                strMap.put(temp,val);
            }
        }
        StringBuilder sb = new StringBuilder("");
        int count = 0;
        Iterator it = strMap.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry m = (Map.Entry)it.next();
            sb.append(m.getKey());
            sb.append(":");
            int val = (int)m.getValue();
            sb.append(val);
            count++;
            if(!(count == strMap.size()))
            sb.append(",");
        }
        String output = sb.toString();
        return output;

    }
        public void mergeIntervals(int start[], int end[]){
		Arrays.sort(start);
		Arrays.sort(end);
		int interval[] = new int[start.length+end.length];
		char status[] = new char[interval.length];
		int s=0,e=0;
//                Integer.pa
		while(s!=start.length && e!=end.length){
			if(start[s]<=end[e]){
				interval[s+e] = start[s];
				status[s+e] = 'a';	//for arrival
				s++;
			}
			else{
				interval[s+e] = end[e];
				status[s+e] = 'd';	//for departure
				e++;
			}
		}
		
		if(e!=end.length){
			for(int i = e;i<end.length;i++){
				interval[s+i] = end[i];
				status[s+i] = 'd';	//for arrival
				
			}
		}
		int count = 0, starting =interval[0], ending = 0;
		for(int i=0;i<interval.length;i++){
			
			if(status[i] == 'a'){
				count++;
			}
			else{
				count--;
			}
			if(count == 0){
				ending = interval[i];
				System.out.println(starting+"-"+ending);
				if(i<interval.length-1)
					starting = interval[i+1];
				
			}
		}
	}
        static long findMax(int n, String tree) {
    //convert the string into its corresponding integer array    
    String[] input = tree.split(" ");
    int[] inputArr = new int[input.length];
    for(int i=0;i<inputArr.length;i++){
        //for # replace by 0 in integer array
        if(input[i].equals("#")){
            inputArr[i] = 0;
            continue;
        }
        //else replace by original number    
        inputArr[i] = Integer.parseInt(input[i]);
    }
    
    //caculating the sum of arr[0] and its grandchilds using recursive function getSum.   
	//this is level 1. Grandchilds would be at level 3
    int sum1 = inputArr[0]+getSum(inputArr,0);
	//sum for level2. grandchils at level 4
    int sum2 = inputArr[1]+inputArr[2]+getSum(inputArr,1)+getSum(inputArr,2);
    return Math.max(sum1, sum2);
}
    //Recursive function to calculate the sum for each index's grandchilds. Every successive grandchild will have 4 grandchilds.    
    private static int getSum(int[] arr, int i) {
        int child1 = 2*(2*i+1)+1;
        int child2 = 2*(2*i+1)+2;
        int child3 = 2*(2*i+2)+1;
        int child4 = 2*(2*i+2)+2;
        int sum1=0,sum2=0,sum3=0,sum4=0;
        if(child1<arr.length)
            sum1 = arr[child1]+getSum(arr,child1);
        else
            sum1= 0;
        if(child2<arr.length)
            sum2 = arr[child2]+getSum(arr,child2);
        else
            sum2= 0;
        if(child3<arr.length)
            sum3 = arr[child3]+getSum(arr,child3);
        else
            sum3=0;
        if(child4<arr.length)
            sum4 = arr[child4]+getSum(arr,child4);
        else
            sum4= 0;
		//returning the sum calculated for all 4 grandchilds of a particular level.
        return sum1+sum2+sum3+sum4;
    }
    
    public void trickySubset(int target, int[] a, int S, String[] out1, int k){
		int out[] = new int[a.length + 1];
		out[0] = S;
		int currSum = S;
		for(int i = 0;i<a.length;i++){
			out[i+1] = currSum + a[i];
			currSum = currSum + out[i+1];
		}
		//find if subset sum is equal to the given target sum S for out[]
		boolean[][] dp = new boolean[out.length][target+1];
		for(int i = 0; i < out.length;i++){
			dp[i][0] = true;
                        if(out[i] <= target)
                            dp[i][out[i]] = true;
			for(int j =1;j<=target;j++){
				if(i == 0){
					dp[i][j] = false;
				}
				else
				{
					if(j<out[i])
						dp[i][j] = dp[i-1][j];
					else
						dp[i][j] = dp[i][j-out[i]];
				}
			}
		}
		if(dp[out.length-1][target])
		    out1[k] = "yes";
		else
		    out1[k] = "no";
	}
    
    public boolean checkSubArraySum(int[] a, int S){
		int start = 0, end = 0, sum = a[0];
		if(sum == S)
			return true;
		for(int i=1;i<a.length;i++){
			end = i;
			sum = sum + a[i];
                        while(sum > S & start < i -1){
				sum = sum - a[start];
				start++;
			}
			if(sum == S )
				return true;
			//if(sum < S)
			//	continue;
			
		}
		return false;
	}
    void priorityQueueImpl(){
        Queue q = new PriorityQueue(Collections.reverseOrder());
        q.add(13);
        q.add(12);
        q.add(31);
        q.add(14);
        q.add(16);
//        q.add(13);
        q.add(12);
//        q.add(31);
        q.add(14);
        q.add(16);
        while(!q.isEmpty()){
            q.stream().forEach((s) -> {
                System.out.print(s+"-->");
            });
            System.out.println("");
            System.out.println(q.poll());
//            q.remove();
            
        }
    }
    
    public int[] twoSum(int[] nums, int target) {
        LinkedHashMap hm = new LinkedHashMap();
        int[] out = new int[2];
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                int val = (int)hm.get(nums[i]);
                if(val!=i){
                    out[0] = i;
                    out[1] = val;
                    break;
                }
            }
        }
        return out;
    }
    void printPowerSet(String a){
        int pow_size = (int) Math.pow(2, a.length());
        int size = a.length();
        for(int i=0;i<pow_size;i++){
            for(int j=0;j<size;j++){
                int k = i & (1 << j);
                if(k > 0)
                    System.out.print(a.charAt(j));
            }
            System.out.println();
        }
    }
    void powerUtil(String a){
        String res = "";
        System.out.println(res);
        for(int i = 0;i<a.length();i++)
            printPowerSetRec(a,res,i);
    }
    void printPowerSetRec(String a, String res, int ind){
	if(ind>=a.length()-1){
		System.out.println(res+a.charAt(ind));
		return;
	}
	//System.out.println(res);
        printPowerSetRec(a,res+a.charAt(ind),ind+1);
}
    
    void checkFor(){
        int size = 5;
        for(int i=0;i<size;i++){
            System.out.println(i);
            i++;
        }
    }
    
    public void printPossibleParenth(int n){
		char[] ch = new char[2*n];
		printParenth(ch, n, 0, 0, 0);
	}
	
	void printParenth(char[] str, int n, int pos, int open, int close){
		if(pos == 2*n){
			for(int i=0;i<pos;i++)
				System.out.print(str[i]);
			System.out.println();
		}
                
                else{ 
                    if(open>close){
                        str[pos] = '}';
                        printParenth(str, n, pos+1, open, close+1);
                    }
                    if (open < n){
			str[pos] = '{';
			printParenth(str, n, pos+1, open+1, close);
			
                    }   
                }
	}
        
        public void possibleCombinations(int r, int[] arr){
		int[] result = new int[r];
                Arrays.sort(arr);
                printAllComb(result, arr, r, 0, arr.length-1, 0);
	}
	
	public void printAllComb(int[] result, int[] arr, int r, int start, int end, int resIndex){
		if(resIndex == r){
			for(int i =0;i<r;i++){
                            System.out.print(result[i]+" ");
                        }
                        
			System.out.println();
			return;
		}
		for(int i=start;i<=end && end-i+1 >= r-resIndex;i++){
			result[resIndex] = arr[i];
                        printAllComb(result, arr, r, i+1, end, resIndex+1);
                        
		}
	}
        
        public int longestSubstringLength(String a, String b){
		int[][] dp = new int[a.length()+1][b.length()+1];
                int length = 0;
		for(int i=0;i<=a.length();i++){
			for(int j=0;j<=b.length();j++){
				if(i == 0 || j == 0)
					dp[i][j] = 0;
				else{
					if(a.charAt(i-1) == b.charAt(j-1)){
						dp[i][j] = 1 + dp[i-1][j-1];
                                                if(dp[i][j]>length)
                                                    length = dp[i][j];
					}
					else{
						dp[i][j] = 0;
					}
				}
			}
		}
                for(int i=0;i<=a.length();i++){
			for(int j=0;j<=b.length();j++){
                            System.out.print(dp[i][j]+" ");
                        }
                        System.out.println("");
                }
		return length;
	}
        
        public int longestSubsequenceLength(String a, String b){
		int[][] dp = new int[a.length()+1][b.length()+1];
		for(int i=0;i<=a.length();i++){
			for(int j=0;j<=b.length();j++){
				if(i == 0 || j == 0)
					dp[i][j] = 0;
				else{
					if(a.charAt(i-1) != b.charAt(j-1)){
						dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
					}
					else{
						dp[i][j] = 1 + dp[i-1][j-1];
					}
				}
			}
		}
                for(int i=0;i<=a.length();i++){
			for(int j=0;j<=b.length();j++){
                            System.out.print(dp[i][j]+" ");
                        }
                        System.out.println("");
                }
		return dp[a.length()][b.length()];
	}
        
        public void longestNonRepeatingLength(String a){
            a="pwwkew";
            int visitedIndex[] = new int[256];
		int curr_len = 0, max_len = 0, prev_ind = 0, start = 0, end = 1;
		for(int i =0;i<256;i++)
			visitedIndex[i] = -1;
		visitedIndex[a.charAt(0)] = 0;
		curr_len++;
		int i = 0;
		for( i=1;i<a.length();i++){
			prev_ind = visitedIndex[a.charAt(i)];
			if(prev_ind == -1 || i > prev_ind + curr_len)
				curr_len++;
			else{
				if(curr_len>max_len){
                                    start = prev_ind + 1;
                                    end = i;
                                    max_len = curr_len;
                                }
					
				curr_len = i - prev_ind;
                                
			}
			visitedIndex[a.charAt(i)] = i;
		}
                if(curr_len>max_len){
                                    end = i-1;
                                    max_len = curr_len;
                                }
                for( i = start;i<=end;i++)
                    System.out.print(a.charAt(i));
                System.out.println("");
		System.out.println(max_len);
	}
        
        public int maxSumBitonicSubsequence(int[] arr){
		int[] MIS = new int[arr.length];
		int[] MDS = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			MIS[i] = arr[i];
			MDS[i] = arr[i];
		}
			
		for(int i=0;i<arr.length;i++){
                    int curr = MIS[i];
			for(int j=0;j<i;j++){
				if(arr[i]>arr[j]){                                    
					if(MIS[i]<arr[i]+MIS[j])
						MIS[i] = arr[i] + MIS[j];
				}
			}
		}
                for(int i=0;i<arr.length;i++){
                    System.out.print(MIS[i]+" ");
                }
		for(int i = arr.length-1;i>=0;i--){
                    int curr = MDS[i];
			for(int j=arr.length-1;j>i;j--){
				if(arr[i]>arr[j]){
					if(MDS[i]<arr[i]+MDS[j])
						MDS[i] = arr[i] + MDS[j];
				}
			}
		}
                System.out.println("");
                for(int i=0;i<arr.length;i++){
                    System.out.print(MDS[i]+" ");
                }
                int maxSum = 0;
                System.out.println("");
		for(int i=0;i<arr.length;i++){
			if(maxSum<(MIS[i]+MDS[i]-arr[i]))
				maxSum = MIS[i]+MDS[i]-arr[i];
		}
		return maxSum;
	}
        public int maxAreaHist(int[] hist){
		Stack<Integer> st = new Stack();
		int topInd, maxArea = 0, i = 0, areaFin = 0;
		while(i < hist.length){
			if(st.empty() || hist[st.peek()] <= hist[i]){
                            st.push(i);
                            i++;
                        }				
			else
			{
				topInd = st.peek();
				st.pop();
				if(st.empty())
					maxArea = hist[topInd] * i;
				else
					maxArea = hist[topInd] * (i - st.peek() - 1);
				if(areaFin < maxArea)
					areaFin = maxArea;
			}
		}
		while(!st.empty()){
			topInd = st.peek();
			st.pop();
			if(st.empty())
					maxArea = hist[topInd] * i;
				else
					maxArea = hist[topInd] * (i - st.peek() - 1);
				if(areaFin < maxArea)
					areaFin = maxArea;
		}
		return areaFin;	 
	}
        public int maxPerimeterHist(int[] hist){
		Stack<Integer> st = new Stack<>();
		int topInd, maxPeri = 0, i = 0, PeriFin = 0;
		while(i < hist.length){
			if(st.isEmpty() || hist[st.peek()] <= hist[i])
				st.push(i++);
			else
			{
				topInd = st.peek();
				st.pop();
				if(st.isEmpty())
					maxPeri = 2*(hist[topInd] + i);
				else
					maxPeri = 2*(hist[topInd] + (i -st.peek() - 1));
				if(PeriFin < maxPeri)
					PeriFin = maxPeri;
			}
		}
		while(!st.isEmpty()){
			topInd = st.peek();
			st.pop();
			if(st.isEmpty())
					maxPeri = 2*(hist[topInd] + i);
				else
					maxPeri = 2*(hist[topInd] + (i -st.peek() - 1));
				if(PeriFin < maxPeri)
					PeriFin = maxPeri;
		}
		return PeriFin;	 
	}
        public int maxSubAreaRect(int[][] mat){
		int rect[] = mat[0];
		int maxArea = maxAreaHist(rect);
		for(int i = 1; i < mat.length;i++){
			for(int j=0;j<mat[0].length;j++){
				if(mat[i][j] == 1){
					mat[i][j]+=mat[i-1][j];
				}
				else
					mat[i][j] = 0;
				
			}
			maxArea = Math.max(maxArea, maxAreaHist(mat[i]));
		}
		return maxArea;
	}
        
        public int maxSurroundedSquare(int[][] mat){
		int maxValue = 0, endI = 0, endJ = 0;
		int[][] solMat = new int[mat.length][mat[0].length];
		for(int i=0;i<mat.length;i++){
			solMat[i][0] = mat[i][0];
			
		}
        System.arraycopy(mat[0], 0, solMat[0], 0, mat[0].length);
		for(int i=1;i<mat.length;i++){
			for(int j=1;j<mat[0].length;j++){
                            if(mat[i][j] == 1)
                                solMat[i][j] = mat[i][j] + Math.min(Math.min(solMat[i-1][j],solMat[i][j-1]), solMat[i-1][j-1]);
                            else
                                solMat[i][j] = 0;
			if(solMat[i][j] >= maxValue){
					maxValue = solMat[i][j];
					endI = i;
					endJ = j;
				}
			}
				
		}
                for(int i=endI-maxValue+1;i<=endI;i++){
                    for(int j=endJ-maxValue+1;j<=endJ;j++)
                        System.out.print(mat[i][j]+" ");
                    System.out.println("");
                }
                    
		
		return maxValue;	
		
	}
        
        
        public void floodFillAlgo(int[][] mat, int pixel, int rowInd, int colInd){
		int oldPix = mat[rowInd][colInd];
		mat[rowInd][colInd] = pixel;
		floodFillAlgoUtil(mat, oldPix, pixel, rowInd+1, colInd);
		floodFillAlgoUtil(mat, oldPix, pixel, rowInd-1, colInd);
		floodFillAlgoUtil(mat, oldPix, pixel, rowInd, colInd+1);
		floodFillAlgoUtil(mat, oldPix, pixel, rowInd, colInd-1);
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[0].length;j++){
				System.out.print(mat[i][j]+" ");				
			}
			System.out.println();
		}
	}
	
	public void floodFillAlgoUtil(int[][] mat, int oldPix, int newPix, int rowInd, int colInd){
		if(rowInd<0 || colInd < 0 || rowInd>=mat.length 
                        ||colInd>= mat[0].length)
			return;
                if(mat[rowInd][colInd] != oldPix)
                    return;
		mat[rowInd][colInd] = newPix;
		floodFillAlgoUtil(mat, oldPix, newPix, rowInd+1, colInd);
		floodFillAlgoUtil(mat, oldPix, newPix, rowInd-1, colInd);
		floodFillAlgoUtil(mat, oldPix, newPix, rowInd, colInd+1);
		floodFillAlgoUtil(mat, oldPix, newPix, rowInd, colInd-1);
	}
    public int maxPerimeterRectangle(int[][] hor){
	int m = hor.length, n = hor[0].length;
	int left[][] = new int[m][n];
        int ver[][] = new int[m][n];
	if(hor[0][0] == 1){
            left[0][0] = 1;
            ver[0][0] = 1;
        }
        else{
            ver[0][0]=0;
            left[0][0]=0;
        }
        for(int i=1;i<n;i++){
            if(hor[0][i] == 0){
                left[0][i] = 0;
            }
            else{
                left[0][i] = 1+left[0][i-1];
            }
            ver[0][i] = hor[0][i];
        }
        for(int i=1;i<m;i++){
            if(hor[i][0] == 0){
                ver[i][0] = 0;
            }
            else{
                ver[i][0] = 1+ver[i-1][0];
            }
            left[i][0] = hor[i][0];
        }            
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(hor[i][j] == 1){
                    left[i][j] = left[i][j-1]+1;
                }
                else
                    left[i][j] = 0;
            }            
        }
        for(int j=1;j<n;j++){
            for(int i=1;i<m;i++){
                if(hor[i][j] == 1){
                    ver[i][j] = ver[i-1][j] + 1;
                }
                else
                    ver[i][j] = 0;
            }
        }
        System.out.println("hor");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                System.out.print(hor[i][j]+" ");
            System.out.println();
        }
        System.out.println("left");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                System.out.print(left[i][j]+" ");
            System.out.println();
        }
        System.out.println("ver");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                System.out.print(ver[i][j]+" ");
            System.out.println();
        }
        int max = 0, val = 0, valVer = 0, valLeft = 0, maxL=0, maxV=0;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(left[i][j] <=1 || ver[i][j] <=1)
                    continue;
                valVer = ver[i][j];
                while(valVer!=1){
                    if(left[i-valVer+1][j] >= left[i][j]){
                        if(maxL<valVer)
                            maxL = valVer;                        
                    }
                    valVer--;
                }
                valLeft = left[i][j];
                while(valLeft!=1){
                    if(ver[i][j-valLeft+1] >= ver[i][j]){
                        if(maxV<valLeft)
                            maxV = valLeft;                        
                    }
                    valLeft--;                        
                }
                if(maxL == 0 || maxV == 0)
                    maxL = maxV = 0;
                val = 2*(maxL+maxV-2);
                if(val>max)
                    max = val;
                maxL=0;
                maxV=0;
            }
        }
		return max;         
}
    
    public void findElementMatrix(int[][] mat, int ele, int row, int col){
		if(row<0 || col < 0 || row>=mat.length || col>=mat[0].length){
                    System.out.println("Element not found!");
                    return;
                }			
		if(mat[row][col] == ele){
                    System.out.println("Found at "+row+", "+col);
                    return;
		}
		if(mat[row][col]>ele){
                    findElementMatrix(mat, ele, row, col-1);
		}
		if (mat[row][col]<ele){
                    findElementMatrix(mat, ele, row+1, col);
		}
			 
	}
    public void findMatrixEleIter(int[][] mat, int ele){
        int row = mat.length-1, col = 0;
        if(mat[row][col] == ele){
            System.out.println("Found at "+row+", "+col);
            return;
        }            
        while(row<mat.length && col>=0 ){
            if(mat[row][col]>ele){
                row--;
            }
            else if(mat[row][col]<ele)
                col++;
            else if(mat[row][col] == ele){
                System.out.println("Found at "+row+", "+col);
                return;
            }
        }
        System.out.println("Element not found!");        
    }
    public void binarySearchMat(int[][] mat, int row, int col_low, int col_high, int ele){
		while(col_low<=col_high){
			int col_mid = (col_low+col_high)/2;
			if(mat[row][col_mid] == ele){
				System.out.println("Found at "+row+", "+col_mid);
				return;
			}
			else if(mat[row][col_mid]>ele)
				col_high = col_mid-1;
			else
				col_low = col_mid+1;
		}
		System.out.println("Element not found");
		
	}
	public void searchInSortedMat(int mat[][], int ele){
		if(mat.length == 1){
                    binarySearchMat(mat, 0, 0, mat[0].length, ele);
                    return;
                }			
		int col_mid = mat[0].length/2;
		int row_low = 0;
		int row_high = mat.length-1;
		int row_mid = (row_low+row_high)/2;
		while((row_low+1)<row_high){
			row_mid = (row_low+row_high)/2;
			if(mat[row_mid][col_mid] == ele){
				System.out.println("Found at "+row_mid+", "+col_mid);
				return;
			}
			if(mat[row_mid][col_mid]>ele)
				row_high = row_mid;
			else
				row_low = row_mid;
				
		}
		if(mat[row_low][col_mid] == ele)
			System.out.println("Found at "+row_low+", "+col_mid);
		else if(mat[row_low+1][col_mid] == ele)
			System.out.println("Found at "+row_low+1+", "+col_mid);
		else if(mat[row_low][col_mid]>=ele)
			binarySearchMat(mat, row_low, 0, col_mid-1, ele);
		else if(mat[row_low][col_mid]<=ele && mat[row_low][mat[0].length-1]>=ele)
			binarySearchMat(mat, row_low, col_mid, mat[0].length-1, ele);
		else if(mat[row_low][mat[0].length-1]<=ele && mat[row_low+1][col_mid]>=ele)
			binarySearchMat(mat, row_low+1, 0, col_mid, ele);
		else 
			binarySearchMat(mat, row_low+1, col_mid, mat[0].length-1, ele);
			
	}
        
        public int findKthElement(int[] a, int stA, int endA, int[] b, int stB, int endB, int k){
		int m = endA-stA+1;
		int n = endB-stB+1;
		if(k>(m+n) || k<1)
			return -1;
		if(m>n)
			return findKthElement(b,stB,endB,a,stA,endA,k);
		if(m==0)
			return b[stB+k-1];
		if(k==1)
			return Math.min(a[stA],b[stB]);
		int i = Math.min(m,k/2);
		int j = Math.min(n,k/2);
		if(a[stA+i-1]>b[stB+j-1])
			return findKthElement(a,stA,endA,b,stB+j,endB,k-j);
		else
			return findKthElement(a,stA+i,endA,b,stB,endB,k-i);
	}
	public double findMedian(int[] a, int[] b){
		int m = a.length;
                int n = b.length;
                int k = (m+n)/2;
                //give starting and end indices of both arrays
                //Kth element is such that at index 4, we have 5th element and so on
                if((m+n)%2 == 1)
                    return findKthElement(a,0,m-1,b,0,n-1,k+1);
                else
                    return (findKthElement(a,0,m-1,b,0,n-1,k)+findKthElement(a,0,m-1,b,0,n-1,k+1))/2.0;
	}
        
        public String shortestPossibleString(String a, String b){
		int[][] dp = new int[a.length()+1][b.length()+1];
                //form the dynamic table consisting of 
                //length of shortest substring till that points 
		for(int i=0;i<=a.length();i++){
			for(int j=0;j<=b.length();j++){
				if(i == 0)
					dp[i][j] = j;
				else if(j == 0)
					dp[i][j] = i;
                                else if(a.charAt(i-1) == b.charAt(j-1))
					dp[i][j] = 1+dp[i-1][j-1];
				else
					dp[i][j] = 1+Math.min(dp[i-1][j],dp[i][j-1]);
				
			}
		}
                //Backtrack from here to find the shortest substring
                char[] sQ = new char[dp[a.length()][b.length()]];
                int s = dp[a.length()][b.length()]-1;
                int i=a.length(), j=b.length();
                while(i!=0 && j!=0){
                    // If current character in a and b are same, then
                    // current character is part of shortest supersequence
                    if(a.charAt(i-1) == b.charAt(j-1)){
                        sQ[s] = a.charAt(i-1);
                        i--;
                        j--;
                        s--;
                    }
                    else {
                        // If current character in a and b are different
                        if(dp[i-1][j] >= dp[i][j-1]){
                            sQ[s] = b.charAt(j-1);
                            j--;
                            s--;
                        }
                        else{
                            sQ[s] = a.charAt(i-1);
                            i--;
                            s--;
                        }
                    }                        
                }
                // If b reaches its end, put remaining characters
                // of a in the result string
                while(i!=0){
                    sQ[s] = a.charAt(i-1);
                    i--;
                    s--;
                }
                // If a reaches its end, put remaining characters
                // of b in the result string
                while(j!=0){
                    sQ[s] = b.charAt(j-1);
                    j--;
                    s--;
                }
		return String.valueOf(sQ);
	}
        public void getCombinedString(String... values){
            
            String sSQ = shortestPossibleString(values[0],values[1]);
            for(int i=2;i<values.length;i++){
                sSQ = shortestPossibleString(values[i],sSQ);
            }
            System.out.println(sSQ);
        }
        public void patternDetector(String str, String pattern){
            int i=0;
            while(str.indexOf(pattern, i) != -1){                
                i = str.indexOf(pattern, i);
                System.out.println(i);
                i+=pattern.length();
            }
        }
        int[][] grid =  {{0, 0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0}};
        public void sudokuSolver(){
		
		if(solveSudokuUtil()){
			for(int i=0;i<9;i++){
				for(int j=0;j<9;j++)
					System.out.print(grid[i][j]+" ");
				System.out.println();
			}
		}
		else
			System.out.println("Solution does not exists!");
	}
	
	public boolean solveSudokuUtil(){
		int[] pair = findNextUnassigned();
		if(pair == null)
			return true;
		else{
			int row = pair[0];
			int col = pair[1];
			for(int i=1;i<=9;i++){
				if(isSafe( row, col, i)){
					grid[row][col] = i;
					if(solveSudokuUtil())
						return true;
					grid[row][col] = 0; //backtrack
				}
			}
		}
		return false;
	}
	public int[] findNextUnassigned(){
		int[] item = new int[2];
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(grid[i][j] == 0){
					item[0] = i;
					item[1] = j;
					return item;
				}
					
			}
		}
		return null;
		
	}
	public boolean isSafe( int row, int col, int n){
		if(isRowSafe( row, n) && isColSafe( col, n) && isGridSafe( row, col, n))
			return true;
		return false;
	}
	public boolean isRowSafe( int row, int n){
		for(int i=0;i<9;i++){
			if(grid[row][i] == n)
				return false;
		}
		return true;
	}
	public boolean isColSafe( int col, int n){
		for(int i=0;i<9;i++){
			if(grid[i][col] == n)
				return false;
		}
		return true;
	}
	public boolean isGridSafe( int row, int col, int n){
		row = row - row%3;
		col = col - col%3;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(grid[i+row][j+col] == n)
					return false;
			}
		}
		return true;
	}
        boolean matchRegex(String pattern1, String pattern2){
		boolean dp[][] = new boolean[pattern1.length()+1][pattern2.length()+1];
		dp[0][0] = true;
                //fill up for the starting row
		for(int j=1;j<=pattern2.length();j++){
			if(pattern2.charAt(j-1) == '*')
				dp[0][j] = dp[0][j-2];
			
		}
                //fill up for the starting column
		for(int j=1;j<=pattern1.length();j++){
			if(pattern1.charAt(j-1) == '*')
				dp[j][0] = dp[j-2][0];
			
		}
                
                //fill for rest table
		for(int i=1;i<=pattern1.length();i++){
			for(int j=1;j<=pattern2.length();j++){
                            //if second character of pattern1 is *, it will be equal to 
                            //value in top row of current cell
                            if(pattern1.charAt(i-1) == '*'){
//                                if(j<2)
//                                    dp[i][j] = dp[i-2][j] || dp[i][j-1];
//                                else
                                    dp[i][j] = dp[i-2][j] || dp[i][j-1];
                            }
                                
                            else if(pattern1.charAt(i-1)!='*' && pattern2.charAt(j-1)!='*' 
                                        && (pattern1.charAt(i-1) == pattern2.charAt(j-1) 
                                        || pattern1.charAt(i-1)=='.' || pattern2.charAt(j-1)=='.'))
					dp[i][j] = dp[i-1][j-1];
                            else if(pattern2.charAt(j-1) == '*'){
					boolean temp = false;
					if(pattern2.charAt(j-2) == pattern1.charAt(i-1) 
                                                || pattern1.charAt(i-1)=='.' 
                                                || pattern1.charAt(i-1)=='*' 
                                                || pattern2.charAt(j-2)=='.' 
                                                )
						temp = dp[i-1][j];
					dp[i][j] = dp[i][j-2] || temp;
					
				}
			}
		}
                //comment this portion if you don't want to see entire dp table
                for(int i=0;i<=pattern1.length();i++){
                    for(int j=0;j<=pattern2.length();j++)
                        System.out.print(dp[i][j]+" ");
                    System.out.println("");
                }
		return dp[pattern1.length()][pattern2.length()];
	}

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Example e = new Example(); 
        //System.out.println(e.longestNonRepeatingLength("geeksforgeeks"));
        String p = "2432902008176640029";  
        int a1[] = {1,4,8,10};
        int b1[] = {2,3,6,7};
        int[][] arr = {{10,20,30,45}};
        int[] bArr = {6,2,5,4,5,1,6};        
        int[][] mat = { {10, 20, 30, 40},
                      {15, 25, 35, 45},
                      {27, 29, 37, 48},
                      {32, 33, 39, 50}};
        int matrix[][] = {{0, 6, 8, 9, 11},
                     {20, 22, 28, 29, 31},
                     {36, 38, 50, 61, 63},
                     {64, 66, 100, 122, 128}};
        int a = 30,  b = 101;
        BigInteger f = new BigInteger(p);
        BigInteger f1 = f.multiply(BigInteger.valueOf(a));
        BigInteger f2 = f1.add(BigInteger.valueOf(b));
//        e.possibleCombinations(3, bArr);
        System.out.println(e.matchRegex("x*.*", ".*x*"));
        
        //System.out.println(f2);
        //System.out.println(f.nextProbablePrime());
        
        //e.mergeIntervals(b, c);
//        e.checkList();
//        e.possibleWordBreak("abcd");
        //System.out.println(77 & 4);
        //System.out.println(Example.findMax(2,inpStr1));
        
//        al.
        
        //e.findSmallestNumber(9, 2);
//e.checkPalindrome("abcdgcba");
        //System.out.println(e.reverseSentence("This is Sparta"));
        //e.replace("My name is Anthony Gonsalves. Mein Duniya mein akela hun.", '.', '@');
    }

    
}