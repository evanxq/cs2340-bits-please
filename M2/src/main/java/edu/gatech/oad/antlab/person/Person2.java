package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Frances Tsenn
 * @version 1.2
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
        String output = "";
        for (int i = input.length(); i > 0; i--) {
            int pos = (int) Math.floor(Math.random() * i);
            output += input.charAt(pos);
            input = input.substring(0, pos) + input.substring(pos + 1);
        }
        return output;
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
    /**
     * Test the functionality of this class
     * in a static method.
     */
    public static void main(String[] args) {
        Person2 frances = new Person2("Frances Tsenn");
        System.out.println(frances.toString("123456789"));
        System.out.println(frances.toString("aBcD1234"));
    }
}
