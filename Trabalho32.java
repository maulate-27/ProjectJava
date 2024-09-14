import java.util.*;
import java.io.PrintStream;
class Produto{
	public String nome;
	public int codigo;
	public double preco;
	public static H f;
	public static Scanner hj = new Scanner(System.in);	
	public static PrintStream kl = new  PrintStream(System.out);
	public Produto(){
		System.out.println("Digite o nome do produto");
		nome = hj.next();
		System.out.println("Digite o codigo do produto");
		codigo = hj.nextInt();
		System.out.println("Digite o preco do produto");
		preco = hj.nextDouble();
	}
	public void mostrarProduto(){
	 System.out.println("Nome: " + nome);
	 System.out.println("Codigo: " + codigo);
	 System.out.println("Preco: " + preco);
	}
}
class Computador extends Produto{
	public double processador;
	public double armazenamento;
	public double ram;
	
	public Computador(){
		kl.print("Processador: ");
		processador = hj.nextDouble();
		kl.print("Capacidade de armazenamento: ");
		armazenamento = hj.nextDouble();
		kl.print("RAM: ");
		ram = hj.nextDouble();
	}
	
	@Override
	public void mostrarProduto(){
		f.o.println(f.linha);
		System.out.println("Nome: " + nome);
		System.out.println("Codigo: " + codigo);
		System.out.println("Preco: " + preco);
		System.out.println("Processador: " + processador);
		System.out.println("Armazenamento: " + armazenamento);
		System.out.println("RAM : " + ram);
		f.o.println(f.linha);	 
	}
}
class Celulares extends Produto{
	String modelo;
	String marca;
	float tamanho;
	
	public Celulares(){
		kl.print("Digite o modelo: ");
		modelo = hj.next();
		kl.print("Digite a marca: ");
		marca = hj.next();
		kl.println("Digite o tamanho: ");
		tamanho = hj.nextFloat();
	}
	
	@Override 
	public void mostrarProduto(){
		f.o.println(f.linha);
		System.out.println("Nome: " + nome);
		 System.out.println("Codigo: " + codigo);
		 System.out.println("Preco: " + preco);
		 System.out.println("Modelo: " + modelo);
		 System.out.println("Marca : " + marca);
		 System.out.println("Tamanho: " + tamanho);
		 f.o.println(f.linha);
		 
	}
}
class Loja{
Produto b = new Computador();
	public Loja(Produto a){
	b=a;
	}
}

class Trabalho32{
	public static H f;
	public static  Scanner jh = new Scanner(System.in);	
	public static PrintStream lk = new  PrintStream(System.out);
	public static Produto b[] = new Produto[10];
	public static int aq=1;
	public static Computador h[]  = new Computador[aq];
	public static Celulares a /* = new Celulares(0)*/;
	public static boolean   aberto_pc  , aberto_celular=aberto_pc=false;
	
	public static void main(String args[]){
	
	int opc,acss,codigo;
	
	do{
		f.o.println(f.inf);
		System.out.println("***************** Loja de acessorios electronicos **********************\n1- Adicionar produtos\n2- Visualizar produtos\n3- Buscar produtos\n0- Sair");
		opc = jh.nextInt();
		switch(opc){
			case 1:
			int q=0;
			lk.println("Digite o tipo de acessorio\n1-Computadores\n2-Celulares");
			acss=jh.nextInt();
			if(acss==1){
				System.out.println("================= Computadores ==================");
				//Computador h = new Computador();
				for(int i=0;i<aq;i++){
				h[i]= new Computador();
				aq++;
				aq=q;
				if(aq==1)
				break;
				}
				
				aberto_pc=true;
				
			}else if(acss==2){
				System.out.println("================= Celulares ==================");
				//Celulares a = new Celulares();
				a = new Celulares();
                               aberto_celular=true;  
			}else{
				lk.println("Opcao invalida");
			}
			break;
			case 2:
			lk.println("Digite o tipo de acessorio\n1-Computadores\n2-Celulares");
			acss = jh.nextInt();
			if(acss == 1 && aberto_pc){
				System.out.println("================= Computadores ==================");
				for(int i =0;i<5;i++)
				h[i].mostrarProduto();
			}else if(acss==2 && aberto_celular){
				System.out.println("================= Celulares ==================");
				a.mostrarProduto();
			}else{
				lk.println("Opcao invalida");
			}
			
			break;
			case 3:
				int aw=-1;
				lk.println("Escolha o tipo de acessorio\n1-Computadores\n2-Celulares");
				acss = jh.nextInt();
				if(acss == 1 && aberto_pc){
					System.out.println("Digite o codigo");
					codigo = jh.nextInt();
					for(int i =0;i<5;i++){
					if(codigo == h[i].codigo){
						aw=i;
						break;
					}
					}
					if(aw!=-1){
						h[aw].mostrarProduto();
					}else{
						System.out.println("Nao temos esse produto");
					}
					
				}else if(acss == 2 && aberto_celular){
					System.out.println("Digite o codigo");
					codigo = jh.nextInt();
					if(codigo == a.codigo){
						a.mostrarProduto();
					}else{
						lk.println("Nao temos esse Produto");
					}
				}else{
					f.o.println("Opcao invalida");
				}
			break;
		}
	
	}while(opc!=0);
	
	//Loja g = new Loja(a);
	//f.o.println("Coisa louca");
	//g.mostrarProduto();
	}
}
class H{
	public static  Scanner d = new Scanner(System.in);	
	public static PrintStream o = new  PrintStream(System.out);
	public static String inf = "\t\tBem vindo a MaulassElectronic!!\n\tAqui voce encontra tudo que precisa na area da informatica";
	public static String linha = "____________________________________________________________";
}

