public class TV {
    public int diagonal;
    public String matrix;
    public float price;
    public int[] size;


    public void info(int _diagonal, String _matrix, float _price, int[] _size){
        diagonal = _diagonal;
        matrix = _matrix;
        price = _price;
        size = _size;
    }
    public String infoString(){
        String info = "diagonal: " + diagonal + ", " + "matrix: " + matrix + ", " + "price: " + price + "\n";
        String infoSize = "Size: ";
        for (int i = 0; i < size.length; i++){
            infoSize += size[i] + ", ";
        }
        infoSize += "\n";
        return info + infoSize;
    }
}
