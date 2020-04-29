package lists;                                //QUESTION OF INTERVAL MERGING

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static ArrayList<Interval> insert(ArrayList<Interval>intervals, Interval newInterval){  //Return type= ArrayList<Interval>
                                                                                                   //Parameters = ArrrayList<Interval>intervals
		                                                                                           //             Interval newInterval
		if(intervals==null) {
			intervals = new ArrayList<Interval>();
			intervals.add(newInterval);
			return intervals;   
		}else if(intervals.size()==0) {
			intervals = new ArrayList<Interval>();
			intervals.add(newInterval);
			return intervals; 
		}
			
		
		Interval toInsert =newInterval;  //The interval to be inserted or to be merged
		int i=0;
		while(i<intervals.size()) {
			Interval current =intervals.get(i);
			if(current.end<toInsert.start) {              //case-->2
				i++;
				continue;
				
			}else if(toInsert.end<current.start) {        //case-->3
				intervals.add(i,toInsert);
                break;
                 
			}else {                                        //case-->4 (all overlapping cases)
				toInsert.start = Math.min(toInsert.start, current.start);
				toInsert.end = Math.max(toInsert.end,current.end);
				intervals.remove(i);
			}
		}
		

		if(i==intervals.size()) {
			intervals.add(toInsert);
		}
		return intervals;
	

	}	
	public static void main(String args[]) {
		
		
		Interval obj =new Interval(2,3); 
		Interval obj1 =new Interval(5,6);
		Interval obj2 =new Interval(7,9);
		
		
		ArrayList <Interval>currentInterval = new ArrayList<>();
		currentInterval.add(obj);
		currentInterval.add(obj1);
		currentInterval.add(obj2);
		System.out.println(currentInterval);
		
		ArrayList<Interval> result = new ArrayList<>();
				
		result =insert(currentInterval,obj2);
		System.out.println(result);
		
	}
		
	}

class Interval{
	int start,end;
	
	Interval(){
		start =0; end =0;             //constructors
	}                  
	Interval(int start, int end){
		this.start =start; this.end =end;
	}
}