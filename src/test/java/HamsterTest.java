import org.junit.Assert;
import org.junit.Test;
import sun.security.krb5.internal.crypto.HmacMd5ArcFourCksumType;

public class HamsterTest {
    @Test
    public void testConstructor(){
        //given
        String expectedName = "david";

        //when
        Hamster hamster = new Hamster(expectedName);
        String actualName = Hamster.getName();

        //then
        Assert.assertEquals(expectedName,actualName);
    }

    @Test
    public void testSpeak(){
        //given
        String expectedSpeak = "squeak";

        //when
        Hamster hamster = new Hamster("Hamster name");
        String actualSpeak = hamster.speak();

        //then
        Assert.assertEquals(expectedSpeak,actualSpeak);
    }

    @Test
    public void testSetName(){
        //given
        String expectedName = "david";
        Hamster hamster = new Hamster("Hamster name");

        //when
        String actualName = hamster.getName();

        //then
        Assert.assertEquals(expectedName,actualName);
    }
}
