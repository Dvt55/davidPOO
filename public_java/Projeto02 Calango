import java.util.Scanner;

public class carro {
	int km;
	int tanque;
	int qtd;
	int suporteMax;
	int tanqueMax;
	
	carro(int km, int tanque, int suporteMax, int tanqueMax){
		this.km = 0;
		this.tanque = 0;
		this.suporteMax = 2;
		this.tanqueMax = 100;
	}
	
	void embarcar() {
		
		if(qtd < suporteMax) {
			qtd++;
			System.out.print("Opa! Um passageiro\n");
		}
		else {
			System.out.print("Infelizmente o carro está lotado :(\n");
		}
	}
	void desembarcar() {
		if(qtd <= 0) {
			System.out.print("Não tenho ngm para desembarcar\n");
		}
		else {
			System.out.print("Desembarcando passageiro...\n");
			qtd--;
		}
	}
	void abastecer() {
		if(tanque < tanqueMax) {
			tanque++;
			System.out.print("Enchendo tanque....\n");
		}
		else {
			System.out.print("O tanque já está cheio\n");
		}
		
	}
	void dirigir() {
		if(qtd > 0 && tanque > 0) {
			tanque--;
			km++;
			if(tanque > 0) 
				System.out.print("Vamos à nossa viagem!\n");
		}
		else if(qtd > 0 && tanque <= 0) {
			System.out.print("Não temos tanque suficiente para isso :(\n");
		}
		else {
			System.out.print("Não temos ngm para transportar ainda\n");
		}
	}
	public String toString() {
		return "|" + "passageiros: "+qtd+ "|" + "|" + "tanque:" +tanque+ "/"+tanqueMax+ "|" +
				"km:"+km +"/"+tanqueMax+"\n";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		carro golf = new carro(0, 0, 2, 100);
		
		while(true) {
			String opcao;
			System.out.print("Escolha uma opção: \n");
			System.out.print("|Entrar|\n"
							+"|Sair|\n"
							+"|Dirigir|\n"
							+"|abastecer\n"
							+"|Mostrar|\n");
			
			opcao = sc.nextLine();
			String str1 = "Entrar";
			String str2 = "Sair";
			String str3 = "Dirigir";
			String str4 = "Mostrar";
			String str5 = "abastecer";
			
			if(opcao.equals(str1)) {
				golf.embarcar();
			}
			if(opcao.equals(str2)) {
				golf.desembarcar();
			}
			if(opcao.equals(str3)) {
				golf.dirigir();
			}
			if(opcao.equals(str5)) {
				golf.abastecer();
			}
			if(opcao.equals(str4)) {
				System.out.printf(golf.toString());
			}
			
		}

	}

}
