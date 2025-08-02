package fileDemoEncapsulation;

public class FileDemo {
    private boolean isReadOnly;
    private boolean isWriteOnly;

    public boolean isReadOnly() {
        return isReadOnly;
    }

    public boolean setReadOnly(boolean readOnly) {
        isReadOnly = readOnly;
        System.out.println(" rachna mathur");
        return readOnly;
    }

    public boolean isWriteOnly() {
        return isWriteOnly;
    }

    public boolean setWriteOnly(boolean writeOnly) {
        isWriteOnly = writeOnly;
        return writeOnly;
    }
}
