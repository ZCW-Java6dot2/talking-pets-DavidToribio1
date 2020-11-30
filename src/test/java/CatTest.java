

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void constructorTest(){
        //Given
        String expectedName = "kitty";

        //When
        Cat cat = new Cat(expectedName);
        String actualName = cat.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void SpeakTest(){
        //given
        String expectedSpeak = "Meow!";

        //when
        Cat cat = new Cat("catName");
        String actualSpeak = cat.speak();

        //then
        Assert.assertEquals(expectedSpeak,actualSpeak);
    }
    @Test
    public void setNameTest(){
        //given
        Cat cat = new Cat("cat name");
        String expectedName = "David";

        //when
        String actualName = cat.getName();

        //then
        Assert.assertEquals(expectedName,actualName);
    }
}
