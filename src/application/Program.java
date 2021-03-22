package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entity.LogEntry;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){ // FileReader Abre o arquivo especificado no caminho e disponibiliza ela no BufferReader
			
			Set<LogEntry> set = new HashSet<>(); // A escolha do HashSet foi por ele ser mais r�pido e tamb�m pelo facto do problema n�o especificar a ordem de armazenamento
			
			String line = br.readLine(); // A primeira linha do aqruivo foi lida
			
			while(line != null) {
				
				String[] fields = line.split(" "); // Para cada linha lida no arquivo, divid o conte�do desta linha baseado no espa�o em branco e depois cria um array. 
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				
				set.add(new LogEntry(username, moment)); // Ele n�o aceita valores repetidos, ou seja, username repetidos (username � o campo definido como crit�rio de compara��o no HashCode Equals)
				
				line = br.readLine();
			}
			
			System.out.println("Total users: " + set.size());
			
		} catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
		sc.close();
	}
}
