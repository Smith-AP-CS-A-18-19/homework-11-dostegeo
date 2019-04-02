import java.util.ArrayList;
public class Homework11A extends Homework11 {
	public Homework11A(){
		super();
	}

	/* Problem 4:
	 * Write the method problem4 in the Homework11A
	 * class. This should calculate and return the sum
	 * of the values in the stored ArrayList. The method
	 * header is:
	 * public int problem4() {
	 */
public int problem4() {
	int total = 0;
  ArrayList<Integer> arrList = getList();
	for(int i = 0; i< arrList.size(); i++){
		total += arrList.get(i);
	} return total;
}
	/* Problem 5:
	 * In the Homework11A class, override the problem2
	 * method. problem2 in Homework11A should instead
	 * only keep the elements that evenly divide n
	 */
	 public void problem2(int n){
		 int i = 0;
     ArrayList<Integer> arrList = getList();
		 while (i < arrList.size()){
			 if(n % arrList.get(i) != 0){
				 arrList.remove(arrList.get(i));
			 }else{
				 i++;
			 }
		 }
	 }
 }
