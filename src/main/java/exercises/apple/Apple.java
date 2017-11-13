package exercises.apple;

public class Apple {
    Apple getPeeled(){
        return Peeler.peel(this);
    }
}
