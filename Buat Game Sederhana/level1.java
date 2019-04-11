import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends World
{

    /**
     * Constructor for objects of class level1.
     * 
     */
    public level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject (new turtle (),20,200);
        addObject (new banana (),500,200);
        addObject (new banana (),200,200);
        addObject (new banana (),100,200);
        
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        bola bola = new bola();
        addObject(bola,149,48);
        bola.setRotation(90);
        score score = new score();
        addObject(score,256,43);
        bola bola2 = new bola();
        addObject(bola2,478,50);
        bola2.setRotation(90);
        banana banana = new banana();
        addObject(banana,305,84);
        banana banana2 = new banana();
        addObject(banana2,306,328);
        banana2.setLocation(423,353);
    }
}
