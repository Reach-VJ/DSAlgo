package target150.after150;

public class FirstBadVersion278 extends VersionControl {

    public FirstBadVersion278(int version) {
        super(version);
    }

    public static void main(String [] args) {

//        2126753390
//        1702766719
        FirstBadVersion278 obj = new FirstBadVersion278(1702766719);
        int badVersion = obj.firstBadVersion(2126753390);
        System.out.println("Bad Version : "+badVersion);
    }

    public int firstBadVersion(int n) {

        for(int i = 1; i < n; i++) {
            if(i<=Integer.MAX_VALUE)
                return getVersion();
            if(isBadVersion(i)) {
                return i;
            }
        }
        return n;
    }

}

class VersionControl {
    private int version;

    public VersionControl(int version) {
        this.version = version;
    }

    boolean isBadVersion(int version) {
        if(this.version <= version)
            return true;
        return false;
    }

    public int getVersion() {
        return this.version;
    }
}
