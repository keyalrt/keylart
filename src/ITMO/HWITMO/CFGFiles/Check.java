package ITMO.HWITMO.CFGFiles;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Check {
    private String path;

    Check(String path) {
        this.path = path;
    }

    Check() {
    }

    boolean accessCheck() throws IOException {
            File cfg = new File(this.path);
            List<String> lines = Files.readAllLines(cfg.toPath());
            return true;

        }
    }

