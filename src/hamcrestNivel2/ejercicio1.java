package hamcrestNivel2;


import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import org.junit.jupiter.api.Test;

/*
 * o    Exercici 1. Crea una llista d'enters. Comprova que conte una 
 * llista de numeros en un determinat ordre, i tambe que conte una llista
 *  en qualsevol ordre
o    Exercici 2. Fent servir aquesta mateixa llista d'enters, comprova que
 cada element es mes gran que un determinat valor.

o    Exercici 3. Crea una clase anomenada Alumne, amb els aributs: nom, 
cognom, edat, adreça. Comprova que donat un alumne creat, aquest conte 
l'atribut nom amb el valor 'Joan'.
*/
class ejercicio1 {
 
	@Test
    public void fellowShipOfTheRingShouldContainer7() {
        assertThat("Gandalf", length(is(7)));
    }
   
	public static  Matcher<String> length(Matcher<? super Integer> matcher) {
        return new FeatureMatcher<String, Integer>(matcher, "a String of length that", "length") {
            @Override
            protected Integer featureValueOf(String actual) {
              return actual.length();
            }
        };
    }

}
