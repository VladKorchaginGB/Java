public class TV {
    private int diagonal;
    private String matrix;
    private float price;
    private int[] size;


    public TV(int diagonal, String matrix, float price, int[] size){
        System.out.println("\nObject create");
        setValues(diagonal, matrix, price, size);
    }

    public TV(String matrix, float price){
        System.out.println("\nObject create");
        this.matrix = matrix;
        this.price = price;
    }


    protected void setValues(int diagonal, String matrix, float price, int[] size){
        this.diagonal = diagonal;
        this.matrix = matrix;
        this.price = price;
        this.size = size;
    }
    protected String getValues(){
        String info = "diagonal: " + this.diagonal + ", " + "matrix: " + this.matrix + ", " + "price: " + this.price + "\n";
        String infoSize = "Size: ";
        if (this.size != null){
            for (int i = 0; i < this.size.length; i++){
                infoSize += this.size[i] + ", ";
            }
        }else {
            infoSize += "Null";
        }

        return info + infoSize;
    }


}
