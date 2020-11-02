package cn.day05.File;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return (pathname.getName().toLowerCase().endsWith(".txt") || pathname.isDirectory());
    }
}
