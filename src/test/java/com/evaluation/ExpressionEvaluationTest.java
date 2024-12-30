package com.evaluation;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class ExpressionEvaluationTest {

    @Test
    void ChainVide() {
//Given
        String chain="";
        int nbr =0;
//when
        int resultat=ExpressionEvaluate. evaluate(chain);
//Then
        assertThat(resultat).isEqualTo(nbr);

    }

    @Test
    void SeulNombre() {

        //given
        String chain="5";
        int nbr=5;

        //when
        int resultat=ExpressionEvaluate.evaluate(chain);

        //then
        assertThat(resultat).isEqualTo(nbr);
       // assertEquals("5",ExpressionEvaluate.evaluate ("5"));
    }

    @Test
    void testdeuxNumbers() {
        String chain="1,2";
        int nbr =3;
        int resultat=ExpressionEvaluate.evaluate(chain);
        assertThat(resultat).isEqualTo(nbr);

    }

    @Test
    void testMultipleNumbers() {
        String chain="1,2,3,4,5";
        int nbr =15;
        int resultat=ExpressionEvaluate.evaluate(chain);
        assertThat(resultat).isEqualTo(nbr);

    }


}
