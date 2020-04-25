/**
View Problem Here: https://practiceit.cs.washington.edu/problem/view/bjp4/chapter10/e15-filterRange
*/

public static void filterRange(ArrayList<Integer> list, int min,int max){

    for(int i = 0;i<list.size();i++){
        int num = list.get(i);
    if(num <= max && num >= min){
      list.remove(i);
        i--;
     } 
    }
}
