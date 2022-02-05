package com.letscode.utils;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import static com.letscode.utils.Leitor.leituraArquivoScanner;

public class CriaArquivos {

    public static void criaTimes() {
        //TENTEI FAZER COM COLOCASSE A PRIMEIRA LINHA NUM ARQUIVO MAS SÓ TA APARECENDO O HASHCODE
        Time time = null;
//        for (Iterator<String> it = Arrays.stream(leituraArquivoScanner()).iterator(); it.hasNext(); ) {
//            String partida = it.next();
//            time = new Time(partida, partida, partida, partida, partida);
//        }
        String[] partida = leituraArquivoScanner();
        for (int i = 0; i < partida.length; i++) {
            for (int j = 0; j < 5; j ++) {
                time = new Time(partida[j], partida[j+1], partida[j+2], partida[j+3], partida[j+4]);
            }
        }
                try (PrintWriter printWriter = new PrintWriter("teste.txt")) {
                        printWriter.print(time+"\n ");
                    } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
    }
}
