public enum FileType {

    GIF(".gif"),
    JPG(".jpg"),
    CLAS(".class");

    FileType(String extension) {
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }

    private String extension;
}

