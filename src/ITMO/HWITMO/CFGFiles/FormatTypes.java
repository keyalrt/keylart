package ITMO.HWITMO.CFGFiles;

import java.io.IOException;

class XMLFormat extends Check implements AccessToFiles {

    private String path;
    private boolean supress;

    // @Override
    public void readInFile() {
        if (!supress)
            System.out.println("Reading XML file");
    }

    public void writeOutFile() {
        if (!supress)
            System.out.println("Writing XML file");
    }

    XMLFormat(String path) throws IOException {
        this.path = path;
        Check code = new Check(this.path);
        if (code.accessCheck()) {
            System.out.println("Operation done ok");
            supress = false;
        }
        else {
            System.out.println("Mistake occurred");
            supress = true;
        }

    }
}

class JSONFormat implements AccessToFiles {

    private String path;
    private boolean supress;

    @Override
    public void readInFile() {
        System.out.println("Reading JSON file");
    }

    public void writeOutFile() {
        System.out.println("Writing JSON file");
    }

    JSONFormat(String path) throws IOException {
        this.path = path;
        Check code = new Check(this.path);
        if (code.accessCheck()) {
            System.out.println("Operation done ok");
            supress = false;
        }
        else {
            System.out.println("Mistake occurred");
            supress = true;
        }
    }
}

class TXTFormat implements AccessToFiles {

    private String path;
    private boolean supress;

    @Override
    public void readInFile() {
        System.out.println("Reading TXT file");
    }

    public void writeOutFile() {
        System.out.println("Writing TXT file");
    }

    TXTFormat(String path) throws IOException {
        this.path = path;
        Check code = new Check(this.path);
        if (code.accessCheck()) {
            System.out.println("Operation done ok");
            supress = false;
        }
        else {
            System.out.println("Mistake occurred");
            supress = true;
        }
    }
}

