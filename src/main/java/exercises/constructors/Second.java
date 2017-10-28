package exercises.constructors;


class Second {
    private String smbName;

    void setSmbName(String Kaly) {
        this.smbName = Kaly;
    }

    private String getSmbName() {
        return smbName;
    }

    Second(String smbName) {
        this.smbName = smbName;
    }

    void saySmth() {
        System.out.println("hey " + getSmbName());
    }
}
