/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.Srilekha04lab;

/**
 *
 * @author Srilekha Janagam
 */
public class Cheetah extends Animal {
    /**
    * Cheetah constructor
    * @param name - the name of this instance of an animal
    */
    public Cheetah(String name){
        super(name);
    }
     @Override
    public void move() {
        System.out.println("When I move,I walk, walk, walk.");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void speak() {
        System.out.println("I'm an cheetah! "+this.name+" is my petname");//To change body of generated methods, choose Tools | Templates.
    }
    
    
}