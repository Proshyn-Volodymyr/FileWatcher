package com.gmail.vladimirprocean;

import java.io.File;

public class FileWatcher implements Runnable {
    private File mainFolder;

    public FileWatcher() {
        super();
    }

    public FileWatcher(File mainFolder) {
        this.mainFolder = mainFolder;
    }

    public File getMainFolder() {
        return mainFolder;
    }

    private String getFolderInt() {
        if (this.mainFolder == null) {
            return "NONE";
        }
        StringBuilder sb = new StringBuilder();
        File[] files = mainFolder.listFiles();
        for (File file : files
        ) {
            sb.append(file.getName()).append("\t").append(file.length()).append(System.lineSeparator());
        }
        return sb.toString();
    }

    @Override
    public void run() {

    }
}
