/**
 * Box for cakes
 */
class CakeBox extends Box<Cake> {

    private Cake cake = super.get();

    public void put(Cake cake) {
        this.cake = cake;
    }

    public Cake get() {
        return this.cake;
    }
}

/**
 * Box for pies
 */
class PieBox extends Box<Pie> {

    private Pie pie = super.get();

    public void put(Pie pie) {
        this.pie = pie;
    }

    public Pie get() {
        return this.pie;
    }
}


/**
 * Box for tarts
 */
class TartBox extends Box<Tart> {

    private Tart tart = super.get();

    public void put(Tart tart) {
        this.tart = tart;
    }

    public Tart get() {
        return this.tart;
    }
}

/*
    Hundred more such boring classes OR ...
    magic class for everything everybody is waiting for
*/
class Box<T> {

    private T t;

    public void put(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }
}

// Don't change classes below
class Cake {
}

class Pie {
}

class Tart {
}