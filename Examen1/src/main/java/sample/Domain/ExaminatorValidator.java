package sample.Domain;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

public class ExaminatorValidator implements IValidator<Examinator>{
   public void validate (Examinator examinator){
       if (examinator.getNume().length()<3){
           throw new RuntimeException("Numele trebuie sa aiba minim 3 litere");
       }
       if (examinator.getCNP().length()!=13){
           throw new RuntimeException("CNP trebuie sa aiba 13 cifre");
       }
       String variabila = examinator.getCNP();
       for (char c : variabila.toCharArray()) {
           if (!Character.isDigit(c)) {
               throw new RuntimeException("CNP-ul trebuie sa contina doar cifre");
           }

       }

   }
}
