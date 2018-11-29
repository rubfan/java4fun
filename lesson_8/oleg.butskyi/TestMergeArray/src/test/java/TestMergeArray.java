import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMergeArray {

    int[] firstArray = {1, 3, 5, 7, 9};
    int[] secondArray = {2, 4, 6, 8, 10};
    int[] result = {1,2,3,4,5,6,7,8,9,10};

    @Before
    public void init (){


    }

    @Test
    public void TestMerge (){
        MergeArray merge = new MergeArray();
       int[] MergedArray = merge.mergeArraysSorted(firstArray,secondArray);

        Assert.assertArrayEquals(result , MergedArray);
    }


}
