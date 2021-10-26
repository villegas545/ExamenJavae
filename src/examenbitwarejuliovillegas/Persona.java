/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenbitwarejuliovillegas;

/**
 *
 * @author Villegas
 */
public class Persona {
    private String nombre,NSS;
    private int peso,altura,edad;
    char sexo;
    
    public Persona(){
        nombre="";
        edad=0;
        sexo='H';
        peso=0;
        altura=0;
    }
    public String toString(){
        String mensaje="Nombre: "+nombre +" edad: "+edad+" sexo: "+sexo+" peso: "+peso+" altura: "+altura+ " NSS: "+NSS;
        return mensaje;
    }
    public String llenar(String _nombre,char _sexo,int _peso,int _altura,int _edad){
        nombre=_nombre;
        sexo=_sexo;
        NSS=generaNSS();
        peso=_peso;
        altura=_altura;
        edad=_edad;
        return "Datos capturados satisfactoriamente";
    }
    private boolean comprobarSexo(char sexo){
        boolean retorno=true;
        if(sexo=='H'){
            retorno=true;
        }else{
            retorno=false;
        }
    return retorno;
    }
    public boolean esMayorDeEdad(){
        boolean mensaje=true;
        if(edad>17){
            mensaje=true;
        }else{
            mensaje=false;
        }
        return mensaje;
    }
    public int calcularIMC(){
        int IMC=0;
        int retorno=0;
        IMC=peso/(altura*altura);
         if(comprobarSexo(sexo)){
            if(IMC<20){
                retorno=-1;
            }
            if(IMC>19 && IMC <26){
                retorno=0;
            }
            if(IMC>25){
                retorno=1;
            }
        }else{
            if(IMC<19){
                  retorno=-1;
            }
            if(IMC>18 && IMC<25){
                retorno=0;
            }
            if(IMC>24){
                retorno=1;
            }
        }
    return IMC;
    }
    private String generaNSS(){
        String randomPassword = "";
			//Randomly generate a character for the password length number of times
			for(int j = 0; j < 8; j++) {
				//Add a random lowercase or UPPERCASE character to our randomPassword String
				randomPassword += randomCharacter();
                                randomPassword=randomPassword.toUpperCase();
			}
        return randomPassword;
    }
    
    private static char randomCharacter() {
		//We multiply Math.random() by 62 because there are 26 lowercase letters, 26 uppercase letters, and 10 numbers, and 26 + 26 + 10 = 62
		//This random number has values between 0 (inclusive) and 62 (exclusive)
		int rand = (int)(Math.random()*62);
		
		//0-61 inclusive = all possible values of rand
		//0-9 inclusive = 10 possible numbers/digits
		//10-35 inclusive = 26 possible uppercase letters
		//36-61 inclusive = 26 possible lowercase letters
		//If rand is between 0 (inclusive) and 9 (inclusive), we can say it's a number/digit
		//If rand is between 10 (inclusive) and 35 (inclusive), we can say it's an uppercase letter
		//If rand is between 36 (inclusive) and 61 (inclusive), we can say it's a lowercase letter
		if(rand <= 9) {
			//Number (48-57 in ASCII)
			//To convert from 0-9 to 48-57, we can add 48 to rand because 48-0 = 48
			int number = rand + 48;
			//This way, rand = 0 => number = 48 => '0'
			//Remember to cast our int value to a char!
			return (char)(number);
		} else if(rand <= 35) {
			//Uppercase letter (65-90 in ASCII)
			//To convert from 10-35 to 65-90, we can add 55 to rand because 65-10 = 55
			int uppercase = rand + 55;
			//This way, rand = 10 => uppercase = 65 => 'A'
			//Remember to cast our int value to a char!
			return (char)(uppercase);
		} else {
			//Lowercase letter (97-122 in ASCII)
			//To convert from 36-61 to 97-122, we can add 61 to rand because 97-36 = 61
			int lowercase = rand + 61;
			//This way, rand = 36 => lowercase = 97 => 'a'
			//Remember to cast our int value to a char!
			return (char)(lowercase);
		}
	}
}
