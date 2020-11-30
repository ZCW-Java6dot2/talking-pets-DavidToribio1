package io.zipcoder.polymorphism;

import com.sun.xml.internal.ws.api.pipe.Engine;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class EngineTest {
@Test
public void getIntegerInputTest(){
        //Given
        Engine app = new Engine();
        Integer expectedInt = 5;

        //When
        String input = expectedInt.toString();
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Integer actualInt = app.getIntegerInput("How many pets do you have?");

        //Then
        Assert.assertEquals(expectedInt, actualInt);
        }

@Test
    public void getStringInputTest(){
        //Given
        Engine app = new Engine();
        String expectedString = "Dog";

        //When
        InputStream in = new ByteArrayInputStream(expectedString.getBytes());
        System.setIn(in);
        String actualString = app.getStringInput("What type of pet is this?");

        //Then
        Assert.assertEquals(expectedString, actualString);
        }

@Test
    public void getPetInfoTest(){
        //Given
        Engine app = new Engine();
        Dog dog = new Dog("Fido");
        Cat cat = new Cat("Felix");
        Hamster hamster = new Hamster("Feathers");

        //MainApplication will hold an ArrayList<Pet> that you can add to using addPet
        app.addPet(dog);
        app.addPet(cat);
        app.addPet(hamster);

        String expectedString =
        "\nFido says Bark!" + "\nFelix says Meow!" + "\nFeathers says Squeak!";

        //When
        String actualString = app.getPetInfo(); //getPetInfo should return a string like above

        //Then
        Assert.assertEquals(expectedString, actualString);



        }


        }