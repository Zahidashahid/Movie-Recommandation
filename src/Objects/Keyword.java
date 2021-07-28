/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;


public class Keyword implements Comparable<Keyword>{
    public int id;
    public String name;
    
    public Keyword()
    {}
    
    public Keyword(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public int compareTo(Keyword comparestu) {
        int compareage=((Keyword)comparestu).id;
        /* For Ascending order*/
        return this.id-compareage;

        /* For Descending order do like this */
        //return compareage-this.id;
    }
}
