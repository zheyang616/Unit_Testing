import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ProgramTest {
    @Test
    public void testIsPrime_IsValidPrime_ReturnTrue(){
            //Arrange

            //Ace
            boolean IsPrime = Program.IsPrime(7);

            //Assert
            assertTrue(IsPrime);
        } 
    @Test    
    public void IsPrime_IsZeroValue_ReturnFalse(){
        //Arrange

        //Act
        boolean IsPrime = Program.IsPrime(0);

        //Assert
        assertFalse(IsPrime);

    }

    @Test
    public void IsPrime_NotValidPrime_ReturnFalse(){
        //Arrange

        //Act
        boolean IsPrime = Program.IsPrime(10);

        //Assert
        assertFalse(IsPrime);
    }
    @Test
    public void Special_Input2023_ThrowExceptiontestSpecial() {
        //Act 
        

        //Assert
        assertThrows(NullPointerException.class, ()-> Program.Special(2024));
    }
}
