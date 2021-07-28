/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;


public class Genre implements Comparable<Genre>{
    public int id;
    public String name;
    
    public Genre(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public int compareTo(Genre comparestu) {
        int compareage=((Genre)comparestu).id;
        /* For Ascending order*/
        return this.id-compareage;

        /* For Descending order do like this */
        //return compareage-this.id;
    }
}
