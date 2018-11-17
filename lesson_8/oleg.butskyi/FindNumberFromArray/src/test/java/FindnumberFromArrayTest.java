
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FindnumberFromArrayTest {

    FindnumberFromArray FindNumber;

    int [] arrayForcheck;
    int sizeOfArray = 10;
    int numbers;

    public FindnumberFromArrayTest(int numbers) {
        this.numbers = numbers;
    }

    @Parameterized.Parameters
    public static Collection numbers(){
        return Arrays.asList(new Object[][]{{1}, {2}, {3}, {5}, {7}});
    }

    @Before
    public void init (){
        FindNumber = new FindnumberFromArray();
        arrayForcheck = new int[sizeOfArray];
    }


    @Test
    public void boolSummNumInArray() {

        FindNumber.fillArrayRandom(arrayForcheck);
        FindNumber.sortArrayGnome(arrayForcheck);
        boolean bo = FindNumber.boolSummNumInArray(arrayForcheck, numbers);
        FindNumber.printArray(arrayForcheck);
        System.out.println("\n" + bo);
    }
}