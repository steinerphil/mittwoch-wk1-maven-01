import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testAdd(){
        // GIVEN
        int int1 = 1;
        int int2 = 2;

        // WHEN
        int result = Main.add(int1, int2);

        // EXP.
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testIsEqual(){
        // GIVEN
        int int1 = 1;
        int int2 = 2;

        //WHEN
        boolean check = Main.isEqual(int1, int2);

        //EXP.
        Assertions.assertEquals(false, check);
    }



}
