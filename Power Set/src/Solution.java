import java.util.*;
public class Solution {
	public static void main(String[] args) {
		int n = 5; //represents all subsets of {1,2,3}
		LinkedList<HashSet<Integer>> ps = new LinkedList<HashSet<Integer>>();
		ps.add(new HashSet<Integer>());
		List<HashSet<Integer>> allSubsets = generateSubsets(n,ps);
		for(Set s : allSubsets){
			System.out.println(s);
		}


	}
	public static LinkedList<HashSet<Integer>> generateSubsets(int n,LinkedList<HashSet<Integer>> ps){

		for(int i = 1 ; i<=n ; i++){
			LinkedList<HashSet<Integer>> newList = new LinkedList<HashSet<Integer>>();
			for(HashSet<Integer> s : ps){
				HashSet<Integer> newSet = (HashSet<Integer>) s.clone();
				newSet.add(i);
				newList.add(newSet);
			}
			ps.addAll(newList);
		}
	return ps;
	}
}
