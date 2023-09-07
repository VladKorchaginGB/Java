public class TV {
    private int diagonal;
    private String matrix;
    private float price;
    private int[] size;

    public TV(){}
    public TV(int diagonal, String matrix, float price, int[] size){
        System.out.println("Object create");
        setValues(diagonal, matrix, price, size);
        System.out.println(getValues());
    }

    public TV(String matrix, float price){
        System.out.println("Object create");
        this.matrix = matrix;
        this.price = price;
        System.out.println(getValues());
    }


    public void setValues(int diagonal, String matrix, float price, int[] size){
        this.diagonal = diagonal;
        this.matrix = matrix;
        this.price = price;
        this.size = size;
    }
    public String getValues(){
        String info = "diagonal: " + this.diagonal + ", " + "matrix: " + this.matrix + ", " + "price: " + this.price + "\n";
        String infoSize = "Size: ";
        if (this.size != null){
            for (int i = 0; i < this.size.length; i++){
                infoSize += this.size[i] + ", ";
            }
        }else {
            infoSize += "Null";
        }
        infoSize += "\n";
        return info + infoSize;
    }
}
