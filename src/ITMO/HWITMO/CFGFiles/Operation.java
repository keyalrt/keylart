package ITMO.HWITMO.CFGFiles;

import java.io.IOException;

public class Operation {

    private AccessToFiles method;

    Operation(AccessToFiles method) {
        this.method = method;
    }

    public static void main(String[] args) throws IOException {

        Operation outXmlToTxt = new Operation(new XMLFormat("C:\\Users\\ACER\\Documents\\Programming\\Java ITMO\\keylart\\src"));
        System.out.println("Check 1");
        outXmlToTxt.method.readInFile();
        outXmlToTxt.method.writeOutFile();
        System.out.println();

        Operation outTxtToTxt = new Operation(new TXTFormat("C:\\Users\\ACER\\Documents\\Programming\\Java ITMO\\keylart\\src"));
        System.out.println("Check 2");
        outTxtToTxt.method.readInFile();
        outTxtToTxt.method.writeOutFile();
        System.out.println();

        Operation outJsonToTxt = new Operation(new JSONFormat("C:\\Users\\ACER\\Documents\\Programming\\Java ITMO\\keylart\\src"));
        System.out.println("Check 3");
        outJsonToTxt.method.readInFile();
        outJsonToTxt.method.writeOutFile();
    }
}
