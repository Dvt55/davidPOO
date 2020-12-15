import java.util.Scanner;

public class tamagotchi {
	private int PowerMax, FomeMax, LimpezaTotal;
	private int energia, fome, limpeza;
	private int diamantes;
	private int idade;
	private boolean vivo;

public tamagotchi(int PowerMax, int FomeMax, int LimpezaTotal){
	this.PowerMax = PowerMax;
	this.energia = energia;
	
	this.FomeMax = FomeMax;
	this.fome = fome;
	
	this.LimpezaTotal = LimpezaTotal;
	this.limpeza = limpeza;
	
	this.diamantes = 0;
	this.idade = 1;
	this.vivo = true;
}
private void setenergia(int energia) {
	if(!estavivo()) {
		return;
	}
	this.energia = energia;
	if(energia > this.PowerMax) {
		this.energia = this.PowerMax;
	}
}
private void setLimpeza(int limpeza) {
	if(!estavivo()) {
		return;
	}
	this.limpeza = limpeza;
	if(limpeza > LimpezaTotal) {
		this.limpeza = LimpezaTotal;
	}
}
private void setFome(int fome) {
	if(!estavivo()) {
		return;
	}
	this.fome = fome;
	if(fome > this.FomeMax) {
		this.fome = FomeMax;
	}
}
public int getEnergia() {
	return this.energia;
}
public int getFome() {
	return this.fome;
}
public int getDiamantes() {
    return this.diamantes;
}
public int getLimpeza() {
    return this.limpeza;
}
public int getFomeMax() {
    return this.FomeMax;
}
public int getLimpezaMax() {
    return this.LimpezaTotal;
}
public int getIdade() {
    return this.idade;
}
public int getEnergiaMax() {
	return this.PowerMax;
}
public void brincar() {
	if(!estavivo()) {
		return;
	}
	this.setenergia(getEnergia()-2);
	if(this.energia < 0) {
		this.setenergia(getEnergia() + 2);
	}
	this.setFome(getFome()-1);
	if(this.fome < 0) {
		this.setFome(getFome() + 1);
	}
	this.setLimpeza(getLimpeza()-3);
	if(this.limpeza < 0) {
		this.setLimpeza(getLimpeza() + 3);
	}
	this.diamantes++;
	this.idade++;
}
public void dormir() {
	if(!estavivo()) {
		return;
	}
	if(this.PowerMax - this.energia < 5)
		return;
	
	this.setenergia(getEnergiaMax());
	this.idade++;
}
public void tomar_banho() {
	if(!estavivo()) {
		return;
	}
	this.setLimpeza(getLimpezaMax());
	this.setenergia(getEnergia());
	this.setFome(getFome()-1);
	if(this.fome < 0) {
		this.setFome(getFome() + 1);
	}
	this.idade++;
	
}
public void comer() {
	if(!estavivo()) {
		return;
	}
	this.setFome(getFome()+3);
	this.setenergia(getEnergia()+2);
	this.setLimpeza(getLimpeza()-2);
	if(this.limpeza < 0) {
		this.setLimpeza(getLimpeza()+2);
	}
	this.idade++;
}
public boolean estavivo(){
    if(!vivo){
        System.out.println("Game Over...");
        return false;
    }
    return true;
}
public String toString() {
	return "Energia: " + this.energia + "/" + this.PowerMax
		   + "\n" + "Saciedade: " + this.fome + "/" + this.FomeMax
	       + "\n" + "Limpeza: " + this.limpeza + "/" + this.LimpezaTotal
	       + "\n" + "Diamantes: " + this.diamantes
	       + "\n" + "Idade: " + this.idade + "\n ";
}
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	tamagotchi Pow = new tamagotchi(100, 100, 100);
	while(true) {
		System.out.print("Escolha sua tarefa: "
						 + "\n"
						 + "1) - Brincar "
						 + "\n"
				         + "2) - Tomar banho "
						 + "\n"
						 + "3) - Comer "
						 + "\n"
				         + "4) - Dormir "
						 + "\n"
				         + "5) - Mostrar ");
		int opcao = x.nextInt();
		switch(opcao) {
		case 1:
			Pow.brincar();
			break;
		case 2:
			Pow.tomar_banho();
			break;
		case 3:
			Pow.comer();
			break;
		
		case 4:
			Pow.dormir();
			break;
		case 5:
			System.out.printf(Pow.toString());
		}
	}
	
	

}
}


