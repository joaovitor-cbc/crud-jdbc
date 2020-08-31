/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joao_vitor
 */
public class TesteRegex {
    public static void main(String[] args) {
        String regex= "^\\d{1,12}+(\\,)?+(\\d{0,2})$";
        
        System.out.println("teste1".matches(regex));
        System.out.println("12".matches(regex));
        System.out.println("12,12".matches(regex));
        System.out.println("13".matches(regex));
        System.out.println("12345".matches(regex));
    }
}
