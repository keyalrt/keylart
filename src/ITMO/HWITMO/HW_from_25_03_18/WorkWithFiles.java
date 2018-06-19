package ITMO.HWITMO.HW_from_25_03_18;

import java.io.File;
import java.io.IOException;

public class WorkWithFiles {

    public static void main(String[] args) throws IOException, Exception {

        //*1) Скопировать файл
     FileSteamWork.copyText("src/copytext.txt", "src/CopyOfCopyText.txt");//откуда / куда

        //*2) Разбить/склеить файл.
//        BreakJoin.breakFiles("src/trytext.txt", "src/trytext2.txt", 95);
//        BreakJoin.glueFile("src/trytext2.txt");

//       //*3.1. Зашифровать/ дешифровать файл паролем (XOR)
//        Encryption.startEncodeDecode(new File("src/encripting.txt"), new File("src/encriptingDone.txt"),"1234");
//        Encryption.startEncodeDecode(new File("src/encriptingDone.txt"), new File("src/encriptingBack.txt"),"1234");

        //3.2. Зашифровать/ дешифровать файл другим файлом

//       шифрование

//        TextCrypt.startCodeText(new File("src/3.2.file.txt"),
//        new File("src/encripting.txt"),
//        new File("src/cryptedByFile.txt"));

//       дешифровка

//        TextCrypt.startDecodeText(new File("src/cryptedByFile.txt"),
//        new File("src/encripting.txt"),
//        new File("src/backToFile.txt"));


    }

}
