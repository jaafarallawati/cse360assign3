/** Description of Calculator:
*		This class is a simple calculator that add, subtract, multiply and divide
*		This class also shows the history of the operation
*
* @author Jaafar Al Lawati
* @version Feb 21, 2015.
* Pin 102
* 
* 
* 
*/
package cse360assign3;

public class Calculator {

	private int total;
	private String history;
	
	/**
	 * Sets total to 0 and adds 0 to the history string   
	 * 
	 * @param none
	 */
	public Calculator () {
		total = 0; 
		history = "0";
	}
	
	/**
	 * Returns the total value
	 * 
	 * @param none
	 * @return	total		the total after the operations
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds the value to the total
	 * 
	 * @param value			the value that will be added to the total
	 * @return	none		
	 */
	public void add (int value) {
		total+= value;
		history += " + " + value;
	}
	
	/**
	 * subtract the value from the total
	 * 
	 * @param value			the value that will be subtract from the total
	 * @return	none		
	 */
	public void subtract (int value) {
		total-= value;
		history += " - " + value;
	}
	
	/**
	 * multiply's the total with the value
	 * 
	 * @param value			the value that will be multiplied with
	 * @return	none		
	 */
	public void multiply (int value) {
		total*= value;
		history += " * " + value;
	}
	
	/**
	 * divide's the total with the value
	 * 
	 * @param value			the value that will be divided with
	 * @return	none		
	 */
	public void divide (int value) {
		if (value !=0){
			total/= value;
			history += " / " + value;
		}
		else{
			total =0;
			history += " / " + value;
		}
	}

	/**
	 * Returns the history of the operations
	 * 
	 * @param none			
	 * @return	history		history of the operations		
	 */
	public String getHistory () {
		return history;
	}
}