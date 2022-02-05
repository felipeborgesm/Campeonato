package com.letscode.utils;

import java.io.*;
import java.nio.file.Path;
import java.util.*;

public class Leitor {

    public static final String NOME_ARQUIVO = "santander811matchesResult.csv";
    public static final String NOME_ARQUIVO_NOVO = "fileIOStream.txt";
    static String dados = "";
    static Set<String> set = new HashSet<>();

    public static String[] leituraArquivoScanner() {
        try (Scanner scanner = new Scanner(Path.of(NOME_ARQUIVO))) {
            while (scanner.hasNext()) {
                dados = scanner.nextLine();
                set.add(dados);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(set.size());
        return set.toArray(new String[381]);
    }

    //METODO TESTE PARA SABER SE COMO ESCREVE UM ARQUIVO E SE NAO HA REPETIÇÕES
    public static void criaArquivo() {
        try (PrintWriter printWriter = new PrintWriter(NOME_ARQUIVO_NOVO)) {
            for (String partida: leituraArquivoScanner()) {
                printWriter.print(partida+"\n ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
