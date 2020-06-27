package backtracking;
import java.util.*;
public class PrintAllCombinationOfFactor_WaysToFactorize {

    public static List<List<Integer> > factComb(int n) {
     
        List<List<Integer> > result_list =  new ArrayList<>(); 
        List<Integer>single_result_list = new ArrayList<>(); 
        factorsListFunc(2, 1, n, result_list, single_result_list); 
        return result_list; 
    } 
  
    
    public static void factorsListFunc(int first,int each_prod, int n, List<List<Integer> > result_list, List<Integer>single_result_list) {
     
        
        if (first > n || each_prod > n) 
            return; 
  
        if (each_prod == n) { 
            ArrayList<Integer> t = new ArrayList<>(single_result_list); 
            result_list.add(t); 
            return; 
        } 
        
        for (int i = first; i < n; i++) { 
            if (i * each_prod > n) 
                break; 
            
            if (n % i == 0) { 
        
                single_result_list.add(i);              
                factorsListFunc(i, i * each_prod, n, result_list, single_result_list); 
                
                //This line making the backtracking possible
                single_result_list.remove(single_result_list.size() - 1); 
            } 
        } 
    } 
  
    
    public static void main(String[] args) {
     
        int n =24 ; 
        List<List<Integer> > resultant = factComb(n); 
  
        for (List<Integer> i : resultant) { 
            for (int j : i)  
                System.out.print(j + " ");             
            System.out.println(); 
        } 
    } 
    
}
