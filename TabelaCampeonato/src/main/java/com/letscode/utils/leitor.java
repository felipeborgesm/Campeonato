package com.letscode.utils;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class leitor {

    public static final String NOME_ARQUIVO = "brasileirao2020.csv";
    static String dados = "";
    static ArrayList<String> split1 = new ArrayList<>();

    public static ArrayList<String> leituraArquivoScanner() {
        try (Scanner scanner = new Scanner(Path.of(NOME_ARQUIVO))) {
            while (scanner.hasNext()) {
                dados = scanner.nextLine();
                split1.add(Arrays.toString(dados.split(";")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return split1;
//        System.out.println(split1);
    }

}
