package example.chapter2;

interface Breathable {
    Breathable of(String name);
}

class Cat implements Breathable{

    @Override
    public Breathable of(String name) {
        return new Cat();
    }
}
