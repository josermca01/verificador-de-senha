package desafio_senha.demo.Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


public class senha {
    private String valor;

    public senha(String valor) {
        this.valor = valor;
    }

    public senha(){

    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public List<String> verify(String senha){
        List<String> check = new ArrayList<>();
        checklength(senha,check);
        checkdigit(senha,check);
        checklower(senha,check);
        checkupper(senha,check);
        checkspecial(senha,check);
        return check;
    }


    private void checklength(String senha,List<String>check){
        if (!(senha.length()>=8)) {
            check.add("Senha deve conter pelo menos 8 digitos");                 
        }
    }
    private void checkdigit(String senha,List<String>check){
        String ONE_DIGIT = ".*[0-9].*";  
        if (!Pattern.matches(ONE_DIGIT,senha)) {
            check.add("Senha deve conter pelo menos um digito");                
        }
    }
    private void checklower(String senha,List<String>check){
        String LOWER_CASE = ".*[a-z].*";
        if (!Pattern.matches(LOWER_CASE,senha)) {
            check.add("Senha deve conter pelo menos um caracter minusculo");             
        }
    }
    private void checkupper(String senha,List<String>check){
        String UPPER_CASE = ".*[A-Z].*";
        if (!Pattern.matches(UPPER_CASE,senha)) {
            check.add("Senha deve conter pelo menos um caracter maiusculo");               
        }
    }
    private void checkspecial(String senha,List<String>check){
        String SPECIAL_CHAR= ".*[\\W].*";
        if (!Pattern.matches(SPECIAL_CHAR,senha)) {
            check.add("Senha deve conter pelo menos um caracter especial");                 
        }
    }



}
