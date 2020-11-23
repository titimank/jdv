/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryproject;

/**
 *
 * @author Asus
 */
public class Member {
    /**
    * The member's ID
    */
    private int memberID;
    /**
    * The member's name
    */
    private String memberName;
    /**
    * The 
    */
    private String[] book = new String[2];
    /**
    * The number of book
    */
    private int numberOfBook;
    
    /**
    * 
    * @param id 
    * @param name
    */
    public Member(int id, String name) {
        this.memberName = name;
        this.memberID = id;
        numberOfBook = 0;
    }
    
    /**
     * 
     * @return member's ID
     */
    public int getMemberID() {
        return memberID;
    }
    /**
     * 
     * @param n
     * @return book
     */
    public String getBook(int n) {
        if (n >= 2 || n <= -1 || book[n] == null) {
            return "none";
        }
        return book[n];
    }
    /**
     * 
     * @param b
     */
    public void addBook(String b) {
        for (int i = 0; i < book.length; i++) {
            if (book[i] == null) {
                book[i] = b;
                numberOfBook++;
                break;
            }
        }

    }
    /**
     * 
     * @param c
     */
    public void cancelBook(String c) {

        for (int i = 0; i < book.length; i++) {
            if (book[i] != null) {
                if (book[i].equals(c)) {
                    book[i] = null;
                    numberOfBook--;
                }

            }
        }

    }
    
    /**
     * 
     * @return member's name
     */
    public String getName() {
        return memberName;

    }
    
     /**
     * 
     * @return number of book
     */
    public int getNumberOfBook() {
        return numberOfBook;
    }
    
    /**
     * 
     * 
     */
    @Override
    public String toString() {
        String book = "";
        if (this.book[0] != null || this.book[1] != null) {
            book += "\n" + "Borrowed book : ";
        }
        if (this.book[0] != null) {
            book += this.book[0];
            if (this.book[1] != null) {
                book += ", ";
            }
        }

        if (this.book[1] != null) {
            book += this.book[1];
        }
        if (memberID==-1){
            return "Full of members!!";
        }
        return "Member {" + "Your member ID = " + memberID + ", Your member name = " + memberName + '}' + book;
    }

}
