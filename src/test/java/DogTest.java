import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void constructorTest(){
    //given
     String expectedName = "fawn";

    //when
     Dog dog = new Dog(expectedName);
     String actualName = dog.getName();

     //then
        Assert.assertEquals(expectedName,actualName);

    }

    @Test
    public void speakTest(){
        //given
        String expectedSpeak = "Bark";

        //when
        Dog dog = new Dog("DogName");
        String actualSpeak = dog.speak();

        //then
        Assert.assertEquals(expectedSpeak,actualSpeak);

    }

    @Test
    public void setNameTest(){
        //given
        String expectedName = "david";
        Dog dog = new Dog("dog name");

        //when
        dog.setName(expectedName);
        String actualName= dog.getName();

        //then
        Assert.assertEquals(expectedName,actualName);
    }
}


