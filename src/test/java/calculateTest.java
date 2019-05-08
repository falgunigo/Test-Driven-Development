import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class calculateTest {

    private Calculate calculateFizzBuzz;

    @Before
    public  void setUp(){
        calculateFizzBuzz = new Calculate();
    }

    @Test
    public void inputIsZero(){
        //arrange
        calculateFizzBuzz.setInput(0);

        //assert
        assertEquals(calculateFizzBuzz.getInput(),0);
    }

    @Test
    public void inputIsNotZero(){
        //arrange
        calculateFizzBuzz.setInput(10);
        //assert
        assertEquals(calculateFizzBuzz.getInput(),10);
    }

    @Test
    public void inputIsFizz(){
        //arrange
        calculateFizzBuzz.setInput(3);

        //assert
        assertEquals(calculateFizzBuzz.getResult(),"Fizz");
    }

    @Test
    public void inputIsBuzz(){
        //arrange
        calculateFizzBuzz.setInput(5);

        //assert
        assertEquals(calculateFizzBuzz.getResult(),"Buzz");
    }

    @Test
    public void inputIsFizzBuzz(){
        //arrange
        calculateFizzBuzz.setInput(90);

        //act
        String result = calculateFizzBuzz.getResult();

        //assert
        assertEquals(result,"FizzBuzz");
    }

    @Test
    public void inputHasDigitThreeIsFizz(){

        //arrange
        calculateFizzBuzz.setInput(13);

        //assert
        assertEquals(calculateFizzBuzz.getResult(),"Fizz");
    }

    @Test
    public void inputHasDigitFiveIsBuzz(){

        //arrange
        calculateFizzBuzz.setInput(456);

        //assert
        assertEquals(calculateFizzBuzz.getResult(),"Buzz");
    }
}