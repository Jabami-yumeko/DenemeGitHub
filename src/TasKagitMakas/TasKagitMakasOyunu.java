package TasKagitMakas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TasKagitMakasOyunu {
public static void main(String[] args) {
	
	
	
	// tas   > makas tas=0 makas=1 kagit=2
	// makas > kagit
	// kagit > tas
	
	int numberOfMyWin=0;
	int numberOfMyPcWin=0;
	int gameOver=3;
	
//	List<String> elemanlar= new ArrayList<>();
//	elemanlar.add("Tas");
//	elemanlar.add("Makas");
//	elemanlar.add("Kagit");
//	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Tas Kagit Makas oyununa hos geldiniz :) ");
	System.out.println("____________________________________________");
	System.out.println();
	
	while (numberOfMyWin<gameOver && numberOfMyPcWin<gameOver) {
		System.out.println("Tas secmek icin= 0\nMakas secmek icin= 1 \nKagit secmek icin= 2 \nSeciniz");
		int tahmin=scan.nextInt();
		int pcTahmin=new Random().nextInt(3);
		System.out.println("---Benim tahminim "+tahmin + "\n" +"---Bilgisayarin tahmini "+ pcTahmin);
		
		if (tahmin==pcTahmin) {
			System.out.println("----Berabere");
		}else if ((tahmin==0 && pcTahmin==1) || (tahmin==1 && pcTahmin==2) || (tahmin==2 && pcTahmin==0)) {
			System.out.println("----Kazandiniz");
			numberOfMyWin++;
		}else {
			System.out.println("----Kaybettiniz");
			numberOfMyPcWin++;
		}
	}
	if (numberOfMyWin==3) {
		
	
	System.out.println("GAME OVER !");
	System.out.println("Sizin kazandiginiz " + numberOfMyWin);
	System.out.println("Kaybettiniz : "+numberOfMyPcWin);
	}else if (numberOfMyPcWin==3)
		System.out.println("GAME OVER !");
	System.out.println("Bilgisayarin kazandigi round " + numberOfMyPcWin);
	System.out.println("Kaybettiniz : "+numberOfMyWin);
	scan.close();
}
}
