package oop.seter_gerte

class BabelFish {
    var name1  = false
        get() = field;

     var neverSignalLevel = 200

        get() = field+10;
        set(value:Int) {
            field = value + 100;
        }

}